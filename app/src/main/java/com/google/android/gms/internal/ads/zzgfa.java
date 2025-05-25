package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzgfa implements zzgdo {
    private final zzgnj zza;

    public /* synthetic */ zzgfa(zzgnj zzgnjVar, zzgez zzgezVar) {
        this.zza = zzgnjVar;
        if (zzgnjVar.zzg()) {
            zzglp zza = zzgmf.zzb().zza();
            zzglu zza2 = zzglx.zza(zzgnjVar);
            zza.zza(zza2, "aead", "encrypt");
            zza.zza(zza2, "aead", "decrypt");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgdo
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        if (bArr.length > 5) {
            for (zzgnh zzgnhVar : this.zza.zzf(Arrays.copyOf(bArr, 5))) {
                try {
                    byte[] zza = ((zzgdo) zzgnhVar.zzd()).zza(bArr, bArr2);
                    zzgnhVar.zza();
                    return zza;
                } catch (GeneralSecurityException unused) {
                }
            }
        }
        for (zzgnh zzgnhVar2 : this.zza.zzf(zzgdt.zza)) {
            try {
                byte[] zza2 = ((zzgdo) zzgnhVar2.zzd()).zza(bArr, bArr2);
                zzgnhVar2.zza();
                return zza2;
            } catch (GeneralSecurityException unused2) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
