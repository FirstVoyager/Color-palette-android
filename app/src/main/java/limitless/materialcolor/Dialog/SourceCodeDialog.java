package limitless.materialcolor.Dialog;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import limitless.materialcolor.Other.Utils;
import limitless.materialcolor.R;

public class SourceCodeDialog extends DialogFragment implements View.OnClickListener {

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        Dialog dialog = super.onCreateDialog(savedInstanceState);
        View view = View.inflate(getContext(), R.layout.dialog_source_code, null);
        dialog.setContentView(view);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        init(view);
        return dialog;
    }

    private void init(View view) {
        view.findViewById(R.id.textView_sourceCode).setOnClickListener(this);
        view.findViewById(R.id.imageButton_close).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.imageButton_close){
            dismiss();
        }else if (v.getId() == R.id.textView_sourceCode){
            Utils.openUrl(getContext(), getString(R.string.url_source_code));
            dismiss();
        }
    }
}
