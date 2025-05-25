package com.google.android.gms.internal.play_billing;

import a0.d;
import java.nio.charset.Charset;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes2.dex */
public class zzbn extends zzbm {
    protected final byte[] zza;

    public zzbn(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzbq) || zzd() != ((zzbq) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (obj instanceof zzbn) {
            zzbn zzbnVar = (zzbn) obj;
            int zzk = zzk();
            int zzk2 = zzbnVar.zzk();
            if (zzk != 0 && zzk2 != 0 && zzk != zzk2) {
                return false;
            }
            int zzd = zzd();
            if (zzd <= zzbnVar.zzd()) {
                if (zzd <= zzbnVar.zzd()) {
                    byte[] bArr = this.zza;
                    byte[] bArr2 = zzbnVar.zza;
                    zzbnVar.zzc();
                    int i10 = 0;
                    int i11 = 0;
                    while (i10 < zzd) {
                        if (bArr[i10] != bArr2[i11]) {
                            return false;
                        }
                        i10++;
                        i11++;
                    }
                    return true;
                }
                throw new IllegalArgumentException(d.b("Ran off end of other: 0, ", zzd, ", ", zzbnVar.zzd()));
            }
            throw new IllegalArgumentException("Length too large: " + zzd + zzd());
        }
        return obj.equals(this);
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    public byte zza(int i10) {
        return this.zza[i10];
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    public byte zzb(int i10) {
        return this.zza[i10];
    }

    public int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    public final int zze(int i10, int i11, int i12) {
        return zzda.zzb(i10, this.zza, 0, i12);
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    public final zzbq zzf(int i10, int i11) {
        int zzj = zzbq.zzj(0, i11, zzd());
        if (zzj == 0) {
            return zzbq.zzb;
        }
        return new zzbj(this.zza, 0, zzj);
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    public final String zzg(Charset charset) {
        return new String(this.zza, 0, zzd(), charset);
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    public final void zzh(zzbf zzbfVar) {
        ((zzbv) zzbfVar).zzc(this.zza, 0, zzd());
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    public final boolean zzi() {
        return zzfu.zze(this.zza, 0, zzd());
    }
}
