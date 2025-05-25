package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes2.dex */
public final class zzbv implements Parcelable.Creator<SleepSegmentEvent> {
    @Override // android.os.Parcelable.Creator
    public final SleepSegmentEvent createFromParcel(Parcel parcel) {
        int t4 = SafeParcelReader.t(parcel);
        long j10 = 0;
        long j11 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (parcel.dataPosition() < t4) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            if (c != 5) {
                                SafeParcelReader.s(readInt, parcel);
                            } else {
                                i12 = SafeParcelReader.o(readInt, parcel);
                            }
                        } else {
                            i11 = SafeParcelReader.o(readInt, parcel);
                        }
                    } else {
                        i10 = SafeParcelReader.o(readInt, parcel);
                    }
                } else {
                    j11 = SafeParcelReader.p(readInt, parcel);
                }
            } else {
                j10 = SafeParcelReader.p(readInt, parcel);
            }
        }
        SafeParcelReader.k(t4, parcel);
        return new SleepSegmentEvent(i10, i11, i12, j10, j11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ SleepSegmentEvent[] newArray(int i10) {
        return new SleepSegmentEvent[i10];
    }
}
