package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@KeepForSdk
@SafeParcelable.Class
/* loaded from: classes.dex */
public class RootTelemetryConfiguration extends AbstractSafeParcelable {
    @KeepForSdk
    public static final Parcelable.Creator<RootTelemetryConfiguration> CREATOR = new zzaj();
    @SafeParcelable.Field

    /* renamed from: a  reason: collision with root package name */
    public final int f11228a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final boolean f11229b;
    @SafeParcelable.Field
    public final boolean c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    public final int f11230d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    public final int f11231e;

    @SafeParcelable.Constructor
    public RootTelemetryConfiguration(@SafeParcelable.Param int i10, @SafeParcelable.Param int i11, @SafeParcelable.Param int i12, @SafeParcelable.Param boolean z10, @SafeParcelable.Param boolean z11) {
        this.f11228a = i10;
        this.f11229b = z10;
        this.c = z11;
        this.f11230d = i11;
        this.f11231e = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.f(parcel, 1, this.f11228a);
        SafeParcelWriter.a(parcel, 2, this.f11229b);
        SafeParcelWriter.a(parcel, 3, this.c);
        SafeParcelWriter.f(parcel, 4, this.f11230d);
        SafeParcelWriter.f(parcel, 5, this.f11231e);
        SafeParcelWriter.p(o10, parcel);
    }
}
