package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public final class zaab implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int t4 = SafeParcelReader.t(parcel);
        ArrayList arrayList = null;
        int i10 = 0;
        while (parcel.dataPosition() < t4) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                if (c != 2) {
                    SafeParcelReader.s(readInt, parcel);
                } else {
                    arrayList = SafeParcelReader.j(parcel, readInt, MethodInvocation.CREATOR);
                }
            } else {
                i10 = SafeParcelReader.o(readInt, parcel);
            }
        }
        SafeParcelReader.k(t4, parcel);
        return new TelemetryData(i10, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new TelemetryData[i10];
    }
}
