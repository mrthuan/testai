package pdf.pdfreader.viewer.editor.free.feature.app_widget.helper;

import androidx.activity.s;
import cg.l;
import cg.p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.j;
import pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.dialog.ShortcutType;

/* compiled from: ShortcutRationaleHelper.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.ShortcutRationaleHelper$shortcutRationaleDialogFlow$1$1$onAllowClicked$2", f = "ShortcutRationaleHelper.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ShortcutRationaleHelper$shortcutRationaleDialogFlow$1$1$onAllowClicked$2 extends SuspendLambda implements p<androidx.activity.result.a, kotlin.coroutines.c<? super tf.d>, Object> {
    final /* synthetic */ j<Boolean> $$this$callbackFlow;
    final /* synthetic */ androidx.appcompat.app.c $activity;
    final /* synthetic */ ShortcutType $shortcutType;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ShortcutRationaleHelper$shortcutRationaleDialogFlow$1$1$onAllowClicked$2(f fVar, androidx.appcompat.app.c cVar, ShortcutType shortcutType, j<? super Boolean> jVar, kotlin.coroutines.c<? super ShortcutRationaleHelper$shortcutRationaleDialogFlow$1$1$onAllowClicked$2> cVar2) {
        super(2, cVar2);
        this.this$0 = fVar;
        this.$activity = cVar;
        this.$shortcutType = shortcutType;
        this.$$this$callbackFlow = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new ShortcutRationaleHelper$shortcutRationaleDialogFlow$1$1$onAllowClicked$2(this.this$0, this.$activity, this.$shortcutType, this.$$this$callbackFlow, cVar);
    }

    @Override // cg.p
    public final Object invoke(androidx.activity.result.a aVar, kotlin.coroutines.c<? super tf.d> cVar) {
        return ((ShortcutRationaleHelper$shortcutRationaleDialogFlow$1$1$onAllowClicked$2) create(aVar, cVar)).invokeSuspend(tf.d.f30009a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            s.u0(obj);
            f fVar = this.this$0;
            androidx.appcompat.app.c cVar = this.$activity;
            ShortcutType shortcutType = this.$shortcutType;
            final j<Boolean> jVar = this.$$this$callbackFlow;
            f.a(fVar, cVar, shortcutType, new l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.ShortcutRationaleHelper$shortcutRationaleDialogFlow$1$1$onAllowClicked$2.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // cg.l
                public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                    invoke(bool.booleanValue());
                    return tf.d.f30009a;
                }

                public final void invoke(boolean z10) {
                    jVar.v(Boolean.valueOf(z10));
                }
            });
            return tf.d.f30009a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
