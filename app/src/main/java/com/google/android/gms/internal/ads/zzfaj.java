package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfaj implements zzcwt, zzcyp, zzfbz, com.google.android.gms.ads.internal.overlay.zzp, zzczb, zzcxg, zzdeq {
    private final zzfgq zza;
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private zzfaj zzh = null;

    public zzfaj(zzfgq zzfgqVar) {
        this.zza = zzfgqVar;
    }

    public static zzfaj zzi(zzfaj zzfajVar) {
        zzfaj zzfajVar2 = new zzfaj(zzfajVar.zza);
        zzfajVar2.zzh = zzfajVar;
        return zzfajVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzcwt
    public final void zzdB(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfaj zzfajVar = this.zzh;
        if (zzfajVar != null) {
            zzfajVar.zzdB(zzeVar);
            return;
        }
        zzfbq.zza(this.zzb, new zzfbp() { // from class: com.google.android.gms.internal.ads.zzfae
            @Override // com.google.android.gms.internal.ads.zzfbp
            public final void zza(Object obj) {
                ((zzazs) obj).zzc(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
        zzfbq.zza(this.zzb, new zzfbp() { // from class: com.google.android.gms.internal.ads.zzfaf
            @Override // com.google.android.gms.internal.ads.zzfbp
            public final void zza(Object obj) {
                ((zzazs) obj).zzb(com.google.android.gms.ads.internal.client.zze.this.f10146a);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdeq
    public final void zzdG() {
        zzfaj zzfajVar = this.zzh;
        if (zzfajVar != null) {
            zzfajVar.zzdG();
        } else {
            zzfbq.zza(this.zzd, new zzfbp() { // from class: com.google.android.gms.internal.ads.zzfaa
                @Override // com.google.android.gms.internal.ads.zzfbp
                public final void zza(Object obj) {
                    ((zzazw) obj).zzb();
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdq() {
        zzfaj zzfajVar = this.zzh;
        if (zzfajVar != null) {
            zzfajVar.zzdq();
        } else {
            zzfbq.zza(this.zzf, new zzfbp() { // from class: com.google.android.gms.internal.ads.zzezx
                @Override // com.google.android.gms.internal.ads.zzfbp
                public final void zza(Object obj) {
                    ((com.google.android.gms.ads.internal.overlay.zzp) obj).zzdq();
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdr() {
        zzfaj zzfajVar = this.zzh;
        if (zzfajVar != null) {
            zzfajVar.zzdr();
            return;
        }
        zzfbq.zza(this.zzf, new zzfbp() { // from class: com.google.android.gms.internal.ads.zzfai
            @Override // com.google.android.gms.internal.ads.zzfbp
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.overlay.zzp) obj).zzdr();
            }
        });
        zzfbq.zza(this.zzd, new zzfbp() { // from class: com.google.android.gms.internal.ads.zzezv
            @Override // com.google.android.gms.internal.ads.zzfbp
            public final void zza(Object obj) {
                ((zzazw) obj).zzf();
            }
        });
        zzfbq.zza(this.zzd, new zzfbp() { // from class: com.google.android.gms.internal.ads.zzezw
            @Override // com.google.android.gms.internal.ads.zzfbp
            public final void zza(Object obj) {
                ((zzazw) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdt() {
        zzfaj zzfajVar = this.zzh;
        if (zzfajVar != null) {
            zzfajVar.zzdt();
        } else {
            zzfbq.zza(this.zzf, new zzfbp() { // from class: com.google.android.gms.internal.ads.zzfah
                @Override // com.google.android.gms.internal.ads.zzfbp
                public final void zza(Object obj) {
                    ((com.google.android.gms.ads.internal.overlay.zzp) obj).zzdt();
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdu(final int i10) {
        zzfaj zzfajVar = this.zzh;
        if (zzfajVar != null) {
            zzfajVar.zzdu(i10);
        } else {
            zzfbq.zza(this.zzf, new zzfbp() { // from class: com.google.android.gms.internal.ads.zzfad
                @Override // com.google.android.gms.internal.ads.zzfbp
                public final void zza(Object obj) {
                    ((com.google.android.gms.ads.internal.overlay.zzp) obj).zzdu(i10);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyp
    public final void zzg() {
        zzfaj zzfajVar = this.zzh;
        if (zzfajVar != null) {
            zzfajVar.zzg();
        } else {
            zzfbq.zza(this.zze, new zzfbp() { // from class: com.google.android.gms.internal.ads.zzfag
                @Override // com.google.android.gms.internal.ads.zzfbp
                public final void zza(Object obj) {
                    ((zzcyp) obj).zzg();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczb
    public final void zzh(final com.google.android.gms.ads.internal.client.zzs zzsVar) {
        zzfaj zzfajVar = this.zzh;
        if (zzfajVar != null) {
            zzfajVar.zzh(zzsVar);
        } else {
            zzfbq.zza(this.zzg, new zzfbp() { // from class: com.google.android.gms.internal.ads.zzezu
                @Override // com.google.android.gms.internal.ads.zzfbp
                public final void zza(Object obj) {
                    ((com.google.android.gms.ads.internal.client.zzdg) obj).Y(com.google.android.gms.ads.internal.client.zzs.this);
                }
            });
        }
    }

    public final void zzj() {
        zzfaj zzfajVar = this.zzh;
        if (zzfajVar != null) {
            zzfajVar.zzj();
            return;
        }
        this.zza.zza();
        zzfbq.zza(this.zzc, new zzfbp() { // from class: com.google.android.gms.internal.ads.zzfab
            @Override // com.google.android.gms.internal.ads.zzfbp
            public final void zza(Object obj) {
                ((zzazt) obj).zza();
            }
        });
        zzfbq.zza(this.zzd, new zzfbp() { // from class: com.google.android.gms.internal.ads.zzfac
            @Override // com.google.android.gms.internal.ads.zzfbp
            public final void zza(Object obj) {
                ((zzazw) obj).zzc();
            }
        });
    }

    public final void zzk(final zzazp zzazpVar) {
        zzfaj zzfajVar = this.zzh;
        if (zzfajVar != null) {
            zzfajVar.zzk(zzazpVar);
        } else {
            zzfbq.zza(this.zzb, new zzfbp() { // from class: com.google.android.gms.internal.ads.zzezz
                @Override // com.google.android.gms.internal.ads.zzfbp
                public final void zza(Object obj) {
                    ((zzazs) obj).zzd(zzazp.this);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfbz
    public final void zzl(zzfbz zzfbzVar) {
        this.zzh = (zzfaj) zzfbzVar;
    }

    public final void zzm(com.google.android.gms.ads.internal.overlay.zzp zzpVar) {
        this.zzf.set(zzpVar);
    }

    public final void zzn(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        this.zzg.set(zzdgVar);
    }

    public final void zzo(zzazs zzazsVar) {
        this.zzb.set(zzazsVar);
    }

    public final void zzp(zzazw zzazwVar) {
        this.zzd.set(zzazwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcxg
    public final void zzq(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfaj zzfajVar = this.zzh;
        if (zzfajVar != null) {
            zzfajVar.zzq(zzeVar);
        } else {
            zzfbq.zza(this.zzd, new zzfbp() { // from class: com.google.android.gms.internal.ads.zzezy
                @Override // com.google.android.gms.internal.ads.zzfbp
                public final void zza(Object obj) {
                    ((zzazw) obj).zzd(com.google.android.gms.ads.internal.client.zze.this);
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdH() {
    }

    @Override // com.google.android.gms.internal.ads.zzdeq
    public final void zzdf() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdk() {
    }
}
