package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzts implements zzvz {
    private final zzfxr zza;
    private long zzb;

    public zzts(List list, List list2) {
        boolean z10;
        zzfxo zzfxoVar = new zzfxo();
        if (list.size() == list2.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdi.zzd(z10);
        for (int i10 = 0; i10 < list.size(); i10++) {
            zzfxoVar.zzf(new zztr((zzvz) list.get(i10), (List) list2.get(i10)));
        }
        this.zza = zzfxoVar.zzi();
        this.zzb = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final long zzb() {
        long j10 = Long.MAX_VALUE;
        long j11 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < this.zza.size(); i10++) {
            zztr zztrVar = (zztr) this.zza.get(i10);
            long zzb = zztrVar.zzb();
            if ((zztrVar.zza().contains(1) || zztrVar.zza().contains(2) || zztrVar.zza().contains(4)) && zzb != Long.MIN_VALUE) {
                j10 = Math.min(j10, zzb);
            }
            if (zzb != Long.MIN_VALUE) {
                j11 = Math.min(j11, zzb);
            }
        }
        if (j10 != Long.MAX_VALUE) {
            this.zzb = j10;
            return j10;
        } else if (j11 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        } else {
            long j12 = this.zzb;
            if (j12 != -9223372036854775807L) {
                return j12;
            }
            return j11;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final long zzc() {
        long j10 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < this.zza.size(); i10++) {
            long zzc = ((zztr) this.zza.get(i10)).zzc();
            if (zzc != Long.MIN_VALUE) {
                j10 = Math.min(j10, zzc);
            }
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zzm(long j10) {
        for (int i10 = 0; i10 < this.zza.size(); i10++) {
            ((zztr) this.zza.get(i10)).zzm(j10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final boolean zzo(zzkf zzkfVar) {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        do {
            long zzc = zzc();
            if (zzc == Long.MIN_VALUE) {
                break;
            }
            z10 = false;
            for (int i10 = 0; i10 < this.zza.size(); i10++) {
                long zzc2 = ((zztr) this.zza.get(i10)).zzc();
                if (zzc2 != Long.MIN_VALUE && zzc2 <= zzkfVar.zza) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (zzc2 == zzc || z11) {
                    z10 |= ((zztr) this.zza.get(i10)).zzo(zzkfVar);
                }
            }
            z12 |= z10;
        } while (z10);
        return z12;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final boolean zzp() {
        for (int i10 = 0; i10 < this.zza.size(); i10++) {
            if (((zztr) this.zza.get(i10)).zzp()) {
                return true;
            }
        }
        return false;
    }
}
