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
public final class zzbua implements Parcelable.Creator {
    public static final zzbtz zza(Parcel parcel) {
        int t4 = SafeParcelReader.t(parcel);
        float f10 = 0.0f;
        float f11 = 0.0f;
        long j10 = 0;
        long j11 = 0;
        int i10 = 0;
        Bundle bundle = null;
        com.google.android.gms.ads.internal.client.zzl zzlVar = null;
        com.google.android.gms.ads.internal.client.zzq zzqVar = null;
        String str = null;
        ApplicationInfo applicationInfo = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        VersionInfoParcel versionInfoParcel = null;
        Bundle bundle2 = null;
        int i11 = 0;
        ArrayList arrayList = null;
        Bundle bundle3 = null;
        boolean z10 = false;
        int i12 = 0;
        int i13 = 0;
        String str5 = null;
        String str6 = null;
        ArrayList arrayList2 = null;
        String str7 = null;
        zzbes zzbesVar = null;
        ArrayList arrayList3 = null;
        String str8 = null;
        boolean z11 = false;
        int i14 = 0;
        int i15 = 0;
        boolean z12 = false;
        String str9 = null;
        String str10 = null;
        boolean z13 = false;
        int i16 = 0;
        Bundle bundle4 = null;
        String str11 = null;
        com.google.android.gms.ads.internal.client.zzdu zzduVar = null;
        boolean z14 = false;
        Bundle bundle5 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        boolean z15 = false;
        ArrayList arrayList4 = null;
        String str15 = null;
        ArrayList arrayList5 = null;
        int i17 = 0;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = false;
        ArrayList arrayList6 = null;
        String str16 = null;
        zzblh zzblhVar = null;
        String str17 = null;
        Bundle bundle6 = null;
        while (parcel.dataPosition() < t4) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i10 = SafeParcelReader.o(readInt, parcel);
                    break;
                case 2:
                    bundle = SafeParcelReader.b(readInt, parcel);
                    break;
                case 3:
                    zzlVar = (com.google.android.gms.ads.internal.client.zzl) SafeParcelReader.e(parcel, readInt, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                    break;
                case 4:
                    zzqVar = (com.google.android.gms.ads.internal.client.zzq) SafeParcelReader.e(parcel, readInt, com.google.android.gms.ads.internal.client.zzq.CREATOR);
                    break;
                case 5:
                    str = SafeParcelReader.f(readInt, parcel);
                    break;
                case 6:
                    applicationInfo = (ApplicationInfo) SafeParcelReader.e(parcel, readInt, ApplicationInfo.CREATOR);
                    break;
                case 7:
                    packageInfo = (PackageInfo) SafeParcelReader.e(parcel, readInt, PackageInfo.CREATOR);
                    break;
                case '\b':
                    str2 = SafeParcelReader.f(readInt, parcel);
                    break;
                case '\t':
                    str3 = SafeParcelReader.f(readInt, parcel);
                    break;
                case '\n':
                    str4 = SafeParcelReader.f(readInt, parcel);
                    break;
                case 11:
                    versionInfoParcel = (VersionInfoParcel) SafeParcelReader.e(parcel, readInt, VersionInfoParcel.CREATOR);
                    break;
                case '\f':
                    bundle2 = SafeParcelReader.b(readInt, parcel);
                    break;
                case '\r':
                    i11 = SafeParcelReader.o(readInt, parcel);
                    break;
                case 14:
                    arrayList = SafeParcelReader.h(readInt, parcel);
                    break;
                case 15:
                    bundle3 = SafeParcelReader.b(readInt, parcel);
                    break;
                case 16:
                    z10 = SafeParcelReader.l(readInt, parcel);
                    break;
                case 17:
                case 22:
                case 23:
                case 24:
                case ' ':
                case '&':
                case '>':
                default:
                    SafeParcelReader.s(readInt, parcel);
                    break;
                case 18:
                    i12 = SafeParcelReader.o(readInt, parcel);
                    break;
                case 19:
                    i13 = SafeParcelReader.o(readInt, parcel);
                    break;
                case 20:
                    f10 = SafeParcelReader.m(readInt, parcel);
                    break;
                case 21:
                    str5 = SafeParcelReader.f(readInt, parcel);
                    break;
                case 25:
                    j10 = SafeParcelReader.p(readInt, parcel);
                    break;
                case 26:
                    str6 = SafeParcelReader.f(readInt, parcel);
                    break;
                case 27:
                    arrayList2 = SafeParcelReader.h(readInt, parcel);
                    break;
                case 28:
                    str7 = SafeParcelReader.f(readInt, parcel);
                    break;
                case 29:
                    zzbesVar = (zzbes) SafeParcelReader.e(parcel, readInt, zzbes.CREATOR);
                    break;
                case 30:
                    arrayList3 = SafeParcelReader.h(readInt, parcel);
                    break;
                case 31:
                    j11 = SafeParcelReader.p(readInt, parcel);
                    break;
                case '!':
                    str8 = SafeParcelReader.f(readInt, parcel);
                    break;
                case '\"':
                    f11 = SafeParcelReader.m(readInt, parcel);
                    break;
                case '#':
                    i14 = SafeParcelReader.o(readInt, parcel);
                    break;
                case '$':
                    i15 = SafeParcelReader.o(readInt, parcel);
                    break;
                case '%':
                    z12 = SafeParcelReader.l(readInt, parcel);
                    break;
                case '\'':
                    str9 = SafeParcelReader.f(readInt, parcel);
                    break;
                case '(':
                    z11 = SafeParcelReader.l(readInt, parcel);
                    break;
                case ')':
                    str10 = SafeParcelReader.f(readInt, parcel);
                    break;
                case '*':
                    z13 = SafeParcelReader.l(readInt, parcel);
                    break;
                case '+':
                    i16 = SafeParcelReader.o(readInt, parcel);
                    break;
                case ',':
                    bundle4 = SafeParcelReader.b(readInt, parcel);
                    break;
                case '-':
                    str11 = SafeParcelReader.f(readInt, parcel);
                    break;
                case '.':
                    zzduVar = (com.google.android.gms.ads.internal.client.zzdu) SafeParcelReader.e(parcel, readInt, com.google.android.gms.ads.internal.client.zzdu.CREATOR);
                    break;
                case '/':
                    z14 = SafeParcelReader.l(readInt, parcel);
                    break;
                case '0':
                    bundle5 = SafeParcelReader.b(readInt, parcel);
                    break;
                case '1':
                    str12 = SafeParcelReader.f(readInt, parcel);
                    break;
                case '2':
                    str13 = SafeParcelReader.f(readInt, parcel);
                    break;
                case '3':
                    str14 = SafeParcelReader.f(readInt, parcel);
                    break;
                case '4':
                    z15 = SafeParcelReader.l(readInt, parcel);
                    break;
                case '5':
                    int r4 = SafeParcelReader.r(readInt, parcel);
                    int dataPosition = parcel.dataPosition();
                    if (r4 == 0) {
                        arrayList4 = null;
                        break;
                    } else {
                        ArrayList arrayList7 = new ArrayList();
                        int readInt2 = parcel.readInt();
                        for (int i18 = 0; i18 < readInt2; i18++) {
                            arrayList7.add(Integer.valueOf(parcel.readInt()));
                        }
                        parcel.setDataPosition(dataPosition + r4);
                        arrayList4 = arrayList7;
                        break;
                    }
                case '6':
                    str15 = SafeParcelReader.f(readInt, parcel);
                    break;
                case '7':
                    arrayList5 = SafeParcelReader.h(readInt, parcel);
                    break;
                case '8':
                    i17 = SafeParcelReader.o(readInt, parcel);
                    break;
                case '9':
                    z16 = SafeParcelReader.l(readInt, parcel);
                    break;
                case ':':
                    z17 = SafeParcelReader.l(readInt, parcel);
                    break;
                case ';':
                    z18 = SafeParcelReader.l(readInt, parcel);
                    break;
                case '<':
                    arrayList6 = SafeParcelReader.h(readInt, parcel);
                    break;
                case '=':
                    str16 = SafeParcelReader.f(readInt, parcel);
                    break;
                case '?':
                    zzblhVar = (zzblh) SafeParcelReader.e(parcel, readInt, zzblh.CREATOR);
                    break;
                case '@':
                    str17 = SafeParcelReader.f(readInt, parcel);
                    break;
                case 'A':
                    bundle6 = SafeParcelReader.b(readInt, parcel);
                    break;
            }
        }
        SafeParcelReader.k(t4, parcel);
        return new zzbtz(i10, bundle, zzlVar, zzqVar, str, applicationInfo, packageInfo, str2, str3, str4, versionInfoParcel, bundle2, i11, arrayList, bundle3, z10, i12, i13, f10, str5, j10, str6, arrayList2, str7, zzbesVar, arrayList3, j11, str8, f11, z11, i14, i15, z12, str9, str10, z13, i16, bundle4, str11, zzduVar, z14, bundle5, str12, str13, str14, z15, arrayList4, str15, arrayList5, i17, z16, z17, z18, arrayList6, str16, zzblhVar, str17, bundle6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zza(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzbtz[i10];
    }
}
