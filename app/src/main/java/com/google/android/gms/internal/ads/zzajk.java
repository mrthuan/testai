package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzajk extends zzajo {
    private static final byte[] zza = {Field.AUTOTEXT, 112, 117, 115, Field.NOTEREF, 101, 97, 100};
    private static final byte[] zzb = {Field.AUTOTEXT, 112, 117, 115, Field.ADVANCE, 97, 103, 115};
    private boolean zzc;

    public static boolean zzd(zzek zzekVar) {
        return zzk(zzekVar, zza);
    }

    private static boolean zzk(zzek zzekVar, byte[] bArr) {
        if (zzekVar.zzb() < 8) {
            return false;
        }
        int zzd = zzekVar.zzd();
        byte[] bArr2 = new byte[8];
        zzekVar.zzG(bArr2, 0, 8);
        zzekVar.zzK(zzd);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzajo
    public final long zza(zzek zzekVar) {
        return zzg(zzade.zzd(zzekVar.zzM()));
    }

    @Override // com.google.android.gms.internal.ads.zzajo
    public final void zzb(boolean z10) {
        super.zzb(z10);
        if (z10) {
            this.zzc = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzajo
    public final boolean zzc(zzek zzekVar, long j10, zzajl zzajlVar) {
        if (zzk(zzekVar, zza)) {
            byte[] copyOf = Arrays.copyOf(zzekVar.zzM(), zzekVar.zze());
            int i10 = copyOf[9] & 255;
            List zze = zzade.zze(copyOf);
            if (zzajlVar.zza == null) {
                zzad zzadVar = new zzad();
                zzadVar.zzX("audio/opus");
                zzadVar.zzy(i10);
                zzadVar.zzY(48000);
                zzadVar.zzL(zze);
                zzajlVar.zza = zzadVar.zzad();
                return true;
            }
        } else if (zzk(zzekVar, zzb)) {
            zzdi.zzb(zzajlVar.zza);
            if (!this.zzc) {
                this.zzc = true;
                zzekVar.zzL(8);
                zzbk zzb2 = zzadv.zzb(zzfxr.zzl(zzadv.zzc(zzekVar, false, false).zza));
                if (zzb2 != null) {
                    zzad zzb3 = zzajlVar.zza.zzb();
                    zzb3.zzQ(zzb2.zzd(zzajlVar.zza.zzk));
                    zzajlVar.zza = zzb3.zzad();
                }
            }
        } else {
            zzdi.zzb(zzajlVar.zza);
            return false;
        }
        return true;
    }
}
