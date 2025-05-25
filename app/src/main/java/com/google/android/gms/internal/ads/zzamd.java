package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzamd implements zzamf {
    private final zzek zza;
    private final String zzc;
    private final int zzd;
    private String zze;
    private zzadp zzf;
    private int zzh;
    private int zzi;
    private long zzj;
    private zzaf zzk;
    private int zzl;
    private int zzm;
    private int zzg = 0;
    private long zzp = -9223372036854775807L;
    private final AtomicInteger zzb = new AtomicInteger();
    private int zzn = -1;
    private int zzo = -1;

    public zzamd(String str, int i10, int i11) {
        this.zza = new zzek(new byte[i11]);
        this.zzc = str;
        this.zzd = i10;
    }

    private final void zzf(zzacg zzacgVar) {
        int i10;
        zzad zzb;
        int i11 = zzacgVar.zzb;
        if (i11 != -2147483647 && (i10 = zzacgVar.zzc) != -1) {
            zzaf zzafVar = this.zzk;
            if (zzafVar == null || i10 != zzafVar.zzz || i11 != zzafVar.zzA || !zzet.zzG(zzacgVar.zza, zzafVar.zzm)) {
                zzaf zzafVar2 = this.zzk;
                if (zzafVar2 == null) {
                    zzb = new zzad();
                } else {
                    zzb = zzafVar2.zzb();
                }
                zzb.zzK(this.zze);
                zzb.zzX(zzacgVar.zza);
                zzb.zzy(zzacgVar.zzc);
                zzb.zzY(zzacgVar.zzb);
                zzb.zzO(this.zzc);
                zzb.zzV(this.zzd);
                zzaf zzad = zzb.zzad();
                this.zzk = zzad;
                this.zzf.zzl(zzad);
            }
        }
    }

    private final boolean zzg(zzek zzekVar, byte[] bArr, int i10) {
        int min = Math.min(zzekVar.zzb(), i10 - this.zzh);
        zzekVar.zzG(bArr, this.zzh, min);
        int i11 = this.zzh + min;
        this.zzh = i11;
        if (i11 == i10) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01d9  */
    @Override // com.google.android.gms.internal.ads.zzamf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(com.google.android.gms.internal.ads.zzek r17) {
        /*
            Method dump skipped, instructions count: 666
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamd.zza(com.google.android.gms.internal.ads.zzek):void");
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zzb(zzacn zzacnVar, zzans zzansVar) {
        zzansVar.zzc();
        this.zze = zzansVar.zzb();
        this.zzf = zzacnVar.zzw(zzansVar.zza(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zzd(long j10, int i10) {
        this.zzp = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zze() {
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = 0;
        this.zzp = -9223372036854775807L;
        this.zzb.set(0);
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zzc(boolean z10) {
    }
}
