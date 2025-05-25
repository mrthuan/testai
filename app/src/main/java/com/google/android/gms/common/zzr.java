package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes.dex */
public final class zzr implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int t4 = SafeParcelReader.t(parcel);
        boolean z10 = false;
        int i10 = 0;
        String str = null;
        int i11 = 0;
        while (parcel.dataPosition() < t4) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            SafeParcelReader.s(readInt, parcel);
                        } else {
                            i10 = SafeParcelReader.o(readInt, parcel);
                        }
                    } else {
                        i11 = SafeParcelReader.o(readInt, parcel);
                    }
                } else {
                    str = SafeParcelReader.f(readInt, parcel);
                }
            } else {
                z10 = SafeParcelReader.l(readInt, parcel);
            }
        }
        SafeParcelReader.k(t4, parcel);
        return new zzq(i11, i10, str, z10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzq[i10];
    }
}
