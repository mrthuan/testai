package com.google.firebase.crashlytics.internal.settings;

import android.content.Context;
import android.util.Log;
import androidx.core.content.e;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.tools.d;
import d8.o;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.y;
import l.t;
import ma.a0;
import ma.j0;
import org.json.JSONObject;
import ta.b;
import ta.c;
import ta.f;
import ta.g;

/* compiled from: SettingsController.java */
/* loaded from: classes2.dex */
public final class a implements f {

    /* renamed from: a  reason: collision with root package name */
    public final Context f13538a;

    /* renamed from: b  reason: collision with root package name */
    public final g f13539b;
    public final e c;

    /* renamed from: d  reason: collision with root package name */
    public final y f13540d;

    /* renamed from: e  reason: collision with root package name */
    public final t f13541e;

    /* renamed from: f  reason: collision with root package name */
    public final b f13542f;

    /* renamed from: g  reason: collision with root package name */
    public final a0 f13543g;

    /* renamed from: h  reason: collision with root package name */
    public final AtomicReference<c> f13544h;

    /* renamed from: i  reason: collision with root package name */
    public final AtomicReference<TaskCompletionSource<c>> f13545i;

    public a(Context context, g gVar, y yVar, e eVar, t tVar, b bVar, a0 a0Var) {
        AtomicReference<c> atomicReference = new AtomicReference<>();
        this.f13544h = atomicReference;
        this.f13545i = new AtomicReference<>(new TaskCompletionSource());
        this.f13538a = context;
        this.f13539b = gVar;
        this.f13540d = yVar;
        this.c = eVar;
        this.f13541e = tVar;
        this.f13542f = bVar;
        this.f13543g = a0Var;
        atomicReference.set(ta.a.b(yVar));
    }

    public final c a(SettingsCacheBehavior settingsCacheBehavior) {
        boolean z10;
        try {
            if (!SettingsCacheBehavior.SKIP_CACHE_LOOKUP.equals(settingsCacheBehavior)) {
                JSONObject f10 = this.f13541e.f();
                if (f10 != null) {
                    c j10 = this.c.j(f10);
                    if (j10 != null) {
                        f10.toString();
                        Log.isLoggable("FirebaseCrashlytics", 3);
                        this.f13540d.getClass();
                        long currentTimeMillis = System.currentTimeMillis();
                        if (!SettingsCacheBehavior.IGNORE_CACHE_EXPIRATION.equals(settingsCacheBehavior)) {
                            if (j10.c < currentTimeMillis) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                Log.isLoggable("FirebaseCrashlytics", 2);
                            }
                        }
                        try {
                            Log.isLoggable("FirebaseCrashlytics", 2);
                        } catch (Exception unused) {
                            return j10;
                        }
                    }
                } else {
                    Log.isLoggable("FirebaseCrashlytics", 3);
                }
            }
        } catch (Exception unused2) {
        }
        return null;
    }

    public final c b() {
        return this.f13544h.get();
    }

    public final o c(ExecutorService executorService) {
        o oVar;
        Object p10;
        c a10;
        SettingsCacheBehavior settingsCacheBehavior = SettingsCacheBehavior.USE_CACHE;
        boolean z10 = !this.f13538a.getSharedPreferences("com.google.firebase.crashlytics", 0).getString("existing_instance_identifier", "").equals(this.f13539b.f29990f);
        AtomicReference<TaskCompletionSource<c>> atomicReference = this.f13545i;
        AtomicReference<c> atomicReference2 = this.f13544h;
        if (!z10 && (a10 = a(settingsCacheBehavior)) != null) {
            atomicReference2.set(a10);
            atomicReference.get().d(a10);
            p10 = Tasks.e(null);
        } else {
            c a11 = a(SettingsCacheBehavior.IGNORE_CACHE_EXPIRATION);
            if (a11 != null) {
                atomicReference2.set(a11);
                atomicReference.get().d(a11);
            }
            a0 a0Var = this.f13543g;
            o oVar2 = a0Var.f21877h.f11978a;
            synchronized (a0Var.c) {
                oVar = a0Var.f21873d.f11978a;
            }
            ExecutorService executorService2 = j0.f21911a;
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            d dVar = new d(taskCompletionSource, 6);
            oVar2.g(executorService, dVar);
            oVar.g(executorService, dVar);
            p10 = taskCompletionSource.f11978a.p(executorService, new ta.d(this));
        }
        return (o) p10;
    }
}
