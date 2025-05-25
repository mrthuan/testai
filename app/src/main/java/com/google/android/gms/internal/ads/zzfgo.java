package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfgo implements zzcwt {
    private final HashSet zza = new HashSet();
    private final Context zzb;
    private final zzbzi zzc;

    public zzfgo(Context context, zzbzi zzbziVar) {
        this.zzb = context;
        this.zzc = zzbziVar;
    }

    public final Bundle zzb() {
        return this.zzc.zzn(this.zzb, this);
    }

    public final synchronized void zzc(HashSet hashSet) {
        this.zza.clear();
        this.zza.addAll(hashSet);
    }

    @Override // com.google.android.gms.internal.ads.zzcwt
    public final synchronized void zzdB(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (zzeVar.f10146a != 3) {
            this.zzc.zzl(this.zza);
        }
    }
}
