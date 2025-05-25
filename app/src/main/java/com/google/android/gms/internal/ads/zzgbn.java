package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzgbn extends zzgbk {
    private zzgbn() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgbk
    public final int zza(zzgbo zzgboVar) {
        int i10;
        int i11;
        synchronized (zzgboVar) {
            i10 = zzgboVar.remaining;
            i11 = i10 - 1;
            zzgboVar.remaining = i11;
        }
        return i11;
    }

    @Override // com.google.android.gms.internal.ads.zzgbk
    public final void zzb(zzgbo zzgboVar, Set set, Set set2) {
        Set set3;
        synchronized (zzgboVar) {
            set3 = zzgboVar.seenExceptions;
            if (set3 == null) {
                zzgboVar.seenExceptions = set2;
            }
        }
    }

    public /* synthetic */ zzgbn(zzgbm zzgbmVar) {
        super(null);
    }
}
