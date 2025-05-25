package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import lib.zj.pdfeditor.Annotation;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbjj implements zzbix {
    private final com.google.android.gms.ads.internal.zzb zza;
    private final zzdsk zzb;
    private final zzbrk zzd;
    private final zzedh zze;
    private final zzcni zzf;
    private com.google.android.gms.ads.internal.overlay.zzy zzg = null;
    private final zzgcu zzh = zzbzo.zzf;
    private final com.google.android.gms.ads.internal.util.client.zzr zzc = new com.google.android.gms.ads.internal.util.client.zzr(null);

    public zzbjj(com.google.android.gms.ads.internal.zzb zzbVar, zzbrk zzbrkVar, zzedh zzedhVar, zzdsk zzdskVar, zzcni zzcniVar) {
        this.zza = zzbVar;
        this.zzd = zzbrkVar;
        this.zze = zzedhVar;
        this.zzb = zzdskVar;
        this.zzf = zzcniVar;
    }

    public static int zzb(Map map) {
        String str = (String) map.get("o");
        if (str != null) {
            if ("p".equalsIgnoreCase(str)) {
                return 7;
            }
            if (OperatorName.LINE_TO.equalsIgnoreCase(str)) {
                return 6;
            }
            if ("c".equalsIgnoreCase(str)) {
                return 14;
            }
            return -1;
        }
        return -1;
    }

    public static Uri zzc(Context context, zzauo zzauoVar, Uri uri, View view, Activity activity, zzffk zzffkVar) {
        if (zzauoVar == null) {
            return uri;
        }
        try {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzla)).booleanValue() && zzffkVar != null) {
                if (zzauoVar.zze(uri)) {
                    uri = zzffkVar.zza(uri, context, view, activity);
                }
            } else if (zzauoVar.zze(uri)) {
                uri = zzauoVar.zza(uri, context, view, activity);
            }
        } catch (zzaup unused) {
        } catch (Exception e10) {
            com.google.android.gms.ads.internal.zzu.B.f10557g.zzw(e10, "OpenGmsgHandler.maybeAddClickSignalsToUri");
        }
        return uri;
    }

    public static Uri zzd(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
        } catch (UnsupportedOperationException unused) {
            "Error adding click uptime parameter to url: ".concat(String.valueOf(uri.toString()));
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
        }
        return uri;
    }

    public static boolean zzf(Map map) {
        return "1".equals(map.get("custom_close"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzh(String str, com.google.android.gms.ads.internal.client.zza zzaVar, Map map, String str2) {
        String str3;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        Object obj;
        HashMap hashMap;
        Object obj2;
        boolean z15;
        String str4;
        boolean z16;
        zzcej zzcejVar = (zzcej) zzaVar;
        zzfel zzD = zzcejVar.zzD();
        zzfeo zzR = zzcejVar.zzR();
        boolean z17 = false;
        if (zzD == null || zzR == null) {
            str3 = "";
            z10 = false;
        } else {
            String str5 = zzR.zzb;
            z10 = zzD.zzai;
            str3 = str5;
        }
        zzbbn zzbbnVar = zzbbw.zzjP;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
        if (((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue() && map.containsKey(OperatorName.NON_STROKING_COLOR) && ((String) map.get(OperatorName.NON_STROKING_COLOR)).equals(PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES)) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (((Boolean) zzbaVar.c.zza(zzbbw.zzlM)).booleanValue() && map.containsKey("ig_cl") && ((String) map.get("ig_cl")).equals("true")) {
            z12 = true;
        } else {
            z12 = false;
        }
        if ("expand".equalsIgnoreCase(str2)) {
            if (zzcejVar.zzaF()) {
                com.google.android.gms.ads.internal.util.client.zzm.e("Cannot expand WebView that is already expanded.");
                return;
            }
            zzk(false);
            ((zzcft) zzaVar).zzaL(zzf(map), zzb(map), z11);
        } else if ("webapp".equalsIgnoreCase(str2)) {
            zzk(false);
            if (((Boolean) zzbaVar.c.zza(zzbbw.zzkV)).booleanValue() && Objects.equals(map.get("is_allowed_for_lock_screen"), "1")) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (str != null) {
                ((zzcft) zzaVar).zzaN(zzf(map), zzb(map), str, z11, z16);
            } else {
                ((zzcft) zzaVar).zzaM(zzf(map), zzb(map), (String) map.get("html"), (String) map.get("baseurl"), z11);
            }
        } else if ("chrome_custom_tab".equalsIgnoreCase(str2)) {
            zzcejVar.getContext();
            if (((Boolean) zzbaVar.c.zza(zzbbw.zzeb)).booleanValue()) {
                if (((Boolean) zzbaVar.c.zza(zzbbw.zzef)).booleanValue()) {
                    com.google.android.gms.ads.internal.util.zze.h("User opt out chrome custom tab.");
                } else {
                    z17 = true;
                }
            }
            boolean zzg = zzbct.zzg(zzcejVar.getContext());
            if (z17) {
                if (!zzg) {
                    zzm(4);
                } else {
                    zzk(true);
                    if (TextUtils.isEmpty(str)) {
                        com.google.android.gms.ads.internal.util.client.zzm.e("Cannot open browser with null or empty url");
                        zzm(7);
                        return;
                    }
                    Uri zzd = zzd(zzc(zzcejVar.getContext(), zzcejVar.zzI(), Uri.parse(str), zzcejVar.zzF(), zzcejVar.zzi(), zzcejVar.zzS()));
                    if (!z10 || this.zze == null || !zzl(zzaVar, zzcejVar.getContext(), zzd.toString(), str3)) {
                        this.zzg = new zzbjg(this);
                        ((zzcft) zzaVar).zzaJ(new com.google.android.gms.ads.internal.overlay.zzc(null, zzd.toString(), null, null, null, null, null, null, new ObjectWrapper(this.zzg).asBinder(), true), z11, z12);
                        return;
                    }
                    return;
                }
            }
            map.put("use_first_package", "true");
            map.put("use_running_process", "true");
            zzj(zzaVar, map, z10, str3, z11, z12);
        } else if ("app".equalsIgnoreCase(str2) && "true".equalsIgnoreCase((String) map.get("system_browser"))) {
            zzj(zzaVar, map, z10, str3, z11, z12);
        } else if ("open_app".equalsIgnoreCase(str2)) {
            if (((Boolean) zzbaVar.c.zza(zzbbw.zzht)).booleanValue()) {
                zzk(true);
                String str6 = (String) map.get("p");
                if (str6 == null) {
                    com.google.android.gms.ads.internal.util.client.zzm.e("Package name missing from open app action.");
                } else if (!z10 || this.zze == null || !zzl(zzaVar, zzcejVar.getContext(), str6, str3)) {
                    PackageManager packageManager = zzcejVar.getContext().getPackageManager();
                    if (packageManager == null) {
                        com.google.android.gms.ads.internal.util.client.zzm.e("Cannot get package manager from open app action.");
                        return;
                    }
                    Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str6);
                    if (launchIntentForPackage != null) {
                        ((zzcft) zzaVar).zzaJ(new com.google.android.gms.ads.internal.overlay.zzc(launchIntentForPackage, this.zzg), z11, z12);
                    }
                }
            }
        } else {
            zzk(true);
            String str7 = (String) map.get("intent_url");
            Intent intent = null;
            if (!TextUtils.isEmpty(str7)) {
                try {
                    intent = Intent.parseUri(str7, 0);
                } catch (URISyntaxException unused) {
                    "Error parsing the url: ".concat(String.valueOf(str7));
                    com.google.android.gms.ads.internal.util.client.zzm.g(6);
                }
            }
            Intent intent2 = intent;
            if (intent2 != null && intent2.getData() != null) {
                Uri data = intent2.getData();
                if (!Uri.EMPTY.equals(data)) {
                    Uri zzd2 = zzd(zzc(zzcejVar.getContext(), zzcejVar.zzI(), data, zzcejVar.zzF(), zzcejVar.zzi(), zzcejVar.zzS()));
                    if (!TextUtils.isEmpty(intent2.getType())) {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzhu)).booleanValue()) {
                            intent2.setDataAndType(zzd2, intent2.getType());
                        }
                    }
                    intent2.setData(zzd2);
                }
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzhM)).booleanValue() && "intent_async".equalsIgnoreCase(str2) && map.containsKey("event_id")) {
                z13 = true;
            } else {
                z13 = false;
            }
            HashMap hashMap2 = new HashMap();
            if (z13) {
                obj = "p";
                obj2 = "event_id";
                z14 = z12;
                hashMap = hashMap2;
                this.zzg = new zzbjh(this, z11, zzaVar, hashMap2, map);
                z15 = false;
            } else {
                z14 = z12;
                obj = "p";
                hashMap = hashMap2;
                obj2 = "event_id";
                z15 = z11;
            }
            if (intent2 != null) {
                if (z10 && this.zze != null && zzl(zzaVar, zzcejVar.getContext(), intent2.getData().toString(), str3)) {
                    if (z13) {
                        hashMap.put((String) map.get(obj2), Boolean.TRUE);
                        ((zzbls) zzaVar).zzd("openIntentAsync", hashMap);
                        return;
                    }
                    return;
                }
                ((zzcft) zzaVar).zzaJ(new com.google.android.gms.ads.internal.overlay.zzc(intent2, this.zzg), z15, z14);
                return;
            }
            boolean z18 = z14;
            if (!TextUtils.isEmpty(str)) {
                str4 = zzd(zzc(zzcejVar.getContext(), zzcejVar.zzI(), Uri.parse(str), zzcejVar.zzF(), zzcejVar.zzi(), zzcejVar.zzS())).toString();
            } else {
                str4 = str;
            }
            if (z10 && this.zze != null && zzl(zzaVar, zzcejVar.getContext(), str4, str3)) {
                if (z13) {
                    hashMap.put((String) map.get(obj2), Boolean.TRUE);
                    ((zzbls) zzaVar).zzd("openIntentAsync", hashMap);
                    return;
                }
                return;
            }
            ((zzcft) zzaVar).zzaJ(new com.google.android.gms.ads.internal.overlay.zzc((String) map.get(OperatorName.SET_FLATNESS), str4, (String) map.get("m"), (String) map.get(obj), (String) map.get("c"), (String) map.get("f"), (String) map.get(Annotation.KEY_E), this.zzg), z15, z18);
        }
    }

    private final void zzi(Context context, String str, String str2) {
        this.zze.zzc(str);
        zzdsk zzdskVar = this.zzb;
        if (zzdskVar != null) {
            zzeds.zzd(context, zzdskVar, this.zze, str, "dialog_not_shown", zzfxu.zze("dialog_not_shown_reason", str2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0105, code lost:
        if (com.google.android.gms.internal.ads.zzbji.zzc(r2, r11, r12, r13, r14) == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0152, code lost:
        r21 = r6;
        r10 = r15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzj(com.google.android.gms.ads.internal.client.zza r20, java.util.Map r21, boolean r22, java.lang.String r23, boolean r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbjj.zzj(com.google.android.gms.ads.internal.client.zza, java.util.Map, boolean, java.lang.String, boolean, boolean):void");
    }

    private final void zzk(boolean z10) {
        zzbrk zzbrkVar = this.zzd;
        if (zzbrkVar != null) {
            zzbrkVar.zza(z10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b0, code lost:
        if (r5 != false) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean zzl(com.google.android.gms.ads.internal.client.zza r10, android.content.Context r11, java.lang.String r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbjj.zzl(com.google.android.gms.ads.internal.client.zza, android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzm(int i10) {
        String str;
        zzdsk zzdskVar = this.zzb;
        if (zzdskVar == null) {
            return;
        }
        zzdsj zza = zzdskVar.zza();
        zza.zzb("action", "cct_action");
        switch (i10) {
            case 2:
                str = "CONTEXT_NOT_AN_ACTIVITY";
                break;
            case 3:
                str = "CONTEXT_NULL";
                break;
            case 4:
                str = "CCT_NOT_SUPPORTED";
                break;
            case 5:
                str = "CCT_READY_TO_OPEN";
                break;
            case 6:
                str = "ACTIVITY_NOT_FOUND";
                break;
            case 7:
                str = "EMPTY_URL";
                break;
            case 8:
                str = "UNKNOWN";
                break;
            default:
                str = "WRONG_EXP_SETUP";
                break;
        }
        zza.zzb("cct_open_status", str);
        zza.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzbix
    public final void zza(Object obj, Map map) {
        y9.a zzh;
        com.google.android.gms.ads.internal.client.zza zzaVar = (com.google.android.gms.ads.internal.client.zza) obj;
        String str = (String) map.get("u");
        Map hashMap = new HashMap();
        zzcej zzcejVar = (zzcej) zzaVar;
        if (zzcejVar.zzD() != null) {
            hashMap = zzcejVar.zzD().zzaw;
        }
        String zzc = zzbyc.zzc(str, zzcejVar.getContext(), true, hashMap);
        String str2 = (String) map.get("a");
        if (str2 == null) {
            com.google.android.gms.ads.internal.util.client.zzm.e("Action missing from an open GMSG.");
            return;
        }
        com.google.android.gms.ads.internal.zzb zzbVar = this.zza;
        if (zzbVar != null && !zzbVar.b()) {
            this.zza.a(zzc);
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzjg)).booleanValue() && this.zzf != null && zzcni.zzj(zzc)) {
            zzh = this.zzf.zzb(zzc, com.google.android.gms.ads.internal.client.zzay.f10107f.f10111e);
        } else {
            zzh = zzgcj.zzh(zzc);
        }
        zzgcj.zzr(zzh, new zzbjf(this, map, zzaVar, str2), this.zzh);
    }
}
