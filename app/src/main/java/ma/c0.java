package ma;

import android.util.Log;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: ExecutorUtils.java */
/* loaded from: classes2.dex */
public final class c0 extends c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f21883a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ExecutorService f21884b;
    public final /* synthetic */ long c = 2;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ TimeUnit f21885d;

    public c0(String str, ExecutorService executorService, TimeUnit timeUnit) {
        this.f21883a = str;
        this.f21884b = executorService;
        this.f21885d = timeUnit;
    }

    @Override // ma.c
    public final void a() {
        ExecutorService executorService = this.f21884b;
        try {
            Log.isLoggable("FirebaseCrashlytics", 3);
            executorService.shutdown();
            if (!executorService.awaitTermination(this.c, this.f21885d)) {
                Log.isLoggable("FirebaseCrashlytics", 3);
                executorService.shutdownNow();
            }
        } catch (InterruptedException unused) {
            String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", this.f21883a);
            Log.isLoggable("FirebaseCrashlytics", 3);
            executorService.shutdownNow();
        }
    }
}
