package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.JsonReader;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdtr extends zzbjy {
    private final zzdtu zza;
    private final zzdtp zzb;
    private final Map zzc = new HashMap();

    public zzdtr(zzdtu zzdtuVar, zzdtp zzdtpVar) {
        this.zza = zzdtuVar;
        this.zzb = zzdtpVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static com.google.android.gms.ads.internal.client.zzl zzc(Map map) {
        char c;
        com.google.android.gms.ads.internal.client.zzm zzmVar = new com.google.android.gms.ads.internal.client.zzm();
        String str = (String) map.get("ad_request");
        if (str == null) {
            return zzmVar.a();
        }
        JsonReader jsonReader = new JsonReader(new StringReader(Uri.decode(str)));
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                switch (nextName.hashCode()) {
                    case -1289032093:
                        if (nextName.equals("extras")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -839117230:
                        if (nextName.equals("isTestDevice")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case -733436947:
                        if (nextName.equals("tagForUnderAgeOfConsent")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case -99890337:
                        if (nextName.equals("httpTimeoutMillis")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case 523149226:
                        if (nextName.equals("keywords")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 597632527:
                        if (nextName.equals("maxAdContentRating")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1411582723:
                        if (nextName.equals("tagForChildDirectedTreatment")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        jsonReader.beginObject();
                        Bundle bundle = new Bundle();
                        while (jsonReader.hasNext()) {
                            bundle.putString(jsonReader.nextName(), jsonReader.nextString());
                        }
                        jsonReader.endObject();
                        zzmVar.f10225a = bundle;
                        break;
                    case 1:
                        jsonReader.beginArray();
                        ArrayList arrayList = new ArrayList();
                        while (jsonReader.hasNext()) {
                            arrayList.add(jsonReader.nextString());
                        }
                        jsonReader.endArray();
                        zzmVar.f10226b = arrayList;
                        break;
                    case 2:
                        zzmVar.c = jsonReader.nextBoolean();
                        break;
                    case 3:
                        if (jsonReader.nextBoolean()) {
                            zzmVar.f10227d = 1;
                            break;
                        } else {
                            zzmVar.f10227d = 0;
                            break;
                        }
                    case 4:
                        if (jsonReader.nextBoolean()) {
                            zzmVar.f10231h = 1;
                            break;
                        } else {
                            zzmVar.f10231h = 0;
                            break;
                        }
                    case 5:
                        String nextString = jsonReader.nextString();
                        if (!RequestConfiguration.f10039f.contains(nextString)) {
                            break;
                        } else {
                            zzmVar.f10232i = nextString;
                            break;
                        }
                    case 6:
                        zzmVar.f10234k = jsonReader.nextInt();
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
        } catch (IOException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.b("Ad Request json was malformed, parsing ended early.");
        }
        com.google.android.gms.ads.internal.client.zzl a10 = zzmVar.a();
        Bundle bundle2 = a10.f10211m;
        Bundle bundle3 = bundle2.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle3 == null) {
            bundle3 = a10.c;
            bundle2.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundle3);
        }
        return new com.google.android.gms.ads.internal.client.zzl(a10.f10200a, a10.f10201b, bundle3, a10.f10202d, a10.f10203e, a10.f10204f, a10.f10205g, a10.f10206h, a10.f10207i, a10.f10208j, a10.f10209k, a10.f10210l, a10.f10211m, a10.f10212n, a10.f10213o, a10.f10214p, a10.f10215q, a10.f10216r, a10.f10217s, a10.f10218t, a10.f10219u, a10.f10220v, a10.f10221w, a10.f10222x, a10.f10223y, a10.f10224z);
    }

    @Override // com.google.android.gms.internal.ads.zzbjz
    public final void zze() {
        this.zzc.clear();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzbjz
    public final void zzf(String str) {
        char c;
        zzbbn zzbbnVar = zzbbw.zzja;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
        if (!((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue()) {
            return;
        }
        com.google.android.gms.ads.internal.util.zze.h("Received H5 gmsg: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        com.google.android.gms.ads.internal.util.zzt zztVar = com.google.android.gms.ads.internal.zzu.B.c;
        HashMap l10 = com.google.android.gms.ads.internal.util.zzt.l(parse);
        String str2 = (String) l10.get("action");
        if (TextUtils.isEmpty(str2)) {
            com.google.android.gms.ads.internal.util.client.zzm.b("H5 gmsg did not contain an action");
            return;
        }
        str2.getClass();
        if (!str2.equals("initialize")) {
            if (!str2.equals("dispose_all")) {
                String str3 = (String) l10.get("obj_id");
                try {
                    Objects.requireNonNull(str3);
                    long parseLong = Long.parseLong(str3);
                    switch (str2.hashCode()) {
                        case -1790951212:
                            if (str2.equals("show_interstitial_ad")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1266374734:
                            if (str2.equals("show_rewarded_ad")) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        case -257098725:
                            if (str2.equals("load_rewarded_ad")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case 393881811:
                            if (str2.equals("create_interstitial_ad")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case 585513149:
                            if (str2.equals("load_interstitial_ad")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1671767583:
                            if (str2.equals("dispose")) {
                                c = 6;
                                break;
                            }
                            c = 65535;
                            break;
                        case 2109237041:
                            if (str2.equals("create_rewarded_ad")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    zzbbu zzbbuVar = zzbaVar.c;
                    switch (c) {
                        case 0:
                            if (this.zzc.size() >= ((Integer) zzbbuVar.zza(zzbbw.zzjb)).intValue()) {
                                com.google.android.gms.ads.internal.util.client.zzm.e("Could not create H5 ad, too many existing objects");
                                this.zzb.zzi(parseLong);
                                return;
                            }
                            Map map = this.zzc;
                            Long valueOf = Long.valueOf(parseLong);
                            if (map.containsKey(valueOf)) {
                                com.google.android.gms.ads.internal.util.client.zzm.b("Could not create H5 ad, object ID already exists");
                                this.zzb.zzi(parseLong);
                                return;
                            }
                            String str4 = (String) l10.get("ad_unit");
                            if (TextUtils.isEmpty(str4)) {
                                com.google.android.gms.ads.internal.util.client.zzm.e("Could not create H5 ad, missing ad unit id");
                                this.zzb.zzi(parseLong);
                                return;
                            }
                            zzdtl zzb = this.zza.zzb();
                            zzb.zzb(parseLong);
                            zzb.zza(str4);
                            this.zzc.put(valueOf, zzb.zzc().zza());
                            this.zzb.zzh(parseLong);
                            com.google.android.gms.ads.internal.util.zze.h("Created H5 interstitial #" + parseLong + " with ad unit " + str4);
                            return;
                        case 1:
                            zzdtk zzdtkVar = (zzdtk) this.zzc.get(Long.valueOf(parseLong));
                            if (zzdtkVar == null) {
                                com.google.android.gms.ads.internal.util.client.zzm.b("Could not load H5 ad, object ID does not exist");
                                this.zzb.zzf(parseLong);
                                return;
                            }
                            zzdtkVar.zzb(zzc(l10));
                            return;
                        case 2:
                            zzdtk zzdtkVar2 = (zzdtk) this.zzc.get(Long.valueOf(parseLong));
                            if (zzdtkVar2 == null) {
                                com.google.android.gms.ads.internal.util.client.zzm.b("Could not show H5 ad, object ID does not exist");
                                this.zzb.zzf(parseLong);
                                return;
                            }
                            zzdtkVar2.zzc();
                            return;
                        case 3:
                            if (this.zzc.size() >= ((Integer) zzbbuVar.zza(zzbbw.zzjb)).intValue()) {
                                com.google.android.gms.ads.internal.util.client.zzm.e("Could not create H5 ad, too many existing objects");
                                this.zzb.zzi(parseLong);
                                return;
                            }
                            Map map2 = this.zzc;
                            Long valueOf2 = Long.valueOf(parseLong);
                            if (map2.containsKey(valueOf2)) {
                                com.google.android.gms.ads.internal.util.client.zzm.b("Could not create H5 ad, object ID already exists");
                                this.zzb.zzi(parseLong);
                                return;
                            }
                            String str5 = (String) l10.get("ad_unit");
                            if (TextUtils.isEmpty(str5)) {
                                com.google.android.gms.ads.internal.util.client.zzm.e("Could not create H5 ad, missing ad unit id");
                                this.zzb.zzi(parseLong);
                                return;
                            }
                            zzdtl zzb2 = this.zza.zzb();
                            zzb2.zzb(parseLong);
                            zzb2.zza(str5);
                            this.zzc.put(valueOf2, zzb2.zzc().zzb());
                            this.zzb.zzh(parseLong);
                            com.google.android.gms.ads.internal.util.zze.h("Created H5 rewarded #" + parseLong + " with ad unit " + str5);
                            return;
                        case 4:
                            zzdtk zzdtkVar3 = (zzdtk) this.zzc.get(Long.valueOf(parseLong));
                            if (zzdtkVar3 == null) {
                                com.google.android.gms.ads.internal.util.client.zzm.b("Could not load H5 ad, object ID does not exist");
                                this.zzb.zzq(parseLong);
                                return;
                            }
                            zzdtkVar3.zzb(zzc(l10));
                            return;
                        case 5:
                            zzdtk zzdtkVar4 = (zzdtk) this.zzc.get(Long.valueOf(parseLong));
                            if (zzdtkVar4 == null) {
                                com.google.android.gms.ads.internal.util.client.zzm.b("Could not show H5 ad, object ID does not exist");
                                this.zzb.zzq(parseLong);
                                return;
                            }
                            zzdtkVar4.zzc();
                            return;
                        case 6:
                            Map map3 = this.zzc;
                            Long valueOf3 = Long.valueOf(parseLong);
                            zzdtk zzdtkVar5 = (zzdtk) map3.get(valueOf3);
                            if (zzdtkVar5 == null) {
                                com.google.android.gms.ads.internal.util.client.zzm.b("Could not dispose H5 ad, object ID does not exist");
                                return;
                            }
                            zzdtkVar5.zza();
                            this.zzc.remove(valueOf3);
                            com.google.android.gms.ads.internal.util.zze.h("Disposed H5 ad #" + parseLong);
                            return;
                        default:
                            com.google.android.gms.ads.internal.util.client.zzm.b("H5 gmsg contained invalid action: ".concat(str2));
                            return;
                    }
                } catch (NullPointerException | NumberFormatException unused) {
                    com.google.android.gms.ads.internal.util.client.zzm.b("H5 gmsg did not contain a valid object id: ".concat(String.valueOf(str3)));
                    return;
                }
            }
            for (zzdtk zzdtkVar6 : this.zzc.values()) {
                zzdtkVar6.zza();
            }
            this.zzc.clear();
            return;
        }
        this.zzc.clear();
        this.zzb.zza();
    }
}
