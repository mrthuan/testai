package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes2.dex */
public final class zzr implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z10;
        int t4 = SafeParcelReader.t(parcel);
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        long j15 = 0;
        boolean z11 = false;
        int i10 = 0;
        boolean z12 = false;
        boolean z13 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Boolean bool = null;
        ArrayList arrayList = null;
        String str8 = null;
        String str9 = null;
        String str10 = "";
        String str11 = str10;
        boolean z14 = true;
        boolean z15 = true;
        long j16 = -2147483648L;
        while (parcel.dataPosition() < t4) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = SafeParcelReader.f(readInt, parcel);
                    break;
                case 3:
                    str2 = SafeParcelReader.f(readInt, parcel);
                    break;
                case 4:
                    str3 = SafeParcelReader.f(readInt, parcel);
                    break;
                case 5:
                    str4 = SafeParcelReader.f(readInt, parcel);
                    break;
                case 6:
                    j10 = SafeParcelReader.p(readInt, parcel);
                    break;
                case 7:
                    j11 = SafeParcelReader.p(readInt, parcel);
                    break;
                case '\b':
                    str5 = SafeParcelReader.f(readInt, parcel);
                    break;
                case '\t':
                    z14 = SafeParcelReader.l(readInt, parcel);
                    break;
                case '\n':
                    z11 = SafeParcelReader.l(readInt, parcel);
                    break;
                case 11:
                    j16 = SafeParcelReader.p(readInt, parcel);
                    break;
                case '\f':
                    str6 = SafeParcelReader.f(readInt, parcel);
                    break;
                case '\r':
                    j12 = SafeParcelReader.p(readInt, parcel);
                    break;
                case 14:
                    j13 = SafeParcelReader.p(readInt, parcel);
                    break;
                case 15:
                    i10 = SafeParcelReader.o(readInt, parcel);
                    break;
                case 16:
                    z15 = SafeParcelReader.l(readInt, parcel);
                    break;
                case 17:
                case 20:
                default:
                    SafeParcelReader.s(readInt, parcel);
                    break;
                case 18:
                    z12 = SafeParcelReader.l(readInt, parcel);
                    break;
                case 19:
                    str7 = SafeParcelReader.f(readInt, parcel);
                    break;
                case 21:
                    int r4 = SafeParcelReader.r(readInt, parcel);
                    if (r4 == 0) {
                        bool = null;
                        break;
                    } else {
                        SafeParcelReader.u(parcel, r4, 4);
                        if (parcel.readInt() != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        bool = Boolean.valueOf(z10);
                        break;
                    }
                case 22:
                    j14 = SafeParcelReader.p(readInt, parcel);
                    break;
                case 23:
                    arrayList = SafeParcelReader.h(readInt, parcel);
                    break;
                case 24:
                    str8 = SafeParcelReader.f(readInt, parcel);
                    break;
                case 25:
                    str10 = SafeParcelReader.f(readInt, parcel);
                    break;
                case 26:
                    str11 = SafeParcelReader.f(readInt, parcel);
                    break;
                case 27:
                    str9 = SafeParcelReader.f(readInt, parcel);
                    break;
                case 28:
                    z13 = SafeParcelReader.l(readInt, parcel);
                    break;
                case 29:
                    j15 = SafeParcelReader.p(readInt, parcel);
                    break;
            }
        }
        SafeParcelReader.k(t4, parcel);
        return new zzq(str, str2, str3, str4, j10, j11, str5, z14, z11, j16, str6, j12, j13, i10, z15, z12, str7, bool, j14, arrayList, str8, str10, str11, str9, z13, j15);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzq[i10];
    }
}
