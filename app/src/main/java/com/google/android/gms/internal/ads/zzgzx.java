package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
final class zzgzx extends zzgwf {
    final zzhab zza;
    zzgwh zzb = zzb();
    final /* synthetic */ zzhad zzc;

    public zzgzx(zzhad zzhadVar) {
        this.zzc = zzhadVar;
        this.zza = new zzhab(zzhadVar, null);
    }

    private final zzgwh zzb() {
        zzhab zzhabVar = this.zza;
        if (zzhabVar.hasNext()) {
            return zzhabVar.next().iterator();
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.zzb != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgwh
    public final byte zza() {
        zzgwh zzgwhVar = this.zzb;
        if (zzgwhVar != null) {
            byte zza = zzgwhVar.zza();
            if (!this.zzb.hasNext()) {
                this.zzb = zzb();
            }
            return zza;
        }
        throw new NoSuchElementException();
    }
}
