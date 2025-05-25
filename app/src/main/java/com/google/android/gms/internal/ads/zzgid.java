package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgid extends zzgex {
    private final zzgib zza;
    private final String zzb;
    private final zzgia zzc;
    private final zzgex zzd;

    public /* synthetic */ zzgid(zzgib zzgibVar, String str, zzgia zzgiaVar, zzgex zzgexVar, zzgic zzgicVar) {
        this.zza = zzgibVar;
        this.zzb = str;
        this.zzc = zzgiaVar;
        this.zzd = zzgexVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgid)) {
            return false;
        }
        zzgid zzgidVar = (zzgid) obj;
        if (!zzgidVar.zzc.equals(this.zzc) || !zzgidVar.zzd.equals(this.zzd) || !zzgidVar.zzb.equals(this.zzb) || !zzgidVar.zza.equals(this.zza)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(zzgid.class, this.zzb, this.zzc, this.zzd, this.zza);
    }

    public final String toString() {
        zzgib zzgibVar = this.zza;
        zzgex zzgexVar = this.zzd;
        String valueOf = String.valueOf(this.zzc);
        String valueOf2 = String.valueOf(zzgexVar);
        String valueOf3 = String.valueOf(zzgibVar);
        StringBuilder sb2 = new StringBuilder("LegacyKmsEnvelopeAead Parameters (kekUri: ");
        a6.h.l(sb2, this.zzb, ", dekParsingStrategy: ", valueOf, ", dekParametersForNewKeys: ");
        sb2.append(valueOf2);
        sb2.append(", variant: ");
        sb2.append(valueOf3);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgen
    public final boolean zza() {
        if (this.zza != zzgib.zzb) {
            return true;
        }
        return false;
    }

    public final zzgex zzb() {
        return this.zzd;
    }

    public final zzgib zzc() {
        return this.zza;
    }

    public final String zzd() {
        return this.zzb;
    }
}
