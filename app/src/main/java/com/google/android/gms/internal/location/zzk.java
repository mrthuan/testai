package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes2.dex */
public final class zzk implements Parcelable.Creator<zzj> {
    @Override // android.os.Parcelable.Creator
    public final zzj createFromParcel(Parcel parcel) {
        int t4 = SafeParcelReader.t(parcel);
        com.google.android.gms.location.zzs zzsVar = zzj.zzb;
        List<ClientIdentity> list = zzj.zza;
        String str = null;
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
                    list = SafeParcelReader.j(parcel, readInt, ClientIdentity.CREATOR);
                }
            } else {
                zzsVar = (com.google.android.gms.location.zzs) SafeParcelReader.e(parcel, readInt, com.google.android.gms.location.zzs.CREATOR);
            }
        }
        SafeParcelReader.k(t4, parcel);
        return new zzj(zzsVar, list, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzj[] newArray(int i10) {
        return new zzj[i10];
    }
}
