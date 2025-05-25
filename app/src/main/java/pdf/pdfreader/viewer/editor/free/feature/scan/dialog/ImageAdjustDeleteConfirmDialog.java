package pdf.pdfreader.viewer.editor.free.feature.scan.dialog;

import am.b0;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: ImageAdjustDeleteConfirmDialog.kt */
/* loaded from: classes3.dex */
public final class ImageAdjustDeleteConfirmDialog extends oo.l<b0> {

    /* renamed from: z  reason: collision with root package name */
    public boolean f25679z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageAdjustDeleteConfirmDialog(Context context) {
        super(context);
        kotlin.jvm.internal.g.e(context, ea.a.p("UG8ldBZ4dA==", "qggXajNU"));
    }

    @Override // oo.g
    public final boolean A() {
        return true;
    }

    @Override // oo.g
    public final boolean B() {
        return true;
    }

    @Override // oo.l
    public final b0 H(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.dialog_image_adjust_delete_confirm, viewGroup, false);
        int i10 = R.id.cancel_tv;
        TextView textView = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.cancel_tv);
        if (textView != null) {
            i10 = R.id.dec_tv;
            if (((TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.dec_tv)) != null) {
                i10 = R.id.delete_tv;
                TextView textView2 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.delete_tv);
                if (textView2 != null) {
                    i10 = R.id.iv_icon;
                    if (((ImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.iv_icon)) != null) {
                        i10 = R.id.title;
                        if (((TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.title)) != null) {
                            b0 b0Var = new b0(textView, textView2, (ConstraintLayout) inflate);
                            ea.a.p("Jm5XbBh0UigzbixsFHQNchkgDW8rdARpHWVELE1mB2w8ZSk=", "rzN6s6mf");
                            return b0Var;
                        }
                    }
                }
            }
        }
        throw new NullPointerException(ea.a.p("AmlCcxBuUCAoZTt1HHINZBV2B2UyIBJpPmhpSSc6IA==", "G3lxJIcU").concat(inflate.getResources().getResourceName(i10)));
    }

    @Override // oo.g
    public final void z() {
        VB vb2 = this.f23550y;
        kotlin.jvm.internal.g.b(vb2);
        String p10 = ea.a.p("LWlfZBBuUC4-ZSZlAWU8dg==", "f8IdwsC6");
        TextView textView = ((b0) vb2).c;
        kotlin.jvm.internal.g.d(textView, p10);
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(textView, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.dialog.ImageAdjustDeleteConfirmDialog$initView$1
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(View view) {
                invoke2(view);
                return tf.d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                kotlin.jvm.internal.g.e(it, "it");
                ImageAdjustDeleteConfirmDialog imageAdjustDeleteConfirmDialog = ImageAdjustDeleteConfirmDialog.this;
                imageAdjustDeleteConfirmDialog.f25679z = true;
                oo.a aVar = imageAdjustDeleteConfirmDialog.f23542t;
                if (aVar != null) {
                    aVar.a();
                }
                ImageAdjustDeleteConfirmDialog.this.dismiss();
            }
        });
        VB vb3 = this.f23550y;
        kotlin.jvm.internal.g.b(vb3);
        String p11 = ea.a.p("O2kfZChuLC4rYQhjUWwDdg==", "t4YqAKMt");
        TextView textView2 = ((b0) vb3).f744b;
        kotlin.jvm.internal.g.d(textView2, p11);
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(textView2, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.dialog.ImageAdjustDeleteConfirmDialog$initView$2
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(View view) {
                invoke2(view);
                return tf.d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                kotlin.jvm.internal.g.e(it, "it");
                ImageAdjustDeleteConfirmDialog.this.dismiss();
            }
        });
    }
}
