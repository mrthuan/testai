package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public abstract class zzblj extends zzaxn implements zzblk {
    public zzblj() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    @Override // com.google.android.gms.internal.ads.zzaxn
    public final boolean zzdF(int i10, Parcel parcel, Parcel parcel2, int i11) {
        zzbln zzbllVar;
        if (i10 != 3) {
            if (i10 != 4) {
                if (i10 != 5) {
                    if (i10 != 6) {
                        if (i10 != 7) {
                            return false;
                        }
                        zzbfa zzc = zzc();
                        parcel2.writeNoException();
                        zzaxo.zzf(parcel2, zzc);
                        return true;
                    }
                    IObjectWrapper K = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                    zzaxo.zzc(parcel);
                    zze(K);
                    parcel2.writeNoException();
                    return true;
                }
                IObjectWrapper K2 = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzbllVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                    if (queryLocalInterface instanceof zzbln) {
                        zzbllVar = (zzbln) queryLocalInterface;
                    } else {
                        zzbllVar = new zzbll(readStrongBinder);
                    }
                }
                zzaxo.zzc(parcel);
                zzf(K2, zzbllVar);
                parcel2.writeNoException();
                return true;
            }
            zzd();
            parcel2.writeNoException();
            return true;
        }
        com.google.android.gms.ads.internal.client.zzdq zzb = zzb();
        parcel2.writeNoException();
        zzaxo.zzf(parcel2, zzb);
        return true;
    }
}
