package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfar extends com.google.android.gms.ads.internal.client.zzbt implements com.google.android.gms.ads.internal.overlay.zzp, zzazj {
    protected zzcpe zza;
    private final zzcgj zzb;
    private final Context zzc;
    private final String zze;
    private final zzfal zzf;
    private final zzfaj zzg;
    private final VersionInfoParcel zzh;
    private final zzdsk zzi;
    private zzcor zzk;
    private AtomicBoolean zzd = new AtomicBoolean();
    private long zzj = -1;

    public zzfar(zzcgj zzcgjVar, Context context, String str, zzfal zzfalVar, zzfaj zzfajVar, VersionInfoParcel versionInfoParcel, zzdsk zzdskVar) {
        this.zzb = zzcgjVar;
        this.zzc = context;
        this.zze = str;
        this.zzf = zzfalVar;
        this.zzg = zzfajVar;
        this.zzh = versionInfoParcel;
        this.zzi = zzdskVar;
        zzfajVar.zzm(this);
    }

    private final synchronized void zzq(int i10) {
        if (this.zzd.compareAndSet(false, true)) {
            this.zzg.zzj();
            zzcor zzcorVar = this.zzk;
            if (zzcorVar != null) {
                com.google.android.gms.ads.internal.zzu.B.f10556f.zze(zzcorVar);
            }
            if (this.zza != null) {
                long j10 = -1;
                if (this.zzj != -1) {
                    com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
                    j10 = SystemClock.elapsedRealtime() - this.zzj;
                }
                this.zza.zze(j10, i10);
            }
            zzx();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzA() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzB() {
        Preconditions.e("resume must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzF(com.google.android.gms.ads.internal.client.zzq zzqVar) {
        Preconditions.e("setAdSize must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzH(zzazs zzazsVar) {
        this.zzg.zzo(zzazsVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzI(com.google.android.gms.ads.internal.client.zzw zzwVar) {
        this.zzf.zzl(zzwVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzN(boolean z10) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzO(zzbcr zzbcrVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzU(com.google.android.gms.ads.internal.client.zzfk zzfkVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzX() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzY() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzZ() {
        return this.zzf.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzazj
    public final void zza() {
        zzq(3);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzaa() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006b A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006d A[Catch: all -> 0x0088, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0010, B:9:0x0025, B:13:0x0042, B:15:0x004e, B:18:0x0053, B:21:0x0065, B:25:0x006d, B:12:0x003d), top: B:31:0x0001 }] */
    @Override // com.google.android.gms.ads.internal.client.zzbu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean zzab(com.google.android.gms.ads.internal.client.zzl r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            com.google.android.gms.internal.ads.zzbdc r0 = com.google.android.gms.internal.ads.zzbdq.zzd     // Catch: java.lang.Throwable -> L88
            java.lang.Object r0 = r0.zze()     // Catch: java.lang.Throwable -> L88
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L88
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L88
            r1 = 0
            if (r0 == 0) goto L24
            com.google.android.gms.internal.ads.zzbbn r0 = com.google.android.gms.internal.ads.zzbbw.zzkl     // Catch: java.lang.Throwable -> L88
            com.google.android.gms.ads.internal.client.zzba r2 = com.google.android.gms.ads.internal.client.zzba.f10115d     // Catch: java.lang.Throwable -> L88
            com.google.android.gms.internal.ads.zzbbu r2 = r2.c     // Catch: java.lang.Throwable -> L88
            java.lang.Object r0 = r2.zza(r0)     // Catch: java.lang.Throwable -> L88
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L88
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L88
            if (r0 == 0) goto L24
            r0 = 1
            goto L25
        L24:
            r0 = r1
        L25:
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r2 = r5.zzh     // Catch: java.lang.Throwable -> L88
            int r2 = r2.c     // Catch: java.lang.Throwable -> L88
            com.google.android.gms.internal.ads.zzbbn r3 = com.google.android.gms.internal.ads.zzbbw.zzkm     // Catch: java.lang.Throwable -> L88
            com.google.android.gms.ads.internal.client.zzba r4 = com.google.android.gms.ads.internal.client.zzba.f10115d     // Catch: java.lang.Throwable -> L88
            com.google.android.gms.internal.ads.zzbbu r4 = r4.c     // Catch: java.lang.Throwable -> L88
            java.lang.Object r3 = r4.zza(r3)     // Catch: java.lang.Throwable -> L88
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L88
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L88
            if (r2 < r3) goto L3d
            if (r0 != 0) goto L42
        L3d:
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.e(r0)     // Catch: java.lang.Throwable -> L88
        L42:
            com.google.android.gms.ads.internal.zzu r0 = com.google.android.gms.ads.internal.zzu.B     // Catch: java.lang.Throwable -> L88
            com.google.android.gms.ads.internal.util.zzt r0 = r0.c     // Catch: java.lang.Throwable -> L88
            android.content.Context r0 = r5.zzc     // Catch: java.lang.Throwable -> L88
            boolean r0 = com.google.android.gms.ads.internal.util.zzt.f(r0)     // Catch: java.lang.Throwable -> L88
            if (r0 == 0) goto L65
            com.google.android.gms.ads.internal.client.zzc r0 = r6.f10217s     // Catch: java.lang.Throwable -> L88
            if (r0 == 0) goto L53
            goto L65
        L53:
            java.lang.String r6 = "Failed to load the ad because app ID is missing."
            com.google.android.gms.ads.internal.util.client.zzm.c(r6)     // Catch: java.lang.Throwable -> L88
            com.google.android.gms.internal.ads.zzfaj r6 = r5.zzg     // Catch: java.lang.Throwable -> L88
            r0 = 4
            r2 = 0
            com.google.android.gms.ads.internal.client.zze r0 = com.google.android.gms.internal.ads.zzfgi.zzd(r0, r2, r2)     // Catch: java.lang.Throwable -> L88
            r6.zzdB(r0)     // Catch: java.lang.Throwable -> L88
            monitor-exit(r5)
            return r1
        L65:
            boolean r0 = r5.zzZ()     // Catch: java.lang.Throwable -> L88
            if (r0 == 0) goto L6d
            monitor-exit(r5)
            return r1
        L6d:
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean     // Catch: java.lang.Throwable -> L88
            r0.<init>()     // Catch: java.lang.Throwable -> L88
            r5.zzd = r0     // Catch: java.lang.Throwable -> L88
            com.google.android.gms.internal.ads.zzfap r0 = new com.google.android.gms.internal.ads.zzfap     // Catch: java.lang.Throwable -> L88
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L88
            com.google.android.gms.internal.ads.zzfal r1 = r5.zzf     // Catch: java.lang.Throwable -> L88
            java.lang.String r2 = r5.zze     // Catch: java.lang.Throwable -> L88
            com.google.android.gms.internal.ads.zzfaq r3 = new com.google.android.gms.internal.ads.zzfaq     // Catch: java.lang.Throwable -> L88
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L88
            boolean r6 = r1.zzb(r6, r2, r0, r3)     // Catch: java.lang.Throwable -> L88
            monitor-exit(r5)
            return r6
        L88:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfar.zzab(com.google.android.gms.ads.internal.client.zzl):boolean");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzac(com.google.android.gms.ads.internal.client.zzcf zzcfVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final Bundle zzd() {
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final synchronized void zzdr() {
        if (this.zza != null) {
            com.google.android.gms.ads.internal.zzu zzuVar = com.google.android.gms.ads.internal.zzu.B;
            zzuVar.f10560j.getClass();
            this.zzj = SystemClock.elapsedRealtime();
            int zza = this.zza.zza();
            if (zza > 0) {
                zzcor zzcorVar = new zzcor(this.zzb.zzC(), zzuVar.f10560j);
                this.zzk = zzcorVar;
                zzcorVar.zzd(zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzfao
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzfar.this.zzp();
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final synchronized void zzdt() {
        zzcpe zzcpeVar = this.zza;
        if (zzcpeVar != null) {
            com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
            zzcpeVar.zze(SystemClock.elapsedRealtime() - this.zzj, 1);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdu(int i10) {
        if (i10 != 0) {
            int i11 = i10 - 1;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        zzq(6);
                        return;
                    } else {
                        zzq(3);
                        return;
                    }
                }
                zzq(4);
                return;
            }
            zzq(2);
            return;
        }
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized com.google.android.gms.ads.internal.client.zzq zzg() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzbh zzi() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzcb zzj() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized com.google.android.gms.ads.internal.client.zzdn zzk() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized com.google.android.gms.ads.internal.client.zzdq zzl() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final IObjectWrapper zzn() {
        return null;
    }

    public final /* synthetic */ void zzo() {
        zzq(5);
    }

    public final void zzp() {
        this.zzb.zzB().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfan
            @Override // java.lang.Runnable
            public final void run() {
                zzfar.this.zzo();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzr() {
        return this.zze;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzs() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzt() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzx() {
        Preconditions.e("destroy must be called on the main UI thread.");
        zzcpe zzcpeVar = this.zza;
        if (zzcpeVar != null) {
            zzcpeVar.zzb();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzz() {
        Preconditions.e("pause must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdH() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdk() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdq() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzC(com.google.android.gms.ads.internal.client.zzbe zzbeVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzD(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzE(com.google.android.gms.ads.internal.client.zzby zzbyVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzG(com.google.android.gms.ads.internal.client.zzcb zzcbVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzJ(com.google.android.gms.ads.internal.client.zzci zzciVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzK(com.google.android.gms.ads.internal.client.zzdu zzduVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzL(boolean z10) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzM(zzbsw zzbswVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzP(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzR(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzS(zzbvt zzbvtVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzT(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzW(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzQ(zzbsz zzbszVar, String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzy(com.google.android.gms.ads.internal.client.zzl zzlVar, com.google.android.gms.ads.internal.client.zzbk zzbkVar) {
    }
}
