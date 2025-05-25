package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
@ShowFirstParty
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzbo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbo> CREATOR = new zzbp();
    @SafeParcelable.Field

    /* renamed from: a  reason: collision with root package name */
    public final int f11495a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final int f11496b;
    @SafeParcelable.Field
    public final long c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    public final long f11497d;

    @SafeParcelable.Constructor
    public zzbo(@SafeParcelable.Param int i10, @SafeParcelable.Param int i11, @SafeParcelable.Param long j10, @SafeParcelable.Param long j11) {
        this.f11495a = i10;
        this.f11496b = i11;
        this.c = j10;
        this.f11497d = j11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzbo) {
            zzbo zzboVar = (zzbo) obj;
            if (this.f11495a == zzboVar.f11495a && this.f11496b == zzboVar.f11496b && this.c == zzboVar.c && this.f11497d == zzboVar.f11497d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11496b), Integer.valueOf(this.f11495a), Long.valueOf(this.f11497d), Long.valueOf(this.c)});
    }

    public final String toString() {
        return "NetworkLocationStatus: Wifi status: " + this.f11495a + " Cell status: " + this.f11496b + " elapsed time NS: " + this.f11497d + " system time ms: " + this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.f(parcel, 1, this.f11495a);
        SafeParcelWriter.f(parcel, 2, this.f11496b);
        SafeParcelWriter.g(parcel, 3, this.c);
        SafeParcelWriter.g(parcel, 4, this.f11497d);
        SafeParcelWriter.p(o10, parcel);
    }
}
