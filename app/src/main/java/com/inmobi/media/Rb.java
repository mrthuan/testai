package com.inmobi.media;

import android.content.ComponentName;
import android.content.Context;
import android.webkit.WebView;
import androidx.window.embedding.ActivityFilter;
import androidx.window.embedding.ActivityRule;
import androidx.window.embedding.RuleController;
import com.google.android.gms.appset.AppSetIdInfo;
import com.iab.omid.library.inmobi.Omid;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Rb {

    /* renamed from: b */
    public static boolean f14620b;

    /* renamed from: a */
    public static final Rb f14619a = new Rb();
    public static final Qb c = new Qb();

    public static final /* synthetic */ void a(Rb rb2) {
        rb2.getClass();
        b();
    }

    public static final void b(Context context) {
        kotlin.jvm.internal.g.e(context, "$context");
        try {
            WebView webView = new WebView(context);
            webView.setWebViewClient(new Gc());
            webView.clearCache(true);
        } catch (Exception e10) {
            Q4 q42 = Q4.f14590a;
            Q4.c.a(AbstractC1863x4.a(e10, "event"));
        }
    }

    public static final void d(Context context) {
        boolean z10;
        Context d10;
        Context d11;
        JSONObject jSONObject;
        kotlin.jvm.internal.g.e(context, "$context");
        Ia ia2 = Ia.f14348a;
        if (ia2.b(context) && L3.a(context).isEmpty()) {
            ia2.a(context, false);
        }
        D2 d22 = D2.f14184a;
        LinkedList linkedList = new LinkedList(AbstractC1860x1.a((C1887z2) AbstractC1882ya.f15687d.getValue(), null, null, null, null, null, null, 63));
        D2.f14185b = linkedList;
        Object clone = linkedList.clone();
        kotlin.jvm.internal.g.c(clone, "null cannot be cast to non-null type java.util.LinkedList<com.inmobi.signals.contextualdata.EncryptedContextualData>");
        D2.c = (LinkedList) clone;
        if (P.f14564d == null) {
            P.f14564d = new N(P.f14565e);
        }
        N n10 = P.f14564d;
        if (n10 != null) {
            if (!n10.f14502b.get()) {
                N n11 = P.f14564d;
                if (n11 != null) {
                    n11.a();
                } else {
                    kotlin.jvm.internal.g.i("executor");
                    throw null;
                }
            }
            N4.b();
            N4.a();
            C1706l3 c1706l3 = AbstractC1692k3.f15250a;
            LinkedHashMap linkedHashMap = C1732n2.f15334a;
            AdConfig adConfig = (AdConfig) AbstractC1773q4.a("ads", "null cannot be cast to non-null type com.inmobi.commons.core.configs.AdConfig", null);
            Y adReqDeprecateChecker = adConfig.getAdReqDeprecateChecker();
            if (adReqDeprecateChecker != null) {
                z10 = adReqDeprecateChecker.a(true);
            } else {
                z10 = true;
            }
            AbstractC1692k3.f15253e = z10;
            AbstractC1692k3.e();
            if (adConfig.getRendering().getEnableImmersive()) {
                if (AbstractC1692k3.f15257i && (d11 = Ha.d()) != null) {
                    ConcurrentHashMap concurrentHashMap = C1851w5.f15578b;
                    String string = AbstractC1838v5.a(d11, "display_info_store").f15579a.getString("safe_area", null);
                    if (string != null) {
                        try {
                            jSONObject = new JSONObject(string);
                        } catch (JSONException unused) {
                        }
                        AbstractC1692k3.f15254f = jSONObject;
                        Objects.toString(jSONObject);
                    }
                    jSONObject = null;
                    AbstractC1692k3.f15254f = jSONObject;
                    Objects.toString(jSONObject);
                }
                if (AbstractC1692k3.f15257i && AbstractC1692k3.f() == null && (d10 = Ha.d()) != null) {
                    ConcurrentHashMap concurrentHashMap2 = C1851w5.f15578b;
                    int i10 = AbstractC1838v5.a(d10, "display_info_store").f15579a.getInt("nav_bar_type", -1);
                    Integer valueOf = Integer.valueOf(i10);
                    AbstractC1692k3.f15255g = valueOf;
                    if (i10 == -1) {
                        valueOf = null;
                    }
                    AbstractC1692k3.f15255g = valueOf;
                }
            }
            b();
            try {
                kotlin.jvm.internal.i.a(ActivityFilter.class).b();
                kotlin.jvm.internal.i.a(ActivityRule.class).b();
                kotlin.jvm.internal.i.a(RuleController.class).b();
                RuleController.Companion.getInstance(context).addRule(new ActivityRule.Builder(ea.a.y(new ActivityFilter(new ComponentName(context, InMobiAdActivity.class), null))).setAlwaysExpand(true).build());
            } catch (NoClassDefFoundError unused2) {
            }
            try {
                X0.f14813a.c();
                X0.a();
            } catch (Exception unused3) {
            }
            Ia.f14348a.a(context, "10.7.8");
            f14620b = true;
            return;
        }
        kotlin.jvm.internal.g.i("executor");
        throw null;
    }

    public final boolean c() {
        try {
            kotlin.jvm.internal.i.a(u.d.class).b();
            kotlin.jvm.internal.i.a(Omid.class).b();
            return false;
        } catch (NoClassDefFoundError unused) {
            return true;
        }
    }

    public final void e(Context context) {
        kotlin.jvm.internal.g.e(context, "context");
        O0.f14537a.a(context, c);
    }

    public final void a(Context context) {
        kotlin.jvm.internal.g.e(context, "context");
        try {
            Ia ia2 = Ia.f14348a;
            if (ia2.a(context) == null || !kotlin.jvm.internal.g.a(ia2.a(context), "10.7.8")) {
                ExecutorC1639g6 executorC1639g6 = (ExecutorC1639g6) G3.f14269d.getValue();
                qb.u uVar = new qb.u(context, 0);
                executorC1639g6.getClass();
                executorC1639g6.f15096a.post(uVar);
                ia2.a(context, L3.b(context));
                Ha ha2 = Ha.f14324a;
                Context applicationContext = context.getApplicationContext();
                kotlin.jvm.internal.g.d(applicationContext, "getApplicationContext(...)");
                ha2.a(applicationContext);
            }
        } catch (Exception e10) {
            Q4 q42 = Q4.f14590a;
            Q4.c.a(AbstractC1863x4.a(e10, "event"));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:241:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x02c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(android.content.Context r21) {
        /*
            Method dump skipped, instructions count: 752
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Rb.c(android.content.Context):void");
    }

    public static void b() {
        try {
            Hb.f14332a.a();
            AppSetIdInfo appSetIdInfo = K0.f14384a;
            LinkedHashMap linkedHashMap = C1732n2.f15334a;
            C1705l2.a();
            Y1.f14860a.g();
            C1616eb.c();
            Na.f14534a.b();
            Dc dc2 = Dc.f14205a;
            X0.f14813a.c();
            E9.c.set(true);
            E9.b();
            Ha.f().a(new int[]{2, 1, 100, ShapeTypes.FLOW_CHART_MERGE, ShapeTypes.FLOW_CHART_EXTRACT, ShapeTypes.FLOW_CHART_OFFLINE_STORAGE}, E9.f14232g);
            X2 x22 = Q4.f14591b;
            if (x22 != null) {
                for (W2 w22 : x22.c) {
                    w22.a();
                }
            }
            C1877y5 c1877y5 = Q4.c;
            c1877y5.c();
            Ha.f().a(new int[]{2, 1, ShapeTypes.FLOW_CHART_OFFLINE_STORAGE, ShapeTypes.FLOW_CHART_EXTRACT, ShapeTypes.FLOW_CHART_MERGE}, c1877y5.f15677d);
            C1616eb.b("SessionStarted", new HashMap(), EnumC1686jb.f15238a);
            Ya.b();
        } catch (Exception unused) {
            Z5.a((byte) 2, "Rb", "SDK encountered unexpected error while starting internal components");
        }
    }

    public static final void a() {
        try {
            if (C1732n2.c.getAndSet(false)) {
                kotlin.jvm.internal.g.d(C1732n2.f(), "access$getTAG$cp(...)");
                ((HandlerC1649h2) C1732n2.f15335b.getValue()).sendEmptyMessage(5);
            }
            C1616eb.f15036d.set(false);
            A3 a32 = C1616eb.f15038f;
            if (a32 != null) {
                ScheduledExecutorService scheduledExecutorService = a32.f14122h;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                }
                a32.f14122h = null;
                a32.f14119e.set(false);
                a32.f14120f.set(true);
                a32.f14121g.clear();
                a32.f14123i = null;
            }
            C1616eb.f15038f = null;
            C1616eb.f15041i = null;
            Ha.f().a(C1616eb.f15040h);
            Na.f14534a.d();
            X0.f14821j.set(true);
            X0.d();
            E9.c.set(false);
            Ha.f().a(E9.f14232g);
            E9.f14228b = null;
            X2 x22 = Q4.f14591b;
            if (x22 != null) {
                for (W2 w22 : x22.c) {
                    w22.b();
                }
            }
            C1877y5 c1877y5 = Q4.c;
            A3 a33 = c1877y5.f15676b;
            if (a33 != null) {
                ScheduledExecutorService scheduledExecutorService2 = a33.f14122h;
                if (scheduledExecutorService2 != null) {
                    scheduledExecutorService2.shutdownNow();
                }
                a33.f14122h = null;
                a33.f14119e.set(false);
                a33.f14120f.set(true);
                a33.f14121g.clear();
                a33.f14123i = null;
            }
            Ha.f().a(c1877y5.f15677d);
            Ya.a();
        } catch (Exception unused) {
            Z5.a((byte) 1, "Rb", "SDK encountered unexpected error while stopping internal components");
        }
    }
}
