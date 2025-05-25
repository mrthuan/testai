package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public final class LocationSettingsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LocationSettingsRequest> CREATOR = new zzbl();
    @SafeParcelable.Field

    /* renamed from: a  reason: collision with root package name */
    public final List<LocationRequest> f11466a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final boolean f11467b;
    @SafeParcelable.Field
    public final boolean c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    public final zzbj f11468d;

    /* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
    /* loaded from: classes2.dex */
    public static final class Builder {
        public Builder() {
            new ArrayList();
        }
    }

    @SafeParcelable.Constructor
    public LocationSettingsRequest(@SafeParcelable.Param ArrayList arrayList, @SafeParcelable.Param boolean z10, @SafeParcelable.Param boolean z11, @SafeParcelable.Param zzbj zzbjVar) {
        this.f11466a = arrayList;
        this.f11467b = z10;
        this.c = z11;
        this.f11468d = zzbjVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.n(parcel, 1, Collections.unmodifiableList(this.f11466a));
        SafeParcelWriter.a(parcel, 2, this.f11467b);
        SafeParcelWriter.a(parcel, 3, this.c);
        SafeParcelWriter.i(parcel, 5, this.f11468d, i10);
        SafeParcelWriter.p(o10, parcel);
    }
}
