package c6;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import com.facebook.LoggingBehavior;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.j;
import com.facebook.internal.p;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Timer;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import u5.e;

/* compiled from: ActivityLifecycleTracker.kt */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f5594a = new e();

    /* renamed from: b  reason: collision with root package name */
    public static final String f5595b;
    public static final ScheduledExecutorService c;

    /* renamed from: d  reason: collision with root package name */
    public static final ScheduledExecutorService f5596d;

    /* renamed from: e  reason: collision with root package name */
    public static volatile ScheduledFuture<?> f5597e;

    /* renamed from: f  reason: collision with root package name */
    public static final Object f5598f;

    /* renamed from: g  reason: collision with root package name */
    public static final AtomicInteger f5599g;

    /* renamed from: h  reason: collision with root package name */
    public static volatile k f5600h;

    /* renamed from: i  reason: collision with root package name */
    public static final AtomicBoolean f5601i;

    /* renamed from: j  reason: collision with root package name */
    public static String f5602j;

    /* renamed from: k  reason: collision with root package name */
    public static long f5603k;

    /* renamed from: l  reason: collision with root package name */
    public static int f5604l;

    /* renamed from: m  reason: collision with root package name */
    public static WeakReference<Activity> f5605m;

    /* renamed from: n  reason: collision with root package name */
    public static String f5606n;

    /* compiled from: ActivityLifecycleTracker.kt */
    /* loaded from: classes.dex */
    public static final class a implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.g.e(activity, "activity");
            j.a aVar = com.facebook.internal.j.f9803d;
            j.a.a(LoggingBehavior.APP_EVENTS, e.f5595b, "onActivityCreated");
            int i10 = f.f5607a;
            e.c.execute(new com.facebook.appevents.h(1));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            kotlin.jvm.internal.g.e(activity, "activity");
            j.a aVar = com.facebook.internal.j.f9803d;
            j.a.a(LoggingBehavior.APP_EVENTS, e.f5595b, "onActivityDestroyed");
            e.f5594a.getClass();
            v5.b bVar = v5.b.f30651a;
            if (!k6.a.b(v5.b.class)) {
                try {
                    v5.c a10 = v5.c.f30658f.a();
                    if (!k6.a.b(a10)) {
                        a10.f30663e.remove(Integer.valueOf(activity.hashCode()));
                    }
                } catch (Throwable th2) {
                    k6.a.a(v5.b.class, th2);
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            ScheduledFuture<?> scheduledFuture;
            kotlin.jvm.internal.g.e(activity, "activity");
            j.a aVar = com.facebook.internal.j.f9803d;
            j.a.a(LoggingBehavior.APP_EVENTS, e.f5595b, "onActivityPaused");
            int i10 = f.f5607a;
            e.f5594a.getClass();
            AtomicInteger atomicInteger = e.f5599g;
            if (atomicInteger.decrementAndGet() < 0) {
                atomicInteger.set(0);
            }
            synchronized (e.f5598f) {
                if (e.f5597e != null && (scheduledFuture = e.f5597e) != null) {
                    scheduledFuture.cancel(false);
                }
                e.f5597e = null;
                tf.d dVar = tf.d.f30009a;
            }
            long currentTimeMillis = System.currentTimeMillis();
            String k10 = p.k(activity);
            v5.b bVar = v5.b.f30651a;
            if (!k6.a.b(v5.b.class)) {
                try {
                    if (v5.b.f30655f.get()) {
                        v5.c.f30658f.a().c(activity);
                        v5.f fVar = v5.b.f30653d;
                        if (fVar != null && !k6.a.b(fVar) && fVar.f30676b.get() != null) {
                            try {
                                Timer timer = fVar.c;
                                if (timer != null) {
                                    timer.cancel();
                                }
                                fVar.c = null;
                            } catch (Exception unused) {
                            }
                        }
                        SensorManager sensorManager = v5.b.c;
                        if (sensorManager != null) {
                            sensorManager.unregisterListener(v5.b.f30652b);
                        }
                    }
                } catch (Throwable th2) {
                    k6.a.a(v5.b.class, th2);
                }
            }
            e.c.execute(new c6.a(currentTimeMillis, k10));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            boolean z10;
            ScheduledFuture<?> scheduledFuture;
            kotlin.jvm.internal.g.e(activity, "activity");
            j.a aVar = com.facebook.internal.j.f9803d;
            j.a.a(LoggingBehavior.APP_EVENTS, e.f5595b, "onActivityResumed");
            int i10 = f.f5607a;
            e.f5605m = new WeakReference<>(activity);
            e.f5599g.incrementAndGet();
            e.f5594a.getClass();
            synchronized (e.f5598f) {
                if (e.f5597e != null && (scheduledFuture = e.f5597e) != null) {
                    scheduledFuture.cancel(false);
                }
                e.f5597e = null;
                tf.d dVar = tf.d.f30009a;
            }
            final long currentTimeMillis = System.currentTimeMillis();
            e.f5603k = currentTimeMillis;
            final String k10 = p.k(activity);
            v5.g gVar = v5.b.f30652b;
            boolean z11 = true;
            if (!k6.a.b(v5.b.class)) {
                try {
                    if (v5.b.f30655f.get()) {
                        v5.c.f30658f.a().a(activity);
                        Context applicationContext = activity.getApplicationContext();
                        String b10 = com.facebook.d.b();
                        com.facebook.internal.f b11 = FetchedAppSettingsManager.b(b10);
                        if (b11 != null && b11.f9770f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        v5.b bVar = v5.b.f30651a;
                        if (!z10) {
                            bVar.getClass();
                            k6.a.b(bVar);
                        } else {
                            SensorManager sensorManager = (SensorManager) applicationContext.getSystemService("sensor");
                            if (sensorManager != null) {
                                v5.b.c = sensorManager;
                                Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                                v5.f fVar = new v5.f(activity);
                                v5.b.f30653d = fVar;
                                androidx.privacysandbox.ads.adservices.java.internal.a aVar2 = new androidx.privacysandbox.ads.adservices.java.internal.a(b11, b10);
                                gVar.getClass();
                                if (!k6.a.b(gVar)) {
                                    gVar.f30680a = aVar2;
                                }
                                sensorManager.registerListener(gVar, defaultSensor, 2);
                                if (b11 != null && b11.f9770f) {
                                    fVar.c();
                                }
                            }
                        }
                        bVar.getClass();
                        k6.a.b(bVar);
                    }
                } catch (Throwable th2) {
                    k6.a.a(v5.b.class, th2);
                }
            }
            u5.b bVar2 = u5.b.f30220a;
            if (!k6.a.b(u5.b.class)) {
                try {
                    if (u5.b.f30221b) {
                        CopyOnWriteArraySet copyOnWriteArraySet = u5.d.f30223d;
                        if (!new HashSet(u5.d.a()).isEmpty()) {
                            HashMap hashMap = u5.e.f30226e;
                            e.a.b(activity);
                        }
                    }
                } catch (Exception unused) {
                } catch (Throwable th3) {
                    k6.a.a(u5.b.class, th3);
                }
            }
            f6.d.d(activity);
            String str = e.f5606n;
            if (str == null || !kotlin.text.k.O(str, "ProxyBillingActivity", false)) {
                z11 = false;
            }
            if (z11 && !kotlin.jvm.internal.g.a(k10, "ProxyBillingActivity")) {
                e.f5596d.execute(new b(0));
            }
            final Context applicationContext2 = activity.getApplicationContext();
            e.c.execute(new Runnable() { // from class: c6.c
                @Override // java.lang.Runnable
                public final void run() {
                    Long l10;
                    int i11;
                    k kVar;
                    long j10 = currentTimeMillis;
                    String activityName = k10;
                    Context appContext = applicationContext2;
                    kotlin.jvm.internal.g.e(activityName, "$activityName");
                    k kVar2 = e.f5600h;
                    if (kVar2 != null) {
                        l10 = kVar2.f5621b;
                    } else {
                        l10 = null;
                    }
                    if (e.f5600h == null) {
                        e.f5600h = new k(Long.valueOf(j10), null);
                        String str2 = e.f5602j;
                        kotlin.jvm.internal.g.d(appContext, "appContext");
                        l.b(activityName, str2, appContext);
                    } else if (l10 != null) {
                        long longValue = j10 - l10.longValue();
                        e.f5594a.getClass();
                        com.facebook.internal.f b12 = FetchedAppSettingsManager.b(com.facebook.d.b());
                        if (b12 == null) {
                            i11 = 60;
                        } else {
                            i11 = b12.f9767b;
                        }
                        if (longValue > i11 * 1000) {
                            l.c(activityName, e.f5600h, e.f5602j);
                            String str3 = e.f5602j;
                            kotlin.jvm.internal.g.d(appContext, "appContext");
                            l.b(activityName, str3, appContext);
                            e.f5600h = new k(Long.valueOf(j10), null);
                        } else if (longValue > 1000 && (kVar = e.f5600h) != null) {
                            kVar.f5622d++;
                        }
                    }
                    k kVar3 = e.f5600h;
                    if (kVar3 != null) {
                        kVar3.f5621b = Long.valueOf(j10);
                    }
                    k kVar4 = e.f5600h;
                    if (kVar4 != null) {
                        kVar4.a();
                    }
                }
            });
            e.f5606n = k10;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
            kotlin.jvm.internal.g.e(activity, "activity");
            kotlin.jvm.internal.g.e(outState, "outState");
            j.a aVar = com.facebook.internal.j.f9803d;
            j.a.a(LoggingBehavior.APP_EVENTS, e.f5595b, "onActivitySaveInstanceState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            kotlin.jvm.internal.g.e(activity, "activity");
            e.f5604l++;
            j.a aVar = com.facebook.internal.j.f9803d;
            j.a.a(LoggingBehavior.APP_EVENTS, e.f5595b, "onActivityStarted");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            kotlin.jvm.internal.g.e(activity, "activity");
            j.a aVar = com.facebook.internal.j.f9803d;
            j.a.a(LoggingBehavior.APP_EVENTS, e.f5595b, "onActivityStopped");
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = com.facebook.appevents.l.c;
            String str = com.facebook.appevents.i.f9526a;
            if (!k6.a.b(com.facebook.appevents.i.class)) {
                try {
                    com.facebook.appevents.i.f9528d.execute(new com.facebook.appevents.h(0));
                } catch (Throwable th2) {
                    k6.a.a(com.facebook.appevents.i.class, th2);
                }
            }
            e.f5604l--;
        }
    }

    static {
        String canonicalName = e.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.internal.ActivityLifecycleTracker";
        }
        f5595b = canonicalName;
        c = Executors.newSingleThreadScheduledExecutor();
        f5596d = Executors.newSingleThreadScheduledExecutor();
        f5598f = new Object();
        f5599g = new AtomicInteger(0);
        f5601i = new AtomicBoolean(false);
    }

    public static final UUID a() {
        k kVar;
        if (f5600h == null || (kVar = f5600h) == null) {
            return null;
        }
        return kVar.c;
    }

    public static final void b(Application application, String str) {
        if (!f5601i.compareAndSet(false, true)) {
            return;
        }
        FeatureManager.a(new t5.f(4), FeatureManager.Feature.CodelessEvents);
        f5602j = str;
        application.registerActivityLifecycleCallbacks(new a());
    }
}
