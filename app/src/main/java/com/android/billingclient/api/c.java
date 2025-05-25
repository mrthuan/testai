package com.android.billingclient.api;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.zzai;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zzfz;
import com.google.android.gms.internal.play_billing.zzga;
import com.google.android.gms.internal.play_billing.zzgd;
import com.google.android.gms.internal.play_billing.zzge;
import com.google.android.gms.internal.play_billing.zzgg;
import com.google.android.gms.internal.play_billing.zzgk;
import com.google.android.gms.internal.play_billing.zzgt;
import com.google.android.gms.internal.play_billing.zzgu;
import com.google.android.gms.internal.play_billing.zzgz;
import com.google.android.gms.internal.play_billing.zzhb;
import com.google.android.gms.internal.play_billing.zzs;
import com.inmobi.commons.core.configs.CrashConfig;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import y4.a;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes.dex */
public final class c extends androidx.privacysandbox.ads.adservices.topics.d {
    public ExecutorService A;

    /* renamed from: a  reason: collision with root package name */
    public volatile int f6182a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6183b;
    public final Handler c;

    /* renamed from: d  reason: collision with root package name */
    public volatile d0 f6184d;

    /* renamed from: e  reason: collision with root package name */
    public Context f6185e;

    /* renamed from: f  reason: collision with root package name */
    public x f6186f;

    /* renamed from: g  reason: collision with root package name */
    public volatile zzs f6187g;

    /* renamed from: h  reason: collision with root package name */
    public volatile v f6188h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f6189i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f6190j;

    /* renamed from: k  reason: collision with root package name */
    public int f6191k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f6192l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f6193m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f6194n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f6195o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f6196p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f6197q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f6198r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f6199s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f6200t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f6201u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f6202v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f6203w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f6204x;

    /* renamed from: y  reason: collision with root package name */
    public aj.b f6205y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f6206z;

    public c(aj.b bVar, Context context, k kVar) {
        String B = B();
        this.f6182a = 0;
        this.c = new Handler(Looper.getMainLooper());
        this.f6191k = 0;
        this.f6183b = B;
        this.f6185e = context.getApplicationContext();
        zzgt zzy = zzgu.zzy();
        zzy.zzn(B);
        zzy.zzm(this.f6185e.getPackageName());
        this.f6186f = new wk.g(this.f6185e, (zzgu) zzy.zzf());
        if (kVar == null) {
            zzb.zzk("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f6184d = new d0(this.f6185e, kVar, this.f6186f);
        this.f6205y = bVar;
        this.f6206z = false;
        this.f6185e.getPackageName();
    }

    @SuppressLint({"PrivateApi"})
    public static String B() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return "7.0.0";
        }
    }

    public final f A() {
        if (this.f6182a != 0 && this.f6182a != 3) {
            return y.f6294h;
        }
        return y.f6296j;
    }

    public final Future C(Callable callable, long j10, Runnable runnable, Handler handler) {
        if (this.A == null) {
            this.A = Executors.newFixedThreadPool(zzb.zza, new r());
        }
        try {
            Future submit = this.A.submit(callable);
            handler.postDelayed(new i0(0, submit, runnable), (long) (j10 * 0.95d));
            return submit;
        } catch (Exception e10) {
            zzb.zzl("BillingClient", "Async task throws exception!", e10);
            return null;
        }
    }

    public final void D(zzga zzgaVar) {
        x xVar = this.f6186f;
        int i10 = this.f6191k;
        wk.g gVar = (wk.g) xVar;
        gVar.getClass();
        try {
            zzgt zzgtVar = (zzgt) ((zzgu) gVar.f31333a).zzi();
            zzgtVar.zzl(i10);
            gVar.f31333a = (zzgu) zzgtVar.zzf();
            gVar.b(zzgaVar);
        } catch (Throwable th2) {
            zzb.zzl("BillingLogger", "Unable to log.", th2);
        }
    }

    public final void E(zzge zzgeVar) {
        x xVar = this.f6186f;
        int i10 = this.f6191k;
        wk.g gVar = (wk.g) xVar;
        gVar.getClass();
        try {
            zzgt zzgtVar = (zzgt) ((zzgu) gVar.f31333a).zzi();
            zzgtVar.zzl(i10);
            gVar.f31333a = (zzgu) zzgtVar.zzf();
            gVar.c(zzgeVar);
        } catch (Throwable th2) {
            zzb.zzl("BillingLogger", "Unable to log.", th2);
        }
    }

