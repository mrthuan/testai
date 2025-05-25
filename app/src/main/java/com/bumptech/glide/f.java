package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import i4.b;
import i4.h;
import i4.k;
import i4.l;
import i4.n;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p4.j;

/* compiled from: RequestManager.java */
/* loaded from: classes.dex */
public final class f implements ComponentCallbacks2, i4.g {

    /* renamed from: l  reason: collision with root package name */
    public static final l4.e f6852l;

    /* renamed from: a  reason: collision with root package name */
    public final com.bumptech.glide.b f6853a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f6854b;
    public final i4.f c;

    /* renamed from: d  reason: collision with root package name */
    public final l f6855d;

    /* renamed from: e  reason: collision with root package name */
    public final k f6856e;

    /* renamed from: f  reason: collision with root package name */
    public final n f6857f;

    /* renamed from: g  reason: collision with root package name */
    public final a f6858g;

    /* renamed from: h  reason: collision with root package name */
    public final Handler f6859h;

    /* renamed from: i  reason: collision with root package name */
    public final i4.b f6860i;

    /* renamed from: j  reason: collision with root package name */
    public final CopyOnWriteArrayList<l4.d<Object>> f6861j;

    /* renamed from: k  reason: collision with root package name */
    public l4.e f6862k;

    /* compiled from: RequestManager.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            f fVar = f.this;
            fVar.c.b(fVar);
        }
    }

    /* compiled from: RequestManager.java */
    /* loaded from: classes.dex */
    public class b implements b.a {

        /* renamed from: a  reason: collision with root package name */
        public final l f6864a;

        public b(l lVar) {
            this.f6864a = lVar;
        }
    }

    static {
        l4.e f10 = new l4.e().f(Bitmap.class);
        f10.f20497t = true;
        f6852l = f10;
        new l4.e().f(g4.c.class).f20497t = true;
        l4.e eVar = (l4.e) new l4.e().g(v3.f.f30510b).q(Priority.LOW).w();
    }

