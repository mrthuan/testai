package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.android.gms.ads.admanager.AppEventListener;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzemk implements AppEventListener, zzczo, zzcye, zzcwt, zzcxk, com.google.android.gms.ads.internal.client.zza, zzcwq, zzczb, zzcxg, zzdeq {
    final zzdsk zza;
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private final AtomicBoolean zzh = new AtomicBoolean(true);
    private final AtomicBoolean zzi = new AtomicBoolean(false);
    private final AtomicBoolean zzj = new AtomicBoolean(false);
    final BlockingQueue zzb = new ArrayBlockingQueue(((Integer) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzhX)).intValue());

    public zzemk(zzdsk zzdskVar) {
        this.zza = zzdskVar;
    }

    private final void zzo() {
        if (this.zzi.get() && this.zzj.get()) {
            for (final Pair pair : this.zzb) {
                zzfbq.zza(this.zzd, new zzfbp() { // from class: com.google.android.gms.internal.ads.zzelv
                    @Override // com.google.android.gms.internal.ads.zzfbp
                    public final void zza(Object obj) {
                        Pair pair2 = pair;
                        ((com.google.android.gms.ads.internal.client.zzcb) obj).zzc((String) pair2.first, (String) pair2.second);
                    }
                });
            }
            this.zzb.clear();
            this.zzh.set(false);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzjR)).booleanValue()) {
            zzfbq.zza(this.zzc, new zzemi());
        }
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final synchronized void onAppEvent(final String str, final String str2) {
        if (this.zzh.get()) {
            if (!this.zzb.offer(new Pair(str, str2))) {
                com.google.android.gms.ads.internal.util.client.zzm.b("The queue for app events is full, dropping the new event.");
                zzdsk zzdskVar = this.zza;
                if (zzdskVar != null) {
                    zzdsj zza = zzdskVar.zza();
                    zza.zzb("action", "dae_action");
                    zza.zzb("dae_name", str);
                    zza.zzb("dae_data", str2);
                    zza.zzf();
                    return;
                }
            }
            return;
        }
        zzfbq.zza(this.zzd, new zzfbp() { // from class: com.google.android.gms.internal.ads.zzemc
            @Override // com.google.android.gms.internal.ads.zzfbp
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzcb) obj).zzc(str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwq
    public final void zza() {
        zzfbq.zza(this.zzc, new zzfbp() { // from class: com.google.android.gms.internal.ads.zzels
            @Override // com.google.android.gms.internal.ads.zzfbp
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbh) obj).zzd();
            }
        });
        zzfbq.zza(this.zzg, new zzfbp() { // from class: com.google.android.gms.internal.ads.zzelt
            @Override // com.google.android.gms.internal.ads.zzfbp
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzci) obj).zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwq
    public final void zzb() {
        zzfbq.zza(this.zzc, new zzfbp() { // from class: com.google.android.gms.internal.ads.zzemd
            @Override // com.google.android.gms.internal.ads.zzfbp
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbh) obj).zzh();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwq
    public final void zzc() {
        zzfbq.zza(this.zzc, new zzfbp() { // from class: com.google.android.gms.internal.ads.zzemf
            @Override // com.google.android.gms.internal.ads.zzfbp
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbh) obj).zzj();
            }
        });
        zzfbq.zza(this.zzg, new zzfbp() { // from class: com.google.android.gms.internal.ads.zzemg
            @Override // com.google.android.gms.internal.ads.zzfbp
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzci) obj).zzf();
            }
        });
        zzfbq.zza(this.zzg, new zzfbp() { // from class: com.google.android.gms.internal.ads.zzemh
            @Override // com.google.android.gms.internal.ads.zzfbp
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzci) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwt
    public final void zzdB(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfbq.zza(this.zzc, new zzfbp() { // from class: com.google.android.gms.internal.ads.zzelw
            @Override // com.google.android.gms.internal.ads.zzfbp
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbh) obj).zzf(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
        zzfbq.zza(this.zzc, new zzfbp() { // from class: com.google.android.gms.internal.ads.zzelx
            @Override // com.google.android.gms.internal.ads.zzfbp
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbh) obj).zze(com.google.android.gms.ads.internal.client.zze.this.f10146a);
            }
        });
        zzfbq.zza(this.zzf, new zzfbp() { // from class: com.google.android.gms.internal.ads.zzely
            @Override // com.google.android.gms.internal.ads.zzfbp
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbk) obj).zzb(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
        this.zzh.set(false);
        this.zzb.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzdeq
    public final void zzdG() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzjR)).booleanValue()) {
            zzfbq.zza(this.zzc, new zzemi());
        }
        zzfbq.zza(this.zzg, new zzfbp() { // from class: com.google.android.gms.internal.ads.zzelu
            @Override // com.google.android.gms.internal.ads.zzfbp
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzci) obj).zzb();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdeq
    public final void zzdf() {
        zzfbq.zza(this.zzc, new zzfbp() { // from class: com.google.android.gms.internal.ads.zzeme
            @Override // com.google.android.gms.internal.ads.zzfbp
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbh) obj).zzk();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzczo
    public final void zzdo(zzfex zzfexVar) {
        this.zzh.set(true);
        this.zzj.set(false);
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzbh zzg() {
        return (com.google.android.gms.ads.internal.client.zzbh) this.zzc.get();
    }

    @Override // com.google.android.gms.internal.ads.zzczb
    public final void zzh(final com.google.android.gms.ads.internal.client.zzs zzsVar) {
        zzfbq.zza(this.zze, new zzfbp() { // from class: com.google.android.gms.internal.ads.zzemj
            @Override // com.google.android.gms.internal.ads.zzfbp
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzdg) obj).Y(com.google.android.gms.ads.internal.client.zzs.this);
            }
        });
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzcb zzi() {
        return (com.google.android.gms.ads.internal.client.zzcb) this.zzd.get();
    }

    public final void zzj(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        this.zzc.set(zzbhVar);
    }

    public final void zzk(com.google.android.gms.ads.internal.client.zzbk zzbkVar) {
        this.zzf.set(zzbkVar);
    }

    public final void zzl(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        this.zze.set(zzdgVar);
    }

    public final void zzm(com.google.android.gms.ads.internal.client.zzcb zzcbVar) {
        this.zzd.set(zzcbVar);
        this.zzi.set(true);
        zzo();
    }

    public final void zzn(com.google.android.gms.ads.internal.client.zzci zzciVar) {
        this.zzg.set(zzciVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcxg
    public final void zzq(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfbq.zza(this.zzg, new zzfbp() { // from class: com.google.android.gms.internal.ads.zzemb
            @Override // com.google.android.gms.internal.ads.zzfbp
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzci) obj).zzd(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcxk
    public final void zzr() {
        zzfbq.zza(this.zzc, new zzfbp() { // from class: com.google.android.gms.internal.ads.zzelr
            @Override // com.google.android.gms.internal.ads.zzfbp
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbh) obj).zzg();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcye
    public final synchronized void zzs() {
        zzfbq.zza(this.zzc, new zzfbp() { // from class: com.google.android.gms.internal.ads.zzelz
            @Override // com.google.android.gms.internal.ads.zzfbp
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbh) obj).zzi();
            }
        });
        zzfbq.zza(this.zzf, new zzfbp() { // from class: com.google.android.gms.internal.ads.zzema
            @Override // com.google.android.gms.internal.ads.zzfbp
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbk) obj).zzc();
            }
        });
        this.zzj.set(true);
        zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzcwq
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzcwq
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzczo
    public final void zzdn(zzbvb zzbvbVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcwq
    public final void zzds(zzbvn zzbvnVar, String str, String str2) {
    }
}
