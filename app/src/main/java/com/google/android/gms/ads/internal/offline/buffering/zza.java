package com.google.android.gms.ads.internal.offline.buffering;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public final class zza extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zza> CREATOR = new zzb();
    @SafeParcelable.Field

    /* renamed from: a  reason: collision with root package name */
    public final String f10267a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final String f10268b;
    @SafeParcelable.Field
    public final String c;

    @SafeParcelable.Constructor
    public zza(@SafeParcelable.Param String str, @SafeParcelable.Param String str2, @SafeParcelable.Param String str3) {
        this.f10267a = str;
        this.f10268b = str2;
        this.c = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.j(parcel, 1, this.f10267a);
        SafeParcelWriter.j(parcel, 2, this.f10268b);
        SafeParcelWriter.j(parcel, 3, this.c);
        SafeParcelWriter.p(o10, parcel);
    }
}
