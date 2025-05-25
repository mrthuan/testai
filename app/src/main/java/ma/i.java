package ma;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Callable;

/* compiled from: CrashlyticsBackgroundWorker.java */
/* loaded from: classes2.dex */
public final class i implements Continuation<Void, Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Callable f21906a;

    public i(Callable callable) {
        this.f21906a = callable;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task<Void> task) {
        return this.f21906a.call();
    }
}
