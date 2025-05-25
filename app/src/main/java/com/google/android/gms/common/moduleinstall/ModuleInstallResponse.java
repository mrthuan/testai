package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public class ModuleInstallResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ModuleInstallResponse> CREATOR = new zad();
    @SafeParcelable.Field

    /* renamed from: a  reason: collision with root package name */
    public final int f11314a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final boolean f11315b;

    @SafeParcelable.Constructor
    public ModuleInstallResponse(@SafeParcelable.Param int i10, @SafeParcelable.Param boolean z10) {
        this.f11314a = i10;
        this.f11315b = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.f(parcel, 1, this.f11314a);
        SafeParcelWriter.a(parcel, 2, this.f11315b);
        SafeParcelWriter.p(o10, parcel);
    }
}
