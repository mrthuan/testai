package pdf.pdfreader.viewer.editor.free.feature.app_widget.helper;

import androidx.activity.s;
import cg.q;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.d;
import pdf.pdfreader.viewer.editor.free.utils.n0;

/* compiled from: ShortcutHelper.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.ShortcutHelper$Companion$tryInstallIcon$4", f = "ShortcutHelper.kt", l = {ShapeTypes.FLOW_CHART_DELAY}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ShortcutHelper$Companion$tryInstallIcon$4 extends SuspendLambda implements q<kotlinx.coroutines.flow.d<? super d>, Throwable, kotlin.coroutines.c<? super tf.d>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public ShortcutHelper$Companion$tryInstallIcon$4(kotlin.coroutines.c<? super ShortcutHelper$Companion$tryInstallIcon$4> cVar) {
        super(3, cVar);
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
            Objects.toString((Throwable) this.L$1);
            String str = n0.f28727a;
            d.a aVar = d.a.f24813a;
            this.L$0 = null;
            this.label = 1;
            if (((kotlinx.coroutines.flow.d) this.L$0).emit(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return tf.d.f30009a;
    }

    @Override // cg.q
    public final Object invoke(kotlinx.coroutines.flow.d<? super d> dVar, Throwable th2, kotlin.coroutines.c<? super tf.d> cVar) {
        ShortcutHelper$Companion$tryInstallIcon$4 shortcutHelper$Companion$tryInstallIcon$4 = new ShortcutHelper$Companion$tryInstallIcon$4(cVar);
        shortcutHelper$Companion$tryInstallIcon$4.L$0 = dVar;
        shortcutHelper$Companion$tryInstallIcon$4.L$1 = th2;
        return shortcutHelper$Companion$tryInstallIcon$4.invokeSuspend(tf.d.f30009a);
    }
}
