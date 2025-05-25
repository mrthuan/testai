package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ExecutionException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdzn {
    private final zzgcu zza;
    private final zzgcu zzb;
    private final zzeaf zzc;

    public zzdzn(zzgcu zzgcuVar, zzgcu zzgcuVar2, zzeaf zzeafVar) {
        this.zza = zzgcuVar;
        this.zzb = zzgcuVar2;
        this.zzc = zzeafVar;
    }

    public final y9.a zza(zzbuc zzbucVar) {
        return this.zzc.zza(zzbucVar, ((Long) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzkG)).longValue());
    }

    public final y9.a zzb(final zzbuc zzbucVar) {
        y9.a zzf;
        String str = zzbucVar.zzb;
        com.google.android.gms.ads.internal.util.zzt zztVar = com.google.android.gms.ads.internal.zzu.B.c;
        if (com.google.android.gms.ads.internal.util.zzt.c(str)) {
            zzf = zzgcj.zzg(new zzdyp(1, "Ads signal service force local"));
        } else {
            zzf = zzgcj.zzf(zzgcj.zzk(new zzgbp() { // from class: com.google.android.gms.internal.ads.zzdzj
                @Override // com.google.android.gms.internal.ads.zzgbp
                public final y9.a zza() {
                    return zzdzn.this.zza(zzbucVar);
                }
            }, this.zza), ExecutionException.class, new zzgbq() { // from class: com.google.android.gms.internal.ads.zzdzk
                @Override // com.google.android.gms.internal.ads.zzgbq
                public final y9.a zza(Object obj) {
                    Throwable th2 = (ExecutionException) obj;
                    if (th2.getCause() != null) {
                        th2 = th2.getCause();
                    }
                    return zzgcj.zzg(th2);
                }
            }, this.zzb);
        }
        return zzgcj.zzn(zzgcj.zzf(zzgca.zzu(zzf), zzdyp.class, new zzgbq() { // from class: com.google.android.gms.internal.ads.zzdzl
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final y9.a zza(Object obj) {
                zzdyp zzdypVar = (zzdyp) obj;
                return zzgcj.zzh(null);
            }
        }, this.zzb), new zzgbq() { // from class: com.google.android.gms.internal.ads.zzdzm
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final y9.a zza(Object obj) {
                InputStream inputStream = (InputStream) obj;
                JSONObject jSONObject = new JSONObject();
                if (inputStream == null) {
                    return zzgcj.zzh(jSONObject);
                }
                try {
                    com.google.android.gms.ads.internal.util.zzt zztVar2 = com.google.android.gms.ads.internal.zzu.B.c;
                    InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                    com.google.android.gms.ads.internal.util.zzf zzfVar = com.google.android.gms.ads.internal.util.zzt.f10496l;
                    StringBuilder sb2 = new StringBuilder(8192);
                    char[] cArr = new char[2048];
                    while (true) {
                        int read = inputStreamReader.read(cArr);
                        if (read == -1) {
                            break;
                        }
                        sb2.append(cArr, 0, read);
                    }
                    jSONObject = new JSONObject(sb2.toString());
                } catch (IOException e10) {
                    e = e10;
                    com.google.android.gms.ads.internal.zzu.B.f10557g.zzw(e, "AdsServiceSignalTask.startAdsServiceSignalTask");
                    return zzgcj.zzh(jSONObject);
                } catch (JSONException e11) {
                    e = e11;
                    com.google.android.gms.ads.internal.zzu.B.f10557g.zzw(e, "AdsServiceSignalTask.startAdsServiceSignalTask");
                    return zzgcj.zzh(jSONObject);
                }
                return zzgcj.zzh(jSONObject);
            }
        }, this.zzb);
    }
}
