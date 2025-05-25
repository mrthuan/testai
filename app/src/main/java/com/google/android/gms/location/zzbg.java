package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes2.dex */
public final class zzbg implements Parcelable.Creator<LocationResult> {
    @Override // android.os.Parcelable.Creator
    public final LocationResult createFromParcel(Parcel parcel) {
        int t4 = SafeParcelReader.t(parcel);
        List<Location> list = LocationResult.f11462b;
        while (parcel.dataPosition() < t4) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                SafeParcelReader.s(readInt, parcel);
            } else {
                list = SafeParcelReader.j(parcel, readInt, Location.CREATOR);
            }
        }
        SafeParcelReader.k(t4, parcel);
        return new LocationResult(list);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationResult[] newArray(int i10) {
        return new LocationResult[i10];
    }
}
