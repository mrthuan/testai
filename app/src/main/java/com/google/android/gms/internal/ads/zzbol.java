package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public abstract class zzbol extends zzaxn implements zzbom {
    public zzbol() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static zzbom zzf(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        if (queryLocalInterface instanceof zzbom) {
            return (zzbom) queryLocalInterface;
        }
        return new zzbok(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaxn
    public final boolean zzdF(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        return false;
                    }
                    String readString = parcel.readString();
                    zzaxo.zzc(parcel);
                    boolean zzd = zzd(readString);
                    parcel2.writeNoException();
                    parcel2.writeInt(zzd ? 1 : 0);
                } else {
                    String readString2 = parcel.readString();
                    zzaxo.zzc(parcel);
                    zzbql zzc = zzc(readString2);
                    parcel2.writeNoException();
                    zzaxo.zzf(parcel2, zzc);
                }
            } else {
                String readString3 = parcel.readString();
                zzaxo.zzc(parcel);
                boolean zze = zze(readString3);
                parcel2.writeNoException();
                parcel2.writeInt(zze ? 1 : 0);
            }
        } else {
            String readString4 = parcel.readString();
            zzaxo.zzc(parcel);
            zzbop zzb = zzb(readString4);
            parcel2.writeNoException();
            zzaxo.zzf(parcel2, zzb);
        }
        return true;
    }
}
