package com.google.android.gms.internal.ads;

import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzaep extends zzaet {
    private static final int[] zzb = {5512, 11025, 22050, 44100};
    private boolean zzc;
    private boolean zzd;
    private int zze;

    public zzaep(zzadp zzadpVar) {
        super(zzadpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final boolean zza(zzek zzekVar) {
        String str;
        if (!this.zzc) {
            int zzm = zzekVar.zzm();
            int i10 = zzm >> 4;
            this.zze = i10;
            if (i10 == 2) {
                int i11 = zzb[(zzm >> 2) & 3];
                zzad zzadVar = new zzad();
                zzadVar.zzX("audio/mpeg");
                zzadVar.zzy(1);
                zzadVar.zzY(i11);
                this.zza.zzl(zzadVar.zzad());
                this.zzd = true;
            } else if (i10 != 7 && i10 != 8) {
                if (i10 != 10) {
                    throw new zzaes(b.a.c("Audio format not supported: ", i10));
                }
            } else {
                zzad zzadVar2 = new zzad();
                if (i10 == 7) {
                    str = "audio/g711-alaw";
                } else {
                    str = "audio/g711-mlaw";
                }
                zzadVar2.zzX(str);
                zzadVar2.zzy(1);
                zzadVar2.zzY(8000);
                this.zza.zzl(zzadVar2.zzad());
                this.zzd = true;
            }
            this.zzc = true;
        } else {
            zzekVar.zzL(1);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final boolean zzb(zzek zzekVar, long j10) {
        if (this.zze == 2) {
            int zzb2 = zzekVar.zzb();
            this.zza.zzq(zzekVar, zzb2);
            this.zza.zzs(j10, 1, zzb2, 0, null);
            return true;
        }
        int zzm = zzekVar.zzm();
        if (zzm == 0 && !this.zzd) {
            int zzb3 = zzekVar.zzb();
            byte[] bArr = new byte[zzb3];
            zzekVar.zzG(bArr, 0, zzb3);
            zzabf zza = zzabg.zza(bArr);
            zzad zzadVar = new zzad();
            zzadVar.zzX("audio/mp4a-latm");
            zzadVar.zzz(zza.zzc);
            zzadVar.zzy(zza.zzb);
            zzadVar.zzY(zza.zza);
            zzadVar.zzL(Collections.singletonList(bArr));
            this.zza.zzl(zzadVar.zzad());
            this.zzd = true;
            return false;
        } else if (this.zze == 10 && zzm != 1) {
            return false;
        } else {
            int zzb4 = zzekVar.zzb();
            this.zza.zzq(zzekVar, zzb4);
            this.zza.zzs(j10, 1, zzb4, 0, null);
            return true;
        }
    }
}
