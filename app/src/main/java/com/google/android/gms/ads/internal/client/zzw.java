package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes.dex */
public final class zzw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzw> CREATOR = new zzx();
    @AppOpenAd.AppOpenAdOrientation
    @SafeParcelable.Field

    /* renamed from: a  reason: collision with root package name */
    public final int f10262a;

    @SafeParcelable.Constructor
    public zzw(@SafeParcelable.Param @AppOpenAd.AppOpenAdOrientation int i10) {
        this.f10262a = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.f(parcel, 2, this.f10262a);
        SafeParcelWriter.p(o10, parcel);
    }
}
