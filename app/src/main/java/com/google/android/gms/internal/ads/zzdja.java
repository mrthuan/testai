package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdja extends com.google.android.gms.ads.internal.client.zzdp {
    private final Object zza = new Object();
    private final com.google.android.gms.ads.internal.client.zzdq zzb;
    private final zzbpb zzc;

    public zzdja(com.google.android.gms.ads.internal.client.zzdq zzdqVar, zzbpb zzbpbVar) {
        this.zzb = zzdqVar;
        this.zzc = zzbpbVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final float zze() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final float zzf() {
        zzbpb zzbpbVar = this.zzc;
        if (zzbpbVar != null) {
            return zzbpbVar.zzg();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final float zzg() {
        zzbpb zzbpbVar = this.zzc;
        if (zzbpbVar != null) {
            return zzbpbVar.zzh();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final int zzh() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final com.google.android.gms.ads.internal.client.zzdt zzi() {
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.client.zzdq zzdqVar = this.zzb;
            if (zzdqVar != null) {
                return zzdqVar.zzi();
            }
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzj(boolean z10) {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzk() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzl() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzm(com.google.android.gms.ads.internal.client.zzdt zzdtVar) {
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.client.zzdq zzdqVar = this.zzb;
            if (zzdqVar != null) {
                zzdqVar.zzm(zzdtVar);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzn() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final boolean zzo() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final boolean zzp() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final boolean zzq() {
        throw new RemoteException();
    }
}
