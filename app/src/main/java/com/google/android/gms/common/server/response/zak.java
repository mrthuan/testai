package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.server.response.FastJsonResponse;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public final class zak implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int t4 = SafeParcelReader.t(parcel);
        String str = null;
        int i10 = 0;
        FastJsonResponse.Field field = null;
        while (parcel.dataPosition() < t4) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        SafeParcelReader.s(readInt, parcel);
                    } else {
                        field = (FastJsonResponse.Field) SafeParcelReader.e(parcel, readInt, FastJsonResponse.Field.CREATOR);
                    }
                } else {
                    str = SafeParcelReader.f(readInt, parcel);
                }
            } else {
                i10 = SafeParcelReader.o(readInt, parcel);
            }
        }
        SafeParcelReader.k(t4, parcel);
        return new zam(i10, str, field);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zam[i10];
    }
}
