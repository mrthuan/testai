package com.google.android.gms.internal.ads;

import java.util.List;
import lib.zj.office.fc.hslf.record.SlideAtom;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzaly implements zzack {
    private final zzalz zza = new zzalz(null, 0);
    private final zzek zzb = new zzek(16384);
    private boolean zzc;

    @Override // com.google.android.gms.internal.ads.zzack
    public final int zzb(zzacl zzaclVar, zzadf zzadfVar) {
        int zza = zzaclVar.zza(this.zzb.zzM(), 0, 16384);
        if (zza == -1) {
            return -1;
        }
        this.zzb.zzK(0);
        this.zzb.zzJ(zza);
        if (!this.zzc) {
            this.zza.zzd(0L, 4);
            this.zzc = true;
        }
        this.zza.zza(this.zzb);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final /* synthetic */ List zzd() {
        return zzfxr.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final void zze(zzacn zzacnVar) {
        this.zza.zzb(zzacnVar, new zzans(SlideAtom.USES_MASTER_SLIDE_ID, 0, 1));
        zzacnVar.zzD();
        zzacnVar.zzO(new zzadh(-9223372036854775807L, 0L));
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final void zzi(long j10, long j11) {
        this.zzc = false;
        this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final boolean zzj(zzacl zzaclVar) {
        int i10;
        zzek zzekVar = new zzek(10);
        int i11 = 0;
        while (true) {
            zzaby zzabyVar = (zzaby) zzaclVar;
            zzabyVar.zzm(zzekVar.zzM(), 0, 10, false);
            zzekVar.zzK(0);
            if (zzekVar.zzo() != 4801587) {
                break;
            }
            zzekVar.zzL(3);
            int zzl = zzekVar.zzl();
            i11 += zzl + 10;
            zzabyVar.zzl(zzl, false);
        }
        zzaclVar.zzj();
        zzaby zzabyVar2 = (zzaby) zzaclVar;
        zzabyVar2.zzl(i11, false);
        int i12 = 0;
        int i13 = i11;
        while (true) {
            int i14 = 7;
            zzabyVar2.zzm(zzekVar.zzM(), 0, 7, false);
            zzekVar.zzK(0);
            int zzq = zzekVar.zzq();
            if (zzq != 44096 && zzq != 44097) {
                zzaclVar.zzj();
                i13++;
                if (i13 - i11 >= 8192) {
                    return false;
                }
                zzabyVar2.zzl(i13, false);
                i12 = 0;
            } else {
                i12++;
                if (i12 >= 4) {
                    return true;
                }
                byte[] zzM = zzekVar.zzM();
                if (zzM.length < 7) {
                    i10 = -1;
                } else {
                    int i15 = ((zzM[2] & 255) << 8) | (zzM[3] & 255);
                    if (i15 == 65535) {
                        i15 = ((zzM[4] & 255) << 16) | ((zzM[5] & 255) << 8) | (zzM[6] & 255);
                    } else {
                        i14 = 4;
                    }
                    if (zzq == 44097) {
                        i14 += 2;
                    }
                    i10 = i15 + i14;
                }
                if (i10 == -1) {
                    return false;
                }
                zzabyVar2.zzl(i10 - 7, false);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final /* synthetic */ zzack zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final void zzf() {
    }
}
