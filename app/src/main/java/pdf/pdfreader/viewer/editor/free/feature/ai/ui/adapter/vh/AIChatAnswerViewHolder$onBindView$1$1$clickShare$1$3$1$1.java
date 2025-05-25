package pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.vh;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.activity.s;
import cg.p;
import com.google.android.play.core.assetpacks.b1;
import java.io.File;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.w;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ads.AppOpenManager;
import pdf.pdfreader.viewer.editor.free.utils.t1;
import pdf.pdfreader.viewer.editor.free.utils.v;

/* compiled from: AIChatAnswerViewHolder.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.vh.AIChatAnswerViewHolder$onBindView$1$1$clickShare$1$3$1$1", f = "AIChatAnswerViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class AIChatAnswerViewHolder$onBindView$1$1$clickShare$1$3$1$1 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super tf.d>, Object> {
    final /* synthetic */ File $saveHtmlToFile;
    final /* synthetic */ String $title;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AIChatAnswerViewHolder$onBindView$1$1$clickShare$1$3$1$1(b bVar, File file, String str, kotlin.coroutines.c<? super AIChatAnswerViewHolder$onBindView$1$1$clickShare$1$3$1$1> cVar) {
        super(2, cVar);
        this.this$0 = bVar;
        this.$saveHtmlToFile = file;
        this.$title = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new AIChatAnswerViewHolder$onBindView$1$1$clickShare$1$3$1$1(this.this$0, this.$saveHtmlToFile, this.$title, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            s.u0(obj);
            b bVar = this.this$0;
            int i10 = b.f24708m;
            Context context = bVar.c;
            File file = this.$saveHtmlToFile;
            String str = this.$title;
            Intent intent = new Intent();
            Uri u7 = v.u(context, file);
            if (u7 != null) {
                intent.addFlags(1);
            }
            intent.setAction(ea.a.p("Lm5VchZpUy4zbj5lG3RGYVZ0B28rLjZFGEQ=", "r1P3VJUm"));
            intent.setType(b1.I(file));
            intent.putExtra(ea.a.p("Lm5VchZpUy4zbj5lG3RGZU10HGFrUzBCAEUUVA==", "rJjgJWB6"), file.getName());
            intent.putExtra(ea.a.p("Um4vchxpBi4bbkBlB3R4ZTx0QGFoVAZYVA==", "e54L2HyF"), str);
            intent.putExtra(ea.a.p("NW40chdpBi4hbhJlWnR5ZUB0IGFnU2JSMUFN", "kZTPxbHM"), u7);
            try {
                eo.e.r(context, eo.e.j(context) + 1);
                context.startActivity(Intent.createChooser(intent, context.getResources().getString(R.string.arg_res_0x7f1303ef)));
                AppOpenManager.c().f23907g = false;
            } catch (Exception e10) {
                e10.printStackTrace();
                t1.c(ea.a.p("PGhQchxGXmxl", "GZW2hkxf"), e10);
            }
            return tf.d.f30009a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super tf.d> cVar) {
        return ((AIChatAnswerViewHolder$onBindView$1$1$clickShare$1$3$1$1) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
    }
}
