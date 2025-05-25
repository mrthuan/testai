package pdf.pdfreader.viewer.editor.free.feature.ai.widget;

import am.c2;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.utils.event.AIEventCenter;

/* compiled from: AIErrorRetryView.kt */
/* loaded from: classes3.dex */
public final class AIErrorRetryView extends BaseBindingFrameLayout<c2> {

    /* renamed from: b  reason: collision with root package name */
    public cg.a<tf.d> f24738b;

    /* compiled from: AIErrorRetryView.kt */
    /* loaded from: classes3.dex */
    public static final class a extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f24739a;

        public a(Context context) {
            this.f24739a = context;
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View widget) {
            kotlin.jvm.internal.g.e(widget, "widget");
            try {
                this.f24739a.startActivity(new Intent(ea.a.p("Um4vchxpBi4BZUB0AG4xc2pXe1IDTAZTGV86RRNUKE50Uw==", "JiGagZcQ")));
                AIEventCenter aIEventCenter = AIEventCenter.f28648a;
                String p10 = ea.a.p("UmkoaBJ0PWMaZVdrB2UiXydsW2Nr", "62k5f0GV");
                aIEventCenter.getClass();
                AIEventCenter.i(p10, null);
            } catch (Exception unused) {
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public final void updateDrawState(TextPaint ds) {
            kotlin.jvm.internal.g.e(ds, "ds");
            super.updateDrawState(ds);
            ds.setColor(androidx.core.content.a.getColor(this.f24739a, R.color.color_100_black_white));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AIErrorRetryView(Context context) {
        super(context);
        kotlin.jvm.internal.g.e(context, ea.a.p("UG8ldBZ4dA==", "PYrcrO5W"));
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ai.widget.BaseBindingFrameLayout
    public final c2 a(LayoutInflater from) {
        kotlin.jvm.internal.g.e(from, "from");
        from.inflate(R.layout.layout_ai_chat_error_warning, this);
        int i10 = R.id.ai_file_ll_upload_file_err_container;
        LinearLayout linearLayout = (LinearLayout) com.google.android.play.core.assetpacks.c.u(this, R.id.ai_file_ll_upload_file_err_container);
        if (linearLayout != null) {
            i10 = R.id.ai_file_tv_upload_file_err_retry;
            TextView textView = (TextView) com.google.android.play.core.assetpacks.c.u(this, R.id.ai_file_tv_upload_file_err_retry);
            if (textView != null) {
                i10 = R.id.ai_file_tv_upload_file_err_txt;
                TextView textView2 = (TextView) com.google.android.play.core.assetpacks.c.u(this, R.id.ai_file_tv_upload_file_err_txt);
                if (textView2 != null) {
                    c2 c2Var = new c2(this, linearLayout, textView, textView2);
                    ea.a.p("Wm4tbBJ0BygUclttRSAiaC1zKQ==", "EonuAiCS");
                    return c2Var;
                }
            }
        }
        throw new NullPointerException(ea.a.p("AmlCcxBuUCAoZTt1HHINZBV2B2UyIBJpA2gTSQ06IA==", "xIAow3It").concat(getResources().getResourceName(i10)));
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ai.widget.BaseBindingFrameLayout
    public final void b(Context context) {
        ImageSpan imageSpan;
        kotlin.jvm.internal.g.e(context, "context");
        c2 c2Var = (c2) this.f24761a;
        if (c2Var != null) {
            String p10 = ea.a.p("Lml3aRVlY3YPcCZvFGQuaVllK3I3UgB0OXk=", "hd4QKmRT");
            TextView textView = c2Var.c;
            kotlin.jvm.internal.g.d(textView, p10);
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(textView, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.widget.AIErrorRetryView$initView$1$1
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
                    cg.a<tf.d> aVar = AIErrorRetryView.this.f24738b;
                    if (aVar != null) {
                        aVar.invoke();
                    }
                }
            });
            boolean j10 = pdf.pdfreader.viewer.editor.free.utils.extension.c.j(context);
            LinearLayout linearLayout = c2Var.f796b;
            if (j10) {
                linearLayout.setBackgroundResource(R.drawable.bg_ai_upload_err_warning_rtl);
            } else {
                linearLayout.setBackgroundResource(R.drawable.bg_ai_upload_err_warning);
            }
            String string = context.getString(R.string.arg_res_0x7f1302dd);
            kotlin.jvm.internal.g.d(string, ea.a.p("UG8ldBZ4Fi4VZUBTHXI_biMoYC41dDFpKmd6b1NmBWldZRRjG2UBay1kUXM2ZyZ0KQ==", "DT5iozZH"));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            Drawable drawable = androidx.core.content.a.getDrawable(context, R.drawable.ic_emoji_tear);
            if (drawable != null) {
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            }
            if (drawable != null) {
                imageSpan = new ImageSpan(drawable, 1);
            } else {
                imageSpan = null;
            }
            int V = kotlin.text.k.V(string, ea.a.p("anM=", "sV1hFTQL"), 0, false, 6);
            spannableStringBuilder.setSpan(imageSpan, V, V + 2, 33);
            String p11 = ea.a.p("bmI-", "gPRyHHmM");
            String p12 = ea.a.p("cy9TPg==", "nrxFIVo2");
            int V2 = kotlin.text.k.V(spannableStringBuilder, p11, 0, false, 6);
            spannableStringBuilder.delete(V2, p11.length() + V2);
            int V3 = kotlin.text.k.V(spannableStringBuilder, p12, 0, false, 6);
            spannableStringBuilder.delete(V3, p12.length() + V3);
            spannableStringBuilder.setSpan(new a(context), V2, V3, 33);
            spannableStringBuilder.setSpan(new StyleSpan(1), V2, V3, 33);
            spannableStringBuilder.setSpan(new UnderlineSpan(), V2, V3, 33);
            TextView textView2 = c2Var.f797d;
            textView2.setText(spannableStringBuilder);
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    public final void setErrorClickListener(cg.a<tf.d> clickRetryListener) {
        kotlin.jvm.internal.g.e(clickRetryListener, "clickRetryListener");
        this.f24738b = clickRetryListener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AIErrorRetryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.g.e(context, ea.a.p("LG8ldC14dA==", "oPOKHJim"));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AIErrorRetryView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        kotlin.jvm.internal.g.e(context, ea.a.p("KG8IdDN4dA==", "9TKfVvJQ"));
    }
}
