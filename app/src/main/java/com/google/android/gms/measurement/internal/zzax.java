package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes2.dex */
public final class zzax implements Parcelable.Creator {
    public static void a(zzaw zzawVar, Parcel parcel, int i10) {
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.j(parcel, 2, zzawVar.f11546a);
        SafeParcelWriter.i(parcel, 3, zzawVar.f11547b, i10);
        SafeParcelWriter.j(parcel, 4, zzawVar.c);
        SafeParcelWriter.g(parcel, 5, zzawVar.f11548d);
        SafeParcelWriter.p(o10, parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int t4 = SafeParcelReader.t(parcel);
        long j10 = 0;
        String str = null;
        zzau zzauVar = null;
        String str2 = null;
        while (parcel.dataPosition() < t4) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 2) {
                if (c != 3) {
                    if (c != 4) {
                        if (c != 5) {
                            SafeParcelReader.s(readInt, parcel);
                        } else {
                            j10 = SafeParcelReader.p(readInt, parcel);
                        }
                    } else {
                        str2 = SafeParcelReader.f(readInt, parcel);
                    }
                } else {
                    zzauVar = (zzau) SafeParcelReader.e(parcel, readInt, zzau.CREATOR);
                }
            } else {
                str = SafeParcelReader.f(readInt, parcel);
            }
        }
        SafeParcelReader.k(t4, parcel);
        return new zzaw(str, zzauVar, str2, j10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzaw[i10];
    }
}
