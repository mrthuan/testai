package ma;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Arrays;
import java.util.concurrent.Executor;

/* compiled from: CrashlyticsController.java */
/* loaded from: classes2.dex */
public final class k implements SuccessContinuation<ta.c, Void> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Executor f21912a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f21913b;
    public final /* synthetic */ l c;

    public k(l lVar, Executor executor, String str) {
        this.c = lVar;
        this.f21912a = executor;
        this.f21913b = str;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task<Void> j(ta.c cVar) {
        String str = null;
        if (cVar == null) {
            return Tasks.e(null);
        }
        Task[] taskArr = new Task[2];
        l lVar = this.c;
        taskArr[0] = com.google.firebase.crashlytics.internal.common.b.b(lVar.f21918f);
        i0 i0Var = lVar.f21918f.f13527l;
        if (lVar.f21917e) {
            str = this.f21913b;
        }
        taskArr[1] = i0Var.e(str, this.f21912a);
        return Tasks.f(Arrays.asList(taskArr));
    }
}
