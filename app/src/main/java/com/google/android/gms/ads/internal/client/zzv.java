package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public final class zzv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int t4 = SafeParcelReader.t(parcel);
        String str = null;
        zze zzeVar = null;
        Bundle bundle = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        long j10 = 0;
        while (parcel.dataPosition() < t4) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = SafeParcelReader.f(readInt, parcel);
                    break;
                case 2:
                    j10 = SafeParcelReader.p(readInt, parcel);
                    break;
                case 3:
                    zzeVar = (zze) SafeParcelReader.e(parcel, readInt, zze.CREATOR);
                    break;
                case 4:
                    bundle = SafeParcelReader.b(readInt, parcel);
                    break;
                case 5:
                    str2 = SafeParcelReader.f(readInt, parcel);
                    break;
                case 6:
                    str3 = SafeParcelReader.f(readInt, parcel);
                    break;
                case 7:
                    str4 = SafeParcelReader.f(readInt, parcel);
                    break;
                case '\b':
                    str5 = SafeParcelReader.f(readInt, parcel);
                    break;
                default:
                    SafeParcelReader.s(readInt, parcel);
                    break;
            }
        }
        SafeParcelReader.k(t4, parcel);
        return new zzu(str, j10, zzeVar, bundle, str2, str3, str4, str5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzu[i10];
    }
}
