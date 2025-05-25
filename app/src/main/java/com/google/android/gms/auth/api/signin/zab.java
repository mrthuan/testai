package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public final class zab implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int t4 = SafeParcelReader.t(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        ArrayList arrayList = null;
        String str7 = null;
        String str8 = null;
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
                    str2 = SafeParcelReader.f(readInt, parcel);
                    break;
                case 4:
                    str3 = SafeParcelReader.f(readInt, parcel);
                    break;
                case 5:
                    str4 = SafeParcelReader.f(readInt, parcel);
                    break;
                case 6:
                    uri = (Uri) SafeParcelReader.e(parcel, readInt, Uri.CREATOR);
                    break;
                case 7:
                    str5 = SafeParcelReader.f(readInt, parcel);
                    break;
                case '\b':
                    j10 = SafeParcelReader.p(readInt, parcel);
                    break;
                case '\t':
                    str6 = SafeParcelReader.f(readInt, parcel);
                    break;
                case '\n':
                    arrayList = SafeParcelReader.j(parcel, readInt, Scope.CREATOR);
                    break;
                case 11:
                    str7 = SafeParcelReader.f(readInt, parcel);
                    break;
                case '\f':
                    str8 = SafeParcelReader.f(readInt, parcel);
                    break;
                default:
                    SafeParcelReader.s(readInt, parcel);
                    break;
            }
        }
        SafeParcelReader.k(t4, parcel);
        return new GoogleSignInAccount(i10, str, str2, str3, str4, uri, str5, j10, str6, arrayList, str7, str8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GoogleSignInAccount[i10];
    }
}
