package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public final class zzb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int t4 = SafeParcelReader.t(parcel);
        boolean z10 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Intent intent = null;
        IBinder iBinder = null;
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
                    str3 = SafeParcelReader.f(readInt, parcel);
                    break;
                case 5:
                    str4 = SafeParcelReader.f(readInt, parcel);
                    break;
                case 6:
                    str5 = SafeParcelReader.f(readInt, parcel);
                    break;
                case 7:
                    str6 = SafeParcelReader.f(readInt, parcel);
                    break;
                case '\b':
                    str7 = SafeParcelReader.f(readInt, parcel);
                    break;
                case '\t':
                    intent = (Intent) SafeParcelReader.e(parcel, readInt, Intent.CREATOR);
                    break;
                case '\n':
                    iBinder = SafeParcelReader.n(readInt, parcel);
                    break;
                case 11:
                    z10 = SafeParcelReader.l(readInt, parcel);
                    break;
                default:
                    SafeParcelReader.s(readInt, parcel);
                    break;
            }
        }
        SafeParcelReader.k(t4, parcel);
        return new zzc(str, str2, str3, str4, str5, str6, str7, intent, iBinder, z10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzc[i10];
    }
}
