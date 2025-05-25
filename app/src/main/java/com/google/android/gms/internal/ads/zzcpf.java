package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcpf extends zzazo {
    private final zzcpe zza;
    private final com.google.android.gms.ads.internal.client.zzbu zzb;
    private final zzfaj zzc;
    private boolean zzd = ((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzay)).booleanValue();
    private final zzdsk zze;

    public zzcpf(zzcpe zzcpeVar, com.google.android.gms.ads.internal.client.zzbu zzbuVar, zzfaj zzfajVar, zzdsk zzdskVar) {
        this.zza = zzcpeVar;
        this.zzb = zzbuVar;
        this.zzc = zzfajVar;
        this.zze = zzdskVar;
    }

    @Override // com.google.android.gms.internal.ads.zzazp
    public final com.google.android.gms.ads.internal.client.zzbu zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzazp
    public final com.google.android.gms.ads.internal.client.zzdn zzf() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzgc)).booleanValue()) {
            return null;
        }
        return this.zza.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzazp
    public final void zzg(boolean z10) {
        this.zzd = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzazp
    public final void zzh(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        Preconditions.e("setOnPaidEventListener must be called on the main UI thread.");
        if (this.zzc != null) {
            try {
                if (!zzdgVar.zzf()) {
                    this.zze.zze();
                }
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzm.g(3);
            }
            this.zzc.zzn(zzdgVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzazp
    public final void zzi(IObjectWrapper iObjectWrapper, zzazw zzazwVar) {
        try {
            this.zzc.zzp(zzazwVar);
            this.zza.zzd((Activity) ObjectWrapper.L0(iObjectWrapper), zzazwVar, this.zzd);
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.f("#007 Could not call remote method.", e10);
        }
    }
}
