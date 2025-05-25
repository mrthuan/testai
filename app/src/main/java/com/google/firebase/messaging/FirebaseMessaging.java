package com.google.firebase.messaging;

import ab.d;
import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.appcompat.widget.y0;
import c7.j;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.a;
import h5.i;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import jb.c0;
import jb.k;
import jb.m;
import jb.p;
import jb.v;
import jb.y;
import lb.g;
import s6.f;
import z9.e;

/* loaded from: classes2.dex */
public class FirebaseMessaging {

    /* renamed from: m  reason: collision with root package name */
    public static final long f13640m = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: n  reason: collision with root package name */
    public static com.google.firebase.messaging.a f13641n;
    @SuppressLint({"FirebaseUnknownNullness"})

    /* renamed from: o  reason: collision with root package name */
    public static f f13642o;

    /* renamed from: p  reason: collision with root package name */
    public static ScheduledThreadPoolExecutor f13643p;

    /* renamed from: a  reason: collision with root package name */
    public final e f13644a;

    /* renamed from: b  reason: collision with root package name */
    public final cb.a f13645b;
    public final eb.e c;

    /* renamed from: d  reason: collision with root package name */
    public final Context f13646d;

    /* renamed from: e  reason: collision with root package name */
    public final m f13647e;

    /* renamed from: f  reason: collision with root package name */
    public final v f13648f;

    /* renamed from: g  reason: collision with root package name */
    public final a f13649g;

    /* renamed from: h  reason: collision with root package name */
    public final Executor f13650h;

    /* renamed from: i  reason: collision with root package name */
    public final Executor f13651i;

    /* renamed from: j  reason: collision with root package name */
    public final Executor f13652j;

    /* renamed from: k  reason: collision with root package name */
    public final p f13653k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f13654l;

    /* loaded from: classes2.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public final d f13655a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f13656b;
        public Boolean c;

        public a(d dVar) {
            this.f13655a = dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v4, types: [jb.l] */
        public final synchronized void a() {
            if (this.f13656b) {
                return;
            }
            Boolean b10 = b();
            this.c = b10;
            if (b10 == null) {
                this.f13655a.b(new ab.b() { // from class: jb.l
                    @Override // ab.b
                    public final void a(ab.a aVar) {
                        boolean g10;
                        FirebaseMessaging.a aVar2 = FirebaseMessaging.a.this;
                        synchronized (aVar2) {
                            aVar2.a();
                            Boolean bool = aVar2.c;
                            if (bool != null) {
                                g10 = bool.booleanValue();
                            } else {
                                g10 = FirebaseMessaging.this.f13644a.g();
                            }
                        }
                        if (g10) {
                            com.google.firebase.messaging.a aVar3 = FirebaseMessaging.f13641n;
                            FirebaseMessaging.this.g();
                        }
                    }
                });
            }
            this.f13656b = true;
        }

