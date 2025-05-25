package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new zzbf();
    @SafeParcelable.Field

    /* renamed from: a  reason: collision with root package name */
    public final int f11454a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final long f11455b;
    @SafeParcelable.Field
    public final long c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    public final boolean f11456d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    public final long f11457e;
    @SafeParcelable.Field

    /* renamed from: f  reason: collision with root package name */
    public final int f11458f;
    @SafeParcelable.Field

    /* renamed from: g  reason: collision with root package name */
    public final float f11459g;
    @SafeParcelable.Field

    /* renamed from: h  reason: collision with root package name */
    public final long f11460h;
    @SafeParcelable.Field

    /* renamed from: i  reason: collision with root package name */
    public final boolean f11461i;

    @Deprecated
    public LocationRequest() {
        this.f11454a = 102;
        this.f11455b = 3600000L;
        this.c = TTAdConstant.AD_MAX_EVENT_TIME;
        this.f11456d = false;
        this.f11457e = Long.MAX_VALUE;
        this.f11458f = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f11459g = 0.0f;
        this.f11460h = 0L;
        this.f11461i = false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            if (this.f11454a == locationRequest.f11454a) {
                long j10 = this.f11455b;
                long j11 = locationRequest.f11455b;
                if (j10 == j11 && this.c == locationRequest.c && this.f11456d == locationRequest.f11456d && this.f11457e == locationRequest.f11457e && this.f11458f == locationRequest.f11458f && this.f11459g == locationRequest.f11459g) {
                    long j12 = this.f11460h;
                    if (j12 >= j10) {
                        j10 = j12;
                    }
                    long j13 = locationRequest.f11460h;
                    if (j13 >= j11) {
                        j11 = j13;
                    }
                    if (j10 == j11 && this.f11461i == locationRequest.f11461i) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11454a), Long.valueOf(this.f11455b), Float.valueOf(this.f11459g), Long.valueOf(this.f11460h)});
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Request[");
        int i10 = this.f11454a;
        if (i10 != 100) {
            if (i10 != 102) {
                if (i10 != 104) {
                    if (i10 != 105) {
                        str = "???";
                    } else {
                        str = "PRIORITY_NO_POWER";
                    }
                } else {
                    str = "PRIORITY_LOW_POWER";
                }
            } else {
                str = "PRIORITY_BALANCED_POWER_ACCURACY";
            }
        } else {
            str = "PRIORITY_HIGH_ACCURACY";
        }
        sb2.append(str);
        long j10 = this.f11455b;
        if (i10 != 105) {
            sb2.append(" requested=");
            sb2.append(j10);
            sb2.append("ms");
        }
        sb2.append(" fastest=");
        sb2.append(this.c);
        sb2.append("ms");
        long j11 = this.f11460h;
        if (j11 > j10) {
            sb2.append(" maxWait=");
            sb2.append(j11);
            sb2.append("ms");
        }
        float f10 = this.f11459g;
        if (f10 > 0.0f) {
            sb2.append(" smallestDisplacement=");
            sb2.append(f10);
            sb2.append("m");
        }
        long j12 = this.f11457e;
        if (j12 != Long.MAX_VALUE) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            sb2.append(" expireIn=");
            sb2.append(j12 - elapsedRealtime);
            sb2.append("ms");
        }
        int i11 = this.f11458f;
        if (i11 != Integer.MAX_VALUE) {
            sb2.append(" num=");
            sb2.append(i11);
        }
        sb2.append(']');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.f(parcel, 1, this.f11454a);
        SafeParcelWriter.g(parcel, 2, this.f11455b);
        SafeParcelWriter.g(parcel, 3, this.c);
        SafeParcelWriter.a(parcel, 4, this.f11456d);
        SafeParcelWriter.g(parcel, 5, this.f11457e);
        SafeParcelWriter.f(parcel, 6, this.f11458f);
        SafeParcelWriter.d(parcel, 7, this.f11459g);
        SafeParcelWriter.g(parcel, 8, this.f11460h);
        SafeParcelWriter.a(parcel, 9, this.f11461i);
        SafeParcelWriter.p(o10, parcel);
    }

    @SafeParcelable.Constructor
    public LocationRequest(@SafeParcelable.Param int i10, @SafeParcelable.Param long j10, @SafeParcelable.Param long j11, @SafeParcelable.Param boolean z10, @SafeParcelable.Param long j12, @SafeParcelable.Param int i11, @SafeParcelable.Param float f10, @SafeParcelable.Param long j13, @SafeParcelable.Param boolean z11) {
        this.f11454a = i10;
        this.f11455b = j10;
        this.c = j11;
        this.f11456d = z10;
        this.f11457e = j12;
        this.f11458f = i11;
        this.f11459g = f10;
        this.f11460h = j13;
        this.f11461i = z11;
    }
}
