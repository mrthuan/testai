package ma;

import android.util.Log;

/* compiled from: CrashlyticsController.java */
/* loaded from: classes2.dex */
public final class q implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f21927a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Throwable f21928b;
    public final /* synthetic */ Thread c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ com.google.firebase.crashlytics.internal.common.b f21929d;

    public q(com.google.firebase.crashlytics.internal.common.b bVar, long j10, Throwable th2, Thread thread) {
        this.f21929d = bVar;
        this.f21927a = j10;
        this.f21928b = th2;
        this.c = thread;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        com.google.firebase.crashlytics.internal.common.b bVar = this.f21929d;
        com.google.firebase.crashlytics.internal.common.c cVar = bVar.f13528m;
        if (cVar != null && cVar.f13536e.get()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            long j10 = this.f21927a / 1000;
            String e10 = bVar.e();
            if (e10 == null) {
                return;
            }
            Throwable th2 = this.f21928b;
            Thread thread = this.c;
            i0 i0Var = bVar.f13527l;
            i0Var.getClass();
            Log.isLoggable("FirebaseCrashlytics", 2);
            i0Var.d(th2, thread, e10, "error", j10, false);
        }
    }
}
