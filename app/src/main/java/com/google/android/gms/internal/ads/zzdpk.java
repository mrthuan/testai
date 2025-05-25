package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdpk {
    private final zzcwo zza;
    private final zzdeo zzb;
    private final zzcxx zzc;
    private final zzcyk zzd;
    private final zzcyw zze;
    private final zzdbn zzf;
    private final Executor zzg;
    private final zzdek zzh;
    private final zzcof zzi;
    private final com.google.android.gms.ads.internal.zzb zzj;
    private final zzbxl zzk;
    private final zzauo zzl;
    private final zzdbe zzm;
    private final zzedh zzn;
    private final zzfll zzo;
    private final zzdsk zzp;
    private final zzcni zzq;
    private final zzdpq zzr;

    public zzdpk(zzcwo zzcwoVar, zzcxx zzcxxVar, zzcyk zzcykVar, zzcyw zzcywVar, zzdbn zzdbnVar, Executor executor, zzdek zzdekVar, zzcof zzcofVar, com.google.android.gms.ads.internal.zzb zzbVar, zzbxl zzbxlVar, zzauo zzauoVar, zzdbe zzdbeVar, zzedh zzedhVar, zzfll zzfllVar, zzdsk zzdskVar, zzdeo zzdeoVar, zzcni zzcniVar, zzdpq zzdpqVar) {
        this.zza = zzcwoVar;
        this.zzc = zzcxxVar;
        this.zzd = zzcykVar;
        this.zze = zzcywVar;
        this.zzf = zzdbnVar;
        this.zzg = executor;
        this.zzh = zzdekVar;
        this.zzi = zzcofVar;
        this.zzj = zzbVar;
        this.zzk = zzbxlVar;
        this.zzl = zzauoVar;
        this.zzm = zzdbeVar;
        this.zzn = zzedhVar;
        this.zzo = zzfllVar;
        this.zzp = zzdskVar;
        this.zzb = zzdeoVar;
        this.zzq = zzcniVar;
        this.zzr = zzdpqVar;
    }

    public static final y9.a zzj(zzcej zzcejVar, String str, String str2) {
        final zzbzt zzbztVar = new zzbzt();
        zzcejVar.zzN().zzB(new zzcfz() { // from class: com.google.android.gms.internal.ads.zzdpb
            @Override // com.google.android.gms.internal.ads.zzcfz
            public final void zza(boolean z10, int i10, String str3, String str4) {
                zzbzt zzbztVar2 = zzbzt.this;
                if (z10) {
                    zzbztVar2.zzc(null);
                    return;
                }
                zzbztVar2.zzd(new Exception("Ad Web View failed to load. Error code: " + i10 + ", Description: " + str3 + ", Failing URL: " + str4));
            }
        });
        zzcejVar.zzae(str, str2, null);
        return zzbztVar;
    }

    public final /* synthetic */ void zzc() {
        this.zza.onAdClicked();
    }

    public final /* synthetic */ void zzd(String str, String str2) {
        this.zzf.zzb(str, str2);
    }

    public final /* synthetic */ void zze() {
        this.zzc.zzb();
    }

    public final void zzf(View view) {
        this.zzj.f10511b = true;
    }

    public final /* synthetic */ void zzg(zzcej zzcejVar, zzcej zzcejVar2, Map map) {
        this.zzi.zzh(zzcejVar);
    }

    public final boolean zzh(View view, MotionEvent motionEvent) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzjg)).booleanValue() && motionEvent != null && motionEvent.getAction() == 0) {
            this.zzr.zzb(motionEvent);
        }
        this.zzj.f10511b = true;
        if (view != null) {
            view.performClick();
            return false;
        }
        return false;
    }

    public final void zzi(final zzcej zzcejVar, boolean z10, zzbja zzbjaVar) {
        zzauk zzc;
        zzcejVar.zzN().zzR(new com.google.android.gms.ads.internal.client.zza() { // from class: com.google.android.gms.internal.ads.zzdpc
            @Override // com.google.android.gms.ads.internal.client.zza
            public final void onAdClicked() {
                zzdpk.this.zzc();
            }
        }, this.zzd, this.zze, new zzbhp() { // from class: com.google.android.gms.internal.ads.zzdpd
            @Override // com.google.android.gms.internal.ads.zzbhp
            public final void zzb(String str, String str2) {
                zzdpk.this.zzd(str, str2);
            }
        }, new com.google.android.gms.ads.internal.overlay.zzaa() { // from class: com.google.android.gms.internal.ads.zzdpe
            @Override // com.google.android.gms.ads.internal.overlay.zzaa
            public final void zzg() {
                zzdpk.this.zze();
            }
        }, z10, zzbjaVar, this.zzj, new zzdpj(this), this.zzk, this.zzn, this.zzo, this.zzp, null, this.zzb, null, null, null, this.zzq);
        zzcejVar.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.gms.internal.ads.zzdpf
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                zzdpk.this.zzh(view, motionEvent);
                return false;
            }
        });
        zzcejVar.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzdpg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zzdpk.this.zzf(view);
            }
        });
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzcq)).booleanValue() && (zzc = this.zzl.zzc()) != null) {
            zzc.zzo((View) zzcejVar);
        }
        this.zzh.zzo(zzcejVar, this.zzg);
        this.zzh.zzo(new zzaxw() { // from class: com.google.android.gms.internal.ads.zzdph
            @Override // com.google.android.gms.internal.ads.zzaxw
            public final void zzdp(zzaxv zzaxvVar) {
                zzcgb zzN = zzcej.this.zzN();
                Rect rect = zzaxvVar.zzd;
                zzN.zzq(rect.left, rect.top, false);
            }
        }, this.zzg);
        this.zzh.zza((View) zzcejVar);
        zzcejVar.zzag("/trackActiveViewUnit", new zzbix() { // from class: com.google.android.gms.internal.ads.zzdpi
            @Override // com.google.android.gms.internal.ads.zzbix
            public final void zza(Object obj, Map map) {
                zzdpk.this.zzg(zzcejVar, (zzcej) obj, map);
            }
        });
        this.zzi.zzi(zzcejVar);
    }
}
