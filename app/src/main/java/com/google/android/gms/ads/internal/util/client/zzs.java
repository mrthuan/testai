package com.google.android.gms.ads.internal.util.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public final class zzs implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int t4 = SafeParcelReader.t(parcel);
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        boolean z11 = false;
        String str = null;
        while (parcel.dataPosition() < t4) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 2) {
                if (c != 3) {
                    if (c != 4) {
                        if (c != 5) {
                            if (c != 6) {
                                SafeParcelReader.s(readInt, parcel);
                            } else {
                                z11 = SafeParcelReader.l(readInt, parcel);
                            }
                        } else {
                            z10 = SafeParcelReader.l(readInt, parcel);
                        }
                    } else {
                        i11 = SafeParcelReader.o(readInt, parcel);
                    }
                } else {
                    i10 = SafeParcelReader.o(readInt, parcel);
                }
            } else {
                str = SafeParcelReader.f(readInt, parcel);
            }
        }
        SafeParcelReader.k(t4, parcel);
        return new VersionInfoParcel(str, i10, i11, z10, z11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new VersionInfoParcel[i10];
    }
}
