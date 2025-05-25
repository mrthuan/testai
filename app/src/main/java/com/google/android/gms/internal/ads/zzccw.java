package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzccw implements zzbix {
    private static final Integer zzb(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt((String) map.get(str)));
        } catch (NumberFormatException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.e("Precache invalid numeric parameter '" + str + "': " + ((String) map.get(str)));
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbix
    public final void zza(Object obj, Map map) {
        zzccv zzccvVar;
        zzcbk zzcbkVar = (zzcbk) obj;
        if (com.google.android.gms.ads.internal.util.client.zzm.g(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            com.google.android.gms.ads.internal.util.client.zzm.b("Precache GMSG: ".concat(jSONObject.toString()));
        }
        zzcco zzccoVar = com.google.android.gms.ads.internal.zzu.B.f10576z;
        if (map.containsKey("abort")) {
            if (!zzccoVar.zzd(zzcbkVar)) {
                com.google.android.gms.ads.internal.util.client.zzm.e("Precache abort but no precache task running.");
                return;
            }
            return;
        }
        String str = (String) map.get("src");
        Integer zzb = zzb(map, "periodicReportIntervalMs");
        Integer zzb2 = zzb(map, "exoPlayerRenderingIntervalMs");
        Integer zzb3 = zzb(map, "exoPlayerIdleIntervalMs");
        zzcbj zzcbjVar = new zzcbj((String) map.get("flags"));
        boolean z10 = zzcbjVar.zzk;
        if (str != null) {
            String[] strArr = {str};
            String str2 = (String) map.get("demuxed");
            zzccn zzccnVar = null;
            if (str2 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str2);
                    String[] strArr2 = new String[jSONArray.length()];
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        strArr2[i10] = jSONArray.getString(i10);
                    }
                    strArr = strArr2;
                } catch (JSONException unused) {
                    com.google.android.gms.ads.internal.util.client.zzm.e("Malformed demuxed URL list for precache: ".concat(str2));
                    strArr = null;
                }
            }
            if (strArr == null) {
                strArr = new String[]{str};
            }
            if (z10) {
                Iterator it = zzccoVar.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    zzccn zzccnVar2 = (zzccn) it.next();
                    if (zzccnVar2.zza == zzcbkVar && str.equals(zzccnVar2.zze())) {
                        zzccnVar = zzccnVar2;
                        break;
                    }
                }
            } else {
                zzccnVar = zzccoVar.zza(zzcbkVar);
            }
            if (zzccnVar != null) {
                com.google.android.gms.ads.internal.util.client.zzm.e("Precache task is already running.");
                return;
            } else if (zzcbkVar.zzj() == null) {
                com.google.android.gms.ads.internal.util.client.zzm.e("Precache requires a dependency provider.");
                return;
            } else {
                Integer zzb4 = zzb(map, "player");
                if (zzb4 == null) {
                    zzb4 = 0;
                }
                if (zzb != null) {
                    zzcbkVar.zzA(zzb.intValue());
                }
                if (zzb2 != null) {
                    zzcbkVar.zzy(zzb2.intValue());
                }
                if (zzb3 != null) {
                    zzcbkVar.zzx(zzb3.intValue());
                }
                int intValue = zzb4.intValue();
                zzcch zzcchVar = zzcbkVar.zzj().f10509b;
                if (intValue > 0) {
                    int i11 = zzcbjVar.zzg;
                    int zzu = zzcbb.zzu();
                    if (zzu < i11) {
                        zzccvVar = new zzcde(zzcbkVar, zzcbjVar);
                    } else if (zzu < zzcbjVar.zzb) {
                        zzccvVar = new zzcdb(zzcbkVar, zzcbjVar);
                    } else {
                        zzccvVar = new zzccz(zzcbkVar);
                    }
                } else {
                    zzccvVar = new zzccy(zzcbkVar);
                }
                new zzccn(zzcbkVar, zzccvVar, str, strArr).zzb();
            }
        } else {
            zzccn zza = zzccoVar.zza(zzcbkVar);
            if (zza != null) {
                zzccvVar = zza.zzb;
            } else {
                com.google.android.gms.ads.internal.util.client.zzm.e("Precache must specify a source.");
                return;
            }
        }
        Integer zzb5 = zzb(map, "minBufferMs");
        if (zzb5 != null) {
            zzccvVar.zzs(zzb5.intValue());
        }
        Integer zzb6 = zzb(map, "maxBufferMs");
        if (zzb6 != null) {
            zzccvVar.zzr(zzb6.intValue());
        }
        Integer zzb7 = zzb(map, "bufferForPlaybackMs");
        if (zzb7 != null) {
            zzccvVar.zzp(zzb7.intValue());
        }
        Integer zzb8 = zzb(map, "bufferForPlaybackAfterRebufferMs");
        if (zzb8 != null) {
            zzccvVar.zzq(zzb8.intValue());
        }
    }
}
