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
@ShowFirstParty
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public final class zzbx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbx> CREATOR = new zzby();
    @SafeParcelable.Field

    /* renamed from: a  reason: collision with root package name */
    public final int f11500a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final int f11501b;
    @SafeParcelable.Field
    public final int c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    public final int f11502d;

    @SafeParcelable.Constructor
    public zzbx(@SafeParcelable.Param int i10, @SafeParcelable.Param int i11, @SafeParcelable.Param int i12, @SafeParcelable.Param int i13) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        if (i10 >= 0 && i10 <= 23) {
            z10 = true;
        } else {
            z10 = false;
        }
        Preconditions.l("Start hour must be in range [0, 23].", z10);
        if (i11 >= 0 && i11 <= 59) {
            z11 = true;
        } else {
            z11 = false;
        }
        Preconditions.l("Start minute must be in range [0, 59].", z11);
        if (i12 >= 0 && i12 <= 23) {
            z12 = true;
        } else {
            z12 = false;
        }
        Preconditions.l("End hour must be in range [0, 23].", z12);
        if (i13 >= 0 && i13 <= 59) {
            z13 = true;
        } else {
            z13 = false;
        }
        Preconditions.l("End minute must be in range [0, 59].", z13);
        Preconditions.l("Parameters can't be all 0.", ((i10 + i11) + i12) + i13 > 0);
        this.f11500a = i10;
        this.f11501b = i11;
        this.c = i12;
        this.f11502d = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbx)) {
            return false;
        }
        zzbx zzbxVar = (zzbx) obj;
        if (this.f11500a == zzbxVar.f11500a && this.f11501b == zzbxVar.f11501b && this.c == zzbxVar.c && this.f11502d == zzbxVar.f11502d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11500a), Integer.valueOf(this.f11501b), Integer.valueOf(this.c), Integer.valueOf(this.f11502d)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(117);
        sb2.append("UserPreferredSleepWindow [startHour=");
        sb2.append(this.f11500a);
        sb2.append(", startMinute=");
        sb2.append(this.f11501b);
        sb2.append(", endHour=");
        sb2.append(this.c);
        sb2.append(", endMinute=");
        sb2.append(this.f11502d);
        sb2.append(']');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Preconditions.j(parcel);
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.f(parcel, 1, this.f11500a);
        SafeParcelWriter.f(parcel, 2, this.f11501b);
        SafeParcelWriter.f(parcel, 3, this.c);
        SafeParcelWriter.f(parcel, 4, this.f11502d);
        SafeParcelWriter.p(o10, parcel);
    }
}
