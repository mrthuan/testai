package u9;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.play:review@@2.0.1 */
/* loaded from: classes2.dex */
public final class f extends v9.g {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f30268b;
    public final /* synthetic */ h c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.c = hVar;
        this.f30268b = taskCompletionSource2;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [android.os.IInterface, v9.d] */
    @Override // v9.g
    public final void a() {
        TaskCompletionSource taskCompletionSource = this.f30268b;
        h hVar = this.c;
        try {
            hVar.f30271a.f30799m.Z(hVar.f30272b, i.a(), new g(hVar, taskCompletionSource));
        } catch (RemoteException e10) {
            v9.f fVar = h.c;
            Object[] objArr = {hVar.f30272b};
            fVar.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                v9.f.b(fVar.f30779a, "error requesting in-app review for %s", objArr);
            }
            taskCompletionSource.c(new RuntimeException(e10));
        }
    }
}
