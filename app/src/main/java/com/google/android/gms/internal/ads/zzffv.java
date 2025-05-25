package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzffv {
    public zzffv() {
        try {
            zzgev.zza();
        } catch (GeneralSecurityException e10) {
            com.google.android.gms.ads.internal.util.zze.h("Failed to Configure Aead. ".concat(e10.toString()));
            com.google.android.gms.ads.internal.zzu.B.f10557g.zzw(e10, "CryptoUtils.registerAead");
        }
    }

    public static final String zza() {
        zzgwl zzt = zzgwm.zzt();
        try {
            zzgdr.zzb(zzgej.zzb(zzgeb.zza(zzgmg.zzb().zza("AES128_GCM"))), zzgdq.zzb(zzt));
        } catch (IOException | GeneralSecurityException e10) {
            com.google.android.gms.ads.internal.util.zze.h("Failed to generate key".concat(e10.toString()));
            com.google.android.gms.ads.internal.zzu.B.f10557g.zzw(e10, "CryptoUtils.generateKey");
        }
        String encodeToString = Base64.encodeToString(zzt.zzb().zzA(), 11);
        zzt.zzc();
        return encodeToString;
    }

    public static final String zzb(byte[] bArr, byte[] bArr2, String str, zzdsf zzdsfVar) {
        zzgej zzc = zzc(str);
        if (zzc == null) {
            return null;
        }
        try {
            byte[] zza = ((zzgdo) zzc.zzd(zzgnp.zza(), zzgdo.class)).zza(bArr, bArr2);
            zzdsfVar.zzb().put("ds", "1");
            return new String(zza, "UTF-8");
        } catch (UnsupportedEncodingException | UnsupportedOperationException | GeneralSecurityException e10) {
            com.google.android.gms.ads.internal.util.zze.h("Failed to decrypt ".concat(e10.toString()));
            com.google.android.gms.ads.internal.zzu.B.f10557g.zzw(e10, "CryptoUtils.decrypt");
            zzdsfVar.zzb().put("dsf", e10.toString());
            return null;
        }
    }

    private static final zzgej zzc(String str) {
        try {
            return zzgdr.zza(zzgdp.zzb(Base64.decode(str, 11)));
        } catch (IOException | GeneralSecurityException e10) {
            com.google.android.gms.ads.internal.util.zze.h("Failed to get keysethandle".concat(e10.toString()));
            com.google.android.gms.ads.internal.zzu.B.f10557g.zzw(e10, "CryptoUtils.getHandle");
            return null;
        }
    }
}
