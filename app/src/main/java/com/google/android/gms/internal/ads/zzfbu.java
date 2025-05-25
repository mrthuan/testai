package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfbu implements zzful {
    final /* synthetic */ zzfby zza;

    public zzfbu(zzfby zzfbyVar) {
        this.zza = zzfbyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzful
    @NullableDecl
    public final Object apply(@NullableDecl Object obj) {
        zzfhe zze;
        zzfbx zzfbxVar;
        zzdyp zzdypVar = (zzdyp) obj;
        com.google.android.gms.ads.internal.util.client.zzm.g(6);
        com.google.android.gms.ads.internal.util.zze.h("Failed to get a cache key, reverting to legacy flow.");
        zzfby zzfbyVar = this.zza;
        zze = zzfbyVar.zze();
        zzfbyVar.zzd = new zzfbx(null, zze, null);
        zzfbxVar = this.zza.zzd;
        return zzfbxVar;
    }
}
