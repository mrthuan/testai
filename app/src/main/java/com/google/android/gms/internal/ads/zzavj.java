package com.google.android.gms.internal.ads;

import android.view.View;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzavj implements zzfqg {
    private final zzfoj zza;
    private final zzfpa zzb;
    private final zzavw zzc;
    private final zzavi zzd;
    private final zzaus zze;
    private final zzavy zzf;
    private final zzavq zzg;
    private final zzavh zzh;

    public zzavj(zzfoj zzfojVar, zzfpa zzfpaVar, zzavw zzavwVar, zzavi zzaviVar, zzaus zzausVar, zzavy zzavyVar, zzavq zzavqVar, zzavh zzavhVar) {
        this.zza = zzfojVar;
        this.zzb = zzfpaVar;
        this.zzc = zzavwVar;
        this.zzd = zzaviVar;
        this.zze = zzausVar;
        this.zzf = zzavyVar;
        this.zzg = zzavqVar;
        this.zzh = zzavhVar;
    }

    private final Map zze() {
        HashMap hashMap = new HashMap();
        zzfoj zzfojVar = this.zza;
        zzasj zzb = this.zzb.zzb();
        hashMap.put(OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, zzfojVar.zzb());
        hashMap.put("gms", Boolean.valueOf(this.zza.zzc()));
        hashMap.put("int", zzb.zzh());
        hashMap.put("up", Boolean.valueOf(this.zzd.zza()));
        hashMap.put("t", new Throwable());
        zzavq zzavqVar = this.zzg;
        if (zzavqVar != null) {
            hashMap.put("tcq", Long.valueOf(zzavqVar.zzc()));
            hashMap.put("tpq", Long.valueOf(this.zzg.zzg()));
            hashMap.put("tcv", Long.valueOf(this.zzg.zzd()));
            hashMap.put("tpv", Long.valueOf(this.zzg.zzh()));
            hashMap.put("tchv", Long.valueOf(this.zzg.zzb()));
            hashMap.put("tphv", Long.valueOf(this.zzg.zzf()));
            hashMap.put("tcc", Long.valueOf(this.zzg.zza()));
            hashMap.put("tpc", Long.valueOf(this.zzg.zze()));
        }
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.zzfqg
    public final Map zza() {
        zzavw zzavwVar = this.zzc;
        Map zze = zze();
        zze.put("lts", Long.valueOf(zzavwVar.zza()));
        return zze;
    }

    @Override // com.google.android.gms.internal.ads.zzfqg
    public final Map zzb() {
        Map zze = zze();
        zzasj zza = this.zzb.zza();
        zze.put("gai", Boolean.valueOf(this.zza.zzd()));
        zze.put("did", zza.zzg());
        zze.put("dst", Integer.valueOf(zza.zzal() - 1));
        zze.put("doo", Boolean.valueOf(zza.zzai()));
        zzaus zzausVar = this.zze;
        if (zzausVar != null) {
            zze.put("nt", Long.valueOf(zzausVar.zza()));
        }
        zzavy zzavyVar = this.zzf;
        if (zzavyVar != null) {
            zze.put("vs", Long.valueOf(zzavyVar.zzc()));
            zze.put("vf", Long.valueOf(this.zzf.zzb()));
        }
        return zze;
    }

    @Override // com.google.android.gms.internal.ads.zzfqg
    public final Map zzc() {
        zzavh zzavhVar = this.zzh;
        Map zze = zze();
        if (zzavhVar != null) {
            zze.put("vst", zzavhVar.zza());
        }
        return zze;
    }

    public final void zzd(View view) {
        this.zzc.zzd(view);
    }
}
