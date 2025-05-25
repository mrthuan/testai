package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzelq extends com.google.android.gms.ads.internal.client.zzbt implements zzczc {
    private final Context zza;
    private final zzfax zzb;
    private final String zzc;
    private final zzemk zzd;
    private com.google.android.gms.ads.internal.client.zzq zze;
    private final zzffe zzf;
    private final VersionInfoParcel zzg;
    private final zzdsk zzh;
    private zzcpk zzi;

    public zzelq(Context context, com.google.android.gms.ads.internal.client.zzq zzqVar, String str, zzfax zzfaxVar, zzemk zzemkVar, VersionInfoParcel versionInfoParcel, zzdsk zzdskVar) {
        this.zza = context;
        this.zzb = zzfaxVar;
        this.zze = zzqVar;
        this.zzc = str;
        this.zzd = zzemkVar;
        this.zzf = zzfaxVar.zzg();
        this.zzg = versionInfoParcel;
        this.zzh = zzdskVar;
        zzfaxVar.zzp(this);
    }

    private final synchronized void zzf(com.google.android.gms.ads.internal.client.zzq zzqVar) {
        this.zzf.zzs(zzqVar);
        this.zzf.zzy(this.zze.f10250n);
    }

    private final synchronized boolean zzh(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        if (zzm()) {
            Preconditions.e("loadAd must be called on the main UI thread.");
        }
        com.google.android.gms.ads.internal.util.zzt zztVar = com.google.android.gms.ads.internal.zzu.B.c;
        if (com.google.android.gms.ads.internal.util.zzt.f(this.zza) && zzlVar.f10217s == null) {
            com.google.android.gms.ads.internal.util.client.zzm.c("Failed to load the ad because app ID is missing.");
            zzemk zzemkVar = this.zzd;
            if (zzemkVar != null) {
                zzemkVar.zzdB(zzfgi.zzd(4, null, null));
            }
            return false;
        }
        zzfgd.zza(this.zza, zzlVar.f10204f);
        return this.zzb.zzb(zzlVar, this.zzc, null, new zzelp(this));
    }

    private final boolean zzm() {
        boolean z10;
        if (((Boolean) zzbdq.zzf.zze()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzkl)).booleanValue()) {
                z10 = true;
                if (this.zzg.c >= ((Integer) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzkm)).intValue() || !z10) {
                    return true;
                }
                return false;
            }
        }
        z10 = false;
        if (this.zzg.c >= ((Integer) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzkm)).intValue()) {
        }
        return true;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzA() {
        Preconditions.e("recordManualImpression must be called on the main UI thread.");
        zzcpk zzcpkVar = this.zzi;
        if (zzcpkVar != null) {
            zzcpkVar.zzh();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
        if (r3.zzg.c < ((java.lang.Integer) r1.c.zza(com.google.android.gms.internal.ads.zzbbw.zzkn)).intValue()) goto L18;
     */
    @Override // com.google.android.gms.ads.internal.client.zzbu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zzB() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzbdc r0 = com.google.android.gms.internal.ads.zzbdq.zzh     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r0 = r0.zze()     // Catch: java.lang.Throwable -> L4a
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L4a
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L4a
            if (r0 == 0) goto L35
            com.google.android.gms.internal.ads.zzbbn r0 = com.google.android.gms.internal.ads.zzbbw.zzkh     // Catch: java.lang.Throwable -> L4a
            com.google.android.gms.ads.internal.client.zzba r1 = com.google.android.gms.ads.internal.client.zzba.f10115d     // Catch: java.lang.Throwable -> L4a
            com.google.android.gms.internal.ads.zzbbu r2 = r1.c     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r0 = r2.zza(r0)     // Catch: java.lang.Throwable -> L4a
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L4a
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L4a
            if (r0 == 0) goto L35
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r0 = r3.zzg     // Catch: java.lang.Throwable -> L4a
            int r0 = r0.c     // Catch: java.lang.Throwable -> L4a
            com.google.android.gms.internal.ads.zzbbn r2 = com.google.android.gms.internal.ads.zzbbw.zzkn     // Catch: java.lang.Throwable -> L4a
            com.google.android.gms.internal.ads.zzbbu r1 = r1.c     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r1 = r1.zza(r2)     // Catch: java.lang.Throwable -> L4a
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L4a
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L4a
            if (r0 >= r1) goto L3a
        L35:
            java.lang.String r0 = "resume must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.e(r0)     // Catch: java.lang.Throwable -> L4a
        L3a:
            com.google.android.gms.internal.ads.zzcpk r0 = r3.zzi     // Catch: java.lang.Throwable -> L4a
            if (r0 == 0) goto L48
            com.google.android.gms.internal.ads.zzcxp r0 = r0.zzn()     // Catch: java.lang.Throwable -> L4a
            r1 = 0
            r0.zzc(r1)     // Catch: java.lang.Throwable -> L4a
            monitor-exit(r3)
            return
        L48:
            monitor-exit(r3)
            return
        L4a:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzelq.zzB():void");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzC(com.google.android.gms.ads.internal.client.zzbe zzbeVar) {
        if (zzm()) {
            Preconditions.e("setAdListener must be called on the main UI thread.");
        }
        this.zzb.zzo(zzbeVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzD(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        if (zzm()) {
            Preconditions.e("setAdListener must be called on the main UI thread.");
        }
        this.zzd.zzj(zzbhVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzE(com.google.android.gms.ads.internal.client.zzby zzbyVar) {
        Preconditions.e("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzF(com.google.android.gms.ads.internal.client.zzq zzqVar) {
        Preconditions.e("setAdSize must be called on the main UI thread.");
        this.zzf.zzs(zzqVar);
        this.zze = zzqVar;
        zzcpk zzcpkVar = this.zzi;
        if (zzcpkVar != null) {
            zzcpkVar.zzi(this.zzb.zzc(), zzqVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzG(com.google.android.gms.ads.internal.client.zzcb zzcbVar) {
        if (zzm()) {
            Preconditions.e("setAppEventListener must be called on the main UI thread.");
        }
        this.zzd.zzm(zzcbVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzN(boolean z10) {
        if (zzm()) {
            Preconditions.e("setManualImpressionsEnabled must be called from the main thread.");
        }
        this.zzf.zzB(z10);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzO(zzbcr zzbcrVar) {
        Preconditions.e("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.zzb.zzq(zzbcrVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzP(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        if (zzm()) {
            Preconditions.e("setPaidEventListener must be called on the main UI thread.");
        }
        try {
            if (!zzdgVar.zzf()) {
                this.zzh.zze();
            }
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(3);
        }
        this.zzd.zzl(zzdgVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzU(com.google.android.gms.ads.internal.client.zzfk zzfkVar) {
        if (zzm()) {
            Preconditions.e("setVideoOptions must be called on the main UI thread.");
        }
        this.zzf.zzI(zzfkVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzY() {
        zzcpk zzcpkVar = this.zzi;
        if (zzcpkVar != null) {
            if (zzcpkVar.zzs()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzZ() {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzczc
    public final synchronized void zza() {
        if (this.zzb.zzt()) {
            com.google.android.gms.ads.internal.client.zzq zzh = this.zzf.zzh();
            zzcpk zzcpkVar = this.zzi;
            if (zzcpkVar != null && zzcpkVar.zzg() != null && this.zzf.zzT()) {
                zzh = zzffm.zza(this.zza, Collections.singletonList(this.zzi.zzg()));
            }
            zzf(zzh);
            this.zzf.zzx(true);
            try {
                zzh(this.zzf.zzf());
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzm.e("Failed to refresh the banner ad.");
            }
            this.zzf.zzx(false);
            return;
        }
        this.zzb.zzm();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzaa() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzab(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        zzf(this.zze);
        return zzh(zzlVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzac(com.google.android.gms.ads.internal.client.zzcf zzcfVar) {
        Preconditions.e("setCorrelationIdProvider must be called on the main UI thread");
        this.zzf.zzV(zzcfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzczc
    public final synchronized void zzb() {
        if (this.zzb.zzt()) {
            this.zzb.zzr();
        } else {
            this.zzb.zzn();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final Bundle zzd() {
        Preconditions.e("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized com.google.android.gms.ads.internal.client.zzq zzg() {
        Preconditions.e("getAdSize must be called on the main UI thread.");
        zzcpk zzcpkVar = this.zzi;
        if (zzcpkVar != null) {
            return zzffm.zza(this.zza, Collections.singletonList(zzcpkVar.zzf()));
        }
        return this.zzf.zzh();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzbh zzi() {
        return this.zzd.zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzcb zzj() {
        return this.zzd.zzi();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized com.google.android.gms.ads.internal.client.zzdn zzk() {
        zzcpk zzcpkVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzgc)).booleanValue() && (zzcpkVar = this.zzi) != null) {
            return zzcpkVar.zzm();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized com.google.android.gms.ads.internal.client.zzdq zzl() {
        Preconditions.e("getVideoController must be called from the main thread.");
        zzcpk zzcpkVar = this.zzi;
        if (zzcpkVar != null) {
            return zzcpkVar.zze();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final IObjectWrapper zzn() {
        if (zzm()) {
            Preconditions.e("getAdFrame must be called on the main UI thread.");
        }
        return new ObjectWrapper(this.zzb.zzc());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzr() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzs() {
        zzcpk zzcpkVar = this.zzi;
        if (zzcpkVar != null && zzcpkVar.zzm() != null) {
            return zzcpkVar.zzm().zzg();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzt() {
        zzcpk zzcpkVar = this.zzi;
        if (zzcpkVar != null && zzcpkVar.zzm() != null) {
            return zzcpkVar.zzm().zzg();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
        if (r3.zzg.c < ((java.lang.Integer) r1.c.zza(com.google.android.gms.internal.ads.zzbbw.zzkn)).intValue()) goto L18;
     */
    @Override // com.google.android.gms.ads.internal.client.zzbu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zzx() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzbdc r0 = com.google.android.gms.internal.ads.zzbdq.zze     // Catch: java.lang.Throwable -> L45
            java.lang.Object r0 = r0.zze()     // Catch: java.lang.Throwable -> L45
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L45
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L45
            if (r0 == 0) goto L35
            com.google.android.gms.internal.ads.zzbbn r0 = com.google.android.gms.internal.ads.zzbbw.zzki     // Catch: java.lang.Throwable -> L45
            com.google.android.gms.ads.internal.client.zzba r1 = com.google.android.gms.ads.internal.client.zzba.f10115d     // Catch: java.lang.Throwable -> L45
            com.google.android.gms.internal.ads.zzbbu r2 = r1.c     // Catch: java.lang.Throwable -> L45
            java.lang.Object r0 = r2.zza(r0)     // Catch: java.lang.Throwable -> L45
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L45
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L45
            if (r0 == 0) goto L35
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r0 = r3.zzg     // Catch: java.lang.Throwable -> L45
            int r0 = r0.c     // Catch: java.lang.Throwable -> L45
            com.google.android.gms.internal.ads.zzbbn r2 = com.google.android.gms.internal.ads.zzbbw.zzkn     // Catch: java.lang.Throwable -> L45
            com.google.android.gms.internal.ads.zzbbu r1 = r1.c     // Catch: java.lang.Throwable -> L45
            java.lang.Object r1 = r1.zza(r2)     // Catch: java.lang.Throwable -> L45
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L45
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L45
            if (r0 >= r1) goto L3a
        L35:
            java.lang.String r0 = "destroy must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.e(r0)     // Catch: java.lang.Throwable -> L45
        L3a:
            com.google.android.gms.internal.ads.zzcpk r0 = r3.zzi     // Catch: java.lang.Throwable -> L45
            if (r0 == 0) goto L43
            r0.zzb()     // Catch: java.lang.Throwable -> L45
            monitor-exit(r3)
            return
        L43:
            monitor-exit(r3)
            return
        L45:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzelq.zzx():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
        if (r3.zzg.c < ((java.lang.Integer) r1.c.zza(com.google.android.gms.internal.ads.zzbbw.zzkn)).intValue()) goto L18;
     */
    @Override // com.google.android.gms.ads.internal.client.zzbu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zzz() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzbdc r0 = com.google.android.gms.internal.ads.zzbdq.zzg     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r0 = r0.zze()     // Catch: java.lang.Throwable -> L4a
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L4a
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L4a
            if (r0 == 0) goto L35
            com.google.android.gms.internal.ads.zzbbn r0 = com.google.android.gms.internal.ads.zzbbw.zzkj     // Catch: java.lang.Throwable -> L4a
            com.google.android.gms.ads.internal.client.zzba r1 = com.google.android.gms.ads.internal.client.zzba.f10115d     // Catch: java.lang.Throwable -> L4a
            com.google.android.gms.internal.ads.zzbbu r2 = r1.c     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r0 = r2.zza(r0)     // Catch: java.lang.Throwable -> L4a
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L4a
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L4a
            if (r0 == 0) goto L35
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r0 = r3.zzg     // Catch: java.lang.Throwable -> L4a
            int r0 = r0.c     // Catch: java.lang.Throwable -> L4a
            com.google.android.gms.internal.ads.zzbbn r2 = com.google.android.gms.internal.ads.zzbbw.zzkn     // Catch: java.lang.Throwable -> L4a
            com.google.android.gms.internal.ads.zzbbu r1 = r1.c     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r1 = r1.zza(r2)     // Catch: java.lang.Throwable -> L4a
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L4a
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L4a
            if (r0 >= r1) goto L3a
        L35:
            java.lang.String r0 = "pause must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.e(r0)     // Catch: java.lang.Throwable -> L4a
        L3a:
            com.google.android.gms.internal.ads.zzcpk r0 = r3.zzi     // Catch: java.lang.Throwable -> L4a
            if (r0 == 0) goto L48
            com.google.android.gms.internal.ads.zzcxp r0 = r0.zzn()     // Catch: java.lang.Throwable -> L4a
            r1 = 0
            r0.zzb(r1)     // Catch: java.lang.Throwable -> L4a
            monitor-exit(r3)
            return
        L48:
            monitor-exit(r3)
            return
        L4a:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzelq.zzz():void");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzX() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzH(zzazs zzazsVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzI(com.google.android.gms.ads.internal.client.zzw zzwVar) {
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
