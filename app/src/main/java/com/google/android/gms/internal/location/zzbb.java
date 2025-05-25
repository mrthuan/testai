package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes2.dex */
public final class zzbb implements Parcelable.Creator<zzba> {
    @Override // android.os.Parcelable.Creator
    public final zzba createFromParcel(Parcel parcel) {
        int t4 = SafeParcelReader.t(parcel);
        ArrayList arrayList = zzba.zza;
        LocationRequest locationRequest = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        long j10 = Long.MAX_VALUE;
        while (parcel.dataPosition() < t4) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                switch (c) {
                    case 5:
                        arrayList = SafeParcelReader.j(parcel, readInt, ClientIdentity.CREATOR);
                        continue;
                    case 6:
                        str = SafeParcelReader.f(readInt, parcel);
                        continue;
                    case 7:
                        z10 = SafeParcelReader.l(readInt, parcel);
                        continue;
                    case '\b':
                        z11 = SafeParcelReader.l(readInt, parcel);
                        continue;
                    case '\t':
                        z12 = SafeParcelReader.l(readInt, parcel);
                        continue;
                    case '\n':
                        str2 = SafeParcelReader.f(readInt, parcel);
                        continue;
                    case 11:
                        z13 = SafeParcelReader.l(readInt, parcel);
                        continue;
                    case '\f':
                        z14 = SafeParcelReader.l(readInt, parcel);
                        continue;
                    case '\r':
                        str3 = SafeParcelReader.f(readInt, parcel);
                        continue;
                    case 14:
                        j10 = SafeParcelReader.p(readInt, parcel);
                        continue;
                    default:
                        SafeParcelReader.s(readInt, parcel);
                        continue;
                }
            } else {
                locationRequest = (LocationRequest) SafeParcelReader.e(parcel, readInt, LocationRequest.CREATOR);
            }
        }
        SafeParcelReader.k(t4, parcel);
        return new zzba(locationRequest, arrayList, str, z10, z11, z12, str2, z13, z14, str3, j10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzba[] newArray(int i10) {
        return new zzba[i10];
    }
}
