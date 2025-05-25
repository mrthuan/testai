package pdf.pdfreader.viewer.editor.free.fnbridge;

import androidx.activity.s;
import cg.p;
import com.lib.flutter.encrypt.EngineHelper;
import com.lib.flutter.encrypt.FlutterAppApi;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.e0;
import kotlinx.coroutines.w;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import tf.d;
import wf.c;

/* compiled from: FlutterEncryptConfig.kt */
@c(c = "pdf.pdfreader.viewer.editor.free.fnbridge.FlutterEncryptConfig$callback$1$loadAd$1", f = "FlutterEncryptConfig.kt", l = {ShapeTypes.FLOW_CHART_EXTRACT}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class FlutterEncryptConfig$callback$1$loadAd$1 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super d>, Object> {
    final /* synthetic */ String $type;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlutterEncryptConfig$callback$1$loadAd$1(String str, kotlin.coroutines.c<? super FlutterEncryptConfig$callback$1$loadAd$1> cVar) {
        super(2, cVar);
        this.$type = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new FlutterEncryptConfig$callback$1$loadAd$1(this.$type, cVar);
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
            this.label = 1;
            if (e0.a(1000L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        EngineHelper.f15726a.getClass();
        FlutterAppApi flutterAppApi = EngineHelper.f15727b;
        if (flutterAppApi != null) {
            flutterAppApi.c(this.$type, false, new cg.a<d>() { // from class: pdf.pdfreader.viewer.editor.free.fnbridge.FlutterEncryptConfig$callback$1$loadAd$1.1
                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // cg.a
                public /* bridge */ /* synthetic */ d invoke() {
                    invoke2();
                    return d.f30009a;
                }
            });
        }
        return d.f30009a;
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super d> cVar) {
        return ((FlutterEncryptConfig$callback$1$loadAd$1) create(wVar, cVar)).invokeSuspend(d.f30009a);
    }
}
