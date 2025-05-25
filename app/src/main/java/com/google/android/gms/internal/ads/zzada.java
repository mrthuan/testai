package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzada {
    private final zzek zza = new zzek(10);

    public final zzbk zza(zzacl zzaclVar, zzaga zzagaVar) {
        zzbk zzbkVar = null;
        int i10 = 0;
        while (true) {
            try {
                ((zzaby) zzaclVar).zzm(this.zza.zzM(), 0, 10, false);
                this.zza.zzK(0);
                if (this.zza.zzo() != 4801587) {
                    break;
                }
                this.zza.zzL(3);
                int zzl = this.zza.zzl();
                int i11 = zzl + 10;
                if (zzbkVar == null) {
                    byte[] bArr = new byte[i11];
                    System.arraycopy(this.zza.zzM(), 0, bArr, 0, 10);
                    ((zzaby) zzaclVar).zzm(bArr, 10, zzl, false);
                    zzbkVar = zzagc.zza(bArr, i11, zzagaVar, new zzafe());
                } else {
                    ((zzaby) zzaclVar).zzl(zzl, false);
                }
                i10 += i11;
            } catch (EOFException unused) {
            }
        }
        zzaclVar.zzj();
        ((zzaby) zzaclVar).zzl(i10, false);
        return zzbkVar;
    }
}
