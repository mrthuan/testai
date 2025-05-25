package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzaxm;
import com.google.android.gms.internal.ads.zzaxo;
import com.google.android.gms.internal.ads.zzbkv;
import com.google.android.gms.internal.ads.zzblc;
import com.google.android.gms.internal.ads.zzbom;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public final class zzcm extends zzaxm implements zzco {
    public zzcm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final float zze() {
        Parcel zzdb = zzdb(7, zza());
        float readFloat = zzdb.readFloat();
        zzdb.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final List zzg() {
        Parcel zzdb = zzdb(13, zza());
        ArrayList createTypedArrayList = zzdb.createTypedArrayList(zzbkv.CREATOR);
        zzdb.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzk() {
        zzdc(1, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzl(String str, IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zza.writeString(null);
        zzaxo.zzf(zza, iObjectWrapper);
        zzdc(6, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzm(zzda zzdaVar) {
        Parcel zza = zza();
        zzaxo.zzf(zza, zzdaVar);
        zzdc(16, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzo(zzbom zzbomVar) {
        Parcel zza = zza();
        zzaxo.zzf(zza, zzbomVar);
        zzdc(11, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzp(boolean z10) {
        Parcel zza = zza();
        int i10 = zzaxo.zza;
        zza.writeInt(z10 ? 1 : 0);
        zzdc(4, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzs(zzblc zzblcVar) {
        Parcel zza = zza();
        zzaxo.zzf(zza, zzblcVar);
        zzdc(12, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzt(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzdc(18, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzu(zzff zzffVar) {
        Parcel zza = zza();
        zzaxo.zzd(zza, zzffVar);
        zzdc(14, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final boolean zzv() {
        Parcel zzdb = zzdb(8, zza());
        boolean zzg = zzaxo.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }
}
