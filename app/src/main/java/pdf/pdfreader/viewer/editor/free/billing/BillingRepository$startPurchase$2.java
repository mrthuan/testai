package pdf.pdfreader.viewer.editor.free.billing;

import android.app.Activity;
import android.text.TextUtils;
import androidx.activity.s;
import cg.p;
import com.android.billingclient.api.e;
import com.android.billingclient.api.h;
import com.facebook.ads.AdError;
import com.google.android.gms.internal.play_billing.zzaa;
import com.google.android.play.core.assetpacks.b1;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.w;
import pdf.pdfreader.viewer.editor.free.billing.exception.BillingException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BillingRepository.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.billing.BillingRepository$startPurchase$2", f = "BillingRepository.kt", l = {229}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class BillingRepository$startPurchase$2 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super Boolean>, Object> {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ int $modeType;
    final /* synthetic */ String $token;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingRepository$startPurchase$2(Activity activity, String str, int i10, kotlin.coroutines.c<? super BillingRepository$startPurchase$2> cVar) {
        super(2, cVar);
        this.$activity = activity;
        this.$token = str;
        this.$modeType = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new BillingRepository$startPurchase$2(this.$activity, this.$token, this.$modeType, cVar);
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [com.android.billingclient.api.h$d, T] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        boolean z10;
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
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ArrayList arrayList = BillingRepository.f24045f;
            String str = this.$token;
            Iterator it = arrayList.iterator();
            while (true) {
                obj2 = null;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                ArrayList arrayList2 = ((com.android.billingclient.api.h) next).f6245h;
                if (arrayList2 != null) {
                    Iterator it2 = arrayList2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next2 = it2.next();
                        ?? r92 = (h.d) next2;
                        boolean a10 = kotlin.jvm.internal.g.a(r92.c, str);
                        if (a10) {
                            ref$ObjectRef.element = r92;
                            continue;
                        }
                        if (a10) {
                            obj2 = next2;
                            break;
                        }
                    }
                    obj2 = (h.d) obj2;
                }
                if (obj2 != null) {
                    z10 = true;
                    continue;
                } else {
                    z10 = false;
                    continue;
                }
                if (z10) {
                    obj2 = next;
                    break;
                }
            }
            com.android.billingclient.api.h hVar = (com.android.billingclient.api.h) obj2;
            if (hVar != null) {
                h.d dVar = (h.d) ref$ObjectRef.element;
                if (dVar != null) {
                    int i11 = this.$modeType;
                    BillingRepository billingRepository = BillingRepository.f24041a;
                    BillingRepository.f24048i = new ol.c(dVar, i11);
                }
                Activity activity = this.$activity;
                e.a[] aVarArr = new e.a[1];
                e.a.C0048a c0048a = new e.a.C0048a();
                c0048a.f6222a = hVar;
                if (hVar.a() != null) {
                    hVar.a().getClass();
                    String str2 = hVar.a().f6247a;
                    if (str2 != null) {
                        c0048a.f6223b = str2;
                    }
                }
                String str3 = this.$token;
                if (!TextUtils.isEmpty(str3)) {
                    c0048a.f6223b = str3;
                    zzaa.zzc(c0048a.f6222a, "ProductDetails is required for constructing ProductDetailsParams.");
                    if (c0048a.f6222a.f6245h != null) {
                        zzaa.zzc(c0048a.f6223b, "offerToken is required for constructing ProductDetailsParams for subscriptions.");
                    }
                    aVarArr[0] = new e.a(c0048a);
                    ArrayList j10 = ge.a.j(aVarArr);
                    this.label = 1;
                    kotlinx.coroutines.h hVar2 = new kotlinx.coroutines.h(1, b1.L(this));
                    hVar2.s();
                    y4.a d10 = y4.a.d();
                    f fVar = new f(hVar2);
                    synchronized (d10) {
                        d10.g(activity, j10, fVar);
                    }
                    obj = hVar2.r();
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    throw new IllegalArgumentException("offerToken can not be empty");
                }
            } else {
                throw new BillingException(AdError.REMOTE_ADS_SERVICE_ERROR, "not found product detail");
            }
        }
        ol.g gVar = (ol.g) obj;
        BillingRepository billingRepository2 = BillingRepository.f24041a;
        BillingRepository.h(this.$activity, gVar);
        return Boolean.valueOf(gVar.f23485a);
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super Boolean> cVar) {
        return ((BillingRepository$startPurchase$2) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
    }
}
