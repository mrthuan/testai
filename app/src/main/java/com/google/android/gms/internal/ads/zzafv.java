package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzafv extends zzagd {
    public static final Parcelable.Creator<zzafv> CREATOR = new zzafu();
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;
    public final String[] zzd;
    private final zzagd[] zze;

    public zzafv(Parcel parcel) {
        super("CTOC");
        String readString = parcel.readString();
        int i10 = zzet.zza;
        this.zza = readString;
        this.zzb = parcel.readByte() != 0;
        this.zzc = parcel.readByte() != 0;
        this.zzd = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.zze = new zzagd[readInt];
        for (int i11 = 0; i11 < readInt; i11++) {
            this.zze[i11] = (zzagd) parcel.readParcelable(zzagd.class.getClassLoader());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzafv.class == obj.getClass()) {
            zzafv zzafvVar = (zzafv) obj;
            if (this.zzb == zzafvVar.zzb && this.zzc == zzafvVar.zzc && zzet.zzG(this.zza, zzafvVar.zza) && Arrays.equals(this.zzd, zzafvVar.zzd) && Arrays.equals(this.zze, zzafvVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        String str = this.zza;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return (((((this.zzb ? 1 : 0) + 527) * 31) + (this.zzc ? 1 : 0)) * 31) + i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.zza);
        parcel.writeByte(this.zzb ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.zzc ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.zzd);
        parcel.writeInt(this.zze.length);
        for (zzagd zzagdVar : this.zze) {
            parcel.writeParcelable(zzagdVar, 0);
        }
    }

    public zzafv(String str, boolean z10, boolean z11, String[] strArr, zzagd[] zzagdVarArr) {
        super("CTOC");
        this.zza = str;
        this.zzb = z10;
        this.zzc = z11;
        this.zzd = strArr;
        this.zze = zzagdVarArr;
    }
}
