package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public abstract class zzbpy extends zzaxn implements zzbpz {
    public zzbpy() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzaxn
    public final boolean zzdF(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        return false;
                    }
                    zzbov zzb = zzbou.zzb(parcel.readStrongBinder());
                    zzaxo.zzc(parcel);
                    zzh(zzb);
                } else {
                    zzaxo.zzc(parcel);
                    zzf((com.google.android.gms.ads.internal.client.zze) zzaxo.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR));
                }
            } else {
                String readString = parcel.readString();
                zzaxo.zzc(parcel);
                zze(readString);
            }
        } else {
            IObjectWrapper K = IObjectWrapper.Stub.K(parcel.readStrongBinder());
            zzaxo.zzc(parcel);
            zzg(K);
        }
        parcel2.writeNoException();
        return true;
    }
}
