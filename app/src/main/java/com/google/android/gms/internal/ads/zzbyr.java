package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbyr implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int t4 = SafeParcelReader.t(parcel);
        String str = null;
        String str2 = null;
        com.google.android.gms.ads.internal.client.zzq zzqVar = null;
        com.google.android.gms.ads.internal.client.zzl zzlVar = null;
        while (parcel.dataPosition() < t4) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            SafeParcelReader.s(readInt, parcel);
                        } else {
                            zzlVar = (com.google.android.gms.ads.internal.client.zzl) SafeParcelReader.e(parcel, readInt, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                        }
                    } else {
                        zzqVar = (com.google.android.gms.ads.internal.client.zzq) SafeParcelReader.e(parcel, readInt, com.google.android.gms.ads.internal.client.zzq.CREATOR);
                    }
                } else {
                    str2 = SafeParcelReader.f(readInt, parcel);
                }
            } else {
                str = SafeParcelReader.f(readInt, parcel);
            }
        }
        SafeParcelReader.k(t4, parcel);
        return new zzbyq(str, str2, zzqVar, zzlVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzbyq[i10];
    }
}
