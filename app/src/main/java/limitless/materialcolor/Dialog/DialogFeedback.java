package limitless.materialcolor.Dialog;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.appcompat.widget.AppCompatEditText;

import android.view.View;
import android.view.WindowManager;

import limitless.materialcolor.Other.SharePref;
import limitless.materialcolor.Other.Utils;
import limitless.materialcolor.R;

public class DialogFeedback extends DialogFragment implements View.OnClickListener {

    private AppCompatEditText etFeedback;
    private SharePref sharePref;

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        Dialog dialog = super.onCreateDialog(savedInstanceState);
        View view  = View.inflate(getContext(), R.layout.dialog_feedback, null);
        dialog.setContentView(view);
        init(view);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.getWindow().getAttributes().width = WindowManager.LayoutParams.MATCH_PARENT;
        return dialog;
    }

    private void init(View view) {
        sharePref = new SharePref(getContext());
        view.findViewById(R.id.imageButton_close_dialogFeedback).setOnClickListener(this);
        view.findViewById(R.id.button_send_dialogFeedback).setOnClickListener(this);
        etFeedback = view.findViewById(R.id.editText_feedback_dialogFeedback);
        etFeedback.setText(sharePref.get(SharePref.FeedbackKey, null));
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.imageButton_close_dialogFeedback){
            closeDialog();
        }else if (v.getId() == R.id.button_send_dialogFeedback){
            sendFeedBack();
        }
    }

    private void sendFeedBack() {
        if (! etFeedback.getText().toString().isEmpty()){
            Utils.openEmail(getContext(), getString(R.string.email), "From Material Color App", etFeedback.getText().toString());
        }else {
            etFeedback.setError("Is Empty!");
        }
    }

    private void closeDialog() {
        dismiss();
    }

    @Override
    public void onDismiss(DialogInterface dialog) {
        sharePref.put(SharePref.FeedbackKey, etFeedback.getText().toString());
        super.onDismiss(dialog);
    }
}
