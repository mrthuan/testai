package ka;

import android.os.Bundle;
import android.util.Log;
import androidx.core.content.e;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: BlockingAnalyticsEventLogger.java */
/* loaded from: classes2.dex */
public final class c implements b, a {

    /* renamed from: a  reason: collision with root package name */
    public final e f19727a;

    /* renamed from: b  reason: collision with root package name */
    public final TimeUnit f19728b;
    public final Object c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public CountDownLatch f19729d;

    public c(e eVar, TimeUnit timeUnit) {
        this.f19727a = eVar;
        this.f19728b = timeUnit;
    }

    @Override // ka.b
    public final void a(Bundle bundle, String str) {
        CountDownLatch countDownLatch = this.f19729d;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }

    @Override // ka.a
    public final void h(Bundle bundle) {
        synchronized (this.c) {
            Objects.toString(bundle);
            Log.isLoggable("FirebaseCrashlytics", 2);
            this.f19729d = new CountDownLatch(1);
            this.f19727a.h(bundle);
            Log.isLoggable("FirebaseCrashlytics", 2);
            try {
                if (this.f19729d.await((long) OS2WindowsMetricsTable.WEIGHT_CLASS_MEDIUM, this.f19728b)) {
                    Log.isLoggable("FirebaseCrashlytics", 2);
                }
            } catch (InterruptedException unused) {
            }
            this.f19729d = null;
        }
    }
}
