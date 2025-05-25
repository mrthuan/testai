package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public class ModuleAvailabilityResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ModuleAvailabilityResponse> CREATOR = new zaa();
    @SafeParcelable.Field

    /* renamed from: a  reason: collision with root package name */
    public final boolean f11311a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final int f11312b;

    /* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
    @Retention(RetentionPolicy.CLASS)
    /* loaded from: classes.dex */
    public @interface AvailabilityStatus {
    }

    @SafeParcelable.Constructor
    @KeepForSdk
    public ModuleAvailabilityResponse(@SafeParcelable.Param boolean z10, @SafeParcelable.Param int i10) {
        this.f11311a = z10;
        this.f11312b = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.a(parcel, 1, this.f11311a);
        SafeParcelWriter.f(parcel, 2, this.f11312b);
        SafeParcelWriter.p(o10, parcel);
    }
}
