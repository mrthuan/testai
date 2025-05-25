package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public final class zax extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zax> CREATOR = new zay();
    @SafeParcelable.VersionField

    /* renamed from: a  reason: collision with root package name */
    public final int f11285a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final int f11286b;
    @SafeParcelable.Field
    public final int c;
    @SafeParcelable.Field
    @Deprecated

    /* renamed from: d  reason: collision with root package name */
    public final Scope[] f11287d;

    @SafeParcelable.Constructor
    public zax(@SafeParcelable.Param int i10, @SafeParcelable.Param int i11, @SafeParcelable.Param int i12, @SafeParcelable.Param Scope[] scopeArr) {
        this.f11285a = i10;
        this.f11286b = i11;
        this.c = i12;
        this.f11287d = scopeArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.f(parcel, 1, this.f11285a);
        SafeParcelWriter.f(parcel, 2, this.f11286b);
        SafeParcelWriter.f(parcel, 3, this.c);
        SafeParcelWriter.m(parcel, 4, this.f11287d, i10);
        SafeParcelWriter.p(o10, parcel);
    }
}
