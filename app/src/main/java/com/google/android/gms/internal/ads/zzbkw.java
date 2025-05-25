package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbkw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int t4 = SafeParcelReader.t(parcel);
        String str = null;
        boolean z10 = false;
        int i10 = 0;
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
                        i10 = SafeParcelReader.o(readInt, parcel);
                    }
                } else {
                    z10 = SafeParcelReader.l(readInt, parcel);
                }
            } else {
                str = SafeParcelReader.f(readInt, parcel);
            }
        }
        SafeParcelReader.k(t4, parcel);
        return new zzbkv(str, z10, i10, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzbkv[i10];
    }
}
