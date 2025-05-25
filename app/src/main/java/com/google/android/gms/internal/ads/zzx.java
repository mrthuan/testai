package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzx implements Parcelable {
    public static final Parcelable.Creator<zzx> CREATOR = new zzw();
    public final UUID zza;
    public final String zzb;
    public final String zzc;
    public final byte[] zzd;
    private int zze;

    public zzx(Parcel parcel) {
        this.zza = new UUID(parcel.readLong(), parcel.readLong());
        this.zzb = parcel.readString();
        String readString = parcel.readString();
        int i10 = zzet.zza;
        this.zzc = readString;
        this.zzd = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzx)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        zzx zzxVar = (zzx) obj;
        if (!zzet.zzG(this.zzb, zzxVar.zzb) || !zzet.zzG(this.zzc, zzxVar.zzc) || !zzet.zzG(this.zza, zzxVar.zza) || !Arrays.equals(this.zzd, zzxVar.zzd)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = this.zze;
        if (i10 == 0) {
            int hashCode2 = this.zza.hashCode() * 31;
            String str = this.zzb;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int h10 = androidx.activity.f.h(this.zzc, (hashCode2 + hashCode) * 31, 31) + Arrays.hashCode(this.zzd);
            this.zze = h10;
            return h10;
        }
        return i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.zza.getMostSignificantBits());
        parcel.writeLong(this.zza.getLeastSignificantBits());
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeByteArray(this.zzd);
    }

    public zzx(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.zza = uuid;
        this.zzb = null;
        this.zzc = zzbn.zze(str2);
        this.zzd = bArr;
    }
}
