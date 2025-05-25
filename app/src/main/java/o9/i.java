package o9;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes2.dex */
public final class i extends p9.o {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f22769b;
    public final /* synthetic */ String c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ m f22770d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, m mVar, String str) {
        super(taskCompletionSource);
        this.f22770d = mVar;
        this.f22769b = taskCompletionSource2;
        this.c = str;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [p9.h, android.os.IInterface] */
    @Override // p9.o
    public final void a() {
        TaskCompletionSource taskCompletionSource = this.f22769b;
        m mVar = this.f22770d;
        try {
            mVar.f22776a.f23838m.X(mVar.f22777b, m.b(), new k(mVar, taskCompletionSource));
        } catch (RemoteException e10) {
            m.f22774e.b(e10, "completeUpdate(%s)", this.c);
            taskCompletionSource.c(new RuntimeException(e10));
        }
    }
}
