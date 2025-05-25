package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzy implements Comparator<zzx>, Parcelable {
    public static final Parcelable.Creator<zzy> CREATOR = new zzv();
    public final String zza;
    public final int zzb;
    private final zzx[] zzc;
    private int zzd;

    public zzy(Parcel parcel) {
        this.zza = parcel.readString();
        zzx[] zzxVarArr = (zzx[]) parcel.createTypedArray(zzx.CREATOR);
        int i10 = zzet.zza;
        this.zzc = zzxVarArr;
        this.zzb = zzxVarArr.length;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(zzx zzxVar, zzx zzxVar2) {
        zzx zzxVar3 = zzxVar;
        zzx zzxVar4 = zzxVar2;
        UUID uuid = zzk.zza;
        if (uuid.equals(zzxVar3.zza)) {
            if (!uuid.equals(zzxVar4.zza)) {
                return 1;
            }
            return 0;
        }
        return zzxVar3.zza.compareTo(zzxVar4.zza);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzy.class == obj.getClass()) {
            zzy zzyVar = (zzy) obj;
            if (zzet.zzG(this.zza, zzyVar.zza) && Arrays.equals(this.zzc, zzyVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = this.zzd;
        if (i10 == 0) {
            String str = this.zza;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int hashCode2 = (hashCode * 31) + Arrays.hashCode(this.zzc);
            this.zzd = hashCode2;
            return hashCode2;
        }
        return i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.zza);
        parcel.writeTypedArray(this.zzc, 0);
    }

    public final zzx zza(int i10) {
        return this.zzc[i10];
    }

    public final zzy zzb(String str) {
        if (zzet.zzG(this.zza, str)) {
            return this;
        }
        return new zzy(str, false, this.zzc);
    }

    private zzy(String str, boolean z10, zzx... zzxVarArr) {
        this.zza = str;
        zzxVarArr = z10 ? (zzx[]) zzxVarArr.clone() : zzxVarArr;
        this.zzc = zzxVarArr;
        this.zzb = zzxVarArr.length;
        Arrays.sort(zzxVarArr, this);
    }

    public zzy(String str, zzx... zzxVarArr) {
        this(null, true, zzxVarArr);
    }

    public zzy(List list) {
        this(null, false, (zzx[]) list.toArray(new zzx[0]));
    }
}
