package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes2.dex */
public final class zzbl implements Parcelable.Creator<LocationSettingsRequest> {
    @Override // android.os.Parcelable.Creator
    public final LocationSettingsRequest createFromParcel(Parcel parcel) {
        int t4 = SafeParcelReader.t(parcel);
        ArrayList arrayList = null;
        boolean z10 = false;
        boolean z11 = false;
        zzbj zzbjVar = null;
        while (parcel.dataPosition() < t4) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        if (c != 5) {
                            SafeParcelReader.s(readInt, parcel);
                        } else {
                            zzbjVar = (zzbj) SafeParcelReader.e(parcel, readInt, zzbj.CREATOR);
                        }
                    } else {
                        z11 = SafeParcelReader.l(readInt, parcel);
                    }
                } else {
                    z10 = SafeParcelReader.l(readInt, parcel);
                }
            } else {
                arrayList = SafeParcelReader.j(parcel, readInt, LocationRequest.CREATOR);
            }
        }
        SafeParcelReader.k(t4, parcel);
        return new LocationSettingsRequest(arrayList, z10, z11, zzbjVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationSettingsRequest[] newArray(int i10) {
        return new LocationSettingsRequest[i10];
    }
}
