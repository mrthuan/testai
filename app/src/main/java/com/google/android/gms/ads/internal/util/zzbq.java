package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import com.google.android.gms.ads.internal.offline.buffering.zza;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzaxn;
import com.google.android.gms.internal.ads.zzaxo;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public abstract class zzbq extends zzaxn implements zzbr {
    public zzbq() {
        super("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override // com.google.android.gms.internal.ads.zzaxn
    public final boolean zzdF(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return false;
                }
                zzaxo.zzc(parcel);
                boolean zzg = zzg(IObjectWrapper.Stub.K(parcel.readStrongBinder()), (zza) zzaxo.zza(parcel, zza.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(zzg ? 1 : 0);
            } else {
                IObjectWrapper K = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                zzaxo.zzc(parcel);
                zze(K);
                parcel2.writeNoException();
            }
        } else {
            IObjectWrapper K2 = IObjectWrapper.Stub.K(parcel.readStrongBinder());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            zzaxo.zzc(parcel);
            boolean zzf = zzf(K2, readString, readString2);
            parcel2.writeNoException();
            parcel2.writeInt(zzf ? 1 : 0);
        }
        return true;
    }
}
