package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public final class zan implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int t4 = SafeParcelReader.t(parcel);
        int i10 = -1;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        String str = null;
        String str2 = null;
        long j10 = 0;
        long j11 = 0;
        while (parcel.dataPosition() < t4) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i11 = SafeParcelReader.o(readInt, parcel);
                    break;
                case 2:
                    i12 = SafeParcelReader.o(readInt, parcel);
                    break;
                case 3:
                    i13 = SafeParcelReader.o(readInt, parcel);
                    break;
                case 4:
                    j10 = SafeParcelReader.p(readInt, parcel);
                    break;
                case 5:
                    j11 = SafeParcelReader.p(readInt, parcel);
                    break;
                case 6:
                    str = SafeParcelReader.f(readInt, parcel);
                    break;
                case 7:
                    str2 = SafeParcelReader.f(readInt, parcel);
                    break;
                case '\b':
                    i14 = SafeParcelReader.o(readInt, parcel);
                    break;
                case '\t':
                    i10 = SafeParcelReader.o(readInt, parcel);
                    break;
                default:
                    SafeParcelReader.s(readInt, parcel);
                    break;
            }
        }
        SafeParcelReader.k(t4, parcel);
        return new MethodInvocation(i11, i12, i13, j10, j11, str, str2, i14, i10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new MethodInvocation[i10];
    }
}
