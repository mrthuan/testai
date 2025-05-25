package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaxn;
import com.google.android.gms.internal.ads.zzaxo;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public abstract class zzdf extends zzaxn implements zzdg {
    public zzdf() {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    public static zzdg K(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        if (queryLocalInterface instanceof zzdg) {
            return (zzdg) queryLocalInterface;
        }
        return new zzde(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaxn
    public final boolean zzdF(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            if (i10 != 2) {
                return false;
            }
            boolean zzf = ((zzfe) this).zzf();
            parcel2.writeNoException();
            int i12 = zzaxo.zza;
            parcel2.writeInt(zzf ? 1 : 0);
        } else {
            zzaxo.zzc(parcel);
            ((zzfe) this).Y((zzs) zzaxo.zza(parcel, zzs.CREATOR));
            parcel2.writeNoException();
        }
        return true;
    }
}
