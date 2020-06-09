package limitless.materialcolor.Adapter;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.google.android.material.textview.MaterialTextView;

import java.util.ArrayList;
import java.util.List;

import limitless.materialcolor.Model.Gradient;
import limitless.materialcolor.Other.Utils;
import limitless.materialcolor.R;

public class GradientAdapter extends RecyclerView.Adapter<GradientAdapter.GradientViewHolder> {

    private Context context;
    private List<Gradient> gradientList;

    public GradientAdapter(Context context, List<Gradient> gradientList) {
        this.context = context;
        this.gradientList = gradientList;
    }

    @NonNull
    @Override
    public GradientViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new GradientViewHolder(
                LayoutInflater.from(context).inflate(
                        R.layout.item_gradient, viewGroup, false
                )
        );
    }

    @Override
    public void onBindViewHolder(@NonNull GradientViewHolder gradientViewHolder, int i) {
        gradientViewHolder.bindView(gradientList.get(i));
        Utils.setScaleAnimation(gradientViewHolder.itemView);
    }

    @Override
    public int getItemCount() {
        try {
            return gradientList.size();
        }catch (Exception e){
            Utils.error(e);
            return 0;
        }
    }

    public void setData(List<Gradient> gradientList){
        if (gradientList == null)
            gradientList = new ArrayList<>();
        this.gradientList = gradientList;
        notifyDataSetChanged();
    }

    class GradientViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private MaterialTextView tvSC, tvEC, tvName;
        private ImageView vColor;
        GradientViewHolder(@NonNull View itemView) {
            super(itemView);
            tvSC = itemView.findViewById(R.id.textView_startColor);
            tvSC.setOnClickListener(this);
            tvEC = itemView.findViewById(R.id.textView_endColor);
            tvEC.setOnClickListener(this);
            tvName = itemView.findViewById(R.id.textView_colorName);
            vColor = itemView.findViewById(R.id.view_color);
        }

        void bindView(Gradient mg){
            tvSC.setText(mg.getsCode().toUpperCase());
            tvEC.setText(mg.geteCode().toUpperCase());
            tvName.setText(mg.getName());
            vColor.setImageDrawable(Utils.getGradientDrawble(mg.getsCode(), mg.geteCode()));
        }

        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.textView_startColor:
                    Utils.copyToClipboard(context, gradientList.get(getAdapterPosition()).getsCode());
                    Utils.customToast(context, gradientList.get(getAdapterPosition()).getsCode() + " Copied");
                    break;
                case R.id.textView_endColor:
                    Utils.copyToClipboard(context, gradientList.get(getAdapterPosition()).geteCode());
                    Utils.customToast(context, gradientList.get(getAdapterPosition()).geteCode() + " Copied");
                    break;
            }
        }
    }

}
