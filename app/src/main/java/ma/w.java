package ma;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* compiled from: CrashlyticsCore.java */
/* loaded from: classes2.dex */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    public final Context f21939a;

    /* renamed from: b  reason: collision with root package name */
    public final a0 f21940b;
    public final androidx.appcompat.widget.i c;

    /* renamed from: d  reason: collision with root package name */
    public final long f21941d;

    /* renamed from: e  reason: collision with root package name */
    public w4.a f21942e;

    /* renamed from: f  reason: collision with root package name */
    public w4.a f21943f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f21944g;

    /* renamed from: h  reason: collision with root package name */
    public com.google.firebase.crashlytics.internal.common.b f21945h;

    /* renamed from: i  reason: collision with root package name */
    public final f0 f21946i;

    /* renamed from: j  reason: collision with root package name */
    public final ra.d f21947j;

    /* renamed from: k  reason: collision with root package name */
    public final la.b f21948k;

    /* renamed from: l  reason: collision with root package name */
    public final ka.a f21949l;

    /* renamed from: m  reason: collision with root package name */
    public final ExecutorService f21950m;

    /* renamed from: n  reason: collision with root package name */
    public final g f21951n;

    /* renamed from: o  reason: collision with root package name */
    public final ja.a f21952o;

    /* compiled from: CrashlyticsCore.java */
    /* loaded from: classes2.dex */
    public class a implements Callable<Boolean> {
        public a() {
        }

        @Override // java.util.concurrent.Callable
        public final Boolean call() {
            try {
                w4.a aVar = w.this.f21942e;
                ra.d dVar = (ra.d) aVar.f30971b;
                dVar.getClass();
                return Boolean.valueOf(new File(dVar.f29496b, (String) aVar.f30970a).delete());
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        }
    }

    public w(z9.e eVar, f0 f0Var, ja.c cVar, a0 a0Var, com.google.android.tools.d dVar, d9.g gVar, ra.d dVar2, ExecutorService executorService) {
        this.f21940b = a0Var;
        eVar.a();
        this.f21939a = eVar.f32308a;
        this.f21946i = f0Var;
        this.f21952o = cVar;
        this.f21948k = dVar;
        this.f21949l = gVar;
        this.f21950m = executorService;
        this.f21947j = dVar2;
        this.f21951n = new g(executorService);
        this.f21941d = System.currentTimeMillis();
        this.c = new androidx.appcompat.widget.i();
    }

    public static Task a(final w wVar, ta.f fVar) {
        Task d10;
        boolean z10;
        if (Boolean.TRUE.equals(wVar.f21951n.f21903d.get())) {
            w4.a aVar = wVar.f21942e;
            aVar.getClass();
            try {
                ra.d dVar = (ra.d) aVar.f30971b;
                dVar.getClass();
                new File(dVar.f29496b, (String) aVar.f30970a).createNewFile();
            } catch (IOException unused) {
            }
            Log.isLoggable("FirebaseCrashlytics", 2);
            try {
                try {
                    wVar.f21948k.b(new la.a() { // from class: ma.t
                        @Override // la.a
                        public final void a(String str) {
                            w wVar2 = w.this;
                            wVar2.getClass();
                            com.google.firebase.crashlytics.internal.common.b bVar = wVar2.f21945h;
                            bVar.getClass();
                            bVar.f13520e.a(new p(bVar, System.currentTimeMillis() - wVar2.f21941d, str));
                        }
                    });
                    com.google.firebase.crashlytics.internal.settings.a aVar2 = (com.google.firebase.crashlytics.internal.settings.a) fVar;
                    if (!aVar2.b().f29978b.f29982a) {
                        Log.isLoggable("FirebaseCrashlytics", 3);
                        d10 = Tasks.d(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
                    } else {
                        com.google.firebase.crashlytics.internal.common.b bVar = wVar.f21945h;
                        if (Boolean.TRUE.equals(bVar.f13520e.f21903d.get())) {
                            com.google.firebase.crashlytics.internal.common.c cVar = bVar.f13528m;
                            if (cVar != null && cVar.f13536e.get()) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (!z10) {
                                Log.isLoggable("FirebaseCrashlytics", 2);
                                try {
                                    bVar.c(true, aVar2);
                                    Log.isLoggable("FirebaseCrashlytics", 2);
                                } catch (Exception unused2) {
                                }
                            }
                            d10 = wVar.f21945h.f(aVar2.f13545i.get().f11978a);
                        } else {
                            throw new IllegalStateException("Not running on background worker thread as intended.");
                        }
                    }
                } catch (Exception e10) {
                    d10 = Tasks.d(e10);
                }
                wVar.b();
                return d10;
            } catch (Throwable th2) {
                wVar.b();
                throw th2;
            }
        }
        throw new IllegalStateException("Not running on background worker thread as intended.");
    }

    public final void b() {
        this.f21951n.a(new a());
    }

    public final void c(Boolean bool) {
        Boolean a10;
        a0 a0Var = this.f21940b;
        synchronized (a0Var) {
            if (bool != null) {
                try {
                    a0Var.f21875f = false;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (bool != null) {
                a10 = bool;
            } else {
                z9.e eVar = a0Var.f21872b;
                eVar.a();
                a10 = a0Var.a(eVar.f32308a);
            }
            a0Var.f21876g = a10;
            SharedPreferences.Editor edit = a0Var.f21871a.edit();
            if (bool != null) {
                edit.putBoolean("firebase_crashlytics_collection_enabled", bool.booleanValue());
            } else {
                edit.remove("firebase_crashlytics_collection_enabled");
            }
            edit.apply();
            synchronized (a0Var.c) {
                if (a0Var.b()) {
                    if (!a0Var.f21874e) {
                        a0Var.f21873d.d(null);
                        a0Var.f21874e = true;
                    }
                } else if (a0Var.f21874e) {
                    a0Var.f21873d = new TaskCompletionSource<>();
                    a0Var.f21874e = false;
                }
            }
        }
    }

    public final void d(String str, String str2) {
        boolean z10;
        com.google.firebase.crashlytics.internal.common.b bVar = this.f21945h;
        bVar.getClass();
        try {
            bVar.f13519d.a(str, str2);
        } catch (IllegalArgumentException e10) {
            Context context = bVar.f13517a;
            if (context != null) {
                if ((context.getApplicationInfo().flags & 2) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    throw e10;
                }
            }
        }
    }
}
