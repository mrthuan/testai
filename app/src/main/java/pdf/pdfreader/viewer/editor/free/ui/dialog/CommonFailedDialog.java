package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: CommonFailedDialog.kt */
/* loaded from: classes3.dex */
public final class CommonFailedDialog extends oo.g {
    public CharSequence A;
    public TextView B;
    public TextView C;

    /* renamed from: y  reason: collision with root package name */
    public final cg.a<tf.d> f27422y;

    /* renamed from: z  reason: collision with root package name */
    public String f27423z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonFailedDialog(Context context, cg.a<tf.d> aVar) {
        super(context, (Object) null);
        kotlin.jvm.internal.g.e(context, ea.a.p("UG8ldBZ4dA==", "lQG0TOTt"));
        kotlin.jvm.internal.g.e(aVar, ea.a.p("XG4EazBsC2Nr", "ovzr5IUl"));
        this.f27422y = aVar;
        this.f27423z = "";
        this.A = "";
    }

    @Override // oo.g
    public final boolean A() {
        return true;
    }

    public final void H(String str, CharSequence charSequence) {
        this.f27423z = str;
        this.A = charSequence;
        TextView textView = this.B;
        if (textView != null) {
            textView.setText(str);
        }
        TextView textView2 = this.C;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
    }

    @Override // oo.g
    public final int w() {
        return R.layout.dialog_common_fail;
    }

    @Override // oo.g
    public final void z() {
        View x4 = x();
        TextView textView = (TextView) x4.findViewById(R.id.tv_title);
        textView.setText(this.f27423z);
        this.B = textView;
        TextView textView2 = (TextView) x4.findViewById(R.id.tv_desc);
        textView2.setText(this.A);
        this.C = textView2;
        View findViewById = x4.findViewById(R.id.operate_ok);
        kotlin.jvm.internal.g.d(findViewById, ea.a.p("VWklZCVpB3cweX1kVVQzeDBWW2UxPmtSQWlULh5wDXJSdC5fHGsp", "o0qhPubX"));
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(findViewById, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.dialog.CommonFailedDialog$initView$1$3
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
                CommonFailedDialog.this.cancel();
                CommonFailedDialog.this.f27422y.invoke();
            }
        });
        ((ImageView) x4.findViewById(R.id.iv_icon)).setImageResource(R.drawable.ic_merge_fail);
    }
}
