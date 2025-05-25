package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public final class zaq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int t4 = SafeParcelReader.t(parcel);
        int i10 = 0;
        Parcel parcel2 = null;
        zan zanVar = null;
        while (parcel.dataPosition() < t4) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        SafeParcelReader.s(readInt, parcel);
                    } else {
                        zanVar = (zan) SafeParcelReader.e(parcel, readInt, zan.CREATOR);
                    }
                } else {
                    int r4 = SafeParcelReader.r(readInt, parcel);
                    int dataPosition = parcel.dataPosition();
                    if (r4 == 0) {
                        parcel2 = null;
                    } else {
                        Parcel obtain = Parcel.obtain();
                        obtain.appendFrom(parcel, dataPosition, r4);
                        parcel.setDataPosition(dataPosition + r4);
                        parcel2 = obtain;
                    }
                }
            } else {
                i10 = SafeParcelReader.o(readInt, parcel);
            }
        }
        SafeParcelReader.k(t4, parcel);
        return new SafeParcelResponse(i10, parcel2, zanVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new SafeParcelResponse[i10];
    }
}
