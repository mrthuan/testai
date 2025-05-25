package com.google.android.gms.appset;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
/* loaded from: classes.dex */
public final class zzd implements Parcelable.Creator<zzc> {
    @Override // android.os.Parcelable.Creator
    public final zzc createFromParcel(Parcel parcel) {
        int t4 = SafeParcelReader.t(parcel);
        String str = null;
        int i10 = 0;
        while (parcel.dataPosition() < t4) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                if (c != 2) {
                    SafeParcelReader.s(readInt, parcel);
                } else {
                    i10 = SafeParcelReader.o(readInt, parcel);
                }
            } else {
                str = SafeParcelReader.f(readInt, parcel);
            }
        }
        SafeParcelReader.k(t4, parcel);
        return new zzc(str, i10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzc[] newArray(int i10) {
        return new zzc[i10];
    }
}
