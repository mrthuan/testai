package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public final class zah implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int t4 = SafeParcelReader.t(parcel);
        int i10 = 0;
        int i11 = 0;
        Uri uri = null;
        int i12 = 0;
        while (parcel.dataPosition() < t4) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            SafeParcelReader.s(readInt, parcel);
                        } else {
                            i11 = SafeParcelReader.o(readInt, parcel);
                        }
                    } else {
                        i12 = SafeParcelReader.o(readInt, parcel);
                    }
                } else {
                    uri = (Uri) SafeParcelReader.e(parcel, readInt, Uri.CREATOR);
                }
            } else {
                i10 = SafeParcelReader.o(readInt, parcel);
            }
        }
        SafeParcelReader.k(t4, parcel);
        return new WebImage(i10, uri, i12, i11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new WebImage[i10];
    }
}
