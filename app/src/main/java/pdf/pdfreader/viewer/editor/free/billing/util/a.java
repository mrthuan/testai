package pdf.pdfreader.viewer.editor.free.billing.util;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import kotlin.Result;
import kotlin.coroutines.e;
import kotlin.jvm.internal.g;

/* compiled from: IapServerLogUtil.kt */
/* loaded from: classes3.dex */
public final class a<TResult> implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.c<String> f24063a;

    public a(e eVar) {
        this.f24063a = eVar;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task<String> task) {
        g.e(task, "task");
        boolean o10 = task.o();
        kotlin.coroutines.c<String> cVar = this.f24063a;
        if (o10) {
            try {
                cVar.resumeWith(Result.m13constructorimpl(task.k().toString()));
                return;
            } catch (Exception unused) {
                cVar.resumeWith(Result.m13constructorimpl(""));
                return;
            }
        }
        cVar.resumeWith(Result.m13constructorimpl(""));
    }
}
