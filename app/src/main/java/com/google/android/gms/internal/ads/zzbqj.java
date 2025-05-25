package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbqj extends zzaxm implements zzbql {
    public zzbqj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbql
    public final com.google.android.gms.ads.internal.client.zzdq zze() {
        Parcel zzdb = zzdb(5, zza());
        com.google.android.gms.ads.internal.client.zzdq zzb = com.google.android.gms.ads.internal.client.zzdp.zzb(zzdb.readStrongBinder());
        zzdb.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbql
    public final zzbra zzf() {
        Parcel zzdb = zzdb(2, zza());
        zzbra zzbraVar = (zzbra) zzaxo.zza(zzdb, zzbra.CREATOR);
        zzdb.recycle();
        return zzbraVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbql
    public final zzbra zzg() {
        Parcel zzdb = zzdb(3, zza());
        zzbra zzbraVar = (zzbra) zzaxo.zza(zzdb, zzbra.CREATOR);
        zzdb.recycle();
        return zzbraVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbql
    public final void zzh(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, com.google.android.gms.ads.internal.client.zzq zzqVar, zzbqo zzbqoVar) {
        Parcel zza = zza();
        zzaxo.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        zzaxo.zzd(zza, bundle);
        zzaxo.zzd(zza, bundle2);
        zzaxo.zzd(zza, zzqVar);
        zzaxo.zzf(zza, zzbqoVar);
        zzdc(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbql
    public final void zzi(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbpw zzbpwVar, zzbos zzbosVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzaxo.zzd(zza, zzlVar);
        zzaxo.zzf(zza, iObjectWrapper);
        zzaxo.zzf(zza, zzbpwVar);
        zzaxo.zzf(zza, zzbosVar);
        zzdc(23, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbql
    public final void zzj(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbpz zzbpzVar, zzbos zzbosVar, com.google.android.gms.ads.internal.client.zzq zzqVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzaxo.zzd(zza, zzlVar);
        zzaxo.zzf(zza, iObjectWrapper);
        zzaxo.zzf(zza, zzbpzVar);
        zzaxo.zzf(zza, zzbosVar);
        zzaxo.zzd(zza, zzqVar);
        zzdc(13, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbql
    public final void zzk(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbpz zzbpzVar, zzbos zzbosVar, com.google.android.gms.ads.internal.client.zzq zzqVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzaxo.zzd(zza, zzlVar);
        zzaxo.zzf(zza, iObjectWrapper);
        zzaxo.zzf(zza, zzbpzVar);
        zzaxo.zzf(zza, zzbosVar);
        zzaxo.zzd(zza, zzqVar);
        zzdc(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbql
    public final void zzl(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbqc zzbqcVar, zzbos zzbosVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzaxo.zzd(zza, zzlVar);
        zzaxo.zzf(zza, iObjectWrapper);
        zzaxo.zzf(zza, zzbqcVar);
        zzaxo.zzf(zza, zzbosVar);
        zzdc(14, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbql
    public final void zzm(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbqf zzbqfVar, zzbos zzbosVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzaxo.zzd(zza, zzlVar);
        zzaxo.zzf(zza, iObjectWrapper);
        zzaxo.zzf(zza, zzbqfVar);
        zzaxo.zzf(zza, zzbosVar);
        zzdc(18, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbql
    public final void zzn(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbqf zzbqfVar, zzbos zzbosVar, zzbes zzbesVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzaxo.zzd(zza, zzlVar);
        zzaxo.zzf(zza, iObjectWrapper);
        zzaxo.zzf(zza, zzbqfVar);
        zzaxo.zzf(zza, zzbosVar);
        zzaxo.zzd(zza, zzbesVar);
        zzdc(22, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbql
    public final void zzo(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbqi zzbqiVar, zzbos zzbosVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzaxo.zzd(zza, zzlVar);
        zzaxo.zzf(zza, iObjectWrapper);
        zzaxo.zzf(zza, zzbqiVar);
        zzaxo.zzf(zza, zzbosVar);
        zzdc(20, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbql
    public final void zzp(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbqi zzbqiVar, zzbos zzbosVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzaxo.zzd(zza, zzlVar);
        zzaxo.zzf(zza, iObjectWrapper);
        zzaxo.zzf(zza, zzbqiVar);
        zzaxo.zzf(zza, zzbosVar);
        zzdc(16, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbql
    public final void zzq(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzdc(19, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbql
    public final boolean zzr(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzaxo.zzf(zza, iObjectWrapper);
        Parcel zzdb = zzdb(24, zza);
        boolean zzg = zzaxo.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbql
    public final boolean zzs(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzaxo.zzf(zza, iObjectWrapper);
        Parcel zzdb = zzdb(15, zza);
        boolean zzg = zzaxo.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbql
    public final boolean zzt(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzaxo.zzf(zza, iObjectWrapper);
        Parcel zzdb = zzdb(17, zza);
        boolean zzg = zzaxo.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }
}
