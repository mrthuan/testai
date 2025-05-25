package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzboz extends zzaxm implements zzbpb {
    public zzboz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    @Override // com.google.android.gms.internal.ads.zzbpb
    public final boolean zzA() {
        Parcel zzdb = zzdb(18, zza());
        boolean zzg = zzaxo.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbpb
    public final boolean zzB() {
        Parcel zzdb = zzdb(17, zza());
        boolean zzg = zzaxo.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbpb
    public final double zze() {
        Parcel zzdb = zzdb(8, zza());
        double readDouble = zzdb.readDouble();
        zzdb.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.zzbpb
    public final float zzf() {
        Parcel zzdb = zzdb(23, zza());
        float readFloat = zzdb.readFloat();
        zzdb.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbpb
    public final float zzg() {
        Parcel zzdb = zzdb(25, zza());
        float readFloat = zzdb.readFloat();
        zzdb.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbpb
    public final float zzh() {
        Parcel zzdb = zzdb(24, zza());
        float readFloat = zzdb.readFloat();
        zzdb.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbpb
    public final Bundle zzi() {
        Parcel zzdb = zzdb(16, zza());
        Bundle bundle = (Bundle) zzaxo.zza(zzdb, Bundle.CREATOR);
        zzdb.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbpb
    public final com.google.android.gms.ads.internal.client.zzdq zzj() {
        Parcel zzdb = zzdb(11, zza());
        com.google.android.gms.ads.internal.client.zzdq zzb = com.google.android.gms.ads.internal.client.zzdp.zzb(zzdb.readStrongBinder());
        zzdb.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbpb
    public final zzbew zzk() {
        Parcel zzdb = zzdb(12, zza());
        zzbew zzj = zzbev.zzj(zzdb.readStrongBinder());
        zzdb.recycle();
        return zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzbpb
    public final zzbfd zzl() {
        Parcel zzdb = zzdb(5, zza());
        zzbfd zzg = zzbfc.zzg(zzdb.readStrongBinder());
        zzdb.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbpb
    public final IObjectWrapper zzm() {
        return a0.a.d(zzdb(13, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbpb
    public final IObjectWrapper zzn() {
        return a0.a.d(zzdb(14, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbpb
    public final IObjectWrapper zzo() {
        return a0.a.d(zzdb(15, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbpb
    public final String zzp() {
        Parcel zzdb = zzdb(7, zza());
        String readString = zzdb.readString();
        zzdb.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbpb
    public final String zzq() {
        Parcel zzdb = zzdb(4, zza());
        String readString = zzdb.readString();
        zzdb.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbpb
    public final String zzr() {
        Parcel zzdb = zzdb(6, zza());
        String readString = zzdb.readString();
        zzdb.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbpb
    public final String zzs() {
        Parcel zzdb = zzdb(2, zza());
        String readString = zzdb.readString();
        zzdb.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbpb
    public final String zzt() {
        Parcel zzdb = zzdb(10, zza());
        String readString = zzdb.readString();
        zzdb.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbpb
    public final String zzu() {
        Parcel zzdb = zzdb(9, zza());
        String readString = zzdb.readString();
        zzdb.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbpb
    public final List zzv() {
        Parcel zzdb = zzdb(3, zza());
        ArrayList zzb = zzaxo.zzb(zzdb);
        zzdb.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbpb
    public final void zzw(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzaxo.zzf(zza, iObjectWrapper);
        zzdc(20, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpb
    public final void zzx() {
        zzdc(19, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpb
    public final void zzy(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        Parcel zza = zza();
        zzaxo.zzf(zza, iObjectWrapper);
        zzaxo.zzf(zza, iObjectWrapper2);
        zzaxo.zzf(zza, iObjectWrapper3);
        zzdc(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpb
    public final void zzz(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzaxo.zzf(zza, iObjectWrapper);
        zzdc(22, zza);
    }
}
