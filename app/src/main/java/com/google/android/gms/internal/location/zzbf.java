package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes2.dex */
public final class zzbf implements Parcelable.Creator<zzbe> {
    @Override // android.os.Parcelable.Creator
    public final zzbe createFromParcel(Parcel parcel) {
        int t4 = SafeParcelReader.t(parcel);
        String str = null;
        int i10 = 0;
        short s4 = 0;
        int i11 = 0;
        double d10 = 0.0d;
        double d11 = 0.0d;
        float f10 = 0.0f;
        long j10 = 0;
        int i12 = -1;
        while (parcel.dataPosition() < t4) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = SafeParcelReader.f(readInt, parcel);
                    break;
                case 2:
                    j10 = SafeParcelReader.p(readInt, parcel);
                    break;
                case 3:
                    SafeParcelReader.v(parcel, readInt, 4);
                    s4 = (short) parcel.readInt();
                    break;
                case 4:
                    SafeParcelReader.v(parcel, readInt, 8);
                    d10 = parcel.readDouble();
                    break;
                case 5:
                    SafeParcelReader.v(parcel, readInt, 8);
                    d11 = parcel.readDouble();
                    break;
                case 6:
                    f10 = SafeParcelReader.m(readInt, parcel);
                    break;
                case 7:
                    i10 = SafeParcelReader.o(readInt, parcel);
                    break;
                case '\b':
                    i11 = SafeParcelReader.o(readInt, parcel);
                    break;
                case '\t':
                    i12 = SafeParcelReader.o(readInt, parcel);
                    break;
                default:
                    SafeParcelReader.s(readInt, parcel);
                    break;
            }
        }
        SafeParcelReader.k(t4, parcel);
        return new zzbe(str, i10, s4, d10, d11, f10, j10, i11, i12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzbe[] newArray(int i10) {
        return new zzbe[i10];
    }
}
