package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public final class zac implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int t4 = SafeParcelReader.t(parcel);
        ArrayList arrayList = null;
        String str = null;
        boolean z10 = false;
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
                            str = SafeParcelReader.f(readInt, parcel);
                        }
                    } else {
                        str2 = SafeParcelReader.f(readInt, parcel);
                    }
                } else {
                    z10 = SafeParcelReader.l(readInt, parcel);
                }
            } else {
                arrayList = SafeParcelReader.j(parcel, readInt, Feature.CREATOR);
            }
        }
        SafeParcelReader.k(t4, parcel);
        return new ApiFeatureRequest(arrayList, z10, str2, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new ApiFeatureRequest[i10];
    }
}
