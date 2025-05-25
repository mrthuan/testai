package pdf.pdfreader.viewer.editor.free.feature.scan.dialog;

import am.c0;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: ImageAdjustLeaveDialog.kt */
/* loaded from: classes3.dex */
public final class ImageAdjustLeaveDialog extends oo.l<c0> {

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ int f25680z = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageAdjustLeaveDialog(Context context) {
        super(context);
        kotlin.jvm.internal.g.e(context, ea.a.p("J29XdCl4dA==", "n6D9LweZ"));
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
    public final c0 H(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.dialog_image_adjust_leave, viewGroup, false);
        int i10 = R.id.dec_tv;
        if (((TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.dec_tv)) != null) {
            i10 = R.id.iv_icon;
            if (((ImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.iv_icon)) != null) {
                i10 = R.id.operate_cancel;
                TextView textView = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.operate_cancel);
                if (textView != null) {
                    i10 = R.id.operate_leave;
                    TextView textView2 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.operate_leave);
                    if (textView2 != null) {
                        i10 = R.id.title;
                        if (((TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.title)) != null) {
                            c0 c0Var = new c0(textView, textView2, (ConstraintLayout) inflate);
                            ea.a.p("AG4WbBF0DCghbgBsVXQychQgMW8ndFdpGmUDLHFmI2waZSk=", "4qippiOe");
                            return c0Var;
                        }
                    }
                }
            }
        }
        throw new NullPointerException(ea.a.p("AmlCcxBuUCAoZTt1HHINZBV2B2UyIBJpP2hUSSg6IA==", "zFJCKtlc").concat(inflate.getResources().getResourceName(i10)));
    }

    @Override // oo.g
    public final void z() {
        VB vb2 = this.f23550y;
        kotlin.jvm.internal.g.b(vb2);
        String p10 = ea.a.p("UWklZBpuBS4dcFFyCHQzTCFhRGU=", "L5Wnz8Qp");
        TextView textView = ((c0) vb2).c;
        kotlin.jvm.internal.g.d(textView, p10);
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(textView, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.dialog.ImageAdjustLeaveDialog$initView$1
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
                ImageAdjustLeaveDialog imageAdjustLeaveDialog = ImageAdjustLeaveDialog.this;
                int i10 = ImageAdjustLeaveDialog.f25680z;
                oo.a aVar = imageAdjustLeaveDialog.f23542t;
                if (aVar != null) {
                    aVar.a();
                }
                ImageAdjustLeaveDialog.this.dismiss();
            }
        });
        VB vb3 = this.f23550y;
        kotlin.jvm.internal.g.b(vb3);
        String p11 = ea.a.p("UWklZBpuBS4dcFFyCHQzQyVuUWVs", "SKJFbSp1");
        TextView textView2 = ((c0) vb3).f784b;
        kotlin.jvm.internal.g.d(textView2, p11);
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(textView2, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.dialog.ImageAdjustLeaveDialog$initView$2
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
                ImageAdjustLeaveDialog.this.dismiss();
            }
        });
    }
}
