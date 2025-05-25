package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzod {
    public static final zzod zza;
    public final int zzb;
    public final int zzc;
    private final zzfxw zzd;

    static {
        zzod zzodVar;
        if (zzet.zza >= 33) {
            zzfxv zzfxvVar = new zzfxv();
            for (int i10 = 1; i10 <= 10; i10++) {
                zzfxvVar.zzf(Integer.valueOf(zzet.zzh(i10)));
            }
            zzodVar = new zzod(2, zzfxvVar.zzi());
        } else {
            zzodVar = new zzod(2, 10);
        }
        zza = zzodVar;
    }

    public zzod(int i10, int i11) {
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzod)) {
            return false;
        }
        zzod zzodVar = (zzod) obj;
        if (this.zzb == zzodVar.zzb && this.zzc == zzodVar.zzc && zzet.zzG(this.zzd, zzodVar.zzd)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        zzfxw zzfxwVar = this.zzd;
        if (zzfxwVar == null) {
            hashCode = 0;
        } else {
            hashCode = zzfxwVar.hashCode();
        }
        return (((this.zzb * 31) + this.zzc) * 31) + hashCode;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzd);
        return "AudioProfile[format=" + this.zzb + ", maxChannelCount=" + this.zzc + ", channelMasks=" + valueOf + "]";
    }

    public final int zza(int i10, zzh zzhVar) {
        if (this.zzd != null) {
            return this.zzc;
        }
        if (zzet.zza >= 29) {
            return zzob.zza(this.zzb, i10, zzhVar);
        }
        Integer num = (Integer) zzof.zzb.getOrDefault(Integer.valueOf(this.zzb), 0);
        num.getClass();
        return num.intValue();
    }

    public final boolean zzb(int i10) {
        if (this.zzd == null) {
            if (i10 > this.zzc) {
                return false;
            }
            return true;
        }
        int zzh = zzet.zzh(i10);
        if (zzh == 0) {
            return false;
        }
        return this.zzd.contains(Integer.valueOf(zzh));
    }

    public zzod(int i10, Set set) {
        this.zzb = i10;
        zzfxw zzl = zzfxw.zzl(set);
        this.zzd = zzl;
        zzfzx it = zzl.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            i11 = Math.max(i11, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.zzc = i11;
    }
}
