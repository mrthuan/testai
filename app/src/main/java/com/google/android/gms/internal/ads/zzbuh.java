package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbuh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int t4 = SafeParcelReader.t(parcel);
        String str = null;
        Bundle bundle = null;
        byte[] bArr = null;
        String str2 = null;
        String str3 = null;
        int i10 = 0;
        boolean z10 = false;
        while (parcel.dataPosition() < t4) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = SafeParcelReader.f(readInt, parcel);
                    break;
                case 2:
                    i10 = SafeParcelReader.o(readInt, parcel);
                    break;
                case 3:
                    bundle = SafeParcelReader.b(readInt, parcel);
                    break;
                case 4:
                    bArr = SafeParcelReader.c(readInt, parcel);
                    break;
                case 5:
                    z10 = SafeParcelReader.l(readInt, parcel);
                    break;
                case 6:
                    str2 = SafeParcelReader.f(readInt, parcel);
                    break;
                case 7:
                    str3 = SafeParcelReader.f(readInt, parcel);
                    break;
                default:
                    SafeParcelReader.s(readInt, parcel);
                    break;
            }
        }
        SafeParcelReader.k(t4, parcel);
        return new zzbug(str, i10, bundle, bArr, z10, str2, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzbug[i10];
    }
}
