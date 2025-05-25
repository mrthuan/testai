package pdf.pdfreader.viewer.editor.free.feature.app_widget.helper;

import androidx.activity.s;
import cg.p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ShortcutHelper.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.ShortcutHelper$Companion$tryInstallIcon$2", f = "ShortcutHelper.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ShortcutHelper$Companion$tryInstallIcon$2 extends SuspendLambda implements p<kotlinx.coroutines.flow.d<? super d>, kotlin.coroutines.c<? super tf.d>, Object> {
    int label;

    public ShortcutHelper$Companion$tryInstallIcon$2(kotlin.coroutines.c<? super ShortcutHelper$Companion$tryInstallIcon$2> cVar) {
        super(2, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new ShortcutHelper$Companion$tryInstallIcon$2(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            s.u0(obj);
            return tf.d.f30009a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // cg.p
    public final Object invoke(kotlinx.coroutines.flow.d<? super d> dVar, kotlin.coroutines.c<? super tf.d> cVar) {
        return ((ShortcutHelper$Companion$tryInstallIcon$2) create(dVar, cVar)).invokeSuspend(tf.d.f30009a);
    }
}
