package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzapu implements zzapg {
    private final Map zza = new HashMap();
    private final zzaot zzb;
    private final BlockingQueue zzc;
    private final zzaoy zzd;

    public zzapu(zzaot zzaotVar, BlockingQueue blockingQueue, zzaoy zzaoyVar) {
        this.zzd = zzaoyVar;
        this.zzb = zzaotVar;
        this.zzc = blockingQueue;
    }

    @Override // com.google.android.gms.internal.ads.zzapg
    public final synchronized void zza(zzaph zzaphVar) {
        Map map = this.zza;
        String zzj = zzaphVar.zzj();
        List list = (List) map.remove(zzj);
        if (list != null && !list.isEmpty()) {
            if (zzapt.zzb) {
                zzapt.zzd("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), zzj);
            }
            zzaph zzaphVar2 = (zzaph) list.remove(0);
            this.zza.put(zzj, list);
            zzaphVar2.zzu(this);
            try {
                this.zzc.put(zzaphVar2);
            } catch (InterruptedException e10) {
                zzapt.zzb("Couldn't add request to queue. %s", e10.toString());
                Thread.currentThread().interrupt();
                this.zzb.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapg
    public final void zzb(zzaph zzaphVar, zzapn zzapnVar) {
        List<zzaph> list;
        zzaoq zzaoqVar = zzapnVar.zzb;
        if (zzaoqVar != null && !zzaoqVar.zza(System.currentTimeMillis())) {
            String zzj = zzaphVar.zzj();
            synchronized (this) {
                list = (List) this.zza.remove(zzj);
            }
            if (list != null) {
                if (zzapt.zzb) {
                    zzapt.zzd("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), zzj);
                }
                for (zzaph zzaphVar2 : list) {
                    this.zzd.zzb(zzaphVar2, zzapnVar, null);
                }
                return;
            }
            return;
        }
        zza(zzaphVar);
    }

    public final synchronized boolean zzc(zzaph zzaphVar) {
        Map map = this.zza;
        String zzj = zzaphVar.zzj();
        if (map.containsKey(zzj)) {
            List list = (List) this.zza.get(zzj);
            if (list == null) {
                list = new ArrayList();
            }
            zzaphVar.zzm("waiting-for-response");
            list.add(zzaphVar);
            this.zza.put(zzj, list);
            if (zzapt.zzb) {
                zzapt.zza("Request for cacheKey=%s is in flight, putting on hold.", zzj);
            }
            return true;
        }
        this.zza.put(zzj, null);
        zzaphVar.zzu(this);
        if (zzapt.zzb) {
            zzapt.zza("new request, sending to network %s", zzj);
        }
        return false;
    }
}
