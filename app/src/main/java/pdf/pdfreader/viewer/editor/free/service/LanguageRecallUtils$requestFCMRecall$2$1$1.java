package pdf.pdfreader.viewer.editor.free.service;

import android.content.Context;
import androidx.activity.s;
import cg.p;
import java.net.URLEncoder;
import java.util.List;
import kotlin.collections.m;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g;
import kotlinx.coroutines.w;
import no.f;
import org.json.JSONObject;
import tf.d;
import wf.c;

/* compiled from: LanguageRecallUtils.kt */
@c(c = "pdf.pdfreader.viewer.editor.free.service.LanguageRecallUtils$requestFCMRecall$2$1$1", f = "LanguageRecallUtils.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class LanguageRecallUtils$requestFCMRecall$2$1$1 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super d>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ List<Long> $fcmTriggerTime;
    final /* synthetic */ String $token;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageRecallUtils$requestFCMRecall$2$1$1(List<Long> list, String str, Context context, kotlin.coroutines.c<? super LanguageRecallUtils$requestFCMRecall$2$1$1> cVar) {
        super(2, cVar);
        this.$fcmTriggerTime = list;
        this.$token = str;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new LanguageRecallUtils$requestFCMRecall$2$1$1(this.$fcmTriggerTime, this.$token, this.$context, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long j10;
        boolean z10;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            s.u0(obj);
            try {
                Long l10 = (Long) m.y0(this.$fcmTriggerTime);
                if (l10 != null) {
                    j10 = l10.longValue();
                } else {
                    j10 = 0;
                }
                b bVar = b.f26559a;
                List<Long> list = this.$fcmTriggerTime;
                String token = this.$token;
                g.d(token, "token");
                String encode = URLEncoder.encode(b5.a.b(this.$context, b.a(bVar, list, token)), ea.a.p("H1QHLTg=", "qpJAb74D"));
                g.d(encode, ea.a.p("IG4RbyJlGUEtczN0XWwkLl1uMXIwcEJEloDXKDJvLHQgeAYsZmRQdCkpSiAWVQNGFThwKQ==", "HyErF1zn"));
                String responseData = ea.a.s(this.$context, "https://pdfreader2fcm.deepthought.industries/fcmbull/delaymsg", b.b(bVar, this.$context, encode));
                Context context = this.$context;
                g.d(responseData, "responseData");
                String a10 = b5.a.a(context, responseData);
                ea.a.p("B2VScjJwHkQpdAcoV285dF14JixpZVhjBnkBdDRkEGUQcF5uOGUuYTxhKQ==", "E7c1KjJo");
                if (a10.length() > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    JSONObject jSONObject = new JSONObject(a10);
                    if (jSONObject.has("code") && jSONObject.getInt("code") == 200) {
                        f.b(this.$context).getClass();
                        f.j(j10);
                    }
                }
            } catch (Throwable th2) {
                try {
                    th2.printStackTrace();
                    b bVar2 = b.f26559a;
                } catch (Throwable th3) {
                    b bVar3 = b.f26559a;
                    b.f26567j = false;
                    throw th3;
                }
            }
            b.f26567j = false;
            return d.f30009a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super d> cVar) {
        return ((LanguageRecallUtils$requestFCMRecall$2$1$1) create(wVar, cVar)).invokeSuspend(d.f30009a);
    }
}
