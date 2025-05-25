package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new zzt();
    @SafeParcelable.Field

    /* renamed from: a  reason: collision with root package name */
    public final int f10252a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final int f10253b;
    @SafeParcelable.Field
    public final String c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    public final long f10254d;

    @SafeParcelable.Constructor
    public zzs(@SafeParcelable.Param int i10, @SafeParcelable.Param int i11, @SafeParcelable.Param long j10, @SafeParcelable.Param String str) {
        this.f10252a = i10;
        this.f10253b = i11;
        this.c = str;
        this.f10254d = j10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.f(parcel, 1, this.f10252a);
        SafeParcelWriter.f(parcel, 2, this.f10253b);
        SafeParcelWriter.j(parcel, 3, this.c);
        SafeParcelWriter.g(parcel, 4, this.f10254d);
        SafeParcelWriter.p(o10, parcel);
    }
}
