package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbff extends zzaxm implements zzbfh {
    public zzbff(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    @Override // com.google.android.gms.internal.ads.zzbfh
    public final IObjectWrapper zzb(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        return a0.a.d(zzdb(2, zza));
    }

    @Override // com.google.android.gms.internal.ads.zzbfh
    public final void zzc() {
        zzdc(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbfh
    public final void zzd(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzaxo.zzf(zza, iObjectWrapper);
        zzdc(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfh
    public final void zzdv(String str, IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zza.writeString(str);
        zzaxo.zzf(zza, iObjectWrapper);
        zzdc(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfh
    public final void zzdw(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzaxo.zzf(zza, iObjectWrapper);
        zzdc(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfh
    public final void zzdx(zzbfa zzbfaVar) {
        Parcel zza = zza();
        zzaxo.zzf(zza, zzbfaVar);
        zzdc(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfh
    public final void zzdy(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzaxo.zzf(zza, iObjectWrapper);
        zzdc(9, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfh
    public final void zzdz(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzaxo.zzf(zza, iObjectWrapper);
        zzdc(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfh
    public final void zze(IObjectWrapper iObjectWrapper, int i10) {
        Parcel zza = zza();
        zzaxo.zzf(zza, iObjectWrapper);
        zza.writeInt(i10);
        zzdc(5, zza);
    }
}
