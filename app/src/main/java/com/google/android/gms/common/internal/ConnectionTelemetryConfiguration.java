package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@KeepForSdk
@SafeParcelable.Class
/* loaded from: classes.dex */
public class ConnectionTelemetryConfiguration extends AbstractSafeParcelable {
    @KeepForSdk
    public static final Parcelable.Creator<ConnectionTelemetryConfiguration> CREATOR = new zzm();
    @SafeParcelable.Field

    /* renamed from: a  reason: collision with root package name */
    public final RootTelemetryConfiguration f11193a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final boolean f11194b;
    @SafeParcelable.Field
    public final boolean c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    public final int[] f11195d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    public final int f11196e;
    @SafeParcelable.Field

    /* renamed from: f  reason: collision with root package name */
    public final int[] f11197f;

    @SafeParcelable.Constructor
    public ConnectionTelemetryConfiguration(@SafeParcelable.Param RootTelemetryConfiguration rootTelemetryConfiguration, @SafeParcelable.Param boolean z10, @SafeParcelable.Param boolean z11, @SafeParcelable.Param int[] iArr, @SafeParcelable.Param int i10, @SafeParcelable.Param int[] iArr2) {
        this.f11193a = rootTelemetryConfiguration;
        this.f11194b = z10;
        this.c = z11;
        this.f11195d = iArr;
        this.f11196e = i10;
        this.f11197f = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.i(parcel, 1, this.f11193a, i10);
        SafeParcelWriter.a(parcel, 2, this.f11194b);
        SafeParcelWriter.a(parcel, 3, this.c);
        int[] iArr = this.f11195d;
        if (iArr != null) {
            int o11 = SafeParcelWriter.o(4, parcel);
            parcel.writeIntArray(iArr);
            SafeParcelWriter.p(o11, parcel);
        }
        SafeParcelWriter.f(parcel, 5, this.f11196e);
        int[] iArr2 = this.f11197f;
        if (iArr2 != null) {
            int o12 = SafeParcelWriter.o(6, parcel);
            parcel.writeIntArray(iArr2);
            SafeParcelWriter.p(o12, parcel);
        }
        SafeParcelWriter.p(o10, parcel);
    }
}
