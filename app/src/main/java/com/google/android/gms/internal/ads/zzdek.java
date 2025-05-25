package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdek extends zzdch implements zzaxw {
    private final Map zzb;
    private final Context zzc;
    private final zzfel zzd;

    public zzdek(Context context, Set set, zzfel zzfelVar) {
        super(set);
        this.zzb = new WeakHashMap(1);
        this.zzc = context;
        this.zzd = zzfelVar;
    }

    public final synchronized void zza(View view) {
        zzaxx zzaxxVar = (zzaxx) this.zzb.get(view);
        if (zzaxxVar == null) {
            zzaxx zzaxxVar2 = new zzaxx(this.zzc, view);
            zzaxxVar2.zzc(this);
            this.zzb.put(view, zzaxxVar2);
            zzaxxVar = zzaxxVar2;
        }
        if (this.zzd.zzX) {
            zzbbn zzbbnVar = zzbbw.zzbf;
            com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
            if (((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue()) {
                zzaxxVar.zzg(((Long) zzbaVar.c.zza(zzbbw.zzbe)).longValue());
                return;
            }
        }
        zzaxxVar.zzf();
    }

    public final synchronized void zzb(View view) {
        if (this.zzb.containsKey(view)) {
            ((zzaxx) this.zzb.get(view)).zze(this);
            this.zzb.remove(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxw
    public final synchronized void zzdp(final zzaxv zzaxvVar) {
        zzq(new zzdcg() { // from class: com.google.android.gms.internal.ads.zzdej
            @Override // com.google.android.gms.internal.ads.zzdcg
            public final void zza(Object obj) {
                ((zzaxw) obj).zzdp(zzaxv.this);
            }
        });
    }
}
