package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@KeepForSdk
@SafeParcelable.Class
/* loaded from: classes.dex */
public class MethodInvocation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MethodInvocation> CREATOR = new zan();
    @SafeParcelable.Field

    /* renamed from: a  reason: collision with root package name */
    public final int f11216a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final int f11217b;
    @SafeParcelable.Field
    public final int c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    public final long f11218d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    public final long f11219e;
    @SafeParcelable.Field

    /* renamed from: f  reason: collision with root package name */
    public final String f11220f;
    @SafeParcelable.Field

    /* renamed from: g  reason: collision with root package name */
    public final String f11221g;
    @SafeParcelable.Field

    /* renamed from: h  reason: collision with root package name */
    public final int f11222h;
    @SafeParcelable.Field

    /* renamed from: i  reason: collision with root package name */
    public final int f11223i;

    @SafeParcelable.Constructor
    public MethodInvocation(@SafeParcelable.Param int i10, @SafeParcelable.Param int i11, @SafeParcelable.Param int i12, @SafeParcelable.Param long j10, @SafeParcelable.Param long j11, @SafeParcelable.Param String str, @SafeParcelable.Param String str2, @SafeParcelable.Param int i13, @SafeParcelable.Param int i14) {
        this.f11216a = i10;
        this.f11217b = i11;
        this.c = i12;
        this.f11218d = j10;
        this.f11219e = j11;
        this.f11220f = str;
        this.f11221g = str2;
        this.f11222h = i13;
        this.f11223i = i14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.f(parcel, 1, this.f11216a);
        SafeParcelWriter.f(parcel, 2, this.f11217b);
        SafeParcelWriter.f(parcel, 3, this.c);
        SafeParcelWriter.g(parcel, 4, this.f11218d);
        SafeParcelWriter.g(parcel, 5, this.f11219e);
        SafeParcelWriter.j(parcel, 6, this.f11220f);
        SafeParcelWriter.j(parcel, 7, this.f11221g);
        SafeParcelWriter.f(parcel, 8, this.f11222h);
        SafeParcelWriter.f(parcel, 9, this.f11223i);
        SafeParcelWriter.p(o10, parcel);
    }
}
