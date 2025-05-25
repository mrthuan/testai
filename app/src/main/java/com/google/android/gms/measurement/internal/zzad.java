package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes2.dex */
public final class zzad implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int t4 = SafeParcelReader.t(parcel);
        String str = null;
        String str2 = null;
        zzlj zzljVar = null;
        String str3 = null;
        zzaw zzawVar = null;
        zzaw zzawVar2 = null;
        zzaw zzawVar3 = null;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        boolean z10 = false;
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
                    zzljVar = (zzlj) SafeParcelReader.e(parcel, readInt, zzlj.CREATOR);
                    break;
                case 5:
                    j10 = SafeParcelReader.p(readInt, parcel);
                    break;
                case 6:
                    z10 = SafeParcelReader.l(readInt, parcel);
                    break;
                case 7:
                    str3 = SafeParcelReader.f(readInt, parcel);
                    break;
                case '\b':
                    zzawVar = (zzaw) SafeParcelReader.e(parcel, readInt, zzaw.CREATOR);
                    break;
                case '\t':
                    j11 = SafeParcelReader.p(readInt, parcel);
                    break;
                case '\n':
                    zzawVar2 = (zzaw) SafeParcelReader.e(parcel, readInt, zzaw.CREATOR);
                    break;
                case 11:
                    j12 = SafeParcelReader.p(readInt, parcel);
                    break;
                case '\f':
                    zzawVar3 = (zzaw) SafeParcelReader.e(parcel, readInt, zzaw.CREATOR);
                    break;
                default:
                    SafeParcelReader.s(readInt, parcel);
                    break;
            }
        }
        SafeParcelReader.k(t4, parcel);
        return new zzac(str, str2, zzljVar, j10, z10, str3, zzawVar, j11, zzawVar2, j12, zzawVar3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzac[i10];
    }
}
