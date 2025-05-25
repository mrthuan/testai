package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@KeepForSdk
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes.dex */
public class GetServiceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetServiceRequest> CREATOR = new zzn();

    /* renamed from: o  reason: collision with root package name */
    public static final Scope[] f11198o = new Scope[0];

    /* renamed from: p  reason: collision with root package name */
    public static final Feature[] f11199p = new Feature[0];
    @SafeParcelable.VersionField

    /* renamed from: a  reason: collision with root package name */
    public final int f11200a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final int f11201b;
    @SafeParcelable.Field
    public final int c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    public String f11202d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    public IBinder f11203e;
    @SafeParcelable.Field

    /* renamed from: f  reason: collision with root package name */
    public Scope[] f11204f;
    @SafeParcelable.Field

    /* renamed from: g  reason: collision with root package name */
    public Bundle f11205g;
    @SafeParcelable.Field

    /* renamed from: h  reason: collision with root package name */
    public Account f11206h;
    @SafeParcelable.Field

    /* renamed from: i  reason: collision with root package name */
    public Feature[] f11207i;
    @SafeParcelable.Field

    /* renamed from: j  reason: collision with root package name */
    public Feature[] f11208j;
    @SafeParcelable.Field

    /* renamed from: k  reason: collision with root package name */
    public final boolean f11209k;
    @SafeParcelable.Field

    /* renamed from: l  reason: collision with root package name */
    public final int f11210l;
    @SafeParcelable.Field

    /* renamed from: m  reason: collision with root package name */
    public boolean f11211m;
    @SafeParcelable.Field

    /* renamed from: n  reason: collision with root package name */
    public final String f11212n;

    @SafeParcelable.Constructor
    public GetServiceRequest(@SafeParcelable.Param int i10, @SafeParcelable.Param int i11, @SafeParcelable.Param int i12, @SafeParcelable.Param String str, @SafeParcelable.Param IBinder iBinder, @SafeParcelable.Param Scope[] scopeArr, @SafeParcelable.Param Bundle bundle, @SafeParcelable.Param Account account, @SafeParcelable.Param Feature[] featureArr, @SafeParcelable.Param Feature[] featureArr2, @SafeParcelable.Param boolean z10, @SafeParcelable.Param int i13, @SafeParcelable.Param boolean z11, @SafeParcelable.Param String str2) {
        scopeArr = scopeArr == null ? f11198o : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        Feature[] featureArr3 = f11199p;
        featureArr = featureArr == null ? featureArr3 : featureArr;
        featureArr2 = featureArr2 == null ? featureArr3 : featureArr2;
        this.f11200a = i10;
        this.f11201b = i11;
        this.c = i12;
        if ("com.google.android.gms".equals(str)) {
            this.f11202d = "com.google.android.gms";
        } else {
            this.f11202d = str;
        }
        if (i10 < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i14 = IAccountAccessor.Stub.f11215a;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                IAccountAccessor zzwVar = queryLocalInterface instanceof IAccountAccessor ? (IAccountAccessor) queryLocalInterface : new zzw(iBinder);
                int i15 = AccountAccessor.f11176b;
                if (zzwVar != null) {
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        account2 = zzwVar.zzb();
                    } catch (RemoteException unused) {
                    } catch (Throwable th2) {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                        throw th2;
                    }
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                }
            }
            this.f11206h = account2;
        } else {
            this.f11203e = iBinder;
            this.f11206h = account;
        }
        this.f11204f = scopeArr;
        this.f11205g = bundle;
        this.f11207i = featureArr;
        this.f11208j = featureArr2;
        this.f11209k = z10;
        this.f11210l = i13;
        this.f11211m = z11;
        this.f11212n = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        zzn.a(this, parcel, i10);
    }
}
