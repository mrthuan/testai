package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes2.dex */
public final class zzbe implements Parcelable.Creator<LocationAvailability> {
    @Override // android.os.Parcelable.Creator
    public final LocationAvailability createFromParcel(Parcel parcel) {
        int t4 = SafeParcelReader.t(parcel);
        int i10 = 1000;
        int i11 = 1;
        int i12 = 1;
        long j10 = 0;
        zzbo[] zzboVarArr = null;
        while (parcel.dataPosition() < t4) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            if (c != 5) {
                                SafeParcelReader.s(readInt, parcel);
                            } else {
                                zzboVarArr = (zzbo[]) SafeParcelReader.i(parcel, readInt, zzbo.CREATOR);
                            }
                        } else {
                            i10 = SafeParcelReader.o(readInt, parcel);
                        }
                    } else {
                        j10 = SafeParcelReader.p(readInt, parcel);
                    }
                } else {
                    i12 = SafeParcelReader.o(readInt, parcel);
                }
            } else {
                i11 = SafeParcelReader.o(readInt, parcel);
            }
        }
        SafeParcelReader.k(t4, parcel);
        return new LocationAvailability(i10, i11, i12, j10, zzboVarArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationAvailability[] newArray(int i10) {
        return new LocationAvailability[i10];
    }
}
