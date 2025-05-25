package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Base64;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.webkit.JsResult;
import android.webkit.URLUtil;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.iab.omid.library.inmobi.Omid;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.adquality.models.AdQualityControl;
import com.inmobi.ads.WatermarkData;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.media.S9;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.text.Regex;
import lib.zj.office.fc.hpsf.Variant;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class S9 extends B1 implements r, G1, InterfaceC1775q6, GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, InterfaceC1628f9, Ba, A9 {
    public static final K9 M0 = new K9();
    public static final I9 N0 = new I9();
    public static final String O0 = "S9";
    public static final C1564b1 P0 = new C1564b1((Object) Boolean.FALSE, (cg.a) J9.f14382a, false, true);
    public boolean A;
    public final O9 A0;
    public boolean B;
    public final N9 B0;
    public boolean C;
    public final L9 C0;
    public boolean D;
    public boolean D0;
    public oc E;
    public Integer E0;
    public boolean F;
    public Integer F0;
    public boolean G;
    public final ConcurrentHashMap G0;
    public String H;
    public A2 H0;
    public final AtomicBoolean I;
    public final P9 I0;
    public final Object J;
    public final R9 J0;
    public final Object K;
    public final Q9 K0;
    public boolean L;
    public JSONObject L0;
    public final boolean M;
    public View N;
    public WebChromeClient.CustomViewCallback O;
    public int P;
    public long Q;
    public String R;
    public final AtomicBoolean S;
    public final Z9 T;
    public String U;
    public Map V;
    public F1 W;

    /* renamed from: a0  reason: collision with root package name */
    public r f14649a0;

    /* renamed from: b  reason: collision with root package name */
    public final byte f14650b;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f14651b0;
    public final Set c;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f14652c0;

    /* renamed from: d  reason: collision with root package name */
    public String f14653d;

    /* renamed from: d0  reason: collision with root package name */
    public K f14654d0;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f14655e;

    /* renamed from: e0  reason: collision with root package name */
    public AbstractC1701kc f14656e0;

    /* renamed from: f  reason: collision with root package name */
    public String f14657f;

    /* renamed from: f0  reason: collision with root package name */
    public final boolean f14658f0;

    /* renamed from: g  reason: collision with root package name */
    public long f14659g;

    /* renamed from: g0  reason: collision with root package name */
    public int f14660g0;

    /* renamed from: h  reason: collision with root package name */
    public final V9 f14661h;

    /* renamed from: h0  reason: collision with root package name */
    public String f14662h0;

    /* renamed from: i  reason: collision with root package name */
    public final L5 f14663i;

    /* renamed from: i0  reason: collision with root package name */
    public int[] f14664i0;

    /* renamed from: j  reason: collision with root package name */
    public final A4 f14665j;

    /* renamed from: j0  reason: collision with root package name */
    public long f14666j0;

    /* renamed from: k  reason: collision with root package name */
    public byte f14667k;

    /* renamed from: k0  reason: collision with root package name */
    public int f14668k0;

    /* renamed from: l  reason: collision with root package name */
    public S9 f14669l;

    /* renamed from: l0  reason: collision with root package name */
    public int f14670l0;

    /* renamed from: m  reason: collision with root package name */
    public WeakReference f14671m;

    /* renamed from: m0  reason: collision with root package name */
    public int f14672m0;

    /* renamed from: n  reason: collision with root package name */
    public WeakReference f14673n;

    /* renamed from: n0  reason: collision with root package name */
    public final C1787r6 f14674n0;

    /* renamed from: o  reason: collision with root package name */
    public U9 f14675o;

    /* renamed from: o0  reason: collision with root package name */
    public final GestureDetector f14676o0;

    /* renamed from: p  reason: collision with root package name */
    public String f14677p;

    /* renamed from: p0  reason: collision with root package name */
    public boolean f14678p0;

    /* renamed from: q  reason: collision with root package name */
    public C1800s6 f14679q;

    /* renamed from: q0  reason: collision with root package name */
    public C1772q3 f14680q0;

    /* renamed from: r  reason: collision with root package name */
    public C1891z6 f14681r;

    /* renamed from: r0  reason: collision with root package name */
    public InterfaceC1746o3 f14682r0;

    /* renamed from: s  reason: collision with root package name */
    public C1878y6 f14683s;

    /* renamed from: s0  reason: collision with root package name */
    public String f14684s0;

    /* renamed from: t  reason: collision with root package name */
    public AdConfig f14685t;

    /* renamed from: t0  reason: collision with root package name */
    public C1614e9 f14686t0;

    /* renamed from: u  reason: collision with root package name */
    public boolean f14687u;

    /* renamed from: u0  reason: collision with root package name */
    public W f14688u0;

    /* renamed from: v  reason: collision with root package name */
    public boolean f14689v;

    /* renamed from: v0  reason: collision with root package name */
    public final AtomicBoolean f14690v0;

    /* renamed from: w  reason: collision with root package name */
    public I3 f14691w;

    /* renamed from: w0  reason: collision with root package name */
    public boolean f14692w0;

    /* renamed from: x  reason: collision with root package name */
    public C1713la f14693x;

    /* renamed from: x0  reason: collision with root package name */
    public Map f14694x0;

    /* renamed from: y  reason: collision with root package name */
    public JSONObject f14695y;

    /* renamed from: y0  reason: collision with root package name */
    public final M9 f14696y0;

    /* renamed from: z  reason: collision with root package name */
    public JSONObject f14697z;

    /* renamed from: z0  reason: collision with root package name */
    public String f14698z0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public S9(android.content.Context r4, byte r5, java.util.Set r6, java.lang.String r7, boolean r8, java.lang.String r9, long r10, com.inmobi.media.V9 r12, com.inmobi.media.L5 r13, com.inmobi.media.A4 r14, int r15) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.S9.<init>(android.content.Context, byte, java.util.Set, java.lang.String, boolean, java.lang.String, long, com.inmobi.media.V9, com.inmobi.media.L5, com.inmobi.media.A4, int):void");
    }

    public static final void a(S9 this$0, byte[] overlayBytes, WatermarkData watermarkData) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        kotlin.jvm.internal.g.e(overlayBytes, "$overlayBytes");
        kotlin.jvm.internal.g.e(watermarkData, "$watermarkData");
        if (this$0.S.get()) {
            return;
        }
        A4 a42 = this$0.f14665j;
        if (a42 != null) {
            String TAG = O0;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).c(TAG, "adding overlay to renderview");
        }
        Context context = this$0.getContext();
        kotlin.jvm.internal.g.d(context, "getContext(...)");
        FrameLayout overlayLayout = yc.a(context, overlayBytes, watermarkData.getAlpha());
        kotlin.jvm.internal.g.e(overlayLayout, "overlayLayout");
        if (this$0.getParent() != null) {
            ViewParent parent = this$0.getParent();
            kotlin.jvm.internal.g.c(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).addView(overlayLayout, 0);
        }
        this$0.getViewableAd().a(overlayLayout, FriendlyObstructionPurpose.NOT_VISIBLE);
        this$0.S.set(true);
    }

    private final AdConfig.MraidConfig getMraidConfig() {
        AdConfig adConfig = this.f14685t;
        if (adConfig != null) {
            return adConfig.getMraidConfig();
        }
        kotlin.jvm.internal.g.i("mAdConfig");
        throw null;
    }

    private final int getVisibilityTrackingMinPercentage() {
        if (kotlin.jvm.internal.g.a("audio", getAdType())) {
            AdConfig adConfig = this.f14685t;
            if (adConfig != null) {
                return adConfig.getViewability().getAudioImpressionMinPercentageViewed();
            }
            kotlin.jvm.internal.g.i("mAdConfig");
            throw null;
        }
        AdConfig adConfig2 = this.f14685t;
        if (adConfig2 != null) {
            return adConfig2.getViewability().getWebImpressionMinPercentageViewed();
        }
        kotlin.jvm.internal.g.i("mAdConfig");
        throw null;
    }

    private final void setSafeArea(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("1");
        if (optJSONObject != null) {
            this.G0.put(1, optJSONObject);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject(PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES);
        if (optJSONObject2 != null) {
            this.G0.put(0, optJSONObject2);
        }
    }

    @Override // com.inmobi.media.r
    public final void b() {
        A4 a42 = this.f14665j;
        if (a42 != null) {
            String str = O0;
            ((B4) a42).a(str, G9.a(this, str, "TAG", "destroyContainer "));
        }
        if (this.I.get()) {
            return;
        }
        if (!this.D) {
            this.D = true;
            return;
        }
        this.I.set(true);
        A2 a22 = this.H0;
        if (a22 != null) {
            a22.b();
        }
        this.L = true;
        this.P = -1;
        removeJavascriptInterface("sdkController");
        C1878y6 c1878y6 = this.f14683s;
        if (c1878y6 != null) {
            C1681j6 c1681j6 = c1878y6.f15680d;
            if (c1681j6 != null) {
                c1681j6.a();
            }
            c1878y6.f15680d = null;
            C1681j6 c1681j62 = c1878y6.f15681e;
            if (c1681j62 != null) {
                c1681j62.a();
            }
            c1878y6.f15681e = null;
            C1681j6 c1681j63 = c1878y6.f15682f;
            if (c1681j63 != null) {
                c1681j63.a();
            }
            c1878y6.f15682f = null;
        }
        this.f14671m.clear();
        WeakReference weakReference = this.f14673n;
        if (weakReference != null) {
            weakReference.clear();
        }
        AbstractC1701kc abstractC1701kc = this.f14656e0;
        if (abstractC1701kc != null) {
            abstractC1701kc.e();
        }
        AbstractC1701kc abstractC1701kc2 = this.f14656e0;
        if (abstractC1701kc2 != null) {
            abstractC1701kc2.a();
        }
        setFriendlyViews(null);
        this.f14682r0 = null;
        this.f14675o = null;
        this.f14649a0 = null;
        this.f14654d0 = null;
        ViewParent parent = getParent();
        if (parent != null) {
            ((ViewGroup) parent).removeView(this);
            removeAllViews();
        }
        AdConfig adConfig = this.f14685t;
        if (adConfig != null) {
            AdConfig.OmidConfig omidConfig = adConfig.getViewability().getOmidConfig();
            if (this.f14658f0 && omidConfig.isOmidEnabled()) {
                AbstractC1558a9.f14936a.getClass();
                if (Omid.isActive()) {
                    new W9(this, omidConfig.getWebViewRetainTime()).a();
                    return;
                }
            }
            destroy();
            return;
        }
        kotlin.jvm.internal.g.i("mAdConfig");
        throw null;
    }

    public final void c(boolean z10) {
        AdQualityControl adQualityControl;
        Activity activity;
        AdQualityControl adQualityControl2;
        oc ocVar = z10 ? oc.c : oc.f15366b;
        if (this.E != ocVar) {
            A4 a42 = this.f14665j;
            if (a42 != null) {
                String TAG = O0;
                kotlin.jvm.internal.g.d(TAG, "TAG");
                ((B4) a42).a(TAG, "handleVisibilityChange " + ocVar + ' ' + this);
            }
            if (this.L) {
                return;
            }
            this.E = ocVar;
            if (z10) {
                getListener().i(this);
            }
            A4 a43 = this.f14665j;
            if (a43 != null) {
                String TAG2 = O0;
                kotlin.jvm.internal.g.d(TAG2, "TAG");
                ((B4) a43).a(TAG2, "fireViewableChange " + this + ' ' + z10);
            }
            b("window.mraidview.broadcastEvent('viewableChange'," + z10 + ");");
            A4 a44 = this.f14665j;
            if (a44 != null) {
                String TAG3 = O0;
                kotlin.jvm.internal.g.d(TAG3, "TAG");
                ((B4) a44).c(TAG3, "fireAQSession");
            }
            A4 a45 = this.f14665j;
            if (a45 != null) {
                String str = O0;
                StringBuilder a10 = A5.a(str, "TAG", "AQ - ");
                a10.append(getAdType());
                a10.append(" type - sdk - ");
                a10.append(Build.VERSION.SDK_INT);
                ((B4) a45).a(str, a10.toString());
            }
            boolean z11 = false;
            if (kotlin.jvm.internal.g.a(getAdType(), "int") && Build.VERSION.SDK_INT >= 29 && (activity = (Activity) this.f14671m.get()) != null) {
                W w7 = this.f14688u0;
                if (w7 != null) {
                    if (w7.c.get()) {
                        w7.a("ad quality session is already in progress. skipping...");
                    } else if (!w7.f14760a.getEnabled()) {
                        w7.a("config kill switch - false. ad quality will skip");
                    } else if (w7.f14765g == null) {
                        w7.a("setup not done. skipping");
                    } else {
                        z11 = true;
                    }
                    if (!z11) {
                        w7.a("session state invalid");
                        return;
                    }
                    w7.a("session start trigger...");
                    w7.c.set(true);
                    AdQualityControl adQualityControl3 = w7.f14765g;
                    if (adQualityControl3 == null || !adQualityControl3.getTakeScreenshot() || (adQualityControl2 = w7.f14765g) == null) {
                        return;
                    }
                    w7.a(activity, adQualityControl2.getScreenshotDelayInSeconds() * 1000, false, (M9) null);
                    return;
                }
                kotlin.jvm.internal.g.i("adQualityManager");
                throw null;
            }
            W w10 = this.f14688u0;
            if (w10 != null) {
                if (w10.c.get()) {
                    w10.a("ad quality session is already in progress. skipping...");
                } else if (!w10.f14760a.getEnabled()) {
                    w10.a("config kill switch - false. ad quality will skip");
                } else if (w10.f14765g == null) {
                    w10.a("setup not done. skipping");
                } else {
                    z11 = true;
                }
                if (!z11) {
                    w10.a("session state invalid");
                    return;
                }
                w10.a("session start trigger...");
                w10.c.set(true);
                AdQualityControl adQualityControl4 = w10.f14765g;
                if (adQualityControl4 == null || !adQualityControl4.getTakeScreenshot() || (adQualityControl = w10.f14765g) == null) {
                    return;
                }
                w10.a((View) this, adQualityControl.getScreenshotDelayInSeconds() * 1000, false, (M9) null);
                return;
            }
            kotlin.jvm.internal.g.i("adQualityManager");
            throw null;
        }
    }

    public final void d(String str) {
        Z9 z92 = this.T;
        if (z92 != null) {
            z92.b();
        }
        A4 a42 = this.f14665j;
        if (a42 != null) {
            String str2 = O0;
            ((B4) a42).a(str2, G9.a(this, str2, "TAG", "loadUrlInWebView "));
        }
        this.L = false;
        if (this.I.get() || str == null) {
            return;
        }
        loadUrl(str);
    }

    public final void e(String str) {
        int hashCode;
        A4 a42 = this.f14665j;
        if (a42 != null) {
            String str2 = O0;
            ((B4) a42).c(str2, G9.a(this, str2, "TAG", "processExpandRequest "));
        }
        if (!kotlin.jvm.internal.g.a("Default", this.f14677p) && !kotlin.jvm.internal.g.a("Resized", this.f14677p)) {
            A4 a43 = this.f14665j;
            if (a43 != null) {
                String str3 = O0;
                StringBuilder a10 = A5.a(str3, "TAG", "Render view state must be either DEFAULT or RESIZED to admit the expand request. Current state:");
                a10.append(this.f14677p);
                ((B4) a43).b(str3, a10.toString());
                return;
            }
            return;
        }
        this.L = true;
        C1800s6 c1800s6 = this.f14679q;
        if (c1800s6 != null) {
            A4 a44 = c1800s6.c;
            if (a44 != null) {
                String TAG = c1800s6.f15442d;
                kotlin.jvm.internal.g.d(TAG, "TAG");
                ((B4) a44).c(TAG, "doExpand");
            }
            if (c1800s6.f15443e == null) {
                ViewParent parent = c1800s6.f15440a.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                c1800s6.f15443e = viewGroup;
                if (viewGroup != null) {
                    c1800s6.f15444f = viewGroup.indexOfChild(c1800s6.f15440a);
                }
            }
            I3 expandProperties = c1800s6.f15440a.getExpandProperties();
            if (URLUtil.isValidUrl(str)) {
                try {
                    S9 s92 = new S9(c1800s6.f15440a.getContainerContext(), (byte) 0, null, c1800s6.f15440a.getImpressionId(), false, null, 0L, null, null, c1800s6.c, OS2WindowsMetricsTable.WEIGHT_CLASS_MEDIUM);
                    s92.a(c1800s6.f15440a.getListener(), c1800s6.f15440a.getAdConfig());
                    s92.setOriginalRenderView(c1800s6.f15440a);
                    kotlin.jvm.internal.g.b(str);
                    s92.loadUrl(str);
                    s92.setPlacementId(c1800s6.f15440a.getPlacementId());
                    s92.setAllowAutoRedirection(c1800s6.f15440a.getAllowAutoRedirection());
                    s92.setCreativeId(c1800s6.f15440a.getCreativeId());
                    SparseArray sparseArray = InMobiAdActivity.f14092j;
                    hashCode = s92.hashCode();
                    InMobiAdActivity.f14092j.put(hashCode, s92);
                    if (expandProperties != null) {
                        s92.setUseCustomClose(c1800s6.f15440a.C);
                    }
                } catch (Exception e10) {
                    A4 a45 = c1800s6.c;
                    if (a45 != null) {
                        String TAG2 = c1800s6.f15442d;
                        kotlin.jvm.internal.g.d(TAG2, "TAG");
                        ((B4) a45).a(TAG2, "Exception while initializing Expanded browser", e10);
                    }
                    Q4 q42 = Q4.f14590a;
                    Q4.c.a(AbstractC1863x4.a(e10, "event"));
                    c1800s6.f15440a.getListener().a(c1800s6.f15440a, (short) 2176);
                }
            } else {
                ViewGroup viewGroup2 = c1800s6.f15443e;
                if (viewGroup2 != null) {
                    A4 a46 = c1800s6.c;
                    if (a46 != null) {
                        String TAG3 = c1800s6.f15442d;
                        kotlin.jvm.internal.g.d(TAG3, "TAG");
                        ((B4) a46).c(TAG3, "replaceRenderViewWithPlaceholder");
                    }
                    FrameLayout frameLayout = new FrameLayout(c1800s6.f15440a.getContainerContext());
                    ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(c1800s6.f15440a.getWidth(), c1800s6.f15440a.getHeight());
                    frameLayout.setId(Variant.VT_ILLEGAL);
                    viewGroup2.addView(frameLayout, c1800s6.f15444f, layoutParams);
                    viewGroup2.removeView(c1800s6.f15440a);
                }
                SparseArray sparseArray2 = InMobiAdActivity.f14092j;
                S9 container = c1800s6.f15440a;
                kotlin.jvm.internal.g.e(container, "container");
                hashCode = container.hashCode();
                InMobiAdActivity.f14092j.put(hashCode, container);
            }
            c1800s6.f15440a.getListener().d();
            Intent intent = new Intent(c1800s6.f15440a.getContainerContext(), InMobiAdActivity.class);
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_TYPE", 102);
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_INDEX", hashCode);
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_TYPE", kotlin.jvm.internal.g.a(c1800s6.f15441b, "htmlUrl") ? 202 : 200);
            Ha.f14324a.a(c1800s6.f15440a.getContainerContext(), intent);
        }
        requestLayout();
        invalidate();
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
    }

    @Override // com.inmobi.media.B1
    public final D5 f() {
        A4 a42 = this.f14665j;
        if (a42 != null) {
            String str = O0;
            ((B4) a42).a(str, G9.a(this, str, "TAG", "initLandingPageHandler "));
        }
        E5 e52 = new E5(this.f14655e, this.f14657f, getAdConfig().isCCTEnabled());
        Context context = getContext();
        kotlin.jvm.internal.g.d(context, "getContext(...)");
        return new D5(context, e52, this.B0, this.A0, this, m(), this.f14665j);
    }

    public final void g() {
        Activity fullScreenActivity;
        A4 a42 = this.f14665j;
        if (a42 != null) {
            String str = O0;
            ((B4) a42).a(str, G9.a(this, str, "TAG", "finishFullScreenActivity "));
        }
        InMobiAdActivity.f14092j.remove(hashCode());
        if (getFullScreenActivity() != null) {
            K k10 = this.f14654d0;
            if (k10 == null || !k10.a(this)) {
                Activity fullScreenActivity2 = getFullScreenActivity();
                kotlin.jvm.internal.g.c(fullScreenActivity2, "null cannot be cast to non-null type com.inmobi.ads.rendering.InMobiAdActivity");
                ((InMobiAdActivity) fullScreenActivity2).f14098e = true;
                Activity fullScreenActivity3 = getFullScreenActivity();
                if (fullScreenActivity3 != null) {
                    fullScreenActivity3.finish();
                }
                if (this.P != -1 && (fullScreenActivity = getFullScreenActivity()) != null) {
                    fullScreenActivity.overridePendingTransition(0, this.P);
                    return;
                }
                return;
            }
            return;
        }
        if (this.f14650b == 0) {
            setAndUpdateViewState("Default");
            S9 s92 = this.f14669l;
            if (s92 != null) {
                s92.setAndUpdateViewState("Default");
            }
        } else if (kotlin.jvm.internal.g.a("Default", this.f14677p)) {
            setAndUpdateViewState(PDLayoutAttributeObject.BORDER_STYLE_HIDDEN);
        }
        u();
    }

    @Override // com.inmobi.media.r
    public AdConfig getAdConfig() {
        AdConfig adConfig = this.f14685t;
        if (adConfig != null) {
            return adConfig;
        }
        kotlin.jvm.internal.g.i("mAdConfig");
        throw null;
    }

    public final K getAdPodHandler() {
        return this.f14654d0;
    }

    public final W getAdQualityManager() {
        W w7 = this.f14688u0;
        if (w7 != null) {
            return w7;
        }
        kotlin.jvm.internal.g.i("adQualityManager");
        throw null;
    }

    @Override // com.inmobi.media.r
    public String getAdType() {
        return this.U;
    }

    public Map<Integer, JSONObject> getAllSafeArea() {
        return this.G0;
    }

    public final boolean getAllowAutoRedirection() {
        return this.f14652c0;
    }

    public final int getArea() {
        return getHeight() * getWidth();
    }

    public JSONObject getCloseAssetArea() {
        return this.L0;
    }

    public final long getConfiguredArea() {
        return this.f14666j0;
    }

    public Context getContainerContext() {
        Activity activity = (Activity) this.f14671m.get();
        if (activity == null) {
            Context context = getContext();
            kotlin.jvm.internal.g.d(context, "getContext(...)");
            return context;
        }
        return activity;
    }

    public final String getContentURL() {
        return this.f14662h0;
    }

    public final String getCreativeID() {
        String creativeId = getCreativeId();
        if (creativeId == null) {
            return "";
        }
        return creativeId;
    }

    @Override // com.inmobi.media.r
    public String getCreativeId() {
        return this.R;
    }

    public final String getCurrentPosition() {
        String str;
        JSONObject jSONObject = this.f14697z;
        if (jSONObject != null) {
            str = jSONObject.toString();
        } else {
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    public final Object getCurrentPositionMonitor() {
        return this.K;
    }

    public final int getCurrentRenderingPodAdIndex() {
        K k10 = this.f14654d0;
        if (k10 != null) {
            return ((AbstractC1846w0) k10).k(this);
        }
        return 0;
    }

    @Override // com.inmobi.media.r
    public Object getDataModel() {
        return null;
    }

    public final String getDefaultPosition() {
        String str;
        JSONObject jSONObject = this.f14695y;
        if (jSONObject != null) {
            str = jSONObject.toString();
        } else {
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    public final Object getDefaultPositionMonitor() {
        return this.J;
    }

    public final InterfaceC1746o3 getEmbeddedBrowserJSCallbacks() {
        return this.f14682r0;
    }

    public final I3 getExpandProperties() {
        return this.f14691w;
    }

    public Map<View, FriendlyObstructionPurpose> getFriendlyViews() {
        return this.V;
    }

    public final Activity getFullScreenActivity() {
        return (Activity) this.f14671m.get();
    }

    @Override // com.inmobi.media.r
    public InterfaceC1768q getFullScreenEventsListener() {
        return this.I0;
    }

    @Override // com.inmobi.media.r
    public String getImpressionId() {
        return this.f14653d;
    }

    public final byte getImpressionType() {
        return this.f14667k;
    }

    public final String getLandingScheme() {
        return this.f14657f;
    }

    public final U9 getListener() {
        U9 u92 = this.f14675o;
        if (u92 == null) {
            A4 a42 = this.f14665j;
            if (a42 != null) {
                String str = O0;
                ((B4) a42).c(str, G9.a(this, str, "TAG", "listener getter "));
            }
            I9 i92 = N0;
            this.f14675o = i92;
            return i92;
        }
        return u92;
    }

    @Override // com.inmobi.media.r
    public String getMarkupType() {
        return this.f14698z0;
    }

    public final String getMarkupTypeAdUnit() {
        return this.f14698z0;
    }

    public final C1878y6 getMediaProcessor() {
        return this.f14683s;
    }

    public final int getMinimumPixelsPainted() {
        return this.f14668k0;
    }

    public final String getMraidJsString() {
        A4 a42 = this.f14665j;
        if (a42 != null) {
            String str = O0;
            ((B4) a42).c(str, G9.a(this, str, "TAG", "mraidJsString getter "));
        }
        Context context = getContext();
        kotlin.jvm.internal.g.d(context, "getContext(...)");
        String a10 = new C1752o9(context, "mraid_js_store").a("mraid_js_string");
        if (a10 == null) {
            A4 a43 = this.f14665j;
            if (a43 != null) {
                String TAG = O0;
                kotlin.jvm.internal.g.d(TAG, "TAG");
                ((B4) a43).a(TAG, "Returning default Mraid Js string.");
            }
            return "var imIsObjValid=function(a){return\"undefined\"!=typeof a&&null!=a?!0:!1},EventListeners=function(a){this.event=a;this.count=0;var b=[];this.add=function(a){b.push(a);++this.count};this.remove=function(a){var f=!1,d=this;b=b.filter(function(b){if(b=b===a)--d.count,f=!0;return!b});return f};this.removeAll=function(){b=[];this.count=0};this.broadcast=function(a){b.forEach(function(f){try{f.apply({},a)}catch(b){}})};this.toString=function(){var c=[a,\":\"];b.forEach(function(a){c.push(\"|\",String(a),\"|\")});\nreturn c.join(\"\")}},InmobiObj=function(){this.listeners=[];this.addEventListener=function(a,b){try{if(imIsObjValid(b)&&imIsObjValid(a)){var c=this.listeners;c[a]||(c[a]=new EventListeners);c[a].add(b);\"micIntensityChange\"==a&&window.imraidview.startListeningMicIntensity();\"deviceMuted\"==a&&window.imraidview.startListeningDeviceMuteEvents();\"deviceVolumeChange\"==a&&window.imraidview.startListeningDeviceVolumeChange();\"volumeChange\"==a&&window.imraidview.startListeningVolumeChange();\"headphones\"==a&&\nwindow.imraidview.startListeningHeadphonePluggedEvents();\"backButtonPressed\"==a&&window.imraidview.startListeningForBackButtonPressedEvent();\"downloadStatusChanged\"==a&&window.imraidview.registerDownloaderCallbacks()}}catch(f){this.log(f)}};this.removeEventListener=function(a,b){if(imIsObjValid(a)){var c=this.listeners;imIsObjValid(c[a])&&(imIsObjValid(b)?c[a].remove(b):c[a].removeAll());\"micIntensityChange\"==a&&0==c[a].count&&window.imraidview.stopListeningMicIntensity();\"deviceMuted\"==a&&0==c[a].count&&\nwindow.imraidview.stopListeningDeviceMuteEvents();\"deviceVolumeChange\"==a&&0==c[a].count&&window.imraidview.stopListeningDeviceVolumeChange();\"volumeChange\"==a&&0==c[a].count&&window.imraidview.stopListeningVolumeChange();\"headphones\"==a&&0==c[a].count&&window.imraidview.stopListeningHeadphonePluggedEvents();\"backButtonPressed\"==a&&0==c[a].count&&window.imraidview.stopListeningForBackButtonPressedEvent();\"downloadStatusChanged\"==a&&0==c[a].count&&window.imraidview.unregisterDownloaderCallbacks()}};\nthis.broadcastEvent=function(a){if(imIsObjValid(a)){for(var b=Array(arguments.length),c=0;c<arguments.length;c++)b[c]=arguments[c];c=b.shift();try{this.listeners[c]&&this.listeners[c].broadcast(b)}catch(f){}}};this.sendSaveContentResult=function(a){if(imIsObjValid(a)){for(var b=Array(arguments.length),c=0;c<arguments.length;c++)if(2==c){var f=arguments[c],f=JSON.parse(f);b[c]=f}else b[c]=arguments[c];f=b[1];\"success\"!=f&&(c=b[0].substring(b[0].indexOf(\"_\")+1),imraid.saveContentIDMap[c]&&delete imraid.saveContentIDMap[c]);\nwindow.imraid.broadcastEvent(b[0],b[1],b[2])}}},__im__iosNativeMessageHandler=void 0;window.webkit&&(window.webkit.messageHandlers&&window.webkit.messageHandlers.nativeMessageHandler)&&(__im__iosNativeMessageHandler=window.webkit.messageHandlers.nativeMessageHandler);\nvar __im__iosNativeCall={nativeCallInFlight:!1,nativeCallQueue:[],executeNativeCall:function(a){this.nativeCallInFlight?this.nativeCallQueue.push(a):(this.nativeCallInFlight=!0,imIsObjValid(__im__iosNativeMessageHandler)?__im__iosNativeMessageHandler.postMessage(a):window.location=a)},nativeCallComplete:function(a){0==this.nativeCallQueue.length?this.nativeCallInFlight=!1:(a=this.nativeCallQueue.shift(),imIsObjValid(__im__iosNativeMessageHandler)?__im__iosNativeMessageHandler.postMessage(a):window.location=\na)}},IOSNativeCall=function(){this.urlScheme=\"\";this.executeNativeCall=function(a){if(imIsObjValid(__im__iosNativeMessageHandler)){f={};f.command=a;f.scheme=this.urlScheme;for(var b={},c=1;c<arguments.length;c+=2)d=arguments[c+1],null!=d&&(b[arguments[c]]=\"\"+d);f.params=b}else for(var f=this.urlScheme+\"://\"+a,d,b=!0,c=1;c<arguments.length;c+=2)d=arguments[c+1],null!=d&&(b?(f+=\"?\",b=!1):f+=\"&\",f+=arguments[c]+\"=\"+escape(d));__im__iosNativeCall.executeNativeCall(f);return\"OK\"};this.nativeCallComplete=\nfunction(a){__im__iosNativeCall.nativeCallComplete(a);return\"OK\"};this.updateKV=function(a,b){this[a]=b;var c=this.broadcastMap[a];c&&this.broadcastEvent(c,b)}};\n(function(){var a=window.mraidview={};a.orientationProperties={allowOrientationChange:!0,forceOrientation:\"none\",direction:\"right\"};var b=[],c=!1;a.detectAndBlockFraud=function(c){a.isPossibleFraud()&&a.fireRedirectFraudBeacon(c);return!1};a.popupBlocked=function(c){a.firePopupBlockedBeacon(c)};a.zeroPad=function(a){var c=\"\";10>a&&(c+=\"0\");return c+a};a.supports=function(a){console.log(\"bridge: supports (MRAID)\");if(\"string\"!=typeof a)window.mraid.broadcastEvent(\"error\",\"Supports method expects string parameter\",\n\"supports\");else return\"false\"!=sdkController.supports(\"window.mraidview\",a)};a.useCustomClose=function(a){try{sdkController.useCustomClose(\"window.mraidview\",a)}catch(c){imraidview.showAlert(\"use CustomClose: \"+c)}};a.close=function(){try{sdkController.close(\"window.mraidview\")}catch(a){imraidview.showAlert(\"close: \"+a)}};a.stackCommands=function(a,d){c?b.push(a):(eval(a),d&&(c=!0))};a.expand=function(a){try{\"undefined\"==typeof a&&(a=null),sdkController.expand(\"window.mraidview\",a)}catch(c){imraidview.showAlert(\"executeNativeExpand: \"+\nc+\", URL = \"+a)}};a.setExpandProperties=function(c){try{c?this.props=c:c=null;if(\"undefined\"!=typeof c.lockOrientation&&null!=c.lockOrientation&&\"undefined\"!=typeof c.orientation&&null!=c.orientation){var b={};b.allowOrientationChange=!c.lockOrientation;b.forceOrientation=c.orientation;a.setOrientationProperties(b)}sdkController.setExpandProperties(\"window.mraidview\",a.stringify(c))}catch(e){imraidview.showAlert(\"executeNativesetExpandProperties: \"+e+\", props = \"+c)}};a.getExpandProperties=function(){try{return eval(\"(\"+\nsdkController.getExpandProperties(\"window.mraidview\")+\")\")}catch(a){imraidview.showAlert(\"getExpandProperties: \"+a)}};a.setOrientationProperties=function(c){try{c?(\"undefined\"!=typeof c.allowOrientationChange&&(a.orientationProperties.allowOrientationChange=c.allowOrientationChange),\"undefined\"!=typeof c.forceOrientation&&(a.orientationProperties.forceOrientation=c.forceOrientation)):c=null,sdkController.setOrientationProperties(\"window.mraidview\",a.stringify(a.orientationProperties))}catch(b){imraidview.showAlert(\"setOrientationProperties: \"+\nb+\", props = \"+c)}};a.getOrientationProperties=function(){return{forceOrientation:a.orientationProperties.forceOrientation,allowOrientationChange:a.orientationProperties.allowOrientationChange}};a.resizeProps=null;a.setResizeProperties=function(c){var b,e;try{b=parseInt(c.width);e=parseInt(c.height);if(isNaN(b)||isNaN(e)||1>b||1>e)throw\"Invalid\";c.width=b;c.height=e;a.resizeProps=c;sdkController.setResizeProperties(\"window.mraidview\",a.stringify(c))}catch(g){window.mraid.broadcastEvent(\"error\",\"Invalid properties.\",\n\"setResizeProperties\")}};a.getResizeProperties=function(){try{return eval(\"(\"+sdkController.getResizeProperties(\"window.mraidview\")+\")\")}catch(a){imraidview.showAlert(\"getResizeProperties: \"+a)}};a.open=function(a){\"undefined\"==typeof a&&(a=null);try{sdkController.open(\"window.mraidview\",a)}catch(c){imraidview.showAlert(\"open: \"+c)}};a.getScreenSize=function(){try{return eval(\"(\"+sdkController.getScreenSize(\"window.mraidview\")+\")\")}catch(a){imraidview.showAlert(\"getScreenSize: \"+a)}};a.getMaxSize=\nfunction(){try{return eval(\"(\"+sdkController.getMaxSize(\"window.mraidview\")+\")\")}catch(a){imraidview.showAlert(\"getMaxSize: \"+a)}};a.getCurrentPosition=function(){try{return eval(\"(\"+sdkController.getCurrentPosition(\"window.mraidview\")+\")\")}catch(a){imraidview.showAlert(\"getCurrentPosition: \"+a)}};a.getDefaultPosition=function(){try{return eval(\"(\"+sdkController.getDefaultPosition(\"window.mraidview\")+\")\")}catch(a){imraidview.showAlert(\"getDefaultPosition: \"+a)}};a.getState=function(){try{return String(sdkController.getState(\"window.mraidview\"))}catch(a){imraidview.showAlert(\"getState: \"+\na)}};a.isViewable=function(){if(imraidview.fallbackViewabilityEnabled())return imraidview.checkFallbackViewable();try{return sdkController.isViewable(\"window.mraidview\")}catch(a){imraidview.showAlert(\"isViewable: \"+a)}};a.getPlacementType=function(){return sdkController.getPlacementType(\"window.mraidview\")};a.close=function(){try{sdkController.close(\"window.mraidview\")}catch(a){imraidview.showAlert(\"close: \"+a)}};\"function\"!=typeof String.prototype.startsWith&&(String.prototype.startsWith=function(a){return 0==\nthis.indexOf(a)});a.playVideo=function(a){var c=\"\";null!=a&&(c=a);try{sdkController.playVideo(\"window.mraidview\",c)}catch(b){imraidview.showAlert(\"playVideo: \"+b)}};a.stringify=function(c){if(\"undefined\"===typeof JSON){var b=\"\",e;if(\"undefined\"==typeof c.length)return a.stringifyArg(c);for(e=0;e<c.length;e++)0<e&&(b+=\",\"),b+=a.stringifyArg(c[e]);return b+\"]\"}return JSON.stringify(c)};a.stringifyArg=function(a){var c,b,g;b=typeof a;c=\"\";if(\"number\"===b||\"boolean\"===b)c+=args;else if(a instanceof Array)c=\nc+\"[\"+a+\"]\";else if(a instanceof Object){b=!0;c+=\"{\";for(g in a)null!==a[g]&&(b||(c+=\",\"),c=c+'\"'+g+'\":',b=typeof a[g],c=\"number\"===b||\"boolean\"===b?c+a[g]:\"function\"===typeof a[g]?c+'\"\"':a[g]instanceof Object?c+this.stringify(args[i][g]):c+'\"'+a[g]+'\"',b=!1);c+=\"}\"}else a=a.replace(/\\\\/g,\"\\\\\\\\\"),a=a.replace(/\"/g,'\\\\\"'),c=c+'\"'+a+'\"';imraidview.showAlert(\"json:\"+c);return c};getPID=function(a){var c=\"\";null!=a&&(\"undefined\"!=typeof a.id&&null!=a.id)&&(c=a.id);return c};a.resize=function(){if(null==\na.resizeProps)window.mraid.broadcastEvent(\"error\",\"Valid resize dimensions must be provided before calling resize\",\"resize\");else try{sdkController.resize(\"window.mraidview\")}catch(c){imraidview.showAlert(\"resize called in bridge\")}};a.storePicture=function(c){console.log(\"bridge: storePicture\");if(\"string\"!=typeof c)window.mraid.broadcastEvent(\"error\",\"storePicture method expects url as string parameter\",\"storePicture\");else{if(a.supports(\"storePicture\"))return!window.confirm(\"Do you want to download the file?\")?\n(window.mraid.broadcastEvent(\"error\",\"Store picture on \"+c+\" was cancelled by user.\",\"storePicture\"),!1):sdkController.storePicture(\"window.mraidview\",c);window.mraid.broadcastEvent(\"error\",\"Store picture on \"+c+\" was cancelled because it is unsupported in this device/app.\",\"storePicture\")}};a.fireMediaTrackingEvent=function(a,c){};a.fireMediaErrorEvent=function(a,c){};a.fireMediaTimeUpdateEvent=function(a,c,b){};a.fireMediaCloseEvent=function(a,c,b){};a.fireMediaVolumeChangeEvent=function(a,c,b){};\na.broadcastEvent=function(){window.mraid.broadcastEvent.apply(window.mraid,arguments)}})();\n(function(){var a=window.mraid=new InmobiObj,b=window.mraidview,c=!1;b.isAdShownToUser=!1;b.onUserInteraction=function(){imraidview.onUserInteraction();c=!0};b.isPossibleFraud=function(){return a.supports(\"redirectFraudDetection\")&&(!b.isAdShownToUser||!c)};b.fireRedirectFraudBeacon=function(a){if(\"undefined\"!=typeof inmobi&&inmobi.recordEvent){var c={};c.trigger=a;c.isAdShown=b.isAdShownToUser.toString();inmobi.recordEvent(135,c)}};b.firePopupBlockedBeacon=function(a){if(\"undefined\"!=typeof inmobi&&\ninmobi.recordEvent){var c={};c.trigger=a;inmobi.recordEvent(136,c)}};window.onbeforeunload=function(){b.detectAndBlockFraud(\"redirect\")};a.addEventListener(\"viewableChange\",function(a){a&&!b.isAdShownToUser&&(b.isAdShownToUser=!0)});a.useCustomClose=b.useCustomClose;a.close=b.close;a.getExpandProperties=b.getExpandProperties;a.setExpandProperties=function(c){\"undefined\"!=typeof c&&(\"useCustomClose\"in c&&\"undefined\"!=typeof a.getState()&&\"expanded\"!=a.getState())&&a.useCustomClose(c.useCustomClose);\nb.setExpandProperties(c)};a.getResizeProperties=b.getResizeProperties;a.setResizeProperties=b.setResizeProperties;a.getOrientationProperties=b.getOrientationProperties;a.setOrientationProperties=b.setOrientationProperties;a.expand=b.expand;a.getMaxSize=b.getMaxSize;a.getState=b.getState;a.isViewable=b.isViewable;a.createCalendarEvent=function(a){window.mraid.broadcastEvent(\"error\",\"Method not supported\",\"createCalendarEvent\")};a.open=function(c){b.detectAndBlockFraud(\"mraid.open\")||(\"string\"!=typeof c?\na.broadcastEvent(\"error\",\"URL is required.\",\"open\"):b.open(c))};a.resize=b.resize;a.getVersion=function(){return\"2.0\"};a.getPlacementType=b.getPlacementType;a.playVideo=function(a){b.playVideo(a)};a.getScreenSize=b.getScreenSize;a.getCurrentPosition=b.getCurrentPosition;a.getDefaultPosition=b.getDefaultPosition;a.supports=function(a){return b.supports(a)};a.storePicture=function(c){\"string\"!=typeof c?a.broadcastEvent(\"error\",\"Request must specify a valid URL\",\"storePicture\"):b.storePicture(c)}})();\n(function(){var a=window.imraidview={},b=!1;a.setOrientationProperties=function(c){try{c?(\"undefined\"!=typeof c.allowOrientationChange&&(mraidview.orientationProperties.allowOrientationChange=c.allowOrientationChange),\"undefined\"!=typeof c.forceOrientation&&(mraidview.orientationProperties.forceOrientation=c.forceOrientation),\"undefined\"!=typeof c.direction&&(mraidview.orientationProperties.direction=c.direction)):c=null,sdkController.setOrientationProperties(\"window.imraidview\",mraidview.stringify(mraidview.orientationProperties))}catch(b){a.showAlert(\"setOrientationProperties: \"+\nb+\", props = \"+c)}};a.getOrientationProperties=function(){return mraidview.orientationProperties};a.firePostStatusEvent=function(a){window.imraid.broadcastEvent(\"postStatus\",a)};a.fireMediaTrackingEvent=function(a,b){var d={};d.name=a;var e=\"inmobi_media_\"+a;\"undefined\"!=typeof b&&(null!=b&&\"\"!=b)&&(e=e+\"_\"+b);window.imraid.broadcastEvent(e,d)};a.fireMediaErrorEvent=function(a,b){var d={name:\"error\"};d.code=b;var e=\"inmobi_media_\"+d.name;\"undefined\"!=typeof a&&(null!=a&&\"\"!=a)&&(e=e+\"_\"+a);window.imraid.broadcastEvent(e,\nd)};a.fireMediaTimeUpdateEvent=function(a,b,d){var e={name:\"timeupdate\",target:{}};e.target.currentTime=b;e.target.duration=d;b=\"inmobi_media_\"+e.name;\"undefined\"!=typeof a&&(null!=a&&\"\"!=a)&&(b=b+\"_\"+a);window.imraid.broadcastEvent(b,e)};a.saveContent=function(a,b,d){window.imraid.addEventListener(\"saveContent_\"+a,d);sdkController.saveContent(\"window.imraidview\",a,b)};a.cancelSaveContent=function(a){sdkController.cancelSaveContent(\"window.imraidview\",a)};a.disableCloseRegion=function(a){sdkController.disableCloseRegion(\"window.imraidview\",\na)};a.fireGalleryImageSelectedEvent=function(a,b,d){var e=new Image;e.src=\"data:image/jpeg;base64,\"+a;e.width=b;e.height=d;window.imraid.broadcastEvent(\"galleryImageSelected\",e)};a.fireCameraPictureCatpturedEvent=function(a,b,d){var e=new Image;e.src=\"data:image/jpeg;base64,\"+a;e.width=b;e.height=d;window.imraid.broadcastEvent(\"cameraPictureCaptured\",e)};a.fireMediaCloseEvent=function(a,b,d){var e={name:\"close\"};e.viaUserInteraction=b;e.target={};e.target.currentTime=d;b=\"inmobi_media_\"+e.name;\"undefined\"!=\ntypeof a&&(null!=a&&\"\"!=a)&&(b=b+\"_\"+a);window.imraid.broadcastEvent(b,e)};a.fireMediaVolumeChangeEvent=function(a,b,d){var e={name:\"volumechange\",target:{}};e.target.volume=b;e.target.muted=d;b=\"inmobi_media_\"+e.name;\"undefined\"!=typeof a&&(null!=a&&\"\"!=a)&&(b=b+\"_\"+a);window.imraid.broadcastEvent(b,e)};a.fireDeviceMuteChangeEvent=function(a){window.imraid.broadcastEvent(\"deviceMuted\",a)};a.fireDeviceVolumeChangeEvent=function(a){window.imraid.broadcastEvent(\"deviceVolumeChange\",a)};a.fireHeadphonePluggedEvent=\nfunction(a){window.imraid.broadcastEvent(\"headphones\",a)};a.showAlert=function(a){sdkController.showAlert(\"window.imraidview\",a)};a.openExternal=function(c,b){try{600<=getSdkVersionInt()?sdkController.openExternal(\"window.imraidview\",c,b):sdkController.openExternal(\"window.imraidview\",c)}catch(d){a.showAlert(\"openExternal: \"+d)}};a.log=function(c){try{sdkController.log(\"window.imraidview\",c)}catch(b){a.showAlert(\"log: \"+b)}};a.getPlatform=function(){return\"android\"};a.asyncPing=function(c){try{sdkController.asyncPing(\"window.imraidview\",\nc)}catch(b){a.showAlert(\"asyncPing: \"+b)}};a.startListeningDeviceMuteEvents=function(){sdkController.registerDeviceMuteEventListener(\"window.imraidview\")};a.stopListeningDeviceMuteEvents=function(){sdkController.unregisterDeviceMuteEventListener(\"window.imraidview\")};a.startListeningDeviceVolumeChange=function(){sdkController.registerDeviceVolumeChangeEventListener(\"window.imraidview\")};a.stopListeningDeviceVolumeChange=function(){sdkController.unregisterDeviceVolumeChangeEventListener(\"window.imraidview\")};\na.startListeningHeadphonePluggedEvents=function(){sdkController.registerHeadphonePluggedEventListener(\"window.imraidview\")};a.stopListeningHeadphonePluggedEvents=function(){sdkController.unregisterHeadphonePluggedEventListener(\"window.imraidview\")};getSdkVersionInt=function(){for(var c=a.getSdkVersion().split(\".\"),b=c.length,d=\"\",e=0;e<b;e++)d+=c[e];return parseInt(d)};a.getSdkVersion=function(){return window._im_imaiview.getSdkVersion()};a.supports=function(a){console.log(\"bridge: supports (IMRAID)\");\nif(\"string\"!=typeof a)window.imraid.broadcastEvent(\"error\",\"Supports method expects string parameter\",\"supports\");else return\"false\"!=sdkController.supports(\"window.imraidview\",a)};a.postToSocial=function(c,b,d,e){window.imraid.broadcastEvent(\"error\",\"Method not supported\",\"postToSocial\");a.log(\"Method postToSocial not supported\")};a.incentCompleted=function(a){if(\"object\"!=typeof a||null==a)sdkController.incentCompleted(\"window.imraidview\",null);else try{sdkController.incentCompleted(\"window.imraidview\",\nJSON.stringify(a))}catch(b){sdkController.incentCompleted(\"window.imraidview\",null)}};a.getOrientation=function(){try{return String(sdkController.getOrientation(\"window.imraidview\"))}catch(c){a.showAlert(\"getOrientation: \"+c)}};a.acceptAction=function(c){try{sdkController.acceptAction(\"window.imraidview\",mraidview.stringify(c))}catch(b){a.showAlert(\"acceptAction: \"+b+\", params = \"+c)}};a.rejectAction=function(c){try{sdkController.rejectAction(\"window.imraidview\",mraidview.stringify(c))}catch(b){a.showAlert(\"rejectAction: \"+\nb+\", params = \"+c)}};a.updateToPassbook=function(c){window.imraid.broadcastEvent(\"error\",\"Method not supported\",\"updateToPassbook\");a.log(\"Method not supported\")};a.isDeviceMuted=function(){return\"false\"!=sdkController.isDeviceMuted(\"window.imraidview\")};a.getDeviceVolume=function(){return 603>=getSdkVersionInt()?-1:sdkController.getDeviceVolume(\"window.imraidview\")};a.isHeadPhonesPlugged=function(){return\"false\"!=sdkController.isHeadphonePlugged(\"window.imraidview\")};a.sendSaveContentResult=function(){window.imraid.sendSaveContentResult.apply(window.imraid,\narguments)};a.broadcastEvent=function(){window.imraid.broadcastEvent.apply(window.imraid,arguments)};a.disableBackButton=function(a){void 0==a||\"boolean\"!=typeof a?console.log(\"disableBackButton called with invalid params\"):sdkController.disableBackButton(\"window.imraidview\",a)};a.isBackButtonDisabled=function(){return sdkController.isBackButtonDisabled(\"window.imraidview\")};a.startListeningForBackButtonPressedEvent=function(){sdkController.registerBackButtonPressedEventListener(\"window.imraidview\")};\na.stopListeningForBackButtonPressedEvent=function(){sdkController.unregisterBackButtonPressedEventListener(\"window.imraidview\")};a.hideStatusBar=function(){};a.setOpaqueBackground=function(){};a.startDownloader=function(a,b,d){682<=getSdkVersionInt()&&sdkController.startDownloader(\"window.imraidview\",a,b,d)};a.registerDownloaderCallbacks=function(){682<=getSdkVersionInt()&&sdkController.registerDownloaderCallbacks(\"window.imraidview\")};a.unregisterDownloaderCallbacks=function(){682<=getSdkVersionInt()&&\nsdkController.unregisterDownloaderCallbacks(\"window.imraidview\")};a.getDownloadProgress=function(){return 682<=getSdkVersionInt()?sdkController.getDownloadProgress(\"window.imraidview\"):-1};a.getDownloadStatus=function(){return 682<=getSdkVersionInt()?sdkController.getDownloadStatus(\"window.imraidview\"):-1};a.fireEvent=function(a){700<=getSdkVersionInt()&&(\"fireSkip\"===a?sdkController.fireSkip(\"window.imraidview\"):\"fireComplete\"===a?sdkController.fireComplete(\"window.imraidview\"):\"showEndCard\"===a&&\nsdkController.showEndCard(\"window.imraidview\"))};a.saveBlob=function(a){700<=getSdkVersionInt()&&sdkController.saveBlob(\"window.imraidview\",a)};a.getBlob=function(a,b){700<=getSdkVersionInt()&&sdkController.getBlob(a,b)};a.setCloseEndCardTracker=function(a){700<=getSdkVersionInt()&&sdkController.setCloseEndCardTracker(\"window.imraidview\",a)};a.getRenderableAdIndexes=function(){try{if(917<=getSdkVersionInt())return sdkController.getRenderableAdIndexes(\"window.imraidview\")}catch(a){}return\"[]\"};a.getCurrentRenderingIndex=\nfunction(){try{if(917<=getSdkVersionInt())return sdkController.getCurrentRenderingIndex(\"window.imraidview\")}catch(a){}return-1};a.showAd=function(a){try{917<=getSdkVersionInt()&&sdkController.showAd(\"window.imraidview\",a)}catch(b){}};a.timeSinceShow=function(){try{if(917<=getSdkVersionInt())return sdkController.timeSinceShow(\"window.imraidview\")}catch(a){}return-1};a.getShowTimeStamp=function(){try{if(917<=getSdkVersionInt())return sdkController.getShowTimeStamp(\"window.imraidview\")}catch(a){}return-1};\na.closeAll=function(){try{917<=getSdkVersionInt()&&sdkController.closeAll(\"window.imraidview\")}catch(a){}};a.loadAd=function(a){try{917<=getSdkVersionInt()&&sdkController.loadAd(\"window.imraidview\",a)}catch(b){}};a.setAdContext=function(a){try{917<=getSdkVersionInt()&&sdkController.setAdContext(\"window.imraidview\",a)}catch(b){}};a.getAdContext=function(){try{if(917<=getSdkVersionInt())return sdkController.getAdContext(\"window.imraidview\")}catch(a){}return\"\"};a.openWithoutTracker=function(a){try{\"undefined\"==\ntypeof a&&(a=null),sdkController.openWithoutTracker(\"window.imraidview\",a)}catch(b){}};a.impressionRendered=function(){window.imraid.broadcastEvent(\"impressionRendered\")};a.customExpand=function(c,b,d,e,g){try{void 0==d||\"number\"!=typeof d?console.log(\"screenPercentage called with invalid params\"):void 0==b||\"number\"!=typeof b?console.log(\"inputType called with invalid params\"):void 0==e||\"boolean\"!=typeof e?console.log(\"topNavBarVisible called with invalid params\"):void 0==g||\"boolean\"!=typeof g?\nconsole.log(\"bottomNavBarVisible called with invalid params\"):sdkController.customExpand(\"window.imraidview\",c,b,d,e,g)}catch(h){a.showAlert(\"executeNativeCustomExpand: \"+h+\", input = \"+c+\", inputType = \"+b+\", screenPercentage = \"+d+\", bottomNavBarVisible = \"+g+\", topNavBarVisible = \"+e)}};a.closeCustomExpand=function(){try{sdkController.closeCustomExpand(\"window.imraidview\")}catch(a){}};a.onGestureDetected=function(a,b){window.imraid.broadcastEvent(\"onGestureDetected\",a,b)};a.onUserLandingCompleted=\nfunction(){window.imraid.broadcastEvent(\"onUserLandingCompleted\")};a.onUserInteraction=function(){window.imraid.broadcastEvent(\"onUserInteraction\")};a.impressionFired=function(){try{sdkController.impressionFired(\"window.imraidview\")}catch(a){}};a.getMaxDeviceVolume=function(){try{return sdkController.getMaxDeviceVolume(\"window.imraidview\")}catch(a){return 15}};a.zoom=function(a){try{sdkController.zoom(\"window.imraidview\",a)}catch(b){}};a.onAudioStateChanged=function(a){try{sdkController.onAudioStateChanged(\"window.imraidview\",\na)}catch(b){}};a.submitAdReport=function(a){try{sdkController.submitAdReport(\"window.imraidview\",void 0!=a.adQualityUrl?a.adQualityUrl:null,void 0!=a.enableUserAdReportScreenshot?a.enableUserAdReportScreenshot:null,void 0!=a.templateInfo?a.templateInfo:null)}catch(b){}};a.logTelemetryEvent=function(a){try{var b=void 0!=a.eventType?a.eventType:null,d=void 0!=a.payload?a.payload:null;a=null;null!=d&&(a=mraidview.stringify(d));sdkController.logTelemetryEvent(\"window.imraidview\",b,a)}catch(e){}};a.onUserAudioMuteInteraction=\nfunction(a){try{sdkController.onUserAudioMuteInteraction(\"window.imraidview\",a)}catch(b){}};a.enableFallbackViewabilityFunctionality=function(){b=!0;a.checkFallbackViewable()&&window.mraid.broadcastEvent(\"viewableChange\",!0);mraid.addEventListener(\"sizeChange\",function(){window.mraid.broadcastEvent(\"viewableChange\",a.checkFallbackViewable())})};a.checkFallbackViewable=function(){try{var b=mraidview.getCurrentPosition(),f=b.height;return 40<=b.width&&40<=f?!0:!1}catch(d){a.showAlert(\"checkFallbackViewable: \"+\nd)}};a.fallbackViewabilityEnabled=function(){return b};a.getSafeArea=function(){try{return JSON.parse(sdkController.getSafeArea(\"window.imraidview\"))}catch(a){return null}}})();\n(function(){var a=window.imraid=new InmobiObj,b=window.imraidview;a.getOrientation=b.getOrientation;a.setOrientationProperties=b.setOrientationProperties;a.getOrientationProperties=b.getOrientationProperties;a.saveContentIDMap={};a.saveContent=function(c,f,d){var e=arguments.length,g,h=null;if(3>e){if(\"function\"===typeof arguments[e-1])g=arguments[e-1];else return;h={reason:1}}else a.saveContentIDMap[c]&&(g=arguments[2],h={reason:11,url:arguments[1]});\"function\"!==!g&&(h?(window.imraid.addEventListener(\"saveContent_failed_\"+\nc,g),window.imraid.sendSaveContentResult(\"saveContent_failed_\"+c,\"failed\",JSON.stringify(h))):(a.removeEventListener(\"saveContent_\"+c),a.saveContentIDMap[c]=!0,b.saveContent(c,f,d)))};a.cancelSaveContent=function(a){b.cancelSaveContent(a)};a.asyncPing=function(c){\"string\"!=typeof c?a.broadcastEvent(\"error\",\"URL is required.\",\"asyncPing\"):b.asyncPing(c)};a.disableCloseRegion=b.disableCloseRegion;a.getSdkVersion=b.getSdkVersion;a.log=function(c){\"undefined\"==typeof c?a.broadcastEvent(\"error\",\"message is required.\",\n\"log\"):\"string\"==typeof c?b.log(c):b.log(JSON.stringify(c))};a.getInMobiAIVersion=function(){return\"2.0\"};a.getVendorName=function(){return\"inmobi\"};a.openExternal=function(a,f){console.log(\"openExternal is deprecated, will be removed in future version\");mraidview.detectAndBlockFraud(\"imraid.openExternal\")||b.openExternal(a,f)};a.updateToPassbook=function(c){mraidview.detectAndBlockFraud(\"imraid.updateToPassbook\")||(\"string\"!=typeof c?a.broadcastEvent(\"error\",\"Request must specify a valid URL\",\"updateToPassbook\"):\nb.updateToPassbook(c))};a.postToSocial=function(a,f,d,e){mraidview.detectAndBlockFraud(\"imraid.postToSocial\")||b.postToSocial(a,f,d,e)};a.getPlatform=b.getPlatform;a.incentCompleted=b.incentCompleted;a.loadSKStore=b.loadSKStore;a.showSKStore=function(a){mraidview.detectAndBlockFraud(\"imraid.showSKStore\")||b.showSKStore(a)};a.skoverlay=b.skoverlay;a.skoverlayWithSkan=b.skoverlayWithSkan;a.zoom=b.zoom;a.dismissSKOverlay=b.dismissSKOverlay;a.supports=function(a){return b.supports(a)};a.isDeviceMuted=\nfunction(){return!imIsObjValid(a.listeners.deviceMuted)?-1:b.isDeviceMuted()};a.isHeadPhonesPlugged=function(){return!imIsObjValid(a.listeners.headphones)?!1:b.isHeadPhonesPlugged()};a.getDeviceVolume=function(){return b.getDeviceVolume()};a.setDeviceVolume=function(a){b.setDeviceVolume(a)};a.hideStatusBar=function(){b.hideStatusBar()};a.setOpaqueBackground=function(){b.setOpaqueBackground()};a.getRenderableAdIndexes=b.getRenderableAdIndexes;a.getCurrentRenderingIndex=b.getCurrentRenderingIndex;a.showAd=\nb.showAd;a.timeSinceShow=b.timeSinceShow;a.closeAll=b.closeAll;a.loadAd=b.loadAd;a.setAdContext=b.setAdContext;a.getAdContext=b.getAdContext;a.getShowTimeStamp=b.getShowTimeStamp;a.disableBackButton=b.disableBackButton;a.isBackButtonDisabled=b.isBackButtonDisabled;a.startDownloader=b.startDownloader;a.getDownloadProgress=b.getDownloadProgress;a.getDownloadStatus=b.getDownloadStatus;a.fireEvent=b.fireEvent;a.saveBlob=b.saveBlob;a.getBlob=b.getBlob;a.setCloseEndCardTracker=b.setCloseEndCardTracker;\na.openWithoutTracker=b.openWithoutTracker;a.impressionRendered=b.impressionRendered;a.onGestureDetected=b.onGestureDetected;a.onUserLandingCompleted=b.onUserLandingCompleted;a.customExpand=b.customExpand;a.closeCustomExpand=b.closeCustomExpand;a.impressionFired=b.impressionFired;a.getImraidVersion=b.getImraidVersion;a.getMaxDeviceVolume=b.getMaxDeviceVolume;a.onAudioStateChanged=b.onAudioStateChanged;a.onUserAudioMuteInteraction=b.onUserAudioMuteInteraction;a.submitAdReport=b.submitAdReport;a.enableFallbackViewabilityFunctionality=\nb.enableFallbackViewabilityFunctionality;a.logTelemetryEvent=b.logTelemetryEvent;a.getSafeArea=b.getSafeArea})();\n(function(){var a=window._im_imaiview={ios:{}};window.imaiview=a;a.broadcastEvent=function(){for(var a=Array(arguments.length),c=0;c<arguments.length;c++)a[c]=arguments[c];c=a.shift();try{window.mraid.broadcastEvent(c,a)}catch(f){}};a.getPlatform=function(){return\"android\"};a.getPlatformVersion=function(){return sdkController.getPlatformVersion(\"window.imaiview\")};a.log=function(a){sdkController.log(\"window.imaiview\",a)};a.openEmbedded=function(a){sdkController.openEmbedded(\"window.imaiview\",a)};\na.openExternal=function(a,c){600<=getSdkVersionInt()?sdkController.openExternal(\"window.imaiview\",a,c):sdkController.openExternal(\"window.imaiview\",a)};a.ping=function(a,c){sdkController.ping(\"window.imaiview\",a,c)};a.pingInWebView=function(a,c){sdkController.pingInWebView(\"window.imaiview\",a,c)};a.getSdkVersion=function(){try{var a=sdkController.getSdkVersion(\"window.imaiview\");if(\"string\"==typeof a&&null!=a)return a}catch(c){return\"3.7.0\"}};a.onUserInteraction=function(a){if(\"object\"!=typeof a||\nnull==a)sdkController.onUserInteraction(\"window.imaiview\",null);else try{sdkController.onUserInteraction(\"window.imaiview\",JSON.stringify(a))}catch(c){sdkController.onUserInteraction(\"window.imaiview\",null)}};a.fireAdReady=function(){sdkController.fireAdReady(\"window.imaiview\")};a.fireAdFailed=function(){sdkController.fireAdFailed(\"window.imaiview\")};a.broadcastEvent=function(){window.imai.broadcastEvent.apply(window.imai,arguments)}})();\n(function(){var a=window._im_imaiview;window._im_imai=new InmobiObj;window._im_imai.ios=new InmobiObj;var b=window._im_imai;window.imai=window._im_imai;b.matchString=function(a,b){if(\"string\"!=typeof a||null==a||null==b)return-1;var d=-1;try{d=a.indexOf(b)}catch(e){}return d};b.isHttpUrl=function(a){return\"string\"!=typeof a||null==a?!1:0==b.matchString(a,\"http://\")?!0:0==b.matchString(a,\"https://\")?!0:!1};b.appendTapParams=function(a,f,d){if(!imIsObjValid(f)||!imIsObjValid(d))return a;b.isHttpUrl(a)&&\n(a=-1==b.matchString(a,\"?\")?a+(\"?u-tap-o=\"+f+\",\"+d):a+(\"&u-tap-o=\"+f+\",\"+d));return a};b.performAdClick=function(a,f){f=f||event;if(imIsObjValid(a)){var d=a.clickConfig,e=a.landingConfig;if(!imIsObjValid(d)&&!imIsObjValid(e))b.log(\"click/landing config are invalid, Nothing to process .\"),this.broadcastEvent(\"error\",\"click/landing config are invalid, Nothing to process .\");else{var g=null,h=null,k=null,m=null,n=null,l=null,q=null,p=null;if(imIsObjValid(f))try{m=f.changedTouches[0].pageX,n=f.changedTouches[0].pageY}catch(r){n=\nm=0}imIsObjValid(e)?imIsObjValid(d)?(l=e.url,q=e.fallbackUrl,p=e.urlType,g=d.url,h=d.pingWV,k=d.fr):(l=e.url,p=e.urlType):(l=d.url,p=d.urlType);d=b.getPlatform();try{if(\"boolean\"!=typeof k&&\"number\"!=typeof k||null==k)k=!0;if(0>k||1<k)k=!0;if(\"boolean\"!=typeof h&&\"number\"!=typeof h||null==h)h=!0;if(0>h||1<h)h=!0;if(\"number\"!=typeof p||null==p)p=0;g=b.appendTapParams(g,m,n);imIsObjValid(g)?!0==h?b.pingInWebView(g,k):b.ping(g,k):b.log(\"clickurl provided is null.\");if(imIsObjValid(l))switch(imIsObjValid(g)||\n(l=b.appendTapParams(l,m,n)),p){case 1:b.openEmbedded(l);break;case 2:\"ios\"==d?b.ios.openItunesProductView(l):this.broadcastEvent(\"error\",\"Cannot process openItunesProductView for os\"+d);break;default:b.openExternal(l,q)}else b.log(\"Landing url provided is null.\")}catch(s){}}}else b.log(\" invalid config, nothing to process .\"),this.broadcastEvent(\"error\",\"invalid config, nothing to process .\")};b.performActionClick=function(a,f){f=f||event;if(imIsObjValid(a)){var d=a.clickConfig,e=a.landingConfig;\nif(!imIsObjValid(d)&&!imIsObjValid(e))b.log(\"click/landing config are invalid, Nothing to process .\"),this.broadcastEvent(\"error\",\"click/landing config are invalid, Nothing to process .\");else{var g=null,h=null,k=null,m=null,n=null;if(imIsObjValid(f))try{m=f.changedTouches[0].pageX,n=f.changedTouches[0].pageY}catch(l){n=m=0}imIsObjValid(d)&&(g=d.url,h=d.pingWV,k=d.fr);try{if(\"boolean\"!=typeof k&&\"number\"!=typeof k||null==k)k=!0;if(0>k||1<k)k=!0;if(\"boolean\"!=typeof h&&\"number\"!=typeof h||null==h)h=\n!0;if(0>h||1<h)h=!0;g=b.appendTapParams(g,m,n);imIsObjValid(g)?!0==h?b.pingInWebView(g,k):b.ping(g,k):b.log(\"clickurl provided is null.\");b.onUserInteraction(e)}catch(q){}}}else b.log(\" invalid config, nothing to process .\"),this.broadcastEvent(\"error\",\"invalid config, nothing to process .\")};b.getVersion=function(){return\"1.0\"};b.getPlatform=a.getPlatform;b.getPlatformVersion=a.getPlatformVersion;b.log=a.log;b.openEmbedded=function(b){console.log(\"openEmbedded is deprecated, will be removed in future version\");\nmraidview.detectAndBlockFraud(\"imai.openEmbedded\")||a.openEmbedded(b)};b.openExternal=function(b,f){console.log(\"openExternal is deprecated, will be removed in future version\");mraidview.detectAndBlockFraud(\"imai.openExternal\")||a.openExternal(b,f)};b.ping=a.ping;b.pingInWebView=a.pingInWebView;b.onUserInteraction=a.onUserInteraction;b.getSdkVersion=a.getSdkVersion;b.loadSKStore=a.loadSKStore;b.showSKStore=function(b){mraidview.detectAndBlockFraud(\"imai.showSKStore\")||a.showSKStore(b)};b.ios.openItunesProductView=\nfunction(b){mraidview.detectAndBlockFraud(\"imai.ios.openItunesProductView\")||a.ios.openItunesProductView(b)};b.fireAdReady=a.fireAdReady;b.fireAdFailed=a.fireAdFailed})();\n";
        }
        A4 a44 = this.f14665j;
        if (a44 != null) {
            String TAG2 = O0;
            kotlin.jvm.internal.g.d(TAG2, "TAG");
            ((B4) a44).a(TAG2, "Returning fetched Mraid Js string.");
            return a10;
        }
        return a10;
    }

    public Integer getNavBarType() {
        Integer num = this.E0;
        if (num == null) {
            return this.F0;
        }
        return num;
    }

    public final Integer getNavBarTypeViaInsets() {
        return this.F0;
    }

    public final Integer getNavBarTypeViaSettings() {
        return this.E0;
    }

    public final C1614e9 getOrientationProperties() {
        A4 a42 = this.f14665j;
        if (a42 != null) {
            String str = O0;
            ((B4) a42).a(str, G9.a(this, str, "TAG", "getOrientationProperties "));
        }
        return this.f14686t0;
    }

    public final S9 getOriginalRenderView() {
        return this.f14669l;
    }

    public final long getPlacementId() {
        return this.Q;
    }

    @Override // com.inmobi.media.r
    public byte getPlacementType() {
        return this.f14650b;
    }

    public r getReferenceContainer() {
        return this.f14649a0;
    }

    public final JSONArray getRenderableAdIndexes() {
        JSONArray N;
        K k10 = this.f14654d0;
        if (k10 == null || (N = ((AbstractC1846w0) k10).N()) == null) {
            return new JSONArray();
        }
        return N;
    }

    public final AdConfig.RenderingConfig getRenderingConfig() {
        AdConfig adConfig = this.f14685t;
        if (adConfig != null) {
            return adConfig.getRendering();
        }
        kotlin.jvm.internal.g.i("mAdConfig");
        throw null;
    }

    public final C1713la getResizeProperties() {
        return this.f14693x;
    }

    public final ConcurrentMap<Integer, JSONObject> getSafeArea() {
        return this.G0;
    }

    public final long getShowTimeStamp() {
        K k10 = this.f14654d0;
        if (k10 != null) {
            return ((AbstractC1846w0) k10).O();
        }
        return 0L;
    }

    public Map<String, C1872y0> getTelemetryManagerMap() {
        return this.f14694x0;
    }

    public C1780qb getTelemetryOnAdImpression() {
        C1872y0 c1872y0;
        Map<String, C1872y0> telemetryManagerMap = getTelemetryManagerMap();
        if (telemetryManagerMap != null) {
            c1872y0 = telemetryManagerMap.get("AdImpressionSuccessful");
        } else {
            c1872y0 = null;
        }
        return new C1780qb(c1872y0, this.f14684s0, getCreativeId(), getMarkupType());
    }

    public final pc getVISIBILITY_CHANGE_LISTENER() {
        return this.C0;
    }

    @Override // com.inmobi.media.r
    public View getVideoContainerView() {
        return null;
    }

    public final String getViewState() {
        return this.f14677p;
    }

    @Override // com.inmobi.media.A9
    public long getViewTouchTimestamp() {
        return this.f14659g;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008f A[Catch: Exception -> 0x00cd, TryCatch #0 {Exception -> 0x00cd, blocks: (B:13:0x004f, B:15:0x0054, B:17:0x0061, B:19:0x0065, B:21:0x006d, B:25:0x0083, B:27:0x008f, B:30:0x0096, B:32:0x00ac, B:33:0x00bb, B:35:0x00bf), top: B:43:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ac A[SYNTHETIC] */
    @Override // com.inmobi.media.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.inmobi.media.AbstractC1701kc getViewableAd() {
        /*
            Method dump skipped, instructions count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.S9.getViewableAd():com.inmobi.media.kc");
    }

    public final int[] getViewableFrameArray() {
        return this.f14664i0;
    }

    public final void h() {
        Z9 z92 = this.T;
        if (z92 != null) {
            Map a10 = z92.a();
            long j10 = z92.f14922b;
            ScheduledExecutorService scheduledExecutorService = Vb.f14759a;
            a10.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
            C1616eb c1616eb = C1616eb.f15034a;
            C1616eb.b("FireAdReady", a10, EnumC1686jb.f15238a);
        }
        A4 a42 = this.f14665j;
        if (a42 != null) {
            String str = O0;
            ((B4) a42).a(str, G9.a(this, str, "TAG", "fireAdReady "));
        }
        this.f14678p0 = true;
        if (this.f14667k == 0) {
            j();
        }
        getListener().h(this);
    }

    public final void i() {
        A4 a42 = this.f14665j;
        if (a42 != null) {
            String str = O0;
            ((B4) a42).a(str, G9.a(this, str, "TAG", "fireClickTrackers "));
        }
        A2 a22 = this.H0;
        if (a22 != null && !a22.f14115g.get()) {
            a22.f14112d.f14218g = 1;
            kotlin.jvm.internal.g.b(a22.c);
        }
        A4 a43 = this.f14665j;
        if (a43 != null) {
            String str2 = O0;
            ((B4) a43).a(str2, G9.a(this, str2, "TAG", "fireOnUserInteraction "));
        }
        b("window.imraidview.onUserInteraction();");
        getListener().b(this);
    }

    public final void j() {
        A4 a42 = this.f14665j;
        if (a42 != null) {
            String str = O0;
            ((B4) a42).a(str, G9.a(this, str, "TAG", "fireImpression "));
        }
        if (!kotlin.jvm.internal.g.a("video", this.f14684s0) && !kotlin.jvm.internal.g.a("audio", this.f14684s0)) {
            A4 a43 = this.f14665j;
            if (a43 != null) {
                String str2 = O0;
                ((B4) a43).a(str2, G9.a(this, str2, "TAG", "recordContextualData "));
            }
            A2 a22 = this.H0;
            if (a22 != null) {
                a22.a();
            }
            b("window.imraidview.impressionRendered();");
            getListener().c(this);
        }
    }

    public final boolean k() {
        A4 a42 = this.f14665j;
        if (a42 != null) {
            String str = O0;
            StringBuilder a10 = A5.a(str, "TAG", "hasUserInteracted ");
            a10.append(getViewTouchTimestamp());
            a10.append(' ');
            a10.append(getRenderingConfig().getUserTouchResetTime());
            ((B4) a42).a(str, a10.toString());
        }
        if (getRenderingConfig().getAutoRedirectionEnforcement() && !this.f14652c0 && (getViewTouchTimestamp() == -1 || SystemClock.elapsedRealtime() - getViewTouchTimestamp() >= getRenderingConfig().getUserTouchResetTime())) {
            return false;
        }
        return true;
    }

    public final void l() {
        A4 a42 = this.f14665j;
        if (a42 != null) {
            String str = O0;
            ((B4) a42).a(str, G9.a(this, str, "TAG", "processResizeRequest "));
        }
        if (!kotlin.jvm.internal.g.a("Default", this.f14677p) && !kotlin.jvm.internal.g.a("Resized", this.f14677p)) {
            A4 a43 = this.f14665j;
            if (a43 != null) {
                String TAG = O0;
                kotlin.jvm.internal.g.d(TAG, "TAG");
                ((B4) a43).b(TAG, "Render view state must be either DEFAULT or RESIZED to admit the resize request");
            }
        } else if (this.f14693x == null) {
            A4 a44 = this.f14665j;
            if (a44 != null) {
                String TAG2 = O0;
                kotlin.jvm.internal.g.d(TAG2, "TAG");
                ((B4) a44).b(TAG2, "Render view state can not resize with invalid resize properties");
            }
        } else {
            this.L = true;
            C1891z6 c1891z6 = this.f14681r;
            if (c1891z6 != null) {
                c1891z6.a();
            }
            requestLayout();
            invalidate();
            setFocusable(true);
            setFocusableInTouchMode(true);
            requestFocus();
            setAndUpdateViewState("Resized");
            getListener().e(this);
            this.L = false;
        }
    }

    public final L5 m() {
        long j10;
        String str;
        String str2;
        boolean z10;
        J j11;
        String b10;
        J j12;
        String m10;
        J j13;
        L5 l52 = this.f14663i;
        if (l52 == null) {
            V9 v92 = this.f14661h;
            if (v92 != null && (j13 = v92.f14749a) != null) {
                j10 = j13.l();
            } else {
                j10 = 0;
            }
            long j14 = j10;
            V9 v93 = this.f14661h;
            if (v93 == null || (j12 = v93.f14749a) == null || (m10 = j12.m()) == null) {
                str = "";
            } else {
                str = m10;
            }
            V9 v94 = this.f14661h;
            if (v94 == null || (j11 = v94.f14749a) == null || (b10 = j11.b()) == null) {
                str2 = "";
            } else {
                str2 = b10;
            }
            V9 v95 = this.f14661h;
            String str3 = (v95 == null || (str3 = v95.f14750b) == null) ? "" : "";
            String str4 = (v95 == null || (str4 = v95.f14752e) == null) ? "" : "";
            String str5 = (v95 == null || (str5 = v95.c) == null) ? "" : "";
            if (v95 != null) {
                z10 = v95.f14754g;
            } else {
                z10 = false;
            }
            l52 = new L5(j14, str, str2, str3, str4, str5, z10, System.currentTimeMillis());
        }
        return l52;
    }

    public final void n() {
        A4 a42 = this.f14665j;
        if (a42 != null) {
            String str = O0;
            ((B4) a42).c(str, G9.a(this, str, "TAG", "setCurrentPosition "));
        }
        this.f14697z = new JSONObject();
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        try {
            JSONObject jSONObject = this.f14697z;
            if (jSONObject != null) {
                jSONObject.put("x", AbstractC1692k3.a(iArr[0]));
            }
            JSONObject jSONObject2 = this.f14697z;
            if (jSONObject2 != null) {
                jSONObject2.put(OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, AbstractC1692k3.a(iArr[1]));
            }
            int a10 = AbstractC1692k3.a(getWidth());
            int a11 = AbstractC1692k3.a(getHeight());
            JSONObject jSONObject3 = this.f14697z;
            if (jSONObject3 != null) {
                jSONObject3.put(InMobiNetworkValues.WIDTH, a10);
            }
            JSONObject jSONObject4 = this.f14697z;
            if (jSONObject4 != null) {
                jSONObject4.put(InMobiNetworkValues.HEIGHT, a11);
            }
        } catch (JSONException unused) {
        }
        synchronized (this.K) {
            this.B = false;
            this.K.notifyAll();
            tf.d dVar = tf.d.f30009a;
        }
    }

    public final void o() {
        int i10;
        int i11;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        A4 a42 = this.f14665j;
        if (a42 != null) {
            String str = O0;
            ((B4) a42).c(str, G9.a(this, str, "TAG", "setDefaultPosition "));
        }
        int[] iArr = new int[2];
        this.f14695y = new JSONObject();
        ViewGroup viewGroup5 = null;
        if (this.f14673n == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewGroup) {
                viewGroup4 = (ViewGroup) parent;
            } else {
                viewGroup4 = null;
            }
            this.f14673n = new WeakReference(viewGroup4);
        }
        WeakReference weakReference = this.f14673n;
        if (weakReference != null) {
            viewGroup5 = (ViewGroup) weakReference.get();
        }
        try {
            if (viewGroup5 != null) {
                WeakReference weakReference2 = this.f14673n;
                if (weakReference2 != null && (viewGroup3 = (ViewGroup) weakReference2.get()) != null) {
                    viewGroup3.getLocationOnScreen(iArr);
                }
                JSONObject jSONObject = this.f14695y;
                if (jSONObject != null) {
                    jSONObject.put("x", AbstractC1692k3.a(iArr[0]));
                }
                JSONObject jSONObject2 = this.f14695y;
                if (jSONObject2 != null) {
                    jSONObject2.put(OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, AbstractC1692k3.a(iArr[1]));
                }
                WeakReference weakReference3 = this.f14673n;
                if (weakReference3 != null && (viewGroup2 = (ViewGroup) weakReference3.get()) != null) {
                    i10 = viewGroup2.getWidth();
                } else {
                    i10 = 0;
                }
                int a10 = AbstractC1692k3.a(i10);
                WeakReference weakReference4 = this.f14673n;
                if (weakReference4 != null && (viewGroup = (ViewGroup) weakReference4.get()) != null) {
                    i11 = viewGroup.getHeight();
                } else {
                    i11 = 0;
                }
                int a11 = AbstractC1692k3.a(i11);
                JSONObject jSONObject3 = this.f14695y;
                if (jSONObject3 != null) {
                    jSONObject3.put(InMobiNetworkValues.WIDTH, a10);
                }
                JSONObject jSONObject4 = this.f14695y;
                if (jSONObject4 != null) {
                    jSONObject4.put(InMobiNetworkValues.HEIGHT, a11);
                }
            } else {
                JSONObject jSONObject5 = this.f14695y;
                if (jSONObject5 != null) {
                    jSONObject5.put("x", 0);
                }
                JSONObject jSONObject6 = this.f14695y;
                if (jSONObject6 != null) {
                    jSONObject6.put(OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, 0);
                }
                JSONObject jSONObject7 = this.f14695y;
                if (jSONObject7 != null) {
                    jSONObject7.put(InMobiNetworkValues.WIDTH, 0);
                }
                JSONObject jSONObject8 = this.f14695y;
                if (jSONObject8 != null) {
                    jSONObject8.put(InMobiNetworkValues.HEIGHT, 0);
                }
            }
        } catch (JSONException unused) {
        }
        synchronized (this.J) {
            this.A = false;
            this.J.notifyAll();
            tf.d dVar = tf.d.f30009a;
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        ViewGroup viewGroup;
        A4 a42 = this.f14665j;
        if (a42 != null) {
            String str = O0;
            ((B4) a42).a(str, G9.a(this, str, "TAG", "onAttachedToWindow "));
        }
        super.onAttachedToWindow();
        C1878y6 c1878y6 = this.f14683s;
        if (c1878y6 != null) {
            C1681j6 c1681j6 = c1878y6.f15680d;
            if (c1681j6 != null) {
                c1681j6.b();
            }
            C1681j6 c1681j62 = c1878y6.f15681e;
            if (c1681j62 != null) {
                c1681j62.b();
            }
            C1681j6 c1681j63 = c1878y6.f15682f;
            if (c1681j63 != null) {
                c1681j63.b();
            }
        }
        A4 a43 = this.f14665j;
        if (a43 != null) {
            String str2 = O0;
            ((B4) a43).c(str2, G9.a(this, str2, "TAG", "setIsViewHardwareAccelerated "));
        }
        this.f14687u = isHardwareAccelerated();
        if (this.f14673n == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewGroup) {
                viewGroup = (ViewGroup) parent;
            } else {
                viewGroup = null;
            }
            this.f14673n = new WeakReference(viewGroup);
        }
        t();
        A4 a44 = this.f14665j;
        if (a44 != null) {
            String TAG = O0;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a44).a(TAG, "==== CHECKPOINT REACHED - VISIBLE ====");
        }
        A4 a45 = this.f14665j;
        if (a45 != null) {
            ((B4) a45).b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        J5 j52;
        A4 a42 = this.f14665j;
        if (a42 != null) {
            String str = O0;
            ((B4) a42).a(str, G9.a(this, str, "TAG", "onDetachedFromWindow "));
        }
        C1772q3 c1772q3 = this.f14680q0;
        if (c1772q3 != null && (j52 = c1772q3.f15388g) != null) {
            j52.d();
        }
        C1878y6 c1878y6 = this.f14683s;
        if (c1878y6 != null) {
            C1681j6 c1681j6 = c1878y6.f15680d;
            if (c1681j6 != null) {
                c1681j6.a();
            }
            C1681j6 c1681j62 = c1878y6.f15681e;
            if (c1681j62 != null) {
                c1681j62.a();
            }
            C1681j6 c1681j63 = c1878y6.f15682f;
            if (c1681j63 != null) {
                c1681j63.a();
            }
        }
        A4 a43 = this.f14665j;
        if (a43 != null) {
            String TAG = O0;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a43).a(TAG, "Detached from window");
        }
        W w7 = this.f14688u0;
        if (w7 != null) {
            if (w7.f14762d.get()) {
                w7.a("session end is already triggered");
            } else if (!w7.f14760a.getEnabled()) {
                w7.a("config kill switch - false. ad quality will skip");
            } else if (w7.f14765g == null) {
                w7.a("setup not done. ignore trigger");
            } else {
                w7.f14762d.set(true);
                w7.a(false);
            }
            if (this.f14690v0.get()) {
                ((ScheduledThreadPoolExecutor) G3.f14268b.getValue()).schedule(new androidx.appcompat.widget.z0(this, 8), 1L, TimeUnit.SECONDS);
            }
            t();
            try {
                super.onDetachedFromWindow();
                return;
            } catch (IllegalArgumentException e10) {
                A4 a44 = this.f14665j;
                if (a44 != null) {
                    String str2 = O0;
                    StringBuilder a10 = A5.a(str2, "TAG", "Detaching WebView from window encountered an error ( ");
                    a10.append(e10.getMessage());
                    a10.append(" )");
                    ((B4) a44).b(str2, a10.toString());
                    return;
                }
                return;
            }
        }
        kotlin.jvm.internal.g.i("adQualityManager");
        throw null;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent e10) {
        kotlin.jvm.internal.g.e(e10, "e");
        if (!getRenderingConfig().getSupportedGestures().contains(1)) {
            A4 a42 = this.f14665j;
            if (a42 != null) {
                String TAG = O0;
                kotlin.jvm.internal.g.d(TAG, "TAG");
                ((B4) a42).c(TAG, "Double tap gesture is disabled from config");
            }
            return false;
        }
        A4 a43 = this.f14665j;
        if (a43 != null) {
            String TAG2 = O0;
            kotlin.jvm.internal.g.d(TAG2, "TAG");
            ((B4) a43).a(TAG2, "onDoubleTapEvent detected \n " + e10);
        }
        setViewTouchTimestamp(SystemClock.elapsedRealtime());
        if (e10.getAction() == 1) {
            JSONArray jSONArray = new JSONArray();
            try {
                jSONArray.put(AbstractC1579c2.a(e10.getX()));
                jSONArray.put(AbstractC1579c2.a(e10.getY()));
            } catch (JSONException e11) {
                A4 a44 = this.f14665j;
                if (a44 != null) {
                    String TAG3 = O0;
                    kotlin.jvm.internal.g.d(TAG3, "TAG");
                    ((B4) a44).a(TAG3, "Exception in onDoubleTap", e11);
                }
            }
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(jSONArray);
            b("window.imraidview.onGestureDetected('1', '" + jSONArray2 + "');");
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent e10) {
        kotlin.jvm.internal.g.e(e10, "e");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent e10) {
        kotlin.jvm.internal.g.e(e10, "e");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent e22, float f10, float f11) {
        kotlin.jvm.internal.g.e(e22, "e2");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent e10) {
        kotlin.jvm.internal.g.e(e10, "e");
        if (!getRenderingConfig().getSupportedGestures().contains(5)) {
            A4 a42 = this.f14665j;
            if (a42 != null) {
                String TAG = O0;
                kotlin.jvm.internal.g.d(TAG, "TAG");
                ((B4) a42).c(TAG, "LongPress gesture is disabled from config");
                return;
            }
            return;
        }
        A4 a43 = this.f14665j;
        if (a43 != null) {
            String TAG2 = O0;
            kotlin.jvm.internal.g.d(TAG2, "TAG");
            ((B4) a43).a(TAG2, "onLongPress detected \n " + e10);
        }
        JSONArray jSONArray = new JSONArray();
        try {
            jSONArray.put(AbstractC1579c2.a(e10.getX()));
            jSONArray.put(AbstractC1579c2.a(e10.getY()));
        } catch (JSONException e11) {
            A4 a44 = this.f14665j;
            if (a44 != null) {
                String TAG3 = O0;
                kotlin.jvm.internal.g.d(TAG3, "TAG");
                ((B4) a44).a(TAG3, "Exception in onLongPress", e11);
            }
        }
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put(jSONArray);
        b("window.imraidview.onGestureDetected('5', '" + jSONArray2 + "');");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent e22, float f10, float f11) {
        kotlin.jvm.internal.g.e(e22, "e2");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent e10) {
        kotlin.jvm.internal.g.e(e10, "e");
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent e10) {
        kotlin.jvm.internal.g.e(e10, "e");
        if (!getRenderingConfig().getSupportedGestures().contains(0)) {
            A4 a42 = this.f14665j;
            if (a42 != null) {
                String TAG = O0;
                kotlin.jvm.internal.g.d(TAG, "TAG");
                ((B4) a42).c(TAG, "Click gesture is disabled from config");
            }
            return false;
        }
        A4 a43 = this.f14665j;
        if (a43 != null) {
            String TAG2 = O0;
            kotlin.jvm.internal.g.d(TAG2, "TAG");
            ((B4) a43).a(TAG2, "onSingleTapConfirmed detected \n " + e10);
        }
        JSONArray jSONArray = new JSONArray();
        try {
            jSONArray.put(AbstractC1579c2.a(e10.getX()));
            jSONArray.put(AbstractC1579c2.a(e10.getY()));
        } catch (JSONException e11) {
            A4 a44 = this.f14665j;
            if (a44 != null) {
                String TAG3 = O0;
                kotlin.jvm.internal.g.d(TAG3, "TAG");
                ((B4) a44).a(TAG3, "Exception in onSingleTapConfirmed", e11);
            }
        }
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put(jSONArray);
        b("window.imraidview.onGestureDetected('0', '" + jSONArray2 + "');");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent e10) {
        kotlin.jvm.internal.g.e(e10, "e");
        A4 a42 = this.f14665j;
        if (a42 != null) {
            String TAG = O0;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).a(TAG, "onSingleTapUp detected \n " + e10);
        }
        setViewTouchTimestamp(SystemClock.elapsedRealtime());
        return false;
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        A4 a42 = this.f14665j;
        if (a42 != null) {
            String str = O0;
            ((B4) a42).c(str, G9.a(this, str, "TAG", "onSizeChanged "));
        }
        super.onSizeChanged(i10, i11, i12, i13);
        A4 a43 = this.f14665j;
        if (a43 != null) {
            String TAG = O0;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a43).a(TAG, "onSizeChanged (" + i10 + ", " + i11 + ')');
        }
        if (i10 != 0 && i11 != 0) {
            int a10 = AbstractC1692k3.a(i10);
            int a11 = AbstractC1692k3.a(i11);
            A4 a44 = this.f14665j;
            if (a44 != null) {
                String TAG2 = O0;
                kotlin.jvm.internal.g.d(TAG2, "TAG");
                ((B4) a44).a(TAG2, "fireSizeChanged " + this + " w-" + a10 + " h-" + a11);
            }
            b("window.mraidview.broadcastEvent('sizeChange'," + a10 + ',' + a11 + ");");
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        kotlin.jvm.internal.g.e(event, "event");
        if (!Float.isNaN(event.getX()) && !Float.isNaN(event.getY())) {
            A4 a42 = this.f14665j;
            if (a42 != null) {
                String str = O0;
                ((B4) a42).a(str, G9.a(this, str, "TAG", "onTouchEvent "));
            }
            if (this.f14650b == 1) {
                this.f14674n0.a(event);
            }
            this.f14676o0.onTouchEvent(event);
            setViewTouchTimestamp(SystemClock.elapsedRealtime());
            return super.onTouchEvent(event);
        }
        if (!this.f14692w0) {
            A4 a43 = this.f14665j;
            if (a43 != null) {
                String TAG = O0;
                kotlin.jvm.internal.g.d(TAG, "TAG");
                ((B4) a43).b(TAG, "onTouchEvent Invalid Coordinates " + event);
            }
            this.f14692w0 = true;
        }
        return super.onTouchEvent(event);
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        Activity fullScreenActivity;
        boolean isInMultiWindowMode;
        A4 a42 = this.f14665j;
        if (a42 != null) {
            String TAG = O0;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).a(TAG, "onWindowFocusChanged " + this + " - " + z10);
        }
        super.onWindowFocusChanged(z10);
        if (z10) {
            if (isShown()) {
                T3 t32 = W3.f14772k;
                if (t32.a(this, this, this.f14672m0, null) && t32.a(this, this, this.f14672m0)) {
                    z10 = true;
                }
            }
            z10 = false;
        }
        if (Build.VERSION.SDK_INT > 23 && (fullScreenActivity = getFullScreenActivity()) != null) {
            isInMultiWindowMode = fullScreenActivity.isInMultiWindowMode();
            if (isInMultiWindowMode) {
                return;
            }
        }
        c(z10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
        if (r2.a(r4, r4, r5) != false) goto L14;
     */
    @Override // android.webkit.WebView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onWindowVisibilityChanged(int r5) {
        /*
            r4 = this;
            com.inmobi.media.A4 r0 = r4.f14665j
            if (r0 == 0) goto L26
            java.lang.String r1 = com.inmobi.media.S9.O0
            java.lang.String r2 = "TAG"
            kotlin.jvm.internal.g.d(r1, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "onWindowVisibilityChanged "
            r2.<init>(r3)
            r2.append(r4)
            r3 = 32
            r2.append(r3)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            com.inmobi.media.B4 r0 = (com.inmobi.media.B4) r0
            r0.c(r1, r2)
        L26:
            super.onWindowVisibilityChanged(r5)
            r0 = 1
            r1 = 0
            if (r5 != 0) goto L2f
            r5 = r0
            goto L30
        L2f:
            r5 = r1
        L30:
            if (r5 == 0) goto L4e
            int r5 = r4.getVisibilityTrackingMinPercentage()
            boolean r2 = r4.isShown()
            if (r2 == 0) goto L4c
            com.inmobi.media.T3 r2 = com.inmobi.media.W3.f14772k
            r3 = 0
            boolean r3 = r2.a(r4, r4, r5, r3)
            if (r3 == 0) goto L4c
            boolean r5 = r2.a(r4, r4, r5)
            if (r5 == 0) goto L4c
            goto L4f
        L4c:
            r0 = r1
            goto L4f
        L4e:
            r0 = r5
        L4f:
            r4.c(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.S9.onWindowVisibilityChanged(int):void");
    }

    public final void p() {
        int webImpressionMinPercentageViewed;
        A4 a42 = this.f14665j;
        if (a42 != null) {
            String str = O0;
            ((B4) a42).a(str, G9.a(this, str, "TAG", "setFallbackImpressionMinPercentageViewed "));
        }
        if (kotlin.jvm.internal.g.a("video", this.f14684s0)) {
            AdConfig adConfig = this.f14685t;
            if (adConfig != null) {
                webImpressionMinPercentageViewed = adConfig.getViewability().getVideoImpressionMinPercentageViewed();
            } else {
                kotlin.jvm.internal.g.i("mAdConfig");
                throw null;
            }
        } else if (kotlin.jvm.internal.g.a("audio", this.f14684s0)) {
            if (kotlin.jvm.internal.g.a("audio", getAdType())) {
                AdConfig adConfig2 = this.f14685t;
                if (adConfig2 != null) {
                    webImpressionMinPercentageViewed = adConfig2.getViewability().getAudioImpressionMinPercentageViewed();
                } else {
                    kotlin.jvm.internal.g.i("mAdConfig");
                    throw null;
                }
            } else {
                AdConfig adConfig3 = this.f14685t;
                if (adConfig3 != null) {
                    webImpressionMinPercentageViewed = adConfig3.getViewability().getWebImpressionMinPercentageViewed();
                } else {
                    kotlin.jvm.internal.g.i("mAdConfig");
                    throw null;
                }
            }
        } else {
            AdConfig adConfig4 = this.f14685t;
            if (adConfig4 != null) {
                webImpressionMinPercentageViewed = adConfig4.getViewability().getWebImpressionMinPercentageViewed();
            } else {
                kotlin.jvm.internal.g.i("mAdConfig");
                throw null;
            }
        }
        this.f14672m0 = webImpressionMinPercentageViewed;
    }

    public final void q() {
        int webImpressionMinTimeViewed;
        if (kotlin.jvm.internal.g.a("video", this.f14684s0)) {
            AdConfig adConfig = this.f14685t;
            if (adConfig != null) {
                webImpressionMinTimeViewed = adConfig.getViewability().getVideoImpressionMinTimeViewed();
            } else {
                kotlin.jvm.internal.g.i("mAdConfig");
                throw null;
            }
        } else if (kotlin.jvm.internal.g.a("audio", this.f14684s0)) {
            if (kotlin.jvm.internal.g.a("audio", getAdType())) {
                AdConfig adConfig2 = this.f14685t;
                if (adConfig2 != null) {
                    webImpressionMinTimeViewed = adConfig2.getViewability().getAudioImpressionMinTimeViewed();
                } else {
                    kotlin.jvm.internal.g.i("mAdConfig");
                    throw null;
                }
            } else {
                AdConfig adConfig3 = this.f14685t;
                if (adConfig3 != null) {
                    webImpressionMinTimeViewed = adConfig3.getViewability().getWebImpressionMinTimeViewed();
                } else {
                    kotlin.jvm.internal.g.i("mAdConfig");
                    throw null;
                }
            }
        } else {
            AdConfig adConfig4 = this.f14685t;
            if (adConfig4 != null) {
                webImpressionMinTimeViewed = adConfig4.getViewability().getWebImpressionMinTimeViewed();
            } else {
                kotlin.jvm.internal.g.i("mAdConfig");
                throw null;
            }
        }
        this.f14670l0 = webImpressionMinTimeViewed;
    }

    public final void r() {
        A4 a42 = this.f14665j;
        if (a42 != null) {
            String str = O0;
            ((B4) a42).a(str, G9.a(this, str, "TAG", "setFallbackImpressionParams "));
        }
        q();
        p();
        s();
    }

    public final void s() {
        byte interstitialImpressionType;
        A4 a42 = this.f14665j;
        if (a42 != null) {
            String str = O0;
            ((B4) a42).a(str, G9.a(this, str, "TAG", "setFallbackImpressionType "));
        }
        String adType = getAdType();
        if (kotlin.jvm.internal.g.a(adType, "banner")) {
            AdConfig adConfig = this.f14685t;
            if (adConfig != null) {
                interstitialImpressionType = adConfig.getViewability().getBannerImpressionType();
            } else {
                kotlin.jvm.internal.g.i("mAdConfig");
                throw null;
            }
        } else if (kotlin.jvm.internal.g.a(adType, "audio")) {
            AdConfig adConfig2 = this.f14685t;
            if (adConfig2 != null) {
                interstitialImpressionType = adConfig2.getViewability().getAudioImpressionType();
            } else {
                kotlin.jvm.internal.g.i("mAdConfig");
                throw null;
            }
        } else {
            AdConfig adConfig3 = this.f14685t;
            if (adConfig3 != null) {
                interstitialImpressionType = adConfig3.getViewability().getInterstitialImpressionType();
            } else {
                kotlin.jvm.internal.g.i("mAdConfig");
                throw null;
            }
        }
        this.f14667k = interstitialImpressionType;
    }

    public final void setAdPodHandler(K k10) {
        this.f14654d0 = k10;
    }

    public final void setAdSize(String adSize) {
        kotlin.jvm.internal.g.e(adSize, "adSize");
        A4 a42 = this.f14665j;
        if (a42 != null) {
            String str = O0;
            ((B4) a42).a(str, G9.a(this, str, "TAG", "setAdSize "));
        }
        C1706l3 c1706l3 = AbstractC1692k3.f15250a;
        this.f14660g0 = (int) (AbstractC1692k3.b() * Integer.parseInt(((String[]) new Regex("x").split(adSize, 0).toArray(new String[0]))[0]));
        this.f14666j0 = ((int) (AbstractC1692k3.b() * Integer.parseInt(((String[]) new Regex("x").split(adSize, 0).toArray(new String[0]))[1]))) * this.f14660g0;
    }

    public void setAdType(String str) {
        this.U = str;
    }

    public final void setAllowAutoRedirection(boolean z10) {
        this.f14652c0 = z10;
    }

    public final void setAndUpdateViewState(String state) {
        kotlin.jvm.internal.g.e(state, "state");
        A4 a42 = this.f14665j;
        if (a42 != null) {
            String str = O0;
            ((B4) a42).c(str, G9.a(this, str, "TAG", "setAndUpdateViewState "));
        }
        this.f14677p = state;
        A4 a43 = this.f14665j;
        if (a43 != null) {
            String str2 = O0;
            StringBuilder a10 = A5.a(str2, "TAG", "set state:");
            a10.append(this.f14677p);
            ((B4) a43).a(str2, a10.toString());
        }
        Locale locale = Locale.ENGLISH;
        String e10 = a0.d.e(locale, "ENGLISH", state, locale, "this as java.lang.String).toLowerCase(locale)");
        A4 a44 = this.f14665j;
        if (a44 != null) {
            String TAG = O0;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a44).a(TAG, "fireStateChange " + this + ' ' + e10);
        }
        b("window.mraidview.broadcastEvent('stateChange','" + e10 + "');");
    }

    public final void setBlobProvider(F1 f12) {
        A4 a42 = this.f14665j;
        if (a42 != null) {
            String str = O0;
            ((B4) a42).c(str, G9.a(this, str, "TAG", "setBlobProvider "));
        }
        this.W = f12;
    }

    public void setCloseAssetArea(JSONObject value) {
        kotlin.jvm.internal.g.e(value, "value");
        JSONObject jSONObject = new JSONObject();
        C1706l3 c1706l3 = AbstractC1692k3.f15250a;
        jSONObject.put("left", (int) (AbstractC1692k3.b() * value.optInt("left")));
        jSONObject.put("top", (int) (AbstractC1692k3.b() * value.optInt("top")));
        jSONObject.put("right", (int) (AbstractC1692k3.b() * value.optInt("right")));
        JSONObject put = jSONObject.put("bottom", (int) (AbstractC1692k3.b() * value.optInt("bottom")));
        kotlin.jvm.internal.g.b(put);
        this.L0 = put;
    }

    public final void setCloseEndCardTracker(String str) {
        A4 a42 = this.f14665j;
        if (a42 != null) {
            String str2 = O0;
            ((B4) a42).a(str2, G9.a(this, str2, "TAG", "setCloseEndCardTracker "));
        }
        r referenceContainer = getReferenceContainer();
        if ((referenceContainer instanceof U7) && str != null) {
            ((U7) referenceContainer).b(str);
        }
    }

    public final void setConfiguredArea(long j10) {
        this.f14666j0 = getWidth() * getHeight();
    }

    public final void setContentURL(String str) {
        this.f14662h0 = str;
    }

    public void setCreativeId(String str) {
        this.R = str;
    }

    public final void setDisableBackButton(boolean z10) {
        A4 a42 = this.f14665j;
        if (a42 != null) {
            String str = O0;
            ((B4) a42).a(str, G9.a(this, str, "TAG", "setDisableBackButton "));
        }
        this.G = z10;
    }

    public final void setEmbeddedBrowserJSCallbacks(InterfaceC1746o3 interfaceC1746o3) {
        this.f14682r0 = interfaceC1746o3;
    }

    public void setExitAnimation(int i10) {
        A4 a42 = this.f14665j;
        if (a42 != null) {
            String str = O0;
            ((B4) a42).c(str, G9.a(this, str, "TAG", "setExitAnimation "));
        }
        this.P = i10;
    }

    public final void setExpandProperties(I3 expandProperties) {
        kotlin.jvm.internal.g.e(expandProperties, "expandProperties");
        A4 a42 = this.f14665j;
        if (a42 != null) {
            String str = O0;
            ((B4) a42).a(str, G9.a(this, str, "TAG", "setExpandProperties "));
        }
        if (expandProperties.f14343d) {
            setUseCustomClose(expandProperties.c);
        }
        this.f14691w = expandProperties;
    }

    public void setFriendlyViews(Map<View, ? extends FriendlyObstructionPurpose> map) {
        this.V = map;
    }

    @Override // com.inmobi.media.r
    public void setFullScreenActivityContext(Activity activity) {
        A4 a42 = this.f14665j;
        if (a42 != null) {
            String str = O0;
            ((B4) a42).a(str, G9.a(this, str, "TAG", "setFullScreenActivityContext "));
        }
        this.f14671m = new WeakReference(activity);
        v();
    }

    public final void setImmersiveMode(boolean z10) {
        this.D0 = z10;
    }

    public void setImpressionId(String str) {
        this.f14653d = str;
    }

    public final void setLandingScheme(String str) {
        kotlin.jvm.internal.g.e(str, "<set-?>");
        this.f14657f = str;
    }

    public final void setMarkupTypeAdUnit(String str) {
        kotlin.jvm.internal.g.e(str, "<set-?>");
        this.f14698z0 = str;
    }

    public void setNavBarTypeByInsets(int i10) {
        setNavBarTypeViaInsets(Integer.valueOf(i10));
    }

    public final void setNavBarTypeViaInsets(Integer num) {
        if (!kotlin.jvm.internal.g.a(this.F0, num)) {
            this.F0 = num;
            AbstractC1692k3.a(num);
        }
    }

    public final void setNavBarTypeViaSettings(Integer num) {
        this.E0 = num;
    }

    public final void setOrientationProperties(C1614e9 orientationProperties) {
        kotlin.jvm.internal.g.e(orientationProperties, "orientationProperties");
        A4 a42 = this.f14665j;
        if (a42 != null) {
            String str = O0;
            ((B4) a42).a(str, G9.a(this, str, "TAG", "setOrientationProperties "));
        }
        this.f14686t0 = orientationProperties;
        v();
    }

    public final void setOriginalRenderView(S9 s92) {
        this.f14669l = s92;
    }

    public final void setPlacementId(long j10) {
        this.Q = j10;
    }

    public final void setPreloadView(boolean z10) {
        this.f14651b0 = z10;
    }

    public void setReferenceContainer(r rVar) {
        this.f14649a0 = rVar;
    }

    public final void setRenderViewEventListener(U9 u92) {
        A4 a42 = this.f14665j;
        if (a42 != null) {
            String str = O0;
            ((B4) a42).c(str, G9.a(this, str, "TAG", "setRenderViewEventListener "));
        }
        this.f14675o = u92;
    }

    public final void setResizeProperties(C1713la c1713la) {
        this.f14693x = c1713la;
    }

    public final void setScrollable(boolean z10) {
        A4 a42 = this.f14665j;
        if (a42 != null) {
            String str = O0;
            ((B4) a42).c(str, G9.a(this, str, "TAG", "setScrollable "));
        }
        setScrollContainer(z10);
        setVerticalScrollBarEnabled(z10);
        setHorizontalScrollBarEnabled(z10);
    }

    public void setTelemetryManagerMap(Map<String, C1872y0> map) {
        this.f14694x0 = map;
    }

    public final void setUseCustomClose(boolean z10) {
        A4 a42 = this.f14665j;
        if (a42 != null) {
            String TAG = O0;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).a(TAG, "setUseCustomClose " + this + ' ' + z10);
        }
        this.C = z10;
    }

    public void setViewTouchTimestamp(long j10) {
        this.f14659g = j10;
    }

    public final void setWatermark(final WatermarkData watermarkData) {
        kotlin.jvm.internal.g.e(watermarkData, "watermarkData");
        if (getAdConfig().getWatermarkEnabled()) {
            final byte[] decode = Base64.decode(watermarkData.getWatermarkBase64EncodedString(), 0);
            kotlin.jvm.internal.g.d(decode, "decode(...)");
            getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: qb.y
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    S9.a(S9.this, decode, watermarkData);
                }
            });
            return;
        }
        A4 a42 = this.f14665j;
        if (a42 != null) {
            String TAG = O0;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).c(TAG, "Watermark disabled from config. ignoring...");
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        A4 a42 = this.f14665j;
        if (a42 != null) {
            String str = O0;
            ((B4) a42).a(str, G9.a(this, str, "TAG", "stopLoading "));
        }
        if (!this.I.get()) {
            super.stopLoading();
        }
    }

    public final void t() {
        new C1565b2(this, !this.C, !this.F, this.f14665j).a();
    }

    public final void u() {
        getListener().d(this);
        A4 a42 = this.f14665j;
        if (a42 != null) {
            String TAG = O0;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).a(TAG, "ad dismissed");
        }
        A4 a43 = this.f14665j;
        if (a43 != null) {
            ((B4) a43).a();
        }
        W w7 = this.f14688u0;
        if (w7 != null) {
            if (w7.f14762d.get()) {
                w7.a("session end is already triggered");
                return;
            } else if (!w7.f14760a.getEnabled()) {
                w7.a("config kill switch - false. ad quality will skip");
                return;
            } else if (w7.f14765g == null) {
                w7.a("setup not done. ignore trigger");
                return;
            } else {
                w7.f14762d.set(true);
                w7.a(false);
                return;
            }
        }
        kotlin.jvm.internal.g.i("adQualityManager");
        throw null;
    }

    public final void v() {
        A4 a42 = this.f14665j;
        if (a42 != null) {
            String str = O0;
            ((B4) a42).a(str, G9.a(this, str, "TAG", "updateActivitiesOrientationProperties "));
        }
        Activity activity = (Activity) this.f14671m.get();
        if (activity != null && (activity instanceof InMobiAdActivity)) {
            C1614e9 orientationProperties = this.f14686t0;
            kotlin.jvm.internal.g.e(orientationProperties, "orientationProperties");
            C1734n4 c1734n4 = ((InMobiAdActivity) activity).f14095a;
            if (c1734n4 != null) {
                c1734n4.a(orientationProperties);
            } else {
                kotlin.jvm.internal.g.i("orientationHandler");
                throw null;
            }
        }
    }

    public final void d(boolean z10) {
        A4 a42 = this.f14665j;
        if (a42 != null) {
            String TAG = O0;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).a(TAG, "processDisableCloseRegionRequest " + this + ' ' + z10);
        }
        this.F = z10;
        t();
    }

    public final void a(String url, String templateInfoStr, boolean z10) {
        Activity activity;
        kotlin.jvm.internal.g.e(url, "url");
        kotlin.jvm.internal.g.e(templateInfoStr, "templateInfoStr");
        try {
            JSONObject jSONObject = new JSONObject(templateInfoStr);
            A4 a42 = this.f14665j;
            if (a42 != null) {
                String TAG = O0;
                kotlin.jvm.internal.g.d(TAG, "TAG");
                ((B4) a42).a(TAG, "report - " + getAdType() + " type - sdk - " + Build.VERSION.SDK_INT);
            }
            if (kotlin.jvm.internal.g.a(getAdType(), "int") && Build.VERSION.SDK_INT >= 29 && (activity = (Activity) this.f14671m.get()) != null) {
                ScheduledExecutorService scheduledExecutorService = P.f14562a;
                P.a(activity, this, url, z10, jSONObject, this.f14696y0);
                return;
            }
            ScheduledExecutorService scheduledExecutorService2 = P.f14562a;
            P.a(this, this, url, z10, jSONObject, this.f14696y0);
        } catch (Exception e10) {
            A4 a43 = this.f14665j;
            if (a43 != null) {
                String TAG2 = O0;
                kotlin.jvm.internal.g.d(TAG2, "TAG");
                ((B4) a43).a(TAG2, "issue wile reporting ad", e10);
            }
        }
    }

    @Override // com.inmobi.media.A9
    public final boolean d() {
        A4 a42 = this.f14665j;
        if (a42 != null) {
            String TAG = O0;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).a(TAG, "canRedirectExternally Called");
        }
        return !getRenderingConfig().getAutoRedirectionEnforcement() || (getViewTouchTimestamp() != -1 && SystemClock.elapsedRealtime() - getViewTouchTimestamp() < getRenderingConfig().getUserTouchResetTime());
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f(java.lang.String r6) {
        /*
            r5 = this;
            com.inmobi.media.A4 r0 = r5.f14665j
            java.lang.String r1 = "TAG"
            if (r0 == 0) goto L26
            java.lang.String r2 = com.inmobi.media.S9.O0
            kotlin.jvm.internal.g.d(r2, r1)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "supports "
            r3.<init>(r4)
            r3.append(r5)
            r4 = 32
            r3.append(r4)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            com.inmobi.media.B4 r0 = (com.inmobi.media.B4) r0
            r0.c(r2, r3)
        L26:
            r0 = 0
            if (r6 == 0) goto L8f
            int r2 = r6.hashCode()
            r3 = 1
            switch(r2) {
                case -1886160473: goto L85;
                case -1647691422: goto L56;
                case 1137617595: goto L4a;
                case 1509574865: goto L41;
                case 1642189884: goto L38;
                case 1772979069: goto L32;
                default: goto L31;
            }
        L31:
            goto L8f
        L32:
            java.lang.String r1 = "redirectFraudDetection"
            r6.equals(r1)
            goto L8f
        L38:
            java.lang.String r1 = "saveContent"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L8e
            goto L8f
        L41:
            java.lang.String r2 = "html5video"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L5f
            goto L8f
        L4a:
            java.lang.String r1 = "immersive"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L53
            goto L8f
        L53:
            boolean r0 = r5.D0
            goto L8f
        L56:
            java.lang.String r2 = "inlineVideo"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L5f
            goto L8f
        L5f:
            boolean r6 = r5.f14687u
            if (r6 == 0) goto L68
            boolean r6 = r5.M
            if (r6 == 0) goto L68
            r0 = r3
        L68:
            com.inmobi.media.A4 r6 = r5.f14665j
            if (r6 == 0) goto L8f
            java.lang.String r2 = com.inmobi.media.S9.O0
            kotlin.jvm.internal.g.d(r2, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "HTML5 video supported:"
            r1.<init>(r3)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            com.inmobi.media.B4 r6 = (com.inmobi.media.B4) r6
            r6.c(r2, r1)
            goto L8f
        L85:
            java.lang.String r1 = "playVideo"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L8e
            goto L8f
        L8e:
            r0 = r3
        L8f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.S9.f(java.lang.String):boolean");
    }

    public static /* synthetic */ void getAdType$annotations() {
    }

    public static /* synthetic */ void getImpressionType$annotations() {
    }

    public static /* synthetic */ void getMarkupType$annotations() {
    }

    public static /* synthetic */ void getMarkupTypeAdUnit$annotations() {
    }

    public static /* synthetic */ void getNavBarTypeViaSettings$annotations() {
    }

    public static /* synthetic */ void getPlacementType$annotations() {
    }

    public static /* synthetic */ void getViewState$annotations() {
    }

    public static final void a(S9 this$0) {
        A4 a42;
        kotlin.jvm.internal.g.e(this$0, "this$0");
        if (this$0.isAttachedToWindow() || (a42 = this$0.f14665j) == null) {
            return;
        }
        ((B4) a42).a();
    }

    public final void a(U9 u92, AdConfig adConfig) {
        int otherNetworkLoadsLimit;
        C1772q3 c1772q3;
        JSONObject jSONObject;
        kotlin.jvm.internal.g.e(adConfig, "adConfig");
        A4 a42 = this.f14665j;
        if (a42 != null) {
            String str = O0;
            ((B4) a42).c(str, G9.a(this, str, "TAG", "initialize "));
        }
        if (kotlin.jvm.internal.g.a(this.f14698z0, "htmlUrl")) {
            getSettings().setMixedContentMode(2);
        }
        this.f14685t = adConfig;
        A4 a43 = this.f14665j;
        if (a43 != null) {
            String str2 = O0;
            ((B4) a43).a(str2, G9.a(this, str2, "TAG", "setImpressionParams "));
        }
        if (this.c == null) {
            r();
        } else {
            try {
                r();
                for (Fb fb2 : this.c) {
                    if (fb2.f14255a == 2) {
                        if (fb2.f14256b.containsKey("type")) {
                            Object obj = fb2.f14256b.get("type");
                            kotlin.jvm.internal.g.c(obj, "null cannot be cast to non-null type kotlin.Int");
                            this.f14667k = (byte) ((Integer) obj).intValue();
                        } else {
                            s();
                        }
                        if (fb2.f14256b.containsKey("time")) {
                            Object obj2 = fb2.f14256b.get("time");
                            kotlin.jvm.internal.g.c(obj2, "null cannot be cast to non-null type kotlin.Int");
                            this.f14670l0 = ((Integer) obj2).intValue();
                        } else {
                            q();
                        }
                        if (fb2.f14256b.containsKey("view")) {
                            Object obj3 = fb2.f14256b.get("view");
                            kotlin.jvm.internal.g.c(obj3, "null cannot be cast to non-null type kotlin.Int");
                            this.f14672m0 = ((Integer) obj3).intValue();
                        } else {
                            p();
                        }
                        if (this.f14667k == 2) {
                            if (fb2.f14256b.containsKey("pixel")) {
                                Object obj4 = fb2.f14256b.get("pixel");
                                kotlin.jvm.internal.g.c(obj4, "null cannot be cast to non-null type kotlin.Int");
                                this.f14668k0 = ((Integer) obj4).intValue();
                            } else {
                                s();
                            }
                            if (fb2.f14256b.containsKey("frame")) {
                                Object obj5 = fb2.f14256b.get("frame");
                                JSONArray jSONArray = obj5 instanceof JSONArray ? (JSONArray) obj5 : null;
                                if (jSONArray != null) {
                                    this.f14664i0 = new int[jSONArray.length()];
                                    int length = jSONArray.length();
                                    for (int i10 = 0; i10 < length; i10++) {
                                        int[] iArr = this.f14664i0;
                                        if (iArr != null) {
                                            Object obj6 = jSONArray.get(i10);
                                            kotlin.jvm.internal.g.c(obj6, "null cannot be cast to non-null type kotlin.Int");
                                            iArr[i10] = ((Integer) obj6).intValue();
                                        }
                                    }
                                }
                            } else {
                                s();
                            }
                        }
                    }
                }
            } catch (JSONException unused) {
                A4 a44 = this.f14665j;
                if (a44 != null) {
                    String TAG = O0;
                    kotlin.jvm.internal.g.d(TAG, "TAG");
                    ((B4) a44).b(TAG, "Exception in parsing the impressionType and pixel frame");
                }
                r();
            } catch (Exception unused2) {
                A4 a45 = this.f14665j;
                if (a45 != null) {
                    String TAG2 = O0;
                    kotlin.jvm.internal.g.d(TAG2, "TAG");
                    ((B4) a45).b(TAG2, "SDK encountered an unexpected error in parsing impression parameters");
                }
                r();
            }
        }
        this.f14675o = u92;
        ViewParent parent = getParent();
        this.f14673n = new WeakReference(parent instanceof ViewGroup ? (ViewGroup) parent : null);
        setBackgroundColor(getRenderingConfig().getWebviewBackgroundColor());
        new C1813t6(getMraidConfig().getUrl(), getMraidConfig().getMaxRetries(), getMraidConfig().getRetryInterval(), getMraidConfig().getExpiry(), this.f14665j).a();
        setImportantForAccessibility(2);
        setScrollable(false);
        if (this.D0 && (jSONObject = AbstractC1692k3.f15254f) != null) {
            setSafeArea(jSONObject);
        }
        A4 a46 = this.f14665j;
        if (a46 != null) {
            String str3 = O0;
            StringBuilder a10 = A5.a(str3, "TAG", "safeArea Read from cache - ");
            a10.append(this.G0);
            a10.append(" and navBarType - ");
            a10.append(this.E0);
            ((B4) a46).a(str3, a10.toString());
        }
        int i11 = Build.VERSION.SDK_INT;
        getSettings().setMediaPlaybackRequiresUserGesture(false);
        getSettings().setJavaScriptEnabled(true);
        getSettings().setDomStorageEnabled(getAdConfig().getRendering().getEnableDomStorage());
        getSettings().setGeolocationEnabled(true);
        if (this.f14655e) {
            A4 a47 = this.f14665j;
            if (a47 != null) {
                String TAG3 = O0;
                kotlin.jvm.internal.g.d(TAG3, "TAG");
                ((B4) a47).c(TAG3, "view is in-app browser. Using EmbeddedBrowserViewClient.");
            }
            C1772q3 c1772q32 = new C1772q3("IN_CUSTOM_BROWSER", this.f14665j);
            this.f14680q0 = c1772q32;
            c1772q3 = c1772q32;
        } else {
            A4 a48 = this.f14665j;
            if (a48 != null) {
                String TAG4 = O0;
                kotlin.jvm.internal.g.d(TAG4, "TAG");
                ((B4) a48).c(TAG4, "view is ad. Using RenderViewClient");
            }
            T9 t92 = new T9(this.f14665j, this.T);
            String adType = getAdType();
            if (kotlin.jvm.internal.g.a(adType, "banner")) {
                AdConfig adConfig2 = this.f14685t;
                if (adConfig2 == null) {
                    kotlin.jvm.internal.g.i("mAdConfig");
                    throw null;
                }
                otherNetworkLoadsLimit = adConfig2.getRendering().getBannerNetworkLoadsLimit();
            } else if (kotlin.jvm.internal.g.a(adType, "audio")) {
                AdConfig adConfig3 = this.f14685t;
                if (adConfig3 == null) {
                    kotlin.jvm.internal.g.i("mAdConfig");
                    throw null;
                }
                otherNetworkLoadsLimit = adConfig3.getRendering().getAudioNetworkLoadsLimit();
            } else {
                AdConfig adConfig4 = this.f14685t;
                if (adConfig4 == null) {
                    kotlin.jvm.internal.g.i("mAdConfig");
                    throw null;
                }
                otherNetworkLoadsLimit = adConfig4.getRendering().getOtherNetworkLoadsLimit();
            }
            t92.f14155b = otherNetworkLoadsLimit;
            c1772q3 = t92;
        }
        setWebViewClient(c1772q3);
        setWebChromeClient(this.J0);
        if (!this.f14655e) {
            C1761p5 c1761p5 = new C1761p5(this.f14650b, this);
            A4 a49 = this.f14665j;
            if (a49 != null) {
                c1761p5.f15372d = a49;
            }
            addJavascriptInterface(c1761p5, "sdkController");
        }
        this.f14679q = new C1800s6(this, getMarkupType(), this.f14665j);
        this.f14681r = new C1891z6(this, this.f14665j);
        this.f14683s = new C1878y6(this, this.f14665j);
        this.f14691w = new I3();
        this.f14693x = new C1713la(C1713la.DEFAULT_POSITION, true);
        this.f14688u0 = new W(adConfig.getAdQuality(), this.f14665j);
        if (i11 >= 29) {
            setWebViewRenderProcessClient((ScheduledThreadPoolExecutor) G3.f14268b.getValue(), new X9(this.f14665j, this.T));
        }
    }

    public final void b(String js) {
        kotlin.jvm.internal.g.e(js, "js");
        A4 a42 = this.f14665j;
        if (a42 != null) {
            String TAG = O0;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).c(TAG, "injectJavaScript " + this + " - " + js);
        }
        new Handler(getContainerContext().getMainLooper()).postAtFrontOfQueue(new n0.g(10, this, js));
    }

    public final void b(String str, String url) {
        kotlin.jvm.internal.g.e(url, "url");
        A4 a42 = this.f14665j;
        if (a42 != null) {
            String str2 = O0;
            ((B4) a42).a(str2, G9.a(this, str2, "TAG", "processMediaPlaybackRequest "));
        }
        if (1 != this.f14650b && !kotlin.jvm.internal.g.a("Expanded", this.f14677p)) {
            A4 a43 = this.f14665j;
            if (a43 != null) {
                String TAG = O0;
                kotlin.jvm.internal.g.d(TAG, "TAG");
                ((B4) a43).b(TAG, "Media playback is only supported on full screen ads! Ignoring request ...");
                return;
            }
            return;
        }
        Activity activity = (Activity) this.f14671m.get();
        if (activity == null) {
            A4 a44 = this.f14665j;
            if (a44 != null) {
                String TAG2 = O0;
                kotlin.jvm.internal.g.d(TAG2, "TAG");
                ((B4) a44).b(TAG2, "Media playback is  not allowed before it is visible! Ignoring request ...");
            }
            a(str, "Media playback is  not allowed before it is visible! Ignoring request ...", "playVideo");
            return;
        }
        C1878y6 c1878y6 = this.f14683s;
        if (c1878y6 != null) {
            c1878y6.a(url, activity);
        }
    }

    @Override // com.inmobi.media.r
    public final boolean c() {
        return this.I.get();
    }

    public final void c(String str) {
        Z9 z92 = this.T;
        if (z92 != null) {
            z92.b();
        }
        A4 a42 = this.f14665j;
        if (a42 != null) {
            String str2 = O0;
            ((B4) a42).a(str2, G9.a(this, str2, "TAG", "loadDataInWebView "));
        }
        this.L = false;
        if (this.I.get()) {
            return;
        }
        kotlin.jvm.internal.g.b(str);
        loadDataWithBaseURL("", str, "text/html", "UTF-8", null);
    }

    public final void b(String str, String contentId, String url) {
        kotlin.jvm.internal.g.e(contentId, "contentId");
        kotlin.jvm.internal.g.e(url, "url");
        A4 a42 = this.f14665j;
        if (a42 != null) {
            String str2 = O0;
            ((B4) a42).c(str2, G9.a(this, str2, "TAG", "processSaveContentRequest "));
        }
        A4 a43 = this.f14665j;
        if (a43 != null) {
            String TAG = O0;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a43).a(TAG, "saveContent called: content ID: " + contentId + "; URL: " + url);
        }
        if (!f("saveContent")) {
            A4 a44 = this.f14665j;
            if (a44 != null) {
                String TAG2 = O0;
                kotlin.jvm.internal.g.d(TAG2, "TAG");
                ((B4) a44).b(TAG2, "saveContent called despite the fact that it is not supported");
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(InMobiNetworkValues.URL, url);
                jSONObject.put("reason", 7);
            } catch (JSONException unused) {
            }
            String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.g.d(jSONObject2, "toString(...)");
            a(str, a0.d.d("sendSaveContentResult(\"saveContent_", contentId, "\", 'failed', \"", kotlin.text.j.K(jSONObject2, OperatorName.SHOW_TEXT_LINE_AND_SPACE, "\\\""), "\");"));
            return;
        }
        HashSet hashSet = new HashSet();
        hashSet.add(new C1894z9((byte) -1, url));
        String uuid = UUID.randomUUID().toString();
        kotlin.jvm.internal.g.d(uuid, "toString(...)");
        C1688k c1688k = new C1688k(uuid, hashSet, this.K0, contentId, 2);
        c1688k.c = str;
        X0.a(c1688k);
    }

    public final void e(boolean z10) {
        A4 a42 = this.f14665j;
        if (a42 != null) {
            String TAG = O0;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).a(TAG, "processUseCustomCloseRequest " + this + ' ' + z10);
        }
        setUseCustomClose(z10);
        t();
    }

    @Override // com.inmobi.media.r
    public final void e() {
        A4 a42 = this.f14665j;
        if (a42 != null) {
            String str = O0;
            ((B4) a42).c(str, G9.a(this, str, "TAG", "disableHardwareAcceleration called. "));
        }
        try {
            setLayerType(1, null);
        } catch (Exception e10) {
            Q4 q42 = Q4.f14590a;
            Q4.c.a(AbstractC1863x4.a(e10, "event"));
        }
    }

    public final void a(C1646h c1646h) {
        A4 a42 = this.f14665j;
        if (a42 != null) {
            String str = O0;
            ((B4) a42).c(str, G9.a(this, str, "TAG", "initContextualData "));
        }
        this.H0 = new A2(c1646h, this.Q);
    }

    @Override // com.inmobi.media.r
    public final void a(byte b10, Map map) {
        A4 a42 = this.f14665j;
        if (a42 != null) {
            String TAG = O0;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).a(TAG, "fireEvent " + this + " 2");
        }
    }

    @Override // com.inmobi.media.A9
    public final void a(String mraidApi) {
        kotlin.jvm.internal.g.e(mraidApi, "mraidApi");
        A4 a42 = this.f14665j;
        if (a42 != null) {
            String str = O0;
            ((B4) a42).a(str, G9.a(this, str, "TAG", "sendFraudBeaconAndTelemetryEvent "));
        }
        A4 a43 = this.f14665j;
        if (a43 != null) {
            String TAG = O0;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a43).a(TAG, "fireDetectAutoRedirectFraud " + this + ' ' + mraidApi);
        }
        b("window.mraidview.fireRedirectFraudBeacon('" + mraidApi + "')");
        String adType = getAdType();
        if (adType == null) {
            adType = "banner";
        }
        A4 a44 = this.f14665j;
        if (a44 != null) {
            String TAG2 = O0;
            kotlin.jvm.internal.g.d(TAG2, "TAG");
            ((B4) a44).c(TAG2, "sendTelemetryForAutoRedirectFraud " + this + ' ' + mraidApi + ' ' + adType);
        }
        HashMap hashMap = new HashMap();
        String creativeId = getCreativeId();
        if (creativeId != null) {
            hashMap.put("creativeId", creativeId);
        }
        hashMap.put("trigger", mraidApi);
        String impressionId = getImpressionId();
        if (impressionId != null) {
            hashMap.put("impressionId", impressionId);
        }
        hashMap.put("adType", adType);
        A4 a45 = this.f14665j;
        if (a45 != null) {
            String str2 = O0;
            ((B4) a45).a(str2, G9.a(this, str2, "TAG", "processTelemetryEvent "));
        }
        getListener().a("BlockAutoRedirection", hashMap);
    }

    public final void a(boolean z10) {
        A4 a42 = this.f14665j;
        if (a42 != null) {
            String str = O0;
            ((B4) a42).a(str, G9.a(this, str, "TAG", "fireNextAdLoadComplete "));
        }
        String str2 = "window.imraidview.broadcastEvent('adLoadSuccess'," + z10 + ");";
        A4 a43 = this.f14665j;
        if (a43 != null) {
            String TAG = O0;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a43).c(TAG, str2 + " Index: " + getCurrentRenderingPodAdIndex());
        }
        b(str2);
    }

    public final void a(String str, String message, String str2) {
        kotlin.jvm.internal.g.e(message, "message");
        A4 a42 = this.f14665j;
        if (a42 != null) {
            String TAG = O0;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).a(TAG, "fireError " + this + " - " + message + " - " + str2);
        }
        if (str == null || str2 == null) {
            return;
        }
        a(str, a0.d.d("broadcastEvent('error',\"", message, "\", \"", str2, "\")"));
    }

    public final void b(boolean z10) {
        A4 a42 = this.f14665j;
        if (a42 != null) {
            String str = O0;
            ((B4) a42).c(str, G9.a(this, str, "TAG", "fireNextAdShowComplete "));
        }
        String str2 = "window.imraidview.broadcastEvent('adShowSuccess'," + z10 + ");";
        A4 a43 = this.f14665j;
        if (a43 != null) {
            String TAG = O0;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a43).a(TAG, str2 + " Index: " + getCurrentRenderingPodAdIndex());
        }
        b(str2);
    }

    public final void a(String str, String callback) {
        kotlin.jvm.internal.g.e(callback, "callback");
        A4 a42 = this.f14665j;
        if (a42 != null) {
            String str2 = O0;
            ((B4) a42).a(str2, G9.a(this, str2, "TAG", "fireJavaScriptCallback "));
        }
        if (str == null) {
            return;
        }
        b(str + '.' + callback);
    }

    public static final void a(S9 this$0, String js) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        kotlin.jvm.internal.g.e(js, "$js");
        try {
            if (this$0.I.get()) {
                return;
            }
            String str = "javascript:try{" + js + "}catch(e){}";
            A4 a42 = this$0.f14665j;
            if (a42 != null) {
                String TAG = O0;
                kotlin.jvm.internal.g.d(TAG, "TAG");
                ((B4) a42).a(TAG, "Injecting javascript");
            }
            A4 a43 = this$0.f14665j;
            if (a43 != null) {
                String TAG2 = O0;
                kotlin.jvm.internal.g.d(TAG2, "TAG");
                ((B4) a43).c(TAG2, "evaluateScript " + this$0);
            }
            this$0.evaluateJavascript(str, null);
        } catch (Exception e10) {
            A4 a44 = this$0.f14665j;
            if (a44 != null) {
                String str2 = O0;
                ((B4) a44).b(str2, Cc.a(e10, A5.a(str2, "TAG", "SDK encountered an unexpected error injecting JavaScript in the Ad container; ")));
            }
        }
    }

    @Override // com.inmobi.media.r
    public final void a() {
        ViewGroup viewGroup;
        K k10;
        A4 a42 = this.f14665j;
        if (a42 != null) {
            String str = O0;
            ((B4) a42).a(str, G9.a(this, str, "TAG", "dismissCurrentViewContainer "));
        }
        C1878y6 c1878y6 = this.f14683s;
        if (c1878y6 != null) {
            C1723m6 c1723m6 = c1878y6.c;
            if (c1723m6 != null) {
                c1723m6.b();
            }
            c1878y6.c = null;
        }
        if (kotlin.jvm.internal.g.a("Expanded", this.f14677p)) {
            A4 a43 = this.f14665j;
            if (a43 != null) {
                String str2 = O0;
                ((B4) a43).a(str2, G9.a(this, str2, "TAG", "processCloseRequestOnExpandedRenderView "));
            }
            if (!kotlin.jvm.internal.g.a("Default", this.f14677p)) {
                this.L = true;
                C1800s6 c1800s6 = this.f14679q;
                if (c1800s6 != null) {
                    A4 a44 = c1800s6.c;
                    if (a44 != null) {
                        String TAG = c1800s6.f15442d;
                        kotlin.jvm.internal.g.d(TAG, "TAG");
                        ((B4) a44).c(TAG, "closeExpandedView");
                    }
                    if (c1800s6.f15440a.getOriginalRenderView() == null) {
                        ViewGroup viewGroup2 = c1800s6.f15443e;
                        View rootView = viewGroup2 != null ? viewGroup2.getRootView() : null;
                        if (rootView != null) {
                            View findViewById = rootView.findViewById(Variant.VT_ILLEGAL);
                            ViewParent parent = c1800s6.f15440a.getParent();
                            ViewGroup viewGroup3 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                            if (viewGroup3 != null) {
                                viewGroup3.removeView(c1800s6.f15440a);
                            }
                            ViewParent parent2 = findViewById != null ? findViewById.getParent() : null;
                            viewGroup = parent2 instanceof ViewGroup ? parent2 : null;
                            if (viewGroup != null) {
                                viewGroup.removeView(findViewById);
                            }
                            ViewGroup viewGroup4 = c1800s6.f15443e;
                            if (viewGroup4 != null) {
                                viewGroup4.addView(c1800s6.f15440a, c1800s6.f15444f, new RelativeLayout.LayoutParams(viewGroup4.getWidth(), viewGroup4.getHeight()));
                            }
                            S9 s92 = c1800s6.f15440a;
                            A4 a45 = s92.f14665j;
                            if (a45 != null) {
                                String str3 = O0;
                                ((B4) a45).a(str3, G9.a(s92, str3, "TAG", "resetLayout "));
                            }
                            s92.setVisibility(0);
                            s92.requestLayout();
                        }
                    }
                }
                g();
                this.L = false;
            }
            this.D = false;
        } else if (kotlin.jvm.internal.g.a("Resized", this.f14677p)) {
            A4 a46 = this.f14665j;
            if (a46 != null) {
                String str4 = O0;
                ((B4) a46).a(str4, G9.a(this, str4, "TAG", "processCloseRequestOnResizedRenderView "));
            }
            if (!kotlin.jvm.internal.g.a("Default", this.f14677p)) {
                this.L = true;
                C1891z6 c1891z6 = this.f14681r;
                if (c1891z6 != null) {
                    A4 a47 = c1891z6.f15704b;
                    if (a47 != null) {
                        ((B4) a47).c("MraidResizeProcession", "closeResizedView()");
                    }
                    ViewParent parent3 = c1891z6.f15703a.getParent();
                    ViewGroup viewGroup5 = parent3 instanceof ViewGroup ? (ViewGroup) parent3 : null;
                    View rootView2 = viewGroup5 != null ? viewGroup5.getRootView() : null;
                    View findViewById2 = rootView2 != null ? rootView2.findViewById(65534) : null;
                    ViewGroup viewGroup6 = c1891z6.c;
                    View rootView3 = viewGroup6 != null ? viewGroup6.getRootView() : null;
                    View findViewById3 = rootView3 != null ? rootView3.findViewById(Variant.VT_ILLEGAL) : null;
                    ViewParent parent4 = findViewById3 != null ? findViewById3.getParent() : null;
                    ViewGroup viewGroup7 = parent4 instanceof ViewGroup ? (ViewGroup) parent4 : null;
                    ViewParent parent5 = findViewById2 != null ? findViewById2.getParent() : null;
                    viewGroup = parent5 instanceof ViewGroup ? parent5 : null;
                    if (viewGroup != null) {
                        viewGroup.removeView(findViewById2);
                    }
                    if (viewGroup7 != null) {
                        viewGroup7.removeView(findViewById3);
                    }
                    if (viewGroup5 != null) {
                        viewGroup5.removeView(c1891z6.f15703a);
                    }
                    ViewGroup viewGroup8 = c1891z6.c;
                    if (viewGroup8 != null) {
                        viewGroup8.addView(c1891z6.f15703a, c1891z6.f15705d, new RelativeLayout.LayoutParams(viewGroup8.getWidth(), viewGroup8.getHeight()));
                    }
                    S9 s93 = c1891z6.f15703a;
                    A4 a48 = s93.f14665j;
                    if (a48 != null) {
                        String str5 = O0;
                        ((B4) a48).a(str5, G9.a(s93, str5, "TAG", "resetLayout "));
                    }
                    s93.setVisibility(0);
                    s93.requestLayout();
                }
                setAndUpdateViewState("Default");
                u();
                this.L = false;
            }
        } else if (kotlin.jvm.internal.g.a("Default", this.f14677p)) {
            setAndUpdateViewState(PDLayoutAttributeObject.BORDER_STYLE_HIDDEN);
            ViewParent parent6 = getParent();
            if (1 == this.f14650b) {
                g();
            } else if (parent6 instanceof ViewGroup) {
                ((ViewGroup) parent6).removeAllViews();
            }
        }
        if (this.E != oc.c || (k10 = this.f14654d0) == null) {
            return;
        }
        k10.a(this, getFullScreenActivity());
    }

    @Override // com.inmobi.media.InterfaceC1628f9
    public final void a(EnumC1586c9 orientation) {
        C1891z6 c1891z6;
        kotlin.jvm.internal.g.e(orientation, "orientation");
        A4 a42 = this.f14665j;
        if (a42 != null) {
            String str = O0;
            ((B4) a42).a(str, G9.a(this, str, "TAG", "onOrientationUpdate "));
        }
        if (!kotlin.jvm.internal.g.a("Resized", this.f14677p) || this.f14693x == null || (c1891z6 = this.f14681r) == null) {
            return;
        }
        c1891z6.a();
    }

    public static final boolean a(S9 s92, JsResult jsResult) {
        A4 a42 = s92.f14665j;
        if (a42 != null) {
            String str = O0;
            ((B4) a42).a(str, G9.a(s92, str, "TAG", "shouldRenderPopup "));
        }
        if (s92.getRenderingConfig().shouldRenderPopup()) {
            return true;
        }
        jsResult.cancel();
        A4 a43 = s92.f14665j;
        if (a43 != null) {
            String str2 = O0;
            ((B4) a43).a(str2, G9.a(s92, str2, "TAG", "firePopupBlockedEvent "));
        }
        s92.b("window.mraidview.popupBlocked('popupBlocked')");
        return false;
    }

    public static final void a(S9 s92, String str, String str2, String str3) {
        A4 a42 = s92.f14665j;
        if (a42 != null) {
            String str4 = O0;
            ((B4) a42).a(str4, G9.a(s92, str4, "TAG", "onUserLandingCompleted "));
        }
        s92.b("window.imraid.broadcastEvent('onUserLandingCompleted');");
        if (str2 == null) {
            return;
        }
        s92.a(str2, a0.d.d("broadcastEvent('", str, "Successful','", str3, "');"));
    }
}
