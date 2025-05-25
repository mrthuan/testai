package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Looper;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.internal.ads.zzbbc;
import com.google.android.gms.internal.ads.zzbbw;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import lib.zj.office.fc.hpsf.Constants;
import n2.k;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class zzcfi extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, zzcej {
    public static final /* synthetic */ int zza = 0;
    private final String zzA;
    private zzcfl zzB;
    private boolean zzC;
    private boolean zzD;
    private zzber zzE;
    private zzbep zzF;
    private zzazj zzG;
    private int zzH;
    private int zzI;
    private zzbci zzJ;
    private final zzbci zzK;
    private zzbci zzL;
    private final zzbcj zzM;
    private int zzN;
    private com.google.android.gms.ads.internal.overlay.zzm zzO;
    private boolean zzP;
    private final com.google.android.gms.ads.internal.util.zzck zzQ;
    private int zzR;
    private int zzS;
    private int zzT;
    private int zzU;
    private Map zzV;
    private final WindowManager zzW;
    private final zzbav zzX;
    private boolean zzY;
    private final zzcgc zzb;
    private final zzauo zzc;
    private final zzffk zzd;
    private final zzbcz zze;
    private final VersionInfoParcel zzf;
    private com.google.android.gms.ads.internal.zzm zzg;
    private final com.google.android.gms.ads.internal.zza zzh;
    private final DisplayMetrics zzi;
    private final float zzj;
    private zzfel zzk;
    private zzfeo zzl;
    private boolean zzm;
    private boolean zzn;
    private zzcer zzo;
    private com.google.android.gms.ads.internal.overlay.zzm zzp;
    private zzeeo zzq;
    private zzeem zzr;
    private zzcgd zzs;
    private final String zzt;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private boolean zzx;
    private Boolean zzy;
    private boolean zzz;

    public zzcfi(zzcgc zzcgcVar, zzcgd zzcgdVar, String str, boolean z10, boolean z11, zzauo zzauoVar, zzbcz zzbczVar, VersionInfoParcel versionInfoParcel, zzbcl zzbclVar, com.google.android.gms.ads.internal.zzm zzmVar, com.google.android.gms.ads.internal.zza zzaVar, zzbav zzbavVar, zzfel zzfelVar, zzfeo zzfeoVar, zzffk zzffkVar) {
        super(zzcgcVar);
        zzfeo zzfeoVar2;
        this.zzm = false;
        this.zzn = false;
        this.zzz = true;
        this.zzA = "";
        this.zzR = -1;
        this.zzS = -1;
        this.zzT = -1;
        this.zzU = -1;
        this.zzb = zzcgcVar;
        this.zzs = zzcgdVar;
        this.zzt = str;
        this.zzw = z10;
        this.zzc = zzauoVar;
        this.zzd = zzffkVar;
        this.zze = zzbczVar;
        this.zzf = versionInfoParcel;
        this.zzg = zzmVar;
        this.zzh = zzaVar;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.zzW = windowManager;
        com.google.android.gms.ads.internal.util.zzt zztVar = com.google.android.gms.ads.internal.zzu.B.c;
        DisplayMetrics F = com.google.android.gms.ads.internal.util.zzt.F(windowManager);
        this.zzi = F;
        this.zzj = F.density;
        this.zzX = zzbavVar;
        this.zzk = zzfelVar;
        this.zzl = zzfeoVar;
        this.zzQ = new com.google.android.gms.ads.internal.util.zzck(zzcgcVar.zza(), this, this);
        this.zzY = false;
        setBackgroundColor(0);
        final WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        zzbbn zzbbnVar = zzbbw.zzkJ;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
        if (((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue()) {
            settings.setMixedContentMode(1);
        } else {
            settings.setMixedContentMode(2);
        }
        com.google.android.gms.ads.internal.zzu zzuVar = com.google.android.gms.ads.internal.zzu.B;
        settings.setUserAgentString(zzuVar.c.v(zzcgcVar, versionInfoParcel.f10345a));
        final Context context = getContext();
        com.google.android.gms.ads.internal.util.zzcd.a(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.zzk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzf zzfVar = zzt.f10496l;
                String absolutePath = context.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath();
                WebSettings webSettings = settings;
                webSettings.setDatabasePath(absolutePath);
                webSettings.setDatabaseEnabled(true);
                webSettings.setDomStorageEnabled(true);
                webSettings.setDisplayZoomControls(false);
                webSettings.setBuiltInZoomControls(true);
                webSettings.setSupportZoom(true);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzaC)).booleanValue()) {
                    webSettings.setTextZoom(100);
                }
                webSettings.setAllowContentAccess(false);
                return Boolean.TRUE;
            }
        });
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMediaPlaybackRequiresUserGesture(false);
        setDownloadListener(this);
        zzba();
        addJavascriptInterface(new zzcfp(this, new zzcfo(this)), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        zzbi();
        zzbcj zzbcjVar = new zzbcj(new zzbcl(true, "make_wv", this.zzt));
        this.zzM = zzbcjVar;
        Context context2 = null;
        zzbcjVar.zza().zzc(null);
        if (((Boolean) zzbaVar.c.zza(zzbbw.zzbG)).booleanValue() && (zzfeoVar2 = this.zzl) != null && zzfeoVar2.zzb != null) {
            zzbcjVar.zza().zzd("gqi", this.zzl.zzb);
        }
        zzbcjVar.zza();
        zzbci zzf = zzbcl.zzf();
        this.zzK = zzf;
        zzbcjVar.zzb("native:view_create", zzf);
        this.zzL = null;
        this.zzJ = null;
        com.google.android.gms.ads.internal.util.zzcg a10 = com.google.android.gms.ads.internal.util.zzcg.a();
        a10.getClass();
        com.google.android.gms.ads.internal.util.zze.h("Updating user agent.");
        String defaultUserAgent = WebSettings.getDefaultUserAgent(zzcgcVar);
        if (!defaultUserAgent.equals(a10.f10449a)) {
            AtomicBoolean atomicBoolean = GooglePlayServicesUtilLight.f10886a;
            try {
                context2 = zzcgcVar.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused2) {
            }
            if (context2 == null) {
                zzcgcVar.getSharedPreferences("admob_user_agent", 0).edit().putString("user_agent", WebSettings.getDefaultUserAgent(zzcgcVar)).apply();
            }
            a10.f10449a = defaultUserAgent;
        }
        com.google.android.gms.ads.internal.util.zze.h("User agent is updated.");
        zzuVar.f10557g.zzt();
    }

    private final synchronized void zzba() {
        zzfel zzfelVar = this.zzk;
        if (zzfelVar != null && zzfelVar.zzam) {
            com.google.android.gms.ads.internal.util.client.zzm.b("Disabling hardware acceleration on an overlay.");
            zzbc();
            return;
        }
        if (!this.zzw && !this.zzs.zzi()) {
            com.google.android.gms.ads.internal.util.client.zzm.b("Enabling hardware acceleration on an AdView.");
            zzbe();
            return;
        }
        com.google.android.gms.ads.internal.util.client.zzm.b("Enabling hardware acceleration on an overlay.");
        zzbe();
    }

    private final synchronized void zzbb() {
        if (!this.zzP) {
            this.zzP = true;
            com.google.android.gms.ads.internal.zzu.B.f10557g.zzr();
        }
    }

    private final synchronized void zzbc() {
        if (!this.zzx) {
            setLayerType(1, null);
        }
        this.zzx = true;
    }

    private final void zzbd(boolean z10) {
        String str;
        HashMap hashMap = new HashMap();
        if (true != z10) {
            str = PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES;
        } else {
            str = "1";
        }
        hashMap.put("isVisible", str);
        zzd("onAdVisibilityChanged", hashMap);
    }

    private final synchronized void zzbe() {
        if (this.zzx) {
            setLayerType(0, null);
        }
        this.zzx = false;
    }

    private final synchronized void zzbf(String str) {
        try {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzkq)).booleanValue()) {
                com.google.android.gms.ads.internal.util.zzt.f10496l.post(new Runnable("about:blank") { // from class: com.google.android.gms.internal.ads.zzcfd
                    public final /* synthetic */ String zzb = "about:blank";

                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcfi.this.zzaW(this.zzb);
                    }
                });
            } else {
                super.loadUrl("about:blank");
            }
        } catch (Throwable th2) {
            com.google.android.gms.ads.internal.zzu.B.f10557g.zzw(th2, "AdWebViewImpl.loadUrlUnsafe");
            com.google.android.gms.ads.internal.util.client.zzm.g(5);
        }
    }

    private final void zzbg() {
        zzbcd.zza(this.zzM.zza(), this.zzK, "aeh2");
    }

    private final synchronized void zzbh() {
        Map map = this.zzV;
        if (map != null) {
            for (zzccv zzccvVar : map.values()) {
                zzccvVar.release();
            }
        }
        this.zzV = null;
    }

    private final void zzbi() {
        zzbcj zzbcjVar = this.zzM;
        if (zzbcjVar != null) {
            zzbcl zza2 = zzbcjVar.zza();
            zzbcb zzg = com.google.android.gms.ads.internal.zzu.B.f10557g.zzg();
            if (zzg != null) {
                zzg.zzf(zza2);
            }
        }
    }

    private final synchronized void zzbj() {
        Boolean zzl = com.google.android.gms.ads.internal.zzu.B.f10557g.zzl();
        this.zzy = zzl;
        if (zzl == null) {
            try {
                evaluateJavascript("(function(){})()", null);
                zzaY(Boolean.TRUE);
            } catch (IllegalStateException unused) {
                zzaY(Boolean.FALSE);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0028 A[Catch: all -> 0x0090, TryCatch #0 {, blocks: (B:3:0x0001, B:18:0x002f, B:20:0x0033, B:21:0x003d, B:25:0x0056, B:27:0x0075, B:30:0x0086, B:6:0x000f, B:8:0x0013, B:16:0x0028, B:17:0x002d, B:11:0x001a, B:13:0x0020), top: B:36:0x0001 }] */
    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcej
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void destroy() {
        /*
            r5 = this;
            monitor-enter(r5)
            r5.zzbi()     // Catch: java.lang.Throwable -> L90
            com.google.android.gms.ads.internal.util.zzck r0 = r5.zzQ     // Catch: java.lang.Throwable -> L90
            r1 = 0
            r0.f10459e = r1     // Catch: java.lang.Throwable -> L90
            android.app.Activity r2 = r0.f10457b     // Catch: java.lang.Throwable -> L90
            r3 = 0
            if (r2 != 0) goto Lf
            goto L2f
        Lf:
            boolean r4 = r0.c     // Catch: java.lang.Throwable -> L90
            if (r4 == 0) goto L2f
            android.view.Window r2 = r2.getWindow()     // Catch: java.lang.Throwable -> L90
            if (r2 != 0) goto L1a
            goto L25
        L1a:
            android.view.View r2 = r2.getDecorView()     // Catch: java.lang.Throwable -> L90
            if (r2 == 0) goto L25
            android.view.ViewTreeObserver r2 = r2.getViewTreeObserver()     // Catch: java.lang.Throwable -> L90
            goto L26
        L25:
            r2 = r3
        L26:
            if (r2 == 0) goto L2d
            android.view.ViewTreeObserver$OnGlobalLayoutListener r4 = r0.f10460f     // Catch: java.lang.Throwable -> L90
            r2.removeOnGlobalLayoutListener(r4)     // Catch: java.lang.Throwable -> L90
        L2d:
            r0.c = r1     // Catch: java.lang.Throwable -> L90
        L2f:
            com.google.android.gms.ads.internal.overlay.zzm r0 = r5.zzp     // Catch: java.lang.Throwable -> L90
            if (r0 == 0) goto L3d
            r0.zzb()     // Catch: java.lang.Throwable -> L90
            com.google.android.gms.ads.internal.overlay.zzm r0 = r5.zzp     // Catch: java.lang.Throwable -> L90
            r0.zzm()     // Catch: java.lang.Throwable -> L90
            r5.zzp = r3     // Catch: java.lang.Throwable -> L90
        L3d:
            r5.zzq = r3     // Catch: java.lang.Throwable -> L90
            r5.zzr = r3     // Catch: java.lang.Throwable -> L90
            com.google.android.gms.internal.ads.zzcer r0 = r5.zzo     // Catch: java.lang.Throwable -> L90
            r0.zzh()     // Catch: java.lang.Throwable -> L90
            r5.zzG = r3     // Catch: java.lang.Throwable -> L90
            r5.zzg = r3     // Catch: java.lang.Throwable -> L90
            r5.setOnClickListener(r3)     // Catch: java.lang.Throwable -> L90
            r5.setOnTouchListener(r3)     // Catch: java.lang.Throwable -> L90
            boolean r0 = r5.zzv     // Catch: java.lang.Throwable -> L90
            if (r0 == 0) goto L56
            monitor-exit(r5)
            return
        L56:
            com.google.android.gms.ads.internal.zzu r0 = com.google.android.gms.ads.internal.zzu.B     // Catch: java.lang.Throwable -> L90
            com.google.android.gms.internal.ads.zzcco r0 = r0.f10576z     // Catch: java.lang.Throwable -> L90
            r0.zzd(r5)     // Catch: java.lang.Throwable -> L90
            r5.zzbh()     // Catch: java.lang.Throwable -> L90
            r0 = 1
            r5.zzv = r0     // Catch: java.lang.Throwable -> L90
            com.google.android.gms.internal.ads.zzbbn r0 = com.google.android.gms.internal.ads.zzbbw.zzjS     // Catch: java.lang.Throwable -> L90
            com.google.android.gms.ads.internal.client.zzba r1 = com.google.android.gms.ads.internal.client.zzba.f10115d     // Catch: java.lang.Throwable -> L90
            com.google.android.gms.internal.ads.zzbbu r1 = r1.c     // Catch: java.lang.Throwable -> L90
            java.lang.Object r0 = r1.zza(r0)     // Catch: java.lang.Throwable -> L90
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L90
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L90
            if (r0 == 0) goto L86
            java.lang.String r0 = "Initiating WebView self destruct sequence in 3..."
            com.google.android.gms.ads.internal.util.zze.h(r0)     // Catch: java.lang.Throwable -> L90
            java.lang.String r0 = "Loading blank page in WebView, 2..."
            com.google.android.gms.ads.internal.util.zze.h(r0)     // Catch: java.lang.Throwable -> L90
            java.lang.String r0 = "about:blank"
            r5.zzbf(r0)     // Catch: java.lang.Throwable -> L90
            monitor-exit(r5)
            return
        L86:
            java.lang.String r0 = "Destroying the WebView immediately..."
            com.google.android.gms.ads.internal.util.zze.h(r0)     // Catch: java.lang.Throwable -> L90
            r5.zzX()     // Catch: java.lang.Throwable -> L90
            monitor-exit(r5)
            return
        L90:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcfi.destroy():void");
    }

    @Override // android.webkit.WebView
    public final synchronized void evaluateJavascript(final String str, final ValueCallback valueCallback) {
        if (zzaE()) {
            com.google.android.gms.ads.internal.util.client.zzm.f("#004 The webview is destroyed. Ignoring action.", null);
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
                return;
            }
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzjT)).booleanValue() && Looper.getMainLooper().getThread() != Thread.currentThread()) {
            zzbzo.zze.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfc
                @Override // java.lang.Runnable
                public final void run() {
                    zzcfi.this.zzaU(str, valueCallback);
                }
            });
        } else {
            super.evaluateJavascript(str, valueCallback);
        }
    }

    public final void finalize() {
        try {
            synchronized (this) {
                if (!this.zzv) {
                    this.zzo.zzh();
                    com.google.android.gms.ads.internal.zzu.B.f10576z.zzd(this);
                    zzbh();
                    zzbb();
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcej
    public final synchronized void loadData(String str, String str2, String str3) {
        if (!zzaE()) {
            super.loadData(str, str2, str3);
        } else {
            com.google.android.gms.ads.internal.util.client.zzm.e("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcej
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!zzaE()) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else {
            com.google.android.gms.ads.internal.util.client.zzm.e("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcej
    public final synchronized void loadUrl(final String str) {
        if (!zzaE()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzkq)).booleanValue()) {
                com.google.android.gms.ads.internal.util.zzt.f10496l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcff
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcfi.this.zzaV(str);
                    }
                });
                return;
            } else {
                super.loadUrl(str);
                return;
            }
        }
        com.google.android.gms.ads.internal.util.client.zzm.e("#004 The webview is destroyed. Ignoring action.");
    }

    @Override // com.google.android.gms.internal.ads.zzcej, com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzcer zzcerVar = this.zzo;
        if (zzcerVar != null) {
            zzcerVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        boolean z10 = true;
        if (!zzaE()) {
            com.google.android.gms.ads.internal.util.zzck zzckVar = this.zzQ;
            zzckVar.f10458d = true;
            if (zzckVar.f10459e) {
                zzckVar.a();
            }
        }
        if (this.zzY) {
            onResume();
            this.zzY = false;
        }
        boolean z11 = this.zzC;
        zzcer zzcerVar = this.zzo;
        if (zzcerVar != null && zzcerVar.zzQ()) {
            if (!this.zzD) {
                this.zzo.zza();
                this.zzo.zzb();
                this.zzD = true;
            }
            zzaZ();
        } else {
            z10 = z11;
        }
        zzbd(z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002a A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:3:0x0001, B:5:0x0008, B:8:0x0011, B:10:0x0015, B:18:0x002a, B:21:0x0032, B:13:0x001c, B:15:0x0022, B:22:0x0034, B:24:0x003b, B:26:0x003f, B:28:0x0045, B:30:0x004b, B:32:0x0055, B:33:0x0061), top: B:38:0x0001 }] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onDetachedFromWindow() {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.zzaE()     // Catch: java.lang.Throwable -> L30
            r1 = 0
            if (r0 != 0) goto L34
            com.google.android.gms.ads.internal.util.zzck r0 = r4.zzQ     // Catch: java.lang.Throwable -> L30
            r0.f10458d = r1     // Catch: java.lang.Throwable -> L30
            android.app.Activity r2 = r0.f10457b     // Catch: java.lang.Throwable -> L30
            if (r2 != 0) goto L11
            goto L34
        L11:
            boolean r3 = r0.c     // Catch: java.lang.Throwable -> L30
            if (r3 == 0) goto L34
            android.view.Window r2 = r2.getWindow()     // Catch: java.lang.Throwable -> L30
            if (r2 != 0) goto L1c
            goto L27
        L1c:
            android.view.View r2 = r2.getDecorView()     // Catch: java.lang.Throwable -> L30
            if (r2 == 0) goto L27
            android.view.ViewTreeObserver r2 = r2.getViewTreeObserver()     // Catch: java.lang.Throwable -> L30
            goto L28
        L27:
            r2 = 0
        L28:
            if (r2 == 0) goto L32
            android.view.ViewTreeObserver$OnGlobalLayoutListener r3 = r0.f10460f     // Catch: java.lang.Throwable -> L30
            r2.removeOnGlobalLayoutListener(r3)     // Catch: java.lang.Throwable -> L30
            goto L32
        L30:
            r0 = move-exception
            goto L66
        L32:
            r0.c = r1     // Catch: java.lang.Throwable -> L30
        L34:
            super.onDetachedFromWindow()     // Catch: java.lang.Throwable -> L30
            boolean r0 = r4.zzD     // Catch: java.lang.Throwable -> L30
            if (r0 == 0) goto L61
            com.google.android.gms.internal.ads.zzcer r0 = r4.zzo     // Catch: java.lang.Throwable -> L30
            if (r0 == 0) goto L61
            boolean r0 = r0.zzQ()     // Catch: java.lang.Throwable -> L30
            if (r0 == 0) goto L61
            android.view.ViewTreeObserver r0 = r4.getViewTreeObserver()     // Catch: java.lang.Throwable -> L30
            if (r0 == 0) goto L61
            android.view.ViewTreeObserver r0 = r4.getViewTreeObserver()     // Catch: java.lang.Throwable -> L30
            boolean r0 = r0.isAlive()     // Catch: java.lang.Throwable -> L30
            if (r0 == 0) goto L61
            com.google.android.gms.internal.ads.zzcer r0 = r4.zzo     // Catch: java.lang.Throwable -> L30
            r0.zza()     // Catch: java.lang.Throwable -> L30
            com.google.android.gms.internal.ads.zzcer r0 = r4.zzo     // Catch: java.lang.Throwable -> L30
            r0.zzb()     // Catch: java.lang.Throwable -> L30
            r4.zzD = r1     // Catch: java.lang.Throwable -> L30
        L61:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L30
            r4.zzbd(r1)
            return
        L66:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L30
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcfi.onDetachedFromWindow():void");
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j10) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzke)).booleanValue() && getContext() != null) {
                intent.setPackage(getContext().getPackageName());
            }
            com.google.android.gms.ads.internal.util.zzt zztVar = com.google.android.gms.ads.internal.zzu.B.c;
            com.google.android.gms.ads.internal.util.zzt.zzT(getContext(), intent);
        } catch (ActivityNotFoundException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.b("Couldn't find an Activity to view url/mimetype: " + str + " / " + str4);
            com.google.android.gms.ads.internal.zzu.B.f10557g.zzw(e10, "AdWebViewImpl.onDownloadStart: ".concat(String.valueOf(str)));
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (zzaE()) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue <= 0.0f || canScrollVertically(-1)) {
                if (axisValue >= 0.0f || canScrollVertically(1)) {
                    if (axisValue2 <= 0.0f || canScrollHorizontally(-1)) {
                        if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                            return false;
                        }
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean zzaZ = zzaZ();
        com.google.android.gms.ads.internal.overlay.zzm zzL = zzL();
        if (zzL != null && zzaZ && zzL.f10318l) {
            zzL.f10318l = false;
            zzL.c.zzaa();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01b7 A[Catch: all -> 0x01dd, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000a, B:9:0x000f, B:11:0x0015, B:13:0x0019, B:16:0x0023, B:18:0x002b, B:21:0x0030, B:23:0x0038, B:25:0x004a, B:28:0x004f, B:30:0x0056, B:34:0x0060, B:37:0x0065, B:40:0x0076, B:48:0x008c, B:42:0x007d, B:45:0x0082, B:51:0x0099, B:53:0x00a1, B:55:0x00b3, B:58:0x00b8, B:60:0x00d4, B:62:0x00dc, B:61:0x00d8, B:65:0x00e1, B:67:0x00e9, B:70:0x00f4, B:79:0x0118, B:81:0x011f, B:86:0x0127, B:88:0x0139, B:90:0x0147, B:94:0x0154, B:97:0x0159, B:99:0x019f, B:100:0x01a3, B:102:0x01aa, B:107:0x01b7, B:109:0x01bd, B:110:0x01c0, B:112:0x01c4, B:113:0x01cd, B:116:0x01d8), top: B:122:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0139 A[Catch: all -> 0x01dd, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000a, B:9:0x000f, B:11:0x0015, B:13:0x0019, B:16:0x0023, B:18:0x002b, B:21:0x0030, B:23:0x0038, B:25:0x004a, B:28:0x004f, B:30:0x0056, B:34:0x0060, B:37:0x0065, B:40:0x0076, B:48:0x008c, B:42:0x007d, B:45:0x0082, B:51:0x0099, B:53:0x00a1, B:55:0x00b3, B:58:0x00b8, B:60:0x00d4, B:62:0x00dc, B:61:0x00d8, B:65:0x00e1, B:67:0x00e9, B:70:0x00f4, B:79:0x0118, B:81:0x011f, B:86:0x0127, B:88:0x0139, B:90:0x0147, B:94:0x0154, B:97:0x0159, B:99:0x019f, B:100:0x01a3, B:102:0x01aa, B:107:0x01b7, B:109:0x01bd, B:110:0x01c0, B:112:0x01c4, B:113:0x01cd, B:116:0x01d8), top: B:122:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0159 A[Catch: all -> 0x01dd, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000a, B:9:0x000f, B:11:0x0015, B:13:0x0019, B:16:0x0023, B:18:0x002b, B:21:0x0030, B:23:0x0038, B:25:0x004a, B:28:0x004f, B:30:0x0056, B:34:0x0060, B:37:0x0065, B:40:0x0076, B:48:0x008c, B:42:0x007d, B:45:0x0082, B:51:0x0099, B:53:0x00a1, B:55:0x00b3, B:58:0x00b8, B:60:0x00d4, B:62:0x00dc, B:61:0x00d8, B:65:0x00e1, B:67:0x00e9, B:70:0x00f4, B:79:0x0118, B:81:0x011f, B:86:0x0127, B:88:0x0139, B:90:0x0147, B:94:0x0154, B:97:0x0159, B:99:0x019f, B:100:0x01a3, B:102:0x01aa, B:107:0x01b7, B:109:0x01bd, B:110:0x01c0, B:112:0x01c4, B:113:0x01cd, B:116:0x01d8), top: B:122:0x0003 }] */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    @android.annotation.SuppressLint({"DrawAllocation"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void onMeasure(int r10, int r11) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcfi.onMeasure(int, int):void");
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcej
    public final void onPause() {
        if (!zzaE()) {
            try {
                super.onPause();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzlE)).booleanValue() && b.b.I("MUTE_AUDIO")) {
                    com.google.android.gms.ads.internal.util.client.zzm.b("Muting webview");
                    int i10 = m2.d.f21795a;
                    if (n2.j.f22328d.d()) {
                        k.a.f22330a.createWebView(this).setAudioMuted(true);
                        return;
                    }
                    throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                }
            } catch (Exception e10) {
                com.google.android.gms.ads.internal.util.client.zzm.g(6);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzlH)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzu.B.f10557g.zzw(e10, "AdWebViewImpl.onPause");
                }
            }
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcej
    public final void onResume() {
        if (!zzaE()) {
            try {
                super.onResume();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzlE)).booleanValue() && b.b.I("MUTE_AUDIO")) {
                    com.google.android.gms.ads.internal.util.client.zzm.b("Unmuting webview");
                    int i10 = m2.d.f21795a;
                    if (n2.j.f22328d.d()) {
                        k.a.f22330a.createWebView(this).setAudioMuted(false);
                        return;
                    }
                    throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                }
            } catch (Exception e10) {
                com.google.android.gms.ads.internal.util.client.zzm.g(6);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzlH)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzu.B.f10557g.zzw(e10, "AdWebViewImpl.onResume");
                }
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.zzo.zzQ() && !this.zzo.zzO()) {
            synchronized (this) {
                zzber zzberVar = this.zzE;
                if (zzberVar != null) {
                    zzberVar.zzd(motionEvent);
                }
            }
        } else {
            zzauo zzauoVar = this.zzc;
            if (zzauoVar != null) {
                zzauoVar.zzd(motionEvent);
            }
            zzbcz zzbczVar = this.zze;
            if (zzbczVar != null) {
                zzbczVar.zzb(motionEvent);
            }
        }
        if (zzaE()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcej
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof zzcer) {
            this.zzo = (zzcer) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (zzaE()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final synchronized void zzA(int i10) {
        this.zzN = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzcej, com.google.android.gms.internal.ads.zzcbk
    public final synchronized void zzC(zzcfl zzcflVar) {
        if (this.zzB != null) {
            com.google.android.gms.ads.internal.util.client.zzm.c("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.zzB = zzcflVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcej, com.google.android.gms.internal.ads.zzcea
    public final zzfel zzD() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final Context zzE() {
        return this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final WebViewClient zzH() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzcej, com.google.android.gms.internal.ads.zzcfw
    public final zzauo zzI() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final synchronized zzazj zzJ() {
        return this.zzG;
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final synchronized zzber zzK() {
        return this.zzE;
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final synchronized com.google.android.gms.ads.internal.overlay.zzm zzL() {
        return this.zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final synchronized com.google.android.gms.ads.internal.overlay.zzm zzM() {
        return this.zzO;
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final /* synthetic */ zzcgb zzN() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzcej, com.google.android.gms.internal.ads.zzcfv
    public final synchronized zzcgd zzO() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final synchronized zzeem zzP() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final synchronized zzeeo zzQ() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzcej, com.google.android.gms.internal.ads.zzcfm
    public final zzfeo zzR() {
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final zzffk zzS() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final y9.a zzT() {
        zzbcz zzbczVar = this.zze;
        if (zzbczVar == null) {
            return zzgcj.zzh(null);
        }
        return zzbczVar.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final synchronized String zzU() {
        return this.zzt;
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final List zzV() {
        return new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final void zzW(zzfel zzfelVar, zzfeo zzfeoVar) {
        this.zzk = zzfelVar;
        this.zzl = zzfeoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final synchronized void zzX() {
        com.google.android.gms.ads.internal.util.zze.h("Destroying WebView!");
        zzbb();
        com.google.android.gms.ads.internal.util.zzt.f10496l.post(new zzcfh(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final void zzY() {
        zzbg();
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.zzf.f10345a);
        zzd("onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final void zzZ(int i10) {
        if (i10 == 0) {
            zzbcj zzbcjVar = this.zzM;
            zzbcd.zza(zzbcjVar.zza(), this.zzK, "aebb2");
        }
        zzbg();
        this.zzM.zza();
        this.zzM.zza().zzd("close_type", String.valueOf(i10));
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i10));
        hashMap.put("version", this.zzf.f10345a);
        zzd("onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final void zza(String str) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final void zzaA(String str, Predicate predicate) {
        zzcer zzcerVar = this.zzo;
        if (zzcerVar != null) {
            zzcerVar.zzN(str, predicate);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final synchronized boolean zzaB() {
        return this.zzu;
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final synchronized boolean zzaC() {
        if (this.zzH > 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final boolean zzaD(final boolean z10, final int i10) {
        destroy();
        this.zzX.zzb(new zzbau() { // from class: com.google.android.gms.internal.ads.zzcfe
            @Override // com.google.android.gms.internal.ads.zzbau
            public final void zza(zzbbc.zzt.zza zzaVar) {
                int i11 = zzcfi.zza;
                zzbbc.zzbl.zza zzc = zzbbc.zzbl.zzc();
                boolean zzf = zzc.zzf();
                boolean z11 = z10;
                if (zzf != z11) {
                    zzc.zzd(z11);
                }
                zzc.zze(i10);
                zzaVar.zzab(zzc.zzbr());
            }
        });
        this.zzX.zzc(Constants.CP_MAC_KOREAN);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final synchronized boolean zzaE() {
        return this.zzv;
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final synchronized boolean zzaF() {
        return this.zzw;
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final boolean zzaG() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final synchronized boolean zzaH() {
        return this.zzz;
    }

    @Override // com.google.android.gms.internal.ads.zzcft
    public final void zzaJ(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z10, boolean z11) {
        this.zzo.zzu(zzcVar, z10, z11);
    }

    @Override // com.google.android.gms.internal.ads.zzcft
    public final void zzaK(String str, String str2, int i10) {
        this.zzo.zzv(str, str2, 14);
    }

    @Override // com.google.android.gms.internal.ads.zzcft
    public final void zzaL(boolean z10, int i10, boolean z11) {
        this.zzo.zzw(z10, i10, z11);
    }

    @Override // com.google.android.gms.internal.ads.zzcft
    public final void zzaM(boolean z10, int i10, String str, String str2, boolean z11) {
        this.zzo.zzy(z10, i10, str, str2, z11);
    }

    @Override // com.google.android.gms.internal.ads.zzcft
    public final void zzaN(boolean z10, int i10, String str, boolean z11, boolean z12) {
        this.zzo.zzz(z10, i10, str, z11, z12);
    }

    public final zzcer zzaO() {
        return this.zzo;
    }

    public final synchronized Boolean zzaP() {
        return this.zzy;
    }

    public final synchronized void zzaS(String str, ValueCallback valueCallback) {
        if (!zzaE()) {
            evaluateJavascript(str, null);
        } else {
            com.google.android.gms.ads.internal.util.client.zzm.e("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final void zzaT(String str) {
        if (zzaP() == null) {
            zzbj();
        }
        if (zzaP().booleanValue()) {
            zzaS(str, null);
        } else {
            zzaX("javascript:".concat(str));
        }
    }

    public final /* synthetic */ void zzaU(String str, ValueCallback valueCallback) {
        super.evaluateJavascript(str, valueCallback);
    }

    public final /* synthetic */ void zzaV(String str) {
        super.loadUrl(str);
    }

    public final /* synthetic */ void zzaW(String str) {
        super.loadUrl("about:blank");
    }

    public final synchronized void zzaX(String str) {
        if (!zzaE()) {
            loadUrl(str);
        } else {
            com.google.android.gms.ads.internal.util.client.zzm.e("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final void zzaY(Boolean bool) {
        synchronized (this) {
            this.zzy = bool;
        }
        com.google.android.gms.ads.internal.zzu.B.f10557g.zzy(bool);
    }

    public final boolean zzaZ() {
        DisplayMetrics displayMetrics;
        int i10;
        int i11;
        boolean z10 = false;
        if (this.zzo.zzP() || this.zzo.zzQ()) {
            com.google.android.gms.ads.internal.util.client.zzf zzfVar = com.google.android.gms.ads.internal.client.zzay.f10107f.f10108a;
            DisplayMetrics displayMetrics2 = this.zzi;
            int i12 = displayMetrics2.widthPixels;
            zzfru zzfruVar = com.google.android.gms.ads.internal.util.client.zzf.f10351b;
            int round = Math.round(i12 / displayMetrics2.density);
            int round2 = Math.round(displayMetrics.heightPixels / this.zzi.density);
            Activity zza2 = this.zzb.zza();
            if (zza2 != null && zza2.getWindow() != null) {
                com.google.android.gms.ads.internal.util.zzt zztVar = com.google.android.gms.ads.internal.zzu.B.c;
                int[] m10 = com.google.android.gms.ads.internal.util.zzt.m(zza2);
                int round3 = Math.round(m10[0] / this.zzi.density);
                i11 = Math.round(m10[1] / this.zzi.density);
                i10 = round3;
            } else {
                i10 = round;
                i11 = round2;
            }
            int i13 = this.zzS;
            if (i13 != round || this.zzR != round2 || this.zzT != i10 || this.zzU != i11) {
                if (i13 != round || this.zzR != round2) {
                    z10 = true;
                }
                this.zzS = round;
                this.zzR = round2;
                this.zzT = i10;
                this.zzU = i11;
                new zzbrq(this, "").zzj(round, round2, i10, i11, this.zzi.density, this.zzW.getDefaultDisplay().getRotation());
                return z10;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final void zzaa() {
        if (this.zzJ == null) {
            zzbcj zzbcjVar = this.zzM;
            zzbcd.zza(zzbcjVar.zza(), this.zzK, "aes2");
            this.zzM.zza();
            zzbci zzf = zzbcl.zzf();
            this.zzJ = zzf;
            this.zzM.zzb("native:view_show", zzf);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.zzf.f10345a);
        zzd("onshow", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final void zzab() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final void zzac(boolean z10) {
        this.zzo.zzi(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final void zzad() {
        com.google.android.gms.ads.internal.util.zzck zzckVar = this.zzQ;
        zzckVar.f10459e = true;
        if (zzckVar.f10458d) {
            zzckVar.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final synchronized void zzae(String str, String str2, String str3) {
        String str4;
        if (!zzaE()) {
            String[] strArr = new String[1];
            String str5 = (String) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzI);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("version", str5);
                jSONObject.put("sdk", "Google Mobile Ads");
                jSONObject.put("sdkVersion", "12.4.51-000");
                str4 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
            } catch (JSONException unused) {
                com.google.android.gms.ads.internal.util.client.zzm.g(5);
                str4 = null;
            }
            strArr[0] = str4;
            super.loadDataWithBaseURL(str, zzcfu.zzb(str2, strArr), "text/html", "UTF-8", null);
            return;
        }
        com.google.android.gms.ads.internal.util.client.zzm.e("#004 The webview is destroyed. Ignoring action.");
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final void zzaf() {
        if (this.zzL == null) {
            this.zzM.zza();
            zzbci zzf = zzbcl.zzf();
            this.zzL = zzf;
            this.zzM.zzb("native:view_load", zzf);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final void zzag(String str, zzbix zzbixVar) {
        zzcer zzcerVar = this.zzo;
        if (zzcerVar != null) {
            zzcerVar.zzA(str, zzbixVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final void zzah() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final synchronized void zzai(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.zzp = zzmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final synchronized void zzaj(zzcgd zzcgdVar) {
        this.zzs = zzcgdVar;
        requestLayout();
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final synchronized void zzak(zzazj zzazjVar) {
        this.zzG = zzazjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final synchronized void zzal(boolean z10) {
        this.zzz = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final void zzam() {
        setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final void zzan(Context context) {
        this.zzb.setBaseContext(context);
        this.zzQ.f10457b = this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final synchronized void zzao(boolean z10) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzp;
        if (zzmVar != null) {
            zzmVar.R0(this.zzo.zzP(), z10);
        } else {
            this.zzu = z10;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final synchronized void zzap(zzbep zzbepVar) {
        this.zzF = zzbepVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final synchronized void zzaq(boolean z10) {
        String str;
        boolean z11 = this.zzw;
        this.zzw = z10;
        zzba();
        if (z10 != z11) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzJ)).booleanValue() || !this.zzs.zzi()) {
                zzbrq zzbrqVar = new zzbrq(this, "");
                if (true != z10) {
                    str = "default";
                } else {
                    str = "expanded";
                }
                zzbrqVar.zzl(str);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final synchronized void zzar(zzber zzberVar) {
        this.zzE = zzberVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final synchronized void zzas(zzeem zzeemVar) {
        this.zzr = zzeemVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final synchronized void zzat(zzeeo zzeeoVar) {
        this.zzq = zzeeoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final synchronized void zzau(int i10) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzp;
        if (zzmVar != null) {
            zzmVar.K(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final void zzav(boolean z10) {
        this.zzY = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final synchronized void zzaw(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.zzO = zzmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final synchronized void zzax(boolean z10) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar;
        int i10 = this.zzH;
        int i11 = 1;
        if (true != z10) {
            i11 = -1;
        }
        int i12 = i10 + i11;
        this.zzH = i12;
        if (i12 <= 0 && (zzmVar = this.zzp) != null) {
            zzmVar.zzE();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final synchronized void zzay(boolean z10) {
        if (z10) {
            setBackgroundColor(0);
        }
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzp;
        if (zzmVar != null) {
            if (z10) {
                zzmVar.f10317k.setBackgroundColor(0);
            } else {
                zzmVar.f10317k.setBackgroundColor(-16777216);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final void zzaz(String str, zzbix zzbixVar) {
        zzcer zzcerVar = this.zzo;
        if (zzcerVar != null) {
            zzcerVar.zzM(str, zzbixVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final void zzb(String str, String str2) {
        zzaT(a0.a.j(str, "(", str2, ");"));
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final void zzd(String str, Map map) {
        try {
            zze(str, com.google.android.gms.ads.internal.client.zzay.f10107f.f10108a.j(map));
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.e("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdeq
    public final void zzdG() {
        zzcer zzcerVar = this.zzo;
        if (zzcerVar != null) {
            zzcerVar.zzdG();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdeq
    public final void zzdf() {
        zzcer zzcerVar = this.zzo;
        if (zzcerVar != null) {
            zzcerVar.zzdf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcej, com.google.android.gms.ads.internal.zzm
    public final synchronized void zzdg() {
        com.google.android.gms.ads.internal.zzm zzmVar = this.zzg;
        if (zzmVar != null) {
            zzmVar.zzdg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcej, com.google.android.gms.ads.internal.zzm
    public final synchronized void zzdh() {
        com.google.android.gms.ads.internal.zzm zzmVar = this.zzg;
        if (zzmVar != null) {
            zzmVar.zzdh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final synchronized String zzdi() {
        return this.zzA;
    }

    @Override // com.google.android.gms.internal.ads.zzaxw
    public final void zzdp(zzaxv zzaxvVar) {
        boolean z10;
        synchronized (this) {
            z10 = zzaxvVar.zzj;
            this.zzC = z10;
        }
        zzbd(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final void zze(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        StringBuilder f10 = android.support.v4.media.session.h.f("(window.AFMA_ReceiveMessage || function() {})('", str, "',", jSONObject.toString(), ");");
        com.google.android.gms.ads.internal.util.client.zzm.b("Dispatching AFMA event: ".concat(f10.toString()));
        zzaT(f10.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final synchronized int zzf() {
        return this.zzN;
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final int zzg() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final int zzh() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzcej, com.google.android.gms.internal.ads.zzcfq, com.google.android.gms.internal.ads.zzcbk
    public final Activity zzi() {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcej, com.google.android.gms.internal.ads.zzcbk
    public final com.google.android.gms.ads.internal.zza zzj() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final zzbci zzk() {
        return this.zzK;
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final void zzl(String str, JSONObject jSONObject) {
        zzb(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzcej, com.google.android.gms.internal.ads.zzcbk
    public final zzbcj zzm() {
        return this.zzM;
    }

    @Override // com.google.android.gms.internal.ads.zzcej, com.google.android.gms.internal.ads.zzcfx, com.google.android.gms.internal.ads.zzcbk
    public final VersionInfoParcel zzn() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final zzcaz zzo() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final synchronized zzccv zzp(String str) {
        Map map = this.zzV;
        if (map == null) {
            return null;
        }
        return (zzccv) map.get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcej, com.google.android.gms.internal.ads.zzcbk
    public final synchronized zzcfl zzq() {
        return this.zzB;
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final synchronized String zzr() {
        zzfeo zzfeoVar = this.zzl;
        if (zzfeoVar != null) {
            return zzfeoVar.zzb;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcej, com.google.android.gms.internal.ads.zzcbk
    public final synchronized void zzt(String str, zzccv zzccvVar) {
        if (this.zzV == null) {
            this.zzV = new HashMap();
        }
        this.zzV.put(str, zzccvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final void zzu() {
        com.google.android.gms.ads.internal.overlay.zzm zzL = zzL();
        if (zzL != null) {
            zzL.f10317k.f20523b = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final void zzv(boolean z10, long j10) {
        String str;
        HashMap hashMap = new HashMap(2);
        if (true != z10) {
            str = PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES;
        } else {
            str = "1";
        }
        hashMap.put("success", str);
        hashMap.put("duration", Long.toString(j10));
        zzd("onCacheAccessComplete", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final synchronized void zzw() {
        zzbep zzbepVar = this.zzF;
        if (zzbepVar != null) {
            final zzdnb zzdnbVar = (zzdnb) zzbepVar;
            com.google.android.gms.ads.internal.util.zzt.f10496l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdmz
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        zzdnb.this.zzd();
                    } catch (RemoteException e10) {
                        com.google.android.gms.ads.internal.util.client.zzm.f("#007 Could not call remote method.", e10);
                    }
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final void zzz(boolean z10) {
        this.zzo.zzD(false);
    }

    @Override // com.google.android.gms.internal.ads.zzcej, com.google.android.gms.internal.ads.zzcfy
    public final View zzF() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final WebView zzG() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final void zzB(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final void zzx(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final void zzy(int i10) {
    }
}
