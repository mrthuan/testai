package ma;

import android.util.Log;
import java.io.File;
import java.util.concurrent.Callable;

/* compiled from: CrashlyticsCore.java */
/* loaded from: classes2.dex */
public final class x implements Callable<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ w f21954a;

    public x(w wVar) {
        this.f21954a = wVar;
    }

    @Override // java.util.concurrent.Callable
    public final Boolean call() {
        boolean z10;
        com.google.firebase.crashlytics.internal.common.b bVar = this.f21954a.f21945h;
        w4.a aVar = bVar.c;
        ra.d dVar = (ra.d) aVar.f30971b;
        dVar.getClass();
        if (!new File(dVar.f29496b, (String) aVar.f30970a).exists()) {
            String e10 = bVar.e();
            if (e10 == null || !bVar.f13525j.d(e10)) {
                z10 = false;
                return Boolean.valueOf(z10);
            }
        } else {
            Log.isLoggable("FirebaseCrashlytics", 2);
            ra.d dVar2 = (ra.d) aVar.f30971b;
            dVar2.getClass();
            new File(dVar2.f29496b, (String) aVar.f30970a).delete();
        }
        z10 = true;
        return Boolean.valueOf(z10);
    }
}
