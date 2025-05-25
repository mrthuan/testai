package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public final class zat extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zat> CREATOR = new zau();
    @SafeParcelable.VersionField

    /* renamed from: a  reason: collision with root package name */
    public final int f11278a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final Account f11279b;
    @SafeParcelable.Field
    public final int c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    public final GoogleSignInAccount f11280d;

    @SafeParcelable.Constructor
    public zat(@SafeParcelable.Param int i10, @SafeParcelable.Param Account account, @SafeParcelable.Param int i11, @SafeParcelable.Param GoogleSignInAccount googleSignInAccount) {
        this.f11278a = i10;
        this.f11279b = account;
        this.c = i11;
        this.f11280d = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.f(parcel, 1, this.f11278a);
        SafeParcelWriter.i(parcel, 2, this.f11279b, i10);
        SafeParcelWriter.f(parcel, 3, this.c);
        SafeParcelWriter.i(parcel, 4, this.f11280d, i10);
        SafeParcelWriter.p(o10, parcel);
    }
}
