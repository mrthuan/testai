package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfdo implements OnAdMetadataChangedListener, zzcye, zzcwt, zzcwq, zzcxg, zzczb, zzfbz, zzdeq {
    private final zzfgq zza;
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private final AtomicReference zzh = new AtomicReference();

    public zzfdo(zzfgq zzfgqVar) {
        this.zza = zzfgqVar;
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        zzfbq.zza(this.zzb, new zzfbp() { // from class: com.google.android.gms.internal.ads.zzfdc
            @Override // com.google.android.gms.internal.ads.zzfbp
            public final void zza(Object obj) {
                ((OnAdMetadataChangedListener) obj).onAdMetadataChanged();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwq
    public final void zza() {
        this.zza.zza();
        zzfbq.zza(this.zzd, new zzfbp() { // from class: com.google.android.gms.internal.ads.zzfdk
            @Override // com.google.android.gms.internal.ads.zzfbp
            public final void zza(Object obj) {
                ((zzbwj) obj).zzg();
            }
        });
        zzfbq.zza(this.zze, new zzfbp() { // from class: com.google.android.gms.internal.ads.zzfdl
            @Override // com.google.android.gms.internal.ads.zzfbp
            public final void zza(Object obj) {
                ((zzbvt) obj).zzf();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwq
    public final void zzb() {
        zzfbq.zza(this.zze, new zzfbp() { // from class: com.google.android.gms.internal.ads.zzfdm
            @Override // com.google.android.gms.internal.ads.zzfbp
            public final void zza(Object obj) {
                ((zzbvt) obj).zzh();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwq
    public final void zzc() {
        zzfbq.zza(this.zzd, new zzfbp() { // from class: com.google.android.gms.internal.ads.zzfcw
            @Override // com.google.android.gms.internal.ads.zzfbp
            public final void zza(Object obj) {
                ((zzbwj) obj).zzj();
            }
        });
        zzfbq.zza(this.zze, new zzfbp() { // from class: com.google.android.gms.internal.ads.zzfcx
            @Override // com.google.android.gms.internal.ads.zzfbp
            public final void zza(Object obj) {
                ((zzbvt) obj).zzj();
            }
        });
        zzfbq.zza(this.zzd, new zzfbp() { // from class: com.google.android.gms.internal.ads.zzfcy
            @Override // com.google.android.gms.internal.ads.zzfbp
            public final void zza(Object obj) {
                ((zzbwj) obj).zzf();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwt
    public final void zzdB(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        final int i10 = zzeVar.f10146a;
        zzfbq.zza(this.zzc, new zzfbp() { // from class: com.google.android.gms.internal.ads.zzfdh
            @Override // com.google.android.gms.internal.ads.zzfbp
            public final void zza(Object obj) {
                ((zzbwn) obj).zzf(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
        zzfbq.zza(this.zzc, new zzfbp() { // from class: com.google.android.gms.internal.ads.zzfdi
            @Override // com.google.android.gms.internal.ads.zzfbp
            public final void zza(Object obj) {
                ((zzbwn) obj).zze(i10);
            }
        });
        zzfbq.zza(this.zze, new zzfbp() { // from class: com.google.android.gms.internal.ads.zzfdj
            @Override // com.google.android.gms.internal.ads.zzfbp
            public final void zza(Object obj) {
                ((zzbvt) obj).zzg(i10);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdeq
    public final void zzdG() {
        zzfbq.zza(this.zzd, new zzfbp() { // from class: com.google.android.gms.internal.ads.zzfdd
            @Override // com.google.android.gms.internal.ads.zzfbp
            public final void zza(Object obj) {
                ((zzbwj) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwq
    public final void zzds(final zzbvn zzbvnVar, final String str, final String str2) {
        zzfbq.zza(this.zzd, new zzfbp() { // from class: com.google.android.gms.internal.ads.zzfdn
            @Override // com.google.android.gms.internal.ads.zzfbp
            public final void zza(Object obj) {
                zzbvn zzbvnVar2 = zzbvn.this;
                ((zzbwj) obj).zzk(new zzbwx(zzbvnVar2.zzc(), zzbvnVar2.zzb()));
            }
        });
        zzfbq.zza(this.zzf, new zzfbp() { // from class: com.google.android.gms.internal.ads.zzfct
            @Override // com.google.android.gms.internal.ads.zzfbp
            public final void zza(Object obj) {
                zzbvn zzbvnVar2 = zzbvn.this;
                ((zzbwo) obj).zze(new zzbwx(zzbvnVar2.zzc(), zzbvnVar2.zzb()), str, str2);
            }
        });
        zzfbq.zza(this.zze, new zzfbp() { // from class: com.google.android.gms.internal.ads.zzfcu
            @Override // com.google.android.gms.internal.ads.zzfbp
            public final void zza(Object obj) {
                ((zzbvt) obj).zze(zzbvn.this);
            }
        });
        zzfbq.zza(this.zzg, new zzfbp() { // from class: com.google.android.gms.internal.ads.zzfcv
            @Override // com.google.android.gms.internal.ads.zzfbp
            public final void zza(Object obj) {
                ((zzbvo) obj).zze(zzbvn.this, str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwq
    public final void zze() {
        zzfbq.zza(this.zze, new zzfbp() { // from class: com.google.android.gms.internal.ads.zzfdg
            @Override // com.google.android.gms.internal.ads.zzfbp
            public final void zza(Object obj) {
                ((zzbvt) obj).zzk();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwq
    public final void zzf() {
        zzfbq.zza(this.zze, new zzfbp() { // from class: com.google.android.gms.internal.ads.zzfcs
            @Override // com.google.android.gms.internal.ads.zzfbp
            public final void zza(Object obj) {
                ((zzbvt) obj).zzl();
            }
        });
    }

    public final void zzg(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        this.zzb.set(onAdMetadataChangedListener);
    }

    @Override // com.google.android.gms.internal.ads.zzczb
    public final void zzh(final com.google.android.gms.ads.internal.client.zzs zzsVar) {
        zzfbq.zza(this.zzh, new zzfbp() { // from class: com.google.android.gms.internal.ads.zzfcz
            @Override // com.google.android.gms.internal.ads.zzfbp
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzdg) obj).Y(com.google.android.gms.ads.internal.client.zzs.this);
            }
        });
    }

    public final void zzi(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        this.zzh.set(zzdgVar);
    }

    public final void zzj(zzbwj zzbwjVar) {
        this.zzd.set(zzbwjVar);
    }

    public final void zzk(zzbwn zzbwnVar) {
        this.zzc.set(zzbwnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfbz
    public final void zzl(zzfbz zzfbzVar) {
        throw null;
    }

    @Deprecated
    public final void zzm(zzbvt zzbvtVar) {
        this.zze.set(zzbvtVar);
    }

    @Deprecated
    public final void zzn(zzbvo zzbvoVar) {
        this.zzg.set(zzbvoVar);
    }

    public final void zzo(zzbwo zzbwoVar) {
        this.zzf.set(zzbwoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcxg
    public final void zzq(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfbq.zza(this.zzd, new zzfbp() { // from class: com.google.android.gms.internal.ads.zzfde
            @Override // com.google.android.gms.internal.ads.zzfbp
            public final void zza(Object obj) {
                ((zzbwj) obj).zzi(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
        zzfbq.zza(this.zzd, new zzfbp() { // from class: com.google.android.gms.internal.ads.zzfdf
            @Override // com.google.android.gms.internal.ads.zzfbp
            public final void zza(Object obj) {
                ((zzbwj) obj).zzh(com.google.android.gms.ads.internal.client.zze.this.f10146a);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcye
    public final void zzs() {
        zzfbq.zza(this.zzc, new zzfbp() { // from class: com.google.android.gms.internal.ads.zzfda
            @Override // com.google.android.gms.internal.ads.zzfbp
            public final void zza(Object obj) {
                ((zzbwn) obj).zzg();
            }
        });
        zzfbq.zza(this.zze, new zzfbp() { // from class: com.google.android.gms.internal.ads.zzfdb
            @Override // com.google.android.gms.internal.ads.zzfbp
            public final void zza(Object obj) {
                ((zzbvt) obj).zzi();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdeq
    public final void zzdf() {
    }
}
