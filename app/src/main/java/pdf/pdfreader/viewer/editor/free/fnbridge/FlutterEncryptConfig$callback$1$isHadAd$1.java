package pdf.pdfreader.viewer.editor.free.fnbridge;

import android.app.Activity;
import android.content.Context;
import androidx.activity.s;
import cg.p;
import el.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g;
import kotlinx.coroutines.e0;
import kotlinx.coroutines.w;
import pdf.pdfreader.viewer.editor.free.utils.AdUtils;
import tf.d;
import wf.c;

/* compiled from: FlutterEncryptConfig.kt */
@c(c = "pdf.pdfreader.viewer.editor.free.fnbridge.FlutterEncryptConfig$callback$1$isHadAd$1", f = "FlutterEncryptConfig.kt", l = {97}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class FlutterEncryptConfig$callback$1$isHadAd$1 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super d>, Object> {
    final /* synthetic */ Context $context;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlutterEncryptConfig$callback$1$isHadAd$1(Context context, kotlin.coroutines.c<? super FlutterEncryptConfig$callback$1$isHadAd$1> cVar) {
        super(2, cVar);
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new FlutterEncryptConfig$callback$1$isHadAd$1(this.$context, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.label;
        boolean z10 = true;
        if (i10 != 0) {
            if (i10 == 1) {
                s.u0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            s.u0(obj);
            this.label = 1;
            if (e0.a(2000L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        FlutterEncryptConfig flutterEncryptConfig = FlutterEncryptConfig.f25878a;
        Context context = this.$context;
        flutterEncryptConfig.getClass();
        g.e(context, "context");
        boolean a10 = AdUtils.a(context);
        boolean b10 = FlutterEncryptConfig.b();
        if (!a10 && b10 && FlutterEncryptConfig.c()) {
            b.a aVar = el.b.f16791g;
            el.b a11 = aVar.a();
            if (!((a11.f16793a == null || a11.f16795d) ? false : false)) {
                Activity a12 = FlutterEncryptConfig.a(flutterEncryptConfig, this.$context);
                if (a12 != null) {
                    aVar.a().b(a12);
                }
            } else {
                aVar.a();
                el.b.a("has ad, skip load");
            }
        }
        return d.f30009a;
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super d> cVar) {
        return ((FlutterEncryptConfig$callback$1$isHadAd$1) create(wVar, cVar)).invokeSuspend(d.f30009a);
    }
}
