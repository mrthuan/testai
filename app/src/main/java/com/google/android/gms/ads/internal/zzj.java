package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import com.android.billingclient.api.a0;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzauh;
import com.google.android.gms.internal.ads.zzauk;
import com.google.android.gms.internal.ads.zzaun;
import com.google.android.gms.internal.ads.zzbbn;
import com.google.android.gms.internal.ads.zzbbu;
import com.google.android.gms.internal.ads.zzbbw;
import com.google.android.gms.internal.ads.zzbzo;
import com.google.android.gms.internal.ads.zzfoh;
import com.google.android.gms.internal.ads.zzfpj;
import com.google.android.gms.internal.ads.zzfqd;
import com.google.android.gms.internal.ads.zzfru;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public final class zzj implements Runnable, zzauk {

    /* renamed from: d  reason: collision with root package name */
    public boolean f10524d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f10525e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f10526f;

    /* renamed from: g  reason: collision with root package name */
    public final ExecutorService f10527g;

    /* renamed from: h  reason: collision with root package name */
    public final zzfoh f10528h;

    /* renamed from: i  reason: collision with root package name */
    public Context f10529i;

    /* renamed from: j  reason: collision with root package name */
    public final Context f10530j;

    /* renamed from: k  reason: collision with root package name */
    public VersionInfoParcel f10531k;

    /* renamed from: l  reason: collision with root package name */
    public final VersionInfoParcel f10532l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f10533m;

    /* renamed from: o  reason: collision with root package name */
    public int f10535o;

    /* renamed from: a  reason: collision with root package name */
    public final Vector f10522a = new Vector();

    /* renamed from: b  reason: collision with root package name */
    public final AtomicReference f10523b = new AtomicReference();
    public final AtomicReference c = new AtomicReference();

    /* renamed from: n  reason: collision with root package name */
    public final CountDownLatch f10534n = new CountDownLatch(1);

    public zzj(Context context, VersionInfoParcel versionInfoParcel) {
        this.f10529i = context;
        this.f10530j = context;
        this.f10531k = versionInfoParcel;
        this.f10532l = versionInfoParcel;
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        this.f10527g = newCachedThreadPool;
        zzbbn zzbbnVar = zzbbw.zzce;
        zzba zzbaVar = zzba.f10115d;
        boolean booleanValue = ((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue();
        this.f10533m = booleanValue;
        this.f10528h = zzfoh.zza(context, newCachedThreadPool, booleanValue);
        zzbbn zzbbnVar2 = zzbbw.zzcb;
        zzbbu zzbbuVar = zzbaVar.c;
        this.f10525e = ((Boolean) zzbbuVar.zza(zzbbnVar2)).booleanValue();
        this.f10526f = ((Boolean) zzbbuVar.zza(zzbbw.zzcf)).booleanValue();
        if (((Boolean) zzbbuVar.zza(zzbbw.zzcd)).booleanValue()) {
            this.f10535o = 2;
        } else {
            this.f10535o = 1;
        }
        if (!((Boolean) zzbbuVar.zza(zzbbw.zzdc)).booleanValue()) {
            this.f10524d = a();
        }
        if (((Boolean) zzbbuVar.zza(zzbbw.zzcW)).booleanValue()) {
            zzbzo.zza.execute(this);
            return;
        }
        com.google.android.gms.ads.internal.util.client.zzf zzfVar = zzay.f10107f.f10108a;
        zzfru zzfruVar = com.google.android.gms.ads.internal.util.client.zzf.f10351b;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            zzbzo.zza.execute(this);
        } else {
            run();
        }
    }

    public final boolean a() {
        Context context = this.f10529i;
        a0 a0Var = new a0(this, 2);
        return new zzfqd(this.f10529i, zzfpj.zzb(context, this.f10528h), a0Var, ((Boolean) zzba.f10115d.c.zza(zzbbw.zzcc)).booleanValue()).zzd(1);
    }

    public final boolean b() {
        try {
            this.f10534n.await();
            return true;
        } catch (InterruptedException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(5);
            return false;
        }
    }

    public final zzauk c() {
        int i10;
        if (this.f10525e && !this.f10524d) {
            i10 = 1;
        } else {
            i10 = this.f10535o;
        }
        if (i10 == 2) {
            return (zzauk) this.c.get();
        }
        return (zzauk) this.f10523b.get();
    }

    public final void d() {
        Vector vector = this.f10522a;
        zzauk c = c();
        if (!vector.isEmpty() && c != null) {
            Iterator it = vector.iterator();
            while (it.hasNext()) {
                Object[] objArr = (Object[]) it.next();
                int length = objArr.length;
                if (length == 1) {
                    c.zzk((MotionEvent) objArr[0]);
                } else if (length == 3) {
                    c.zzl(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
                }
            }
            vector.clear();
        }
    }

    public final void e(boolean z10) {
        String str = this.f10531k.f10345a;
        Context context = this.f10529i;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        this.f10523b.set(zzaun.zzu(str, context, z10, this.f10535o));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.ads.internal.util.client.VersionInfoParcel, android.content.Context] */
    @Override // java.lang.Runnable
    public final void run() {
        final boolean z10;
        int i10;
        CountDownLatch countDownLatch = this.f10534n;
        try {
            zzbbn zzbbnVar = zzbbw.zzdc;
            zzba zzbaVar = zzba.f10115d;
            if (((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue()) {
                this.f10524d = a();
            }
            boolean z11 = this.f10531k.f10347d;
            if (!((Boolean) zzbaVar.c.zza(zzbbw.zzaN)).booleanValue() && z11) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f10525e && !this.f10524d) {
                i10 = 1;
            } else {
                i10 = this.f10535o;
            }
            if (i10 == 1) {
                e(z10);
                if (this.f10535o == 2) {
                    this.f10527g.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.zzh
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean z12 = z10;
                            zzj zzjVar = zzj.this;
                            zzjVar.getClass();
                            long currentTimeMillis = System.currentTimeMillis();
                            try {
                                String str = zzjVar.f10532l.f10345a;
                                Context context = zzjVar.f10530j;
                                Context applicationContext = context.getApplicationContext();
                                if (applicationContext != null) {
                                    context = applicationContext;
                                }
                                zzauh.zza(str, context, z12, zzjVar.f10533m).zzp();
                            } catch (NullPointerException e10) {
                                zzjVar.f10528h.zzc(2027, System.currentTimeMillis() - currentTimeMillis, e10);
                            }
                        }
                    });
                }
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    String str = this.f10531k.f10345a;
                    Context context = this.f10529i;
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    zzauh zza = zzauh.zza(str, context, z10, this.f10533m);
                    this.c.set(zza);
                    if (this.f10526f && !zza.zzr()) {
                        this.f10535o = 1;
                        e(z10);
                    }
                } catch (NullPointerException e10) {
                    this.f10535o = 1;
                    e(z10);
                    this.f10528h.zzc(2031, System.currentTimeMillis() - currentTimeMillis, e10);
                }
            }
        } finally {
            countDownLatch.countDown();
            this.f10529i = null;
            this.f10531k = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauk
    public final String zze(Context context, String str, View view) {
        return zzf(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzauk
    public final String zzf(Context context, String str, View view, Activity activity) {
        if (b()) {
            zzauk c = c();
            if (((Boolean) zzba.f10115d.c.zza(zzbbw.zzjM)).booleanValue()) {
                com.google.android.gms.ads.internal.util.zzt zztVar = zzu.B.c;
                com.google.android.gms.ads.internal.util.zzt.h(view, 4);
            }
            if (c != null) {
                d();
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                return c.zzf(context, str, view, activity);
            }
            return "";
        }
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzauk
    public final String zzg(Context context) {
        zzauk c;
        if (b() && (c = c()) != null) {
            d();
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            return c.zzg(context);
        }
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzauk
    public final String zzh(Context context, View view, Activity activity) {
        zzbbn zzbbnVar = zzbbw.zzjL;
        zzba zzbaVar = zzba.f10115d;
        boolean booleanValue = ((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue();
        zzbbu zzbbuVar = zzbaVar.c;
        if (booleanValue) {
            if (b()) {
                zzauk c = c();
                if (((Boolean) zzbbuVar.zza(zzbbw.zzjM)).booleanValue()) {
                    com.google.android.gms.ads.internal.util.zzt zztVar = zzu.B.c;
                    com.google.android.gms.ads.internal.util.zzt.h(view, 2);
                }
                if (c != null) {
                    return c.zzh(context, view, activity);
                }
                return "";
            }
            return "";
        }
        zzauk c10 = c();
        if (((Boolean) zzbbuVar.zza(zzbbw.zzjM)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzt zztVar2 = zzu.B.c;
            com.google.android.gms.ads.internal.util.zzt.h(view, 2);
        }
        if (c10 != null) {
            return c10.zzh(context, view, activity);
        }
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzauk
    public final void zzk(MotionEvent motionEvent) {
        zzauk c = c();
        if (c != null) {
            d();
            c.zzk(motionEvent);
            return;
        }
        this.f10522a.add(new Object[]{motionEvent});
    }

    @Override // com.google.android.gms.internal.ads.zzauk
    public final void zzl(int i10, int i11, int i12) {
        zzauk c = c();
        if (c != null) {
            d();
            c.zzl(i10, i11, i12);
            return;
        }
        this.f10522a.add(new Object[]{Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12)});
    }

    @Override // com.google.android.gms.internal.ads.zzauk
    public final void zzn(StackTraceElement[] stackTraceElementArr) {
        zzauk c;
        if (b() && (c = c()) != null) {
            c.zzn(stackTraceElementArr);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauk
    public final void zzo(View view) {
        zzauk c = c();
        if (c != null) {
            c.zzo(view);
        }
    }
}
