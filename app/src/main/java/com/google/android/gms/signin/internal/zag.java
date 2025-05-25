package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zag extends AbstractSafeParcelable implements Result {
    public static final Parcelable.Creator<zag> CREATOR = new zah();
    @SafeParcelable.Field

    /* renamed from: a  reason: collision with root package name */
    public final List f11953a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final String f11954b;

    @SafeParcelable.Constructor
    public zag(@SafeParcelable.Param String str, @SafeParcelable.Param ArrayList arrayList) {
        this.f11953a = arrayList;
        this.f11954b = str;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        if (this.f11954b != null) {
            return Status.f10921e;
        }
        return Status.f10925i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.l(parcel, 1, this.f11953a);
        SafeParcelWriter.j(parcel, 2, this.f11954b);
        SafeParcelWriter.p(o10, parcel);
    }
}
