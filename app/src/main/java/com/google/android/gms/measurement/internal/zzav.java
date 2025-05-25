package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes2.dex */
public final class zzav implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int t4 = SafeParcelReader.t(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < t4) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 2) {
                SafeParcelReader.s(readInt, parcel);
            } else {
                bundle = SafeParcelReader.b(readInt, parcel);
            }
        }
        SafeParcelReader.k(t4, parcel);
        return new zzau(bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzau[i10];
    }
}
