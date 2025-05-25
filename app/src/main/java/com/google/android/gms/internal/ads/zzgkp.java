package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzgkp extends ThreadLocal {
    public static final Cipher zza() {
        boolean zze;
        try {
            Cipher cipher = (Cipher) zzguz.zza.zza("AES/GCM-SIV/NoPadding");
            zze = zzgkq.zze(cipher);
            if (!zze) {
                return null;
            }
            return cipher;
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override // java.lang.ThreadLocal
    public final /* bridge */ /* synthetic */ Object initialValue() {
        return zza();
    }
}
