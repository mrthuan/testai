package k9;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: PasswordToggleEndIconDelegate.java */
/* loaded from: classes2.dex */
public final class t extends o {

    /* renamed from: e  reason: collision with root package name */
    public final int f19715e;

    /* renamed from: f  reason: collision with root package name */
    public EditText f19716f;

    /* renamed from: g  reason: collision with root package name */
    public final f5.d f19717g;

    public t(com.google.android.material.textfield.a aVar, int i10) {
        super(aVar);
        this.f19715e = R.drawable.design_password_eye;
        this.f19717g = new f5.d(this, 1);
        if (i10 != 0) {
            this.f19715e = i10;
        }
    }

    @Override // k9.o
    public final void b() {
        q();
    }

    @Override // k9.o
    public final int c() {
        return R.string.arg_res_0x7f1302fa;
    }

    @Override // k9.o
    public final int d() {
        return this.f19715e;
    }

    @Override // k9.o
    public final View.OnClickListener f() {
        return this.f19717g;
    }

    @Override // k9.o
    public final boolean k() {
        return true;
    }

    @Override // k9.o
    public final boolean l() {
        boolean z10;
        EditText editText = this.f19716f;
        if (editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod)) {
            z10 = true;
        } else {
            z10 = false;
        }
        return !z10;
    }

    @Override // k9.o
    public final void m(EditText editText) {
        this.f19716f = editText;
        q();
    }

    @Override // k9.o
    public final void r() {
        boolean z10;
        EditText editText = this.f19716f;
        if (editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f19716f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // k9.o
    public final void s() {
        EditText editText = this.f19716f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
