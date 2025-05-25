package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.PlatformVersion;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzehn implements zzehh {
    private final zzdhl zza;
    private final zzgcu zzb;
    private final zzdlr zzc;
    private final zzfgf zzd;
    private final zzdog zze;

    public zzehn(zzdhl zzdhlVar, zzgcu zzgcuVar, zzdlr zzdlrVar, zzfgf zzfgfVar, zzdog zzdogVar) {
        this.zza = zzdhlVar;
        this.zzb = zzgcuVar;
        this.zzc = zzdlrVar;
        this.zzd = zzfgfVar;
        this.zze = zzdogVar;
    }

    private final y9.a zzg(final zzfex zzfexVar, final zzfel zzfelVar, final JSONObject jSONObject) {
        zzdlr zzdlrVar = this.zzc;
        final y9.a zza = this.zzd.zza();
        final y9.a zza2 = zzdlrVar.zza(zzfexVar, zzfelVar, jSONObject);
        return zzgcj.zzc(zza, zza2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzehi
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzehn.this.zzc(zza2, zza, zzfexVar, zzfelVar, jSONObject);
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzeet
    public final y9.a zza(final zzfex zzfexVar, final zzfel zzfelVar) {
        return zzgcj.zzn(zzgcj.zzn(this.zzd.zza(), new zzgbq() { // from class: com.google.android.gms.internal.ads.zzehk
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final y9.a zza(Object obj) {
                return zzehn.this.zze(zzfelVar, (zzdoa) obj);
            }
        }, this.zzb), new zzgbq() { // from class: com.google.android.gms.internal.ads.zzehl
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final y9.a zza(Object obj) {
                return zzehn.this.zzf(zzfexVar, zzfelVar, (JSONArray) obj);
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzeet
    public final boolean zzb(zzfex zzfexVar, zzfel zzfelVar) {
        zzfeq zzfeqVar = zzfelVar.zzs;
        if (zzfeqVar != null && zzfeqVar.zzc != null) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ zzdiw zzc(y9.a aVar, y9.a aVar2, zzfex zzfexVar, zzfel zzfelVar, JSONObject jSONObject) {
        zzdjb zzdjbVar = (zzdjb) aVar.get();
        zzdoa zzdoaVar = (zzdoa) aVar2.get();
        zzdjc zzd = this.zza.zzd(new zzcsk(zzfexVar, zzfelVar, null), new zzdjn(zzdjbVar), new zzdia(jSONObject, zzdoaVar));
        zzd.zzh().zzb();
        zzd.zzi().zza(zzdoaVar);
        zzd.zzg().zza(zzdjbVar.zzs());
        zzd.zzl().zza(this.zze, zzdjbVar.zzq());
        return zzd.zza();
    }

    public final /* synthetic */ y9.a zzd(zzdoa zzdoaVar, JSONObject jSONObject) {
        this.zzd.zzb(zzgcj.zzh(zzdoaVar));
        if (jSONObject.optBoolean("success")) {
            return zzgcj.zzh(jSONObject.getJSONObject("json").getJSONArray("ads"));
        }
        throw new zzbnd("process json failed");
    }

    public final y9.a zze(zzfel zzfelVar, final zzdoa zzdoaVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isNonagon", true);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzhN)).booleanValue() && PlatformVersion.b()) {
            jSONObject.put("skipDeepLinkValidation", true);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("response", zzfelVar.zzs.zzc);
        jSONObject2.put("sdk_params", jSONObject);
        return zzgcj.zzn(zzdoaVar.zzg("google.afma.nativeAds.preProcessJson", jSONObject2), new zzgbq() { // from class: com.google.android.gms.internal.ads.zzehj
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final y9.a zza(Object obj) {
                return zzehn.this.zzd(zzdoaVar, (JSONObject) obj);
            }
        }, this.zzb);
    }

    public final /* synthetic */ y9.a zzf(zzfex zzfexVar, zzfel zzfelVar, JSONArray jSONArray) {
        if (jSONArray.length() == 0) {
            return zzgcj.zzg(new zzdwl(3));
        }
        if (zzfexVar.zza.zza.zzk > 1) {
            int length = jSONArray.length();
            this.zzd.zzc(Math.min(length, zzfexVar.zza.zza.zzk));
            ArrayList arrayList = new ArrayList(zzfexVar.zza.zza.zzk);
            for (int i10 = 0; i10 < zzfexVar.zza.zza.zzk; i10++) {
                if (i10 < length) {
                    arrayList.add(zzg(zzfexVar, zzfelVar, jSONArray.getJSONObject(i10)));
                } else {
                    arrayList.add(zzgcj.zzg(new zzdwl(3)));
                }
            }
            return zzgcj.zzh(arrayList);
        }
        return zzgcj.zzm(zzg(zzfexVar, zzfelVar, jSONArray.getJSONObject(0)), new zzful() { // from class: com.google.android.gms.internal.ads.zzehm
            @Override // com.google.android.gms.internal.ads.zzful
            public final Object apply(Object obj) {
                return Collections.singletonList(zzgcj.zzh((zzdiw) obj));
            }
        }, this.zzb);
    }
}
