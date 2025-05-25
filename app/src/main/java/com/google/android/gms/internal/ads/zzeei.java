package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzeei implements zzeej {
    public static /* synthetic */ zzeeo zzc(String str, String str2, String str3, zzeek zzeekVar, String str4, WebView webView, String str5, String str6, zzeel zzeelVar) {
        zzfmd zza = zzfmd.zza("Google", str2);
        zzfmc zzp = zzp("javascript");
        zzflv zzn = zzn(zzeekVar.toString());
        zzfmc zzfmcVar = zzfmc.NONE;
        if (zzp == zzfmcVar) {
            com.google.android.gms.ads.internal.util.client.zzm.e("Omid html session error; Unable to parse impression owner: javascript");
            return null;
        } else if (zzn == null) {
            com.google.android.gms.ads.internal.util.client.zzm.e("Omid html session error; Unable to parse creative type: ".concat(String.valueOf(zzeekVar)));
            return null;
        } else {
            zzfmc zzp2 = zzp(str4);
            if (zzn == zzflv.VIDEO && zzp2 == zzfmcVar) {
                com.google.android.gms.ads.internal.util.client.zzm.e("Omid html session error; Video events owner unknown for video creative: ".concat(String.valueOf(str4)));
                return null;
            }
            zzfls zzb = zzfls.zzb(zza, webView, str5, "");
            return new zzeeo(zzflq.zza(zzflr.zza(zzn, zzo(zzeelVar.toString()), zzp, zzp2, true), zzb), zzb);
        }
    }

    public static /* synthetic */ zzeeo zzd(String str, String str2, String str3, String str4, zzeek zzeekVar, WebView webView, String str5, String str6, zzeel zzeelVar) {
        zzfmd zza = zzfmd.zza(str, str2);
        zzfmc zzp = zzp("javascript");
        zzfmc zzp2 = zzp(str4);
        zzflv zzn = zzn(zzeekVar.toString());
        zzfmc zzfmcVar = zzfmc.NONE;
        if (zzp == zzfmcVar) {
            com.google.android.gms.ads.internal.util.client.zzm.e("Omid js session error; Unable to parse impression owner: javascript");
            return null;
        } else if (zzn == null) {
            com.google.android.gms.ads.internal.util.client.zzm.e("Omid js session error; Unable to parse creative type: ".concat(String.valueOf(zzeekVar)));
            return null;
        } else if (zzn == zzflv.VIDEO && zzp2 == zzfmcVar) {
            com.google.android.gms.ads.internal.util.client.zzm.e("Omid js session error; Video events owner unknown for video creative: ".concat(String.valueOf(str4)));
            return null;
        } else {
            zzfls zzc = zzfls.zzc(zza, webView, str5, "");
            return new zzeeo(zzflq.zza(zzflr.zza(zzn, zzo(zzeelVar.toString()), zzp, zzp2, true), zzc), zzc);
        }
    }

    private static zzflv zzn(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode != -382745961) {
            if (hashCode != 112202875) {
                if (hashCode == 714893483 && str.equals("nativeDisplay")) {
                    c = 1;
                }
                c = 65535;
            } else {
                if (str.equals("video")) {
                    c = 2;
                }
                c = 65535;
            }
        } else {
            if (str.equals("htmlDisplay")) {
                c = 0;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    return null;
                }
                return zzflv.VIDEO;
            }
            return zzflv.NATIVE_DISPLAY;
        }
        return zzflv.HTML_DISPLAY;
    }

    private static zzfly zzo(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode != -1104128070) {
            if (hashCode != 1318088141) {
                if (hashCode == 1988248512 && str.equals("onePixel")) {
                    c = 2;
                }
                c = 65535;
            } else {
                if (str.equals("definedByJavascript")) {
                    c = 1;
                }
                c = 65535;
            }
        } else {
            if (str.equals("beginToRender")) {
                c = 0;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    return zzfly.UNSPECIFIED;
                }
                return zzfly.ONE_PIXEL;
            }
            return zzfly.DEFINED_BY_JAVASCRIPT;
        }
        return zzfly.BEGIN_TO_RENDER;
    }

    private static zzfmc zzp(String str) {
        if ("native".equals(str)) {
            return zzfmc.NATIVE;
        }
        if ("javascript".equals(str)) {
            return zzfmc.JAVASCRIPT;
        }
        return zzfmc.NONE;
    }

    private static final Object zzq(zzeeh zzeehVar) {
        try {
            return zzeehVar.zza();
        } catch (RuntimeException e10) {
            com.google.android.gms.ads.internal.zzu.B.f10557g.zzv(e10, "omid exception");
            return null;
        }
    }

    private static final void zzr(Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e10) {
            com.google.android.gms.ads.internal.zzu.B.f10557g.zzv(e10, "omid exception");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeej
    public final zzeeo zza(final String str, final WebView webView, String str2, String str3, final String str4, final zzeel zzeelVar, final zzeek zzeekVar, final String str5) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzez)).booleanValue() && zzflo.zzb()) {
            return (zzeeo) zzq(new zzeeh("Google", str, "javascript", zzeekVar, str4, webView, str5, "", zzeelVar) { // from class: com.google.android.gms.internal.ads.zzedx
                public final /* synthetic */ String zzb;
                public final /* synthetic */ zzeek zzd;
                public final /* synthetic */ String zze;
                public final /* synthetic */ WebView zzf;
                public final /* synthetic */ String zzg;
                public final /* synthetic */ zzeel zzi;
                public final /* synthetic */ String zza = "Google";
                public final /* synthetic */ String zzc = "javascript";
                public final /* synthetic */ String zzh = "";

                {
                    this.zzb = str;
                    this.zzd = zzeekVar;
                    this.zze = str4;
                    this.zzf = webView;
                    this.zzg = str5;
                    this.zzi = zzeelVar;
                }

                @Override // com.google.android.gms.internal.ads.zzeeh
                public final Object zza() {
                    return zzeei.zzc(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
                }
            });
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzeej
    public final zzeeo zzb(final String str, final WebView webView, String str2, String str3, final String str4, final String str5, final zzeel zzeelVar, final zzeek zzeekVar, final String str6) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzez)).booleanValue() && zzflo.zzb()) {
            return (zzeeo) zzq(new zzeeh(str5, str, "javascript", str4, zzeekVar, webView, str6, "", zzeelVar) { // from class: com.google.android.gms.internal.ads.zzeea
                public final /* synthetic */ String zza;
                public final /* synthetic */ String zzb;
                public final /* synthetic */ String zzd;
                public final /* synthetic */ zzeek zze;
                public final /* synthetic */ WebView zzf;
                public final /* synthetic */ String zzg;
                public final /* synthetic */ zzeel zzi;
                public final /* synthetic */ String zzc = "javascript";
                public final /* synthetic */ String zzh = "";

                {
                    this.zzd = str4;
                    this.zze = zzeekVar;
                    this.zzf = webView;
                    this.zzg = str6;
                    this.zzi = zzeelVar;
                }

                @Override // com.google.android.gms.internal.ads.zzeeh
                public final Object zza() {
                    return zzeei.zzd(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
                }
            });
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzeej
    public final zzfmb zze(final VersionInfoParcel versionInfoParcel, final WebView webView, boolean z10) {
        return (zzfmb) zzq(new zzeeh(webView, true) { // from class: com.google.android.gms.internal.ads.zzeef
            public final /* synthetic */ WebView zzb;

            @Override // com.google.android.gms.internal.ads.zzeeh
            public final Object zza() {
                VersionInfoParcel versionInfoParcel2 = VersionInfoParcel.this;
                int i10 = versionInfoParcel2.f10346b;
                return zzfmb.zza(zzfmd.zza("Google", i10 + "." + versionInfoParcel2.c), this.zzb, true);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeej
    public final String zzf(Context context) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzez)).booleanValue()) {
            return null;
        }
        return (String) zzq(new zzeeh() { // from class: com.google.android.gms.internal.ads.zzeed
            @Override // com.google.android.gms.internal.ads.zzeeh
            public final Object zza() {
                return "a.1.4.10-google_20240110";
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeej
    public final void zzg(final zzflq zzflqVar, final View view) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzedw
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzez)).booleanValue() && zzflo.zzb()) {
                    zzflq.this.zzb(view, zzflx.NOT_VISIBLE, "Ad overlay");
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeej
    public final void zzh(final zzfmb zzfmbVar, final View view) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeec
            @Override // java.lang.Runnable
            public final void run() {
                zzfmb.this.zze(view, zzflx.NOT_VISIBLE, "Ad overlay");
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeej
    public final void zzi(final zzflq zzflqVar) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeeg
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzez)).booleanValue() && zzflo.zzb()) {
                    zzflq.this.zzc();
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeej
    public final void zzj(final zzflq zzflqVar, final View view) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzedy
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzez)).booleanValue() && zzflo.zzb()) {
                    zzflq.this.zzd(view);
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeej
    public final void zzk(final zzflq zzflqVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzez)).booleanValue() && zzflo.zzb()) {
            Objects.requireNonNull(zzflqVar);
            zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzedz
                @Override // java.lang.Runnable
                public final void run() {
                    zzflq.this.zze();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeej
    public final boolean zzl(final Context context) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzez)).booleanValue()) {
            com.google.android.gms.ads.internal.util.client.zzm.e("Omid flag is disabled");
            return false;
        }
        Boolean bool = (Boolean) zzq(new zzeeh() { // from class: com.google.android.gms.internal.ads.zzeeb
            @Override // com.google.android.gms.internal.ads.zzeeh
            public final Object zza() {
                if (zzflo.zzb()) {
                    return Boolean.TRUE;
                }
                zzflo.zza(context);
                return Boolean.valueOf(zzflo.zzb());
            }
        });
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzeej
    public final void zzm(final zzfmb zzfmbVar, final zzcey zzceyVar) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeee
            @Override // java.lang.Runnable
            public final void run() {
                zzfmb.this.zzf(zzceyVar);
            }
        });
    }
}
