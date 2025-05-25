package com.google.android.gms.internal.measurement;

import a0.d;
import java.nio.charset.Charset;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.2 */
/* loaded from: classes2.dex */
public class zzjx extends zzjw {
    protected final byte[] zza;

    public zzjx(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzka) || zzd() != ((zzka) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (obj instanceof zzjx) {
            zzjx zzjxVar = (zzjx) obj;
            int zzk = zzk();
            int zzk2 = zzjxVar.zzk();
            if (zzk != 0 && zzk2 != 0 && zzk != zzk2) {
                return false;
            }
            int zzd = zzd();
            if (zzd <= zzjxVar.zzd()) {
                if (zzd <= zzjxVar.zzd()) {
                    byte[] bArr = this.zza;
                    byte[] bArr2 = zzjxVar.zza;
                    zzjxVar.zzc();
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
                throw new IllegalArgumentException(d.b("Ran off end of other: 0, ", zzd, ", ", zzjxVar.zzd()));
            }
            throw new IllegalArgumentException("Length too large: " + zzd + zzd());
        }
        return obj.equals(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    public byte zza(int i10) {
        return this.zza[i10];
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    public byte zzb(int i10) {
        return this.zza[i10];
    }

    public int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    public final int zze(int i10, int i11, int i12) {
        return zzlj.zzb(i10, this.zza, 0, i12);
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    public final zzka zzf(int i10, int i11) {
        int zzj = zzka.zzj(0, i11, zzd());
        if (zzj == 0) {
            return zzka.zzb;
        }
        return new zzju(this.zza, 0, zzj);
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    public final String zzg(Charset charset) {
        return new String(this.zza, 0, zzd(), charset);
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    public final void zzh(zzjq zzjqVar) {
        ((zzkf) zzjqVar).zzc(this.zza, 0, zzd());
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    public final boolean zzi() {
        return zznz.zze(this.zza, 0, zzd());
    }
}
