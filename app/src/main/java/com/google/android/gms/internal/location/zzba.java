package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public final class zzba extends AbstractSafeParcelable {
    @SafeParcelable.Field
    final LocationRequest zzb;
    @SafeParcelable.Field
    final List<ClientIdentity> zzc;
    @SafeParcelable.Field
    final String zzd;
    @SafeParcelable.Field
    final boolean zze;
    @SafeParcelable.Field
    final boolean zzf;
    @SafeParcelable.Field
    final boolean zzg;
    @SafeParcelable.Field
    final String zzh;
    @SafeParcelable.Field
    final boolean zzi;
    @SafeParcelable.Field
    boolean zzj;
    @SafeParcelable.Field
    String zzk;
    @SafeParcelable.Field
    long zzl;
    static final List<ClientIdentity> zza = Collections.emptyList();
    public static final Parcelable.Creator<zzba> CREATOR = new zzbb();

    @SafeParcelable.Constructor
    public zzba(@SafeParcelable.Param LocationRequest locationRequest, @SafeParcelable.Param List<ClientIdentity> list, @SafeParcelable.Param String str, @SafeParcelable.Param boolean z10, @SafeParcelable.Param boolean z11, @SafeParcelable.Param boolean z12, @SafeParcelable.Param String str2, @SafeParcelable.Param boolean z13, @SafeParcelable.Param boolean z14, @SafeParcelable.Param String str3, @SafeParcelable.Param long j10) {
        this.zzb = locationRequest;
        this.zzc = list;
        this.zzd = str;
        this.zze = z10;
        this.zzf = z11;
        this.zzg = z12;
        this.zzh = str2;
        this.zzi = z13;
        this.zzj = z14;
        this.zzk = str3;
        this.zzl = j10;
    }

    public static zzba zza(String str, LocationRequest locationRequest) {
        return new zzba(locationRequest, zza, null, false, false, false, null, false, false, null, Long.MAX_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzba) {
            zzba zzbaVar = (zzba) obj;
            if (Objects.a(this.zzb, zzbaVar.zzb) && Objects.a(this.zzc, zzbaVar.zzc) && Objects.a(this.zzd, zzbaVar.zzd) && this.zze == zzbaVar.zze && this.zzf == zzbaVar.zzf && this.zzg == zzbaVar.zzg && Objects.a(this.zzh, zzbaVar.zzh) && this.zzi == zzbaVar.zzi && this.zzj == zzbaVar.zzj && Objects.a(this.zzk, zzbaVar.zzk)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.zzb);
        if (this.zzd != null) {
            sb2.append(" tag=");
            sb2.append(this.zzd);
        }
        if (this.zzh != null) {
            sb2.append(" moduleId=");
            sb2.append(this.zzh);
        }
        if (this.zzk != null) {
            sb2.append(" contextAttributionTag=");
            sb2.append(this.zzk);
        }
        sb2.append(" hideAppOps=");
        sb2.append(this.zze);
        sb2.append(" clients=");
        sb2.append(this.zzc);
        sb2.append(" forceCoarseLocation=");
        sb2.append(this.zzf);
        if (this.zzg) {
            sb2.append(" exemptFromBackgroundThrottle");
        }
        if (this.zzi) {
            sb2.append(" locationSettingsIgnored");
        }
        if (this.zzj) {
            sb2.append(" inaccurateLocationsDelayed");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.i(parcel, 1, this.zzb, i10);
        SafeParcelWriter.n(parcel, 5, this.zzc);
        SafeParcelWriter.j(parcel, 6, this.zzd);
        SafeParcelWriter.a(parcel, 7, this.zze);
        SafeParcelWriter.a(parcel, 8, this.zzf);
        SafeParcelWriter.a(parcel, 9, this.zzg);
        SafeParcelWriter.j(parcel, 10, this.zzh);
        SafeParcelWriter.a(parcel, 11, this.zzi);
        SafeParcelWriter.a(parcel, 12, this.zzj);
        SafeParcelWriter.j(parcel, 13, this.zzk);
        SafeParcelWriter.g(parcel, 14, this.zzl);
        SafeParcelWriter.p(o10, parcel);
    }

    public final zzba zzb(long j10) {
        LocationRequest locationRequest = this.zzb;
        long j11 = locationRequest.f11460h;
        long j12 = locationRequest.f11455b;
        if (j11 < j12) {
            j11 = j12;
        }
        if (j11 <= j12) {
            this.zzl = 10000L;
            return this;
        }
        LocationRequest locationRequest2 = this.zzb;
        long j13 = locationRequest2.f11455b;
        long j14 = locationRequest2.f11460h;
        if (j14 < j13) {
            j14 = j13;
        }
        StringBuilder sb2 = new StringBuilder(120);
        sb2.append("could not set max age when location batching is requested, interval=");
        sb2.append(j13);
        sb2.append("maxWaitTime=");
        sb2.append(j14);
        throw new IllegalArgumentException(sb2.toString());
    }

    public final zzba zzc(String str) {
        this.zzk = str;
        return this;
    }

    public final zzba zzd(boolean z10) {
        this.zzj = true;
        return this;
    }
}
