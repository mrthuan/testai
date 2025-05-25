package pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.vh;

import am.g3;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import cg.l;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.g;
import pdf.pdfreader.viewer.editor.free.feature.ai.widget.AIErrorRetryView;
import pdf.pdfreader.viewer.editor.free.ui.widget.ProgressView;

/* compiled from: AIChatSendViewHolder.kt */
/* loaded from: classes3.dex */
public final class f extends g<km.a, g3> {

    /* renamed from: d  reason: collision with root package name */
    public l<? super km.a, tf.d> f24725d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g3 g3Var) {
        super(g3Var);
        ea.a.p("AGkgZD5uZw==", "inbNWV7O");
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.g
    public final void l(int i10, km.a aVar) {
        final km.a aVar2 = aVar;
        g3 g3Var = (g3) this.f24704b;
        g3Var.f939e.setText(aVar2.f19888r);
        boolean j10 = pdf.pdfreader.viewer.editor.free.utils.extension.c.j(this.c);
        TextView textView = g3Var.f939e;
        if (j10) {
            textView.setBackgroundResource(R.drawable.bg_ai_chat_send_bubble_rtl);
        } else {
            textView.setBackgroundResource(R.drawable.bg_ai_chat_send_bubble);
        }
        cg.a<tf.d> aVar3 = new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.vh.AIChatSendViewHolder$onBindView$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // cg.a
            public /* bridge */ /* synthetic */ tf.d invoke() {
                invoke2();
                return tf.d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                l<? super km.a, tf.d> lVar = f.this.f24725d;
                if (lVar != null) {
                    lVar.invoke(aVar2);
                }
            }
        };
        AIErrorRetryView aIErrorRetryView = g3Var.f937b;
        aIErrorRetryView.setErrorClickListener(aVar3);
        int i11 = aVar2.f19889s;
        AppCompatImageView appCompatImageView = g3Var.c;
        ProgressView progressView = g3Var.f938d;
        switch (i11) {
            case 200:
                progressView.setVisibility(0);
                appCompatImageView.setVisibility(8);
                aIErrorRetryView.setVisibility(8);
                return;
            case 201:
                progressView.setVisibility(8);
                appCompatImageView.setVisibility(0);
                aIErrorRetryView.setVisibility(0);
                return;
            case 202:
                progressView.setVisibility(8);
                appCompatImageView.setVisibility(8);
                aIErrorRetryView.setVisibility(8);
                return;
            case 203:
                progressView.setVisibility(8);
                appCompatImageView.setVisibility(0);
                aIErrorRetryView.setVisibility(8);
                return;
            default:
                return;
        }
    }
}
