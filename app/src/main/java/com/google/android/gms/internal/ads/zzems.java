package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzems extends com.google.android.gms.ads.internal.client.zzbt {
    private final com.google.android.gms.ads.internal.client.zzq zza;
    private final Context zzb;
    private final zzfco zzc;
    private final String zzd;
    private final VersionInfoParcel zze;
    private final zzemk zzf;
    private final zzfdo zzg;
    private final zzauo zzh;
    private final zzdsk zzi;
    private zzdfo zzj;
    private boolean zzk = ((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzav)).booleanValue();

    public zzems(Context context, com.google.android.gms.ads.internal.client.zzq zzqVar, String str, zzfco zzfcoVar, zzemk zzemkVar, zzfdo zzfdoVar, VersionInfoParcel versionInfoParcel, zzauo zzauoVar, zzdsk zzdskVar) {
        this.zza = zzqVar;
        this.zzd = str;
        this.zzb = context;
        this.zzc = zzfcoVar;
        this.zzf = zzemkVar;
        this.zzg = zzfdoVar;
        this.zze = versionInfoParcel;
        this.zzh = zzauoVar;
        this.zzi = zzdskVar;
    }

    private final synchronized boolean zze() {
        zzdfo zzdfoVar = this.zzj;
        if (zzdfoVar != null) {
            if (!zzdfoVar.zza()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzB() {
        Preconditions.e("resume must be called on the main UI thread.");
        zzdfo zzdfoVar = this.zzj;
        if (zzdfoVar != null) {
            zzdfoVar.zzn().zzc(null);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzD(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        Preconditions.e("setAdListener must be called on the main UI thread.");
        this.zzf.zzj(zzbhVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzE(com.google.android.gms.ads.internal.client.zzby zzbyVar) {
        Preconditions.e("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzG(com.google.android.gms.ads.internal.client.zzcb zzcbVar) {
        Preconditions.e("setAppEventListener must be called on the main UI thread.");
        this.zzf.zzm(zzcbVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzJ(com.google.android.gms.ads.internal.client.zzci zzciVar) {
        this.zzf.zzn(zzciVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzL(boolean z10) {
        Preconditions.e("setImmersiveMode must be called on the main UI thread.");
        this.zzk = z10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzO(zzbcr zzbcrVar) {
        Preconditions.e("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.zzc.zzi(zzbcrVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzP(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        Preconditions.e("setPaidEventListener must be called on the main UI thread.");
        try {
            if (!zzdgVar.zzf()) {
                this.zzi.zze();
            }
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(3);
        }
        this.zzf.zzl(zzdgVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzS(zzbvt zzbvtVar) {
        this.zzg.zzm(zzbvtVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzW(IObjectWrapper iObjectWrapper) {
        if (this.zzj == null) {
            com.google.android.gms.ads.internal.util.client.zzm.e("Interstitial can not be shown before loaded.");
            this.zzf.zzq(zzfgi.zzd(9, null, null));
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzct)).booleanValue()) {
            this.zzh.zzc().zzn(new Throwable().getStackTrace());
        }
        this.zzj.zzc(this.zzk, (Activity) ObjectWrapper.L0(iObjectWrapper));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzX() {
        Preconditions.e("showInterstitial must be called on the main UI thread.");
        if (this.zzj == null) {
            com.google.android.gms.ads.internal.util.client.zzm.e("Interstitial can not be shown before loaded.");
            this.zzf.zzq(zzfgi.zzd(9, null, null));
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzct)).booleanValue()) {
            this.zzh.zzc().zzn(new Throwable().getStackTrace());
        }
        this.zzj.zzc(this.zzk, null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzY() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzZ() {
        return this.zzc.zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzaa() {
        Preconditions.e("isLoaded must be called on the main UI thread.");
        return zze();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006b A[Catch: all -> 0x008c, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0010, B:9:0x0025, B:13:0x0042, B:15:0x004f, B:17:0x0053, B:19:0x005c, B:20:0x0065, B:22:0x006b, B:12:0x003d), top: B:30:0x0001 }] */
    @Override // com.google.android.gms.ads.internal.client.zzbu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean zzab(com.google.android.gms.ads.internal.client.zzl r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            com.google.android.gms.internal.ads.zzbdc r0 = com.google.android.gms.internal.ads.zzbdq.zzi     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r0 = r0.zze()     // Catch: java.lang.Throwable -> L8c
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L8c
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L8c
            r1 = 0
            if (r0 == 0) goto L24
            com.google.android.gms.internal.ads.zzbbn r0 = com.google.android.gms.internal.ads.zzbbw.zzkl     // Catch: java.lang.Throwable -> L8c
            com.google.android.gms.ads.internal.client.zzba r2 = com.google.android.gms.ads.internal.client.zzba.f10115d     // Catch: java.lang.Throwable -> L8c
            com.google.android.gms.internal.ads.zzbbu r2 = r2.c     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r0 = r2.zza(r0)     // Catch: java.lang.Throwable -> L8c
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L8c
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L8c
            if (r0 == 0) goto L24
            r0 = 1
            goto L25
        L24:
            r0 = r1
        L25:
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r2 = r5.zze     // Catch: java.lang.Throwable -> L8c
            int r2 = r2.c     // Catch: java.lang.Throwable -> L8c
            com.google.android.gms.internal.ads.zzbbn r3 = com.google.android.gms.internal.ads.zzbbw.zzkm     // Catch: java.lang.Throwable -> L8c
            com.google.android.gms.ads.internal.client.zzba r4 = com.google.android.gms.ads.internal.client.zzba.f10115d     // Catch: java.lang.Throwable -> L8c
            com.google.android.gms.internal.ads.zzbbu r4 = r4.c     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r3 = r4.zza(r3)     // Catch: java.lang.Throwable -> L8c
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L8c
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L8c
            if (r2 < r3) goto L3d
            if (r0 != 0) goto L42
        L3d:
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.e(r0)     // Catch: java.lang.Throwable -> L8c
        L42:
            com.google.android.gms.ads.internal.zzu r0 = com.google.android.gms.ads.internal.zzu.B     // Catch: java.lang.Throwable -> L8c
            com.google.android.gms.ads.internal.util.zzt r0 = r0.c     // Catch: java.lang.Throwable -> L8c
            android.content.Context r0 = r5.zzb     // Catch: java.lang.Throwable -> L8c
            boolean r0 = com.google.android.gms.ads.internal.util.zzt.f(r0)     // Catch: java.lang.Throwable -> L8c
            r2 = 0
            if (r0 == 0) goto L65
            com.google.android.gms.ads.internal.client.zzc r0 = r6.f10217s     // Catch: java.lang.Throwable -> L8c
            if (r0 != 0) goto L65
            java.lang.String r6 = "Failed to load the ad because app ID is missing."
            com.google.android.gms.ads.internal.util.client.zzm.c(r6)     // Catch: java.lang.Throwable -> L8c
            com.google.android.gms.internal.ads.zzemk r6 = r5.zzf     // Catch: java.lang.Throwable -> L8c
            if (r6 == 0) goto L8a
            r0 = 4
            com.google.android.gms.ads.internal.client.zze r0 = com.google.android.gms.internal.ads.zzfgi.zzd(r0, r2, r2)     // Catch: java.lang.Throwable -> L8c
            r6.zzdB(r0)     // Catch: java.lang.Throwable -> L8c
            goto L8a
        L65:
            boolean r0 = r5.zze()     // Catch: java.lang.Throwable -> L8c
            if (r0 != 0) goto L8a
            android.content.Context r0 = r5.zzb     // Catch: java.lang.Throwable -> L8c
            boolean r1 = r6.f10204f     // Catch: java.lang.Throwable -> L8c
            com.google.android.gms.internal.ads.zzfgd.zza(r0, r1)     // Catch: java.lang.Throwable -> L8c
            r5.zzj = r2     // Catch: java.lang.Throwable -> L8c
            com.google.android.gms.internal.ads.zzfco r0 = r5.zzc     // Catch: java.lang.Throwable -> L8c
            java.lang.String r1 = r5.zzd     // Catch: java.lang.Throwable -> L8c
            com.google.android.gms.ads.internal.client.zzq r2 = r5.zza     // Catch: java.lang.Throwable -> L8c
            com.google.android.gms.internal.ads.zzfch r3 = new com.google.android.gms.internal.ads.zzfch     // Catch: java.lang.Throwable -> L8c
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L8c
            com.google.android.gms.internal.ads.zzemr r2 = new com.google.android.gms.internal.ads.zzemr     // Catch: java.lang.Throwable -> L8c
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L8c
            boolean r6 = r0.zzb(r6, r1, r3, r2)     // Catch: java.lang.Throwable -> L8c
            monitor-exit(r5)
            return r6
        L8a:
            monitor-exit(r5)
            return r1
        L8c:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzems.zzab(com.google.android.gms.ads.internal.client.zzl):boolean");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final Bundle zzd() {
        Preconditions.e("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzq zzg() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzbh zzi() {
        return this.zzf.zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzcb zzj() {
        return this.zzf.zzi();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized com.google.android.gms.ads.internal.client.zzdn zzk() {
        zzdfo zzdfoVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzgc)).booleanValue() && (zzdfoVar = this.zzj) != null) {
            return zzdfoVar.zzm();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzdq zzl() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final IObjectWrapper zzn() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzr() {
        return this.zzd;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzs() {
        zzdfo zzdfoVar = this.zzj;
        if (zzdfoVar != null && zzdfoVar.zzm() != null) {
            return zzdfoVar.zzm().zzg();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzt() {
        zzdfo zzdfoVar = this.zzj;
        if (zzdfoVar != null && zzdfoVar.zzm() != null) {
            return zzdfoVar.zzm().zzg();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzx() {
        Preconditions.e("destroy must be called on the main UI thread.");
        zzdfo zzdfoVar = this.zzj;
        if (zzdfoVar != null) {
            zzdfoVar.zzn().zza(null);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzy(com.google.android.gms.ads.internal.client.zzl zzlVar, com.google.android.gms.ads.internal.client.zzbk zzbkVar) {
        this.zzf.zzk(zzbkVar);
        zzab(zzlVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzz() {
        Preconditions.e("pause must be called on the main UI thread.");
        zzdfo zzdfoVar = this.zzj;
        if (zzdfoVar != null) {
            zzdfoVar.zzn().zzb(null);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzA() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzC(com.google.android.gms.ads.internal.client.zzbe zzbeVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzF(com.google.android.gms.ads.internal.client.zzq zzqVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzH(zzazs zzazsVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzI(com.google.android.gms.ads.internal.client.zzw zzwVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzK(com.google.android.gms.ads.internal.client.zzdu zzduVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzM(zzbsw zzbswVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzN(boolean z10) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzR(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzT(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzU(com.google.android.gms.ads.internal.client.zzfk zzfkVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzac(com.google.android.gms.ads.internal.client.zzcf zzcfVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzQ(zzbsz zzbszVar, String str) {
    }
}
