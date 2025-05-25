package pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.vh;

import android.content.Context;
import android.text.Spanned;
import androidx.activity.s;
import cg.p;
import com.google.android.play.core.assetpacks.b1;
import java.io.File;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g;
import kotlinx.coroutines.internal.l;
import kotlinx.coroutines.j0;
import kotlinx.coroutines.w;
import kotlinx.coroutines.x;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.ai.db.AIAnswerContent;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: AIChatAnswerViewHolder.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.vh.AIChatAnswerViewHolder$onBindView$1$1$clickShare$1$3", f = "AIChatAnswerViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class AIChatAnswerViewHolder$onBindView$1$1$clickShare$1$3 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super tf.d>, Object> {
    final /* synthetic */ AIAnswerContent $msg;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AIChatAnswerViewHolder$onBindView$1$1$clickShare$1$3(b bVar, AIAnswerContent aIAnswerContent, kotlin.coroutines.c<? super AIChatAnswerViewHolder$onBindView$1$1$clickShare$1$3> cVar) {
        super(2, cVar);
        this.this$0 = bVar;
        this.$msg = aIAnswerContent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        AIChatAnswerViewHolder$onBindView$1$1$clickShare$1$3 aIChatAnswerViewHolder$onBindView$1$1$clickShare$1$3 = new AIChatAnswerViewHolder$onBindView$1$1$clickShare$1$3(this.this$0, this.$msg, cVar);
        aIChatAnswerViewHolder$onBindView$1$1$clickShare$1$3.L$0 = obj;
        return aIChatAnswerViewHolder$onBindView$1$1$clickShare$1$3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            s.u0(obj);
            w wVar = (w) this.L$0;
            b bVar = this.this$0;
            if (bVar.f24710e) {
                return tf.d.f30009a;
            }
            bVar.f24710e = true;
            try {
                int endIndex = this.$msg.getEndIndex();
                CharSequence spanStr = this.$msg.getSpanStr();
                if (spanStr instanceof Spanned) {
                    b bVar2 = this.this$0;
                    String content = this.$msg.getContent();
                    g.d(content, "msg.content");
                    bVar2.getClass();
                    str = b.m(content, (Spanned) spanStr, endIndex);
                    if (str == null) {
                        str = "";
                    }
                } else if (spanStr != null) {
                    str = spanStr.toString();
                } else {
                    str = null;
                }
                if (str != null) {
                    b bVar3 = this.this$0;
                    Context context = bVar3.c;
                    String string = context.getString(R.string.arg_res_0x7f1300a4);
                    g.d(string, "context.getString(R.stri…at_with_ai_assistant_gpt)");
                    File n10 = b.n(context, str, string);
                    String string2 = context.getResources().getString(R.string.arg_res_0x7f13036c);
                    g.d(string2, "context.resources.getStr…R.string.reader_app_name)");
                    String str2 = context.getString(R.string.arg_res_0x7f13003c, string2) + " " + b1.H();
                    lg.b bVar4 = j0.f20206a;
                    t0.d0(x.a(l.f20194a), null, null, new AIChatAnswerViewHolder$onBindView$1$1$clickShare$1$3$1$1(bVar3, n10, str2, null), 3);
                } else {
                    tf.d dVar = tf.d.f30009a;
                }
            } catch (Exception unused) {
            } catch (Throwable th2) {
                this.this$0.f24710e = false;
                throw th2;
            }
            this.this$0.f24710e = false;
            return tf.d.f30009a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super tf.d> cVar) {
        return ((AIChatAnswerViewHolder$onBindView$1$1$clickShare$1$3) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
    }
}
