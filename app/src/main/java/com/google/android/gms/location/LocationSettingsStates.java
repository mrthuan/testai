package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public final class LocationSettingsStates extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LocationSettingsStates> CREATOR = new zzbn();
    @SafeParcelable.Field

    /* renamed from: a  reason: collision with root package name */
    public final boolean f11471a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final boolean f11472b;
    @SafeParcelable.Field
    public final boolean c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    public final boolean f11473d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    public final boolean f11474e;
    @SafeParcelable.Field

    /* renamed from: f  reason: collision with root package name */
    public final boolean f11475f;

    @SafeParcelable.Constructor
    public LocationSettingsStates(@SafeParcelable.Param boolean z10, @SafeParcelable.Param boolean z11, @SafeParcelable.Param boolean z12, @SafeParcelable.Param boolean z13, @SafeParcelable.Param boolean z14, @SafeParcelable.Param boolean z15) {
        this.f11471a = z10;
        this.f11472b = z11;
        this.c = z12;
        this.f11473d = z13;
        this.f11474e = z14;
        this.f11475f = z15;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.a(parcel, 1, this.f11471a);
        SafeParcelWriter.a(parcel, 2, this.f11472b);
        SafeParcelWriter.a(parcel, 3, this.c);
        SafeParcelWriter.a(parcel, 4, this.f11473d);
        SafeParcelWriter.a(parcel, 5, this.f11474e);
        SafeParcelWriter.a(parcel, 6, this.f11475f);
        SafeParcelWriter.p(o10, parcel);
    }
}
