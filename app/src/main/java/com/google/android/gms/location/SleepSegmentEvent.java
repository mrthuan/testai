package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public class SleepSegmentEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SleepSegmentEvent> CREATOR = new zzbv();
    @SafeParcelable.Field

    /* renamed from: a  reason: collision with root package name */
    public final long f11484a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final long f11485b;
    @SafeParcelable.Field
    public final int c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    public final int f11486d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    public final int f11487e;

    @ShowFirstParty
    @SafeParcelable.Constructor
    public SleepSegmentEvent(@SafeParcelable.Param int i10, @SafeParcelable.Param int i11, @SafeParcelable.Param int i12, @SafeParcelable.Param long j10, @SafeParcelable.Param long j11) {
        boolean z10;
        if (j10 <= j11) {
            z10 = true;
        } else {
            z10 = false;
        }
        Preconditions.a("endTimeMillis must be greater than or equal to startTimeMillis", z10);
        this.f11484a = j10;
        this.f11485b = j11;
        this.c = i10;
        this.f11486d = i11;
        this.f11487e = i12;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof SleepSegmentEvent) {
            SleepSegmentEvent sleepSegmentEvent = (SleepSegmentEvent) obj;
            if (this.f11484a == sleepSegmentEvent.f11484a && this.f11485b == sleepSegmentEvent.f11485b && this.c == sleepSegmentEvent.c && this.f11486d == sleepSegmentEvent.f11486d && this.f11487e == sleepSegmentEvent.f11487e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f11484a), Long.valueOf(this.f11485b), Integer.valueOf(this.c)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(84);
        sb2.append("startMillis=");
        sb2.append(this.f11484a);
        sb2.append(", endMillis=");
        sb2.append(this.f11485b);
        sb2.append(", status=");
        sb2.append(this.c);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Preconditions.j(parcel);
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.g(parcel, 1, this.f11484a);
        SafeParcelWriter.g(parcel, 2, this.f11485b);
        SafeParcelWriter.f(parcel, 3, this.c);
        SafeParcelWriter.f(parcel, 4, this.f11486d);
        SafeParcelWriter.f(parcel, 5, this.f11487e);
        SafeParcelWriter.p(o10, parcel);
    }
}
