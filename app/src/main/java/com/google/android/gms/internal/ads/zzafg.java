package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzafg implements zzbj {
    public static final Parcelable.Creator<zzafg> CREATOR;
    public final String zza;
    public final String zzb;
    public final long zzc;
    public final long zzd;
    public final byte[] zze;
    private int zzf;

    static {
        zzad zzadVar = new zzad();
        zzadVar.zzX("application/id3");
        zzadVar.zzad();
        zzad zzadVar2 = new zzad();
        zzadVar2.zzX("application/x-scte35");
        zzadVar2.zzad();
        CREATOR = new zzaff();
    }

    public zzafg(String str, String str2, long j10, long j11, byte[] bArr) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j10;
        this.zzd = j11;
        this.zze = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzafg.class == obj.getClass()) {
            zzafg zzafgVar = (zzafg) obj;
            if (this.zzc == zzafgVar.zzc && this.zzd == zzafgVar.zzd && zzet.zzG(this.zza, zzafgVar.zza) && zzet.zzG(this.zzb, zzafgVar.zzb) && Arrays.equals(this.zze, zzafgVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = this.zzf;
        if (i11 == 0) {
            String str = this.zza;
            int i12 = 0;
            if (str != null) {
                i10 = str.hashCode();
            } else {
                i10 = 0;
            }
            String str2 = this.zzb;
            if (str2 != null) {
                i12 = str2.hashCode();
            }
            long j10 = this.zzc;
            long j11 = this.zzd;
            int hashCode = ((((((((i10 + 527) * 31) + i12) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + Arrays.hashCode(this.zze);
            this.zzf = hashCode;
            return hashCode;
        }
        return i11;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.zza + ", id=" + this.zzd + ", durationMs=" + this.zzc + ", value=" + this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeLong(this.zzc);
        parcel.writeLong(this.zzd);
        parcel.writeByteArray(this.zze);
    }

    public zzafg(Parcel parcel) {
        String readString = parcel.readString();
        int i10 = zzet.zza;
        this.zza = readString;
        this.zzb = parcel.readString();
        this.zzc = parcel.readLong();
        this.zzd = parcel.readLong();
        this.zze = parcel.createByteArray();
    }

    @Override // com.google.android.gms.internal.ads.zzbj
    public final /* synthetic */ void zza(zzbf zzbfVar) {
    }
}
