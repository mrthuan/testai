package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public final class LocationSettingsResult extends AbstractSafeParcelable implements Result {
    public static final Parcelable.Creator<LocationSettingsResult> CREATOR = new zzbm();
    @SafeParcelable.Field

    /* renamed from: a  reason: collision with root package name */
    public final Status f11469a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final LocationSettingsStates f11470b;

    @SafeParcelable.Constructor
    public LocationSettingsResult(@SafeParcelable.Param Status status, @SafeParcelable.Param LocationSettingsStates locationSettingsStates) {
        this.f11469a = status;
        this.f11470b = locationSettingsStates;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.f11469a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.i(parcel, 1, this.f11469a, i10);
        SafeParcelWriter.i(parcel, 2, this.f11470b, i10);
        SafeParcelWriter.p(o10, parcel);
    }
}
