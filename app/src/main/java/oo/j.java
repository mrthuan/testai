package oo;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: BaseDialog.java */
/* loaded from: classes3.dex */
public abstract class j extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    public View f23547a;

    /* renamed from: b  reason: collision with root package name */
    public Context f23548b;

    public j(Context context) {
        super(context, 2132017464);
        this.f23548b = context;
    }

    public abstract void a(View view);

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        try {
            super.dismiss();
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View inflate = LayoutInflater.from(this.f23548b).inflate(R.layout.dialog_permission_required, (ViewGroup) null);
        this.f23547a = inflate;
        setContentView(inflate, new ViewGroup.LayoutParams(-1, -1));
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        a(this.f23547a);
    }

    @Override // android.app.Dialog
    public void show() {
        try {
            super.show();
        } catch (Exception unused) {
        }
    }
}
