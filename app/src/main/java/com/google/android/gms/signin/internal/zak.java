package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zav;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zak> CREATOR = new zal();
    @SafeParcelable.VersionField

    /* renamed from: a  reason: collision with root package name */
    public final int f11957a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final ConnectionResult f11958b;
    @SafeParcelable.Field
    public final zav c;

    @SafeParcelable.Constructor
    public zak(@SafeParcelable.Param int i10, @SafeParcelable.Param ConnectionResult connectionResult, @SafeParcelable.Param zav zavVar) {
        this.f11957a = i10;
        this.f11958b = connectionResult;
        this.c = zavVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.f(parcel, 1, this.f11957a);
        SafeParcelWriter.i(parcel, 2, this.f11958b, i10);
        SafeParcelWriter.i(parcel, 3, this.c, i10);
        SafeParcelWriter.p(o10, parcel);
    }
}
