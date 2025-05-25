package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaxm;
import com.google.android.gms.internal.ads.zzaxo;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public final class zzde extends zzaxm implements zzdg {
    public zzde(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdg
    public final void Y(zzs zzsVar) {
        Parcel zza = zza();
        zzaxo.zzd(zza, zzsVar);
        zzdc(1, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdg
    public final boolean zzf() {
        Parcel zzdb = zzdb(2, zza());
        boolean zzg = zzaxo.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }
}
