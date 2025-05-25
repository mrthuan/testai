package com.google.android.gms.ads.identifier;

import a6.h;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.common.BlockingServiceConnection;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepForSdkWithMembers;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads_identifier.zze;
import com.google.android.gms.internal.ads_identifier.zzf;
import com.inmobi.commons.core.configs.CrashConfig;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
@KeepForSdk
/* loaded from: classes.dex */
public class AdvertisingIdClient {

    /* renamed from: a  reason: collision with root package name */
    public BlockingServiceConnection f10092a;

    /* renamed from: b  reason: collision with root package name */
    public zzf f10093b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f10094d;

    /* renamed from: e  reason: collision with root package name */
    public i7.a f10095e;

    /* renamed from: f  reason: collision with root package name */
    public final Context f10096f;

    /* renamed from: g  reason: collision with root package name */
    public final long f10097g;

    /* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
    @KeepForSdkWithMembers
    /* loaded from: classes.dex */
    public static final class Info {

        /* renamed from: a  reason: collision with root package name */
        public final String f10098a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f10099b;

        @Deprecated
        public Info(String str, boolean z10) {
            this.f10098a = str;
            this.f10099b = z10;
        }

        public String getId() {
            return this.f10098a;
        }

        public boolean isLimitAdTrackingEnabled() {
            return this.f10099b;
        }

        public String toString() {
            String str = this.f10098a;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 7);
            sb2.append("{");
            sb2.append(str);
            sb2.append("}");
            sb2.append(this.f10099b);
            return sb2.toString();
        }
    }

    @KeepForSdk
    public AdvertisingIdClient(Context context) {
        this(context, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, false, false);
    }

    @VisibleForTesting
    public static void b(Info info, long j10, Throwable th2) {
        if (Math.random() <= 0.0d) {
            String str = "1";
            HashMap h10 = h.h("app_context", "1");
            if (info != null) {
                if (true != info.isLimitAdTrackingEnabled()) {
                    str = PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES;
                }
                h10.put("limit_ad_tracking", str);
                String id2 = info.getId();
                if (id2 != null) {
                    h10.put("ad_id_size", Integer.toString(id2.length()));
                }
            }
            if (th2 != null) {
                h10.put("error", th2.getClass().getName());
            }
            h10.put("tag", "AdvertisingIdClient");
            h10.put("time_spent", Long.toString(j10));
            new a(h10).start();
        }
    }

    @KeepForSdk
    public static Info getAdvertisingIdInfo(Context context) {
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, true, false);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            advertisingIdClient.a(false);
            Info c = advertisingIdClient.c();
            b(c, SystemClock.elapsedRealtime() - elapsedRealtime, null);
            return c;
        } finally {
        }
    }

    @KeepForSdk
    public static boolean getIsAdIdFakeForDebugLogging(Context context) {
        boolean zzd;
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, false, false);
        try {
            advertisingIdClient.a(false);
            Preconditions.i("Calling this from your main thread can lead to deadlock");
            synchronized (advertisingIdClient) {
                if (!advertisingIdClient.c) {
                    synchronized (advertisingIdClient.f10094d) {
                        i7.a aVar = advertisingIdClient.f10095e;
                        if (aVar == null || !aVar.f18474d) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        advertisingIdClient.a(false);
                        if (!advertisingIdClient.c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e10) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e10);
                    }
                }
                Preconditions.j(advertisingIdClient.f10092a);
                Preconditions.j(advertisingIdClient.f10093b);
                try {
                    zzd = advertisingIdClient.f10093b.zzd();
                } catch (RemoteException unused) {
                    throw new IOException("Remote exception");
                }
            }
            advertisingIdClient.d();
            return zzd;
        } finally {
            advertisingIdClient.zza();
        }
    }

    @VisibleForTesting
    public final void a(boolean z10) {
        Preconditions.i("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.c) {
                zza();
            }
            Context context = this.f10096f;
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                int c = GoogleApiAvailabilityLight.f10884b.c(context, 12451000);
                if (c != 0 && c != 2) {
                    throw new IOException("Google Play services not available");
                }
                BlockingServiceConnection blockingServiceConnection = new BlockingServiceConnection();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                if (ConnectionTracker.b().a(context, intent, blockingServiceConnection, 1)) {
                    this.f10092a = blockingServiceConnection;
                    try {
                        this.f10093b = zze.zza(blockingServiceConnection.a(TimeUnit.MILLISECONDS));
                        this.c = true;
                        if (z10) {
                            d();
                        }
                    } catch (InterruptedException unused) {
                        throw new IOException("Interrupted exception");
                    } catch (Throwable th2) {
                        throw new IOException(th2);
                    }
                } else {
                    throw new IOException("Connection failure");
                }
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new GooglePlayServicesNotAvailableException(9);
            }
        }
    }

    public final Info c() {
        Info info;
        Preconditions.i("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.c) {
                synchronized (this.f10094d) {
                    i7.a aVar = this.f10095e;
                    if (aVar == null || !aVar.f18474d) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    a(false);
                    if (!this.c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (Exception e10) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e10);
                }
            }
            Preconditions.j(this.f10092a);
            Preconditions.j(this.f10093b);
            try {
                info = new Info(this.f10093b.zzc(), this.f10093b.zze(true));
            } catch (RemoteException unused) {
                throw new IOException("Remote exception");
            }
        }
        d();
        return info;
    }

    public final void d() {
        synchronized (this.f10094d) {
            i7.a aVar = this.f10095e;
            if (aVar != null) {
                aVar.c.countDown();
                try {
                    this.f10095e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j10 = this.f10097g;
            if (j10 > 0) {
                this.f10095e = new i7.a(this, j10);
            }
        }
    }

    public final void finalize() {
        zza();
        super.finalize();
    }

    @KeepForSdk
    public Info getInfo() {
        return c();
    }

    @KeepForSdk
    public void start() {
        a(true);
    }

    public final void zza() {
        Preconditions.i("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f10096f != null && this.f10092a != null) {
                try {
                    if (this.c) {
                        ConnectionTracker.b().c(this.f10096f, this.f10092a);
                    }
                } catch (Throwable unused) {
                }
                this.c = false;
                this.f10093b = null;
                this.f10092a = null;
            }
        }
    }

    @VisibleForTesting
    public AdvertisingIdClient(Context context, long j10, boolean z10, boolean z11) {
        Context applicationContext;
        this.f10094d = new Object();
        Preconditions.j(context);
        if (z10 && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f10096f = context;
        this.c = false;
        this.f10097g = j10;
    }

    @ShowFirstParty
    @KeepForSdk
    public static void setShouldSkipGmsCoreVersionCheck(boolean z10) {
    }
}
