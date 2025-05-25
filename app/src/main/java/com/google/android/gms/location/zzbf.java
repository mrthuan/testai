package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes2.dex */
public final class zzbf implements Parcelable.Creator<LocationRequest> {
    @Override // android.os.Parcelable.Creator
    public final LocationRequest createFromParcel(Parcel parcel) {
        int t4 = SafeParcelReader.t(parcel);
        int i10 = 102;
        long j10 = 3600000;
        long j11 = 600000;
        boolean z10 = false;
        boolean z11 = false;
        long j12 = Long.MAX_VALUE;
        int i11 = Integer.MAX_VALUE;
        float f10 = 0.0f;
        long j13 = 0;
        while (parcel.dataPosition() < t4) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i10 = SafeParcelReader.o(readInt, parcel);
                    break;
                case 2:
                    j10 = SafeParcelReader.p(readInt, parcel);
                    break;
                case 3:
                    j11 = SafeParcelReader.p(readInt, parcel);
                    break;
                case 4:
                    z10 = SafeParcelReader.l(readInt, parcel);
                    break;
                case 5:
                    j12 = SafeParcelReader.p(readInt, parcel);
                    break;
                case 6:
                    i11 = SafeParcelReader.o(readInt, parcel);
                    break;
                case 7:
                    f10 = SafeParcelReader.m(readInt, parcel);
                    break;
                case '\b':
                    j13 = SafeParcelReader.p(readInt, parcel);
                    break;
                case '\t':
                    z11 = SafeParcelReader.l(readInt, parcel);
                    break;
                default:
                    SafeParcelReader.s(readInt, parcel);
                    break;
            }
        }
        SafeParcelReader.k(t4, parcel);
        return new LocationRequest(i10, j10, j11, z10, j12, i11, f10, j13, z11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationRequest[] newArray(int i10) {
        return new LocationRequest[i10];
    }
}
