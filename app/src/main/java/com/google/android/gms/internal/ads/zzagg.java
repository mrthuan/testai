package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzagg extends zzagd {
    public static final Parcelable.Creator<zzagg> CREATOR = new zzagf();
    public final String zza;
    public final String zzb;
    public final String zzc;

    public zzagg(Parcel parcel) {
        super("----");
        String readString = parcel.readString();
        int i10 = zzet.zza;
        this.zza = readString;
        this.zzb = parcel.readString();
        this.zzc = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagg.class == obj.getClass()) {
            zzagg zzaggVar = (zzagg) obj;
            if (zzet.zzG(this.zzb, zzaggVar.zzb) && zzet.zzG(this.zza, zzaggVar.zza) && zzet.zzG(this.zzc, zzaggVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        String str = this.zza;
        int i12 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        String str2 = this.zzb;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i13 = i10 + 527;
        String str3 = this.zzc;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return (((i13 * 31) + i11) * 31) + i12;
    }

    @Override // com.google.android.gms.internal.ads.zzagd
    public final String toString() {
        return this.zzf + ": domain=" + this.zza + ", description=" + this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.zzf);
        parcel.writeString(this.zza);
        parcel.writeString(this.zzc);
    }

    public zzagg(String str, String str2, String str3) {
        super("----");
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }
}
