package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzeqd implements zzevo {
    private final zzfbj zza;

    public zzeqd(zzfbj zzfbjVar) {
        this.zza = zzfbjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final int zza() {
        return 15;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final y9.a zzb() {
        zzfbj zzfbjVar = this.zza;
        zzevn zzevnVar = null;
        if (zzfbjVar != null && zzfbjVar.zza() != null && !zzfbjVar.zza().isEmpty()) {
            zzevnVar = new zzevn() { // from class: com.google.android.gms.internal.ads.zzeqc
                @Override // com.google.android.gms.internal.ads.zzevn
                public final void zzj(Object obj) {
                    zzeqd.this.zzc((Bundle) obj);
                }
            };
        }
        return zzgcj.zzh(zzevnVar);
    }

    public final /* synthetic */ void zzc(Bundle bundle) {
        bundle.putString("key_schema", this.zza.zza());
    }
}
