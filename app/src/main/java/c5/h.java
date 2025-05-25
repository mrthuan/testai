package c5;

import android.app.Activity;
import androidx.activity.s;
import cg.p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.j0;
import kotlinx.coroutines.w;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: SideUpgradeChecker.kt */
@wf.c(c = "com.drojian.upgradelib.SideUpgradeChecker$checkUpgrade$1$1", f = "SideUpgradeChecker.kt", l = {38}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class h extends SuspendLambda implements p<w, kotlin.coroutines.c<? super tf.d>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f5577a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ i f5578b;
    public final /* synthetic */ Activity c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, Activity activity, kotlin.coroutines.c<? super h> cVar) {
        super(2, cVar);
        this.f5578b = iVar;
        this.c = activity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new h(this.f5578b, this.c, cVar);
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super tf.d> cVar) {
        return ((h) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i10;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = this.f5577a;
        i iVar = this.f5578b;
        if (i11 != 0) {
            if (i11 == 1) {
                s.u0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            s.u0(obj);
            o9.a aVar = iVar.d().f18038d;
            if (aVar == null) {
                i10 = 0;
            } else {
                i10 = aVar.f22746a;
            }
            String valueOf = String.valueOf(i10);
            this.f5577a = 1;
            obj = t0.w0(j0.f20207b, new e5.e(this.c, valueOf, null), this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        iVar.l(((Boolean) obj).booleanValue());
        return tf.d.f30009a;
    }
}
