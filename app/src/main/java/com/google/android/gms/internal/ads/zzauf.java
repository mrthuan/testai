package com.google.android.gms.internal.ads;

import java.io.File;
import java.security.GeneralSecurityException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzauf implements zzfqc {
    final /* synthetic */ zzfoc zza;

    public zzauf(zzauh zzauhVar, zzfoc zzfocVar) {
        this.zza = zzfocVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfqc
    public final boolean zza(File file) {
        try {
            return this.zza.zza(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
