package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzeup implements zzevo {
    final String zza;
    private final zzgcu zzb;
    private final ScheduledExecutorService zzc;
    private final zzelg zzd;
    private final Context zze;
    private final zzffg zzf;
    private final zzelc zzg;
    private final zzdqb zzh;
    private final zzdup zzi;

    public zzeup(zzgcu zzgcuVar, ScheduledExecutorService scheduledExecutorService, String str, zzelg zzelgVar, Context context, zzffg zzffgVar, zzelc zzelcVar, zzdqb zzdqbVar, zzdup zzdupVar) {
        this.zzb = zzgcuVar;
        this.zzc = scheduledExecutorService;
        this.zza = str;
        this.zzd = zzelgVar;
        this.zze = context;
        this.zzf = zzffgVar;
        this.zzg = zzelcVar;
        this.zzh = zzdqbVar;
        this.zzi = zzdupVar;
    }

    public static y9.a zzc(zzeup zzeupVar) {
        String str;
        final Bundle bundle;
        zzbbn zzbbnVar = zzbbw.zzjW;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
        if (((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue()) {
            str = zzeupVar.zzf.zzf.toLowerCase(Locale.ROOT);
        } else {
            str = zzeupVar.zzf.zzf;
        }
        if (((Boolean) zzbaVar.c.zza(zzbbw.zzbt)).booleanValue()) {
            bundle = zzeupVar.zzi.zzg();
        } else {
            bundle = new Bundle();
        }
        final ArrayList arrayList = new ArrayList();
        if (!((Boolean) zzbaVar.c.zza(zzbbw.zzbC)).booleanValue()) {
            for (Map.Entry entry : ((zzfxu) zzeupVar.zzd.zzb(zzeupVar.zza, str)).entrySet()) {
                String str2 = (String) entry.getKey();
                arrayList.add(zzeupVar.zzg(str2, (List) entry.getValue(), zzeupVar.zzf(str2), true, true));
            }
            zzeupVar.zzi(arrayList, zzeupVar.zzd.zzc());
        } else {
            zzeupVar.zzi(arrayList, zzeupVar.zzd.zza(zzeupVar.zza, str));
        }
        return zzgcj.zzb(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeuk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                JSONArray jSONArray = new JSONArray();
                for (y9.a aVar : arrayList) {
                    if (((JSONObject) aVar.get()) != null) {
                        jSONArray.put(aVar.get());
                    }
                }
                if (jSONArray.length() == 0) {
                    return null;
                }
                return new zzeuq(jSONArray.toString(), bundle);
            }
        }, zzeupVar.zzb);
    }

    private final Bundle zzf(String str) {
        Bundle bundle = this.zzf.zzd.f10211m;
        if (bundle != null) {
            return bundle.getBundle(str);
        }
        return null;
    }

    private final zzgca zzg(final String str, final List list, final Bundle bundle, final boolean z10, final boolean z11) {
        zzgca zzu = zzgca.zzu(zzgcj.zzk(new zzgbp() { // from class: com.google.android.gms.internal.ads.zzeum
            @Override // com.google.android.gms.internal.ads.zzgbp
            public final y9.a zza() {
                return zzeup.this.zzd(str, list, bundle, z10, z11);
            }
        }, this.zzb));
        zzbbn zzbbnVar = zzbbw.zzbp;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
        if (!((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue()) {
            zzu = (zzgca) zzgcj.zzo(zzu, ((Long) zzbaVar.c.zza(zzbbw.zzbi)).longValue(), TimeUnit.MILLISECONDS, this.zzc);
        }
        return (zzgca) zzgcj.zze(zzu, Throwable.class, new zzful() { // from class: com.google.android.gms.internal.ads.zzeun
            @Override // com.google.android.gms.internal.ads.zzful
            public final Object apply(Object obj) {
                String str2 = str;
                com.google.android.gms.ads.internal.util.client.zzm.c("Error calling adapter: ".concat(String.valueOf(str2)));
                String concat = "rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(str2));
                com.google.android.gms.ads.internal.zzu.B.f10557g.zzw((Throwable) obj, concat);
                return null;
            }
        }, this.zzb);
    }

    private final void zzh(zzbql zzbqlVar, Bundle bundle, List list, zzelj zzeljVar) {
        zzbqlVar.zzh(new ObjectWrapper(this.zze), this.zza, bundle, (Bundle) list.get(0), this.zzf.zze, zzeljVar);
    }

    private final void zzi(List list, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            zzelk zzelkVar = (zzelk) entry.getValue();
            String str = zzelkVar.zza;
            list.add(zzg(str, Collections.singletonList(zzelkVar.zze), zzf(str), zzelkVar.zzb, zzelkVar.zzc));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final int zza() {
        return 32;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final y9.a zzb() {
        zzffg zzffgVar = this.zzf;
        if (zzffgVar.zzr) {
            if (!Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzbv)).split(",")).contains(com.google.android.gms.ads.nonagon.signalgeneration.zzq.b(com.google.android.gms.ads.nonagon.signalgeneration.zzq.c(zzffgVar.zzd)))) {
                return zzgcj.zzh(new zzeuq(new JSONArray().toString(), new Bundle()));
            }
        }
        return zzgcj.zzk(new zzgbp() { // from class: com.google.android.gms.internal.ads.zzeuj
            @Override // com.google.android.gms.internal.ads.zzgbp
            public final y9.a zza() {
                return zzeup.zzc(zzeup.this);
            }
        }, this.zzb);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:1|(2:3|(3:5|(2:7|(1:9)(1:12))(3:13|(1:15)|(2:17|(1:19)(1:20))(1:21))|10))|22|23|(0)(0)|10) */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
        com.google.android.gms.ads.internal.util.zze.i();
        r13 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final y9.a zzd(java.lang.String r9, final java.util.List r10, final android.os.Bundle r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.zzbzt r7 = new com.google.android.gms.internal.ads.zzbzt
            r7.<init>()
            r0 = 0
            if (r13 == 0) goto L26
            com.google.android.gms.internal.ads.zzbbn r13 = com.google.android.gms.internal.ads.zzbbw.zzbu
            com.google.android.gms.ads.internal.client.zzba r1 = com.google.android.gms.ads.internal.client.zzba.f10115d
            com.google.android.gms.internal.ads.zzbbu r1 = r1.c
            java.lang.Object r13 = r1.zza(r13)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L26
            com.google.android.gms.internal.ads.zzelc r13 = r8.zzg
            r13.zzb(r9)
            com.google.android.gms.internal.ads.zzelc r13 = r8.zzg
            com.google.android.gms.internal.ads.zzbql r13 = r13.zza(r9)
            goto L31
        L26:
            com.google.android.gms.internal.ads.zzdqb r13 = r8.zzh     // Catch: android.os.RemoteException -> L2d
            com.google.android.gms.internal.ads.zzbql r13 = r13.zzb(r9)     // Catch: android.os.RemoteException -> L2d
            goto L31
        L2d:
            com.google.android.gms.ads.internal.util.zze.i()
            r13 = r0
        L31:
            if (r13 != 0) goto L4b
            com.google.android.gms.internal.ads.zzbbn r10 = com.google.android.gms.internal.ads.zzbbw.zzbk
            com.google.android.gms.ads.internal.client.zzba r11 = com.google.android.gms.ads.internal.client.zzba.f10115d
            com.google.android.gms.internal.ads.zzbbu r11 = r11.c
            java.lang.Object r10 = r11.zza(r10)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L4a
            com.google.android.gms.internal.ads.zzelj.zzb(r9, r7)
            goto Lb4
        L4a:
            throw r0
        L4b:
            com.google.android.gms.internal.ads.zzelj r6 = new com.google.android.gms.internal.ads.zzelj
            com.google.android.gms.ads.internal.zzu r0 = com.google.android.gms.ads.internal.zzu.B
            com.google.android.gms.common.util.DefaultClock r0 = r0.f10560j
            r0.getClass()
            long r4 = android.os.SystemClock.elapsedRealtime()
            r0 = r6
            r1 = r9
            r2 = r13
            r3 = r7
            r0.<init>(r1, r2, r3, r4)
            com.google.android.gms.internal.ads.zzbbn r9 = com.google.android.gms.internal.ads.zzbbw.zzbp
            com.google.android.gms.ads.internal.client.zzba r0 = com.google.android.gms.ads.internal.client.zzba.f10115d
            com.google.android.gms.internal.ads.zzbbu r1 = r0.c
            java.lang.Object r9 = r1.zza(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            com.google.android.gms.internal.ads.zzbbu r0 = r0.c
            if (r9 == 0) goto L8b
            java.util.concurrent.ScheduledExecutorService r9 = r8.zzc
            com.google.android.gms.internal.ads.zzeuo r1 = new com.google.android.gms.internal.ads.zzeuo
            r1.<init>()
            com.google.android.gms.internal.ads.zzbbn r2 = com.google.android.gms.internal.ads.zzbbw.zzbi
            java.lang.Object r2 = r0.zza(r2)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            r9.schedule(r1, r2, r4)
        L8b:
            if (r12 == 0) goto Lb1
            com.google.android.gms.internal.ads.zzbbn r9 = com.google.android.gms.internal.ads.zzbbw.zzbw
            java.lang.Object r9 = r0.zza(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto Lad
            com.google.android.gms.internal.ads.zzgcu r9 = r8.zzb
            com.google.android.gms.internal.ads.zzeul r12 = new com.google.android.gms.internal.ads.zzeul
            r0 = r12
            r1 = r8
            r2 = r13
            r3 = r11
            r4 = r10
            r5 = r6
            r6 = r7
            r0.<init>()
            r9.zza(r12)
            goto Lb4
        Lad:
            r8.zzh(r13, r11, r10, r6)
            goto Lb4
        Lb1:
            r6.zzd()
        Lb4:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeup.zzd(java.lang.String, java.util.List, android.os.Bundle, boolean, boolean):y9.a");
    }

    public final /* synthetic */ void zze(zzbql zzbqlVar, Bundle bundle, List list, zzelj zzeljVar, zzbzt zzbztVar) {
        try {
            zzh(zzbqlVar, bundle, list, zzeljVar);
        } catch (RemoteException e10) {
            zzbztVar.zzd(e10);
        }
    }
}
