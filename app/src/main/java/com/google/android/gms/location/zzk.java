package com.google.android.gms.location;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes2.dex */
public final class zzk implements Parcelable.Creator<ActivityRecognitionResult> {
    @Override // android.os.Parcelable.Creator
    public final ActivityRecognitionResult createFromParcel(Parcel parcel) {
        int t4 = SafeParcelReader.t(parcel);
        ArrayList arrayList = null;
        Bundle bundle = null;
        long j10 = 0;
        long j11 = 0;
        int i10 = 0;
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
                                bundle = SafeParcelReader.b(readInt, parcel);
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
            } else {
                arrayList = SafeParcelReader.j(parcel, readInt, DetectedActivity.CREATOR);
            }
        }
        SafeParcelReader.k(t4, parcel);
        return new ActivityRecognitionResult(arrayList, j10, j11, i10, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ActivityRecognitionResult[] newArray(int i10) {
        return new ActivityRecognitionResult[i10];
    }
}
