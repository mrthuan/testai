package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes2.dex */
public final class zzo implements Parcelable.Creator<ActivityTransitionRequest> {
    @Override // android.os.Parcelable.Creator
    public final ActivityTransitionRequest createFromParcel(Parcel parcel) {
        int t4 = SafeParcelReader.t(parcel);
        ArrayList arrayList = null;
        String str = null;
        ArrayList arrayList2 = null;
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
                        arrayList2 = SafeParcelReader.j(parcel, readInt, ClientIdentity.CREATOR);
                    }
                } else {
                    str = SafeParcelReader.f(readInt, parcel);
                }
            } else {
                arrayList = SafeParcelReader.j(parcel, readInt, ActivityTransition.CREATOR);
            }
        }
        SafeParcelReader.k(t4, parcel);
        return new ActivityTransitionRequest(arrayList, str, arrayList2, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ActivityTransitionRequest[] newArray(int i10) {
        return new ActivityTransitionRequest[i10];
    }
}
