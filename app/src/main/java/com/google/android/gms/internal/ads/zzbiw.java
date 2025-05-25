package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbiw {
    public static final zzbix zza = new zzbix() { // from class: com.google.android.gms.internal.ads.zzbhu
        @Override // com.google.android.gms.internal.ads.zzbix
        public final void zza(Object obj, Map map) {
            String str;
            zzcfq zzcfqVar = (zzcfq) obj;
            zzbix zzbixVar = zzbiw.zza;
            String str2 = (String) map.get("urls");
            if (TextUtils.isEmpty(str2)) {
                com.google.android.gms.ads.internal.util.client.zzm.e("URLs missing in canOpenURLs GMSG.");
                return;
            }
            String[] split = str2.split(",");
            HashMap hashMap = new HashMap();
            PackageManager packageManager = zzcfqVar.getContext().getPackageManager();
            for (String str3 : split) {
                String[] split2 = str3.split(";", 2);
                String trim = split2[0].trim();
                boolean z10 = true;
                if (split2.length > 1) {
                    str = split2[1].trim();
                } else {
                    str = "android.intent.action.VIEW";
                }
                if (packageManager.resolveActivity(new Intent(str, Uri.parse(trim)), 65536) == null) {
                    z10 = false;
                }
                Boolean valueOf = Boolean.valueOf(z10);
                hashMap.put(str3, valueOf);
                com.google.android.gms.ads.internal.util.zze.h("/canOpenURLs;" + str3 + ";" + valueOf);
            }
            ((zzbls) zzcfqVar).zzd("openableURLs", hashMap);
        }
    };
    public static final zzbix zzb = new zzbix() { // from class: com.google.android.gms.internal.ads.zzbhw
        @Override // com.google.android.gms.internal.ads.zzbix
        public final void zza(Object obj, Map map) {
            boolean z10;
            zzcfq zzcfqVar = (zzcfq) obj;
            zzbix zzbixVar = zzbiw.zza;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzht)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzm.e("canOpenAppGmsgHandler disabled.");
                return;
            }
            String str = (String) map.get(InMobiNetworkValues.PACKAGE_NAME);
            if (TextUtils.isEmpty(str)) {
                com.google.android.gms.ads.internal.util.client.zzm.e("Package name missing in canOpenApp GMSG.");
                return;
            }
            HashMap hashMap = new HashMap();
            if (zzcfqVar.getContext().getPackageManager().getLaunchIntentForPackage(str) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            Boolean valueOf = Boolean.valueOf(z10);
            hashMap.put(str, valueOf);
            com.google.android.gms.ads.internal.util.zze.h("/canOpenApp;" + str + ";" + valueOf);
            ((zzbls) zzcfqVar).zzd("openableApp", hashMap);
        }
    };
    public static final zzbix zzc = new zzbix() { // from class: com.google.android.gms.internal.ads.zzbhz
        @Override // com.google.android.gms.internal.ads.zzbix
        public final void zza(Object obj, Map map) {
            zzbiw.zzb((zzcfq) obj, map);
        }
    };
    public static final zzbix zzd = new zzbio();
    public static final zzbix zze = new zzbip();
    public static final zzbix zzf = new zzbix() { // from class: com.google.android.gms.internal.ads.zzbia
        @Override // com.google.android.gms.internal.ads.zzbix
        public final void zza(Object obj, Map map) {
            zzcfq zzcfqVar = (zzcfq) obj;
            zzbix zzbixVar = zzbiw.zza;
            String str = (String) map.get("u");
            if (str == null) {
                com.google.android.gms.ads.internal.util.client.zzm.e("URL missing from httpTrack GMSG.");
            } else {
                new com.google.android.gms.ads.internal.util.zzbw(zzcfqVar.getContext(), ((zzcfx) zzcfqVar).zzn().f10345a, str).zzb();
            }
        }
    };
    public static final zzbix zzg = new zzbiq();
    public static final zzbix zzh = new zzbir();
    public static final zzbix zzi = new zzbix() { // from class: com.google.android.gms.internal.ads.zzbhy
        @Override // com.google.android.gms.internal.ads.zzbix
        public final void zza(Object obj, Map map) {
            zzcfw zzcfwVar = (zzcfw) obj;
            zzbix zzbixVar = zzbiw.zza;
            String str = (String) map.get("tx");
            String str2 = (String) map.get("ty");
            String str3 = (String) map.get("td");
            try {
                int parseInt = Integer.parseInt(str);
                int parseInt2 = Integer.parseInt(str2);
                int parseInt3 = Integer.parseInt(str3);
                zzauo zzI = zzcfwVar.zzI();
                if (zzI != null) {
                    zzI.zzc().zzl(parseInt, parseInt2, parseInt3);
                }
            } catch (NumberFormatException unused) {
                com.google.android.gms.ads.internal.util.client.zzm.e("Could not parse touch parameters from gmsg.");
            }
        }
    };
    public static final zzbix zzj = new zzbis();
    public static final zzbix zzk = new zzbit();
    public static final zzbix zzl = new zzccj();
    public static final zzbix zzm = new zzcck();
    public static final zzbix zzn = new zzbhq();
    public static final zzbjn zzo = new zzbjn();
    public static final zzbix zzp = new zzbiu();
    public static final zzbix zzq = new zzbiv();
    public static final zzbix zzr = new zzbib();
    public static final zzbix zzs = new zzbic();
    public static final zzbix zzt = new zzbid();
    public static final zzbix zzu = new zzbie();
    public static final zzbix zzv = new zzbif();
    public static final zzbix zzw = new zzbig();
    public static final zzbix zzx = new zzbih();
    public static final zzbix zzy = new zzbii();
    public static final zzbix zzz = new zzbij();
    public static final zzbix zzA = new zzbik();
    public static final zzbix zzB = new zzbim();
    public static final zzbix zzC = new zzbin();

    public static y9.a zza(zzcej zzcejVar, String str) {
        Uri parse = Uri.parse(str);
        try {
            zzauo zzI = zzcejVar.zzI();
            zzffk zzS = zzcejVar.zzS();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzla)).booleanValue() && zzS != null) {
                if (zzI != null && zzI.zzf(parse)) {
                    parse = zzS.zza(parse, zzcejVar.getContext(), zzcejVar.zzF(), zzcejVar.zzi());
                }
            } else if (zzI != null && zzI.zzf(parse)) {
                parse = zzI.zza(parse, zzcejVar.getContext(), zzcejVar.zzF(), zzcejVar.zzi());
            }
        } catch (zzaup unused) {
            com.google.android.gms.ads.internal.util.client.zzm.e("Unable to append parameter to URL: ".concat(str));
        }
        Map hashMap = new HashMap();
        if (zzcejVar.zzD() != null) {
            hashMap = zzcejVar.zzD().zzaw;
        }
        final String zzb2 = zzbyc.zzb(parse, zzcejVar.getContext(), hashMap);
        long longValue = ((Long) zzbdr.zze.zze()).longValue();
        if (longValue > 0 && longValue <= 242402501) {
            zzgca zzu2 = zzgca.zzu(zzcejVar.zzT());
            zzful zzfulVar = new zzful() { // from class: com.google.android.gms.internal.ads.zzbhr
                @Override // com.google.android.gms.internal.ads.zzful
                public final Object apply(Object obj) {
                    Throwable th2 = (Throwable) obj;
                    zzbix zzbixVar = zzbiw.zza;
                    if (((Boolean) zzbdr.zzi.zze()).booleanValue()) {
                        com.google.android.gms.ads.internal.zzu.B.f10557g.zzw(th2, "prepareClickUrl.attestation1");
                        return "failure_click_attok";
                    }
                    return "failure_click_attok";
                }
            };
            zzgcu zzgcuVar = zzbzo.zzf;
            return zzgcj.zze(zzgcj.zzm(zzgcj.zze(zzu2, Throwable.class, zzfulVar, zzgcuVar), new zzful() { // from class: com.google.android.gms.internal.ads.zzbhs
                @Override // com.google.android.gms.internal.ads.zzful
                public final Object apply(Object obj) {
                    String str2 = (String) obj;
                    zzbix zzbixVar = zzbiw.zza;
                    String str3 = zzb2;
                    if (str2 != null) {
                        if (((Boolean) zzbdr.zzf.zze()).booleanValue()) {
                            String[] strArr = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
                            String host = Uri.parse(str3).getHost();
                            for (int i10 = 0; i10 < 3; i10++) {
                                if (!host.endsWith(strArr[i10])) {
                                }
                            }
                        }
                        String str4 = (String) zzbdr.zza.zze();
                        String str5 = (String) zzbdr.zzb.zze();
                        if (!TextUtils.isEmpty(str4)) {
                            str3 = str3.replace(str4, str2);
                        }
                        if (!TextUtils.isEmpty(str5)) {
                            Uri parse2 = Uri.parse(str3);
                            if (TextUtils.isEmpty(parse2.getQueryParameter(str5))) {
                                return parse2.buildUpon().appendQueryParameter(str5, str2).toString();
                            }
                        }
                    }
                    return str3;
                }
            }, zzgcuVar), Throwable.class, new zzful() { // from class: com.google.android.gms.internal.ads.zzbht
                @Override // com.google.android.gms.internal.ads.zzful
                public final Object apply(Object obj) {
                    Throwable th2 = (Throwable) obj;
                    zzbix zzbixVar = zzbiw.zza;
                    if (((Boolean) zzbdr.zzi.zze()).booleanValue()) {
                        com.google.android.gms.ads.internal.zzu.B.f10557g.zzw(th2, "prepareClickUrl.attestation2");
                    }
                    return zzb2;
                }
            }, zzgcuVar);
        }
        return zzgcj.zzh(zzb2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:10|(3:11|12|13)|(12:50|51|16|(10:18|(1:20)|21|(1:23)|24|(1:26)|27|(1:29)|30|(2:32|(1:34)))|35|36|37|(1:39)|40|41|43|44)|15|16|(0)|35|36|37|(0)|40|41|43|44|8) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c8, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c9, code lost:
        com.google.android.gms.ads.internal.zzu.B.f10557g.zzw(r0, r9.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00dd, code lost:
        com.google.android.gms.ads.internal.util.client.zzm.g(6);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void zzb(com.google.android.gms.internal.ads.zzcfq r17, java.util.Map r18) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbiw.zzb(com.google.android.gms.internal.ads.zzcfq, java.util.Map):void");
    }

    public static void zzc(Map map, zzdeq zzdeqVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzjQ)).booleanValue() && map.containsKey(OperatorName.NON_STROKING_COLOR) && ((String) map.get(OperatorName.NON_STROKING_COLOR)).equals("1") && zzdeqVar != null) {
            zzdeqVar.zzdG();
        }
    }
}
