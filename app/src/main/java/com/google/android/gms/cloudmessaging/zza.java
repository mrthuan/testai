package com.google.android.gms.cloudmessaging;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* loaded from: classes.dex */
public final class zza implements Parcelable.Creator<CloudMessage> {
    @Override // android.os.Parcelable.Creator
    public final CloudMessage createFromParcel(Parcel parcel) {
        int t4 = SafeParcelReader.t(parcel);
        Intent intent = null;
        while (parcel.dataPosition() < t4) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                SafeParcelReader.s(readInt, parcel);
            } else {
                intent = (Intent) SafeParcelReader.e(parcel, readInt, Intent.CREATOR);
            }
        }
        SafeParcelReader.k(t4, parcel);
        return new CloudMessage(intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ CloudMessage[] newArray(int i10) {
        return new CloudMessage[i10];
    }
}
