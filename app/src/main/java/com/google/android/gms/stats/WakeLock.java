package com.google.android.gms.stats;

import aj.b;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import c8.a;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.common.util.WorkSourceUtil;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.stats.zzb;
import com.google.android.gms.internal.stats.zzh;
import com.google.android.gms.internal.stats.zzi;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-stats@@17.0.1 */
@ShowFirstParty
@KeepForSdk
/* loaded from: classes2.dex */
public class WakeLock {

    /* renamed from: o  reason: collision with root package name */
    public static final long f11961o = TimeUnit.DAYS.toMillis(366);

    /* renamed from: p  reason: collision with root package name */
    public static volatile ScheduledExecutorService f11962p = null;

    /* renamed from: q  reason: collision with root package name */
    public static final Object f11963q = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Object f11964a;

    /* renamed from: b  reason: collision with root package name */
    public final PowerManager.WakeLock f11965b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public ScheduledFuture f11966d;

    /* renamed from: e  reason: collision with root package name */
    public long f11967e;

    /* renamed from: f  reason: collision with root package name */
    public final HashSet f11968f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f11969g;

    /* renamed from: h  reason: collision with root package name */
    public zzb f11970h;

    /* renamed from: i  reason: collision with root package name */
    public final DefaultClock f11971i;

    /* renamed from: j  reason: collision with root package name */
    public final String f11972j;

    /* renamed from: k  reason: collision with root package name */
    public final Context f11973k;

    /* renamed from: l  reason: collision with root package name */
    public final HashMap f11974l;

    /* renamed from: m  reason: collision with root package name */
    public final AtomicInteger f11975m;

    /* renamed from: n  reason: collision with root package name */
    public final ScheduledExecutorService f11976n;

    static {
        new b(0);
    }

