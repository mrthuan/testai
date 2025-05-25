package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import androidx.lifecycle.LifecycleService;
import androidx.work.impl.background.systemalarm.d;
import java.util.HashMap;
import java.util.WeakHashMap;
import o2.h;
import y2.m;

/* loaded from: classes.dex */
public class SystemAlarmService extends LifecycleService implements d.c {

    /* renamed from: b  reason: collision with root package name */
    public d f4933b;
    public boolean c;

    static {
        h.e("SystemAlarmService");
    }

    public final void a() {
        d dVar = new d(this);
        this.f4933b = dVar;
        if (dVar.f4957j != null) {
            h.c().b(new Throwable[0]);
        } else {
            dVar.f4957j = this;
        }
    }

    public final void b() {
        this.c = true;
        h.c().a(new Throwable[0]);
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = m.f32011a;
        HashMap hashMap = new HashMap();
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap2 = m.f32011a;
        synchronized (weakHashMap2) {
            hashMap.putAll(weakHashMap2);
        }
        for (PowerManager.WakeLock wakeLock : hashMap.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                String.format("WakeLock held for %s", hashMap.get(wakeLock));
                h c = h.c();
                WeakHashMap<PowerManager.WakeLock, String> weakHashMap3 = m.f32011a;
                c.f(new Throwable[0]);
            }
        }
        stopSelf();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final void onCreate() {
        super.onCreate();
        a();
        this.c = false;
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.c = true;
        this.f4933b.e();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.c) {
            h.c().d(new Throwable[0]);
            this.f4933b.e();
            a();
            this.c = false;
        }
        if (intent != null) {
            this.f4933b.a(i11, intent);
            return 3;
        }
        return 3;
    }
}
