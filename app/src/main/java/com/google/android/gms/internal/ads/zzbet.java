package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbet implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int t4 = SafeParcelReader.t(parcel);
        int i10 = 0;
        boolean z10 = false;
        int i11 = 0;
        boolean z11 = false;
        int i12 = 0;
        boolean z12 = false;
        int i13 = 0;
        int i14 = 0;
        boolean z13 = false;
        int i15 = 0;
        com.google.android.gms.ads.internal.client.zzfk zzfkVar = null;
        while (parcel.dataPosition() < t4) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i10 = SafeParcelReader.o(readInt, parcel);
                    break;
                case 2:
                    z10 = SafeParcelReader.l(readInt, parcel);
                    break;
                case 3:
                    i11 = SafeParcelReader.o(readInt, parcel);
                    break;
                case 4:
                    z11 = SafeParcelReader.l(readInt, parcel);
                    break;
                case 5:
                    i12 = SafeParcelReader.o(readInt, parcel);
                    break;
                case 6:
                    zzfkVar = (com.google.android.gms.ads.internal.client.zzfk) SafeParcelReader.e(parcel, readInt, com.google.android.gms.ads.internal.client.zzfk.CREATOR);
                    break;
                case 7:
                    z12 = SafeParcelReader.l(readInt, parcel);
                    break;
                case '\b':
                    i13 = SafeParcelReader.o(readInt, parcel);
                    break;
                case '\t':
                    i14 = SafeParcelReader.o(readInt, parcel);
                    break;
                case '\n':
                    z13 = SafeParcelReader.l(readInt, parcel);
                    break;
                case 11:
                    i15 = SafeParcelReader.o(readInt, parcel);
                    break;
                default:
                    SafeParcelReader.s(readInt, parcel);
                    break;
            }
        }
        SafeParcelReader.k(t4, parcel);
        return new zzbes(i10, z10, i11, z11, i12, zzfkVar, z12, i13, i14, z13, i15);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzbes[i10];
    }
}
