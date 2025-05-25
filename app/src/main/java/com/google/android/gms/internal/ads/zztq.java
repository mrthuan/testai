package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public abstract class zztq extends zzth {
    private final HashMap zza = new HashMap();
    private Handler zzb;
    private zzgu zzc;

    public abstract void zzA(Object obj, zzuk zzukVar, zzcc zzccVar);

    public final void zzB(final Object obj, zzuk zzukVar) {
        zzdi.zzd(!this.zza.containsKey(obj));
        zzuj zzujVar = new zzuj() { // from class: com.google.android.gms.internal.ads.zztn
            @Override // com.google.android.gms.internal.ads.zzuj
            public final void zza(zzuk zzukVar2, zzcc zzccVar) {
                zztq.this.zzA(obj, zzukVar2, zzccVar);
            }
        };
        zzto zztoVar = new zzto(this, obj);
        this.zza.put(obj, new zztp(zzukVar, zzujVar, zztoVar));
        Handler handler = this.zzb;
        handler.getClass();
        zzukVar.zzh(handler, zztoVar);
        Handler handler2 = this.zzb;
        handler2.getClass();
        zzukVar.zzg(handler2, zztoVar);
        zzukVar.zzm(zzujVar, this.zzc, zzb());
        if (!zzu()) {
            zzukVar.zzi(zzujVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzth
    public final void zzj() {
        for (zztp zztpVar : this.zza.values()) {
            zztpVar.zza.zzi(zztpVar.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzth
    public final void zzl() {
        for (zztp zztpVar : this.zza.values()) {
            zztpVar.zza.zzk(zztpVar.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzth
    public void zzn(zzgu zzguVar) {
        this.zzc = zzguVar;
        this.zzb = zzet.zzx(null);
    }

    @Override // com.google.android.gms.internal.ads.zzth
    public void zzq() {
        for (zztp zztpVar : this.zza.values()) {
            zztpVar.zza.zzp(zztpVar.zzb);
            zztpVar.zza.zzs(zztpVar.zzc);
            zztpVar.zza.zzr(zztpVar.zzc);
        }
        this.zza.clear();
    }

    public int zzw(Object obj, int i10) {
        return 0;
    }

    public zzui zzy(Object obj, zzui zzuiVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public void zzz() {
        for (zztp zztpVar : this.zza.values()) {
            zztpVar.zza.zzz();
        }
    }

    public long zzx(Object obj, long j10, zzui zzuiVar) {
        return j10;
    }
}
