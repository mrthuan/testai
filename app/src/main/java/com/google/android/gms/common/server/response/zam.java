package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@ShowFirstParty
@SafeParcelable.Class
/* loaded from: classes.dex */
public final class zam extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zam> CREATOR = new zak();
    @SafeParcelable.VersionField

    /* renamed from: a  reason: collision with root package name */
    public final int f11351a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final String f11352b;
    @SafeParcelable.Field
    public final FastJsonResponse.Field c;

    @SafeParcelable.Constructor
    public zam(@SafeParcelable.Param int i10, @SafeParcelable.Param String str, @SafeParcelable.Param FastJsonResponse.Field field) {
        this.f11351a = i10;
        this.f11352b = str;
        this.c = field;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.f(parcel, 1, this.f11351a);
        SafeParcelWriter.j(parcel, 2, this.f11352b);
        SafeParcelWriter.i(parcel, 3, this.c, i10);
        SafeParcelWriter.p(o10, parcel);
    }

    public zam(String str, FastJsonResponse.Field field) {
        this.f11351a = 1;
        this.f11352b = str;
        this.c = field;
    }
}
