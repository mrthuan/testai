package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbvv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int t4 = SafeParcelReader.t(parcel);
        com.google.android.gms.ads.internal.client.zzl zzlVar = null;
        String str = null;
        while (parcel.dataPosition() < t4) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 2) {
                if (c != 3) {
                    SafeParcelReader.s(readInt, parcel);
                } else {
                    str = SafeParcelReader.f(readInt, parcel);
                }
            } else {
                zzlVar = (com.google.android.gms.ads.internal.client.zzl) SafeParcelReader.e(parcel, readInt, com.google.android.gms.ads.internal.client.zzl.CREATOR);
            }
        }
        SafeParcelReader.k(t4, parcel);
        return new zzbvu(zzlVar, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzbvu[i10];
    }
}
