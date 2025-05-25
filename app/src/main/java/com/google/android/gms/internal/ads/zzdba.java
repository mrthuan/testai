package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdba implements AppEventListener, OnAdMetadataChangedListener, zzcwq, com.google.android.gms.ads.internal.client.zza, zzczb, zzcxk, zzcyp, com.google.android.gms.ads.internal.overlay.zzp, zzcxg, zzdeq {
    private final zzday zza = new zzday(this, null);
    private zzemk zzb;
    private zzemo zzc;
    private zzfaj zzd;
    private zzfdo zze;

    public static /* bridge */ /* synthetic */ void zzj(zzdba zzdbaVar, zzemk zzemkVar) {
        zzdbaVar.zzb = zzemkVar;
    }

    public static /* bridge */ /* synthetic */ void zzk(zzdba zzdbaVar, zzfaj zzfajVar) {
        zzdbaVar.zzd = zzfajVar;
    }

    public static /* bridge */ /* synthetic */ void zzl(zzdba zzdbaVar, zzemo zzemoVar) {
        zzdbaVar.zzc = zzemoVar;
    }

    public static /* bridge */ /* synthetic */ void zzm(zzdba zzdbaVar, zzfdo zzfdoVar) {
        zzdbaVar.zze = zzfdoVar;
    }

    private static void zzn(Object obj, zzdaz zzdazVar) {
        if (obj != null) {
            zzdazVar.zza(obj);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzn(this.zzb, new zzdaz() { // from class: com.google.android.gms.internal.ads.zzczq
            @Override // com.google.android.gms.internal.ads.zzdaz
            public final void zza(Object obj) {
                ((zzemk) obj).onAdClicked();
            }
        });
        zzn(this.zzc, new zzdaz() { // from class: com.google.android.gms.internal.ads.zzczr
            @Override // com.google.android.gms.internal.ads.zzdaz
            public final void zza(Object obj) {
                ((zzemo) obj).onAdClicked();
            }
        });
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        zzn(this.zze, new zzdaz() { // from class: com.google.android.gms.internal.ads.zzczw
            @Override // com.google.android.gms.internal.ads.zzdaz
            public final void zza(Object obj) {
                ((zzfdo) obj).onAdMetadataChanged();
            }
        });
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(final String str, final String str2) {
        zzn(this.zzb, new zzdaz() { // from class: com.google.android.gms.internal.ads.zzdac
            @Override // com.google.android.gms.internal.ads.zzdaz
            public final void zza(Object obj) {
                ((zzemk) obj).onAppEvent(str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwq
    public final void zza() {
        zzn(this.zzb, new zzdaz() { // from class: com.google.android.gms.internal.ads.zzdav
            @Override // com.google.android.gms.internal.ads.zzdaz
            public final void zza(Object obj) {
                ((zzemk) obj).zza();
            }
        });
        zzn(this.zze, new zzdaz() { // from class: com.google.android.gms.internal.ads.zzdaw
            @Override // com.google.android.gms.internal.ads.zzdaz
            public final void zza(Object obj) {
                ((zzfdo) obj).zza();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwq
    public final void zzb() {
        zzn(this.zzb, new zzdaz() { // from class: com.google.android.gms.internal.ads.zzdao
            @Override // com.google.android.gms.internal.ads.zzdaz
            public final void zza(Object obj) {
                ((zzemk) obj).zzb();
            }
        });
        zzn(this.zze, new zzdaz() { // from class: com.google.android.gms.internal.ads.zzdap
            @Override // com.google.android.gms.internal.ads.zzdaz
            public final void zza(Object obj) {
                ((zzfdo) obj).zzb();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwq
    public final void zzc() {
        zzn(this.zzb, new zzdaz() { // from class: com.google.android.gms.internal.ads.zzczx
            @Override // com.google.android.gms.internal.ads.zzdaz
            public final void zza(Object obj) {
                ((zzemk) obj).zzc();
            }
        });
        zzn(this.zze, new zzdaz() { // from class: com.google.android.gms.internal.ads.zzczy
            @Override // com.google.android.gms.internal.ads.zzdaz
            public final void zza(Object obj) {
                ((zzfdo) obj).zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdeq
    public final void zzdG() {
        zzn(this.zzb, new zzdaz() { // from class: com.google.android.gms.internal.ads.zzdal
            @Override // com.google.android.gms.internal.ads.zzdaz
            public final void zza(Object obj) {
                ((zzemk) obj).zzdG();
            }
        });
        zzn(this.zzc, new zzdaz() { // from class: com.google.android.gms.internal.ads.zzdaq
            @Override // com.google.android.gms.internal.ads.zzdaz
            public final void zza(Object obj) {
                ((zzemo) obj).zzdG();
            }
        });
        zzn(this.zze, new zzdaz() { // from class: com.google.android.gms.internal.ads.zzdar
            @Override // com.google.android.gms.internal.ads.zzdaz
            public final void zza(Object obj) {
                ((zzfdo) obj).zzdG();
            }
        });
        zzn(this.zzd, new zzdaz() { // from class: com.google.android.gms.internal.ads.zzdas
            @Override // com.google.android.gms.internal.ads.zzdaz
            public final void zza(Object obj) {
                ((zzfaj) obj).zzdG();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdH() {
        zzn(this.zzd, new zzdaz() { // from class: com.google.android.gms.internal.ads.zzdaj
            @Override // com.google.android.gms.internal.ads.zzdaz
            public final void zza(Object obj) {
                zzfaj zzfajVar = (zzfaj) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdeq
    public final void zzdf() {
        zzn(this.zzb, new zzdaz() { // from class: com.google.android.gms.internal.ads.zzdad
            @Override // com.google.android.gms.internal.ads.zzdaz
            public final void zza(Object obj) {
                ((zzemk) obj).zzdf();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdk() {
        zzn(this.zzd, new zzdaz() { // from class: com.google.android.gms.internal.ads.zzczv
            @Override // com.google.android.gms.internal.ads.zzdaz
            public final void zza(Object obj) {
                zzfaj zzfajVar = (zzfaj) obj;
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdq() {
        zzn(this.zzd, new zzdaz() { // from class: com.google.android.gms.internal.ads.zzdai
            @Override // com.google.android.gms.internal.ads.zzdaz
            public final void zza(Object obj) {
                ((zzfaj) obj).zzdq();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdr() {
        zzn(this.zzd, new zzdaz() { // from class: com.google.android.gms.internal.ads.zzdae
            @Override // com.google.android.gms.internal.ads.zzdaz
            public final void zza(Object obj) {
                ((zzfaj) obj).zzdr();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwq
    public final void zzds(final zzbvn zzbvnVar, final String str, final String str2) {
        zzn(this.zzb, new zzdaz(zzbvnVar, str, str2) { // from class: com.google.android.gms.internal.ads.zzczz
            @Override // com.google.android.gms.internal.ads.zzdaz
            public final void zza(Object obj) {
                zzemk zzemkVar = (zzemk) obj;
            }
        });
        zzn(this.zze, new zzdaz() { // from class: com.google.android.gms.internal.ads.zzdab
            @Override // com.google.android.gms.internal.ads.zzdaz
            public final void zza(Object obj) {
                ((zzfdo) obj).zzds(zzbvn.this, str, str2);
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdt() {
        zzn(this.zzd, new zzdaz() { // from class: com.google.android.gms.internal.ads.zzdak
            @Override // com.google.android.gms.internal.ads.zzdaz
            public final void zza(Object obj) {
                ((zzfaj) obj).zzdt();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdu(final int i10) {
        zzn(this.zzd, new zzdaz() { // from class: com.google.android.gms.internal.ads.zzdam
            @Override // com.google.android.gms.internal.ads.zzdaz
            public final void zza(Object obj) {
                ((zzfaj) obj).zzdu(i10);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwq
    public final void zze() {
        zzn(this.zzb, new zzdaz() { // from class: com.google.android.gms.internal.ads.zzczp
            @Override // com.google.android.gms.internal.ads.zzdaz
            public final void zza(Object obj) {
                zzemk zzemkVar = (zzemk) obj;
            }
        });
        zzn(this.zze, new zzdaz() { // from class: com.google.android.gms.internal.ads.zzdaa
            @Override // com.google.android.gms.internal.ads.zzdaz
            public final void zza(Object obj) {
                ((zzfdo) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwq
    public final void zzf() {
        zzn(this.zzb, new zzdaz() { // from class: com.google.android.gms.internal.ads.zzczs
            @Override // com.google.android.gms.internal.ads.zzdaz
            public final void zza(Object obj) {
                zzemk zzemkVar = (zzemk) obj;
            }
        });
        zzn(this.zze, new zzdaz() { // from class: com.google.android.gms.internal.ads.zzczt
            @Override // com.google.android.gms.internal.ads.zzdaz
            public final void zza(Object obj) {
                ((zzfdo) obj).zzf();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcyp
    public final void zzg() {
        zzn(this.zzd, new zzdaz() { // from class: com.google.android.gms.internal.ads.zzdan
            @Override // com.google.android.gms.internal.ads.zzdaz
            public final void zza(Object obj) {
                ((zzfaj) obj).zzg();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzczb
    public final void zzh(final com.google.android.gms.ads.internal.client.zzs zzsVar) {
        zzn(this.zzb, new zzdaz() { // from class: com.google.android.gms.internal.ads.zzdaf
            @Override // com.google.android.gms.internal.ads.zzdaz
            public final void zza(Object obj) {
                ((zzemk) obj).zzh(com.google.android.gms.ads.internal.client.zzs.this);
            }
        });
        zzn(this.zze, new zzdaz() { // from class: com.google.android.gms.internal.ads.zzdag
            @Override // com.google.android.gms.internal.ads.zzdaz
            public final void zza(Object obj) {
                ((zzfdo) obj).zzh(com.google.android.gms.ads.internal.client.zzs.this);
            }
        });
        zzn(this.zzd, new zzdaz() { // from class: com.google.android.gms.internal.ads.zzdah
            @Override // com.google.android.gms.internal.ads.zzdaz
            public final void zza(Object obj) {
                ((zzfaj) obj).zzh(com.google.android.gms.ads.internal.client.zzs.this);
            }
        });
    }

    public final zzday zzi() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcxg
    public final void zzq(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzn(this.zze, new zzdaz() { // from class: com.google.android.gms.internal.ads.zzdat
            @Override // com.google.android.gms.internal.ads.zzdaz
            public final void zza(Object obj) {
                ((zzfdo) obj).zzq(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
        zzn(this.zzb, new zzdaz() { // from class: com.google.android.gms.internal.ads.zzdau
            @Override // com.google.android.gms.internal.ads.zzdaz
            public final void zza(Object obj) {
                ((zzemk) obj).zzq(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcxk
    public final void zzr() {
        zzn(this.zzb, new zzdaz() { // from class: com.google.android.gms.internal.ads.zzczu
            @Override // com.google.android.gms.internal.ads.zzdaz
            public final void zza(Object obj) {
                ((zzemk) obj).zzr();
            }
        });
    }
}
