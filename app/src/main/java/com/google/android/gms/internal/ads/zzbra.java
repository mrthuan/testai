package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.VersionInfo;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzbra extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbra> CREATOR = new zzbrb();
    @SafeParcelable.Field
    public final int zza;
    @SafeParcelable.Field
    public final int zzb;
    @SafeParcelable.Field
    public final int zzc;

    @SafeParcelable.Constructor
    public zzbra(@SafeParcelable.Param int i10, @SafeParcelable.Param int i11, @SafeParcelable.Param int i12) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
    }

    public static zzbra zza(VersionInfo versionInfo) {
        return new zzbra(versionInfo.f10051a, versionInfo.f10052b, versionInfo.c);
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzbra)) {
            zzbra zzbraVar = (zzbra) obj;
            if (zzbraVar.zzc == this.zzc && zzbraVar.zzb == this.zzb && zzbraVar.zza == this.zza) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.zza, this.zzb, this.zzc});
    }

    public final String toString() {
        return this.zza + "." + this.zzb + "." + this.zzc;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.zza;
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.f(parcel, 1, i11);
        SafeParcelWriter.f(parcel, 2, this.zzb);
        SafeParcelWriter.f(parcel, 3, this.zzc);
        SafeParcelWriter.p(o10, parcel);
    }
}
