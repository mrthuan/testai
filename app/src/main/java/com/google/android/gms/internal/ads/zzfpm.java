package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzfpm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfpm> CREATOR = new zzfpn();
    @SafeParcelable.VersionField
    public final int zza;
    @SafeParcelable.Field
    public final byte[] zzb;

    @SafeParcelable.Constructor
    public zzfpm(@SafeParcelable.Param int i10, @SafeParcelable.Param byte[] bArr) {
        this.zza = i10;
        this.zzb = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.zza;
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.f(parcel, 1, i11);
        SafeParcelWriter.c(parcel, 2, this.zzb);
        SafeParcelWriter.p(o10, parcel);
    }

    public zzfpm(byte[] bArr) {
        this(1, bArr);
    }
}
