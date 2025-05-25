package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public abstract class zzbyi extends zzaxn implements zzbyj {
    public zzbyi() {
        super("com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzaxn
    public final boolean zzdF(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return false;
                }
                zzaxo.zzc(parcel);
                zzc(parcel.readString(), parcel.readString(), (Bundle) zzaxo.zza(parcel, Bundle.CREATOR));
            } else {
                String readString = parcel.readString();
                zzaxo.zzc(parcel);
                zzb(readString);
            }
        } else {
            parcel.readString();
            parcel.readString();
            zzaxo.zzc(parcel);
        }
        parcel2.writeNoException();
        return true;
    }
}
