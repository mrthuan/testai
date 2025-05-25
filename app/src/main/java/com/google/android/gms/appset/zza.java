package com.google.android.gms.appset;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public final class zza extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zza> CREATOR = new zzb();
    @SafeParcelable.Field

    /* renamed from: a  reason: collision with root package name */
    public final String f10795a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final String f10796b;

    @SafeParcelable.Constructor
    public zza(@SafeParcelable.Param String str, @SafeParcelable.Param String str2) {
        this.f10795a = str;
        this.f10796b = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.j(parcel, 1, this.f10795a);
        SafeParcelWriter.j(parcel, 2, this.f10796b);
        SafeParcelWriter.p(o10, parcel);
    }
}
