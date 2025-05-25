package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
@SafeParcelable.Class
@SafeParcelable.Reserved
@Deprecated
@ShowFirstParty
/* loaded from: classes2.dex */
public final class zzbj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbj> CREATOR = new zzbk();
    @SafeParcelable.Field

    /* renamed from: a  reason: collision with root package name */
    public final String f11493a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final String f11494b;
    @SafeParcelable.Field
    public final String c;

    @SafeParcelable.Constructor
    public zzbj(@SafeParcelable.Param String str, @SafeParcelable.Param String str2, @SafeParcelable.Param String str3) {
        this.c = str;
        this.f11493a = str2;
        this.f11494b = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.j(parcel, 1, this.f11493a);
        SafeParcelWriter.j(parcel, 2, this.f11494b);
        SafeParcelWriter.j(parcel, 5, this.c);
        SafeParcelWriter.p(o10, parcel);
    }
}
