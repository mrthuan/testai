package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdme {
    private final Context zza;
    private final zzdln zzb;
    private final zzauo zzc;
    private final VersionInfoParcel zzd;
    private final com.google.android.gms.ads.internal.zza zze;
    private final zzbav zzf;
    private final Executor zzg;
    private final zzbes zzh;
    private final zzdmw zzi;
    private final zzdpl zzj;
    private final ScheduledExecutorService zzk;
    private final zzdog zzl;
    private final zzdsk zzm;
    private final zzfll zzn;
    private final zzedh zzo;
    private final zzeds zzp;
    private final zzffk zzq;

    public zzdme(Context context, zzdln zzdlnVar, zzauo zzauoVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.zza zzaVar, zzbav zzbavVar, Executor executor, zzffg zzffgVar, zzdmw zzdmwVar, zzdpl zzdplVar, ScheduledExecutorService scheduledExecutorService, zzdsk zzdskVar, zzfll zzfllVar, zzedh zzedhVar, zzdog zzdogVar, zzeds zzedsVar, zzffk zzffkVar) {
        this.zza = context;
        this.zzb = zzdlnVar;
        this.zzc = zzauoVar;
        this.zzd = versionInfoParcel;
        this.zze = zzaVar;
        this.zzf = zzbavVar;
        this.zzg = executor;
        this.zzh = zzffgVar.zzi;
        this.zzi = zzdmwVar;
        this.zzj = zzdplVar;
        this.zzk = scheduledExecutorService;
        this.zzm = zzdskVar;
        this.zzn = zzfllVar;
        this.zzo = zzedhVar;
        this.zzl = zzdogVar;
        this.zzp = zzedsVar;
        this.zzq = zzffkVar;
    }

    public static final com.google.android.gms.ads.internal.client.zzel zzi(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("mute");
        if (optJSONObject2 != null && (optJSONObject = optJSONObject2.optJSONObject("default_reason")) != null) {
            return zzr(optJSONObject);
        }
        return null;
    }

    public static final List zzj(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("mute");
        if (optJSONObject == null) {
            return zzfxr.zzm();
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("reasons");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                com.google.android.gms.ads.internal.client.zzel zzr = zzr(optJSONArray.optJSONObject(i10));
                if (zzr != null) {
                    arrayList.add(zzr);
                }
            }
            return zzfxr.zzk(arrayList);
        }
        return zzfxr.zzm();
    }

    private final com.google.android.gms.ads.internal.client.zzq zzk(int i10, int i11) {
        if (i10 == 0) {
            if (i11 != 0) {
                i10 = 0;
            } else {
                return com.google.android.gms.ads.internal.client.zzq.f();
            }
        }
        return new com.google.android.gms.ads.internal.client.zzq(this.zza, new AdSize(i10, i11));
    }

    private static y9.a zzl(y9.a aVar, Object obj) {
        return zzgcj.zzf(aVar, Exception.class, new zzgbq(null) { // from class: com.google.android.gms.internal.ads.zzdmc
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final y9.a zza(Object obj2) {
                Exception exc = (Exception) obj2;
                com.google.android.gms.ads.internal.util.zze.i();
                return zzgcj.zzh(null);
            }
        }, zzbzo.zzf);
    }

    private static y9.a zzm(boolean z10, final y9.a aVar, Object obj) {
        if (z10) {
            return zzgcj.zzn(aVar, new zzgbq() { // from class: com.google.android.gms.internal.ads.zzdmd
                @Override // com.google.android.gms.internal.ads.zzgbq
                public final y9.a zza(Object obj2) {
                    if (obj2 != null) {
                        return y9.a.this;
                    }
                    return zzgcj.zzg(new zzeir(1, "Retrieve required value in native ad response failed."));
                }
            }, zzbzo.zzf);
        }
        return zzl(aVar, null);
    }

    private final y9.a zzn(JSONObject jSONObject, boolean z10) {
        if (jSONObject == null) {
            return zzgcj.zzh(null);
        }
        final String optString = jSONObject.optString(InMobiNetworkValues.URL);
        if (TextUtils.isEmpty(optString)) {
            return zzgcj.zzh(null);
        }
        final double optDouble = jSONObject.optDouble("scale", 1.0d);
        boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        final int optInt = jSONObject.optInt(InMobiNetworkValues.WIDTH, -1);
        final int optInt2 = jSONObject.optInt(InMobiNetworkValues.HEIGHT, -1);
        if (z10) {
            return zzgcj.zzh(new zzbeq(null, Uri.parse(optString), optDouble, optInt, optInt2));
        }
        return zzm(jSONObject.optBoolean("require"), zzgcj.zzm(this.zzb.zzb(optString, optDouble, optBoolean), new zzful() { // from class: com.google.android.gms.internal.ads.zzdlu
            @Override // com.google.android.gms.internal.ads.zzful
            public final Object apply(Object obj) {
                return new zzbeq(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(optString), optDouble, optInt, optInt2);
            }
        }, this.zzg), null);
    }

    private final y9.a zzo(JSONArray jSONArray, boolean z10, boolean z11) {
        int i10;
        if (jSONArray != null && jSONArray.length() > 0) {
            ArrayList arrayList = new ArrayList();
            if (z11) {
                i10 = jSONArray.length();
            } else {
                i10 = 1;
            }
            for (int i11 = 0; i11 < i10; i11++) {
                arrayList.add(zzn(jSONArray.optJSONObject(i11), z10));
            }
            return zzgcj.zzm(zzgcj.zzd(arrayList), new zzful() { // from class: com.google.android.gms.internal.ads.zzdlz
                @Override // com.google.android.gms.internal.ads.zzful
                public final Object apply(Object obj) {
                    ArrayList arrayList2 = new ArrayList();
                    for (zzbeq zzbeqVar : (List) obj) {
                        if (zzbeqVar != null) {
                            arrayList2.add(zzbeqVar);
                        }
                    }
                    return arrayList2;
                }
            }, this.zzg);
        }
        return zzgcj.zzh(Collections.emptyList());
    }

    private final y9.a zzp(JSONObject jSONObject, zzfel zzfelVar, zzfeo zzfeoVar) {
        final y9.a zzb = this.zzi.zzb(jSONObject.optString("base_url"), jSONObject.optString("html"), zzfelVar, zzfeoVar, zzk(jSONObject.optInt(InMobiNetworkValues.WIDTH, 0), jSONObject.optInt(InMobiNetworkValues.HEIGHT, 0)));
        return zzgcj.zzn(zzb, new zzgbq() { // from class: com.google.android.gms.internal.ads.zzdlv
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final y9.a zza(Object obj) {
                zzcej zzcejVar = (zzcej) obj;
                if (zzcejVar != null && zzcejVar.zzq() != null) {
                    return y9.a.this;
                }
                throw new zzeir(1, "Retrieve video view in html5 ad response failed.");
            }
        }, zzbzo.zzf);
    }

    private static Integer zzq(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt(OperatorName.NON_STROKING_GRAY), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    private static final com.google.android.gms.ads.internal.client.zzel zzr(JSONObject jSONObject) {
        if (jSONObject != null) {
            String optString = jSONObject.optString("reason");
            String optString2 = jSONObject.optString("ping_url");
            if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                return new com.google.android.gms.ads.internal.client.zzel(optString, optString2);
            }
            return null;
        }
        return null;
    }

    public final /* synthetic */ zzben zza(JSONObject jSONObject, List list) {
        Integer num = null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        String optString = jSONObject.optString("text");
        Integer zzq = zzq(jSONObject, "bg_color");
        Integer zzq2 = zzq(jSONObject, "text_color");
        int optInt = jSONObject.optInt("text_size", -1);
        boolean optBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int optInt2 = jSONObject.optInt("animation_ms", 1000);
        int optInt3 = jSONObject.optInt("presentation_ms", 4000);
        if (optInt > 0) {
            num = Integer.valueOf(optInt);
        }
        return new zzben(optString, list, zzq, zzq2, num, optInt3 + optInt2, this.zzh.zze, optBoolean);
    }

    public final /* synthetic */ y9.a zzb(com.google.android.gms.ads.internal.client.zzq zzqVar, zzfel zzfelVar, zzfeo zzfeoVar, String str, String str2, Object obj) {
        zzcej zza = this.zzj.zza(zzqVar, zzfelVar, zzfeoVar);
        final zzbzs zza2 = zzbzs.zza(zza);
        zzdod zzb = this.zzl.zzb();
        zza.zzN().zzR(zzb, zzb, zzb, zzb, zzb, false, null, new com.google.android.gms.ads.internal.zzb(this.zza, null), null, null, this.zzo, this.zzn, this.zzm, null, zzb, null, null, null, null);
        zza.zzag("/getNativeAdViewSignals", zzbiw.zzs);
        zza.zzag("/getNativeClickMeta", zzbiw.zzt);
        zza.zzN().zzB(new zzcfz() { // from class: com.google.android.gms.internal.ads.zzdly
            @Override // com.google.android.gms.internal.ads.zzcfz
            public final void zza(boolean z10, int i10, String str3, String str4) {
                zzbzs zzbzsVar = zzbzs.this;
                if (z10) {
                    zzbzsVar.zzb();
                    return;
                }
                zzbzsVar.zzd(new zzeir(1, "Image Web View failed to load. Error code: " + i10 + ", Description: " + str3 + ", Failing URL: " + str4));
            }
        });
        zza.zzae(str, str2, null);
        return zza2;
    }

    public final y9.a zzc(String str, Object obj) {
        zzcew zzcewVar = com.google.android.gms.ads.internal.zzu.B.f10554d;
        zzcej zza = zzcew.zza(this.zza, zzcgd.zza(), "native-omid", false, false, this.zzc, null, this.zzd, null, null, this.zze, this.zzf, null, null, this.zzp, this.zzq);
        final zzbzs zza2 = zzbzs.zza(zza);
        zza.zzN().zzB(new zzcfz() { // from class: com.google.android.gms.internal.ads.zzdma
            @Override // com.google.android.gms.internal.ads.zzcfz
            public final void zza(boolean z10, int i10, String str2, String str3) {
                zzbzs.this.zzb();
            }
        });
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzeE)).booleanValue()) {
            zza.loadData(Base64.encodeToString(str.getBytes(), 1), "text/html", "base64");
        } else {
            zza.loadData(str, "text/html", "UTF-8");
        }
        return zza2;
    }

    public final y9.a zzd(JSONObject jSONObject, String str) {
        final JSONObject optJSONObject = jSONObject.optJSONObject("attribution");
        if (optJSONObject == null) {
            return zzgcj.zzh(null);
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("images");
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("image");
        if (optJSONArray == null && optJSONObject2 != null) {
            optJSONArray = new JSONArray();
            optJSONArray.put(optJSONObject2);
        }
        return zzm(optJSONObject.optBoolean("require"), zzgcj.zzm(zzo(optJSONArray, false, true), new zzful() { // from class: com.google.android.gms.internal.ads.zzdmb
            @Override // com.google.android.gms.internal.ads.zzful
            public final Object apply(Object obj) {
                return zzdme.this.zza(optJSONObject, (List) obj);
            }
        }, this.zzg), null);
    }

    public final y9.a zze(JSONObject jSONObject, String str) {
        return zzn(jSONObject.optJSONObject(str), this.zzh.zzb);
    }

    public final y9.a zzf(JSONObject jSONObject, String str) {
        zzbes zzbesVar = this.zzh;
        return zzo(jSONObject.optJSONArray("images"), zzbesVar.zzb, zzbesVar.zzd);
    }

    public final y9.a zzg(JSONObject jSONObject, String str, final zzfel zzfelVar, final zzfeo zzfeoVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzjf)).booleanValue()) {
            return zzgcj.zzh(null);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(0);
            if (optJSONObject == null) {
                return zzgcj.zzh(null);
            }
            final String optString = optJSONObject.optString("base_url");
            final String optString2 = optJSONObject.optString("html");
            final com.google.android.gms.ads.internal.client.zzq zzk = zzk(optJSONObject.optInt(InMobiNetworkValues.WIDTH, 0), optJSONObject.optInt(InMobiNetworkValues.HEIGHT, 0));
            if (TextUtils.isEmpty(optString2)) {
                return zzgcj.zzh(null);
            }
            final y9.a zzn = zzgcj.zzn(zzgcj.zzh(null), new zzgbq() { // from class: com.google.android.gms.internal.ads.zzdlw
                @Override // com.google.android.gms.internal.ads.zzgbq
                public final y9.a zza(Object obj) {
                    return zzdme.this.zzb(zzk, zzfelVar, zzfeoVar, optString, optString2, obj);
                }
            }, zzbzo.zze);
            return zzgcj.zzn(zzn, new zzgbq() { // from class: com.google.android.gms.internal.ads.zzdlx
                @Override // com.google.android.gms.internal.ads.zzgbq
                public final y9.a zza(Object obj) {
                    if (((zzcej) obj) != null) {
                        return y9.a.this;
                    }
                    throw new zzeir(1, "Retrieve Web View from image ad response failed.");
                }
            }, zzbzo.zzf);
        }
        return zzgcj.zzh(null);
    }

    public final y9.a zzh(JSONObject jSONObject, zzfel zzfelVar, zzfeo zzfeoVar) {
        JSONObject optJSONObject;
        com.google.android.gms.ads.internal.client.zzba zzbaVar;
        y9.a zza;
        String[] strArr = {"html_containers", "instream"};
        JSONObject k10 = com.google.android.gms.ads.internal.util.zzbs.k(jSONObject, strArr);
        boolean z10 = true;
        if (k10 == null) {
            optJSONObject = null;
        } else {
            optJSONObject = k10.optJSONObject(strArr[1]);
        }
        if (optJSONObject == null) {
            JSONObject optJSONObject2 = jSONObject.optJSONObject("video");
            if (optJSONObject2 == null) {
                return zzgcj.zzh(null);
            }
            String optString = optJSONObject2.optString("vast_xml");
            zzbbn zzbbnVar = zzbbw.zzje;
            z10 = (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbnVar)).booleanValue() && optJSONObject2.has("html")) ? false : false;
            if (TextUtils.isEmpty(optString)) {
                if (!z10) {
                    com.google.android.gms.ads.internal.util.client.zzm.e("Required field 'vast_xml' or 'html' is missing");
                    return zzgcj.zzh(null);
                }
            } else if (!z10) {
                zza = this.zzi.zza(optJSONObject2);
                return zzl(zzgcj.zzo(zza, ((Integer) zzbaVar.c.zza(zzbbw.zzdt)).intValue(), TimeUnit.SECONDS, this.zzk), null);
            }
            zza = zzp(optJSONObject2, zzfelVar, zzfeoVar);
            return zzl(zzgcj.zzo(zza, ((Integer) zzbaVar.c.zza(zzbbw.zzdt)).intValue(), TimeUnit.SECONDS, this.zzk), null);
        }
        return zzp(optJSONObject, zzfelVar, zzfeoVar);
    }
}
