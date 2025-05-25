package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zat;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zai> CREATOR = new zaj();
    @SafeParcelable.VersionField

    /* renamed from: a  reason: collision with root package name */
    public final int f11955a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final zat f11956b;

    @SafeParcelable.Constructor
    public zai(@SafeParcelable.Param int i10, @SafeParcelable.Param zat zatVar) {
        this.f11955a = i10;
        this.f11956b = zatVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.f(parcel, 1, this.f11955a);
        SafeParcelWriter.i(parcel, 2, this.f11956b, i10);
        SafeParcelWriter.p(o10, parcel);
    }
}
