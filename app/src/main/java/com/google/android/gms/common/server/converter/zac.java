package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public final class zac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zac> CREATOR = new zae();
    @SafeParcelable.VersionField

    /* renamed from: a  reason: collision with root package name */
    public final int f11331a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final String f11332b;
    @SafeParcelable.Field
    public final int c;

    @SafeParcelable.Constructor
    public zac(@SafeParcelable.Param int i10, @SafeParcelable.Param String str, @SafeParcelable.Param int i11) {
        this.f11331a = i10;
        this.f11332b = str;
        this.c = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.f(parcel, 1, this.f11331a);
        SafeParcelWriter.j(parcel, 2, this.f11332b);
        SafeParcelWriter.f(parcel, 3, this.c);
        SafeParcelWriter.p(o10, parcel);
    }

    public zac(String str, int i10) {
        this.f11331a = 1;
        this.f11332b = str;
        this.c = i10;
    }
}
