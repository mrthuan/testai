package com.google.android.gms.measurement.internal;

import a8.h;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public final class zzau extends AbstractSafeParcelable implements Iterable<String> {
    public static final Parcelable.Creator<zzau> CREATOR = new zzav();
    @SafeParcelable.Field

    /* renamed from: a  reason: collision with root package name */
    public final Bundle f11545a;

    @SafeParcelable.Constructor
    public zzau(@SafeParcelable.Param Bundle bundle) {
        this.f11545a = bundle;
    }

    public final Bundle d() {
        return new Bundle(this.f11545a);
    }

    public final Double f() {
        return Double.valueOf(this.f11545a.getDouble("value"));
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new h(this);
    }

    public final String toString() {
        return this.f11545a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.b(parcel, 2, d());
        SafeParcelWriter.p(o10, parcel);
    }
}
