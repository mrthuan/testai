package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaxn;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public abstract class zzcv extends zzaxn implements zzcw {
    public zzcv() {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    public static zzcw K(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        if (queryLocalInterface instanceof zzcw) {
            return (zzcw) queryLocalInterface;
        }
        return new zzcu(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaxn
    public final boolean zzdF(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            if (i10 != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeString(((zzel) this).f10177b);
        } else {
            parcel2.writeNoException();
            parcel2.writeString(((zzel) this).f10176a);
        }
        return true;
    }
}
