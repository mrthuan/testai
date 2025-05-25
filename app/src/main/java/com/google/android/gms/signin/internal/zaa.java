package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zaa extends AbstractSafeParcelable implements Result {
    public static final Parcelable.Creator<zaa> CREATOR = new zab();
    @SafeParcelable.VersionField

    /* renamed from: a  reason: collision with root package name */
    public final int f11951a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final int f11952b;
    @SafeParcelable.Field
    public final Intent c;

    public zaa() {
        this(2, 0, null);
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        if (this.f11952b == 0) {
            return Status.f10921e;
        }
        return Status.f10925i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.f(parcel, 1, this.f11951a);
        SafeParcelWriter.f(parcel, 2, this.f11952b);
        SafeParcelWriter.i(parcel, 3, this.c, i10);
        SafeParcelWriter.p(o10, parcel);
    }

    @SafeParcelable.Constructor
    public zaa(@SafeParcelable.Param int i10, @SafeParcelable.Param int i11, @SafeParcelable.Param Intent intent) {
        this.f11951a = i10;
        this.f11952b = i11;
        this.c = intent;
    }
}
