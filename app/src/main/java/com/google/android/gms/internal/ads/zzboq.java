package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzboq extends zzaxm implements zzbos {
    public zzboq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbos
    public final void zze() {
        zzdc(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbos
    public final void zzf() {
        zzdc(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbos
    public final void zzg(int i10) {
        Parcel zza = zza();
        zza.writeInt(i10);
        zzdc(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbos
    public final void zzh(com.google.android.gms.ads.internal.client.zze zzeVar) {
        Parcel zza = zza();
        zzaxo.zzd(zza, zzeVar);
        zzdc(23, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbos
    public final void zzi(int i10, String str) {
        Parcel zza = zza();
        zza.writeInt(i10);
        zza.writeString(str);
        zzdc(22, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbos
    public final void zzj(int i10) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbos
    public final void zzk(com.google.android.gms.ads.internal.client.zze zzeVar) {
        Parcel zza = zza();
        zzaxo.zzd(zza, zzeVar);
        zzdc(24, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbos
    public final void zzl(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzdc(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbos
    public final void zzm() {
        zzdc(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbos
    public final void zzn() {
        zzdc(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbos
    public final void zzo() {
        zzdc(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbos
    public final void zzp() {
        zzdc(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbos
    public final void zzq(String str, String str2) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzdc(9, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbos
    public final void zzr(zzbfx zzbfxVar, String str) {
        Parcel zza = zza();
        zzaxo.zzf(zza, zzbfxVar);
        zza.writeString(str);
        zzdc(10, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbos
    public final void zzs(zzbvz zzbvzVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbos
    public final void zzt(zzbwd zzbwdVar) {
        Parcel zza = zza();
        zzaxo.zzf(zza, zzbwdVar);
        zzdc(16, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbos
    public final void zzu() {
        zzdc(18, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbos
    public final void zzv() {
        zzdc(11, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbos
    public final void zzw() {
        zzdc(15, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbos
    public final void zzx() {
        zzdc(20, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbos
    public final void zzy() {
        zzdc(13, zza());
    }
}
