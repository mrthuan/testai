package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdmv {
    private final Executor zza;
    private final zzcop zzb;
    private final zzdek zzc;
    private final zzcni zzd;

    public zzdmv(Executor executor, zzcop zzcopVar, zzdek zzdekVar, zzcni zzcniVar) {
        this.zza = executor;
        this.zzc = zzdekVar;
        this.zzb = zzcopVar;
        this.zzd = zzcniVar;
    }

    public final void zza(final zzcej zzcejVar) {
        if (zzcejVar == null) {
            return;
        }
        this.zzc.zza(zzcejVar.zzF());
        this.zzc.zzo(new zzaxw() { // from class: com.google.android.gms.internal.ads.zzdmr
            @Override // com.google.android.gms.internal.ads.zzaxw
            public final void zzdp(zzaxv zzaxvVar) {
                zzcgb zzN = zzcej.this.zzN();
                Rect rect = zzaxvVar.zzd;
                zzN.zzq(rect.left, rect.top, false);
            }
        }, this.zza);
        this.zzc.zzo(new zzaxw() { // from class: com.google.android.gms.internal.ads.zzdms
            @Override // com.google.android.gms.internal.ads.zzaxw
            public final void zzdp(zzaxv zzaxvVar) {
                String str;
                HashMap hashMap = new HashMap();
                if (true != zzaxvVar.zzj) {
                    str = PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES;
                } else {
                    str = "1";
                }
                hashMap.put("isVisible", str);
                zzcej.this.zzd("onAdVisibilityChanged", hashMap);
            }
        }, this.zza);
        this.zzc.zzo(this.zzb, this.zza);
        this.zzb.zzf(zzcejVar);
        zzcgb zzN = zzcejVar.zzN();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzjl)).booleanValue() && zzN != null) {
            zzN.zzJ(this.zzd);
            zzN.zzK(this.zzd, null, null);
        }
        zzcejVar.zzag("/trackActiveViewUnit", new zzbix() { // from class: com.google.android.gms.internal.ads.zzdmt
            @Override // com.google.android.gms.internal.ads.zzbix
            public final void zza(Object obj, Map map) {
                zzdmv.this.zzb((zzcej) obj, map);
            }
        });
        zzcejVar.zzag("/untrackActiveViewUnit", new zzbix() { // from class: com.google.android.gms.internal.ads.zzdmu
            @Override // com.google.android.gms.internal.ads.zzbix
            public final void zza(Object obj, Map map) {
                zzdmv.this.zzc((zzcej) obj, map);
            }
        });
    }

    public final /* synthetic */ void zzb(zzcej zzcejVar, Map map) {
        this.zzb.zzb();
    }

    public final /* synthetic */ void zzc(zzcej zzcejVar, Map map) {
        this.zzb.zza();
    }
}
