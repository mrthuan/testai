package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgor implements zzgnk {
    private static final zzgor zza = new zzgor();

    private zzgor() {
    }

    public static void zzd() {
        zzgmh.zza().zzf(zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgnk
    public final Class zza() {
        return zzgoo.class;
    }

    @Override // com.google.android.gms.internal.ads.zzgnk
    public final Class zzb() {
        return zzgoo.class;
    }

    @Override // com.google.android.gms.internal.ads.zzgnk
    public final /* bridge */ /* synthetic */ Object zzc(zzgnj zzgnjVar) {
        if (zzgnjVar.zzc() != null) {
            for (List<zzgnh> list : zzgnjVar.zze()) {
                for (zzgnh zzgnhVar : list) {
                    zzgoo zzgooVar = (zzgoo) zzgnhVar.zzd();
                }
            }
            return new zzgoq(zzgnjVar, null);
        }
        throw new GeneralSecurityException("no primary in primitive set");
    }
}
