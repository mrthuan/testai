package ma;

import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: CrashlyticsController.java */
/* loaded from: classes2.dex */
public final class l implements Callable<Task<Void>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f21914a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Throwable f21915b;
    public final /* synthetic */ Thread c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ta.f f21916d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ boolean f21917e = false;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ com.google.firebase.crashlytics.internal.common.b f21918f;

    public l(com.google.firebase.crashlytics.internal.common.b bVar, long j10, Throwable th2, Thread thread, ta.f fVar) {
        this.f21918f = bVar;
        this.f21914a = j10;
        this.f21915b = th2;
        this.c = thread;
        this.f21916d = fVar;
    }

    @Override // java.util.concurrent.Callable
    public final Task<Void> call() {
        long j10 = this.f21914a;
        long j11 = j10 / 1000;
        com.google.firebase.crashlytics.internal.common.b bVar = this.f21918f;
        String e10 = bVar.e();
        if (e10 == null) {
            return Tasks.e(null);
        }
        w4.a aVar = bVar.c;
        aVar.getClass();
        try {
            ra.d dVar = (ra.d) aVar.f30971b;
            dVar.getClass();
            new File(dVar.f29496b, (String) aVar.f30970a).createNewFile();
        } catch (IOException unused) {
        }
        Throwable th2 = this.f21915b;
        Thread thread = this.c;
        i0 i0Var = bVar.f13527l;
        i0Var.getClass();
        Log.isLoggable("FirebaseCrashlytics", 2);
        i0Var.d(th2, thread, e10, "crash", j11, true);
        bVar.d(j10);
        ta.f fVar = this.f21916d;
        bVar.c(false, fVar);
        new f(bVar.f13521f);
        com.google.firebase.crashlytics.internal.common.b.a(bVar, f.f21893b);
        if (!bVar.f13518b.b()) {
            return Tasks.e(null);
        }
        Executor executor = bVar.f13520e.f21901a;
        return ((com.google.firebase.crashlytics.internal.settings.a) fVar).f13545i.get().f11978a.p(executor, new k(this, executor, e10));
    }
}
