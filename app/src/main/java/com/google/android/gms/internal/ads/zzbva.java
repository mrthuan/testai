package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbva implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int t4 = SafeParcelReader.t(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < t4) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 2) {
                SafeParcelReader.s(readInt, parcel);
            } else {
                parcelFileDescriptor = (ParcelFileDescriptor) SafeParcelReader.e(parcel, readInt, ParcelFileDescriptor.CREATOR);
            }
        }
        SafeParcelReader.k(t4, parcel);
        return new zzbuz(parcelFileDescriptor);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzbuz[i10];
    }
}
