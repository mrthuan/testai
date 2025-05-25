package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbwe extends zzaxm implements zzbwg {
    public zzbwe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbwg
    public final Bundle zzb() {
        Parcel zzdb = zzdb(9, zza());
        Bundle bundle = (Bundle) zzaxo.zza(zzdb, Bundle.CREATOR);
        zzdb.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbwg
    public final com.google.android.gms.ads.internal.client.zzdn zzc() {
        Parcel zzdb = zzdb(12, zza());
        com.google.android.gms.ads.internal.client.zzdn zzb = com.google.android.gms.ads.internal.client.zzdm.zzb(zzdb.readStrongBinder());
        zzdb.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbwg
    public final zzbwd zzd() {
        zzbwd zzbwbVar;
        Parcel zzdb = zzdb(11, zza());
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzbwbVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
            if (queryLocalInterface instanceof zzbwd) {
                zzbwbVar = (zzbwd) queryLocalInterface;
            } else {
                zzbwbVar = new zzbwb(readStrongBinder);
            }
        }
        zzdb.recycle();
        return zzbwbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbwg
    public final String zze() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwg
    public final void zzf(com.google.android.gms.ads.internal.client.zzl zzlVar, zzbwn zzbwnVar) {
        Parcel zza = zza();
        zzaxo.zzd(zza, zzlVar);
        zzaxo.zzf(zza, zzbwnVar);
        zzdc(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwg
    public final void zzg(com.google.android.gms.ads.internal.client.zzl zzlVar, zzbwn zzbwnVar) {
        Parcel zza = zza();
        zzaxo.zzd(zza, zzlVar);
        zzaxo.zzf(zza, zzbwnVar);
        zzdc(14, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwg
    public final void zzh(boolean z10) {
        Parcel zza = zza();
        int i10 = zzaxo.zza;
        zza.writeInt(z10 ? 1 : 0);
        zzdc(15, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwg
    public final void zzi(com.google.android.gms.ads.internal.client.zzdd zzddVar) {
        Parcel zza = zza();
        zzaxo.zzf(zza, zzddVar);
        zzdc(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwg
    public final void zzj(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        Parcel zza = zza();
        zzaxo.zzf(zza, zzdgVar);
        zzdc(13, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwg
    public final void zzk(zzbwj zzbwjVar) {
        Parcel zza = zza();
        zzaxo.zzf(zza, zzbwjVar);
        zzdc(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwg
    public final void zzl(zzbwu zzbwuVar) {
        Parcel zza = zza();
        zzaxo.zzd(zza, zzbwuVar);
        zzdc(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwg
    public final void zzm(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzaxo.zzf(zza, iObjectWrapper);
        zzdc(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwg
    public final void zzn(IObjectWrapper iObjectWrapper, boolean z10) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwg
    public final boolean zzo() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwg
    public final void zzp(zzbwo zzbwoVar) {
        throw null;
    }
}
