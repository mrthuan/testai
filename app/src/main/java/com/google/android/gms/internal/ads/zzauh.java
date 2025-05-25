package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzauh implements zzauk {
    private static zzauh zzb;
    private final Context zzc;
    private final zzfpw zzd;
    private final zzfqd zze;
    private final zzfqf zzf;
    private final zzavj zzg;
    private final zzfoh zzh;
    private final Executor zzi;
    private final zzfqc zzj;
    private final zzavy zzl;
    private final zzavq zzm;
    private final zzavh zzn;
    private volatile boolean zzp;
    private volatile boolean zzq;
    private final int zzr;
    volatile long zza = 0;
    private final Object zzo = new Object();
    private final CountDownLatch zzk = new CountDownLatch(1);

    public zzauh(Context context, zzfoh zzfohVar, zzfpw zzfpwVar, zzfqd zzfqdVar, zzfqf zzfqfVar, zzavj zzavjVar, Executor executor, zzfoc zzfocVar, int i10, zzavy zzavyVar, zzavq zzavqVar, zzavh zzavhVar) {
        this.zzq = false;
        this.zzc = context;
        this.zzh = zzfohVar;
        this.zzd = zzfpwVar;
        this.zze = zzfqdVar;
        this.zzf = zzfqfVar;
        this.zzg = zzavjVar;
        this.zzi = executor;
        this.zzr = i10;
        this.zzl = zzavyVar;
        this.zzm = zzavqVar;
        this.zzn = zzavhVar;
        this.zzq = false;
        this.zzj = new zzauf(this, zzfocVar);
    }

    public static synchronized zzauh zza(String str, Context context, boolean z10, boolean z11) {
        zzauh zzb2;
        synchronized (zzauh.class) {
            zzb2 = zzb(str, context, Executors.newCachedThreadPool(), z10, z11);
        }
        return zzb2;
    }

    @Deprecated
    public static synchronized zzauh zzb(String str, Context context, Executor executor, boolean z10, boolean z11) {
        zzauh zzauhVar;
        zzaus zzausVar;
        zzavy zzavyVar;
        zzavq zzavqVar;
        zzavh zzavhVar;
        synchronized (zzauh.class) {
            if (zzb == null) {
                zzfoi zza = zzfoj.zza();
                zza.zza(str);
                zza.zzc(z10);
                zzfoj zzd = zza.zzd();
                zzfoh zza2 = zzfoh.zza(context, executor, z11);
                zzbbn zzbbnVar = zzbbw.zzcY;
                com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
                if (((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue()) {
                    zzausVar = zzaus.zzc(context);
                } else {
                    zzausVar = null;
                }
                if (((Boolean) zzbaVar.c.zza(zzbbw.zzcZ)).booleanValue()) {
                    zzavyVar = zzavy.zzd(context, executor);
                } else {
                    zzavyVar = null;
                }
                if (((Boolean) zzbaVar.c.zza(zzbbw.zzcs)).booleanValue()) {
                    zzavqVar = new zzavq();
                } else {
                    zzavqVar = null;
                }
                if (((Boolean) zzbaVar.c.zza(zzbbw.zzct)).booleanValue()) {
                    zzavhVar = new zzavh();
                } else {
                    zzavhVar = null;
                }
                zzfpa zze = zzfpa.zze(context, executor, zza2, zzd);
                zzavi zzaviVar = new zzavi(context);
                zzavj zzavjVar = new zzavj(zzd, zze, new zzavw(context, zzaviVar), zzaviVar, zzausVar, zzavyVar, zzavqVar, zzavhVar);
                int zzb2 = zzfpj.zzb(context, zza2);
                zzfoc zzfocVar = new zzfoc();
                zzauh zzauhVar2 = new zzauh(context, zza2, new zzfpw(context, zzb2), new zzfqd(context, zzb2, new zzaue(zza2), ((Boolean) zzbaVar.c.zza(zzbbw.zzcc)).booleanValue()), new zzfqf(context, zzavjVar, zza2, zzfocVar), zzavjVar, executor, zzfocVar, zzb2, zzavyVar, zzavqVar, zzavhVar);
                zzb = zzauhVar2;
                zzauhVar2.zzm();
                zzb.zzp();
            }
            zzauhVar = zzb;
        }
        return zzauhVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x009a, code lost:
        if (r4.zzd().zzj().equals(r5.zzj()) != false) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void zzj(com.google.android.gms.internal.ads.zzauh r12) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzauh.zzj(com.google.android.gms.internal.ads.zzauh):void");
    }

    private final void zzs() {
        zzavy zzavyVar = this.zzl;
        if (zzavyVar != null) {
            zzavyVar.zzh();
        }
    }

    private final zzfpv zzt(int i10) {
        if (!zzfpj.zza(this.zzr)) {
            return null;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzca)).booleanValue()) {
            return this.zze.zzc(1);
        }
        return this.zzd.zzc(1);
    }

    @Override // com.google.android.gms.internal.ads.zzauk
    public final String zze(Context context, String str, View view) {
        return zzf(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzauk
    public final String zzf(Context context, String str, View view, Activity activity) {
        zzs();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzcs)).booleanValue()) {
            this.zzm.zzi();
        }
        zzp();
        zzfok zza = this.zzf.zza();
        if (zza != null) {
            long currentTimeMillis = System.currentTimeMillis();
            String zza2 = zza.zza(context, null, str, view, activity);
            this.zzh.zzf(5000, System.currentTimeMillis() - currentTimeMillis, zza2, null);
            return zza2;
        }
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzauk
    public final String zzg(Context context) {
        zzs();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzcs)).booleanValue()) {
            this.zzm.zzj();
        }
        zzp();
        zzfok zza = this.zzf.zza();
        if (zza != null) {
            long currentTimeMillis = System.currentTimeMillis();
            String zzc = zza.zzc(context, null);
            this.zzh.zzf(5001, System.currentTimeMillis() - currentTimeMillis, zzc, null);
            return zzc;
        }
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzauk
    public final String zzh(Context context, View view, Activity activity) {
        zzs();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzcs)).booleanValue()) {
            this.zzm.zzk(context, view);
        }
        zzp();
        zzfok zza = this.zzf.zza();
        if (zza != null) {
            long currentTimeMillis = System.currentTimeMillis();
            String zzb2 = zza.zzb(context, null, view, activity);
            this.zzh.zzf(5002, System.currentTimeMillis() - currentTimeMillis, zzb2, null);
            return zzb2;
        }
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzauk
    public final void zzk(MotionEvent motionEvent) {
        zzfok zza = this.zzf.zza();
        if (zza != null) {
            try {
                zza.zzd(null, motionEvent);
            } catch (zzfqe e10) {
                this.zzh.zzc(e10.zza(), -1L, e10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauk
    public final void zzl(int i10, int i11, int i12) {
        DisplayMetrics displayMetrics;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzkY)).booleanValue() && (displayMetrics = this.zzc.getResources().getDisplayMetrics()) != null) {
            float f10 = i10;
            float f11 = displayMetrics.density;
            float f12 = i11;
            MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, f10 * f11, f12 * f11, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
            zzk(obtain);
            obtain.recycle();
            float f13 = displayMetrics.density;
            MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 2, f10 * f13, f12 * f13, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
            zzk(obtain2);
            obtain2.recycle();
            float f14 = displayMetrics.density;
            MotionEvent obtain3 = MotionEvent.obtain(0L, i12, 1, f10 * f14, f12 * f14, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
            zzk(obtain3);
            obtain3.recycle();
        }
    }

    public final synchronized void zzm() {
        long currentTimeMillis = System.currentTimeMillis();
        zzfpv zzt = zzt(1);
        if (zzt != null) {
            if (this.zzf.zzc(zzt)) {
                this.zzq = true;
                this.zzk.countDown();
                return;
            }
            return;
        }
        this.zzh.zzd(4013, System.currentTimeMillis() - currentTimeMillis);
    }

    @Override // com.google.android.gms.internal.ads.zzauk
    public final void zzn(StackTraceElement[] stackTraceElementArr) {
        zzavh zzavhVar = this.zzn;
        if (zzavhVar != null) {
            zzavhVar.zzb(Arrays.asList(stackTraceElementArr));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauk
    public final void zzo(View view) {
        this.zzg.zzd(view);
    }

    public final void zzp() {
        if (!this.zzp) {
            synchronized (this.zzo) {
                if (!this.zzp) {
                    if ((System.currentTimeMillis() / 1000) - this.zza < 3600) {
                        return;
                    }
                    zzfpv zzb2 = this.zzf.zzb();
                    if ((zzb2 == null || zzb2.zzd(3600L)) && zzfpj.zza(this.zzr)) {
                        this.zzi.execute(new zzaug(this));
                    }
                }
            }
        }
    }

    public final synchronized boolean zzr() {
        return this.zzq;
    }
}
