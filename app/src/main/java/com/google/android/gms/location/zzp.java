package com.google.android.gms.location;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes2.dex */
public final class zzp implements Parcelable.Creator<ActivityTransitionResult> {
    @Override // android.os.Parcelable.Creator
    public final ActivityTransitionResult createFromParcel(Parcel parcel) {
        int t4 = SafeParcelReader.t(parcel);
        ArrayList arrayList = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < t4) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                if (c != 2) {
                    SafeParcelReader.s(readInt, parcel);
                } else {
                    bundle = SafeParcelReader.b(readInt, parcel);
                }
            } else {
                arrayList = SafeParcelReader.j(parcel, readInt, ActivityTransitionEvent.CREATOR);
            }
        }
        SafeParcelReader.k(t4, parcel);
        return new ActivityTransitionResult(arrayList, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ActivityTransitionResult[] newArray(int i10) {
        return new ActivityTransitionResult[i10];
    }
}
