package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzfpy extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfpy> CREATOR = new zzfpz();
    @SafeParcelable.VersionField
    public final int zza;
    @SafeParcelable.Field
    public final int zzb;
    @SafeParcelable.Field
    public final String zzc;
    @SafeParcelable.Field
    public final String zzd;
    @SafeParcelable.Field
    public final int zze;

    @SafeParcelable.Constructor
    public zzfpy(@SafeParcelable.Param int i10, @SafeParcelable.Param int i11, @SafeParcelable.Param int i12, @SafeParcelable.Param String str, @SafeParcelable.Param String str2) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = str;
        this.zzd = str2;
        this.zze = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.zza;
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.f(parcel, 1, i11);
        SafeParcelWriter.f(parcel, 2, this.zzb);
        SafeParcelWriter.j(parcel, 3, this.zzc);
        SafeParcelWriter.j(parcel, 4, this.zzd);
        SafeParcelWriter.f(parcel, 5, this.zze);
        SafeParcelWriter.p(o10, parcel);
    }

    public zzfpy(int i10, int i11, String str, String str2) {
        this(1, 1, i11 - 1, str, str2);
    }
}
