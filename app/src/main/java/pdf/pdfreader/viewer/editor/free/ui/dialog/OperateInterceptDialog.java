package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: OperateInterceptDialog.kt */
/* loaded from: classes3.dex */
public final class OperateInterceptDialog extends oo.g {
    public oo.b A;

    /* renamed from: y  reason: collision with root package name */
    public final String f27441y;

    /* renamed from: z  reason: collision with root package name */
    public final String f27442z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OperateInterceptDialog(Context context, String str, String str2) {
        super(context, (Object) null);
        kotlin.jvm.internal.g.e(context, ea.a.p("UG8ldBZ4dA==", "EBj1auBS"));
        kotlin.jvm.internal.g.e(str, ea.a.p("R2k_bGU=", "ajCvBquK"));
        kotlin.jvm.internal.g.e(str2, ea.a.p("V2Vj", "4133x9wZ"));
        this.f27441y = str;
        this.f27442z = str2;
    }

    @Override // oo.g
    public final boolean A() {
        return true;
    }

    @Override // oo.g
    public final boolean B() {
        return true;
    }

    @Override // oo.g
    public final int w() {
        return R.layout.dialog_operate_intercept;
    }

    @Override // oo.g
    public final void z() {
        View x4 = x();
        ((TextView) x4.findViewById(R.id.title)).setText(this.f27441y);
        ((TextView) x4.findViewById(R.id.dec_tv)).setText(this.f27442z);
        View findViewById = x4.findViewById(R.id.dia_intercept_quit);
        kotlin.jvm.internal.g.d(findViewById, ea.a.p("VWklZCVpB3cweX1kVVQzeDBWW2UxPmtSfGlcLjBpAF9abj9lAWMHcAZfRXUAdCk=", "R8Tal9Xp"));
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(findViewById, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.dialog.OperateInterceptDialog$initView$1$1
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
                oo.b bVar = OperateInterceptDialog.this.A;
                if (bVar != null) {
                    bVar.a();
                }
                OperateInterceptDialog.this.cancel();
            }
        });
        View findViewById2 = x4.findViewById(R.id.dia_intercept_cancel);
        kotlin.jvm.internal.g.d(findViewById2, ea.a.p("VWklZCVpB3cweX1kVVQzeDBWW2UxPmtSbGkoLlRpD19abj9lAWMHcAZfV2EHYzNsKQ==", "BL0nhxLo"));
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(findViewById2, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.dialog.OperateInterceptDialog$initView$1$2
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
                oo.b bVar = OperateInterceptDialog.this.A;
                if (bVar != null) {
                    bVar.cancel();
                }
                OperateInterceptDialog.this.cancel();
            }
        });
        ((ImageView) x4.findViewById(R.id.iv_icon)).setImageResource(R.drawable.ic_merge_fail);
    }
}
