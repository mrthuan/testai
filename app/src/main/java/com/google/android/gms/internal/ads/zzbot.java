package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbot extends zzaxm implements zzbov {
    public zzbot(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbov
    public final IObjectWrapper zze() {
        return a0.a.d(zzdb(1, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbov
    public final boolean zzf() {
        Parcel zzdb = zzdb(2, zza());
        boolean zzg = zzaxo.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }
}
