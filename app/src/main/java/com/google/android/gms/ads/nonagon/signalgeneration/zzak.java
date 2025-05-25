package com.google.android.gms.ads.nonagon.signalgeneration;

import a6.h;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.android.billingclient.api.a0;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzbv;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzauo;
import com.google.android.gms.internal.ads.zzaup;
import com.google.android.gms.internal.ads.zzbbn;
import com.google.android.gms.internal.ads.zzbbu;
import com.google.android.gms.internal.ads.zzbbw;
import com.google.android.gms.internal.ads.zzbcx;
import com.google.android.gms.internal.ads.zzbdl;
import com.google.android.gms.internal.ads.zzbdx;
import com.google.android.gms.internal.ads.zzbtc;
import com.google.android.gms.internal.ads.zzbtl;
import com.google.android.gms.internal.ads.zzbyj;
import com.google.android.gms.internal.ads.zzbyl;
import com.google.android.gms.internal.ads.zzbyq;
import com.google.android.gms.internal.ads.zzbzo;
import com.google.android.gms.internal.ads.zzcgj;
import com.google.android.gms.internal.ads.zzcvy;
import com.google.android.gms.internal.ads.zzdci;
import com.google.android.gms.internal.ads.zzdoa;
import com.google.android.gms.internal.ads.zzdrt;
import com.google.android.gms.internal.ads.zzdsp;
import com.google.android.gms.internal.ads.zzffe;
import com.google.android.gms.internal.ads.zzffk;
import com.google.android.gms.internal.ads.zzfgf;
import com.google.android.gms.internal.ads.zzfjt;
import com.google.android.gms.internal.ads.zzfju;
import com.google.android.gms.internal.ads.zzfkf;
import com.google.android.gms.internal.ads.zzfki;
import com.google.android.gms.internal.ads.zzfll;
import com.google.android.gms.internal.ads.zzful;
import com.google.android.gms.internal.ads.zzfvj;
import com.google.android.gms.internal.ads.zzgbp;
import com.google.android.gms.internal.ads.zzgbq;
import com.google.android.gms.internal.ads.zzgca;
import com.google.android.gms.internal.ads.zzgcj;
import com.google.android.gms.internal.ads.zzgcu;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public final class zzak extends zzbyl {
    public static final ArrayList F = new ArrayList(Arrays.asList("/aclk", "/pcs/click", "/dbm/clk"));
    public static final ArrayList G = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));
    public static final ArrayList H = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"));
    public static final ArrayList I = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));
    public final zzbcx D;
    public final zze E;

    /* renamed from: a  reason: collision with root package name */
    public final zzcgj f10645a;

    /* renamed from: b  reason: collision with root package name */
    public Context f10646b;
    public final zzauo c;

    /* renamed from: d  reason: collision with root package name */
    public final zzffk f10647d;

    /* renamed from: e  reason: collision with root package name */
    public final zzfgf f10648e;

    /* renamed from: f  reason: collision with root package name */
    public final zzgcu f10649f;

    /* renamed from: g  reason: collision with root package name */
    public final ScheduledExecutorService f10650g;

    /* renamed from: h  reason: collision with root package name */
    public zzbtl f10651h;

    /* renamed from: k  reason: collision with root package name */
    public final zzdsp f10654k;

    /* renamed from: l  reason: collision with root package name */
    public final zzfll f10655l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f10656m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f10657n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f10658o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f10659p;

    /* renamed from: q  reason: collision with root package name */
    public final String f10660q;

    /* renamed from: r  reason: collision with root package name */
    public final String f10661r;

    /* renamed from: t  reason: collision with root package name */
    public final VersionInfoParcel f10663t;

    /* renamed from: u  reason: collision with root package name */
    public String f10664u;

    /* renamed from: v  reason: collision with root package name */
    public final String f10665v;

    /* renamed from: w  reason: collision with root package name */
    public final ArrayList f10666w;

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList f10667x;

    /* renamed from: y  reason: collision with root package name */
    public final ArrayList f10668y;

    /* renamed from: z  reason: collision with root package name */
    public final ArrayList f10669z;

    /* renamed from: i  reason: collision with root package name */
    public Point f10652i = new Point();

    /* renamed from: j  reason: collision with root package name */
    public Point f10653j = new Point();

    /* renamed from: s  reason: collision with root package name */
    public final AtomicInteger f10662s = new AtomicInteger(0);
    public final AtomicBoolean A = new AtomicBoolean(false);
    public final AtomicBoolean B = new AtomicBoolean(false);
    public final AtomicInteger C = new AtomicInteger(0);

    public zzak(zzcgj zzcgjVar, Context context, zzauo zzauoVar, zzfgf zzfgfVar, zzgcu zzgcuVar, ScheduledExecutorService scheduledExecutorService, zzdsp zzdspVar, zzfll zzfllVar, VersionInfoParcel versionInfoParcel, zzbcx zzbcxVar, zzffk zzffkVar, zze zzeVar) {
        ArrayList arrayList;
        this.f10645a = zzcgjVar;
        this.f10646b = context;
        this.c = zzauoVar;
        this.f10647d = zzffkVar;
        this.f10648e = zzfgfVar;
        this.f10649f = zzgcuVar;
        this.f10650g = scheduledExecutorService;
        this.f10654k = zzdspVar;
        this.f10655l = zzfllVar;
        this.f10663t = versionInfoParcel;
        this.D = zzbcxVar;
        zzbbn zzbbnVar = zzbbw.zzgx;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
        this.f10656m = ((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue();
        zzbbn zzbbnVar2 = zzbbw.zzgw;
        zzbbu zzbbuVar = zzbaVar.c;
        this.f10657n = ((Boolean) zzbbuVar.zza(zzbbnVar2)).booleanValue();
        this.f10658o = ((Boolean) zzbbuVar.zza(zzbbw.zzgz)).booleanValue();
        this.f10659p = ((Boolean) zzbbuVar.zza(zzbbw.zzgB)).booleanValue();
        this.f10660q = (String) zzbbuVar.zza(zzbbw.zzgA);
        this.f10661r = (String) zzbbuVar.zza(zzbbw.zzgC);
        this.f10665v = (String) zzbbuVar.zza(zzbbw.zzgD);
        this.E = zzeVar;
        if (((Boolean) zzbbuVar.zza(zzbbw.zzgE)).booleanValue()) {
            this.f10666w = S0((String) zzbbuVar.zza(zzbbw.zzgF));
            this.f10667x = S0((String) zzbbuVar.zza(zzbbw.zzgG));
            this.f10668y = S0((String) zzbbuVar.zza(zzbbw.zzgH));
            arrayList = S0((String) zzbbuVar.zza(zzbbw.zzgI));
        } else {
            this.f10666w = F;
            this.f10667x = G;
            this.f10668y = H;
            arrayList = I;
        }
        this.f10669z = arrayList;
    }

    public static boolean Q0(Uri uri, ArrayList arrayList, ArrayList arrayList2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (host != null && path != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (path.contains((String) it.next())) {
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        if (host.endsWith((String) it2.next())) {
                            return true;
                        }
                    }
                    continue;
                }
            }
            return false;
        }
        return false;
    }

    public static final Uri R0(Uri uri, String str, String str2) {
        String uri2 = uri.toString();
        int indexOf = uri2.indexOf("&adurl=");
        if (indexOf == -1) {
            indexOf = uri2.indexOf("?adurl=");
        }
        if (indexOf != -1) {
            int i10 = indexOf + 1;
            StringBuilder sb2 = new StringBuilder(uri2.substring(0, i10));
            h.l(sb2, str, "=", str2, "&");
            sb2.append(uri2.substring(i10));
            return Uri.parse(sb2.toString());
        }
        return uri.buildUpon().appendQueryParameter(str, str2).build();
    }

    public static final ArrayList S0(String str) {
        String[] split = TextUtils.split(str, ",");
        ArrayList arrayList = new ArrayList();
        for (String str2 : split) {
            if (!zzfvj.zzd(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    public static zzfkf T0(y9.a aVar, zzbyq zzbyqVar) {
        String str;
        if (!zzfki.zza() || !((Boolean) zzbdl.zze.zze()).booleanValue()) {
            return null;
        }
        try {
            zzfkf zza = ((zzs) zzgcj.zzp(aVar)).zza();
            zza.zzd(new ArrayList(Collections.singletonList(zzbyqVar.zzb)));
            com.google.android.gms.ads.internal.client.zzl zzlVar = zzbyqVar.zzd;
            if (zzlVar == null) {
                str = "";
            } else {
                str = zzlVar.f10214p;
            }
            zza.zzb(str);
            zza.zzf(zzbyqVar.zzd.f10211m);
            return zza;
        } catch (ExecutionException e10) {
            com.google.android.gms.ads.internal.zzu.B.f10557g.zzw(e10, "SignalGeneratorImpl.getConfiguredCriticalUserJourney");
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final zzs K(Context context, String str, String str2, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, Bundle bundle) {
        String str3;
        com.google.android.gms.ads.internal.client.zzl zzlVar2;
        com.google.android.gms.ads.internal.client.zzq zzqVar2;
        char c;
        zzffe zzffeVar = new zzffe();
        if ("REWARDED".equals(str2)) {
            zzffeVar.zzp().zza(2);
        } else if ("REWARDED_INTERSTITIAL".equals(str2)) {
            zzffeVar.zzp().zza(3);
        }
        zzr zzp = this.f10645a.zzp();
        zzcvy zzcvyVar = new zzcvy();
        zzcvyVar.zze(context);
        if (str == null) {
            str3 = "adUnitId";
        } else {
            str3 = str;
        }
        zzffeVar.zzt(str3);
        if (zzlVar == null) {
            zzlVar2 = new com.google.android.gms.ads.internal.client.zzm().a();
        } else {
            zzlVar2 = zzlVar;
        }
        zzffeVar.zzH(zzlVar2);
        if (zzqVar == null) {
            switch (str2.hashCode()) {
                case -1999289321:
                    if (str2.equals("NATIVE")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -428325382:
                    if (str2.equals("APP_OPEN_AD")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 543046670:
                    if (str2.equals("REWARDED")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1854800829:
                    if (str2.equals("REWARDED_INTERSTITIAL")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 1951953708:
                    if (str2.equals("BANNER")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c != 0) {
                if (c != 1 && c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            zzqVar2 = new com.google.android.gms.ads.internal.client.zzq();
                        } else {
                            zzqVar2 = com.google.android.gms.ads.internal.client.zzq.d();
                        }
                    } else {
                        zzqVar2 = com.google.android.gms.ads.internal.client.zzq.f();
                    }
                } else {
                    zzqVar2 = new com.google.android.gms.ads.internal.client.zzq("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
                }
            } else {
                zzqVar2 = new com.google.android.gms.ads.internal.client.zzq(context, AdSize.f10014i);
            }
        } else {
            zzqVar2 = zzqVar;
        }
        zzffeVar.zzs(zzqVar2);
        zzffeVar.zzz(true);
        zzffeVar.zzA(bundle);
        zzcvyVar.zzi(zzffeVar.zzJ());
        zzp.zza(zzcvyVar.zzj());
        zzan zzanVar = new zzan();
        zzanVar.f10680a = str2;
        zzp.zzb(new zzap(zzanVar));
        new zzdci();
        return zzp.zzc();
    }

    public final y9.a L0(final String str) {
        final zzdoa[] zzdoaVarArr = new zzdoa[1];
        y9.a zza = this.f10648e.zza();
        zzgbq zzgbqVar = new zzgbq() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzv
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final y9.a zza(Object obj) {
                zzdoa zzdoaVar = (zzdoa) obj;
                zzak zzakVar = zzak.this;
                zzakVar.getClass();
                zzdoaVarArr[0] = zzdoaVar;
                Context context = zzakVar.f10646b;
                zzbtl zzbtlVar = zzakVar.f10651h;
                Map map = zzbtlVar.zzb;
                JSONObject c = zzbv.c(context, map, map, zzbtlVar.zza, null);
                JSONObject f10 = zzbv.f(zzakVar.f10646b, zzakVar.f10651h.zza);
                JSONObject e10 = zzbv.e(zzakVar.f10651h.zza);
                JSONObject d10 = zzbv.d(zzakVar.f10646b, zzakVar.f10651h.zza);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("asset_view_signal", c);
                jSONObject.put("ad_view_signal", f10);
                jSONObject.put("scroll_view_signal", e10);
                jSONObject.put("lock_screen_signal", d10);
                String str2 = str;
                if ("google.afma.nativeAds.getPublisherCustomRenderedClickSignals".equals(str2)) {
                    jSONObject.put("click_signal", zzbv.b(null, zzakVar.f10646b, zzakVar.f10653j, zzakVar.f10652i));
                }
                return zzdoaVar.zzg(str2, jSONObject);
            }
        };
        zzgcu zzgcuVar = this.f10649f;
        y9.a zzn = zzgcj.zzn(zza, zzgbqVar, zzgcuVar);
        zzn.addListener(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzw
            @Override // java.lang.Runnable
            public final void run() {
                zzak zzakVar = zzak.this;
                zzakVar.getClass();
                zzdoa zzdoaVar = zzdoaVarArr[0];
                if (zzdoaVar != null) {
                    zzakVar.f10648e.zzb(zzgcj.zzh(zzdoaVar));
                }
            }
        }, zzgcuVar);
        return zzgcj.zze(zzgcj.zzm((zzgca) zzgcj.zzo(zzgca.zzu(zzn), ((Integer) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzgP)).intValue(), TimeUnit.MILLISECONDS, this.f10650g), new zzful() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzac
            @Override // com.google.android.gms.internal.ads.zzful
            public final Object apply(Object obj) {
                ArrayList arrayList = zzak.F;
                return ((JSONObject) obj).optString("nas");
            }
        }, zzgcuVar), Exception.class, new zzful() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzad
            @Override // com.google.android.gms.internal.ads.zzful
            public final Object apply(Object obj) {
                Exception exc = (Exception) obj;
                ArrayList arrayList = zzak.F;
                com.google.android.gms.ads.internal.util.client.zzm.g(6);
                return null;
            }
        }, zzgcuVar);
    }

    public final void M0() {
        y9.a zzb;
        if (((Boolean) zzbdx.zza.zze()).booleanValue()) {
            zze zzeVar = this.E;
            synchronized (zzeVar) {
                zzeVar.c(true);
                zzeVar.c(false);
            }
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzkg)).booleanValue()) {
            zzb = zzgcj.zzk(new zzgbp() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzt
                @Override // com.google.android.gms.internal.ads.zzgbp
                public final y9.a zza() {
                    zzak zzakVar = zzak.this;
                    return zzakVar.K(zzakVar.f10646b, null, AdFormat.BANNER.name(), null, null, new Bundle()).zzb();
                }
            }, zzbzo.zza);
        } else {
            zzb = K(this.f10646b, null, AdFormat.BANNER.name(), null, null, new Bundle()).zzb();
        }
        zzgcj.zzr(zzb, new a0(this, 3), this.f10645a.zzB());
    }

    public final void N0() {
        zzbbn zzbbnVar = zzbbw.zziH;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
        if (((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue()) {
            if (!((Boolean) zzbaVar.c.zza(zzbbw.zziK)).booleanValue()) {
                if (!((Boolean) zzbaVar.c.zza(zzbbw.zziO)).booleanValue() || !this.A.getAndSet(true)) {
                    M0();
                }
            }
        }
    }

    public final void O0(List list, final IObjectWrapper iObjectWrapper, zzbtc zzbtcVar, boolean z10) {
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z11;
        y9.a aVar;
        Map map;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzgO)).booleanValue()) {
            com.google.android.gms.ads.internal.util.client.zzm.e("The updating URL feature is not enabled.");
            try {
                zzbtcVar.zze("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzm.g(6);
                return;
            }
        }
        Iterator it = list.iterator();
        int i10 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            arrayList = this.f10667x;
            arrayList2 = this.f10666w;
            if (!hasNext) {
                break;
            } else if (Q0((Uri) it.next(), arrayList2, arrayList)) {
                i10++;
            }
        }
        if (i10 > 1) {
            com.google.android.gms.ads.internal.util.client.zzm.e("Multiple google urls found: ".concat(String.valueOf(list)));
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            final Uri uri = (Uri) it2.next();
            if (!Q0(uri, arrayList2, arrayList)) {
                com.google.android.gms.ads.internal.util.client.zzm.e("Not a Google URL: ".concat(String.valueOf(uri)));
                aVar = zzgcj.zzh(uri);
            } else {
                Callable callable = new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzx
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        zzffk zzffkVar;
                        Uri uri2 = uri;
                        zzak zzakVar = zzak.this;
                        zzakVar.getClass();
                        try {
                            boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzla)).booleanValue();
                            IObjectWrapper iObjectWrapper2 = iObjectWrapper;
                            if (booleanValue && (zzffkVar = zzakVar.f10647d) != null) {
                                uri2 = zzffkVar.zza(uri2, zzakVar.f10646b, (View) ObjectWrapper.L0(iObjectWrapper2), null);
                            } else {
                                uri2 = zzakVar.c.zza(uri2, zzakVar.f10646b, (View) ObjectWrapper.L0(iObjectWrapper2), null);
                            }
                        } catch (zzaup unused2) {
                            com.google.android.gms.ads.internal.util.client.zzm.g(5);
                        }
                        if (uri2.getQueryParameter("ms") != null) {
                            return uri2;
                        }
                        throw new Exception("Failed to append spam signals to click url.");
                    }
                };
                zzgcu zzgcuVar = this.f10649f;
                y9.a zzb = zzgcuVar.zzb(callable);
                zzbtl zzbtlVar = this.f10651h;
                if (zzbtlVar != null && (map = zzbtlVar.zzb) != null && !map.isEmpty()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    aVar = zzgcj.zzn(zzb, new zzgbq() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzy
                        @Override // com.google.android.gms.internal.ads.zzgbq
                        public final y9.a zza(Object obj) {
                            final Uri uri2 = (Uri) obj;
                            ArrayList arrayList4 = zzak.F;
                            zzak zzakVar = zzak.this;
                            return zzgcj.zzm(zzakVar.L0("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new zzful() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzz
                                @Override // com.google.android.gms.internal.ads.zzful
                                public final Object apply(Object obj2) {
                                    String str = (String) obj2;
                                    ArrayList arrayList5 = zzak.F;
                                    boolean isEmpty = TextUtils.isEmpty(str);
                                    Uri uri3 = uri2;
                                    if (!isEmpty) {
                                        return zzak.R0(uri3, "nas", str);
                                    }
                                    return uri3;
                                }
                            }, zzakVar.f10649f);
                        }
                    }, zzgcuVar);
                } else {
                    com.google.android.gms.ads.internal.util.client.zzm.d("Asset view map is empty.");
                    aVar = zzb;
                }
            }
            arrayList3.add(aVar);
        }
        zzgcj.zzr(zzgcj.zzd(arrayList3), new d(this, zzbtcVar, z10), this.f10645a.zzB());
    }

    public final void P0(final List list, final IObjectWrapper iObjectWrapper, zzbtc zzbtcVar, boolean z10) {
        boolean z11;
        Map map;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzgO)).booleanValue()) {
            try {
                zzbtcVar.zze("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzm.g(6);
                return;
            }
        }
        Callable callable = new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzae
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str;
                zzak zzakVar = zzak.this;
                zzauo zzauoVar = zzakVar.c;
                if (zzauoVar.zzc() != null) {
                    str = zzauoVar.zzc().zzh(zzakVar.f10646b, (View) ObjectWrapper.L0(iObjectWrapper), null);
                } else {
                    str = "";
                }
                if (!TextUtils.isEmpty(str)) {
                    ArrayList arrayList = new ArrayList();
                    for (Uri uri : list) {
                        if (!zzak.Q0(uri, zzakVar.f10668y, zzakVar.f10669z)) {
                            com.google.android.gms.ads.internal.util.client.zzm.e("Not a Google URL: ".concat(String.valueOf(uri)));
                            arrayList.add(uri);
                        } else {
                            arrayList.add(zzak.R0(uri, "ms", str));
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        return arrayList;
                    }
                    throw new Exception("Empty impression URLs result.");
                }
                throw new Exception("Failed to get view signals.");
            }
        };
        zzgcu zzgcuVar = this.f10649f;
        y9.a zzb = zzgcuVar.zzb(callable);
        zzbtl zzbtlVar = this.f10651h;
        if (zzbtlVar != null && (map = zzbtlVar.zzb) != null && !map.isEmpty()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            zzb = zzgcj.zzn(zzb, new zzgbq() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzaf
                @Override // com.google.android.gms.internal.ads.zzgbq
                public final y9.a zza(Object obj) {
                    final ArrayList arrayList = (ArrayList) obj;
                    final zzak zzakVar = zzak.this;
                    return zzgcj.zzm(zzakVar.L0("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new zzful() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzu
                        @Override // com.google.android.gms.internal.ads.zzful
                        public final Object apply(Object obj2) {
                            String str = (String) obj2;
                            zzak zzakVar2 = zzak.this;
                            zzakVar2.getClass();
                            ArrayList arrayList2 = new ArrayList();
                            for (Uri uri : arrayList) {
                                if (zzak.Q0(uri, zzakVar2.f10668y, zzakVar2.f10669z) && !TextUtils.isEmpty(str)) {
                                    arrayList2.add(zzak.R0(uri, "nas", str));
                                } else {
                                    arrayList2.add(uri);
                                }
                            }
                            return arrayList2;
                        }
                    }, zzakVar.f10649f);
                }
            }, zzgcuVar);
        } else {
            com.google.android.gms.ads.internal.util.client.zzm.d("Asset view map is empty.");
        }
        zzgcj.zzr(zzb, new c(this, zzbtcVar, z10), this.f10645a.zzB());
    }

    @Override // com.google.android.gms.internal.ads.zzbym
    public final IObjectWrapper zze(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, String str, IObjectWrapper iObjectWrapper3) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zziR)).booleanValue()) {
            return new ObjectWrapper(null);
        }
        zzbcx zzbcxVar = this.D;
        zzbcxVar.zzg((Context) ObjectWrapper.L0(iObjectWrapper), (u.d) ObjectWrapper.L0(iObjectWrapper2), str, (u.b) ObjectWrapper.L0(iObjectWrapper3));
        if (((Boolean) zzbdx.zza.zze()).booleanValue()) {
            zze zzeVar = this.E;
            synchronized (zzeVar) {
                zzeVar.c(true);
                zzeVar.c(false);
            }
        }
        return new ObjectWrapper(zzbcxVar.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzbym
    public final void zzf(IObjectWrapper iObjectWrapper, final zzbyq zzbyqVar, zzbyj zzbyjVar) {
        y9.a zzh;
        y9.a zzb;
        y9.a aVar;
        y9.a aVar2;
        final Bundle bundle = new Bundle();
        zzbbn zzbbnVar = zzbbw.zzbS;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
        if (((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue()) {
            bundle.putLong(zzdrt.PUBLIC_API_CALL.zza(), zzbyqVar.zzd.f10224z);
            String zza = zzdrt.DYNAMITE_ENTER.zza();
            com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
            bundle.putLong(zza, System.currentTimeMillis());
        }
        Context context = (Context) ObjectWrapper.L0(iObjectWrapper);
        this.f10646b = context;
        zzfju zza2 = zzfjt.zza(context, 22);
        zza2.zzi();
        boolean equals = "UNKNOWN".equals(zzbyqVar.zzb);
        zzbbu zzbbuVar = zzbaVar.c;
        if (equals) {
            List arrayList = new ArrayList();
            zzbbn zzbbnVar2 = zzbbw.zzgN;
            if (!((String) zzbbuVar.zza(zzbbnVar2)).isEmpty()) {
                arrayList = Arrays.asList(((String) zzbbuVar.zza(zzbbnVar2)).split(","));
            }
            if (arrayList.contains(zzq.c(zzbyqVar.zzd))) {
                aVar2 = zzgcj.zzg(new IllegalArgumentException("Unknown format is no longer supported."));
                aVar = zzgcj.zzg(new IllegalArgumentException("Unknown format is no longer supported."));
                zzgcj.zzr(aVar, new b(this, aVar2, zzbyqVar, zzbyjVar, zza2), this.f10645a.zzB());
            }
        }
        if (((Boolean) zzbbuVar.zza(zzbbw.zzkg)).booleanValue()) {
            zzgcu zzgcuVar = zzbzo.zza;
            zzh = zzgcuVar.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzaa
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Bundle bundle2 = bundle;
                    zzak zzakVar = zzak.this;
                    Context context2 = zzakVar.f10646b;
                    zzbyq zzbyqVar2 = zzbyqVar;
                    return zzakVar.K(context2, zzbyqVar2.zza, zzbyqVar2.zzb, zzbyqVar2.zzc, zzbyqVar2.zzd, bundle2);
                }
            });
            zzb = zzgcj.zzn(zzh, new zzgbq() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzab
                @Override // com.google.android.gms.internal.ads.zzgbq
                public final y9.a zza(Object obj) {
                    return ((zzs) obj).zzb();
                }
            }, zzgcuVar);
        } else {
            zzs K = K(this.f10646b, zzbyqVar.zza, zzbyqVar.zzb, zzbyqVar.zzc, zzbyqVar.zzd, bundle);
            zzh = zzgcj.zzh(K);
            zzb = K.zzb();
        }
        y9.a aVar3 = zzh;
        aVar = zzb;
        aVar2 = aVar3;
        zzgcj.zzr(aVar, new b(this, aVar2, zzbyqVar, zzbyjVar, zza2), this.f10645a.zzB());
    }

    @Override // com.google.android.gms.internal.ads.zzbym
    public final void zzg(zzbtl zzbtlVar) {
        this.f10651h = zzbtlVar;
        this.f10648e.zzc(1);
    }

    @Override // com.google.android.gms.internal.ads.zzbym
    public final void zzh(List list, IObjectWrapper iObjectWrapper, zzbtc zzbtcVar) {
        O0(list, iObjectWrapper, zzbtcVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzbym
    public final void zzi(List list, IObjectWrapper iObjectWrapper, zzbtc zzbtcVar) {
        P0(list, iObjectWrapper, zzbtcVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzbym
    @SuppressLint({"AddJavascriptInterface"})
    public final void zzj(IObjectWrapper iObjectWrapper) {
        zzbbn zzbbnVar = zzbbw.zziG;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
        if (((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue()) {
            zzbbn zzbbnVar2 = zzbbw.zzgM;
            if (!((Boolean) zzbaVar.c.zza(zzbbnVar2)).booleanValue()) {
                N0();
            }
            WebView webView = (WebView) ObjectWrapper.L0(iObjectWrapper);
            if (webView == null) {
                com.google.android.gms.ads.internal.util.client.zzm.c("The webView cannot be null.");
                return;
            }
            webView.addJavascriptInterface(new a(webView, this.c, this.f10654k, this.f10655l, this.f10647d, this.E), "gmaSdk");
            if (((Boolean) zzbaVar.c.zza(zzbbw.zziQ)).booleanValue()) {
                com.google.android.gms.ads.internal.zzu.B.f10557g.zzs();
            }
            if (((Boolean) zzbaVar.c.zza(zzbbnVar2)).booleanValue()) {
                N0();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbym
    public final void zzk(IObjectWrapper iObjectWrapper) {
        View view;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzgO)).booleanValue()) {
            return;
        }
        MotionEvent motionEvent = (MotionEvent) ObjectWrapper.L0(iObjectWrapper);
        zzbtl zzbtlVar = this.f10651h;
        if (zzbtlVar == null) {
            view = null;
        } else {
            view = zzbtlVar.zza;
        }
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        this.f10652i = new Point(((int) motionEvent.getRawX()) - iArr[0], ((int) motionEvent.getRawY()) - iArr[1]);
        if (motionEvent.getAction() == 0) {
            this.f10653j = this.f10652i;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        Point point = this.f10652i;
        obtain.setLocation(point.x, point.y);
        this.c.zzd(obtain);
        obtain.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzbym
    public final void zzl(List list, IObjectWrapper iObjectWrapper, zzbtc zzbtcVar) {
        O0(list, iObjectWrapper, zzbtcVar, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbym
    public final void zzm(List list, IObjectWrapper iObjectWrapper, zzbtc zzbtcVar) {
        P0(list, iObjectWrapper, zzbtcVar, false);
    }
}
