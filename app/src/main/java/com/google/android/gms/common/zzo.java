package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzo> CREATOR = new zzp();
    @SafeParcelable.Field

    /* renamed from: a  reason: collision with root package name */
    public final String f11396a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final boolean f11397b;
    @SafeParcelable.Field
    public final boolean c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    public final Context f11398d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    public final boolean f11399e;
    @SafeParcelable.Field

    /* renamed from: f  reason: collision with root package name */
    public final boolean f11400f;

    @SafeParcelable.Constructor
    public zzo(@SafeParcelable.Param String str, @SafeParcelable.Param boolean z10, @SafeParcelable.Param boolean z11, @SafeParcelable.Param IBinder iBinder, @SafeParcelable.Param boolean z12, @SafeParcelable.Param boolean z13) {
        this.f11396a = str;
        this.f11397b = z10;
        this.c = z11;
        this.f11398d = (Context) ObjectWrapper.L0(IObjectWrapper.Stub.K(iBinder));
        this.f11399e = z12;
        this.f11400f = z13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.j(parcel, 1, this.f11396a);
        SafeParcelWriter.a(parcel, 2, this.f11397b);
        SafeParcelWriter.a(parcel, 3, this.c);
        SafeParcelWriter.e(parcel, 4, new ObjectWrapper(this.f11398d));
        SafeParcelWriter.a(parcel, 5, this.f11399e);
        SafeParcelWriter.a(parcel, 6, this.f11400f);
        SafeParcelWriter.p(o10, parcel);
    }
}
