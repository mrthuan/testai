package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgan implements Serializable {
    private final int[] zza;
    private final int zzb;

    private zzgan(int[] iArr, int i10, int i11) {
        this.zza = iArr;
        this.zzb = i11;
    }

    public static zzgan zzb(int[] iArr) {
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        return new zzgan(copyOf, 0, copyOf.length);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgan)) {
            return false;
        }
        zzgan zzganVar = (zzgan) obj;
        if (this.zzb != zzganVar.zzb) {
            return false;
        }
        for (int i10 = 0; i10 < this.zzb; i10++) {
            if (zza(i10) != zzganVar.zza(i10)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.zzb; i11++) {
            i10 = (i10 * 31) + this.zza[i11];
        }
        return i10;
    }

    public final String toString() {
        int i10 = this.zzb;
        if (i10 != 0) {
            StringBuilder sb2 = new StringBuilder(i10 * 5);
            sb2.append('[');
            sb2.append(this.zza[0]);
            for (int i11 = 1; i11 < this.zzb; i11++) {
                sb2.append(", ");
                sb2.append(this.zza[i11]);
            }
            sb2.append(']');
            return sb2.toString();
        }
        return "[]";
    }

    public final int zza(int i10) {
        zzfuu.zza(i10, this.zzb, "index");
        return this.zza[i10];
    }
}
