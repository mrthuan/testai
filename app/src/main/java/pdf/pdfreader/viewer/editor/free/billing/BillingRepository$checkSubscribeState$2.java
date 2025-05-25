package pdf.pdfreader.viewer.editor.free.billing;

import android.app.Application;
import android.content.Context;
import androidx.activity.s;
import cg.p;
import com.google.android.play.core.assetpacks.b1;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.w;
import pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl;

/* compiled from: BillingRepository.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.billing.BillingRepository$checkSubscribeState$2", f = "BillingRepository.kt", l = {202}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class BillingRepository$checkSubscribeState$2 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super tf.d>, Object> {
    int label;

    public BillingRepository$checkSubscribeState$2(kotlin.coroutines.c<? super BillingRepository$checkSubscribeState$2> cVar) {
        super(2, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new BillingRepository$checkSubscribeState$2(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                s.u0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            s.u0(obj);
            Application application = BillingRepository.c;
            if (application != null) {
                this.label = 1;
                kotlinx.coroutines.h hVar = new kotlinx.coroutines.h(1, b1.L(this));
                hVar.s();
                y4.a d10 = y4.a.d();
                e eVar = new e(hVar);
                synchronized (d10) {
                    Context applicationContext = application.getApplicationContext();
                    y4.a.b(applicationContext, "queryPurchase");
                    d10.f(applicationContext, new y4.b(d10, applicationContext, eVar));
                }
                obj = hVar.r();
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                kotlin.jvm.internal.g.i("application");
                throw null;
            }
        }
        a.f24050a.getClass();
        boolean c = g.c(a.f24051b, (List) obj);
        i iVar = BillingRepository.f24042b;
        if (iVar != null) {
            ((BillingConfigImpl) iVar).D(c);
            BillingRepository billingRepository = BillingRepository.f24041a;
            BillingRepository.f("checkSubscribeState isPremiumUser: " + c);
            return tf.d.f30009a;
        }
        kotlin.jvm.internal.g.i("billingConfig");
        throw null;
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super tf.d> cVar) {
        return ((BillingRepository$checkSubscribeState$2) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
    }
}
