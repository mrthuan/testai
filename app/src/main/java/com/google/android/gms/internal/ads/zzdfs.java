package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public class zzdfs {
    private final zzdgx zza;
    private final zzcej zzb;

    public zzdfs(zzdgx zzdgxVar, zzcej zzcejVar) {
        this.zza = zzdgxVar;
        this.zzb = zzcejVar;
    }

    public static final zzdei zzh(zzfjr zzfjrVar) {
        return new zzdei(zzfjrVar, zzbzo.zzf);
    }

    public static final zzdei zzi(zzdhc zzdhcVar) {
        return new zzdei(zzdhcVar, zzbzo.zzf);
    }

    public final View zza() {
        zzcej zzcejVar = this.zzb;
        if (zzcejVar == null) {
            return null;
        }
        return zzcejVar.zzG();
    }

    public final View zzb() {
        zzcej zzcejVar = this.zzb;
        if (zzcejVar != null) {
            return zzcejVar.zzG();
        }
        return null;
    }

    public final zzcej zzc() {
        return this.zzb;
    }

    public final zzdei zzd(Executor executor) {
        final zzcej zzcejVar = this.zzb;
        return new zzdei(new zzdbg() { // from class: com.google.android.gms.internal.ads.zzdfr
            @Override // com.google.android.gms.internal.ads.zzdbg
            public final void zza() {
                com.google.android.gms.ads.internal.overlay.zzm zzL;
                zzcej zzcejVar2 = zzcej.this;
                if (zzcejVar2 != null && (zzL = zzcejVar2.zzL()) != null) {
                    zzL.zzb();
                }
            }
        }, executor);
    }

    public final zzdgx zze() {
        return this.zza;
    }

    public Set zzf(zzcvn zzcvnVar) {
        return Collections.singleton(new zzdei(zzcvnVar, zzbzo.zzf));
    }

    public Set zzg(zzcvn zzcvnVar) {
        return Collections.singleton(new zzdei(zzcvnVar, zzbzo.zzf));
    }
}
