package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.server.converter.zaa;
import com.google.android.gms.common.server.response.FastJsonResponse;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public final class zaj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int t4 = SafeParcelReader.t(parcel);
        String str = null;
        String str2 = null;
        zaa zaaVar = null;
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        int i12 = 0;
        boolean z11 = false;
        int i13 = 0;
        while (parcel.dataPosition() < t4) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i10 = SafeParcelReader.o(readInt, parcel);
                    break;
                case 2:
                    i11 = SafeParcelReader.o(readInt, parcel);
                    break;
                case 3:
                    z10 = SafeParcelReader.l(readInt, parcel);
                    break;
                case 4:
                    i12 = SafeParcelReader.o(readInt, parcel);
                    break;
                case 5:
                    z11 = SafeParcelReader.l(readInt, parcel);
                    break;
                case 6:
                    str = SafeParcelReader.f(readInt, parcel);
                    break;
                case 7:
                    i13 = SafeParcelReader.o(readInt, parcel);
                    break;
                case '\b':
                    str2 = SafeParcelReader.f(readInt, parcel);
                    break;
                case '\t':
                    zaaVar = (zaa) SafeParcelReader.e(parcel, readInt, zaa.CREATOR);
                    break;
                default:
                    SafeParcelReader.s(readInt, parcel);
                    break;
            }
        }
        SafeParcelReader.k(t4, parcel);
        return new FastJsonResponse.Field(i10, i11, z10, i12, z11, str, i13, str2, zaaVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new FastJsonResponse.Field[i10];
    }
}