    @KeepForSdk
    public WakeLock(Context context) {
        String str;
        String packageName = context.getPackageName();
        this.f11964a = new Object();
        this.c = 0;
        this.f11968f = new HashSet();
        this.f11969g = true;
        this.f11971i = DefaultClock.f11371a;
        this.f11974l = new HashMap();
        this.f11975m = new AtomicInteger(0);
        Preconditions.g("WakeLock: wakeLockName must not be empty", "wake:com.google.firebase.iid.WakeLockHolder");
        this.f11973k = context.getApplicationContext();
        WorkSource workSource = null;
        this.f11970h = null;
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            if ("wake:com.google.firebase.iid.WakeLockHolder".length() != 0) {
                str = "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder");
            } else {
                str = new String("*gcore*:");
            }
            this.f11972j = str;
        } else {
            this.f11972j = "wake:com.google.firebase.iid.WakeLockHolder";
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            this.f11965b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
            if (WorkSourceUtil.a(context)) {
                packageName = Strings.a(packageName) ? context.getPackageName() : packageName;
                if (context.getPackageManager() != null && packageName != null) {
                    try {
                        ApplicationInfo a10 = Wrappers.a(context).a(0, packageName);
                        if (a10 == null) {
                            "Could not get applicationInfo from package: ".concat(packageName);
                        } else {
                            int i10 = a10.uid;
                            workSource = new WorkSource();
                            Method method = WorkSourceUtil.f11383b;
                            if (method != null) {
                                try {
                                    method.invoke(workSource, Integer.valueOf(i10), packageName);
                                } catch (Exception e10) {
                                    Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
                                }
                            } else {
                                Method method2 = WorkSourceUtil.f11382a;
                                if (method2 != null) {
                                    try {
                                        method2.invoke(workSource, Integer.valueOf(i10));
                                    } catch (Exception e11) {
                                        Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e11);
                                    }
                                }
                            }
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        "Could not find package: ".concat(packageName);
                    }
                }
                if (workSource != null) {
                    try {
                        this.f11965b.setWorkSource(workSource);
                    } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e12) {
                        Log.wtf("WakeLock", e12.toString());
                    }
                }
            }
            ScheduledExecutorService scheduledExecutorService = f11962p;
            if (scheduledExecutorService == null) {
                synchronized (f11963q) {
                    scheduledExecutorService = f11962p;
                    if (scheduledExecutorService == null) {
                        zzh.zza();
                        scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f11962p = scheduledExecutorService;
                    }
                }
            }
            this.f11976n = scheduledExecutorService;
            return;
        }
        StringBuilder sb2 = new StringBuilder(29);
        sb2.append((CharSequence) "expected a non-null reference", 0, 29);
        throw new zzi(sb2.toString());
    }

    @KeepForSdk
    public final void a(long j10) {
        this.f11975m.incrementAndGet();
        long j11 = Long.MAX_VALUE;
        long max = Math.max(Math.min(Long.MAX_VALUE, f11961o), 1L);
        if (j10 > 0) {
            max = Math.min(j10, max);
        }
        synchronized (this.f11964a) {
            try {
                if (!b()) {
                    this.f11970h = zzb.zza(false, null);
                    this.f11965b.acquire();
                    this.f11971i.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.c++;
                if (this.f11969g) {
                    TextUtils.isEmpty(null);
                }
                a aVar = (a) this.f11974l.get(null);
                if (aVar == null) {
                    aVar = new a(0);
                    this.f11974l.put(null, aVar);
                }
                aVar.f5666a++;
                this.f11971i.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (Long.MAX_VALUE - elapsedRealtime > max) {
                    j11 = elapsedRealtime + max;
                }
                if (j11 > this.f11967e) {
                    this.f11967e = j11;
                    ScheduledFuture scheduledFuture = this.f11966d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f11966d = this.f11976n.schedule(new Runnable() { // from class: com.google.android.gms.stats.zza
                        @Override // java.lang.Runnable
                        public final void run() {
                            WakeLock wakeLock = WakeLock.this;
                            synchronized (wakeLock.f11964a) {
                                if (wakeLock.b()) {
                                    String.valueOf(wakeLock.f11972j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **");
                                    wakeLock.d();
                                    if (wakeLock.b()) {
                                        wakeLock.c = 1;
                                        wakeLock.e();
                                    }
                                }
                            }
                        }
                    }, max, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @KeepForSdk
    public final boolean b() {
        boolean z10;
        synchronized (this.f11964a) {
            if (this.c > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    @KeepForSdk
    public final void c() {
        if (this.f11975m.decrementAndGet() < 0) {
            String.valueOf(this.f11972j).concat(" release without a matched acquire!");
        }
        synchronized (this.f11964a) {
            try {
                if (this.f11969g) {
                    TextUtils.isEmpty(null);
                }
                if (this.f11974l.containsKey(null)) {
                    a aVar = (a) this.f11974l.get(null);
                    if (aVar != null) {
                        int i10 = aVar.f5666a - 1;
                        aVar.f5666a = i10;
                        if (i10 == 0) {
                            this.f11974l.remove(null);
                        }
                    }
                } else {
                    String.valueOf(this.f11972j).concat(" counter does not exist");
                }
                e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        HashSet hashSet = this.f11968f;
        if (hashSet.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        hashSet.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        zze zzeVar = (zze) arrayList.get(0);
        throw null;
    }

    public final void e() {
        synchronized (this.f11964a) {
            if (!b()) {
                return;
            }
            if (this.f11969g) {
                int i10 = this.c - 1;
                this.c = i10;
                if (i10 > 0) {
                    return;
                }
            } else {
                this.c = 0;
            }
            d();
            for (a aVar : this.f11974l.values()) {
                aVar.f5666a = 0;
            }
            this.f11974l.clear();
            ScheduledFuture scheduledFuture = this.f11966d;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                this.f11966d = null;
                this.f11967e = 0L;
            }
            if (this.f11965b.isHeld()) {
                try {
                    this.f11965b.release();
                    if (this.f11970h != null) {
                        this.f11970h = null;
                    }
                } catch (RuntimeException e10) {
                    if (e10.getClass().equals(RuntimeException.class)) {
                        String.valueOf(this.f11972j).concat(" failed to release!");
                        if (this.f11970h != null) {
                            this.f11970h = null;
                        }
                    } else {
                        throw e10;
                    }
                }
            } else {
                String.valueOf(this.f11972j).concat(" should be held!");
            }
        }
    }
}
