package pdf.pdfreader.viewer.editor.free.feature.scan.dialog;

import am.j0;
import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.widget.NestedScrollView;
import lib.zj.pdfeditor.o0;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: StoragePermissionDialog.kt */
/* loaded from: classes3.dex */
public final class r extends oo.l<j0> {
    public static final /* synthetic */ int F = 0;
    public final String A;
    public final String B;
    public final cg.l<Boolean, tf.d> C;
    public boolean D;
    public Integer E;

    /* renamed from: z  reason: collision with root package name */
    public final int f25708z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public r(Context context, int i10, String str, String str2, cg.l<? super Boolean, tf.d> lVar) {
        super(context);
        kotlin.jvm.internal.g.e(context, ea.a.p("Bm8GdB94dA==", "2jehzqXA"));
        this.f25708z = i10;
        this.A = str;
        this.B = str2;
        this.C = lVar;
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
    public final j0 H(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.dialog_storage_permission, viewGroup, false);
        int i10 = R.id.iv_app_widget;
        if (((AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.iv_app_widget)) != null) {
            i10 = R.id.iv_close;
            AppCompatImageView appCompatImageView = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.iv_close);
            if (appCompatImageView != null) {
                i10 = R.id.tv_desc;
                TextView textView = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_desc);
                if (textView != null) {
                    i10 = R.id.tv_desc_tips;
                    TextView textView2 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_desc_tips);
                    if (textView2 != null) {
                        i10 = R.id.tv_ok;
                        TextView textView3 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_ok);
                        if (textView3 != null) {
                            i10 = R.id.tv_title;
                            if (((TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_title)) != null) {
                                j0 j0Var = new j0((NestedScrollView) inflate, appCompatImageView, textView, textView2, textView3);
                                ea.a.p("Jm5XbBh0UigzbixsFHQNchkgDW8rdARpGmUWLEpmJWw8ZSk=", "XLrDtdjD");
                                return j0Var;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException(ea.a.p("fmk4cxpuBSAAZUV1AHIzZGR2W2UxIDRpDWhKSX06IA==", "yj9DRcpS").concat(inflate.getResources().getResourceName(i10)));
    }

    @Override // oo.g
    public final void z() {
        int i10;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        if (this.f25708z == 0) {
            VB vb2 = this.f23550y;
            kotlin.jvm.internal.g.b(vb2);
            ((j0) vb2).f1001d.setVisibility(8);
            VB vb3 = this.f23550y;
            kotlin.jvm.internal.g.b(vb3);
            ((j0) vb3).f1002e.setText(R.string.arg_res_0x7f130373);
        } else {
            VB vb4 = this.f23550y;
            kotlin.jvm.internal.g.b(vb4);
            ((j0) vb4).f1001d.setVisibility(0);
            VB vb5 = this.f23550y;
            kotlin.jvm.internal.g.b(vb5);
            ((j0) vb5).f1001d.setText(getContext().getString(R.string.arg_res_0x7f130349, getContext().getString(R.string.arg_res_0x7f130179)));
            VB vb6 = this.f23550y;
            kotlin.jvm.internal.g.b(vb6);
            ((j0) vb6).f1002e.setText(R.string.arg_res_0x7f130179);
        }
        Integer num = this.E;
        if (num != null) {
            i10 = num.intValue();
        } else {
            i10 = Build.VERSION.SDK_INT;
        }
        String str = this.B;
        String str2 = this.A;
        if (i10 >= 33) {
            if (str2 != null && !kotlin.text.j.H(str2)) {
                z12 = false;
            } else {
                z12 = true;
            }
            if (z12) {
                VB vb7 = this.f23550y;
                kotlin.jvm.internal.g.b(vb7);
                ((j0) vb7).c.setText(getContext().getString(R.string.arg_res_0x7f1300cf));
            } else {
                VB vb8 = this.f23550y;
                kotlin.jvm.internal.g.b(vb8);
                ((j0) vb8).c.setText(str2);
            }
            if (str != null && !kotlin.text.j.H(str)) {
                z13 = false;
            } else {
                z13 = true;
            }
            if (z13) {
                VB vb9 = this.f23550y;
                kotlin.jvm.internal.g.b(vb9);
                ((j0) vb9).f1001d.setText(getContext().getString(R.string.arg_res_0x7f130349, getContext().getString(R.string.arg_res_0x7f130179)));
            } else {
                VB vb10 = this.f23550y;
                kotlin.jvm.internal.g.b(vb10);
                ((j0) vb10).f1001d.setText(str);
            }
        } else {
            if (str2 != null && !kotlin.text.j.H(str2)) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                VB vb11 = this.f23550y;
                kotlin.jvm.internal.g.b(vb11);
                ((j0) vb11).c.setText(getContext().getString(R.string.arg_res_0x7f1304d3));
            } else {
                VB vb12 = this.f23550y;
                kotlin.jvm.internal.g.b(vb12);
                ((j0) vb12).c.setText(str2);
            }
            if (str != null && !kotlin.text.j.H(str)) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z11) {
                VB vb13 = this.f23550y;
                kotlin.jvm.internal.g.b(vb13);
                ((j0) vb13).f1001d.setText(getContext().getString(R.string.arg_res_0x7f1303c8, getContext().getString(R.string.arg_res_0x7f130179)));
            } else {
                VB vb14 = this.f23550y;
                kotlin.jvm.internal.g.b(vb14);
                ((j0) vb14).f1001d.setText(str);
            }
        }
        VB vb15 = this.f23550y;
        kotlin.jvm.internal.g.b(vb15);
        ((j0) vb15).f1002e.setOnClickListener(new f5.e(this, 13));
        VB vb16 = this.f23550y;
        kotlin.jvm.internal.g.b(vb16);
        ((j0) vb16).f1000b.setOnClickListener(new k9.c(this, 16));
        setOnCancelListener(new o0(this, 1));
    }
}
