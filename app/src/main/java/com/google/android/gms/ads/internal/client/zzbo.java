package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaxm;
import com.google.android.gms.internal.ads.zzaxo;
import com.google.android.gms.internal.ads.zzbes;
import com.google.android.gms.internal.ads.zzbgh;
import com.google.android.gms.internal.ads.zzbgk;
import com.google.android.gms.internal.ads.zzbgr;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public final class zzbo extends zzaxm implements zzbq {
    public zzbo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final zzbn zze() {
        zzbn zzblVar;
        Parcel zzdb = zzdb(1, zza());
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzblVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            if (queryLocalInterface instanceof zzbn) {
                zzblVar = (zzbn) queryLocalInterface;
            } else {
                zzblVar = new zzbl(readStrongBinder);
            }
        }
        zzdb.recycle();
        return zzblVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzh(String str, zzbgk zzbgkVar, zzbgh zzbghVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zzaxo.zzf(zza, zzbgkVar);
        zzaxo.zzf(zza, zzbghVar);
        zzdc(5, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzk(zzbgr zzbgrVar) {
        Parcel zza = zza();
        zzaxo.zzf(zza, zzbgrVar);
        zzdc(10, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzl(zzbh zzbhVar) {
        Parcel zza = zza();
        zzaxo.zzf(zza, zzbhVar);
        zzdc(2, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzo(zzbes zzbesVar) {
        Parcel zza = zza();
        zzaxo.zzd(zza, zzbesVar);
        zzdc(6, zza);
    }
}
