package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public final class zzn implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int t4 = SafeParcelReader.t(parcel);
        long j10 = 0;
        long j11 = 0;
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        int i12 = 0;
        boolean z11 = false;
        boolean z12 = false;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        Bundle bundle = null;
        ArrayList arrayList = null;
        String str = null;
        zzfh zzfhVar = null;
        Location location = null;
        String str2 = null;
        Bundle bundle2 = null;
        Bundle bundle3 = null;
        ArrayList arrayList2 = null;
        String str3 = null;
        String str4 = null;
        zzc zzcVar = null;
        String str5 = null;
        ArrayList arrayList3 = null;
        String str6 = null;
        while (parcel.dataPosition() < t4) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i10 = SafeParcelReader.o(readInt, parcel);
                    break;
                case 2:
                    j10 = SafeParcelReader.p(readInt, parcel);
                    break;
                case 3:
                    bundle = SafeParcelReader.b(readInt, parcel);
                    break;
                case 4:
                    i11 = SafeParcelReader.o(readInt, parcel);
                    break;
                case 5:
                    arrayList = SafeParcelReader.h(readInt, parcel);
                    break;
                case 6:
                    z10 = SafeParcelReader.l(readInt, parcel);
                    break;
                case 7:
                    i12 = SafeParcelReader.o(readInt, parcel);
                    break;
                case '\b':
                    z11 = SafeParcelReader.l(readInt, parcel);
                    break;
                case '\t':
                    str = SafeParcelReader.f(readInt, parcel);
                    break;
                case '\n':
                    zzfhVar = (zzfh) SafeParcelReader.e(parcel, readInt, zzfh.CREATOR);
                    break;
                case 11:
                    location = (Location) SafeParcelReader.e(parcel, readInt, Location.CREATOR);
                    break;
                case '\f':
                    str2 = SafeParcelReader.f(readInt, parcel);
                    break;
                case '\r':
                    bundle2 = SafeParcelReader.b(readInt, parcel);
                    break;
                case 14:
                    bundle3 = SafeParcelReader.b(readInt, parcel);
                    break;
                case 15:
                    arrayList2 = SafeParcelReader.h(readInt, parcel);
                    break;
                case 16:
                    str3 = SafeParcelReader.f(readInt, parcel);
                    break;
                case 17:
                    str4 = SafeParcelReader.f(readInt, parcel);
                    break;
                case 18:
                    z12 = SafeParcelReader.l(readInt, parcel);
                    break;
                case 19:
                    zzcVar = (zzc) SafeParcelReader.e(parcel, readInt, zzc.CREATOR);
                    break;
                case 20:
                    i13 = SafeParcelReader.o(readInt, parcel);
                    break;
                case 21:
                    str5 = SafeParcelReader.f(readInt, parcel);
                    break;
                case 22:
                    arrayList3 = SafeParcelReader.h(readInt, parcel);
                    break;
                case 23:
                    i14 = SafeParcelReader.o(readInt, parcel);
                    break;
                case 24:
                    str6 = SafeParcelReader.f(readInt, parcel);
                    break;
                case 25:
                    i15 = SafeParcelReader.o(readInt, parcel);
                    break;
                case 26:
                    j11 = SafeParcelReader.p(readInt, parcel);
                    break;
                default:
                    SafeParcelReader.s(readInt, parcel);
                    break;
            }
        }
        SafeParcelReader.k(t4, parcel);
        return new zzl(i10, j10, bundle, i11, arrayList, z10, i12, z11, str, zzfhVar, location, str2, bundle2, bundle3, arrayList2, str3, str4, z12, zzcVar, i13, str5, arrayList3, i14, str6, i15, j11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzl[i10];
    }
}
