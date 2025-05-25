package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgux implements zzguy {
    private final zzgvh zza;

    public /* synthetic */ zzgux(zzgvh zzgvhVar, zzguw zzguwVar) {
        this.zza = zzgvhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzguy
    public final Object zza(String str) {
        Exception exc = null;
        for (Provider provider : zzguz.zzb("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt")) {
            try {
                return this.zza.zza(str, provider);
            } catch (Exception e10) {
                if (exc == null) {
                    exc = e10;
                }
            }
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
