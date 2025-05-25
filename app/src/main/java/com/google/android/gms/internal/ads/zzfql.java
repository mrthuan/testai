package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public abstract class zzfql extends zzaxn implements zzfqm {
    public zzfql() {
        super("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.android.gms.internal.ads.zzaxn
    public final boolean zzdF(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 2:
                IObjectWrapper.Stub.K(parcel.readStrongBinder());
                parcel.readString();
                zzaxo.zzc(parcel);
                break;
            case 3:
                break;
            case 4:
                parcel.createIntArray();
                zzaxo.zzc(parcel);
                break;
            case 5:
                parcel.createByteArray();
                zzaxo.zzc(parcel);
                break;
            case 6:
                parcel.readInt();
                zzaxo.zzc(parcel);
                break;
            case 7:
                parcel.readInt();
                zzaxo.zzc(parcel);
                break;
            case 8:
                IObjectWrapper.Stub.K(parcel.readStrongBinder());
                parcel.readString();
                parcel.readString();
                zzaxo.zzc(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
