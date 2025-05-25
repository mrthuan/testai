package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toolbar;
import com.adjust.sdk.Constants;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Predicate;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import x0.f0;
import x0.n0;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public class zzcer extends WebViewClient implements zzcgb {
    public static final /* synthetic */ int zzb = 0;
    private boolean zzA;
    private int zzB;
    private boolean zzC;
    private final zzeds zzE;
    private View.OnAttachStateChangeListener zzF;
    protected zzbxl zza;
    private final zzcej zzc;
    private final zzbav zzd;
    private com.google.android.gms.ads.internal.client.zza zzg;
    private com.google.android.gms.ads.internal.overlay.zzp zzh;
    private zzcfz zzi;
    private zzcga zzj;
    private zzbhn zzk;
    private zzbhp zzl;
    private zzdeq zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private com.google.android.gms.ads.internal.overlay.zzaa zzv;
    private zzbrp zzw;
    private com.google.android.gms.ads.internal.zzb zzx;
    private boolean zzz;
    private final HashMap zze = new HashMap();
    private final Object zzf = new Object();
    private int zzp = 0;
    private String zzq = "";
    private String zzr = "";
    private zzbrk zzy = null;
    private final HashSet zzD = new HashSet(Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzfb)).split(",")));

    public zzcer(zzcej zzcejVar, zzbav zzbavVar, boolean z10, zzbrp zzbrpVar, zzbrk zzbrkVar, zzeds zzedsVar) {
        this.zzd = zzbavVar;
        this.zzc = zzcejVar;
        this.zzs = z10;
        this.zzw = zzbrpVar;
        this.zzE = zzedsVar;
    }

    private static WebResourceResponse zzS() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzaB)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ec, code lost:
        r14 = r3.getContentType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f4, code lost:
        r4 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f8, code lost:
        if (android.text.TextUtils.isEmpty(r14) == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00fa, code lost:
        r6 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00fc, code lost:
        r6 = r14.split(";")[0].trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0107, code lost:
        r14 = r3.getContentType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x010f, code lost:
        if (android.text.TextUtils.isEmpty(r14) == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0112, code lost:
        r14 = r14.split(";");
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0117, code lost:
        if (r14.length != 1) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x011a, code lost:
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x011c, code lost:
        if (r0 >= r14.length) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x012a, code lost:
        if (r14[r0].trim().startsWith("charset") == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x012c, code lost:
        r1 = r14[r0].trim().split("=");
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0139, code lost:
        if (r1.length <= 1) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x013b, code lost:
        r4 = r1[1].trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0142, code lost:
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0145, code lost:
        r7 = r4;
        r14 = r3.getHeaderFields();
        r10 = new java.util.HashMap(r14.size());
        r14 = r14.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x015f, code lost:
        if (r14.hasNext() == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0161, code lost:
        r0 = r14.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x016b, code lost:
        if (r0.getKey() == null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0171, code lost:
        if (r0.getValue() == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x017d, code lost:
        if (r0.getValue().isEmpty() != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x017f, code lost:
        r10.put(r0.getKey(), r0.getValue().get(0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0195, code lost:
        r13 = com.google.android.gms.ads.internal.zzu.B.f10555e;
        r8 = r3.getResponseCode();
        r9 = r3.getResponseMessage();
        r11 = r3.getInputStream();
        r13.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01ae, code lost:
        r5 = new android.webkit.WebResourceResponse(r6, r7, r8, r9, r10, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01b2, code lost:
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final android.webkit.WebResourceResponse zzT(java.lang.String r13, java.util.Map r14) {
        /*
            Method dump skipped, instructions count: 459
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcer.zzT(java.lang.String, java.util.Map):android.webkit.WebResourceResponse");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzU(Map map, List list, String str) {
        if (com.google.android.gms.ads.internal.util.zze.i()) {
            com.google.android.gms.ads.internal.util.zze.h("Received GMSG: ".concat(str));
            for (String str2 : map.keySet()) {
                com.google.android.gms.ads.internal.util.zze.h("  " + str2 + ": " + ((String) map.get(str2)));
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((zzbix) it.next()).zza(this.zzc, map);
        }
    }

    private final void zzV() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.zzF;
        if (onAttachStateChangeListener == null) {
            return;
        }
        ((View) this.zzc).removeOnAttachStateChangeListener(onAttachStateChangeListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzW(final View view, final zzbxl zzbxlVar, final int i10) {
        if (zzbxlVar.zzi() && i10 > 0) {
            zzbxlVar.zzg(view);
            if (zzbxlVar.zzi()) {
                com.google.android.gms.ads.internal.util.zzt.f10496l.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcek
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcer.this.zzp(view, zzbxlVar, i10);
                    }
                }, 100L);
            }
        }
    }

    private static final boolean zzX(zzcej zzcejVar) {
        if (zzcejVar.zzD() != null) {
            return zzcejVar.zzD().zzai;
        }
        return false;
    }

    private static final boolean zzY(boolean z10, zzcej zzcejVar) {
        if (z10 && !zzcejVar.zzO().zzi() && !zzcejVar.zzU().equals("interstitial_mb")) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcgb, com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        com.google.android.gms.ads.internal.client.zza zzaVar = this.zzg;
        if (zzaVar != null) {
            zzaVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        com.google.android.gms.ads.internal.util.zze.h("Loading resource: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            zzj(parse);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        Toolbar toolbar;
        synchronized (this.zzf) {
            if (this.zzc.zzaE()) {
                com.google.android.gms.ads.internal.util.zze.h("Blank page loaded, 1...");
                this.zzc.zzX();
                return;
            }
            this.zzz = true;
            zzcga zzcgaVar = this.zzj;
            if (zzcgaVar != null) {
                zzcgaVar.zza();
                this.zzj = null;
            }
            zzg();
            if (this.zzc.zzL() != null) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzkV)).booleanValue() && (toolbar = this.zzc.zzL().f10327u) != null) {
                    toolbar.setSubtitle(str);
                }
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        this.zzo = true;
        this.zzp = i10;
        this.zzq = str;
        this.zzr = str2;
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(26)
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        boolean didCrash;
        int rendererPriorityAtExit;
        zzcej zzcejVar = this.zzc;
        didCrash = renderProcessGoneDetail.didCrash();
        rendererPriorityAtExit = renderProcessGoneDetail.rendererPriorityAtExit();
        return zzcejVar.zzaD(didCrash, rendererPriorityAtExit);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return zzc(str, Collections.emptyMap());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case ShapeTypes.VERTICAL_SCROLL /* 127 */:
                    case 128:
                    case 129:
                    case ShapeTypes.DOUBLE_WAVE /* 130 */:
                        return true;
                    default:
                        return false;
                }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        com.google.android.gms.ads.internal.util.zze.h("AdWebView shouldOverrideUrlLoading: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            zzj(parse);
        } else {
            if (this.zzn && webView == this.zzc.zzG()) {
                String scheme = parse.getScheme();
                if ("http".equalsIgnoreCase(scheme) || Constants.SCHEME.equalsIgnoreCase(scheme)) {
                    com.google.android.gms.ads.internal.client.zza zzaVar = this.zzg;
                    if (zzaVar != null) {
                        zzaVar.onAdClicked();
                        zzbxl zzbxlVar = this.zza;
                        if (zzbxlVar != null) {
                            zzbxlVar.zzh(str);
                        }
                        this.zzg = null;
                    }
                    zzdeq zzdeqVar = this.zzm;
                    if (zzdeqVar != null) {
                        zzdeqVar.zzdG();
                        this.zzm = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (!this.zzc.zzG().willNotDraw()) {
                try {
                    zzauo zzI = this.zzc.zzI();
                    zzffk zzS = this.zzc.zzS();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzla)).booleanValue() && zzS != null) {
                        if (zzI != null && zzI.zzf(parse)) {
                            Context context = this.zzc.getContext();
                            zzcej zzcejVar = this.zzc;
                            parse = zzS.zza(parse, context, (View) zzcejVar, zzcejVar.zzi());
                        }
                    } else if (zzI != null && zzI.zzf(parse)) {
                        Context context2 = this.zzc.getContext();
                        zzcej zzcejVar2 = this.zzc;
                        parse = zzI.zza(parse, context2, (View) zzcejVar2, zzcejVar2.zzi());
                    }
                } catch (zzaup unused) {
                    com.google.android.gms.ads.internal.util.client.zzm.e("Unable to append parameter to URL: ".concat(String.valueOf(str)));
                }
                com.google.android.gms.ads.internal.zzb zzbVar = this.zzx;
                if (zzbVar != null && !zzbVar.b()) {
                    this.zzx.a(str);
                } else {
                    zzu(new com.google.android.gms.ads.internal.overlay.zzc("android.intent.action.VIEW", parse.toString(), null, null, null, null, null, null), true, false);
                }
            } else {
                com.google.android.gms.ads.internal.util.client.zzm.e("AdWebView unable to handle URL: ".concat(String.valueOf(str)));
            }
        }
        return true;
    }

    public final void zzA(String str, zzbix zzbixVar) {
        synchronized (this.zzf) {
            List list = (List) this.zze.get(str);
            if (list == null) {
                list = new CopyOnWriteArrayList();
                this.zze.put(str, list);
            }
            list.add(zzbixVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzB(zzcfz zzcfzVar) {
        this.zzi = zzcfzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzC(int i10, int i11) {
        zzbrk zzbrkVar = this.zzy;
        if (zzbrkVar != null) {
            zzbrkVar.zze(i10, i11);
        }
    }

    public final void zzD(boolean z10) {
        this.zzn = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzE(boolean z10) {
        synchronized (this.zzf) {
            this.zzu = z10;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzF() {
        synchronized (this.zzf) {
            this.zzn = false;
            this.zzs = true;
            zzbzo.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcel
                @Override // java.lang.Runnable
                public final void run() {
                    zzcer.this.zzn();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzG(boolean z10) {
        synchronized (this.zzf) {
            this.zzt = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzH(zzcga zzcgaVar) {
        this.zzj = zzcgaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzI(zzcni zzcniVar, zzedh zzedhVar, zzfll zzfllVar) {
        zzL("/click");
        if (zzedhVar != null && zzfllVar != null) {
            zzA("/click", new zzffo(this.zzm, zzcniVar, zzfllVar, zzedhVar));
        } else {
            zzA("/click", new zzbhv(this.zzm, zzcniVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzJ(zzcni zzcniVar) {
        zzL("/click");
        zzA("/click", new zzbhv(this.zzm, zzcniVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzK(zzcni zzcniVar, zzedh zzedhVar, zzdsk zzdskVar) {
        zzL("/open");
        zzA("/open", new zzbjj(this.zzx, this.zzy, zzedhVar, zzdskVar, zzcniVar));
    }

    public final void zzL(String str) {
        synchronized (this.zzf) {
            List list = (List) this.zze.get(str);
            if (list == null) {
                return;
            }
            list.clear();
        }
    }

    public final void zzM(String str, zzbix zzbixVar) {
        synchronized (this.zzf) {
            List list = (List) this.zze.get(str);
            if (list == null) {
                return;
            }
            list.remove(zzbixVar);
        }
    }

    public final void zzN(String str, Predicate predicate) {
        synchronized (this.zzf) {
            List<zzbix> list = (List) this.zze.get(str);
            if (list == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (zzbix zzbixVar : list) {
                if (predicate.apply(zzbixVar)) {
                    arrayList.add(zzbixVar);
                }
            }
            list.removeAll(arrayList);
        }
    }

    public final boolean zzO() {
        boolean z10;
        synchronized (this.zzf) {
            z10 = this.zzu;
        }
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final boolean zzP() {
        boolean z10;
        synchronized (this.zzf) {
            z10 = this.zzs;
        }
        return z10;
    }

    public final boolean zzQ() {
        boolean z10;
        synchronized (this.zzf) {
            z10 = this.zzt;
        }
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzR(com.google.android.gms.ads.internal.client.zza zzaVar, zzbhn zzbhnVar, com.google.android.gms.ads.internal.overlay.zzp zzpVar, zzbhp zzbhpVar, com.google.android.gms.ads.internal.overlay.zzaa zzaaVar, boolean z10, zzbja zzbjaVar, com.google.android.gms.ads.internal.zzb zzbVar, zzbrr zzbrrVar, zzbxl zzbxlVar, final zzedh zzedhVar, final zzfll zzfllVar, zzdsk zzdskVar, zzbjr zzbjrVar, zzdeq zzdeqVar, zzbjq zzbjqVar, zzbjk zzbjkVar, zzbiy zzbiyVar, zzcni zzcniVar) {
        com.google.android.gms.ads.internal.zzb zzbVar2 = zzbVar == null ? new com.google.android.gms.ads.internal.zzb(this.zzc.getContext(), zzbxlVar) : zzbVar;
        this.zzy = new zzbrk(this.zzc, zzbrrVar);
        this.zza = zzbxlVar;
        zzbbn zzbbnVar = zzbbw.zzaI;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
        if (((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue()) {
            zzA("/adMetadata", new zzbhm(zzbhnVar));
        }
        if (zzbhpVar != null) {
            zzA("/appEvent", new zzbho(zzbhpVar));
        }
        zzA("/backButton", zzbiw.zzj);
        zzA("/refresh", zzbiw.zzk);
        zzA("/canOpenApp", zzbiw.zzb);
        zzA("/canOpenURLs", zzbiw.zza);
        zzA("/canOpenIntents", zzbiw.zzc);
        zzA("/close", zzbiw.zzd);
        zzA("/customClose", zzbiw.zze);
        zzA("/instrument", zzbiw.zzn);
        zzA("/delayPageLoaded", zzbiw.zzp);
        zzA("/delayPageClosed", zzbiw.zzq);
        zzA("/getLocationInfo", zzbiw.zzr);
        zzA("/log", zzbiw.zzg);
        zzA("/mraid", new zzbje(zzbVar2, this.zzy, zzbrrVar));
        zzbrp zzbrpVar = this.zzw;
        if (zzbrpVar != null) {
            zzA("/mraidLoaded", zzbrpVar);
        }
        com.google.android.gms.ads.internal.zzb zzbVar3 = zzbVar2;
        zzA("/open", new zzbjj(zzbVar2, this.zzy, zzedhVar, zzdskVar, zzcniVar));
        zzA("/precache", new zzccw());
        zzA("/touch", zzbiw.zzi);
        zzA("/video", zzbiw.zzl);
        zzA("/videoMeta", zzbiw.zzm);
        if (zzedhVar != null && zzfllVar != null) {
            zzA("/click", new zzffo(zzdeqVar, zzcniVar, zzfllVar, zzedhVar));
            zzA("/httpTrack", new zzbix() { // from class: com.google.android.gms.internal.ads.zzffp
                @Override // com.google.android.gms.internal.ads.zzbix
                public final void zza(Object obj, Map map) {
                    zzcea zzceaVar = (zzcea) obj;
                    String str = (String) map.get("u");
                    if (str == null) {
                        com.google.android.gms.ads.internal.util.client.zzm.e("URL missing from httpTrack GMSG.");
                    } else if (!zzceaVar.zzD().zzai) {
                        zzfll.this.zzc(str, null);
                    } else {
                        zzedh zzedhVar2 = zzedhVar;
                        com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
                        zzedhVar2.zzd(new zzedj(System.currentTimeMillis(), ((zzcfm) zzceaVar).zzR().zzb, str, 2));
                    }
                }
            });
        } else {
            zzA("/click", new zzbhv(zzdeqVar, zzcniVar));
            zzA("/httpTrack", zzbiw.zzf);
        }
        if (com.google.android.gms.ads.internal.zzu.B.f10574x.zzp(this.zzc.getContext())) {
            Map hashMap = new HashMap();
            if (this.zzc.zzD() != null) {
                hashMap = this.zzc.zzD().zzaw;
            }
            zzA("/logScionEvent", new zzbjd(this.zzc.getContext(), hashMap));
        }
        if (zzbjaVar != null) {
            zzA("/setInterstitialProperties", new zzbiz(zzbjaVar));
        }
        zzbbu zzbbuVar = zzbaVar.c;
        if (zzbjrVar != null && ((Boolean) zzbbuVar.zza(zzbbw.zzia)).booleanValue()) {
            zzA("/inspectorNetworkExtras", zzbjrVar);
        }
        if (((Boolean) zzbbuVar.zza(zzbbw.zzit)).booleanValue() && zzbjqVar != null) {
            zzA("/shareSheet", zzbjqVar);
        }
        if (((Boolean) zzbbuVar.zza(zzbbw.zziy)).booleanValue() && zzbjkVar != null) {
            zzA("/inspectorOutOfContextTest", zzbjkVar);
        }
        if (((Boolean) zzbbuVar.zza(zzbbw.zziC)).booleanValue() && zzbiyVar != null) {
            zzA("/inspectorStorage", zzbiyVar);
        }
        if (((Boolean) zzbbuVar.zza(zzbbw.zzkD)).booleanValue()) {
            zzA("/bindPlayStoreOverlay", zzbiw.zzu);
            zzA("/presentPlayStoreOverlay", zzbiw.zzv);
            zzA("/expandPlayStoreOverlay", zzbiw.zzw);
            zzA("/collapsePlayStoreOverlay", zzbiw.zzx);
            zzA("/closePlayStoreOverlay", zzbiw.zzy);
        }
        if (((Boolean) zzbbuVar.zza(zzbbw.zzcT)).booleanValue()) {
            zzA("/setPAIDPersonalizationEnabled", zzbiw.zzA);
            zzA("/resetPAID", zzbiw.zzz);
        }
        if (((Boolean) zzbbuVar.zza(zzbbw.zzkU)).booleanValue()) {
            zzcej zzcejVar = this.zzc;
            if (zzcejVar.zzD() != null && zzcejVar.zzD().zzar) {
                zzA("/writeToLocalStorage", zzbiw.zzB);
                zzA("/clearLocalStorageKeys", zzbiw.zzC);
            }
        }
        this.zzg = zzaVar;
        this.zzh = zzpVar;
        this.zzk = zzbhnVar;
        this.zzl = zzbhpVar;
        this.zzv = zzaaVar;
        this.zzx = zzbVar3;
        this.zzm = zzdeqVar;
        this.zzn = z10;
    }

    public final ViewTreeObserver.OnGlobalLayoutListener zza() {
        synchronized (this.zzf) {
        }
        return null;
    }

    public final ViewTreeObserver.OnScrollChangedListener zzb() {
        synchronized (this.zzf) {
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02b1 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b2 A[Catch: NoClassDefFoundError -> 0x02b3, Exception | NoClassDefFoundError -> 0x02b5, TRY_ENTER, TRY_LEAVE, TryCatch #11 {Exception | NoClassDefFoundError -> 0x02b5, blocks: (B:3:0x000c, B:5:0x0019, B:6:0x0021, B:8:0x0033, B:10:0x003a, B:12:0x0046, B:14:0x0062, B:16:0x007b, B:18:0x0092, B:19:0x0095, B:21:0x0098, B:24:0x00b2, B:27:0x00cc, B:29:0x00dd, B:66:0x019f, B:44:0x015e, B:79:0x020a, B:92:0x0289, B:80:0x0210, B:81:0x0239, B:78:0x01e6, B:43:0x013d, B:28:0x00d5, B:82:0x023a, B:84:0x0244, B:86:0x024a, B:88:0x027d, B:94:0x0298, B:96:0x029e, B:98:0x02ac), top: B:110:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01db A[Catch: all -> 0x01c2, TryCatch #1 {all -> 0x01c2, blocks: (B:62:0x017b, B:64:0x018d, B:65:0x0194, B:74:0x01c9, B:76:0x01db, B:77:0x01e2), top: B:107:0x00dd }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x023a A[Catch: NoClassDefFoundError -> 0x02b3, Exception | NoClassDefFoundError -> 0x02b5, TryCatch #11 {Exception | NoClassDefFoundError -> 0x02b5, blocks: (B:3:0x000c, B:5:0x0019, B:6:0x0021, B:8:0x0033, B:10:0x003a, B:12:0x0046, B:14:0x0062, B:16:0x007b, B:18:0x0092, B:19:0x0095, B:21:0x0098, B:24:0x00b2, B:27:0x00cc, B:29:0x00dd, B:66:0x019f, B:44:0x015e, B:79:0x020a, B:92:0x0289, B:80:0x0210, B:81:0x0239, B:78:0x01e6, B:43:0x013d, B:28:0x00d5, B:82:0x023a, B:84:0x0244, B:86:0x024a, B:88:0x027d, B:94:0x0298, B:96:0x029e, B:98:0x02ac), top: B:110:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0289 A[Catch: NoClassDefFoundError -> 0x02b3, Exception | NoClassDefFoundError -> 0x02b5, TryCatch #11 {Exception | NoClassDefFoundError -> 0x02b5, blocks: (B:3:0x000c, B:5:0x0019, B:6:0x0021, B:8:0x0033, B:10:0x003a, B:12:0x0046, B:14:0x0062, B:16:0x007b, B:18:0x0092, B:19:0x0095, B:21:0x0098, B:24:0x00b2, B:27:0x00cc, B:29:0x00dd, B:66:0x019f, B:44:0x015e, B:79:0x020a, B:92:0x0289, B:80:0x0210, B:81:0x0239, B:78:0x01e6, B:43:0x013d, B:28:0x00d5, B:82:0x023a, B:84:0x0244, B:86:0x024a, B:88:0x027d, B:94:0x0298, B:96:0x029e, B:98:0x02ac), top: B:110:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x029e A[Catch: NoClassDefFoundError -> 0x02b3, Exception | NoClassDefFoundError -> 0x02b5, TryCatch #11 {Exception | NoClassDefFoundError -> 0x02b5, blocks: (B:3:0x000c, B:5:0x0019, B:6:0x0021, B:8:0x0033, B:10:0x003a, B:12:0x0046, B:14:0x0062, B:16:0x007b, B:18:0x0092, B:19:0x0095, B:21:0x0098, B:24:0x00b2, B:27:0x00cc, B:29:0x00dd, B:66:0x019f, B:44:0x015e, B:79:0x020a, B:92:0x0289, B:80:0x0210, B:81:0x0239, B:78:0x01e6, B:43:0x013d, B:28:0x00d5, B:82:0x023a, B:84:0x0244, B:86:0x024a, B:88:0x027d, B:94:0x0298, B:96:0x029e, B:98:0x02ac), top: B:110:0x000c }] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v3, types: [com.google.android.gms.internal.ads.zzbbu] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.webkit.WebResourceResponse zzc(java.lang.String r19, java.util.Map r20) {
        /*
            Method dump skipped, instructions count: 708
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcer.zzc(java.lang.String, java.util.Map):android.webkit.WebResourceResponse");
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final com.google.android.gms.ads.internal.zzb zzd() {
        return this.zzx;
    }

    @Override // com.google.android.gms.internal.ads.zzdeq
    public final void zzdG() {
        zzdeq zzdeqVar = this.zzm;
        if (zzdeqVar != null) {
            zzdeqVar.zzdG();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdeq
    public final void zzdf() {
        zzdeq zzdeqVar = this.zzm;
        if (zzdeqVar != null) {
            zzdeqVar.zzdf();
        }
    }

    public final void zzg() {
        if (this.zzi != null && ((this.zzz && this.zzB <= 0) || this.zzA || this.zzo)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzbG)).booleanValue() && this.zzc.zzm() != null) {
                zzbcd.zza(this.zzc.zzm().zza(), this.zzc.zzk(), "awfllc");
            }
            zzcfz zzcfzVar = this.zzi;
            boolean z10 = false;
            if (!this.zzA && !this.zzo) {
                z10 = true;
            }
            zzcfzVar.zza(z10, this.zzp, this.zzq, this.zzr);
            this.zzi = null;
        }
        this.zzc.zzaf();
    }

    public final void zzh() {
        zzbxl zzbxlVar = this.zza;
        if (zzbxlVar != null) {
            zzbxlVar.zze();
            this.zza = null;
        }
        zzV();
        synchronized (this.zzf) {
            this.zze.clear();
            this.zzg = null;
            this.zzh = null;
            this.zzi = null;
            this.zzj = null;
            this.zzk = null;
            this.zzl = null;
            this.zzn = false;
            this.zzs = false;
            this.zzt = false;
            this.zzv = null;
            this.zzx = null;
            this.zzw = null;
            zzbrk zzbrkVar = this.zzy;
            if (zzbrkVar != null) {
                zzbrkVar.zza(true);
                this.zzy = null;
            }
        }
    }

    public final void zzi(boolean z10) {
        this.zzC = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzj(final Uri uri) {
        final String str;
        com.google.android.gms.ads.internal.util.zze.h("Received GMSG: ".concat(String.valueOf(uri)));
        HashMap hashMap = this.zze;
        String path = uri.getPath();
        List list = (List) hashMap.get(path);
        if (path != null && list != null) {
            String encodedQuery = uri.getEncodedQuery();
            zzbbn zzbbnVar = zzbbw.zzfa;
            com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
            if (((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue() && this.zzD.contains(path) && encodedQuery != null) {
                if (encodedQuery.length() >= ((Integer) zzbaVar.c.zza(zzbbw.zzfc)).intValue()) {
                    com.google.android.gms.ads.internal.util.zze.h("Parsing gmsg query params on BG thread: ".concat(path));
                    com.google.android.gms.ads.internal.util.zzt zztVar = com.google.android.gms.ads.internal.zzu.B.c;
                    zztVar.getClass();
                    zzgcj.zzr(zzgcj.zzj(new Callable() { // from class: com.google.android.gms.ads.internal.util.zzn
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            zzf zzfVar = zzt.f10496l;
                            zzt zztVar2 = com.google.android.gms.ads.internal.zzu.B.c;
                            return zzt.l(uri);
                        }
                    }, zztVar.f10506k), new zzcep(this, list, path, uri), zzbzo.zze);
                    return;
                }
            }
            com.google.android.gms.ads.internal.util.zzt zztVar2 = com.google.android.gms.ads.internal.zzu.B.c;
            zzU(com.google.android.gms.ads.internal.util.zzt.l(uri), list, path);
            return;
        }
        com.google.android.gms.ads.internal.util.zze.h("No GMSG handler found for GMSG: ".concat(String.valueOf(uri)));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzgb)).booleanValue() && com.google.android.gms.ads.internal.zzu.B.f10557g.zzg() != null) {
            if (path != null && path.length() >= 2) {
                str = path.substring(1);
            } else {
                str = "null";
            }
            zzbzo.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcem
                @Override // java.lang.Runnable
                public final void run() {
                    int i10 = zzcer.zzb;
                    com.google.android.gms.ads.internal.zzu.B.f10557g.zzg().zze(str);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzk() {
        zzbav zzbavVar = this.zzd;
        if (zzbavVar != null) {
            zzbavVar.zzc(lib.zj.office.fc.hpsf.Constants.CP_MAC_HEBREW);
        }
        this.zzA = true;
        this.zzp = lib.zj.office.fc.hpsf.Constants.CP_MAC_ARABIC;
        this.zzq = "Page loaded delay cancel.";
        zzg();
        this.zzc.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzl() {
        synchronized (this.zzf) {
        }
        this.zzB++;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzm() {
        this.zzB--;
        zzg();
    }

    public final void zzn() {
        this.zzc.zzad();
        com.google.android.gms.ads.internal.overlay.zzm zzL = this.zzc.zzL();
        if (zzL != null) {
            zzL.f10317k.removeView(zzL.f10311e);
            zzL.Q0(true);
        }
    }

    public final /* synthetic */ void zzo(boolean z10, long j10) {
        this.zzc.zzv(z10, j10);
    }

    public final /* synthetic */ void zzp(View view, zzbxl zzbxlVar, int i10) {
        zzW(view, zzbxlVar, i10 - 1);
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzq(int i10, int i11, boolean z10) {
        zzbrp zzbrpVar = this.zzw;
        if (zzbrpVar != null) {
            zzbrpVar.zzb(i10, i11);
        }
        zzbrk zzbrkVar = this.zzy;
        if (zzbrkVar != null) {
            zzbrkVar.zzd(i10, i11, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzr() {
        zzbxl zzbxlVar = this.zza;
        if (zzbxlVar != null) {
            WebView zzG = this.zzc.zzG();
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            if (f0.g.b(zzG)) {
                zzW(zzG, zzbxlVar, 10);
                return;
            }
            zzV();
            zzceo zzceoVar = new zzceo(this, zzbxlVar);
            this.zzF = zzceoVar;
            ((View) this.zzc).addOnAttachStateChangeListener(zzceoVar);
        }
    }

    public final void zzu(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z10, boolean z11) {
        boolean z12;
        com.google.android.gms.ads.internal.client.zza zzaVar;
        com.google.android.gms.ads.internal.overlay.zzp zzpVar;
        zzdeq zzdeqVar;
        zzcej zzcejVar = this.zzc;
        boolean zzaF = zzcejVar.zzaF();
        boolean z13 = false;
        if (!zzY(zzaF, zzcejVar) && !z11) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (z12 || !z10) {
            z13 = true;
        }
        if (z12) {
            zzaVar = null;
        } else {
            zzaVar = this.zzg;
        }
        if (zzaF) {
            zzpVar = null;
        } else {
            zzpVar = this.zzh;
        }
        com.google.android.gms.ads.internal.overlay.zzaa zzaaVar = this.zzv;
        zzcej zzcejVar2 = this.zzc;
        VersionInfoParcel zzn = zzcejVar2.zzn();
        if (z13) {
            zzdeqVar = null;
        } else {
            zzdeqVar = this.zzm;
        }
        zzx(new AdOverlayInfoParcel(zzcVar, zzaVar, zzpVar, zzaaVar, zzn, zzcejVar2, zzdeqVar));
    }

    public final void zzv(String str, String str2, int i10) {
        zzeds zzedsVar = this.zzE;
        zzcej zzcejVar = this.zzc;
        zzx(new AdOverlayInfoParcel(zzcejVar, zzcejVar.zzn(), str, str2, zzedsVar));
    }

    public final void zzw(boolean z10, int i10, boolean z11) {
        boolean z12;
        com.google.android.gms.ads.internal.client.zza zzaVar;
        zzdeq zzdeqVar;
        zzeds zzedsVar;
        zzcej zzcejVar = this.zzc;
        boolean zzY = zzY(zzcejVar.zzaF(), zzcejVar);
        if (!zzY && z11) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (zzY) {
            zzaVar = null;
        } else {
            zzaVar = this.zzg;
        }
        com.google.android.gms.ads.internal.overlay.zzp zzpVar = this.zzh;
        com.google.android.gms.ads.internal.overlay.zzaa zzaaVar = this.zzv;
        zzcej zzcejVar2 = this.zzc;
        VersionInfoParcel zzn = zzcejVar2.zzn();
        if (z12) {
            zzdeqVar = null;
        } else {
            zzdeqVar = this.zzm;
        }
        if (zzX(this.zzc)) {
            zzedsVar = this.zzE;
        } else {
            zzedsVar = null;
        }
        zzx(new AdOverlayInfoParcel(zzaVar, zzpVar, zzaaVar, zzcejVar2, z10, i10, zzn, zzdeqVar, zzedsVar));
    }

    public final void zzx(AdOverlayInfoParcel adOverlayInfoParcel) {
        boolean z10;
        com.google.android.gms.ads.internal.overlay.zzc zzcVar;
        zzbrk zzbrkVar = this.zzy;
        if (zzbrkVar != null) {
            z10 = zzbrkVar.zzf();
        } else {
            z10 = false;
        }
        com.google.android.gms.ads.internal.overlay.zzn zznVar = com.google.android.gms.ads.internal.zzu.B.f10553b;
        com.google.android.gms.ads.internal.overlay.zzn.a(this.zzc.getContext(), adOverlayInfoParcel, !z10);
        zzbxl zzbxlVar = this.zza;
        if (zzbxlVar != null) {
            String str = adOverlayInfoParcel.f10279l;
            if (str == null && (zzcVar = adOverlayInfoParcel.f10269a) != null) {
                str = zzcVar.f10292b;
            }
            zzbxlVar.zzh(str);
        }
    }

    public final void zzy(boolean z10, int i10, String str, String str2, boolean z11) {
        boolean z12;
        com.google.android.gms.ads.internal.client.zza zzaVar;
        zzceq zzceqVar;
        zzdeq zzdeqVar;
        zzeds zzedsVar;
        zzcej zzcejVar = this.zzc;
        boolean zzaF = zzcejVar.zzaF();
        boolean zzY = zzY(zzaF, zzcejVar);
        if (!zzY && z11) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (zzY) {
            zzaVar = null;
        } else {
            zzaVar = this.zzg;
        }
        if (zzaF) {
            zzceqVar = null;
        } else {
            zzceqVar = new zzceq(this.zzc, this.zzh);
        }
        zzbhn zzbhnVar = this.zzk;
        zzbhp zzbhpVar = this.zzl;
        com.google.android.gms.ads.internal.overlay.zzaa zzaaVar = this.zzv;
        zzcej zzcejVar2 = this.zzc;
        VersionInfoParcel zzn = zzcejVar2.zzn();
        if (z12) {
            zzdeqVar = null;
        } else {
            zzdeqVar = this.zzm;
        }
        if (zzX(this.zzc)) {
            zzedsVar = this.zzE;
        } else {
            zzedsVar = null;
        }
        zzx(new AdOverlayInfoParcel(zzaVar, zzceqVar, zzbhnVar, zzbhpVar, zzaaVar, zzcejVar2, z10, i10, str, str2, zzn, zzdeqVar, zzedsVar));
    }

    public final void zzz(boolean z10, int i10, String str, boolean z11, boolean z12) {
        boolean z13;
        com.google.android.gms.ads.internal.client.zza zzaVar;
        zzceq zzceqVar;
        zzdeq zzdeqVar;
        zzeds zzedsVar;
        zzcej zzcejVar = this.zzc;
        boolean zzaF = zzcejVar.zzaF();
        boolean zzY = zzY(zzaF, zzcejVar);
        if (!zzY && z11) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (zzY) {
            zzaVar = null;
        } else {
            zzaVar = this.zzg;
        }
        if (zzaF) {
            zzceqVar = null;
        } else {
            zzceqVar = new zzceq(this.zzc, this.zzh);
        }
        zzbhn zzbhnVar = this.zzk;
        zzbhp zzbhpVar = this.zzl;
        com.google.android.gms.ads.internal.overlay.zzaa zzaaVar = this.zzv;
        zzcej zzcejVar2 = this.zzc;
        VersionInfoParcel zzn = zzcejVar2.zzn();
        if (z13) {
            zzdeqVar = null;
        } else {
            zzdeqVar = this.zzm;
        }
        if (zzX(this.zzc)) {
            zzedsVar = this.zzE;
        } else {
            zzedsVar = null;
        }
        zzx(new AdOverlayInfoParcel(zzaVar, zzceqVar, zzbhnVar, zzbhpVar, zzaaVar, zzcejVar2, z10, i10, str, zzn, zzdeqVar, zzedsVar, z12));
    }
}
