package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public final class zzfl implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int t4 = SafeParcelReader.t(parcel);
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        while (parcel.dataPosition() < t4) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 2) {
                if (c != 3) {
                    if (c != 4) {
                        SafeParcelReader.s(readInt, parcel);
                    } else {
                        z12 = SafeParcelReader.l(readInt, parcel);
                    }
                } else {
                    z11 = SafeParcelReader.l(readInt, parcel);
                }
            } else {
                z10 = SafeParcelReader.l(readInt, parcel);
            }
        }
        SafeParcelReader.k(t4, parcel);
        return new zzfk(z10, z11, z12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzfk[i10];
    }
}
