package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfqs extends zzfqy {
    private final String zzb;
    private final int zzc;

    public /* synthetic */ zzfqs(String str, boolean z10, boolean z11, zzfqo zzfqoVar, zzfqp zzfqpVar, int i10, zzfqr zzfqrVar) {
        this.zzb = str;
        this.zzc = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfqy) {
            zzfqy zzfqyVar = (zzfqy) obj;
            if (this.zzb.equals(zzfqyVar.zzc())) {
                zzfqyVar.zzd();
                zzfqyVar.zze();
                zzfqyVar.zza();
                zzfqyVar.zzb();
                int i10 = this.zzc;
                int zzf = zzfqyVar.zzf();
                if (i10 != 0) {
                    if (zzf == 1) {
                        return true;
                    }
                } else {
                    throw null;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zzb.hashCode() ^ 1000003;
        if (this.zzc != 0) {
            return (((((hashCode * 1000003) ^ 1237) * 1000003) ^ 1237) * 583896283) ^ 1;
        }
        throw null;
    }

    public final String toString() {
        String str;
        if (this.zzc != 1) {
            str = "null";
        } else {
            str = "READ_AND_WRITE";
        }
        return a0.d.d("FileComplianceOptions{fileOwner=", this.zzb, ", hasDifferentDmaOwner=false, skipChecks=false, dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=", str, "}");
    }

    @Override // com.google.android.gms.internal.ads.zzfqy
    public final zzfqo zza() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfqy
    public final zzfqp zzb() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfqy
    public final String zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfqy
    public final boolean zzd() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfqy
    public final boolean zze() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfqy
    public final int zzf() {
        return this.zzc;
    }
}