        public final Boolean b() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            e eVar = FirebaseMessaging.this.f13644a;
            eVar.a();
            Context context = eVar.f32308a;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
                }
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
    }

    public FirebaseMessaging() {
        throw null;
    }

    public FirebaseMessaging(e eVar, cb.a aVar, db.b<g> bVar, db.b<HeartBeatInfo> bVar2, eb.e eVar2, f fVar, d dVar) {
        eVar.a();
        Context context = eVar.f32308a;
        final p pVar = new p(context);
        final m mVar = new m(eVar, pVar, bVar, bVar2, eVar2);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new NamedThreadFactory("Firebase-Messaging-Task"));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("Firebase-Messaging-File-Io"));
        this.f13654l = false;
        f13642o = fVar;
        this.f13644a = eVar;
        this.f13645b = aVar;
        this.c = eVar2;
        this.f13649g = new a(dVar);
        eVar.a();
        final Context context2 = eVar.f32308a;
        this.f13646d = context2;
        k kVar = new k();
        this.f13653k = pVar;
        this.f13651i = newSingleThreadExecutor;
        this.f13647e = mVar;
        this.f13648f = new v(newSingleThreadExecutor);
        this.f13650h = scheduledThreadPoolExecutor;
        this.f13652j = threadPoolExecutor;
        eVar.a();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(kVar);
        } else {
            Objects.toString(context);
        }
        if (aVar != null) {
            aVar.c();
        }
        scheduledThreadPoolExecutor.execute(new androidx.activity.b(this, 9));
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Topics-Io"));
        int i10 = c0.f19105j;
        Tasks.c(new Callable() { // from class: jb.b0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                a0 a0Var;
                Context context3 = context2;
                ScheduledExecutorService scheduledExecutorService = scheduledThreadPoolExecutor2;
                FirebaseMessaging firebaseMessaging = this;
                p pVar2 = pVar;
                m mVar2 = mVar;
                synchronized (a0.class) {
                    WeakReference<a0> weakReference = a0.f19093d;
                    if (weakReference != null) {
                        a0Var = weakReference.get();
                    } else {
                        a0Var = null;
                    }
                    if (a0Var == null) {
                        a0 a0Var2 = new a0(context3.getSharedPreferences("com.google.android.gms.appid", 0), scheduledExecutorService);
                        a0Var2.b();
                        a0.f19093d = new WeakReference<>(a0Var2);
                        a0Var = a0Var2;
                    }
                }
                return new c0(firebaseMessaging, pVar2, a0Var, mVar2, context3, scheduledExecutorService);
            }
        }, scheduledThreadPoolExecutor2).f(scheduledThreadPoolExecutor, new d9.g(this, 2));
        scheduledThreadPoolExecutor.execute(new y0(this, 5));
    }

    @SuppressLint({"ThreadPoolCreation"})
    public static void b(y yVar, long j10) {
        synchronized (FirebaseMessaging.class) {
            if (f13643p == null) {
                f13643p = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("TAG"));
            }
            f13643p.schedule(yVar, j10, TimeUnit.SECONDS);
        }
    }

    public static synchronized com.google.firebase.messaging.a c(Context context) {
        com.google.firebase.messaging.a aVar;
        synchronized (FirebaseMessaging.class) {
            if (f13641n == null) {
                f13641n = new com.google.firebase.messaging.a(context);
            }
            aVar = f13641n;
        }
        return aVar;
    }

    @Keep
    public static synchronized FirebaseMessaging getInstance(e eVar) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) eVar.b(FirebaseMessaging.class);
            Preconditions.k(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public final String a() {
        Task task;
        cb.a aVar = this.f13645b;
        if (aVar != null) {
            try {
                return (String) Tasks.a(aVar.b());
            } catch (InterruptedException | ExecutionException e10) {
                throw new IOException(e10);
            }
        }
        a.C0177a d10 = d();
        if (!i(d10)) {
            return d10.f13662a;
        }
        String c = p.c(this.f13644a);
        v vVar = this.f13648f;
        synchronized (vVar) {
            task = (Task) vVar.f19157b.getOrDefault(c, null);
            if (task != null) {
                Log.isLoggable("FirebaseMessaging", 3);
            } else {
                Log.isLoggable("FirebaseMessaging", 3);
                m mVar = this.f13647e;
                task = mVar.a(mVar.c(new Bundle(), p.c(mVar.f19139a), "*")).p(this.f13652j, new j(this, c, d10)).i(vVar.f19156a, new i(vVar, c));
                vVar.f19157b.put(c, task);
            }
        }
        try {
            return (String) Tasks.a(task);
        } catch (InterruptedException | ExecutionException e11) {
            throw new IOException(e11);
        }
    }

    public final a.C0177a d() {
        String d10;
        a.C0177a a10;
        com.google.firebase.messaging.a c = c(this.f13646d);
        e eVar = this.f13644a;
        eVar.a();
        if ("[DEFAULT]".equals(eVar.f32309b)) {
            d10 = "";
        } else {
            d10 = eVar.d();
        }
        String c10 = p.c(this.f13644a);
        synchronized (c) {
            SharedPreferences sharedPreferences = c.f13659a;
            a10 = a.C0177a.a(sharedPreferences.getString(d10 + "|T|" + c10 + "|*", null));
        }
        return a10;
    }

    public final boolean e() {
        boolean g10;
        a aVar = this.f13649g;
        synchronized (aVar) {
            aVar.a();
            Boolean bool = aVar.c;
            if (bool != null) {
                g10 = bool.booleanValue();
            } else {
                g10 = FirebaseMessaging.this.f13644a.g();
            }
        }
        return g10;
    }

    public final synchronized void f(boolean z10) {
        this.f13654l = z10;
    }

    public final void g() {
        cb.a aVar = this.f13645b;
        if (aVar != null) {
            aVar.a();
        } else if (i(d())) {
            synchronized (this) {
                if (!this.f13654l) {
                    h(0L);
                }
            }
        }
    }

    public final synchronized void h(long j10) {
        b(new y(this, Math.min(Math.max(30L, 2 * j10), f13640m)), j10);
        this.f13654l = true;
    }

    public final boolean i(a.C0177a c0177a) {
        boolean z10;
        if (c0177a == null) {
            return true;
        }
        String a10 = this.f13653k.a();
        if (System.currentTimeMillis() <= c0177a.c + a.C0177a.f13660d && a10.equals(c0177a.f13663b)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            return true;
        }
        return false;
    }
}
