package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzazn extends zzaxm implements zzazp {
    public zzazn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.zzazp
    public final com.google.android.gms.ads.internal.client.zzbu zze() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzazp
    public final com.google.android.gms.ads.internal.client.zzdn zzf() {
        Parcel zzdb = zzdb(5, zza());
        com.google.android.gms.ads.internal.client.zzdn zzb = com.google.android.gms.ads.internal.client.zzdm.zzb(zzdb.readStrongBinder());
        zzdb.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzazp
    public final void zzg(boolean z10) {
        Parcel zza = zza();
        int i10 = zzaxo.zza;
        zza.writeInt(z10 ? 1 : 0);
        zzdc(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzazp
    public final void zzh(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        Parcel zza = zza();
        zzaxo.zzf(zza, zzdgVar);
        zzdc(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzazp
    public final void zzi(IObjectWrapper iObjectWrapper, zzazw zzazwVar) {
        Parcel zza = zza();
        zzaxo.zzf(zza, iObjectWrapper);
        zzaxo.zzf(zza, zzazwVar);
        zzdc(4, zza);
    }
}
