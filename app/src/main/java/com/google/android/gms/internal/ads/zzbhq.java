package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import com.tom_roush.fontbox.ttf.NamingTable;
import java.util.Map;
import lib.zj.pdfeditor.Annotation;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbhq implements zzbix {
    @Override // com.google.android.gms.internal.ads.zzbix
    public final void zza(Object obj, Map map) {
        zzcej zzcejVar = (zzcej) obj;
        String str = (String) map.get("action");
        if ("tick".equals(str)) {
            String str2 = (String) map.get("label");
            String str3 = (String) map.get("start_label");
            String str4 = (String) map.get("timestamp");
            if (TextUtils.isEmpty(str2)) {
                com.google.android.gms.ads.internal.util.client.zzm.e("No label given for CSI tick.");
            } else if (TextUtils.isEmpty(str4)) {
                com.google.android.gms.ads.internal.util.client.zzm.e("No timestamp given for CSI tick.");
            } else {
                try {
                    long parseLong = Long.parseLong(str4);
                    com.google.android.gms.ads.internal.zzu zzuVar = com.google.android.gms.ads.internal.zzu.B;
                    zzuVar.f10560j.getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    zzuVar.f10560j.getClass();
                    long elapsedRealtime = (parseLong - currentTimeMillis) + SystemClock.elapsedRealtime();
                    if (true == TextUtils.isEmpty(str3)) {
                        str3 = "native:view_load";
                    }
                    zzcejVar.zzm().zzc(str2, str3, elapsedRealtime);
                } catch (NumberFormatException unused) {
                    com.google.android.gms.ads.internal.util.client.zzm.g(5);
                }
            }
        } else if ("experiment".equals(str)) {
            String str5 = (String) map.get("value");
            if (TextUtils.isEmpty(str5)) {
                com.google.android.gms.ads.internal.util.client.zzm.e("No value given for CSI experiment.");
            } else {
                zzcejVar.zzm().zza().zzd(Annotation.KEY_E, str5);
            }
        } else if ("extra".equals(str)) {
            String str6 = (String) map.get(NamingTable.TAG);
            String str7 = (String) map.get("value");
            if (TextUtils.isEmpty(str7)) {
                com.google.android.gms.ads.internal.util.client.zzm.e("No value given for CSI extra.");
            } else if (TextUtils.isEmpty(str6)) {
                com.google.android.gms.ads.internal.util.client.zzm.e("No name given for CSI extra.");
            } else {
                zzcejVar.zzm().zza().zzd(str6, str7);
            }
        }
    }
}
