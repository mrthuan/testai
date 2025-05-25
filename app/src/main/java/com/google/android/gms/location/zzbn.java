package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes2.dex */
public final class zzbn implements Parcelable.Creator<LocationSettingsStates> {
    @Override // android.os.Parcelable.Creator
    public final LocationSettingsStates createFromParcel(Parcel parcel) {
        int t4 = SafeParcelReader.t(parcel);
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        while (parcel.dataPosition() < t4) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    z10 = SafeParcelReader.l(readInt, parcel);
                    break;
                case 2:
                    z11 = SafeParcelReader.l(readInt, parcel);
                    break;
                case 3:
                    z12 = SafeParcelReader.l(readInt, parcel);
                    break;
                case 4:
                    z13 = SafeParcelReader.l(readInt, parcel);
                    break;
                case 5:
                    z14 = SafeParcelReader.l(readInt, parcel);
                    break;
                case 6:
                    z15 = SafeParcelReader.l(readInt, parcel);
                    break;
                default:
                    SafeParcelReader.s(readInt, parcel);
                    break;
            }
        }
        SafeParcelReader.k(t4, parcel);
        return new LocationSettingsStates(z10, z11, z12, z13, z14, z15);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationSettingsStates[] newArray(int i10) {
        return new LocationSettingsStates[i10];
    }
}
