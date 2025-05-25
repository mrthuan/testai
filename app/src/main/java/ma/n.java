package ma;

import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: CrashlyticsController.java */
/* loaded from: classes2.dex */
public final class n implements Callable<Task<Void>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Boolean f21921a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ o f21922b;

    public n(o oVar, Boolean bool) {
        this.f21922b = oVar;
        this.f21921a = bool;
    }

    @Override // java.util.concurrent.Callable
    public final Task<Void> call() {
        Boolean bool = this.f21921a;
        boolean booleanValue = bool.booleanValue();
        o oVar = this.f21922b;
        if (!booleanValue) {
            Log.isLoggable("FirebaseCrashlytics", 2);
            com.google.firebase.crashlytics.internal.common.b bVar = oVar.f21924b;
            for (File file : ra.d.f(bVar.f13522g.f29496b.listFiles(com.google.firebase.crashlytics.internal.common.b.f13516r))) {
                file.delete();
            }
            com.google.firebase.crashlytics.internal.common.b bVar2 = oVar.f21924b;
            ra.d dVar = bVar2.f13527l.f21908b.f29494b;
            ra.c.a(ra.d.f(dVar.f29497d.listFiles()));
            ra.c.a(ra.d.f(dVar.f29498e.listFiles()));
            ra.c.a(ra.d.f(dVar.f29499f.listFiles()));
            bVar2.f13531p.d(null);
            return Tasks.e(null);
        }
        Log.isLoggable("FirebaseCrashlytics", 3);
        boolean booleanValue2 = bool.booleanValue();
        a0 a0Var = oVar.f21924b.f13518b;
        if (booleanValue2) {
            a0Var.f21877h.d(null);
            Executor executor = oVar.f21924b.f13520e.f21901a;
            return oVar.f21923a.p(executor, new m(this, executor));
        }
        a0Var.getClass();
        throw new IllegalStateException("An invalid data collection token was used.");
    }
}
