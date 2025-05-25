package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes2.dex */
public final class zzbk implements Parcelable.Creator<zzbj> {
    @Override // android.os.Parcelable.Creator
    public final zzbj createFromParcel(Parcel parcel) {
        int t4 = SafeParcelReader.t(parcel);
        String str = "";
        String str2 = "";
        String str3 = str2;
        while (parcel.dataPosition() < t4) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                if (c != 2) {
                    if (c != 5) {
                        SafeParcelReader.s(readInt, parcel);
                    } else {
                        str = SafeParcelReader.f(readInt, parcel);
                    }
                } else {
                    str3 = SafeParcelReader.f(readInt, parcel);
                }
            } else {
                str2 = SafeParcelReader.f(readInt, parcel);
            }
        }
        SafeParcelReader.k(t4, parcel);
        return new zzbj(str, str2, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzbj[] newArray(int i10) {
        return new zzbj[i10];
    }
}
