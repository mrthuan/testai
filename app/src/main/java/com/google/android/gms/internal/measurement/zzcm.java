package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.2 */
/* loaded from: classes2.dex */
public final class zzcm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int t4 = SafeParcelReader.t(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        String str4 = null;
        boolean z10 = false;
        long j10 = 0;
        long j11 = 0;
        while (parcel.dataPosition() < t4) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    j10 = SafeParcelReader.p(readInt, parcel);
                    break;
                case 2:
                    j11 = SafeParcelReader.p(readInt, parcel);
                    break;
                case 3:
                    z10 = SafeParcelReader.l(readInt, parcel);
                    break;
                case 4:
                    str = SafeParcelReader.f(readInt, parcel);
                    break;
                case 5:
                    str2 = SafeParcelReader.f(readInt, parcel);
                    break;
                case 6:
                    str3 = SafeParcelReader.f(readInt, parcel);
                    break;
                case 7:
                    bundle = SafeParcelReader.b(readInt, parcel);
                    break;
                case '\b':
                    str4 = SafeParcelReader.f(readInt, parcel);
                    break;
                default:
                    SafeParcelReader.s(readInt, parcel);
                    break;
            }
        }
        SafeParcelReader.k(t4, parcel);
        return new zzcl(j10, j11, z10, str, str2, str3, bundle, str4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzcl[i10];
    }
}
