package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzglk extends zzgen {
    private final zzgnm zza;

    public zzglk(zzgnm zzgnmVar) {
        this.zza = zzgnmVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzglk)) {
            return false;
        }
        zzgnm zzgnmVar = ((zzglk) obj).zza;
        if (!this.zza.zzc().zzg().equals(zzgnmVar.zzc().zzg()) || !this.zza.zzc().zzi().equals(zzgnmVar.zzc().zzi()) || !this.zza.zzc().zzh().equals(zzgnmVar.zzc().zzh())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        zzgnm zzgnmVar = this.zza;
        return Objects.hash(zzgnmVar.zzc(), zzgnmVar.zzd());
    }

    public final String toString() {
        String str;
        Object[] objArr = new Object[2];
        objArr[0] = this.zza.zzc().zzi();
        int ordinal = this.zza.zzc().zzg().ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        str = "UNKNOWN";
                    } else {
                        str = "CRUNCHY";
                    }
                } else {
                    str = "RAW";
                }
            } else {
                str = "LEGACY";
            }
        } else {
            str = "TINK";
        }
        objArr[1] = str;
        return String.format("(typeUrl=%s, outputPrefixType=%s)", objArr);
    }

    @Override // com.google.android.gms.internal.ads.zzgen
    public final boolean zza() {
        if (this.zza.zzc().zzg() != zzgtz.RAW) {
            return true;
        }
        return false;
    }

    public final zzgnm zzb() {
        return this.zza;
    }
}
