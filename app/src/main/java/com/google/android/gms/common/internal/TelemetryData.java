package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@KeepForSdk
@SafeParcelable.Class
/* loaded from: classes.dex */
public class TelemetryData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TelemetryData> CREATOR = new zaab();
    @SafeParcelable.Field

    /* renamed from: a  reason: collision with root package name */
    public final int f11234a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public List f11235b;

    @SafeParcelable.Constructor
    public TelemetryData(@SafeParcelable.Param int i10, @SafeParcelable.Param List list) {
        this.f11234a = i10;
        this.f11235b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.f(parcel, 1, this.f11234a);
        SafeParcelWriter.n(parcel, 2, this.f11235b);
        SafeParcelWriter.p(o10, parcel);
    }
}
