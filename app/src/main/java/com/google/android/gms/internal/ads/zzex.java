package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzex implements zzbj {
    public static final Parcelable.Creator<zzex> CREATOR = new zzev();
    public final String zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    public zzex(String str, byte[] bArr, int i10, int i11) {
        this.zza = str;
        this.zzb = bArr;
        this.zzc = i10;
        this.zzd = i11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzex.class == obj.getClass()) {
            zzex zzexVar = (zzex) obj;
            if (this.zza.equals(zzexVar.zza) && Arrays.equals(this.zzb, zzexVar.zzb) && this.zzc == zzexVar.zzc && this.zzd == zzexVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.zzb) + ((this.zza.hashCode() + 527) * 31)) * 31) + this.zzc) * 31) + this.zzd;
    }

    public final String toString() {
        String zzA;
        int i10 = this.zzd;
        if (i10 != 1) {
            if (i10 != 23) {
                if (i10 != 67) {
                    byte[] bArr = this.zzb;
                    int length = bArr.length;
                    StringBuilder sb2 = new StringBuilder(length + length);
                    for (int i11 = 0; i11 < bArr.length; i11++) {
                        sb2.append(Character.forDigit((bArr[i11] >> 4) & 15, 16));
                        sb2.append(Character.forDigit(bArr[i11] & 15, 16));
                    }
                    zzA = sb2.toString();
                } else {
                    zzA = String.valueOf(zzgap.zzd(this.zzb));
                }
            } else {
                zzA = String.valueOf(Float.intBitsToFloat(zzgap.zzd(this.zzb)));
            }
        } else {
            zzA = zzet.zzA(this.zzb);
        }
        return androidx.appcompat.view.menu.d.d("mdta: key=", this.zza, ", value=", zzA);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.zza);
        parcel.writeByteArray(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeInt(this.zzd);
    }

    public /* synthetic */ zzex(Parcel parcel, zzew zzewVar) {
        String readString = parcel.readString();
        int i10 = zzet.zza;
        this.zza = readString;
        this.zzb = parcel.createByteArray();
        this.zzc = parcel.readInt();
        this.zzd = parcel.readInt();
    }

    @Override // com.google.android.gms.internal.ads.zzbj
    public final /* synthetic */ void zza(zzbf zzbfVar) {
    }
}
