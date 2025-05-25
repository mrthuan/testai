package com.google.android.gms.internal.ads;

import java.security.Provider;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgut implements zzguy {
    private final zzgvh zza;

    public /* synthetic */ zzgut(zzgvh zzgvhVar, zzgus zzgusVar) {
        this.zza = zzgvhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzguy
    public final Object zza(String str) {
        for (Provider provider : zzguz.zzb("GmsCore_OpenSSL", "AndroidOpenSSL")) {
            try {
                return this.zza.zza(str, provider);
            } catch (Exception unused) {
            }
        }
        return this.zza.zza(str, null);
    }
}
