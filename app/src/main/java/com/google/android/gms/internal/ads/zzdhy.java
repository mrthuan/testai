package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.PlatformVersion;
import com.inmobi.media.C1646h;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdhy implements zzdjj {
    private com.google.android.gms.ads.internal.client.zzcs zzC;
    private final Context zza;
    private final zzdjm zzb;
    private final JSONObject zzc;
    private final zzdoa zzd;
    private final zzdjb zze;
    private final zzauo zzf;
    private final zzcxi zzg;
    private final zzcwo zzh;
    private final zzdeo zzi;
    private final zzfel zzj;
    private final VersionInfoParcel zzk;
    private final zzffg zzl;
    private final zzcof zzm;
    private final zzdkf zzn;
    private final Clock zzo;
    private final zzdek zzp;
    private final zzfll zzq;
    private final zzdpq zzr;
    private final zzfkf zzs;
    private final zzeds zzt;
    private boolean zzv;
    private boolean zzu = false;
    private boolean zzw = false;
    private boolean zzx = false;
    private Point zzy = new Point();
    private Point zzz = new Point();
    private long zzA = 0;
    private long zzB = 0;

    public zzdhy(Context context, zzdjm zzdjmVar, JSONObject jSONObject, zzdoa zzdoaVar, zzdjb zzdjbVar, zzauo zzauoVar, zzcxi zzcxiVar, zzcwo zzcwoVar, zzdeo zzdeoVar, zzfel zzfelVar, VersionInfoParcel versionInfoParcel, zzffg zzffgVar, zzcof zzcofVar, zzdkf zzdkfVar, Clock clock, zzdek zzdekVar, zzfll zzfllVar, zzfkf zzfkfVar, zzeds zzedsVar, zzdpq zzdpqVar) {
        this.zza = context;
        this.zzb = zzdjmVar;
        this.zzc = jSONObject;
        this.zzd = zzdoaVar;
        this.zze = zzdjbVar;
        this.zzf = zzauoVar;
        this.zzg = zzcxiVar;
        this.zzh = zzcwoVar;
        this.zzi = zzdeoVar;
        this.zzj = zzfelVar;
        this.zzk = versionInfoParcel;
        this.zzl = zzffgVar;
        this.zzm = zzcofVar;
        this.zzn = zzdkfVar;
        this.zzo = clock;
        this.zzp = zzdekVar;
        this.zzq = zzfllVar;
        this.zzs = zzfkfVar;
        this.zzt = zzedsVar;
        this.zzr = zzdpqVar;
    }

    private final String zzD(View view) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzdf)).booleanValue()) {
            return null;
        }
        try {
            return this.zzf.zzc().zzh(this.zza, view, null);
        } catch (Exception unused) {
            com.google.android.gms.ads.internal.util.client.zzm.c("Exception getting data.");
            return null;
        }
    }

    private final String zzE(View view, Map map) {
        if (map != null && view != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (view.equals((View) ((WeakReference) entry.getValue()).get())) {
                    return (String) entry.getKey();
                }
            }
        }
        int zzc = this.zze.zzc();
        if (zzc != 1) {
            if (zzc != 2) {
                if (zzc != 6) {
                    return null;
                }
                return "3099";
            }
            return "2099";
        }
        return "1099";
    }

    private final boolean zzF(String str) {
        JSONObject optJSONObject = this.zzc.optJSONObject("allow_pub_event_reporting");
        if (optJSONObject == null || !optJSONObject.optBoolean(str, false)) {
            return false;
        }
        return true;
    }

    private final boolean zzG() {
        return this.zzc.optBoolean("allow_custom_click_gesture", false);
    }

    private final boolean zzH(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, boolean z10) {
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.zzc);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzdf)).booleanValue()) {
                jSONObject6.put("view_signals", str);
            }
            jSONObject6.put("policy_validator_enabled", z10);
            Context context = this.zza;
            JSONObject jSONObject7 = new JSONObject();
            com.google.android.gms.ads.internal.util.zzt zztVar = com.google.android.gms.ads.internal.zzu.B.c;
            DisplayMetrics F = com.google.android.gms.ads.internal.util.zzt.F((WindowManager) context.getSystemService("window"));
            try {
                int i10 = F.widthPixels;
                com.google.android.gms.ads.internal.client.zzay zzayVar = com.google.android.gms.ads.internal.client.zzay.f10107f;
                jSONObject7.put(InMobiNetworkValues.WIDTH, zzayVar.f10108a.f(context, i10));
                jSONObject7.put(InMobiNetworkValues.HEIGHT, zzayVar.f10108a.f(context, F.heightPixels));
            } catch (JSONException unused) {
                jSONObject7 = null;
            }
            jSONObject6.put("screen", jSONObject7);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzhK)).booleanValue()) {
                this.zzd.zzl("/clickRecorded", new zzdhv(this, null));
            } else {
                this.zzd.zzl("/logScionEvent", new zzdht(this, null));
            }
            this.zzd.zzl("/nativeImpression", new zzdhx(this, null));
            zzbzr.zza(this.zzd.zzg("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression");
            if (!this.zzu) {
                this.zzu = com.google.android.gms.ads.internal.zzu.B.f10563m.i(this.zza, this.zzk.f10345a, this.zzj.zzC.toString(), this.zzl.zzf);
                return true;
            }
            return true;
        } catch (JSONException unused2) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjj
    public final boolean zzA() {
        if (zza() != 0) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzkE)).booleanValue()) {
                return this.zzl.zzi.zzj;
            }
            return true;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdjj
    public final boolean zzB() {
        return zzG();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0036  */
    @Override // com.google.android.gms.internal.ads.zzdjj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzC(android.os.Bundle r11) {
        /*
            r10 = this;
            java.lang.String r0 = "impression_reporting"
            boolean r0 = r10.zzF(r0)
            if (r0 != 0) goto Lf
            java.lang.String r11 = "The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events."
            com.google.android.gms.ads.internal.util.client.zzm.c(r11)
            r11 = 0
            return r11
        Lf:
            com.google.android.gms.ads.internal.client.zzay r0 = com.google.android.gms.ads.internal.client.zzay.f10107f
            com.google.android.gms.ads.internal.util.client.zzf r0 = r0.f10108a
            r0.getClass()
            r1 = 0
            if (r11 == 0) goto L23
            org.json.JSONObject r11 = r0.i(r11)     // Catch: org.json.JSONException -> L1f
            r8 = r11
            goto L24
        L1f:
            r11 = 6
            com.google.android.gms.ads.internal.util.client.zzm.g(r11)
        L23:
            r8 = r1
        L24:
            com.google.android.gms.internal.ads.zzbbn r11 = com.google.android.gms.internal.ads.zzbbw.zzkA
            com.google.android.gms.ads.internal.client.zzba r0 = com.google.android.gms.ads.internal.client.zzba.f10115d
            com.google.android.gms.internal.ads.zzbbu r0 = r0.c
            java.lang.Object r11 = r0.zza(r11)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L3a
            java.lang.String r1 = r10.zzD(r1)
        L3a:
            r7 = r1
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r9 = 0
            r2 = r10
            boolean r11 = r2.zzH(r3, r4, r5, r6, r7, r8, r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdhy.zzC(android.os.Bundle):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzdjj
    public final int zza() {
        if (this.zzl.zzi != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzkE)).booleanValue()) {
                return this.zzl.zzi.zzi;
            }
            return 0;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdjj
    public final JSONObject zze(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        Context context = this.zza;
        JSONObject c = com.google.android.gms.ads.internal.util.zzbv.c(context, map, map2, view, scaleType);
        JSONObject f10 = com.google.android.gms.ads.internal.util.zzbv.f(context, view);
        JSONObject e10 = com.google.android.gms.ads.internal.util.zzbv.e(view);
        JSONObject d10 = com.google.android.gms.ads.internal.util.zzbv.d(context, view);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("asset_view_signal", c);
            jSONObject.put("ad_view_signal", f10);
            jSONObject.put("scroll_view_signal", e10);
            jSONObject.put("lock_screen_signal", d10);
            return jSONObject;
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjj
    public final JSONObject zzf(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        JSONObject zze = zze(view, map, map2, scaleType);
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.zzx && zzG()) {
                jSONObject.put("custom_click_gesture_eligible", true);
            }
            if (zze != null) {
                jSONObject.put("nas", zze);
            }
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzdjj
    public final void zzg() {
        try {
            com.google.android.gms.ads.internal.client.zzcs zzcsVar = this.zzC;
            if (zzcsVar != null) {
                zzcsVar.zze();
            }
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.f("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjj
    public final void zzh() {
        if (!this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            return;
        }
        this.zzn.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzdjj
    public final void zzi() {
        this.zzd.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzdjj
    public final void zzj(com.google.android.gms.ads.internal.client.zzcw zzcwVar) {
        try {
            if (this.zzw) {
                return;
            }
            if (zzcwVar == null) {
                zzdjb zzdjbVar = this.zze;
                if (zzdjbVar.zzk() != null) {
                    this.zzw = true;
                    this.zzq.zzc(zzdjbVar.zzk().f10177b, this.zzs);
                    zzg();
                    return;
                }
            }
            this.zzw = true;
            this.zzq.zzc(zzcwVar.zzf(), this.zzs);
            zzg();
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.f("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjj
    public final void zzk(View view, View view2, Map map, Map map2, boolean z10, ImageView.ScaleType scaleType) {
        View view3;
        Context context = this.zza;
        JSONObject c = com.google.android.gms.ads.internal.util.zzbv.c(context, map, map2, view2, scaleType);
        JSONObject f10 = com.google.android.gms.ads.internal.util.zzbv.f(context, view2);
        JSONObject e10 = com.google.android.gms.ads.internal.util.zzbv.e(view2);
        JSONObject d10 = com.google.android.gms.ads.internal.util.zzbv.d(context, view2);
        String zzE = zzE(view, map);
        JSONObject b10 = com.google.android.gms.ads.internal.util.zzbv.b(zzE, context, this.zzz, this.zzy);
        if (true == ((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzdm)).booleanValue()) {
            view3 = view2;
        } else {
            view3 = view;
        }
        zzn(view3, f10, c, e10, d10, zzE, b10, null, z10, false);
    }

    @Override // com.google.android.gms.internal.ads.zzdjj
    public final void zzl(String str) {
        zzn(null, null, null, null, null, str, null, null, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzdjj
    public final void zzm(Bundle bundle) {
        String str;
        if (bundle == null) {
            com.google.android.gms.ads.internal.util.client.zzm.b("Click data is null. No click is reported.");
        } else if (!zzF("click_reporting")) {
            com.google.android.gms.ads.internal.util.client.zzm.c("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
        } else {
            Bundle bundle2 = bundle.getBundle("click_signal");
            JSONObject jSONObject = null;
            if (bundle2 != null) {
                str = bundle2.getString("asset_id");
            } else {
                str = null;
            }
            com.google.android.gms.ads.internal.util.client.zzf zzfVar = com.google.android.gms.ads.internal.client.zzay.f10107f.f10108a;
            zzfVar.getClass();
            try {
                jSONObject = zzfVar.i(bundle);
            } catch (JSONException unused) {
                com.google.android.gms.ads.internal.util.client.zzm.g(6);
            }
            zzn(null, null, null, null, null, str, null, jSONObject, false, false);
        }
    }

    public final void zzn(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        boolean z14;
        String str2;
        try {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("ad", this.zzc);
            jSONObject7.put("asset_view_signal", jSONObject2);
            jSONObject7.put("ad_view_signal", jSONObject);
            jSONObject7.put("click_signal", jSONObject5);
            jSONObject7.put("scroll_view_signal", jSONObject3);
            jSONObject7.put("lock_screen_signal", jSONObject4);
            boolean z15 = false;
            if (this.zzb.zzc(this.zze.zzA()) != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            jSONObject7.put("has_custom_click_handler", z12);
            jSONObject7.put("provided_signals", jSONObject6);
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("asset_id", str);
            jSONObject8.put("template", this.zze.zzc());
            jSONObject8.put("view_aware_api_used", z10);
            zzbes zzbesVar = this.zzl.zzi;
            if (zzbesVar != null && zzbesVar.zzg) {
                z13 = true;
            } else {
                z13 = false;
            }
            jSONObject8.put("custom_mute_requested", z13);
            if (!this.zze.zzH().isEmpty() && this.zze.zzk() != null) {
                z14 = true;
            } else {
                z14 = false;
            }
            jSONObject8.put("custom_mute_enabled", z14);
            if (this.zzn.zza() != null && this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject8.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject8.put("timestamp", this.zzo.a());
            if (this.zzx && zzG()) {
                jSONObject8.put("custom_click_gesture_eligible", true);
            }
            if (z11) {
                jSONObject8.put("is_custom_click_gesture", true);
            }
            if (this.zzb.zzc(this.zze.zzA()) != null) {
                z15 = true;
            }
            jSONObject8.put("has_custom_click_handler", z15);
            String str3 = null;
            try {
                JSONObject optJSONObject = this.zzc.optJSONObject("tracking_urls_and_actions");
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                }
                str2 = this.zzf.zzc().zze(this.zza, optJSONObject.optString("click_string"), view);
            } catch (Exception unused) {
                com.google.android.gms.ads.internal.util.client.zzm.g(6);
                str2 = null;
            }
            jSONObject8.put("click_signals", str2);
            zzbbn zzbbnVar = zzbbw.zzee;
            com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
            if (((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue()) {
                jSONObject8.put("open_chrome_custom_tab", true);
            }
            if (((Boolean) zzbaVar.c.zza(zzbbw.zzhO)).booleanValue() && PlatformVersion.b()) {
                jSONObject8.put("try_fallback_for_deep_link", true);
            }
            if (((Boolean) zzbaVar.c.zza(zzbbw.zzhP)).booleanValue() && PlatformVersion.b()) {
                jSONObject8.put("in_app_link_handling_for_android_11_enabled", true);
            }
            jSONObject7.put(C1646h.CLICK_BEACON, jSONObject8);
            JSONObject jSONObject9 = new JSONObject();
            long a10 = this.zzo.a();
            jSONObject9.put("time_from_last_touch_down", a10 - this.zzA);
            jSONObject9.put("time_from_last_touch", a10 - this.zzB);
            jSONObject7.put("touch_signal", jSONObject9);
            if (this.zzj.zzai) {
                JSONObject jSONObject10 = (JSONObject) this.zzc.get("tracking_urls_and_actions");
                if (jSONObject10 != null) {
                    str3 = jSONObject10.getString("gws_query_id");
                }
                if (str3 != null) {
                    this.zzt.zzq(str3, this.zze);
                }
            }
            zzbzr.zza(this.zzd.zzg("google.afma.nativeAds.handleClick", jSONObject7), "Error during performing handleClick");
        } catch (JSONException unused2) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjj
    public final void zzo(View view, View view2, Map map, Map map2, boolean z10, ImageView.ScaleType scaleType, int i10) {
        JSONObject jSONObject;
        Point point;
        Point point2;
        JSONObject jSONObject2;
        boolean z11 = false;
        if (this.zzc.optBoolean("allow_sdk_custom_click_gesture", false)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzkE)).booleanValue()) {
                z11 = true;
            }
        }
        if (!z11) {
            if (!this.zzx) {
                com.google.android.gms.ads.internal.util.client.zzm.b("Custom click reporting failed. enableCustomClickGesture is not set.");
                return;
            } else if (!zzG()) {
                com.google.android.gms.ads.internal.util.client.zzm.b("Custom click reporting failed. Ad unit id not in the allow list.");
                return;
            }
        }
        JSONObject c = com.google.android.gms.ads.internal.util.zzbv.c(this.zza, map, map2, view2, scaleType);
        JSONObject f10 = com.google.android.gms.ads.internal.util.zzbv.f(this.zza, view2);
        JSONObject e10 = com.google.android.gms.ads.internal.util.zzbv.e(view2);
        JSONObject d10 = com.google.android.gms.ads.internal.util.zzbv.d(this.zza, view2);
        String zzE = zzE(view, map);
        JSONObject b10 = com.google.android.gms.ads.internal.util.zzbv.b(zzE, this.zza, this.zzz, this.zzy);
        if (z11) {
            try {
                jSONObject = this.zzc;
                point = this.zzz;
                point2 = this.zzy;
                try {
                    jSONObject2 = new JSONObject();
                } catch (Exception unused) {
                    jSONObject2 = null;
                }
            } catch (JSONException e11) {
                com.google.android.gms.ads.internal.util.client.zzm.g(6);
                com.google.android.gms.ads.internal.zzu.B.f10557g.zzw(e11, "FirstPartyNativeAdCore.performCustomClickGesture");
            }
            try {
                JSONObject jSONObject3 = new JSONObject();
                JSONObject jSONObject4 = new JSONObject();
                if (point != null) {
                    jSONObject3.put("x", point.x);
                    jSONObject3.put(OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, point.y);
                }
                if (point2 != null) {
                    jSONObject4.put("x", point2.x);
                    jSONObject4.put(OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, point2.y);
                }
                jSONObject2.put("start_point", jSONObject3);
                jSONObject2.put("end_point", jSONObject4);
                jSONObject2.put("duration_ms", i10);
            } catch (Exception unused2) {
                com.google.android.gms.ads.internal.util.client.zzm.g(6);
                jSONObject.put("custom_click_gesture_signal", jSONObject2);
                zzn(view2, f10, c, e10, d10, zzE, b10, null, z10, true);
            }
            jSONObject.put("custom_click_gesture_signal", jSONObject2);
        }
        zzn(view2, f10, c, e10, d10, zzE, b10, null, z10, true);
    }

    @Override // com.google.android.gms.internal.ads.zzdjj
    public final void zzp() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.zzc);
            zzbzr.zza(this.zzd.zzg("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression");
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjj
    public final void zzq(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        Context context = this.zza;
        zzH(com.google.android.gms.ads.internal.util.zzbv.f(context, view), com.google.android.gms.ads.internal.util.zzbv.c(context, map, map2, view, scaleType), com.google.android.gms.ads.internal.util.zzbv.e(view), com.google.android.gms.ads.internal.util.zzbv.d(context, view), zzD(view), null, com.google.android.gms.ads.internal.util.zzbv.g(context, this.zzj));
    }

    @Override // com.google.android.gms.internal.ads.zzdjj
    public final void zzr() {
        zzH(null, null, null, null, null, null, false);
    }

    @Override // com.google.android.gms.internal.ads.zzdjj
    public final void zzs(View view, MotionEvent motionEvent, View view2) {
        int[] iArr = new int[2];
        if (view2 != null) {
            view2.getLocationOnScreen(iArr);
        }
        this.zzy = new Point(((int) motionEvent.getRawX()) - iArr[0], ((int) motionEvent.getRawY()) - iArr[1]);
        long a10 = this.zzo.a();
        this.zzB = a10;
        if (motionEvent.getAction() == 0) {
            this.zzr.zzb(motionEvent);
            this.zzA = a10;
            this.zzz = this.zzy;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        Point point = this.zzy;
        obtain.setLocation(point.x, point.y);
        this.zzf.zzd(obtain);
        obtain.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzdjj
    public final void zzt(Bundle bundle) {
        if (bundle == null) {
            com.google.android.gms.ads.internal.util.client.zzm.b("Touch event data is null. No touch event is reported.");
        } else if (!zzF("touch_reporting")) {
            com.google.android.gms.ads.internal.util.client.zzm.c("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
        } else {
            int i10 = bundle.getInt("duration_ms");
            this.zzf.zzc().zzl((int) bundle.getFloat("x"), (int) bundle.getFloat(OperatorName.CURVE_TO_REPLICATE_FINAL_POINT), i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjj
    public final void zzu(View view) {
        if (!this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            com.google.android.gms.ads.internal.util.client.zzm.e("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        zzdkf zzdkfVar = this.zzn;
        if (view == null) {
            return;
        }
        view.setOnClickListener(zzdkfVar);
        view.setClickable(true);
        zzdkfVar.zzc = new WeakReference(view);
    }

    @Override // com.google.android.gms.internal.ads.zzdjj
    public final void zzv() {
        this.zzx = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdjj
    public final void zzw(com.google.android.gms.ads.internal.client.zzcs zzcsVar) {
        this.zzC = zzcsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdjj
    public final void zzx(zzbgx zzbgxVar) {
        if (!this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            com.google.android.gms.ads.internal.util.client.zzm.e("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
        } else {
            this.zzn.zzc(zzbgxVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjj
    public final void zzy(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        this.zzy = new Point();
        this.zzz = new Point();
        if (!this.zzv) {
            this.zzp.zza(view);
            this.zzv = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        this.zzm.zzi(this);
        boolean h10 = com.google.android.gms.ads.internal.util.zzbv.h(this.zzk.c);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                View view2 = (View) ((WeakReference) entry.getValue()).get();
                if (view2 != null) {
                    if (h10) {
                        view2.setOnTouchListener(onTouchListener);
                    }
                    view2.setClickable(true);
                    view2.setOnClickListener(onClickListener);
                }
            }
        }
        if (map2 != null) {
            for (Map.Entry entry2 : map2.entrySet()) {
                View view3 = (View) ((WeakReference) entry2.getValue()).get();
                if (view3 != null) {
                    if (h10) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjj
    public final void zzz(View view, Map map) {
        this.zzy = new Point();
        this.zzz = new Point();
        if (view != null) {
            this.zzp.zzb(view);
        }
        this.zzv = false;
    }
}
