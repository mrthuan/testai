package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdsf {
    private final ConcurrentHashMap zza;
    private final zzbzi zzb;
    private final zzffg zzc;
    private final String zzd;
    private final String zze;
    private final com.google.android.gms.ads.internal.zzj zzf;
    private final Bundle zzg = new Bundle();
    private final Context zzh;

    public zzdsf(Context context, zzdsp zzdspVar, zzbzi zzbziVar, zzffg zzffgVar, String str, String str2, com.google.android.gms.ads.internal.zzj zzjVar) {
        ActivityManager.MemoryInfo g10;
        String str3;
        ConcurrentHashMap zzc = zzdspVar.zzc();
        this.zza = zzc;
        this.zzb = zzbziVar;
        this.zzc = zzffgVar;
        this.zzd = str;
        this.zze = str2;
        this.zzf = zzjVar;
        this.zzh = context;
        zzc.put("ad_format", str2.toUpperCase(Locale.ROOT));
        zzbbn zzbbnVar = zzbbw.zziF;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
        if (((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue()) {
            int i10 = zzjVar.f10535o;
            int i11 = i10 - 1;
            if (i10 != 0) {
                if (i11 == 0) {
                    str3 = "1";
                } else if (i11 != 1) {
                    str3 = "na";
                } else {
                    str3 = "2";
                }
                zzc.put("asv", str3);
            } else {
                throw null;
            }
        }
        if (((Boolean) zzbaVar.c.zza(zzbbw.zzbS)).booleanValue()) {
            Runtime runtime = Runtime.getRuntime();
            zzc("rt_f", String.valueOf(runtime.freeMemory()));
            zzc("rt_m", String.valueOf(runtime.maxMemory()));
            zzc("rt_t", String.valueOf(runtime.totalMemory()));
            zzc("wv_c", String.valueOf(com.google.android.gms.ads.internal.zzu.B.f10557g.zzb()));
            if (((Boolean) zzbaVar.c.zza(zzbbw.zzbU)).booleanValue() && (g10 = com.google.android.gms.ads.internal.util.client.zzf.g(context)) != null) {
                zzc("mem_avl", String.valueOf(g10.availMem));
                zzc("mem_tt", String.valueOf(g10.totalMem));
                zzc("low_m", true != g10.lowMemory ? PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES : "1");
            }
        }
        if (!((Boolean) zzbaVar.c.zza(zzbbw.zzgo)).booleanValue()) {
            return;
        }
        int e10 = com.google.android.gms.ads.nonagon.signalgeneration.zzq.e(zzffgVar) - 1;
        if (e10 != 0) {
            if (e10 != 1) {
                if (e10 != 2) {
                    if (e10 != 3) {
                        zzc.put("se", "r_both");
                    } else {
                        zzc.put("se", "r_adstring");
                    }
                } else {
                    zzc.put("se", "r_adinfo");
                }
            } else {
                zzc.put("request_id", str);
                zzc.put("se", "query_g");
            }
            zzc.put("scar", "true");
            zzc("ragent", zzffgVar.zzd.f10214p);
            zzc("rtype", com.google.android.gms.ads.nonagon.signalgeneration.zzq.b(com.google.android.gms.ads.nonagon.signalgeneration.zzq.c(zzffgVar.zzd)));
            return;
        }
        zzc.put("request_id", str);
        zzc.put("scar", "false");
    }

    public final Bundle zza() {
        return this.zzg;
    }

    public final Map zzb() {
        return this.zza;
    }

    public final void zzc(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.zza.put(str, str2);
        }
    }

    public final void zzd(zzfex zzfexVar) {
        String str;
        if (!zzfexVar.zzb.zza.isEmpty()) {
            zzfel zzfelVar = (zzfel) zzfexVar.zzb.zza.get(0);
            zzc("ad_format", zzfel.zza(zzfelVar.zzb));
            if (zzfelVar.zzb == 6) {
                ConcurrentHashMap concurrentHashMap = this.zza;
                if (true != this.zzb.zzm()) {
                    str = PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES;
                } else {
                    str = "1";
                }
                concurrentHashMap.put("as", str);
            }
        }
        zzc("gqi", zzfexVar.zzb.zzb.zzb);
    }

    public final void zze(Bundle bundle) {
        if (bundle != null) {
            if (bundle.containsKey("cnt")) {
                zzc("network_coarse", Integer.toString(bundle.getInt("cnt")));
            }
            if (bundle.containsKey("gnt")) {
                zzc("network_fine", Integer.toString(bundle.getInt("gnt")));
            }
        }
    }
}
