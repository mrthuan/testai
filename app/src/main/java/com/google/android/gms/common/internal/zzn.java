package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes.dex */
public final class zzn implements Parcelable.Creator {
    public static void a(GetServiceRequest getServiceRequest, Parcel parcel, int i10) {
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.f(parcel, 1, getServiceRequest.f11200a);
        SafeParcelWriter.f(parcel, 2, getServiceRequest.f11201b);
        SafeParcelWriter.f(parcel, 3, getServiceRequest.c);
        SafeParcelWriter.j(parcel, 4, getServiceRequest.f11202d);
        SafeParcelWriter.e(parcel, 5, getServiceRequest.f11203e);
        SafeParcelWriter.m(parcel, 6, getServiceRequest.f11204f, i10);
        SafeParcelWriter.b(parcel, 7, getServiceRequest.f11205g);
        SafeParcelWriter.i(parcel, 8, getServiceRequest.f11206h, i10);
        SafeParcelWriter.m(parcel, 10, getServiceRequest.f11207i, i10);
        SafeParcelWriter.m(parcel, 11, getServiceRequest.f11208j, i10);
        SafeParcelWriter.a(parcel, 12, getServiceRequest.f11209k);
        SafeParcelWriter.f(parcel, 13, getServiceRequest.f11210l);
        SafeParcelWriter.a(parcel, 14, getServiceRequest.f11211m);
        SafeParcelWriter.j(parcel, 15, getServiceRequest.f11212n);
        SafeParcelWriter.p(o10, parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int t4 = SafeParcelReader.t(parcel);
        Scope[] scopeArr = GetServiceRequest.f11198o;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.f11199p;
        Feature[] featureArr2 = featureArr;
        String str = null;
        IBinder iBinder = null;
        Account account = null;
        String str2 = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        boolean z10 = false;
        int i13 = 0;
        boolean z11 = false;
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
                    i12 = SafeParcelReader.o(readInt, parcel);
                    break;
                case 4:
                    str = SafeParcelReader.f(readInt, parcel);
                    break;
                case 5:
                    iBinder = SafeParcelReader.n(readInt, parcel);
                    break;
                case 6:
                    scopeArr = (Scope[]) SafeParcelReader.i(parcel, readInt, Scope.CREATOR);
                    break;
                case 7:
                    bundle = SafeParcelReader.b(readInt, parcel);
                    break;
                case '\b':
                    account = (Account) SafeParcelReader.e(parcel, readInt, Account.CREATOR);
                    break;
                case '\t':
                default:
                    SafeParcelReader.s(readInt, parcel);
                    break;
                case '\n':
                    featureArr = (Feature[]) SafeParcelReader.i(parcel, readInt, Feature.CREATOR);
                    break;
                case 11:
                    featureArr2 = (Feature[]) SafeParcelReader.i(parcel, readInt, Feature.CREATOR);
                    break;
                case '\f':
                    z10 = SafeParcelReader.l(readInt, parcel);
                    break;
                case '\r':
                    i13 = SafeParcelReader.o(readInt, parcel);
                    break;
                case 14:
                    z11 = SafeParcelReader.l(readInt, parcel);
                    break;
                case 15:
                    str2 = SafeParcelReader.f(readInt, parcel);
                    break;
            }
        }
        SafeParcelReader.k(t4, parcel);
        return new GetServiceRequest(i10, i11, i12, str, iBinder, scopeArr, bundle, account, featureArr, featureArr2, z10, i13, z11, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GetServiceRequest[i10];
    }
}
