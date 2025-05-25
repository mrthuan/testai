package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public final class zzen extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzen> CREATOR = new zzeo();
    @SafeParcelable.Field

    /* renamed from: a  reason: collision with root package name */
    public final int f10179a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final int f10180b;
    @SafeParcelable.Field
    public final String c;

    public zzen() {
        this(ModuleDescriptor.MODULE_VERSION, 242402000, "23.3.0");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.f(parcel, 1, this.f10179a);
        SafeParcelWriter.f(parcel, 2, this.f10180b);
        SafeParcelWriter.j(parcel, 3, this.c);
        SafeParcelWriter.p(o10, parcel);
    }

    @SafeParcelable.Constructor
    public zzen(@SafeParcelable.Param int i10, @SafeParcelable.Param int i11, @SafeParcelable.Param String str) {
        this.f10179a = i10;
        this.f10180b = i11;
        this.c = str;
    }
}