    public final void F(int i10, int i11, f fVar) {
        zzge zzgeVar = null;
        zzga zzgaVar = null;
        if (fVar.f6231a != 0) {
            int i12 = w.f6287a;
            try {
                zzfz zzy = zzga.zzy();
                zzgg zzy2 = zzgk.zzy();
                zzy2.zzn(fVar.f6231a);
                zzy2.zzm(fVar.f6232b);
                zzy2.zzo(i10);
                zzy.zzl(zzy2);
                zzy.zzn(5);
                zzgz zzy3 = zzhb.zzy();
                zzy3.zzl(i11);
                zzy.zzm((zzhb) zzy3.zzf());
                zzgaVar = (zzga) zzy.zzf();
            } catch (Exception e10) {
                zzb.zzl("BillingLogger", "Unable to create logging payload", e10);
            }
            D(zzgaVar);
            return;
        }
        int i13 = w.f6287a;
        try {
            zzgd zzy4 = zzge.zzy();
            zzy4.zzm(5);
            zzgz zzy5 = zzhb.zzy();
            zzy5.zzl(i11);
            zzy4.zzl((zzhb) zzy5.zzf());
            zzgeVar = (zzge) zzy4.zzf();
        } catch (Exception e11) {
            zzb.zzl("BillingLogger", "Unable to create logging payload", e11);
        }
        E(zzgeVar);
    }

    @Override // androidx.privacysandbox.ads.adservices.topics.d
    public final void h(m mVar, j jVar) {
        if (!i()) {
            f fVar = y.f6296j;
            D(w.a(2, 9, fVar));
            jVar.a(fVar, zzai.zzk());
            return;
        }
        String str = mVar.f6265a;
        if (TextUtils.isEmpty(str)) {
            zzb.zzk("BillingClient", "Please provide a valid product type.");
            f fVar2 = y.f6291e;
            D(w.a(50, 9, fVar2));
            jVar.a(fVar2, zzai.zzk());
        } else if (C(new s(this, str, jVar), CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, new n(this, jVar), k()) == null) {
            f A = A();
            D(w.a(25, 9, A));
            jVar.a(A, zzai.zzk());
        }
    }

    public final boolean i() {
        if (this.f6182a == 2 && this.f6187g != null && this.f6188h != null) {
            return true;
        }
        return false;
    }

    public final void j(a.b bVar) {
        if (i()) {
            zzb.zzj("BillingClient", "Service connection is valid. No need to re-initialize.");
            E(w.b(6));
            bVar.d(y.f6295i);
            return;
        }
        int i10 = 1;
        if (this.f6182a == 1) {
            zzb.zzk("BillingClient", "Client is already in the process of connecting to billing service.");
            f fVar = y.f6290d;
            D(w.a(37, 6, fVar));
            bVar.d(fVar);
        } else if (this.f6182a == 3) {
            zzb.zzk("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
            f fVar2 = y.f6296j;
            D(w.a(38, 6, fVar2));
            bVar.d(fVar2);
        } else {
            this.f6182a = 1;
            zzb.zzj("BillingClient", "Starting in-app billing setup.");
            this.f6188h = new v(this, bVar);
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            List<ResolveInfo> queryIntentServices = this.f6185e.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                if (serviceInfo != null) {
                    String str = serviceInfo.packageName;
                    String str2 = serviceInfo.name;
                    if ("com.android.vending".equals(str) && str2 != null) {
                        ComponentName componentName = new ComponentName(str, str2);
                        Intent intent2 = new Intent(intent);
                        intent2.setComponent(componentName);
                        intent2.putExtra("playBillingLibraryVersion", this.f6183b);
                        if (this.f6185e.bindService(intent2, this.f6188h, 1)) {
                            zzb.zzj("BillingClient", "Service was bonded successfully.");
                            return;
                        } else {
                            zzb.zzk("BillingClient", "Connection to Billing service is blocked.");
                            i10 = 39;
                        }
                    } else {
                        zzb.zzk("BillingClient", "The device doesn't have valid Play Store.");
                        i10 = 40;
                    }
                }
            } else {
                i10 = 41;
            }
            this.f6182a = 0;
            zzb.zzj("BillingClient", "Billing service unavailable on device.");
            f fVar3 = y.c;
            D(w.a(i10, 6, fVar3));
            bVar.d(fVar3);
        }
    }

    public final Handler k() {
        if (Looper.myLooper() == null) {
            return this.c;
        }
        return new Handler(Looper.myLooper());
    }

    public final void l(f fVar) {
        if (Thread.interrupted()) {
            return;
        }
        this.c.post(new e0(0, this, fVar));
    }
}
