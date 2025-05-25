package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzboy extends zzaxm {
    public zzboy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    public final Bundle zze() {
        Parcel zzdb = zzdb(13, zza());
        Bundle bundle = (Bundle) zzaxo.zza(zzdb, Bundle.CREATOR);
        zzdb.recycle();
        return bundle;
    }

    public final com.google.android.gms.ads.internal.client.zzdq zzf() {
        Parcel zzdb = zzdb(16, zza());
        com.google.android.gms.ads.internal.client.zzdq zzb = com.google.android.gms.ads.internal.client.zzdp.zzb(zzdb.readStrongBinder());
        zzdb.recycle();
        return zzb;
    }

    public final zzbew zzg() {
        Parcel zzdb = zzdb(19, zza());
        zzbew zzj = zzbev.zzj(zzdb.readStrongBinder());
        zzdb.recycle();
        return zzj;
    }

    public final zzbfd zzh() {
        Parcel zzdb = zzdb(5, zza());
        zzbfd zzg = zzbfc.zzg(zzdb.readStrongBinder());
        zzdb.recycle();
        return zzg;
    }

    public final IObjectWrapper zzi() {
        return a0.a.d(zzdb(15, zza()));
    }

    public final IObjectWrapper zzj() {
        return a0.a.d(zzdb(20, zza()));
    }

    public final IObjectWrapper zzk() {
        return a0.a.d(zzdb(21, zza()));
    }

    public final String zzl() {
        Parcel zzdb = zzdb(7, zza());
        String readString = zzdb.readString();
        zzdb.recycle();
        return readString;
    }

    public final String zzm() {
        Parcel zzdb = zzdb(4, zza());
        String readString = zzdb.readString();
        zzdb.recycle();
        return readString;
    }

    public final String zzn() {
        Parcel zzdb = zzdb(6, zza());
        String readString = zzdb.readString();
        zzdb.recycle();
        return readString;
    }

    public final String zzo() {
        Parcel zzdb = zzdb(2, zza());
        String readString = zzdb.readString();
        zzdb.recycle();
        return readString;
    }

    public final List zzp() {
        Parcel zzdb = zzdb(3, zza());
        ArrayList zzb = zzaxo.zzb(zzdb);
        zzdb.recycle();
        return zzb;
    }

    public final void zzq(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzaxo.zzf(zza, iObjectWrapper);
        zzdc(9, zza);
    }

    public final void zzr() {
        zzdc(8, zza());
    }

    public final void zzs(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzaxo.zzf(zza, iObjectWrapper);
        zzdc(10, zza);
    }

    public final void zzt(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        Parcel zza = zza();
        zzaxo.zzf(zza, iObjectWrapper);
        zzaxo.zzf(zza, iObjectWrapper2);
        zzaxo.zzf(zza, iObjectWrapper3);
        zzdc(22, zza);
    }

    public final void zzu(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzaxo.zzf(zza, iObjectWrapper);
        zzdc(14, zza);
    }

    public final boolean zzv() {
        Parcel zzdb = zzdb(12, zza());
        boolean zzg = zzaxo.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }

    public final boolean zzw() {
        Parcel zzdb = zzdb(11, zza());
        boolean zzg = zzaxo.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }
}
