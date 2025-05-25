package pdf.pdfreader.viewer.editor.free.feature.app_widget.helper;

import androidx.activity.s;
import androidx.lifecycle.Lifecycle;
import cg.l;
import cg.p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.j;
import pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.dialog.ShortcutType;

/* compiled from: ShortcutRationaleHelper.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.ShortcutRationaleHelper$shortcutRationaleDialogFlow$1$job$1", f = "ShortcutRationaleHelper.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ShortcutRationaleHelper$shortcutRationaleDialogFlow$1$job$1 extends SuspendLambda implements p<Lifecycle.Event, kotlin.coroutines.c<? super tf.d>, Object> {
    final /* synthetic */ j<Boolean> $$this$callbackFlow;
    final /* synthetic */ androidx.appcompat.app.c $activity;
    final /* synthetic */ ShortcutType $shortcutType;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ShortcutRationaleHelper$shortcutRationaleDialogFlow$1$job$1(f fVar, androidx.appcompat.app.c cVar, ShortcutType shortcutType, j<? super Boolean> jVar, kotlin.coroutines.c<? super ShortcutRationaleHelper$shortcutRationaleDialogFlow$1$job$1> cVar2) {
        super(2, cVar2);
        this.this$0 = fVar;
        this.$activity = cVar;
        this.$shortcutType = shortcutType;
        this.$$this$callbackFlow = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        ShortcutRationaleHelper$shortcutRationaleDialogFlow$1$job$1 shortcutRationaleHelper$shortcutRationaleDialogFlow$1$job$1 = new ShortcutRationaleHelper$shortcutRationaleDialogFlow$1$job$1(this.this$0, this.$activity, this.$shortcutType, this.$$this$callbackFlow, cVar);
        shortcutRationaleHelper$shortcutRationaleDialogFlow$1$job$1.L$0 = obj;
        return shortcutRationaleHelper$shortcutRationaleDialogFlow$1$job$1;
    }

    @Override // cg.p
    public final Object invoke(Lifecycle.Event event, kotlin.coroutines.c<? super tf.d> cVar) {
        return ((ShortcutRationaleHelper$shortcutRationaleDialogFlow$1$job$1) create(event, cVar)).invokeSuspend(tf.d.f30009a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            s.u0(obj);
            if (((Lifecycle.Event) this.L$0) == Lifecycle.Event.ON_RESUME) {
                final f fVar = this.this$0;
                if (!fVar.f24817b) {
                    androidx.appcompat.app.c cVar = this.$activity;
                    ShortcutType shortcutType = this.$shortcutType;
                    final j<Boolean> jVar = this.$$this$callbackFlow;
                    f.a(fVar, cVar, shortcutType, new l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.ShortcutRationaleHelper$shortcutRationaleDialogFlow$1$job$1.1
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
                            if (z10 && f.this.c.getAndSet(false)) {
                                jVar.v(Boolean.TRUE);
                                try {
                                    pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.dialog.a aVar = f.this.f24816a;
                                    if (aVar != null) {
                                        aVar.dismiss();
                                    }
                                } catch (Exception unused) {
                                }
                                f.this.f24817b = true;
                            }
                        }
                    });
                }
            }
            return tf.d.f30009a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
