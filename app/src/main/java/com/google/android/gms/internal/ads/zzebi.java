package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzebi extends zzbun {
    private final Context zza;
    private final zzexh zzb;
    private final zzexf zzc;
    private final zzebq zzd;
    private final zzgcu zze;
    private final zzbvj zzf;

    public zzebi(Context context, zzexh zzexhVar, zzexf zzexfVar, zzebn zzebnVar, zzebq zzebqVar, zzgcu zzgcuVar, zzbvj zzbvjVar) {
        this.zza = context;
        this.zzb = zzexhVar;
        this.zzc = zzexfVar;
        this.zzd = zzebqVar;
        this.zze = zzgcuVar;
        this.zzf = zzbvjVar;
    }

    private final void zzc(y9.a aVar, zzbur zzburVar) {
        zzgcj.zzr(zzgcj.zzn(zzgca.zzu(aVar), new zzgbq(this) { // from class: com.google.android.gms.internal.ads.zzebf
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final y9.a zza(Object obj) {
                return zzgcj.zzh(zzfgh.zza((InputStream) obj));
            }
        }, zzbzo.zza), new zzebh(this, zzburVar), zzbzo.zzf);
    }

    public final y9.a zzb(zzbug zzbugVar, int i10) {
        y9.a zzh;
        HashMap hashMap = new HashMap();
        Bundle bundle = zzbugVar.zzc;
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                if (string != null) {
                    hashMap.put(str, string);
                }
            }
        }
        final zzebk zzebkVar = new zzebk(zzbugVar.zza, zzbugVar.zzb, hashMap, zzbugVar.zzd, "", zzbugVar.zze);
        zzexf zzexfVar = this.zzc;
        zzexfVar.zza(new zzeyj(zzbugVar));
        boolean z10 = zzebkVar.zzf;
        zzexg zzb = zzexfVar.zzb();
        if (z10) {
            String str2 = zzbugVar.zza;
            String str3 = (String) zzbdz.zzb.zze();
            if (!TextUtils.isEmpty(str3)) {
                String host = Uri.parse(str2).getHost();
                if (!TextUtils.isEmpty(host)) {
                    for (String str4 : zzfvh.zzb(zzfui.zzc(';')).zzc(str3)) {
                        if (host.endsWith(str4)) {
                            zzh = zzgcj.zzm(zzb.zza().zza(new JSONObject(), new Bundle()), new zzful() { // from class: com.google.android.gms.internal.ads.zzeba
                                @Override // com.google.android.gms.internal.ads.zzful
                                public final Object apply(Object obj) {
                                    zzebk zzebkVar2 = zzebk.this;
                                    zzebq.zza(zzebkVar2.zzc, (JSONObject) obj);
                                    return zzebkVar2;
                                }
                            }, this.zze);
                            break;
                        }
                    }
                }
            }
        }
        zzh = zzgcj.zzh(zzebkVar);
        zzfjl zzb2 = zzb.zzb();
        return zzgcj.zzn(zzb2.zzb(zzfjf.HTTP, zzh).zze(new zzebm(this.zza, "", this.zzf, i10)).zza(), new zzgbq() { // from class: com.google.android.gms.internal.ads.zzebb
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final y9.a zza(Object obj) {
                zzebl zzeblVar = (zzebl) obj;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("response", zzeblVar.zza);
                    JSONObject jSONObject2 = new JSONObject();
                    for (String str5 : zzeblVar.zzb.keySet()) {
                        if (str5 != null) {
                            JSONArray jSONArray = new JSONArray();
                            for (String str6 : (List) zzeblVar.zzb.get(str5)) {
                                if (str6 != null) {
                                    jSONArray.put(str6);
                                }
                            }
                            jSONObject2.put(str5, jSONArray);
                        }
                    }
                    jSONObject.put("headers", jSONObject2);
                    Object obj2 = zzeblVar.zzc;
                    if (obj2 != null) {
                        jSONObject.put("body", obj2);
                    }
                    jSONObject.put("latency", zzeblVar.zzd);
                    return zzgcj.zzh(new ByteArrayInputStream(jSONObject.toString().getBytes(StandardCharsets.UTF_8)));
                } catch (JSONException e10) {
                    com.google.android.gms.ads.internal.util.client.zzm.e("Error converting response to JSONObject: ".concat(String.valueOf(e10.getMessage())));
                    throw new JSONException("Parsing HTTP Response: ".concat(String.valueOf(e10.getCause())));
                }
            }
        }, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzbuo
    public final void zze(zzbug zzbugVar, zzbur zzburVar) {
        zzc(zzb(zzbugVar, Binder.getCallingUid()), zzburVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbuo
    public final void zzf(zzbuc zzbucVar, zzbur zzburVar) {
        zzeww zzewwVar = new zzeww(zzbucVar, Binder.getCallingUid());
        zzexh zzexhVar = this.zzb;
        zzexhVar.zza(zzewwVar);
        final zzexi zzb = zzexhVar.zzb();
        zzfjl zzb2 = zzb.zzb();
        zzfiq zza = zzb2.zzb(zzfjf.GMS_SIGNALS, zzgcj.zzi()).zzf(new zzgbq() { // from class: com.google.android.gms.internal.ads.zzebe
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final y9.a zza(Object obj) {
                Void r32 = (Void) obj;
                return zzexi.this.zza().zza(new JSONObject(), new Bundle());
            }
        }).zze(new zzfio() { // from class: com.google.android.gms.internal.ads.zzebd
            @Override // com.google.android.gms.internal.ads.zzfio
            public final Object zza(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                com.google.android.gms.ads.internal.util.zze.h("GMS AdRequest Signals: ");
                com.google.android.gms.ads.internal.util.zze.h(jSONObject.toString(2));
                return jSONObject;
            }
        }).zzf(new zzgbq() { // from class: com.google.android.gms.internal.ads.zzebc
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final y9.a zza(Object obj) {
                return zzgcj.zzh(new ByteArrayInputStream(((JSONObject) obj).toString().getBytes(StandardCharsets.UTF_8)));
            }
        }).zza();
        zzc(zza, zzburVar);
        if (((Boolean) zzbds.zzf.zze()).booleanValue()) {
            final zzebq zzebqVar = this.zzd;
            Objects.requireNonNull(zzebqVar);
            zza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzebg
                @Override // java.lang.Runnable
                public final void run() {
                    zzebq.this.zzb();
                }
            }, this.zze);
        }
    }
}
