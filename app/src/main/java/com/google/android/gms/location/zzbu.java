package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes2.dex */
public final class zzbu implements Parcelable.Creator<SleepClassifyEvent> {
    @Override // android.os.Parcelable.Creator
    public final SleepClassifyEvent createFromParcel(Parcel parcel) {
        int t4 = SafeParcelReader.t(parcel);
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        boolean z10 = false;
        while (parcel.dataPosition() < t4) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i10 = SafeParcelReader.o(readInt, parcel);
                    break;
                case 2:
                    i11 = SafeParcelReader.o(readInt, parcel);
                    break;
                case 3:
                    i12 = SafeParcelReader.o(readInt, parcel);
                    break;
                case 4:
                    i13 = SafeParcelReader.o(readInt, parcel);
                    break;
                case 5:
                    i14 = SafeParcelReader.o(readInt, parcel);
                    break;
                case 6:
                    i15 = SafeParcelReader.o(readInt, parcel);
                    break;
                case 7:
                    i16 = SafeParcelReader.o(readInt, parcel);
                    break;
                case '\b':
                    z10 = SafeParcelReader.l(readInt, parcel);
                    break;
                case '\t':
                    i17 = SafeParcelReader.o(readInt, parcel);
                    break;
                default:
                    SafeParcelReader.s(readInt, parcel);
                    break;
            }
        }
        SafeParcelReader.k(t4, parcel);
        return new SleepClassifyEvent(i10, i11, i12, i13, i14, i15, i16, i17, z10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ SleepClassifyEvent[] newArray(int i10) {
        return new SleepClassifyEvent[i10];
    }
}
