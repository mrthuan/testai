package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public final class zzl implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int t4 = SafeParcelReader.t(parcel);
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        int i10 = 0;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        float f10 = 0.0f;
        String str = null;
        while (parcel.dataPosition() < t4) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    z10 = SafeParcelReader.l(readInt, parcel);
                    break;
                case 3:
                    z11 = SafeParcelReader.l(readInt, parcel);
                    break;
                case 4:
                    str = SafeParcelReader.f(readInt, parcel);
                    break;
                case 5:
                    z12 = SafeParcelReader.l(readInt, parcel);
                    break;
                case 6:
                    f10 = SafeParcelReader.m(readInt, parcel);
                    break;
                case 7:
                    i10 = SafeParcelReader.o(readInt, parcel);
                    break;
                case '\b':
                    z13 = SafeParcelReader.l(readInt, parcel);
                    break;
                case '\t':
                    z14 = SafeParcelReader.l(readInt, parcel);
                    break;
                case '\n':
                    z15 = SafeParcelReader.l(readInt, parcel);
                    break;
                default:
                    SafeParcelReader.s(readInt, parcel);
                    break;
            }
        }
        SafeParcelReader.k(t4, parcel);
        return new zzk(z10, z11, str, z12, f10, i10, z13, z14, z15);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzk[i10];
    }
}
