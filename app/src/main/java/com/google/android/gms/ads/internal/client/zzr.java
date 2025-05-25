package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public final class zzr implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int t4 = SafeParcelReader.t(parcel);
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        int i12 = 0;
        int i13 = 0;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = false;
        String str = null;
        zzq[] zzqVarArr = null;
        while (parcel.dataPosition() < t4) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = SafeParcelReader.f(readInt, parcel);
                    break;
                case 3:
                    i10 = SafeParcelReader.o(readInt, parcel);
                    break;
                case 4:
                    i11 = SafeParcelReader.o(readInt, parcel);
                    break;
                case 5:
                    z10 = SafeParcelReader.l(readInt, parcel);
                    break;
                case 6:
                    i12 = SafeParcelReader.o(readInt, parcel);
                    break;
                case 7:
                    i13 = SafeParcelReader.o(readInt, parcel);
                    break;
                case '\b':
                    zzqVarArr = (zzq[]) SafeParcelReader.i(parcel, readInt, zzq.CREATOR);
                    break;
                case '\t':
                    z11 = SafeParcelReader.l(readInt, parcel);
                    break;
                case '\n':
                    z12 = SafeParcelReader.l(readInt, parcel);
                    break;
                case 11:
                    z13 = SafeParcelReader.l(readInt, parcel);
                    break;
                case '\f':
                    z14 = SafeParcelReader.l(readInt, parcel);
                    break;
                case '\r':
                    z15 = SafeParcelReader.l(readInt, parcel);
                    break;
                case 14:
                    z16 = SafeParcelReader.l(readInt, parcel);
                    break;
                case 15:
                    z17 = SafeParcelReader.l(readInt, parcel);
                    break;
                case 16:
                    z18 = SafeParcelReader.l(readInt, parcel);
                    break;
                default:
                    SafeParcelReader.s(readInt, parcel);
                    break;
            }
        }
        SafeParcelReader.k(t4, parcel);
        return new zzq(str, i10, i11, z10, i12, i13, zzqVarArr, z11, z12, z13, z14, z15, z16, z17, z18);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzq[i10];
    }
}