    public f(com.bumptech.glide.b bVar, i4.f fVar, k kVar, Context context) {
        boolean z10;
        i4.b hVar;
        l4.e eVar;
        l lVar = new l();
        i4.c cVar = bVar.f6838g;
        this.f6857f = new n();
        a aVar = new a();
        this.f6858g = aVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.f6859h = handler;
        this.f6853a = bVar;
        this.c = fVar;
        this.f6856e = kVar;
        this.f6855d = lVar;
        this.f6854b = context;
        Context applicationContext = context.getApplicationContext();
        b bVar2 = new b(lVar);
        ((i4.e) cVar).getClass();
        if (androidx.core.content.a.checkSelfPermission(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Log.isLoggable("ConnectivityMonitor", 3);
        if (z10) {
            hVar = new i4.d(applicationContext, bVar2);
        } else {
            hVar = new h();
        }
        this.f6860i = hVar;
        if (j.f()) {
            handler.post(aVar);
        } else {
            fVar.b(this);
        }
        fVar.b(hVar);
        this.f6861j = new CopyOnWriteArrayList<>(bVar.c.f6844e);
        d dVar = bVar.c;
        synchronized (dVar) {
            if (dVar.f6849j == null) {
                ((c) dVar.f6843d).getClass();
                l4.e eVar2 = new l4.e();
                eVar2.f20497t = true;
                dVar.f6849j = eVar2;
            }
            eVar = dVar.f6849j;
        }
        r(eVar);
        bVar.d(this);
    }

    public final e<Bitmap> a() {
        return new e(this.f6853a, this, Bitmap.class, this.f6854b).C(f6852l);
    }

    public final e<Drawable> b() {
        return new e<>(this.f6853a, this, Drawable.class, this.f6854b);
    }

    public final void k(m4.g<?> gVar) {
        boolean z10;
        if (gVar == null) {
            return;
        }
        boolean s4 = s(gVar);
        l4.b h10 = gVar.h();
        if (!s4) {
            com.bumptech.glide.b bVar = this.f6853a;
            synchronized (bVar.f6839h) {
                Iterator it = bVar.f6839h.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((f) it.next()).s(gVar)) {
                            z10 = true;
                            break;
                        }
                    } else {
                        z10 = false;
                        break;
                    }
                }
            }
            if (!z10 && h10 != null) {
                gVar.e(null);
                h10.clear();
            }
        }
    }

    public final e<Drawable> l(Bitmap bitmap) {
        e<Drawable> b10 = b();
        b10.F = bitmap;
        b10.I = true;
        return b10.C(new l4.e().g(v3.f.f30509a));
    }

    public final e<Drawable> m(Drawable drawable) {
        e<Drawable> b10 = b();
        b10.F = drawable;
        b10.I = true;
        return b10.C(new l4.e().g(v3.f.f30509a));
    }

    public final e<Drawable> n(Integer num) {
        PackageInfo packageInfo;
        String uuid;
        e<Drawable> b10 = b();
        b10.F = num;
        b10.I = true;
        ConcurrentHashMap concurrentHashMap = o4.b.f22739a;
        Context context = b10.A;
        String packageName = context.getPackageName();
        ConcurrentHashMap concurrentHashMap2 = o4.b.f22739a;
        t3.b bVar = (t3.b) concurrentHashMap2.get(packageName);
        if (bVar == null) {
            try {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException unused) {
                context.getPackageName();
                packageInfo = null;
            }
            if (packageInfo != null) {
                uuid = String.valueOf(packageInfo.versionCode);
            } else {
                uuid = UUID.randomUUID().toString();
            }
            o4.d dVar = new o4.d(uuid);
            bVar = (t3.b) concurrentHashMap2.putIfAbsent(packageName, dVar);
            if (bVar == null) {
                bVar = dVar;
            }
        }
        return b10.C(new l4.e().u(new o4.a(context.getResources().getConfiguration().uiMode & 48, bVar)));
    }

    public final e<Drawable> o(String str) {
        e<Drawable> b10 = b();
        b10.F = str;
        b10.I = true;
        return b10;
    }

    @Override // i4.g
    public final synchronized void onDestroy() {
        this.f6857f.onDestroy();
        Iterator it = j.d(this.f6857f.f18464a).iterator();
        while (it.hasNext()) {
            k((m4.g) it.next());
        }
        this.f6857f.f18464a.clear();
        l lVar = this.f6855d;
        Iterator it2 = j.d(lVar.f18457a).iterator();
        while (it2.hasNext()) {
            lVar.a((l4.b) it2.next());
        }
        lVar.f18458b.clear();
        this.c.e(this);
        this.c.e(this.f6860i);
        this.f6859h.removeCallbacks(this.f6858g);
        this.f6853a.e(this);
    }

    @Override // i4.g
    public final synchronized void onStart() {
        q();
        this.f6857f.onStart();
    }

    @Override // i4.g
    public final synchronized void onStop() {
        p();
        this.f6857f.onStop();
    }

    public final synchronized void p() {
        l lVar = this.f6855d;
        lVar.c = true;
        Iterator it = j.d(lVar.f18457a).iterator();
        while (it.hasNext()) {
            l4.b bVar = (l4.b) it.next();
            if (bVar.isRunning()) {
                bVar.pause();
                lVar.f18458b.add(bVar);
            }
        }
    }

    public final synchronized void q() {
        l lVar = this.f6855d;
        lVar.c = false;
        Iterator it = j.d(lVar.f18457a).iterator();
        while (it.hasNext()) {
            l4.b bVar = (l4.b) it.next();
            if (!bVar.j() && !bVar.isRunning()) {
                bVar.h();
            }
        }
        lVar.f18458b.clear();
    }

    public final synchronized void r(l4.e eVar) {
        l4.e clone = eVar.clone();
        if (clone.f20497t && !clone.f20499v) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        clone.f20499v = true;
        clone.f20497t = true;
        this.f6862k = clone;
    }

    public final synchronized boolean s(m4.g<?> gVar) {
        l4.b h10 = gVar.h();
        if (h10 == null) {
            return true;
        }
        if (this.f6855d.a(h10)) {
            this.f6857f.f18464a.remove(gVar);
            gVar.e(null);
            return true;
        }
        return false;
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.f6855d + ", treeNode=" + this.f6856e + "}";
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
    }
}
