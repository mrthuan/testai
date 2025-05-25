package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
@ShowFirstParty
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new zzt();
    @SafeParcelable.Field

    /* renamed from: a  reason: collision with root package name */
    public final boolean f11503a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final long f11504b;
    @SafeParcelable.Field
    public final float c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    public final long f11505d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    public final int f11506e;

    public zzs() {
        this(true, 50L, 0.0f, Long.MAX_VALUE, Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzs)) {
            return false;
        }
        zzs zzsVar = (zzs) obj;
        if (this.f11503a == zzsVar.f11503a && this.f11504b == zzsVar.f11504b && Float.compare(this.c, zzsVar.c) == 0 && this.f11505d == zzsVar.f11505d && this.f11506e == zzsVar.f11506e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f11503a), Long.valueOf(this.f11504b), Float.valueOf(this.c), Long.valueOf(this.f11505d), Integer.valueOf(this.f11506e)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeviceOrientationRequest[mShouldUseMag=");
        sb2.append(this.f11503a);
        sb2.append(" mMinimumSamplingPeriodMs=");
        sb2.append(this.f11504b);
        sb2.append(" mSmallestAngleChangeRadians=");
        sb2.append(this.c);
        long j10 = this.f11505d;
        if (j10 != Long.MAX_VALUE) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            sb2.append(" expireIn=");
            sb2.append(j10 - elapsedRealtime);
            sb2.append("ms");
        }
        int i10 = this.f11506e;
        if (i10 != Integer.MAX_VALUE) {
            sb2.append(" num=");
            sb2.append(i10);
        }
        sb2.append(']');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.a(parcel, 1, this.f11503a);
        SafeParcelWriter.g(parcel, 2, this.f11504b);
        SafeParcelWriter.d(parcel, 3, this.c);
        SafeParcelWriter.g(parcel, 4, this.f11505d);
        SafeParcelWriter.f(parcel, 5, this.f11506e);
        SafeParcelWriter.p(o10, parcel);
    }

    @SafeParcelable.Constructor
    public zzs(@SafeParcelable.Param boolean z10, @SafeParcelable.Param long j10, @SafeParcelable.Param float f10, @SafeParcelable.Param long j11, @SafeParcelable.Param int i10) {
        this.f11503a = z10;
        this.f11504b = j10;
        this.c = f10;
        this.f11505d = j11;
        this.f11506e = i10;
    }
}
