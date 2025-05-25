package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbai implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int t4 = SafeParcelReader.t(parcel);
        boolean z10 = false;
        int i10 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Bundle bundle = null;
        String str5 = null;
        long j10 = 0;
        long j11 = 0;
        while (parcel.dataPosition() < t4) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = SafeParcelReader.f(readInt, parcel);
                    break;
                case 3:
                    j10 = SafeParcelReader.p(readInt, parcel);
                    break;
                case 4:
                    str2 = SafeParcelReader.f(readInt, parcel);
                    break;
                case 5:
                    str3 = SafeParcelReader.f(readInt, parcel);
                    break;
                case 6:
                    str4 = SafeParcelReader.f(readInt, parcel);
                    break;
                case 7:
                    bundle = SafeParcelReader.b(readInt, parcel);
                    break;
                case '\b':
                    z10 = SafeParcelReader.l(readInt, parcel);
                    break;
                case '\t':
                    j11 = SafeParcelReader.p(readInt, parcel);
                    break;
                case '\n':
                    str5 = SafeParcelReader.f(readInt, parcel);
                    break;
                case 11:
                    i10 = SafeParcelReader.o(readInt, parcel);
                    break;
                default:
                    SafeParcelReader.s(readInt, parcel);
                    break;
            }
        }
        SafeParcelReader.k(t4, parcel);
        return new zzbah(str, j10, str2, str3, str4, bundle, z10, j11, str5, i10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzbah[i10];
    }
}
