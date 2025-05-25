package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdnk extends zzbgz {
    private final String zza;
    private final zzdiw zzb;
    private final zzdjb zzc;
    private final zzdsk zzd;

    public zzdnk(String str, zzdiw zzdiwVar, zzdjb zzdjbVar, zzdsk zzdskVar) {
        this.zza = str;
        this.zzb = zzdiwVar;
        this.zzc = zzdjbVar;
        this.zzd = zzdskVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final void zzA() {
        this.zzb.zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final void zzB(Bundle bundle) {
        this.zzb.zzL(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final void zzC() {
        this.zzb.zzN();
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final void zzD(com.google.android.gms.ads.internal.client.zzcs zzcsVar) {
        this.zzb.zzO(zzcsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final void zzE(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        try {
            if (!zzdgVar.zzf()) {
                this.zzd.zze();
            }
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(3);
        }
        this.zzb.zzP(zzdgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final void zzF(zzbgx zzbgxVar) {
        this.zzb.zzQ(zzbgxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final boolean zzG() {
        return this.zzb.zzV();
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final boolean zzH() {
        if (!this.zzc.zzH().isEmpty() && this.zzc.zzk() != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final boolean zzI(Bundle bundle) {
        return this.zzb.zzY(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final double zze() {
        return this.zzc.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final Bundle zzf() {
        return this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final com.google.android.gms.ads.internal.client.zzdn zzg() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzgc)).booleanValue()) {
            return null;
        }
        return this.zzb.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final com.google.android.gms.ads.internal.client.zzdq zzh() {
        return this.zzc.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final zzbew zzi() {
        return this.zzc.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final zzbfa zzj() {
        return this.zzb.zzc().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final zzbfd zzk() {
        return this.zzc.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final IObjectWrapper zzl() {
        return this.zzc.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final IObjectWrapper zzm() {
        return new ObjectWrapper(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final String zzn() {
        return this.zzc.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final String zzo() {
        return this.zzc.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final String zzp() {
        return this.zzc.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final String zzq() {
        return this.zzc.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final String zzr() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final String zzs() {
        return this.zzc.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final String zzt() {
        return this.zzc.zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final List zzu() {
        return this.zzc.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final List zzv() {
        if (zzH()) {
            return this.zzc.zzH();
        }
        return Collections.emptyList();
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final void zzw() {
        this.zzb.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final void zzx() {
        this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final void zzy(com.google.android.gms.ads.internal.client.zzcw zzcwVar) {
        this.zzb.zzC(zzcwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final void zzz(Bundle bundle) {
        this.zzb.zzG(bundle);
    }
}
