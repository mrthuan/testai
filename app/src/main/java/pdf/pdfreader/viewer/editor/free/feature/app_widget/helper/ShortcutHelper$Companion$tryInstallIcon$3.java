package pdf.pdfreader.viewer.editor.free.feature.app_widget.helper;

import android.graphics.drawable.Drawable;
import androidx.activity.s;
import cg.p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.e0;
import kotlinx.coroutines.y0;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.d;
import pdf.pdfreader.viewer.editor.free.utils.event.WidgetEventCenter;
import pdf.pdfreader.viewer.editor.free.utils.j1;

/* compiled from: ShortcutHelper.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.ShortcutHelper$Companion$tryInstallIcon$3", f = "ShortcutHelper.kt", l = {109}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ShortcutHelper$Companion$tryInstallIcon$3 extends SuspendLambda implements p<d, kotlin.coroutines.c<? super tf.d>, Object> {
    final /* synthetic */ androidx.appcompat.app.c $activity;
    final /* synthetic */ cg.a<tf.d> $onAddDone;
    final /* synthetic */ cg.a<y0> $showRationale;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ShortcutHelper$Companion$tryInstallIcon$3(androidx.appcompat.app.c cVar, cg.a<tf.d> aVar, cg.a<? extends y0> aVar2, kotlin.coroutines.c<? super ShortcutHelper$Companion$tryInstallIcon$3> cVar2) {
        super(2, cVar2);
        this.$activity = cVar;
        this.$onAddDone = aVar;
        this.$showRationale = aVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        ShortcutHelper$Companion$tryInstallIcon$3 shortcutHelper$Companion$tryInstallIcon$3 = new ShortcutHelper$Companion$tryInstallIcon$3(this.$activity, this.$onAddDone, this.$showRationale, cVar);
        shortcutHelper$Companion$tryInstallIcon$3.L$0 = obj;
        return shortcutHelper$Companion$tryInstallIcon$3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        d dVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                dVar = (d) this.L$0;
                s.u0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            s.u0(obj);
            d dVar2 = (d) this.L$0;
            this.L$0 = dVar2;
            this.label = 1;
            if (e0.a(50L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            dVar = dVar2;
        }
        if (kotlin.jvm.internal.g.a(dVar, d.b.f24814a)) {
            Drawable drawable = androidx.core.content.a.getDrawable(this.$activity, R.drawable.ic_copy_success);
            androidx.appcompat.app.c cVar = this.$activity;
            j1.d(cVar, cVar.getString(R.string.arg_res_0x7f130035), drawable);
            cg.a<tf.d> aVar = this.$onAddDone;
            if (aVar != null) {
                aVar.invoke();
            }
        } else if (kotlin.jvm.internal.g.a(dVar, d.a.f24813a)) {
            androidx.appcompat.app.c cVar2 = this.$activity;
            tf.c cVar3 = WidgetEventCenter.f28682a;
            tn.a.d(cVar2, "permission", "cutsperm_fail_show", WidgetEventCenter.c, false);
        } else if (kotlin.jvm.internal.g.a(dVar, d.c.f24815a)) {
            this.$showRationale.invoke();
        }
        return tf.d.f30009a;
    }

    @Override // cg.p
    public final Object invoke(d dVar, kotlin.coroutines.c<? super tf.d> cVar) {
        return ((ShortcutHelper$Companion$tryInstallIcon$3) create(dVar, cVar)).invokeSuspend(tf.d.f30009a);
    }
}
