package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes2.dex */
public final class zzau implements Parcelable.Creator<GeofencingRequest> {
    @Override // android.os.Parcelable.Creator
    public final GeofencingRequest createFromParcel(Parcel parcel) {
        int t4 = SafeParcelReader.t(parcel);
        String str = "";
        ArrayList arrayList = null;
        int i10 = 0;
        String str2 = null;
        while (parcel.dataPosition() < t4) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            SafeParcelReader.s(readInt, parcel);
                        } else {
                            str2 = SafeParcelReader.f(readInt, parcel);
                        }
                    } else {
                        str = SafeParcelReader.f(readInt, parcel);
                    }
                } else {
                    i10 = SafeParcelReader.o(readInt, parcel);
                }
            } else {
                arrayList = SafeParcelReader.j(parcel, readInt, com.google.android.gms.internal.location.zzbe.CREATOR);
            }
        }
        SafeParcelReader.k(t4, parcel);
        return new GeofencingRequest(str, arrayList, i10, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GeofencingRequest[] newArray(int i10) {
        return new GeofencingRequest[i10];
    }
}
