package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes.dex */
public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzk> CREATOR = new zzl();
    @SafeParcelable.Field

    /* renamed from: a  reason: collision with root package name */
    public final boolean f10536a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final boolean f10537b;
    @SafeParcelable.Field
    public final String c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    public final boolean f10538d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    public final float f10539e;
    @SafeParcelable.Field

    /* renamed from: f  reason: collision with root package name */
    public final int f10540f;
    @SafeParcelable.Field

    /* renamed from: g  reason: collision with root package name */
    public final boolean f10541g;
    @SafeParcelable.Field

    /* renamed from: h  reason: collision with root package name */
    public final boolean f10542h;
    @SafeParcelable.Field

    /* renamed from: i  reason: collision with root package name */
    public final boolean f10543i;

    @SafeParcelable.Constructor
    public zzk(@SafeParcelable.Param boolean z10, @SafeParcelable.Param boolean z11, @SafeParcelable.Param String str, @SafeParcelable.Param boolean z12, @SafeParcelable.Param float f10, @SafeParcelable.Param int i10, @SafeParcelable.Param boolean z13, @SafeParcelable.Param boolean z14, @SafeParcelable.Param boolean z15) {
        this.f10536a = z10;
        this.f10537b = z11;
        this.c = str;
        this.f10538d = z12;
        this.f10539e = f10;
        this.f10540f = i10;
        this.f10541g = z13;
        this.f10542h = z14;
        this.f10543i = z15;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.a(parcel, 2, this.f10536a);
        SafeParcelWriter.a(parcel, 3, this.f10537b);
        SafeParcelWriter.j(parcel, 4, this.c);
        SafeParcelWriter.a(parcel, 5, this.f10538d);
        SafeParcelWriter.d(parcel, 6, this.f10539e);
        SafeParcelWriter.f(parcel, 7, this.f10540f);
        SafeParcelWriter.a(parcel, 8, this.f10541g);
        SafeParcelWriter.a(parcel, 9, this.f10542h);
        SafeParcelWriter.a(parcel, 10, this.f10543i);
        SafeParcelWriter.p(o10, parcel);
    }

    public zzk(boolean z10, boolean z11, boolean z12, float f10, boolean z13, boolean z14, boolean z15) {
        this(z10, z11, null, z12, f10, -1, z13, z14, z15);
    }
}
