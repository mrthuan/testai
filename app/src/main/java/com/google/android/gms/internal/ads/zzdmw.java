package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdmw {
    private final zzffg zza;
    private final Executor zzb;
    private final zzdpl zzc;
    private final zzdog zzd;
    private final Context zze;
    private final zzdsk zzf;
    private final zzfll zzg;
    private final zzedh zzh;

    public zzdmw(zzffg zzffgVar, Executor executor, zzdpl zzdplVar, Context context, zzdsk zzdskVar, zzfll zzfllVar, zzedh zzedhVar, zzdog zzdogVar) {
        this.zza = zzffgVar;
        this.zzb = executor;
        this.zzc = zzdplVar;
        this.zze = context;
        this.zzf = zzdskVar;
        this.zzg = zzfllVar;
        this.zzh = zzedhVar;
        this.zzd = zzdogVar;
    }

    private final void zzh(zzcej zzcejVar) {
        zzj(zzcejVar);
        zzcejVar.zzag("/video", zzbiw.zzl);
        zzcejVar.zzag("/videoMeta", zzbiw.zzm);
        zzcejVar.zzag("/precache", new zzccw());
        zzcejVar.zzag("/delayPageLoaded", zzbiw.zzp);
        zzcejVar.zzag("/instrument", zzbiw.zzn);
        zzcejVar.zzag("/log", zzbiw.zzg);
        zzcejVar.zzag("/click", new zzbhv(null, null));
        if (this.zza.zzb != null) {
            zzcejVar.zzN().zzE(true);
            zzcejVar.zzag("/open", new zzbjj(null, null, null, null, null));
        } else {
            zzcejVar.zzN().zzE(false);
        }
        if (com.google.android.gms.ads.internal.zzu.B.f10574x.zzp(zzcejVar.getContext())) {
            Map hashMap = new HashMap();
            if (zzcejVar.zzD() != null) {
                hashMap = zzcejVar.zzD().zzaw;
            }
            zzcejVar.zzag("/logScionEvent", new zzbjd(zzcejVar.getContext(), hashMap));
        }
    }

    private final void zzi(zzcej zzcejVar, zzbzs zzbzsVar) {
        if (this.zza.zza != null && zzcejVar.zzq() != null) {
            zzcejVar.zzq().zzs(this.zza.zza);
        }
        zzbzsVar.zzb();
    }

    private static final void zzj(zzcej zzcejVar) {
        zzcejVar.zzag("/videoClicked", zzbiw.zzh);
        zzcejVar.zzN().zzG(true);
        zzcejVar.zzag("/getNativeAdViewSignals", zzbiw.zzs);
        zzcejVar.zzag("/getNativeClickMeta", zzbiw.zzt);
    }

    public final y9.a zza(final JSONObject jSONObject) {
        return zzgcj.zzn(zzgcj.zzn(zzgcj.zzh(null), new zzgbq() { // from class: com.google.android.gms.internal.ads.zzdmn
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final y9.a zza(Object obj) {
                return zzdmw.this.zze(obj);
            }
        }, this.zzb), new zzgbq() { // from class: com.google.android.gms.internal.ads.zzdmm
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final y9.a zza(Object obj) {
                return zzdmw.this.zzc(jSONObject, (zzcej) obj);
            }
        }, this.zzb);
    }

    public final y9.a zzb(final String str, final String str2, final zzfel zzfelVar, final zzfeo zzfeoVar, final com.google.android.gms.ads.internal.client.zzq zzqVar) {
        return zzgcj.zzn(zzgcj.zzh(null), new zzgbq() { // from class: com.google.android.gms.internal.ads.zzdml
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final y9.a zza(Object obj) {
                return zzdmw.this.zzd(zzqVar, zzfelVar, zzfeoVar, str, str2, obj);
            }
        }, this.zzb);
    }

    public final /* synthetic */ y9.a zzc(JSONObject jSONObject, final zzcej zzcejVar) {
        final zzbzs zza = zzbzs.zza(zzcejVar);
        if (this.zza.zzb != null) {
            zzcejVar.zzaj(zzcgd.zzd());
        } else {
            zzcejVar.zzaj(zzcgd.zze());
        }
        zzcejVar.zzN().zzB(new zzcfz() { // from class: com.google.android.gms.internal.ads.zzdmo
            @Override // com.google.android.gms.internal.ads.zzcfz
            public final void zza(boolean z10, int i10, String str, String str2) {
                zzdmw.this.zzf(zzcejVar, zza, z10, i10, str, str2);
            }
        });
        zzcejVar.zzl("google.afma.nativeAds.renderVideo", jSONObject);
        return zza;
    }

    public final /* synthetic */ y9.a zzd(com.google.android.gms.ads.internal.client.zzq zzqVar, zzfel zzfelVar, zzfeo zzfeoVar, String str, String str2, Object obj) {
        final zzcej zza = this.zzc.zza(zzqVar, zzfelVar, zzfeoVar);
        final zzbzs zza2 = zzbzs.zza(zza);
        if (this.zza.zzb != null) {
            zzh(zza);
            zza.zzaj(zzcgd.zzd());
        } else {
            zzdod zzb = this.zzd.zzb();
            zza.zzN().zzR(zzb, zzb, zzb, zzb, zzb, false, null, new com.google.android.gms.ads.internal.zzb(this.zze, null), null, null, this.zzh, this.zzg, this.zzf, null, zzb, null, null, null, null);
            zzj(zza);
        }
        zza.zzN().zzB(new zzcfz() { // from class: com.google.android.gms.internal.ads.zzdmp
            @Override // com.google.android.gms.internal.ads.zzcfz
            public final void zza(boolean z10, int i10, String str3, String str4) {
                zzdmw.this.zzg(zza, zza2, z10, i10, str3, str4);
            }
        });
        zza.zzae(str, str2, null);
        return zza2;
    }

    public final y9.a zze(Object obj) {
        zzcej zza = this.zzc.zza(com.google.android.gms.ads.internal.client.zzq.f(), null, null);
        final zzbzs zza2 = zzbzs.zza(zza);
        zzh(zza);
        zza.zzN().zzH(new zzcga() { // from class: com.google.android.gms.internal.ads.zzdmq
            @Override // com.google.android.gms.internal.ads.zzcga
            public final void zza() {
                zzbzs.this.zzb();
            }
        });
        zza.loadUrl((String) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzds));
        return zza2;
    }

    public final void zzf(zzcej zzcejVar, zzbzs zzbzsVar, boolean z10, int i10, String str, String str2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzdA)).booleanValue()) {
            if (z10) {
                zzi(zzcejVar, zzbzsVar);
                return;
            }
            zzbzsVar.zzd(new zzeir(1, "Native Video WebView failed to load. Error code: " + i10 + ", Description: " + str + ", Failing URL: " + str2));
            return;
        }
        zzi(zzcejVar, zzbzsVar);
    }

    public final /* synthetic */ void zzg(zzcej zzcejVar, zzbzs zzbzsVar, boolean z10, int i10, String str, String str2) {
        if (z10) {
            if (this.zza.zza != null && zzcejVar.zzq() != null) {
                zzcejVar.zzq().zzs(this.zza.zza);
            }
            zzbzsVar.zzb();
            return;
        }
        zzbzsVar.zzd(new zzeir(1, "Html video Web View failed to load. Error code: " + i10 + ", Description: " + str + ", Failing URL: " + str2));
    }
}
