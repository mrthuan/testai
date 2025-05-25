package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbud implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int t4 = SafeParcelReader.t(parcel);
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        ApplicationInfo applicationInfo = null;
        String str = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < t4) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    applicationInfo = (ApplicationInfo) SafeParcelReader.e(parcel, readInt, ApplicationInfo.CREATOR);
                    break;
                case 2:
                    str = SafeParcelReader.f(readInt, parcel);
                    break;
                case 3:
                    packageInfo = (PackageInfo) SafeParcelReader.e(parcel, readInt, PackageInfo.CREATOR);
                    break;
                case 4:
                    str2 = SafeParcelReader.f(readInt, parcel);
                    break;
                case 5:
                    i10 = SafeParcelReader.o(readInt, parcel);
                    break;
                case 6:
                    str3 = SafeParcelReader.f(readInt, parcel);
                    break;
                case 7:
                    arrayList = SafeParcelReader.h(readInt, parcel);
                    break;
                case '\b':
                    z10 = SafeParcelReader.l(readInt, parcel);
                    break;
                case '\t':
                    z11 = SafeParcelReader.l(readInt, parcel);
                    break;
                default:
                    SafeParcelReader.s(readInt, parcel);
                    break;
            }
        }
        SafeParcelReader.k(t4, parcel);
        return new zzbuc(applicationInfo, str, packageInfo, str2, i10, str3, arrayList, z10, z11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzbuc[i10];
    }
}
