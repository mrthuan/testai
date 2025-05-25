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
/* loaded from: classes2.dex */
public class SleepClassifyEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SleepClassifyEvent> CREATOR = new zzbu();
    @SafeParcelable.Field

    /* renamed from: a  reason: collision with root package name */
    public final int f11476a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final int f11477b;
    @SafeParcelable.Field
    public final int c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    public final int f11478d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    public final int f11479e;
    @SafeParcelable.Field

    /* renamed from: f  reason: collision with root package name */
    public final int f11480f;
    @SafeParcelable.Field

    /* renamed from: g  reason: collision with root package name */
    public final int f11481g;
    @SafeParcelable.Field

    /* renamed from: h  reason: collision with root package name */
    public final boolean f11482h;
    @SafeParcelable.Field

    /* renamed from: i  reason: collision with root package name */
    public final int f11483i;

    @ShowFirstParty
    @SafeParcelable.Constructor
    public SleepClassifyEvent(@SafeParcelable.Param int i10, @SafeParcelable.Param int i11, @SafeParcelable.Param int i12, @SafeParcelable.Param int i13, @SafeParcelable.Param int i14, @SafeParcelable.Param int i15, @SafeParcelable.Param int i16, @SafeParcelable.Param int i17, @SafeParcelable.Param boolean z10) {
        this.f11476a = i10;
        this.f11477b = i11;
        this.c = i12;
        this.f11478d = i13;
        this.f11479e = i14;
        this.f11480f = i15;
        this.f11481g = i16;
        this.f11482h = z10;
        this.f11483i = i17;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SleepClassifyEvent)) {
            return false;
        }
        SleepClassifyEvent sleepClassifyEvent = (SleepClassifyEvent) obj;
        if (this.f11476a == sleepClassifyEvent.f11476a && this.f11477b == sleepClassifyEvent.f11477b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11476a), Integer.valueOf(this.f11477b)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(65);
        sb2.append(this.f11476a);
        sb2.append(" Conf:");
        sb2.append(this.f11477b);
        sb2.append(" Motion:");
        sb2.append(this.c);
        sb2.append(" Light:");
        sb2.append(this.f11478d);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Preconditions.j(parcel);
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.f(parcel, 1, this.f11476a);
        SafeParcelWriter.f(parcel, 2, this.f11477b);
        SafeParcelWriter.f(parcel, 3, this.c);
        SafeParcelWriter.f(parcel, 4, this.f11478d);
        SafeParcelWriter.f(parcel, 5, this.f11479e);
        SafeParcelWriter.f(parcel, 6, this.f11480f);
        SafeParcelWriter.f(parcel, 7, this.f11481g);
        SafeParcelWriter.a(parcel, 8, this.f11482h);
        SafeParcelWriter.f(parcel, 9, this.f11483i);
        SafeParcelWriter.p(o10, parcel);
    }
}
