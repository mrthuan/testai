package pdf.pdfreader.viewer.editor.free.feature.scan.dialog;

import am.a0;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.widget.NestedScrollView;
import pdf.pdfreader.viewer.editor.free.R;
import qb.j0;

/* compiled from: AllFilesAccessPermissionDialog.kt */
/* loaded from: classes3.dex */
public final class c extends oo.l<a0> {
    public static final /* synthetic */ int C = 0;
    public final cg.l<Boolean, tf.d> A;
    public boolean B;

    /* renamed from: z  reason: collision with root package name */
    public final int f25683z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(Context context, int i10, cg.l<? super Boolean, tf.d> lVar) {
        super(context);
        kotlin.jvm.internal.g.e(context, ea.a.p("LG9fdBx4dA==", "ynce1WnC"));
        this.f25683z = i10;
        this.A = lVar;
    }

    @Override // oo.g
    public final boolean A() {
        return false;
    }

    @Override // oo.g
    public final boolean B() {
        return false;
    }

    @Override // oo.l
    public final a0 H(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.dialog_all_file_permission, viewGroup, false);
        int i10 = R.id.iv_app_widget;
        if (((AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.iv_app_widget)) != null) {
            i10 = R.id.iv_close;
            AppCompatImageView appCompatImageView = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.iv_close);
            if (appCompatImageView != null) {
                i10 = R.id.tv_desc;
                TextView textView = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_desc);
                if (textView != null) {
                    i10 = R.id.tv_ok;
                    TextView textView2 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_ok);
                    if (textView2 != null) {
                        i10 = R.id.tv_title;
                        if (((TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_title)) != null) {
                            a0 a0Var = new a0((NestedScrollView) inflate, appCompatImageView, textView, textView2);
                            ea.a.p("Jm5XbBh0UigzbixsFHQNchkgDW8rdARpJ2UKLHpmOWw8ZSk=", "wz4eIxZX");
                            return a0Var;
                        }
                    }
                }
            }
        }
        throw new NullPointerException(ea.a.p("AmlCcxBuUCAoZTt1HHINZBV2B2UyIBJpEWhUSTM6IA==", "Tdt6etwe").concat(inflate.getResources().getResourceName(i10)));
    }

    @Override // oo.g
    public final void z() {
        if (this.f25683z == 1) {
            VB vb2 = this.f23550y;
            kotlin.jvm.internal.g.b(vb2);
            ((a0) vb2).c.setText(R.string.arg_res_0x7f130570);
        } else {
            VB vb3 = this.f23550y;
            kotlin.jvm.internal.g.b(vb3);
            ((a0) vb3).c.setText(R.string.arg_res_0x7f130046);
        }
        VB vb4 = this.f23550y;
        kotlin.jvm.internal.g.b(vb4);
        ((a0) vb4).f698d.setOnClickListener(new d9.f(this, 10));
        VB vb5 = this.f23550y;
        kotlin.jvm.internal.g.b(vb5);
        ((a0) vb5).f697b.setOnClickListener(new j0(this, 11));
        setOnShowListener(new a());
        setOnCancelListener(new b(this, 0));
    }
}
