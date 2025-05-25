package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzk> CREATOR = new zzl();
    @SafeParcelable.Field

    /* renamed from: a  reason: collision with root package name */
    public final Bundle f11302a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final Feature[] f11303b;
    @SafeParcelable.Field
    public final int c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    public final ConnectionTelemetryConfiguration f11304d;

    @SafeParcelable.Constructor
    public zzk(@SafeParcelable.Param Bundle bundle, @SafeParcelable.Param Feature[] featureArr, @SafeParcelable.Param int i10, @SafeParcelable.Param ConnectionTelemetryConfiguration connectionTelemetryConfiguration) {
        this.f11302a = bundle;
        this.f11303b = featureArr;
        this.c = i10;
        this.f11304d = connectionTelemetryConfiguration;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.b(parcel, 1, this.f11302a);
        SafeParcelWriter.m(parcel, 2, this.f11303b, i10);
        SafeParcelWriter.f(parcel, 3, this.c);
        SafeParcelWriter.i(parcel, 4, this.f11304d, i10);
        SafeParcelWriter.p(o10, parcel);
    }

    public zzk() {
    }
}
