package limitless.materialcolor.Adapter;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import limitless.materialcolor.Model.Color;
import limitless.materialcolor.Other.SQLiteFavorite;
import limitless.materialcolor.Other.Utils;
import limitless.materialcolor.R;

public class ColorAdapter extends RecyclerView.Adapter<ColorAdapter.ColorViewHolder> {

    private Context context;
    private List<Color> colorList;
    private SQLiteFavorite sqLiteFavorite;
    private boolean isFavorite;

    public ColorAdapter(Context context, List<Color> colorList) {
        this.context = context;
        this.colorList = colorList;
        this.isFavorite = false;
        this.sqLiteFavorite = new SQLiteFavorite(context);
    }

    public ColorAdapter(Context context, List<Color> colorList, boolean isFavorite) {
        this.context = context;
        this.colorList = colorList;
        this.isFavorite = isFavorite;
        this.sqLiteFavorite = new SQLiteFavorite(context);
    }

    @NonNull
    @Override
    public ColorViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ColorViewHolder(LayoutInflater.from(context).inflate(R.layout.item_color, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ColorViewHolder colorViewHolder, int i) {
        colorViewHolder.bindView(colorList.get(i));
        Utils.setScaleAnimation(colorViewHolder.itemView);
    }

    @Override
    public int getItemCount() {
        if (colorList == null)
            return 0;
        return colorList.size();
    }

    public void setData(List<Color> colorList) {
        if (colorList == null)
            return;
        this.colorList = colorList;
        notifyDataSetChanged();
    }

    public void putItem(String code) {
        if (code == null)
            return;
        if (colorList == null)
            colorList = new ArrayList<>();
        colorList.add(0, new Color(null, code));
        notifyItemInserted(0);
    }

    class ColorViewHolder  extends RecyclerView.ViewHolder implements View.OnClickListener {
        private View vColor;
        private AppCompatTextView tvName, tvCode;
        private AppCompatImageButton btnFavorite;
        ColorViewHolder(@NonNull View itemView) {
            super(itemView);
            btnFavorite = itemView.findViewById(R.id.imageButton_favorite);
            vColor = itemView.findViewById(R.id.view_color_recyclerColor);
            tvName = itemView.findViewById(R.id.textView_name_recyclerColor);
            tvCode = itemView.findViewById(R.id.textView_code_recyclerColor);

            btnFavorite.setOnClickListener(this);
            itemView.setOnClickListener(this);
        }

        void bindView(Color color){
            try {
                vColor.setBackgroundColor(android.graphics.Color.parseColor(color.getCode()));
            } catch (Exception e) {
                Utils.error(e);
            }
            if (color.getName() != null)
                tvName.setText(color.getName());
            else
                tvName.setVisibility(View.GONE);
            tvCode.setText(color.getCode().toUpperCase());
            if (sqLiteFavorite.existColor(color.getCode())){
                btnFavorite.setImageResource(R.drawable.ic_favorite_black_24dp);
            }else {
                btnFavorite.setImageResource(R.drawable.ic_favorite_border_black_24dp);
            }
        }

        @Override
        public void onClick(View v) {
            String code = colorList.get(getAdapterPosition()).getCode();
            if (v.getId() == R.id.imageButton_favorite){
                if (sqLiteFavorite.existColor(code)){
                    sqLiteFavorite.deleteColor(code);
                    btnFavorite.setImageResource(R.drawable.ic_favorite_border_black_24dp);
                    Utils.toast(context, context.getString(R.string.delete_from_favorite));
                    if (isFavorite)
                        deleteItem(getAdapterPosition());
                    Utils.sendDeleteFavBroadCast(context, code);
                }else {
                    sqLiteFavorite.putColor(code);
                    btnFavorite.setImageResource(R.drawable.ic_favorite_black_24dp);
                    Utils.toast(context, context.getString(R.string.add_to_favorite));
                    Utils.sendAddFavBroadCast(context, code);
                }
            }else if (v.getId() == R.id.cardView_color){
                Utils.copyToClipboard(context, code);
                Utils.toast(context, code.toUpperCase() + " Copied");
            }
        }
    }

    public void deleteItem(int position) {
        colorList.remove(position);
        notifyItemRemoved(position);
    }

    public void deleteItem(String code) {
        if (code == null || colorList == null || colorList.size() <= 0)
            return;
        int position = -1;
        for (int i = 0; i < colorList.size(); i++) {
            if (colorList.get(i).getCode().toLowerCase().equals(code.toLowerCase())){
                position = i;
                break;
            }
        }
        if (position < 0)
            return;
        deleteItem(position);
    }

}
