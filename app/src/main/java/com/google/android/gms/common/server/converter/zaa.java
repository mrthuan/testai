package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public final class zaa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zaa> CREATOR = new zab();
    @SafeParcelable.VersionField

    /* renamed from: a  reason: collision with root package name */
    public final int f11329a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final StringToIntConverter f11330b;

    @SafeParcelable.Constructor
    public zaa(@SafeParcelable.Param int i10, @SafeParcelable.Param StringToIntConverter stringToIntConverter) {
        this.f11329a = i10;
        this.f11330b = stringToIntConverter;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.f(parcel, 1, this.f11329a);
        SafeParcelWriter.i(parcel, 2, this.f11330b, i10);
        SafeParcelWriter.p(o10, parcel);
    }

    public zaa(StringToIntConverter stringToIntConverter) {
        this.f11329a = 1;
        this.f11330b = stringToIntConverter;
    }
}
