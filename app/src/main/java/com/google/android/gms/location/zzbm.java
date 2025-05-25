package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes2.dex */
public final class zzbm implements Parcelable.Creator<LocationSettingsResult> {
    @Override // android.os.Parcelable.Creator
    public final LocationSettingsResult createFromParcel(Parcel parcel) {
        int t4 = SafeParcelReader.t(parcel);
        Status status = null;
        LocationSettingsStates locationSettingsStates = null;
        while (parcel.dataPosition() < t4) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                if (c != 2) {
                    SafeParcelReader.s(readInt, parcel);
                } else {
                    locationSettingsStates = (LocationSettingsStates) SafeParcelReader.e(parcel, readInt, LocationSettingsStates.CREATOR);
                }
            } else {
                status = (Status) SafeParcelReader.e(parcel, readInt, Status.CREATOR);
            }
        }
        SafeParcelReader.k(t4, parcel);
        return new LocationSettingsResult(status, locationSettingsStates);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationSettingsResult[] newArray(int i10) {
        return new LocationSettingsResult[i10];
    }
}
