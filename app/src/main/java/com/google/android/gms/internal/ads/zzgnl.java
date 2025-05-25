package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgnl implements zzgnq {
    private final String zza;
    private final zzgvr zzb;
    private final zzgwm zzc;
    private final zzgsu zzd;
    private final zzgtz zze;
    private final Integer zzf;

    private zzgnl(String str, zzgvr zzgvrVar, zzgwm zzgwmVar, zzgsu zzgsuVar, zzgtz zzgtzVar, Integer num) {
        this.zza = str;
        this.zzb = zzgvrVar;
        this.zzc = zzgwmVar;
        this.zzd = zzgsuVar;
        this.zze = zzgtzVar;
        this.zzf = num;
    }

    public static zzgnl zza(String str, zzgwm zzgwmVar, zzgsu zzgsuVar, zzgtz zzgtzVar, Integer num) {
        if (zzgtzVar == zzgtz.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new zzgnl(str, zzgoa.zza(str), zzgwmVar, zzgsuVar, zzgtzVar, num);
    }

    public final zzgsu zzb() {
        return this.zzd;
    }

    public final zzgtz zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgnq
    public final zzgvr zzd() {
        return this.zzb;
    }

    public final zzgwm zze() {
        return this.zzc;
    }

    public final Integer zzf() {
        return this.zzf;
    }

    public final String zzg() {
        return this.zza;
    }
}
