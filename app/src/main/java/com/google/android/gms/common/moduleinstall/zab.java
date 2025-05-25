package com.google.android.gms.common.moduleinstall;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public final class zab implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int t4 = SafeParcelReader.t(parcel);
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < t4) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                SafeParcelReader.s(readInt, parcel);
            } else {
                pendingIntent = (PendingIntent) SafeParcelReader.e(parcel, readInt, PendingIntent.CREATOR);
            }
        }
        SafeParcelReader.k(t4, parcel);
        return new ModuleInstallIntentResponse(pendingIntent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new ModuleInstallIntentResponse[i10];
    }
}
