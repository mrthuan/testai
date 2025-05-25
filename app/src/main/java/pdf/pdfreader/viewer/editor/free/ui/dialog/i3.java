package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: SimpleTipDialog.kt */
/* loaded from: classes3.dex */
public final class i3 extends oo.g {
    public static final /* synthetic */ int C = 0;
    public final CharSequence A;
    public cg.a<tf.d> B;

    /* renamed from: y  reason: collision with root package name */
    public final CharSequence f27623y;

    /* renamed from: z  reason: collision with root package name */
    public final CharSequence f27624z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(Context context, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        super(context, (Object) null);
        kotlin.jvm.internal.g.e(context, ea.a.p("UG8ldBZ4dA==", "YFX0blfO"));
        kotlin.jvm.internal.g.e(charSequence, ea.a.p("O2lFbGU=", "ElWxuysV"));
        kotlin.jvm.internal.g.e(charSequence2, ea.a.p("K2Vj", "M6ZXAeLe"));
        this.f27623y = charSequence;
        this.f27624z = charSequence2;
        this.A = charSequence3;
    }

    @Override // oo.g
    public final boolean A() {
        return false;
    }

    @Override // oo.g
    public final int w() {
        return R.layout.dialog_simple_tip;
    }

    @Override // oo.g
    public final void z() {
        TextView textView = (TextView) findViewById(R.id.title);
        if (textView != null) {
            textView.setText(this.f27623y);
        }
        TextView textView2 = (TextView) findViewById(R.id.dec_tv);
        if (textView2 != null) {
            textView2.setText(this.f27624z);
        }
        TextView textView3 = (TextView) findViewById(R.id.dec_tv2);
        if (textView3 != null) {
            CharSequence charSequence = this.A;
            if (!TextUtils.isEmpty(charSequence)) {
                textView3.setVisibility(0);
                textView3.setText(charSequence);
            }
        }
        View findViewById = findViewById(R.id.operate_ok);
        if (findViewById != null) {
            findViewById.setOnClickListener(new u4.j(this, 23));
        }
        ImageView imageView = (ImageView) findViewById(R.id.iv_icon);
        if (imageView != null) {
            imageView.setImageResource(R.drawable.ic_merge_fail);
        }
    }
}
