package pdf.pdfreader.viewer.editor.free.billing;

import android.app.Activity;
import androidx.activity.s;
import cg.p;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.w;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BillingRepository.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.billing.BillingRepository$uploadEvent$1", f = "BillingRepository.kt", l = {323}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class BillingRepository$uploadEvent$1 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super tf.d>, Object> {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ h.d $detail;
    final /* synthetic */ int $modeType;
    final /* synthetic */ ol.g $result;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingRepository$uploadEvent$1(h.d dVar, int i10, Activity activity, ol.g gVar, kotlin.coroutines.c<? super BillingRepository$uploadEvent$1> cVar) {
        super(2, cVar);
        this.$detail = dVar;
        this.$modeType = i10;
        this.$activity = activity;
        this.$result = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new BillingRepository$uploadEvent$1(this.$detail, this.$modeType, this.$activity, this.$result, cVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
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
            String str2 = this.$detail.f6251a;
            switch (str2.hashCode()) {
                case -1291178183:
                    if (str2.equals("premium1-p1m")) {
                        str = "sun_payok_m_h";
                        break;
                    }
                    str = "pay_plan_not_found";
                    break;
                case -1291178171:
                    if (str2.equals("premium1-p1y")) {
                        String str3 = this.$detail.f6252b;
                        if (str3 != null) {
                            int hashCode = str3.hashCode();
                            if (hashCode != -1137399479) {
                                if (hashCode != -36690199) {
                                    if (hashCode == -36690075 && str3.equals("free-trial-7d")) {
                                        str = "sun_payok_y_7_h";
                                        break;
                                    }
                                } else if (str3.equals("free-trial-3d")) {
                                    str = "sun_payok_y_3_h";
                                    break;
                                }
                            } else if (str3.equals("free-trial-14d")) {
                                str = "sun_payok_y_14_h";
                                break;
                            }
                        }
                        str = "sun_payok_y_h";
                        break;
                    }
                    str = "pay_plan_not_found";
                    break;
                case 109260:
                    if (str2.equals("p1m")) {
                        str = "sun_payok_m";
                        break;
                    }
                    str = "pay_plan_not_found";
                    break;
                case 109272:
                    if (str2.equals("p1y")) {
                        String str4 = this.$detail.f6252b;
                        if (str4 != null) {
                            switch (str4.hashCode()) {
                                case -1935956841:
                                    if (str4.equals("free-trial-3d-half")) {
                                        str = "sun_payok_y_b5_3";
                                        break;
                                    }
                                    break;
                                case -1137399479:
                                    if (str4.equals("free-trial-14d")) {
                                        str = "sun_payok_y_14";
                                        break;
                                    }
                                    break;
                                case -36690199:
                                    if (str4.equals("free-trial-3d")) {
                                        str = "sun_payok_y_3";
                                        break;
                                    }
                                    break;
                                case -36690075:
                                    if (str4.equals("free-trial-7d")) {
                                        str = "sun_payok_y_7";
                                        break;
                                    }
                                    break;
                            }
                        }
                        str = "sun_payok_y";
                        break;
                    }
                    str = "pay_plan_not_found";
                    break;
                default:
                    str = "pay_plan_not_found";
                    break;
            }
            String str5 = str;
            BillingRepository billingRepository = BillingRepository.f24041a;
            int i11 = this.$modeType;
            BillingRepository.f("sendIapEvent modeType " + i11 + " eventName " + str5);
            pdf.pdfreader.viewer.editor.free.billing.util.b bVar = pdf.pdfreader.viewer.editor.free.billing.util.b.f24064a;
            Activity activity = this.$activity;
            int i12 = this.$modeType;
            Purchase purchase = this.$result.f23486b;
            h.d dVar = this.$detail;
            this.label = 1;
            if (bVar.e(activity, i12, str5, purchase, dVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return tf.d.f30009a;
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super tf.d> cVar) {
        return ((BillingRepository$uploadEvent$1) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
    }
}
