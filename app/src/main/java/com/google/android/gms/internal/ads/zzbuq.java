package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public abstract class zzbuq extends zzaxn implements zzbur {
    public zzbuq() {
        super("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzaxn
    public final boolean zzdF(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            if (i10 != 2) {
                return false;
            }
            zzaxo.zzc(parcel);
            zze((com.google.android.gms.ads.internal.util.zzbb) zzaxo.zza(parcel, com.google.android.gms.ads.internal.util.zzbb.CREATOR));
        } else {
            zzaxo.zzc(parcel);
            zzf((ParcelFileDescriptor) zzaxo.zza(parcel, ParcelFileDescriptor.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
