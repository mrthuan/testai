package pdf.pdfreader.viewer.editor.free.service;

import android.content.Context;
import androidx.activity.s;
import cg.p;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.j0;
import kotlinx.coroutines.w;
import kotlinx.coroutines.x;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import tf.d;
import wf.c;
import z9.e;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LanguageRecallUtils.kt */
@c(c = "pdf.pdfreader.viewer.editor.free.service.LanguageRecallUtils$requestFCMRecall$2", f = "LanguageRecallUtils.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class LanguageRecallUtils$requestFCMRecall$2 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super d>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ List<Long> $fcmTriggerTime;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageRecallUtils$requestFCMRecall$2(List<Long> list, Context context, kotlin.coroutines.c<? super LanguageRecallUtils$requestFCMRecall$2> cVar) {
        super(2, cVar);
        this.$fcmTriggerTime = list;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new LanguageRecallUtils$requestFCMRecall$2(this.$fcmTriggerTime, this.$context, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FirebaseMessaging firebaseMessaging;
        Task<String> task;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            s.u0(obj);
            if (b.f26567j) {
                b.f26559a.getClass();
                ea.a.p("QWUoYR9s", "W4E8SkoP");
                return d.f30009a;
            }
            b bVar = b.f26559a;
            b.f26567j = true;
            com.google.firebase.messaging.a aVar = FirebaseMessaging.f13641n;
            synchronized (FirebaseMessaging.class) {
                firebaseMessaging = FirebaseMessaging.getInstance(e.c());
            }
            cb.a aVar2 = firebaseMessaging.f13645b;
            if (aVar2 != null) {
                task = aVar2.b();
            } else {
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                firebaseMessaging.f13650h.execute(new l1.a(5, firebaseMessaging, taskCompletionSource));
                task = taskCompletionSource.f11978a;
            }
            final List<Long> list = this.$fcmTriggerTime;
            final Context context = this.$context;
            task.b(new OnCompleteListener() { // from class: pdf.pdfreader.viewer.editor.free.service.a
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task2) {
                    boolean z10;
                    List list2 = list;
                    Context context2 = context;
                    if (!task2.o()) {
                        b bVar2 = b.f26559a;
                        b.f26567j = false;
                        return;
                    }
                    String str = (String) task2.k();
                    if (str != null) {
                        if (str.length() > 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            t0.d0(x.a(j0.f20207b), null, null, new LanguageRecallUtils$requestFCMRecall$2$1$1(list2, str, context2, null), 3);
                            return;
                        }
                    }
                    b bVar3 = b.f26559a;
                    b.f26567j = false;
                }
            });
            return d.f30009a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super d> cVar) {
        return ((LanguageRecallUtils$requestFCMRecall$2) create(wVar, cVar)).invokeSuspend(d.f30009a);
    }
}
