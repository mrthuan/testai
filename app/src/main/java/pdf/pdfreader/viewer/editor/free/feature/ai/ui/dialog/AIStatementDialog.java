package pdf.pdfreader.viewer.editor.free.feature.ai.ui.dialog;

import android.content.Context;
import android.content.Intent;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import c4.n;
import cg.l;
import com.bumptech.glide.b;
import com.bumptech.glide.f;
import kotlin.jvm.internal.Ref$BooleanRef;
import oo.g;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AISimpleSubscriptionActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderFeedbackActivity;
import pdf.pdfreader.viewer.editor.free.utils.event.AIEventCenter;
import pdf.pdfreader.viewer.editor.free.utils.extension.c;
import pdf.pdfreader.viewer.editor.free.utils.h1;
import tf.d;

/* compiled from: AIStatementDialog.kt */
/* loaded from: classes3.dex */
public final class AIStatementDialog extends g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AIStatementDialog(AISimpleSubscriptionActivity aISimpleSubscriptionActivity) {
        super(aISimpleSubscriptionActivity, (Object) null);
        kotlin.jvm.internal.g.e(aISimpleSubscriptionActivity, ea.a.p("UG8ldBZ4dA==", "6GxbsaCX"));
    }

    public static void H(AIStatementDialog aIStatementDialog) {
        kotlin.jvm.internal.g.e(aIStatementDialog, ea.a.p("O2hYc10w", "kvoMfX8i"));
        super.dismiss();
    }

    @Override // oo.g, l.p, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
    }

    @Override // oo.g, android.app.Dialog
    public final void show() {
        super.show();
        AIEventCenter aIEventCenter = AIEventCenter.f28648a;
        String p10 = ea.a.p("LmlSbBhpWl8paCV3", "VOnL2MPl");
        aIEventCenter.getClass();
        AIEventCenter.i(p10, null);
    }

    @Override // oo.g
    public final int w() {
        return R.layout.dialog_ai_statement;
    }

    @Override // oo.g
    public final void z() {
        int i10;
        Window window = getWindow();
        if (window != null) {
            window.setNavigationBarColor(androidx.core.content.a.getColor(getContext(), R.color.color_white_131720));
        }
        TextView textView = (TextView) findViewById(R.id.ai_statement_tv_content);
        ImageView imageView = (ImageView) findViewById(R.id.iv_top_round_bg);
        TextView textView2 = (TextView) findViewById(R.id.ai_statement_tv_feedback);
        TextView textView3 = (TextView) findViewById(R.id.ai_statement_tv_got_it);
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.cl_ai_statement_root);
        if (constraintLayout != null) {
            constraintLayout.setOnClickListener(new u4.g(this, 1));
        }
        if (imageView != null) {
            f f10 = b.f(getContext());
            Context context = getContext();
            kotlin.jvm.internal.g.d(context, ea.a.p("UG8ldBZ4dA==", "Q5QfpVls"));
            if (c.h(context)) {
                i10 = R.drawable.bg_ai_page_statement_dark;
            } else {
                i10 = R.drawable.bg_ai_page;
            }
            f10.n(Integer.valueOf(i10)).z(new n(getContext().getResources().getDimensionPixelSize(R.dimen.dp_18), getContext().getResources().getDimensionPixelSize(R.dimen.dp_18)), true).E(imageView);
        }
        if (textView != null) {
            textView.setVerticalScrollBarEnabled(false);
        }
        if (textView != null) {
            textView.setHorizontalScrollBarEnabled(false);
        }
        if (textView != null) {
            textView.setMovementMethod(ScrollingMovementMethod.getInstance());
        }
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        if (textView2 != null) {
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(textView2, new l<View, d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.dialog.AIStatementDialog$initView$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // cg.l
                public /* bridge */ /* synthetic */ d invoke(View view) {
                    invoke2(view);
                    return d.f30009a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(View it) {
                    kotlin.jvm.internal.g.e(it, "it");
                    Ref$BooleanRef.this.element = true;
                    AIEventCenter aIEventCenter = AIEventCenter.f28648a;
                    String p10 = ea.a.p("LmlSbBhpWl88ZS9kKmMEaVZr", "MKAf4esY");
                    aIEventCenter.getClass();
                    AIEventCenter.i(p10, null);
                    this.dismiss();
                    Intent intent = new Intent(this.getContext(), ReaderFeedbackActivity.class);
                    intent.putExtra(ea.a.p("R2Fn", "0VKmKAfG"), ea.a.p("LGxQaW0=", "sxlei8xT"));
                    h1.startActivity(this.getContext(), intent);
                }
            });
        }
        if (textView3 != null) {
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(textView3, new l<View, d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.dialog.AIStatementDialog$initView$4
                {
                    super(1);
                }

                @Override // cg.l
                public /* bridge */ /* synthetic */ d invoke(View view) {
                    invoke2(view);
                    return d.f30009a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(View it) {
                    kotlin.jvm.internal.g.e(it, "it");
                    AIStatementDialog.this.dismiss();
                }
            });
        }
        setOnDismissListener(new a(ref$BooleanRef, 0));
    }
}
