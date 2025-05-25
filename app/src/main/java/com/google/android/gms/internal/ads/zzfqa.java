package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzfqa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfqa> CREATOR = new zzfqb();
    @SafeParcelable.VersionField
    public final int zza;
    @SafeParcelable.Field
    public final byte[] zzb;
    @SafeParcelable.Field
    public final int zzc;

    @SafeParcelable.Constructor
    public zzfqa(@SafeParcelable.Param int i10, @SafeParcelable.Param byte[] bArr, @SafeParcelable.Param int i11) {
        this.zza = i10;
        this.zzb = bArr == null ? null : Arrays.copyOf(bArr, bArr.length);
        this.zzc = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.zza;
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.f(parcel, 1, i11);
        SafeParcelWriter.c(parcel, 2, this.zzb);
        SafeParcelWriter.f(parcel, 3, this.zzc);
        SafeParcelWriter.p(o10, parcel);
    }

    public zzfqa(byte[] bArr, int i10) {
        this(1, null, 1);
    }
}
