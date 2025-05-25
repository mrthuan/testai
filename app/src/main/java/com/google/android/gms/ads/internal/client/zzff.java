package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public final class zzff extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzff> CREATOR = new zzfg();
    @SafeParcelable.Field

    /* renamed from: a  reason: collision with root package name */
    public final int f10190a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final int f10191b;

    @SafeParcelable.Constructor
    public zzff(@SafeParcelable.Param int i10, @SafeParcelable.Param int i11) {
        this.f10190a = i10;
        this.f10191b = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.f(parcel, 1, this.f10190a);
        SafeParcelWriter.f(parcel, 2, this.f10191b);
        SafeParcelWriter.p(o10, parcel);
    }

    public zzff(RequestConfiguration requestConfiguration) {
        this.f10190a = requestConfiguration.f10040a;
        this.f10191b = requestConfiguration.f10041b;
    }
}
