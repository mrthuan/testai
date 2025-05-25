package com.google.android.gms.ads.internal.overlay;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public final class zzo implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int t4 = SafeParcelReader.t(parcel);
        boolean z10 = false;
        int i10 = 0;
        int i11 = 0;
        boolean z11 = false;
        zzc zzcVar = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        IBinder iBinder4 = null;
        String str = null;
        String str2 = null;
        IBinder iBinder5 = null;
        String str3 = null;
        VersionInfoParcel versionInfoParcel = null;
        String str4 = null;
        com.google.android.gms.ads.internal.zzk zzkVar = null;
        IBinder iBinder6 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        IBinder iBinder7 = null;
        IBinder iBinder8 = null;
        IBinder iBinder9 = null;
        while (parcel.dataPosition() < t4) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    zzcVar = (zzc) SafeParcelReader.e(parcel, readInt, zzc.CREATOR);
                    break;
                case 3:
                    iBinder = SafeParcelReader.n(readInt, parcel);
                    break;
                case 4:
                    iBinder2 = SafeParcelReader.n(readInt, parcel);
                    break;
                case 5:
                    iBinder3 = SafeParcelReader.n(readInt, parcel);
                    break;
                case 6:
                    iBinder4 = SafeParcelReader.n(readInt, parcel);
                    break;
                case 7:
                    str = SafeParcelReader.f(readInt, parcel);
                    break;
                case '\b':
                    z10 = SafeParcelReader.l(readInt, parcel);
                    break;
                case '\t':
                    str2 = SafeParcelReader.f(readInt, parcel);
                    break;
                case '\n':
                    iBinder5 = SafeParcelReader.n(readInt, parcel);
                    break;
                case 11:
                    i10 = SafeParcelReader.o(readInt, parcel);
                    break;
                case '\f':
                    i11 = SafeParcelReader.o(readInt, parcel);
                    break;
                case '\r':
                    str3 = SafeParcelReader.f(readInt, parcel);
                    break;
                case 14:
                    versionInfoParcel = (VersionInfoParcel) SafeParcelReader.e(parcel, readInt, VersionInfoParcel.CREATOR);
                    break;
                case 15:
                case 20:
                case 21:
                case 22:
                case 23:
                default:
                    SafeParcelReader.s(readInt, parcel);
                    break;
                case 16:
                    str4 = SafeParcelReader.f(readInt, parcel);
                    break;
                case 17:
                    zzkVar = (com.google.android.gms.ads.internal.zzk) SafeParcelReader.e(parcel, readInt, com.google.android.gms.ads.internal.zzk.CREATOR);
                    break;
                case 18:
                    iBinder6 = SafeParcelReader.n(readInt, parcel);
                    break;
                case 19:
                    str5 = SafeParcelReader.f(readInt, parcel);
                    break;
                case 24:
                    str6 = SafeParcelReader.f(readInt, parcel);
                    break;
                case 25:
                    str7 = SafeParcelReader.f(readInt, parcel);
                    break;
                case 26:
                    iBinder7 = SafeParcelReader.n(readInt, parcel);
                    break;
                case 27:
                    iBinder8 = SafeParcelReader.n(readInt, parcel);
                    break;
                case 28:
                    iBinder9 = SafeParcelReader.n(readInt, parcel);
                    break;
                case 29:
                    z11 = SafeParcelReader.l(readInt, parcel);
                    break;
            }
        }
        SafeParcelReader.k(t4, parcel);
        return new AdOverlayInfoParcel(zzcVar, iBinder, iBinder2, iBinder3, iBinder4, str, z10, str2, iBinder5, i10, i11, str3, versionInfoParcel, str4, zzkVar, iBinder6, str5, str6, str7, iBinder7, iBinder8, iBinder9, z11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new AdOverlayInfoParcel[i10];
    }
}
