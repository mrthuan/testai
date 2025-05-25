package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes2.dex */
public final class zzlk implements Parcelable.Creator {
    public static void a(zzlj zzljVar, Parcel parcel) {
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.f(parcel, 1, zzljVar.f11909a);
        SafeParcelWriter.j(parcel, 2, zzljVar.f11910b);
        SafeParcelWriter.g(parcel, 3, zzljVar.c);
        SafeParcelWriter.h(parcel, 4, zzljVar.f11911d);
        SafeParcelWriter.j(parcel, 6, zzljVar.f11912e);
        SafeParcelWriter.j(parcel, 7, zzljVar.f11913f);
        Double d10 = zzljVar.f11914g;
        if (d10 != null) {
            parcel.writeInt(524296);
            parcel.writeDouble(d10.doubleValue());
        }
        SafeParcelWriter.p(o10, parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int t4 = SafeParcelReader.t(parcel);
        String str = null;
        Long l10 = null;
        Float f10 = null;
        String str2 = null;
        String str3 = null;
        Double d10 = null;
        long j10 = 0;
        int i10 = 0;
        while (parcel.dataPosition() < t4) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i10 = SafeParcelReader.o(readInt, parcel);
                    break;
                case 2:
                    str = SafeParcelReader.f(readInt, parcel);
                    break;
                case 3:
                    j10 = SafeParcelReader.p(readInt, parcel);
                    break;
                case 4:
                    l10 = SafeParcelReader.q(readInt, parcel);
                    break;
                case 5:
                    int r4 = SafeParcelReader.r(readInt, parcel);
                    if (r4 == 0) {
                        f10 = null;
                        break;
                    } else {
                        SafeParcelReader.u(parcel, r4, 4);
                        f10 = Float.valueOf(parcel.readFloat());
                        break;
                    }
                case 6:
                    str2 = SafeParcelReader.f(readInt, parcel);
                    break;
                case 7:
                    str3 = SafeParcelReader.f(readInt, parcel);
                    break;
                case '\b':
                    int r10 = SafeParcelReader.r(readInt, parcel);
                    if (r10 == 0) {
                        d10 = null;
                        break;
                    } else {
                        SafeParcelReader.u(parcel, r10, 8);
                        d10 = Double.valueOf(parcel.readDouble());
                        break;
                    }
                default:
                    SafeParcelReader.s(readInt, parcel);
                    break;
            }
        }
        SafeParcelReader.k(t4, parcel);
        return new zzlj(i10, str, j10, l10, f10, str2, str3, d10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzlj[i10];
    }
}
