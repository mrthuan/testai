package h5;

import android.content.Context;
import androidx.activity.s;
import cg.p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.j0;
import kotlinx.coroutines.w;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: UpgradeHelper.kt */
@wf.c(c = "com.drojian.upgradelib.helper.UpgradeHelper$preLoadUpdateInfo$1$1", f = "UpgradeHelper.kt", l = {50}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class h extends SuspendLambda implements p<w, kotlin.coroutines.c<? super tf.d>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f18027a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f18028b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, int i10, kotlin.coroutines.c<? super h> cVar) {
        super(2, cVar);
        this.f18028b = context;
        this.c = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new h(this.f18028b, this.c, cVar);
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super tf.d> cVar) {
        return ((h) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f18027a;
        if (i10 != 0) {
            if (i10 == 1) {
                s.u0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            s.u0(obj);
            String valueOf = String.valueOf(this.c);
            this.f18027a = 1;
            if (t0.w0(j0.f20207b, new e5.e(this.f18028b, valueOf, null), this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return tf.d.f30009a;
    }
}
