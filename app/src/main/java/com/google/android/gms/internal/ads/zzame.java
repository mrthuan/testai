package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzame implements zzamf {
    private final List zza;
    private final zzadp[] zzb;
    private boolean zzc;
    private int zzd;
    private int zze;
    private long zzf = -9223372036854775807L;

    public zzame(List list) {
        this.zza = list;
        this.zzb = new zzadp[list.size()];
    }

    private final boolean zzf(zzek zzekVar, int i10) {
        if (zzekVar.zzb() == 0) {
            return false;
        }
        if (zzekVar.zzm() != i10) {
            this.zzc = false;
        }
        this.zzd--;
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zza(zzek zzekVar) {
        zzadp[] zzadpVarArr;
        if (this.zzc) {
            if (this.zzd != 2 || zzf(zzekVar, 32)) {
                if (this.zzd != 1 || zzf(zzekVar, 0)) {
                    int zzd = zzekVar.zzd();
                    int zzb = zzekVar.zzb();
                    for (zzadp zzadpVar : this.zzb) {
                        zzekVar.zzK(zzd);
                        zzadpVar.zzq(zzekVar, zzb);
                    }
                    this.zze += zzb;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zzb(zzacn zzacnVar, zzans zzansVar) {
        for (int i10 = 0; i10 < this.zzb.length; i10++) {
            zzanp zzanpVar = (zzanp) this.zza.get(i10);
            zzansVar.zzc();
            zzadp zzw = zzacnVar.zzw(zzansVar.zza(), 3);
            zzad zzadVar = new zzad();
            zzadVar.zzK(zzansVar.zzb());
            zzadVar.zzX("application/dvbsubs");
            zzadVar.zzL(Collections.singletonList(zzanpVar.zzb));
            zzadVar.zzO(zzanpVar.zza);
            zzw.zzl(zzadVar.zzad());
            this.zzb[i10] = zzw;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zzc(boolean z10) {
        boolean z11;
        if (this.zzc) {
            if (this.zzf != -9223372036854775807L) {
                z11 = true;
            } else {
                z11 = false;
            }
            zzdi.zzf(z11);
            for (zzadp zzadpVar : this.zzb) {
                zzadpVar.zzs(this.zzf, 1, this.zze, 0, null);
            }
            this.zzc = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zzd(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.zzc = true;
        this.zzf = j10;
        this.zze = 0;
        this.zzd = 2;
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zze() {
        this.zzc = false;
        this.zzf = -9223372036854775807L;
    }
}
