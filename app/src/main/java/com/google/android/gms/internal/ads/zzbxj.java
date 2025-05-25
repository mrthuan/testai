package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbxj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int t4 = SafeParcelReader.t(parcel);
        String str = null;
        String str2 = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        while (parcel.dataPosition() < t4) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = SafeParcelReader.f(readInt, parcel);
                    break;
                case 3:
                    str2 = SafeParcelReader.f(readInt, parcel);
                    break;
                case 4:
                    z10 = SafeParcelReader.l(readInt, parcel);
                    break;
                case 5:
                    z11 = SafeParcelReader.l(readInt, parcel);
                    break;
                case 6:
                    arrayList = SafeParcelReader.h(readInt, parcel);
                    break;
                case 7:
                    z12 = SafeParcelReader.l(readInt, parcel);
                    break;
                case '\b':
                    z13 = SafeParcelReader.l(readInt, parcel);
                    break;
                case '\t':
                    arrayList2 = SafeParcelReader.h(readInt, parcel);
                    break;
                default:
                    SafeParcelReader.s(readInt, parcel);
                    break;
            }
        }
        SafeParcelReader.k(t4, parcel);
        return new zzbxi(str, str2, z10, z11, arrayList, z12, z13, arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzbxi[i10];
    }
}
