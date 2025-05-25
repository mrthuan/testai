package androidx.appcompat.libconvert.helper;

import android.content.Context;
import androidx.activity.s;
import androidx.appcompat.libconvert.helper.NativeSoLoaderHelper;
import cg.p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.w;
import tf.d;
import wf.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NativeSoLoaderHelper.kt */
@c(c = "androidx.appcompat.libconvert.helper.NativeSoLoaderHelper$Companion$deleteDynamicSo$1", f = "NativeSoLoaderHelper.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class NativeSoLoaderHelper$Companion$deleteDynamicSo$1 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super d>, Object> {
    final /* synthetic */ Context $context;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeSoLoaderHelper$Companion$deleteDynamicSo$1(Context context, kotlin.coroutines.c<? super NativeSoLoaderHelper$Companion$deleteDynamicSo$1> cVar) {
        super(2, cVar);
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new NativeSoLoaderHelper$Companion$deleteDynamicSo$1(this.$context, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            s.u0(obj);
            String str = NativeSoLoaderHelper.f1933a;
            NativeSoLoaderHelper.Companion.e(this.$context);
            return d.f30009a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super d> cVar) {
        return ((NativeSoLoaderHelper$Companion$deleteDynamicSo$1) create(wVar, cVar)).invokeSuspend(d.f30009a);
    }
}
