package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public final class LocationAvailability extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new zzbe();
    @SafeParcelable.Field
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    public final int f11450a;
    @SafeParcelable.Field
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    public final int f11451b;
    @SafeParcelable.Field
    public final long c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    public final int f11452d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    public final zzbo[] f11453e;

    @SafeParcelable.Constructor
    public LocationAvailability(@SafeParcelable.Param int i10, @SafeParcelable.Param int i11, @SafeParcelable.Param int i12, @SafeParcelable.Param long j10, @SafeParcelable.Param zzbo[] zzboVarArr) {
        this.f11452d = i10;
        this.f11450a = i11;
        this.f11451b = i12;
        this.c = j10;
        this.f11453e = zzboVarArr;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.f11450a == locationAvailability.f11450a && this.f11451b == locationAvailability.f11451b && this.c == locationAvailability.c && this.f11452d == locationAvailability.f11452d && Arrays.equals(this.f11453e, locationAvailability.f11453e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11452d), Integer.valueOf(this.f11450a), Integer.valueOf(this.f11451b), Long.valueOf(this.c), this.f11453e});
    }

    public final String toString() {
        boolean z10;
        if (this.f11452d < 1000) {
            z10 = true;
        } else {
            z10 = false;
        }
        StringBuilder sb2 = new StringBuilder(48);
        sb2.append("LocationAvailability[isLocationAvailable: ");
        sb2.append(z10);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.f(parcel, 1, this.f11450a);
        SafeParcelWriter.f(parcel, 2, this.f11451b);
        SafeParcelWriter.g(parcel, 3, this.c);
        SafeParcelWriter.f(parcel, 4, this.f11452d);
        SafeParcelWriter.m(parcel, 5, this.f11453e, i10);
        SafeParcelWriter.p(o10, parcel);
    }
}
