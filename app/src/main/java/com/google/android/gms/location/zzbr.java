package com.google.android.gms.location;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes2.dex */
public final class zzbr implements Parcelable.Creator<zzbq> {
    @Override // android.os.Parcelable.Creator
    public final zzbq createFromParcel(Parcel parcel) {
        int t4 = SafeParcelReader.t(parcel);
        String str = "";
        ArrayList arrayList = null;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < t4) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        SafeParcelReader.s(readInt, parcel);
                    } else {
                        str = SafeParcelReader.f(readInt, parcel);
                    }
                } else {
                    pendingIntent = (PendingIntent) SafeParcelReader.e(parcel, readInt, PendingIntent.CREATOR);
                }
            } else {
                arrayList = SafeParcelReader.h(readInt, parcel);
            }
        }
        SafeParcelReader.k(t4, parcel);
        return new zzbq(arrayList, pendingIntent, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzbq[] newArray(int i10) {
        return new zzbq[i10];
    }
}
