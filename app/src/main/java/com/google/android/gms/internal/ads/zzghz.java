package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzghz {
    private zzgib zza;
    private String zzb;
    private zzgia zzc;
    private zzgex zzd;

    private zzghz() {
        throw null;
    }

    public /* synthetic */ zzghz(zzghy zzghyVar) {
    }

    public final zzghz zza(zzgex zzgexVar) {
        this.zzd = zzgexVar;
        return this;
    }

    public final zzghz zzb(zzgia zzgiaVar) {
        this.zzc = zzgiaVar;
        return this;
    }

    public final zzghz zzc(String str) {
        this.zzb = str;
        return this;
    }

    public final zzghz zzd(zzgib zzgibVar) {
        this.zza = zzgibVar;
        return this;
    }

    public final zzgid zze() {
        if (this.zza == null) {
            this.zza = zzgib.zzb;
        }
        if (this.zzb != null) {
            zzgia zzgiaVar = this.zzc;
            if (zzgiaVar != null) {
                zzgex zzgexVar = this.zzd;
                if (zzgexVar != null) {
                    if (!zzgexVar.zza()) {
                        if ((zzgiaVar.equals(zzgia.zza) && (zzgexVar instanceof zzggo)) || ((zzgiaVar.equals(zzgia.zzc) && (zzgexVar instanceof zzghh)) || ((zzgiaVar.equals(zzgia.zzb) && (zzgexVar instanceof zzgiw)) || ((zzgiaVar.equals(zzgia.zzd) && (zzgexVar instanceof zzgfp)) || ((zzgiaVar.equals(zzgia.zze) && (zzgexVar instanceof zzggb)) || (zzgiaVar.equals(zzgia.zzf) && (zzgexVar instanceof zzghb))))))) {
                            return new zzgid(this.zza, this.zzb, this.zzc, this.zzd, null);
                        }
                        throw new GeneralSecurityException(a0.d.d("Cannot use parsing strategy ", this.zzc.toString(), " when new keys are picked according to ", String.valueOf(this.zzd), "."));
                    }
                    throw new GeneralSecurityException("dekParametersForNewKeys must not have ID Requirements");
                }
                throw new GeneralSecurityException("dekParametersForNewKeys must be set");
            }
            throw new GeneralSecurityException("dekParsingStrategy must be set");
        }
        throw new GeneralSecurityException("kekUri must be set");
    }
}
