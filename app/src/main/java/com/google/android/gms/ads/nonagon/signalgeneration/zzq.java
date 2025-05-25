package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.ads.zzbbw;
import com.google.android.gms.internal.ads.zzbzo;
import com.google.android.gms.internal.ads.zzdsp;
import com.google.android.gms.internal.ads.zzffg;
import com.google.android.gms.internal.ads.zzfkl;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public final class zzq {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static zzfkl a(Bundle bundle) {
        char c;
        Bundle bundle2 = bundle.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle2 != null) {
            bundle = bundle2;
        }
        String string = bundle.getString("query_info_type");
        if (TextUtils.isEmpty(string)) {
            return zzfkl.SCAR_REQUEST_TYPE_UNSPECIFIED;
        }
        switch (string.hashCode()) {
            case 1743582862:
                if (string.equals("requester_type_0")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1743582863:
                if (string.equals("requester_type_1")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1743582864:
                if (string.equals("requester_type_2")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1743582865:
                if (string.equals("requester_type_3")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1743582866:
                if (string.equals("requester_type_4")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1743582867:
                if (string.equals("requester_type_5")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1743582868:
                if (string.equals("requester_type_6")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1743582869:
                if (string.equals("requester_type_7")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1743582870:
                if (string.equals("requester_type_8")) {
                    c = '\b';
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
                return zzfkl.SCAR_REQUEST_TYPE_ADMOB;
            case 1:
                return zzfkl.SCAR_REQUEST_TYPE_INBOUND_MEDIATION;
            case 2:
                return zzfkl.SCAR_REQUEST_TYPE_GBID;
            case 3:
                return zzfkl.SCAR_REQUEST_TYPE_GOLDENEYE;
            case 4:
                return zzfkl.SCAR_REQUEST_TYPE_YAVIN;
            case 5:
                return zzfkl.SCAR_REQUEST_TYPE_UNITY;
            case 6:
                return zzfkl.SCAR_REQUEST_TYPE_PAW;
            case 7:
                return zzfkl.SCAR_REQUEST_TYPE_GUILDER;
            case '\b':
                return zzfkl.SCAR_REQUEST_TYPE_GAM_S2S;
            default:
                return zzfkl.SCAR_REQUEST_TYPE_UNSPECIFIED;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static String b(String str) {
        char c;
        if (TextUtils.isEmpty(str)) {
            return "unspecified";
        }
        switch (str.hashCode()) {
            case 1743582862:
                if (str.equals("requester_type_0")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1743582863:
                if (str.equals("requester_type_1")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1743582864:
                if (str.equals("requester_type_2")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1743582865:
                if (str.equals("requester_type_3")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1743582866:
                if (str.equals("requester_type_4")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1743582867:
                if (str.equals("requester_type_5")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1743582868:
                if (str.equals("requester_type_6")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1743582869:
                if (str.equals("requester_type_7")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1743582870:
                if (str.equals("requester_type_8")) {
                    c = '\b';
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
                return PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES;
            case 1:
                return "1";
            case 2:
                return "2";
            case 3:
                return "3";
            case 4:
                return "4";
            case 5:
                return "5";
            case 6:
                return "6";
            case 7:
                return "7";
            case '\b':
                return "8";
            default:
                return str;
        }
    }

    public static String c(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        Bundle bundle;
        if (zzlVar != null && (bundle = zzlVar.c) != null) {
            return bundle.getString("query_info_type");
        }
        return "unspecified";
    }

    public static void d(final zzdsp zzdspVar, final String str, final Pair... pairArr) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzgo)).booleanValue()) {
            return;
        }
        zzbzo.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzp
            @Override // java.lang.Runnable
            public final void run() {
                zzdsp zzdspVar2 = zzdsp.this;
                ConcurrentHashMap zzc = zzdspVar2.zzc();
                if (!TextUtils.isEmpty("action")) {
                    String str2 = str;
                    if (!TextUtils.isEmpty(str2)) {
                        zzc.put("action", str2);
                    }
                }
                int i10 = 0;
                while (true) {
                    Pair[] pairArr2 = pairArr;
                    if (i10 < pairArr2.length) {
                        Pair pair = pairArr2[i10];
                        String str3 = (String) pair.first;
                        String str4 = (String) pair.second;
                        if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                            zzc.put(str3, str4);
                        }
                        i10++;
                    } else {
                        zzdspVar2.zzf(zzc);
                        return;
                    }
                }
            }
        });
    }

    public static int e(zzffg zzffgVar) {
        if (zzffgVar.zzr) {
            return 2;
        }
        com.google.android.gms.ads.internal.client.zzl zzlVar = zzffgVar.zzd;
        com.google.android.gms.ads.internal.client.zzc zzcVar = zzlVar.f10217s;
        String str = zzlVar.f10222x;
        if (zzcVar == null && str == null) {
            return 1;
        }
        if (zzcVar != null && str != null) {
            return 5;
        }
        if (zzcVar != null) {
            return 3;
        }
        return 4;
    }
}
