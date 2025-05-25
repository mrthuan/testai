package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzfbm implements zzgcf {
    public zzfbm(zzfbo zzfboVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final void zza(Throwable th2) {
        com.google.android.gms.ads.internal.util.zze.h("Notification of cache hit failed.");
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final /* synthetic */ void zzb(@NullableDecl Object obj) {
        Void r12 = (Void) obj;
        com.google.android.gms.ads.internal.util.zze.h("Notification of cache hit successful.");
    }
}
