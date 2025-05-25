package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfd implements zzbj {
    public static final Parcelable.Creator<zzfd> CREATOR = new zzfb();
    public final long zza;
    public final long zzb;
    public final long zzc;

    public zzfd(long j10, long j11, long j12) {
        this.zza = j10;
        this.zzb = j11;
        this.zzc = j12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzfd)) {
            return false;
        }
        zzfd zzfdVar = (zzfd) obj;
        if (this.zza == zzfdVar.zza && this.zzb == zzfdVar.zzb && this.zzc == zzfdVar.zzc) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.zza;
        long j11 = this.zzc;
        long j12 = this.zzb;
        return ((((((int) (j10 ^ (j10 >>> 32))) + 527) * 31) + ((int) ((j12 >>> 32) ^ j12))) * 31) + ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.zza + ", modification time=" + this.zzb + ", timescale=" + this.zzc;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.zza);
        parcel.writeLong(this.zzb);
        parcel.writeLong(this.zzc);
    }

    public /* synthetic */ zzfd(Parcel parcel, zzfc zzfcVar) {
        this.zza = parcel.readLong();
        this.zzb = parcel.readLong();
        this.zzc = parcel.readLong();
    }

    @Override // com.google.android.gms.internal.ads.zzbj
    public final /* synthetic */ void zza(zzbf zzbfVar) {
    }
}
