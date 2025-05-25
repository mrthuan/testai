package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes.dex */
public final class zzfk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfk> CREATOR = new zzfl();
    @SafeParcelable.Field

    /* renamed from: a  reason: collision with root package name */
    public final boolean f10194a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final boolean f10195b;
    @SafeParcelable.Field
    public final boolean c;

    public zzfk(VideoOptions videoOptions) {
        this(videoOptions.f10055a, videoOptions.f10056b, videoOptions.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.a(parcel, 2, this.f10194a);
        SafeParcelWriter.a(parcel, 3, this.f10195b);
        SafeParcelWriter.a(parcel, 4, this.c);
        SafeParcelWriter.p(o10, parcel);
    }

    @SafeParcelable.Constructor
    public zzfk(@SafeParcelable.Param boolean z10, @SafeParcelable.Param boolean z11, @SafeParcelable.Param boolean z12) {
        this.f10194a = z10;
        this.f10195b = z11;
        this.c = z12;
    }
}
