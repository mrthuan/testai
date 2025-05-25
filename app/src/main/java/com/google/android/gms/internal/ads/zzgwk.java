package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public class zzgwk extends zzgwj {
    protected final byte[] zza;

    public zzgwk(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgwm) || zzd() != ((zzgwm) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (obj instanceof zzgwk) {
            zzgwk zzgwkVar = (zzgwk) obj;
            int zzr = zzr();
            int zzr2 = zzgwkVar.zzr();
            if (zzr != 0 && zzr2 != 0 && zzr != zzr2) {
                return false;
            }
            return zzg(zzgwkVar, 0, zzd());
        }
        return obj.equals(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    public byte zza(int i10) {
        return this.zza[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    public byte zzb(int i10) {
        return this.zza[i10];
    }

    public int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    public void zze(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.zza, i10, bArr, i11, i12);
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    public final boolean zzg(zzgwm zzgwmVar, int i10, int i11) {
        if (i11 <= zzgwmVar.zzd()) {
            int i12 = i10 + i11;
            if (i12 <= zzgwmVar.zzd()) {
                if (zzgwmVar instanceof zzgwk) {
                    zzgwk zzgwkVar = (zzgwk) zzgwmVar;
                    byte[] bArr = this.zza;
                    byte[] bArr2 = zzgwkVar.zza;
                    int zzc = zzc() + i11;
                    int zzc2 = zzc();
                    int zzc3 = zzgwkVar.zzc() + i10;
                    while (zzc2 < zzc) {
                        if (bArr[zzc2] != bArr2[zzc3]) {
                            return false;
                        }
                        zzc2++;
                        zzc3++;
                    }
                    return true;
                }
                return zzgwmVar.zzk(i10, i12).equals(zzk(0, i11));
            }
            int zzd = zzgwmVar.zzd();
            StringBuilder f10 = a0.d.f("Ran off end of other: ", i10, ", ", i11, ", ");
            f10.append(zzd);
            throw new IllegalArgumentException(f10.toString());
        }
        int zzd2 = zzd();
        throw new IllegalArgumentException("Length too large: " + i11 + zzd2);
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    public final int zzi(int i10, int i11, int i12) {
        return zzgyl.zzb(i10, this.zza, zzc() + i11, i12);
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    public final int zzj(int i10, int i11, int i12) {
        int zzc = zzc() + i11;
        return zzhbe.zzf(i10, this.zza, zzc, i12 + zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    public final zzgwm zzk(int i10, int i11) {
        int zzq = zzgwm.zzq(i10, i11, zzd());
        if (zzq == 0) {
            return zzgwm.zzb;
        }
        return new zzgwg(this.zza, zzc() + i10, zzq);
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    public final zzgww zzl() {
        return zzgww.zzH(this.zza, zzc(), zzd(), true);
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    public final String zzm(Charset charset) {
        return new String(this.zza, zzc(), zzd(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    public final ByteBuffer zzn() {
        return ByteBuffer.wrap(this.zza, zzc(), zzd()).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    public final void zzo(zzgwd zzgwdVar) {
        zzgwdVar.zza(this.zza, zzc(), zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    public final boolean zzp() {
        int zzc = zzc();
        return zzhbe.zzi(this.zza, zzc, zzd() + zzc);
    }
}
