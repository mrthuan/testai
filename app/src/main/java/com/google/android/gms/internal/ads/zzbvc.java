package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbvc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int t4 = SafeParcelReader.t(parcel);
        Bundle bundle = null;
        VersionInfoParcel versionInfoParcel = null;
        ApplicationInfo applicationInfo = null;
        String str = null;
        ArrayList arrayList = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        zzfhb zzfhbVar = null;
        String str4 = null;
        Bundle bundle2 = null;
        boolean z10 = false;
        boolean z11 = false;
        while (parcel.dataPosition() < t4) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    bundle = SafeParcelReader.b(readInt, parcel);
                    break;
                case 2:
                    versionInfoParcel = (VersionInfoParcel) SafeParcelReader.e(parcel, readInt, VersionInfoParcel.CREATOR);
                    break;
                case 3:
                    applicationInfo = (ApplicationInfo) SafeParcelReader.e(parcel, readInt, ApplicationInfo.CREATOR);
                    break;
                case 4:
                    str = SafeParcelReader.f(readInt, parcel);
                    break;
                case 5:
                    arrayList = SafeParcelReader.h(readInt, parcel);
                    break;
                case 6:
                    packageInfo = (PackageInfo) SafeParcelReader.e(parcel, readInt, PackageInfo.CREATOR);
                    break;
                case 7:
                    str2 = SafeParcelReader.f(readInt, parcel);
                    break;
                case '\b':
                default:
                    SafeParcelReader.s(readInt, parcel);
                    break;
                case '\t':
                    str3 = SafeParcelReader.f(readInt, parcel);
                    break;
                case '\n':
                    zzfhbVar = (zzfhb) SafeParcelReader.e(parcel, readInt, zzfhb.CREATOR);
                    break;
                case 11:
                    str4 = SafeParcelReader.f(readInt, parcel);
                    break;
                case '\f':
                    z10 = SafeParcelReader.l(readInt, parcel);
                    break;
                case '\r':
                    z11 = SafeParcelReader.l(readInt, parcel);
                    break;
                case 14:
                    bundle2 = SafeParcelReader.b(readInt, parcel);
                    break;
            }
        }
        SafeParcelReader.k(t4, parcel);
        return new zzbvb(bundle, versionInfoParcel, applicationInfo, str, arrayList, packageInfo, str2, str3, zzfhbVar, str4, z10, z11, bundle2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzbvb[i10];
    }
}
