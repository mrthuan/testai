package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.view.View;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdkn {
    private final zzdpl zza;
    private final zzdoa zzb;
    private final zzcop zzc;
    private final zzdjj zzd;

    public zzdkn(zzdpl zzdplVar, zzdoa zzdoaVar, zzcop zzcopVar, zzdjj zzdjjVar) {
        this.zza = zzdplVar;
        this.zzb = zzdoaVar;
        this.zzc = zzcopVar;
        this.zzd = zzdjjVar;
    }

    public final View zza() {
        zzcej zza = this.zza.zza(com.google.android.gms.ads.internal.client.zzq.f(), null, null);
        ((View) zza).setVisibility(8);
        zza.zzag("/sendMessageToSdk", new zzbix() { // from class: com.google.android.gms.internal.ads.zzdki
            @Override // com.google.android.gms.internal.ads.zzbix
            public final void zza(Object obj, Map map) {
                zzdkn.this.zzb((zzcej) obj, map);
            }
        });
        zza.zzag("/adMuted", new zzbix() { // from class: com.google.android.gms.internal.ads.zzdkj
            @Override // com.google.android.gms.internal.ads.zzbix
            public final void zza(Object obj, Map map) {
                zzdkn.this.zzc((zzcej) obj, map);
            }
        });
        this.zzb.zzm(new WeakReference(zza), "/loadHtml", new zzbix() { // from class: com.google.android.gms.internal.ads.zzdkk
            @Override // com.google.android.gms.internal.ads.zzbix
            public final void zza(Object obj, final Map map) {
                zzcej zzcejVar = (zzcej) obj;
                zzcgb zzN = zzcejVar.zzN();
                final zzdkn zzdknVar = zzdkn.this;
                zzN.zzB(new zzcfz() { // from class: com.google.android.gms.internal.ads.zzdkh
                    @Override // com.google.android.gms.internal.ads.zzcfz
                    public final void zza(boolean z10, int i10, String str, String str2) {
                        zzdkn.this.zzd(map, z10, i10, str, str2);
                    }
                });
                String str = (String) map.get("overlayHtml");
                String str2 = (String) map.get("baseUrl");
                if (TextUtils.isEmpty(str2)) {
                    zzcejVar.loadData(str, "text/html", "UTF-8");
                } else {
                    zzcejVar.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                }
            }
        });
        this.zzb.zzm(new WeakReference(zza), "/showOverlay", new zzbix() { // from class: com.google.android.gms.internal.ads.zzdkl
            @Override // com.google.android.gms.internal.ads.zzbix
            public final void zza(Object obj, Map map) {
                zzdkn.this.zze((zzcej) obj, map);
            }
        });
        this.zzb.zzm(new WeakReference(zza), "/hideOverlay", new zzbix() { // from class: com.google.android.gms.internal.ads.zzdkm
            @Override // com.google.android.gms.internal.ads.zzbix
            public final void zza(Object obj, Map map) {
                zzdkn.this.zzf((zzcej) obj, map);
            }
        });
        return (View) zza;
    }

    public final /* synthetic */ void zzb(zzcej zzcejVar, Map map) {
        this.zzb.zzj("sendMessageToNativeJs", map);
    }

    public final /* synthetic */ void zzc(zzcej zzcejVar, Map map) {
        this.zzd.zzg();
    }

    public final /* synthetic */ void zzd(Map map, boolean z10, int i10, String str, String str2) {
        HashMap h10 = a6.h.h("messageType", "htmlLoaded");
        h10.put(FacebookMediationAdapter.KEY_ID, (String) map.get(FacebookMediationAdapter.KEY_ID));
        this.zzb.zzj("sendMessageToNativeJs", h10);
    }

    public final /* synthetic */ void zze(zzcej zzcejVar, Map map) {
        com.google.android.gms.ads.internal.util.client.zzm.d("Showing native ads overlay.");
        zzcejVar.zzF().setVisibility(0);
        this.zzc.zze(true);
    }

    public final /* synthetic */ void zzf(zzcej zzcejVar, Map map) {
        com.google.android.gms.ads.internal.util.client.zzm.d("Hiding native ads overlay.");
        zzcejVar.zzF().setVisibility(8);
        this.zzc.zze(false);
    }
}
