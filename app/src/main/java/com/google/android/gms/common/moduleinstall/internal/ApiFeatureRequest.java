package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@KeepForSdk
@SafeParcelable.Class
/* loaded from: classes.dex */
public class ApiFeatureRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ApiFeatureRequest> CREATOR = new zac();
    @SafeParcelable.Field

    /* renamed from: a  reason: collision with root package name */
    public final List f11320a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final boolean f11321b;
    @SafeParcelable.Field
    public final String c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    public final String f11322d;

    static {
        int i10 = zab.f11323a;
    }

    @SafeParcelable.Constructor
    public ApiFeatureRequest(@SafeParcelable.Param ArrayList arrayList, @SafeParcelable.Param boolean z10, @SafeParcelable.Param String str, @SafeParcelable.Param String str2) {
        Preconditions.j(arrayList);
        this.f11320a = arrayList;
        this.f11321b = z10;
        this.c = str;
        this.f11322d = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ApiFeatureRequest)) {
            return false;
        }
        ApiFeatureRequest apiFeatureRequest = (ApiFeatureRequest) obj;
        if (this.f11321b != apiFeatureRequest.f11321b || !Objects.a(this.f11320a, apiFeatureRequest.f11320a) || !Objects.a(this.c, apiFeatureRequest.c) || !Objects.a(this.f11322d, apiFeatureRequest.f11322d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f11321b), this.f11320a, this.c, this.f11322d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.n(parcel, 1, this.f11320a);
        SafeParcelWriter.a(parcel, 2, this.f11321b);
        SafeParcelWriter.j(parcel, 3, this.c);
        SafeParcelWriter.j(parcel, 4, this.f11322d);
        SafeParcelWriter.p(o10, parcel);
    }
}
