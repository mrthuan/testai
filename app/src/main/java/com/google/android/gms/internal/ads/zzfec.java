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
public final class zzfec extends zzbwf {
    private final zzfdy zza;
    private final zzfdo zzb;
    private final String zzc;
    private final zzfey zzd;
    private final Context zze;
    private final VersionInfoParcel zzf;
    private final zzauo zzg;
    private final zzdsk zzh;
    private zzdop zzi;
    private boolean zzj = ((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzav)).booleanValue();

    public zzfec(String str, zzfdy zzfdyVar, Context context, zzfdo zzfdoVar, zzfey zzfeyVar, VersionInfoParcel versionInfoParcel, zzauo zzauoVar, zzdsk zzdskVar) {
        this.zzc = str;
        this.zza = zzfdyVar;
        this.zzb = zzfdoVar;
        this.zzd = zzfeyVar;
        this.zze = context;
        this.zzf = versionInfoParcel;
        this.zzg = zzauoVar;
        this.zzh = zzdskVar;
    }

    private final synchronized void zzu(com.google.android.gms.ads.internal.client.zzl zzlVar, zzbwn zzbwnVar, int i10) {
        boolean z10 = false;
        if (((Boolean) zzbdq.zzk.zze()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzkl)).booleanValue()) {
                z10 = true;
            }
        }
        if (this.zzf.c < ((Integer) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzkm)).intValue() || !z10) {
            Preconditions.e("#008 Must be called on the main UI thread.");
        }
        this.zzb.zzk(zzbwnVar);
        com.google.android.gms.ads.internal.util.zzt zztVar = com.google.android.gms.ads.internal.zzu.B.c;
        if (com.google.android.gms.ads.internal.util.zzt.f(this.zze) && zzlVar.f10217s == null) {
            com.google.android.gms.ads.internal.util.client.zzm.c("Failed to load the ad because app ID is missing.");
            this.zzb.zzdB(zzfgi.zzd(4, null, null));
            return;
        }
        if (this.zzi != null) {
            return;
        }
        zzfdq zzfdqVar = new zzfdq(null);
        this.zza.zzj(i10);
        this.zza.zzb(zzlVar, this.zzc, zzfdqVar, new zzfeb(this));
    }

    @Override // com.google.android.gms.internal.ads.zzbwg
    public final Bundle zzb() {
        Preconditions.e("#008 Must be called on the main UI thread.");
        zzdop zzdopVar = this.zzi;
        if (zzdopVar != null) {
            return zzdopVar.zza();
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbwg
    public final com.google.android.gms.ads.internal.client.zzdn zzc() {
        zzdop zzdopVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzgc)).booleanValue() && (zzdopVar = this.zzi) != null) {
            return zzdopVar.zzm();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwg
    public final zzbwd zzd() {
        Preconditions.e("#008 Must be called on the main UI thread.");
        zzdop zzdopVar = this.zzi;
        if (zzdopVar != null) {
            return zzdopVar.zzc();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwg
    public final synchronized String zze() {
        zzdop zzdopVar = this.zzi;
        if (zzdopVar != null && zzdopVar.zzm() != null) {
            return zzdopVar.zzm().zzg();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwg
    public final synchronized void zzf(com.google.android.gms.ads.internal.client.zzl zzlVar, zzbwn zzbwnVar) {
        zzu(zzlVar, zzbwnVar, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzbwg
    public final synchronized void zzg(com.google.android.gms.ads.internal.client.zzl zzlVar, zzbwn zzbwnVar) {
        zzu(zzlVar, zzbwnVar, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzbwg
    public final synchronized void zzh(boolean z10) {
        Preconditions.e("setImmersiveMode must be called on the main UI thread.");
        this.zzj = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzbwg
    public final void zzi(com.google.android.gms.ads.internal.client.zzdd zzddVar) {
        if (zzddVar == null) {
            this.zzb.zzg(null);
        } else {
            this.zzb.zzg(new zzfea(this, zzddVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwg
    public final void zzj(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        Preconditions.e("setOnPaidEventListener must be called on the main UI thread.");
        try {
            if (!zzdgVar.zzf()) {
                this.zzh.zze();
            }
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(3);
        }
        this.zzb.zzi(zzdgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbwg
    public final void zzk(zzbwj zzbwjVar) {
        Preconditions.e("#008 Must be called on the main UI thread.");
        this.zzb.zzj(zzbwjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbwg
    public final synchronized void zzl(zzbwu zzbwuVar) {
        Preconditions.e("#008 Must be called on the main UI thread.");
        zzfey zzfeyVar = this.zzd;
        zzfeyVar.zza = zzbwuVar.zza;
        zzfeyVar.zzb = zzbwuVar.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbwg
    public final synchronized void zzm(IObjectWrapper iObjectWrapper) {
        zzn(iObjectWrapper, this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzbwg
    public final synchronized void zzn(IObjectWrapper iObjectWrapper, boolean z10) {
        Preconditions.e("#008 Must be called on the main UI thread.");
        if (this.zzi == null) {
            com.google.android.gms.ads.internal.util.client.zzm.e("Rewarded can not be shown before loaded");
            this.zzb.zzq(zzfgi.zzd(9, null, null));
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzct)).booleanValue()) {
            this.zzg.zzc().zzn(new Throwable().getStackTrace());
        }
        this.zzi.zzh(z10, (Activity) ObjectWrapper.L0(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbwg
    public final boolean zzo() {
        Preconditions.e("#008 Must be called on the main UI thread.");
        zzdop zzdopVar = this.zzi;
        if (zzdopVar != null && !zzdopVar.zzf()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbwg
    public final void zzp(zzbwo zzbwoVar) {
        Preconditions.e("#008 Must be called on the main UI thread.");
        this.zzb.zzo(zzbwoVar);
    }
}
