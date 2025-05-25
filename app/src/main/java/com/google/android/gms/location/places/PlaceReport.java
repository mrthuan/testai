package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

@SafeParcelable.Class
/* loaded from: classes2.dex */
public class PlaceReport extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<PlaceReport> CREATOR = new zza();
    @SafeParcelable.VersionField

    /* renamed from: a  reason: collision with root package name */
    public final int f11490a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final String f11491b;
    @SafeParcelable.Field
    public final String c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    public final String f11492d;

    @SafeParcelable.Constructor
    public PlaceReport(@SafeParcelable.Param int i10, @SafeParcelable.Param String str, @SafeParcelable.Param String str2, @SafeParcelable.Param String str3) {
        this.f11490a = i10;
        this.f11491b = str;
        this.c = str2;
        this.f11492d = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PlaceReport)) {
            return false;
        }
        PlaceReport placeReport = (PlaceReport) obj;
        if (!Objects.a(this.f11491b, placeReport.f11491b) || !Objects.a(this.c, placeReport.c) || !Objects.a(this.f11492d, placeReport.f11492d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11491b, this.c, this.f11492d});
    }

    public final String toString() {
        Objects.ToStringHelper toStringHelper = new Objects.ToStringHelper(this);
        toStringHelper.a(this.f11491b, "placeId");
        toStringHelper.a(this.c, "tag");
        String str = this.f11492d;
        if (!"unknown".equals(str)) {
            toStringHelper.a(str, "source");
        }
        return toStringHelper.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.f(parcel, 1, this.f11490a);
        SafeParcelWriter.j(parcel, 2, this.f11491b);
        SafeParcelWriter.j(parcel, 3, this.c);
        SafeParcelWriter.j(parcel, 4, this.f11492d);
        SafeParcelWriter.p(o10, parcel);
    }
}
