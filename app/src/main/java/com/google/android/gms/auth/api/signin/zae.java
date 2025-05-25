package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public final class zae implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int t4 = SafeParcelReader.t(parcel);
        ArrayList<GoogleSignInOptionsExtensionParcelable> arrayList = null;
        ArrayList arrayList2 = null;
        Account account = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        while (parcel.dataPosition() < t4) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i10 = SafeParcelReader.o(readInt, parcel);
                    break;
                case 2:
                    arrayList2 = SafeParcelReader.j(parcel, readInt, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) SafeParcelReader.e(parcel, readInt, Account.CREATOR);
                    break;
                case 4:
                    z10 = SafeParcelReader.l(readInt, parcel);
                    break;
                case 5:
                    z11 = SafeParcelReader.l(readInt, parcel);
                    break;
                case 6:
                    z12 = SafeParcelReader.l(readInt, parcel);
                    break;
                case 7:
                    str = SafeParcelReader.f(readInt, parcel);
                    break;
                case '\b':
                    str2 = SafeParcelReader.f(readInt, parcel);
                    break;
                case '\t':
                    arrayList = SafeParcelReader.j(parcel, readInt, GoogleSignInOptionsExtensionParcelable.CREATOR);
                    break;
                case '\n':
                    str3 = SafeParcelReader.f(readInt, parcel);
                    break;
                default:
                    SafeParcelReader.s(readInt, parcel);
                    break;
            }
        }
        SafeParcelReader.k(t4, parcel);
        HashMap hashMap = new HashMap();
        if (arrayList != null) {
            for (GoogleSignInOptionsExtensionParcelable googleSignInOptionsExtensionParcelable : arrayList) {
                hashMap.put(Integer.valueOf(googleSignInOptionsExtensionParcelable.f10827b), googleSignInOptionsExtensionParcelable);
            }
        }
        return new GoogleSignInOptions(i10, arrayList2, account, z10, z11, z12, str, str2, hashMap, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GoogleSignInOptions[i10];
    }
}
