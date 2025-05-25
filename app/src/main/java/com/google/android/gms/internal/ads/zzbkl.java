package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbkl implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int t4 = SafeParcelReader.t(parcel);
        long j10 = 0;
        boolean z10 = false;
        int i10 = 0;
        boolean z11 = false;
        String str = null;
        byte[] bArr = null;
        String[] strArr = null;
        String[] strArr2 = null;
        while (parcel.dataPosition() < t4) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    z10 = SafeParcelReader.l(readInt, parcel);
                    break;
                case 2:
                    str = SafeParcelReader.f(readInt, parcel);
                    break;
                case 3:
                    i10 = SafeParcelReader.o(readInt, parcel);
                    break;
                case 4:
                    bArr = SafeParcelReader.c(readInt, parcel);
                    break;
                case 5:
                    strArr = SafeParcelReader.g(readInt, parcel);
                    break;
                case 6:
                    strArr2 = SafeParcelReader.g(readInt, parcel);
                    break;
                case 7:
                    z11 = SafeParcelReader.l(readInt, parcel);
                    break;
                case '\b':
                    j10 = SafeParcelReader.p(readInt, parcel);
                    break;
                default:
                    SafeParcelReader.s(readInt, parcel);
                    break;
            }
        }
        SafeParcelReader.k(t4, parcel);
        return new zzbkk(z10, str, i10, bArr, strArr, strArr2, z11, j10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzbkk[i10];
    }
}
