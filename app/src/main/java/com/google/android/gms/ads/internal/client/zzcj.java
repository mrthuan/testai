package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaxm;
import com.google.android.gms.internal.ads.zzaxo;
import com.google.android.gms.internal.ads.zzbol;
import com.google.android.gms.internal.ads.zzbom;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public final class zzcj extends zzaxm implements zzcl {
    public zzcj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcl
    public final zzbom getAdapterCreator() {
        Parcel zzdb = zzdb(2, zza());
        zzbom zzf = zzbol.zzf(zzdb.readStrongBinder());
        zzdb.recycle();
        return zzf;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcl
    public final zzen getLiteSdkVersion() {
        Parcel zzdb = zzdb(1, zza());
        zzen zzenVar = (zzen) zzaxo.zza(zzdb, zzen.CREATOR);
        zzdb.recycle();
        return zzenVar;
    }
}
