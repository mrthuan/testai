package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.text.Editable;
import android.text.TextUtils;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.ImageView;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: OperateInputPwdDialog.java */
/* loaded from: classes3.dex */
public final class d0 implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ImageView f27525a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f0 f27526b;

    public d0(f0 f0Var, ImageView imageView) {
        this.f27526b = f0Var;
        this.f27525a = imageView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        f0 f0Var = this.f27526b;
        boolean z10 = !f0Var.H;
        f0Var.H = z10;
        ImageView imageView = this.f27525a;
        if (z10) {
            imageView.setImageResource(R.drawable.ic_input_eye);
            f0Var.f27550n.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
        } else {
            f0Var.f27550n.setTransformationMethod(PasswordTransformationMethod.getInstance());
            imageView.setImageResource(R.drawable.ic_input_eye_off);
        }
        Editable text = f0Var.f27550n.getText();
        if (text != null) {
            String obj = text.toString();
            if (!TextUtils.isEmpty(obj) && obj.length() > 0) {
                f0Var.f27550n.setSelection(obj.length());
            }
        }
    }
}
