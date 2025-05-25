package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public class GoogleSignInOptionsExtensionParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleSignInOptionsExtensionParcelable> CREATOR = new zaa();
    @SafeParcelable.VersionField

    /* renamed from: a  reason: collision with root package name */
    public final int f10826a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final int f10827b;
    @SafeParcelable.Field
    public final Bundle c;

    @SafeParcelable.Constructor
    public GoogleSignInOptionsExtensionParcelable(@SafeParcelable.Param int i10, @SafeParcelable.Param int i11, @SafeParcelable.Param Bundle bundle) {
        this.f10826a = i10;
        this.f10827b = i11;
        this.c = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.f(parcel, 1, this.f10826a);
        SafeParcelWriter.f(parcel, 2, this.f10827b);
        SafeParcelWriter.b(parcel, 3, this.c);
        SafeParcelWriter.p(o10, parcel);
    }
}
