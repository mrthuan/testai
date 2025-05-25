package i7;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.util.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
@VisibleForTesting
/* loaded from: classes.dex */
public final class a extends Thread {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<AdvertisingIdClient> f18472a;

    /* renamed from: b  reason: collision with root package name */
    public final long f18473b;
    public final CountDownLatch c = new CountDownLatch(1);

    /* renamed from: d  reason: collision with root package name */
    public boolean f18474d = false;

    public a(AdvertisingIdClient advertisingIdClient, long j10) {
        this.f18472a = new WeakReference<>(advertisingIdClient);
        this.f18473b = j10;
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        AdvertisingIdClient advertisingIdClient;
        WeakReference<AdvertisingIdClient> weakReference = this.f18472a;
        try {
            if (!this.c.await(this.f18473b, TimeUnit.MILLISECONDS) && (advertisingIdClient = weakReference.get()) != null) {
                advertisingIdClient.zza();
                this.f18474d = true;
            }
        } catch (InterruptedException unused) {
            AdvertisingIdClient advertisingIdClient2 = weakReference.get();
            if (advertisingIdClient2 != null) {
                advertisingIdClient2.zza();
                this.f18474d = true;
            }
        }
    }
}
