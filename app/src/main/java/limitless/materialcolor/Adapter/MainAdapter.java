package limitless.materialcolor.Adapter;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import limitless.materialcolor.Interface.InterfaceSelectColor;
import limitless.materialcolor.Model.Color;
import limitless.materialcolor.Other.Utils;
import limitless.materialcolor.R;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainViewHolder> {

    private Context context;
    private List<Color> colorList;
    private InterfaceSelectColor selectColor;

    public MainAdapter(Context context, List<Color> colorList, InterfaceSelectColor selectColor) {
        this.context = context;
        this.colorList = colorList;
        this.selectColor = selectColor;

    }


    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new MainViewHolder(
                LayoutInflater.from(context).inflate(
                        R.layout.item_main, viewGroup, false
                )
        );
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder mainViewHolder, int i) {
        mainViewHolder.bindView(colorList.get(i));
    }

    @Override
    public int getItemCount() {
        try {
            return colorList.size();
        }catch (Exception e){
            Utils.error(e);
            return 0;
        }
    }

    public void setData(List<Color> list){
        if (list == null)
            list = new ArrayList<>();
        colorList = list;
        notifyDataSetChanged();
    }

    class MainViewHolder extends RecyclerView.ViewHolder{
        private AppCompatTextView tvName;
        private AppCompatImageView ivColor;
        MainViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    selectColor.selectColor(getAdapterPosition());
                }
            });
            ivColor = itemView.findViewById(R.id.imageView_color_recyclerColorName);
            tvName = itemView.findViewById(R.id.textView_colorName_recyclerColorName);
        }

        void bindView(Color c){
            tvName.setText(c.getName());
//            ivColor.setBackgroundDrawable(Tools.roundDrawable(c.getCode()));
            ivColor.setBackgroundDrawable(new ColorDrawable(Utils.parseColor(c.getCode())));
        }

    }

}
