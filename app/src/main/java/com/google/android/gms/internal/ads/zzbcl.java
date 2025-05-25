package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
@Deprecated
/* loaded from: classes2.dex */
public final class zzbcl {
    private final List zza = new LinkedList();
    private final Map zzb;
    private final Object zzc;

    public zzbcl(boolean z10, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzb = linkedHashMap;
        this.zzc = new Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put("ad_format", str2);
    }

    public static final zzbci zzf() {
        com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
        return new zzbci(SystemClock.elapsedRealtime(), null, null);
    }

    public final zzbck zza() {
        zzbck zzbckVar;
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzbG)).booleanValue();
        StringBuilder sb2 = new StringBuilder();
        HashMap hashMap = new HashMap();
        synchronized (this.zzc) {
            for (zzbci zzbciVar : this.zza) {
                long zza = zzbciVar.zza();
                String zzc = zzbciVar.zzc();
                zzbci zzb = zzbciVar.zzb();
                if (zzb != null && zza > 0) {
                    sb2.append(zzc);
                    sb2.append('.');
                    sb2.append(zza - zzb.zza());
                    sb2.append(',');
                    if (booleanValue) {
                        if (!hashMap.containsKey(Long.valueOf(zzb.zza()))) {
                            hashMap.put(Long.valueOf(zzb.zza()), new StringBuilder(zzc));
                        } else {
                            StringBuilder sb3 = (StringBuilder) hashMap.get(Long.valueOf(zzb.zza()));
                            sb3.append('+');
                            sb3.append(zzc);
                        }
                    }
                }
            }
            this.zza.clear();
            String str = null;
            if (!TextUtils.isEmpty(null)) {
                sb2.append((String) null);
            } else if (sb2.length() > 0) {
                sb2.setLength(sb2.length() - 1);
            }
            StringBuilder sb4 = new StringBuilder();
            if (booleanValue) {
                for (Map.Entry entry : hashMap.entrySet()) {
                    sb4.append((CharSequence) entry.getValue());
                    sb4.append('.');
                    long longValue = ((Long) entry.getKey()).longValue();
                    com.google.android.gms.ads.internal.zzu zzuVar = com.google.android.gms.ads.internal.zzu.B;
                    zzuVar.f10560j.getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    zzuVar.f10560j.getClass();
                    sb4.append((longValue - SystemClock.elapsedRealtime()) + currentTimeMillis);
                    sb4.append(',');
                }
                if (sb4.length() > 0) {
                    sb4.setLength(sb4.length() - 1);
                }
                str = sb4.toString();
            }
            zzbckVar = new zzbck(sb2.toString(), str);
        }
        return zzbckVar;
    }

    public final Map zzb() {
        Map map;
        synchronized (this.zzc) {
            com.google.android.gms.ads.internal.zzu.B.f10557g.zzg();
            map = this.zzb;
        }
        return map;
    }

    public final void zzc(zzbcl zzbclVar) {
        synchronized (this.zzc) {
        }
    }

    public final void zzd(String str, String str2) {
        zzbcb zzg;
        if (!TextUtils.isEmpty(str2) && (zzg = com.google.android.gms.ads.internal.zzu.B.f10557g.zzg()) != null) {
            synchronized (this.zzc) {
                zzbch zza = zzg.zza(str);
                Map map = this.zzb;
                map.put(str, zza.zza((String) map.get(str), str2));
            }
        }
    }

    public final boolean zze(zzbci zzbciVar, long j10, String... strArr) {
        synchronized (this.zzc) {
            this.zza.add(new zzbci(j10, strArr[0], zzbciVar));
        }
        return true;
    }
}
