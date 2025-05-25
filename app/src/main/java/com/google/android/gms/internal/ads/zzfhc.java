package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfhc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int t4 = SafeParcelReader.t(parcel);
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        String str = null;
        while (parcel.dataPosition() < t4) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i10 = SafeParcelReader.o(readInt, parcel);
                    break;
                case 2:
                    i11 = SafeParcelReader.o(readInt, parcel);
                    break;
                case 3:
                    i12 = SafeParcelReader.o(readInt, parcel);
                    break;
                case 4:
                    i13 = SafeParcelReader.o(readInt, parcel);
                    break;
                case 5:
                    str = SafeParcelReader.f(readInt, parcel);
                    break;
                case 6:
                    i14 = SafeParcelReader.o(readInt, parcel);
                    break;
                case 7:
                    i15 = SafeParcelReader.o(readInt, parcel);
                    break;
                default:
                    SafeParcelReader.s(readInt, parcel);
                    break;
            }
        }
        SafeParcelReader.k(t4, parcel);
        return new zzfhb(i10, i11, i12, i13, str, i14, i15);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzfhb[i10];
    }
}
