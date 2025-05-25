package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbaf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int t4 = SafeParcelReader.t(parcel);
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        long j10 = 0;
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < t4) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 2) {
                if (c != 3) {
                    if (c != 4) {
                        if (c != 5) {
                            if (c != 6) {
                                SafeParcelReader.s(readInt, parcel);
                            } else {
                                z12 = SafeParcelReader.l(readInt, parcel);
                            }
                        } else {
                            j10 = SafeParcelReader.p(readInt, parcel);
                        }
                    } else {
                        z11 = SafeParcelReader.l(readInt, parcel);
                    }
                } else {
                    z10 = SafeParcelReader.l(readInt, parcel);
                }
            } else {
                parcelFileDescriptor = (ParcelFileDescriptor) SafeParcelReader.e(parcel, readInt, ParcelFileDescriptor.CREATOR);
            }
        }
        SafeParcelReader.k(t4, parcel);
        return new zzbae(parcelFileDescriptor, z10, z11, j10, z12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzbae[i10];
    }
}
