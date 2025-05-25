package com.inmobi.media;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.iab.omid.library.inmobi.Omid;
import com.inmobi.adquality.models.AdQualityControl;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.WatermarkData;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.commons.core.configs.Config;
import com.inmobi.commons.core.configs.TelemetryConfig;
import com.inmobi.media.AbstractC1846w0;
import com.inmobi.unification.sdk.model.Initialization.TimeoutConfigurations$ABConfig;
import com.inmobi.unification.sdk.model.Initialization.TimeoutConfigurations$AdABConfig;
import com.inmobi.unification.sdk.model.Initialization.TimeoutConfigurations$AdNonABConfig;
import com.inmobi.unification.sdk.model.Initialization.TimeoutConfigurations$AdPreloadConfig;
import com.inmobi.unification.sdk.model.Initialization.TimeoutConfigurations$MediationConfig;
import com.inmobi.unification.sdk.model.Initialization.TimeoutConfigurations$NonABConfig;
import com.inmobi.unification.sdk.model.Initialization.TimeoutConfigurations$PreloadConfig;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import lib.zj.office.fc.hssf.record.NameCommentRecord;
import lib.zj.office.fc.hssf.record.chart.ChartEndBlockRecord;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.w0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1846w0 extends U9 implements InterfaceC1591d0, F1, InterfaceC1844vb, InterfaceC1645gc, InterfaceC1767pb, K {
    public static final /* synthetic */ int L = 0;
    public boolean A;
    public String B;
    public final C1819u C;
    public C1884z D;
    public C1596d5 E;
    public C1762p6 F;
    public final Handler G;
    public final LinkedHashMap H;
    public final C1872y0 I;
    public WatermarkData J;
    public final C1756p0 K;

    /* renamed from: a  reason: collision with root package name */
    public byte f15523a;

    /* renamed from: b  reason: collision with root package name */
    public AdConfig f15524b;
    public WeakReference c;

    /* renamed from: d  reason: collision with root package name */
    public Cb f15525d;

    /* renamed from: e  reason: collision with root package name */
    public C1633g0 f15526e;

    /* renamed from: f  reason: collision with root package name */
    public WeakReference f15527f;

    /* renamed from: g  reason: collision with root package name */
    public ArrayList f15528g;

    /* renamed from: h  reason: collision with root package name */
    public M6 f15529h;

    /* renamed from: i  reason: collision with root package name */
    public HashMap f15530i;

    /* renamed from: j  reason: collision with root package name */
    public A4 f15531j;

    /* renamed from: k  reason: collision with root package name */
    public byte f15532k;

    /* renamed from: l  reason: collision with root package name */
    public Handler f15533l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f15534m;

    /* renamed from: n  reason: collision with root package name */
    public S9 f15535n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f15536o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f15537p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f15538q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f15539r;

    /* renamed from: s  reason: collision with root package name */
    public R8 f15540s;

    /* renamed from: t  reason: collision with root package name */
    public J f15541t;

    /* renamed from: u  reason: collision with root package name */
    public C1577c0 f15542u;

    /* renamed from: v  reason: collision with root package name */
    public C1870xb f15543v;

    /* renamed from: w  reason: collision with root package name */
    public int f15544w;

    /* renamed from: x  reason: collision with root package name */
    public int f15545x;

    /* renamed from: y  reason: collision with root package name */
    public long f15546y;

    /* renamed from: z  reason: collision with root package name */
    public TreeSet f15547z;

    public AbstractC1846w0(Context context, J adPlacement, AbstractC1689k0 abstractC1689k0) {
        boolean z10;
        Boolean o10;
        kotlin.jvm.internal.g.e(context, "context");
        kotlin.jvm.internal.g.e(adPlacement, "adPlacement");
        this.f15528g = new ArrayList();
        this.f15546y = -1L;
        this.f15547z = new TreeSet();
        this.C = C1819u.f15483a;
        this.G = new Handler(Looper.getMainLooper());
        this.H = new LinkedHashMap();
        this.I = new C1872y0(this);
        this.K = new C1756p0(this);
        toString();
        this.c = new WeakReference(context);
        this.f15541t = adPlacement;
        WeakReference weakReference = new WeakReference(abstractC1689k0);
        this.f15527f = weakReference;
        String q5 = q();
        C1577c0 c1577c0 = this.f15542u;
        if (c1577c0 != null && (o10 = c1577c0.o()) != null) {
            z10 = o10.booleanValue();
        } else {
            z10 = false;
        }
        this.D = new C1884z(weakReference, q5, z10);
        n0();
    }

    public static final /* synthetic */ String e() {
        return "w0";
    }

    public final int A() {
        return this.f15545x;
    }

    public long A0() {
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("w0", AbstractC1661i0.a("w0", "TAG", "timeSincePodShow ", this));
        }
        if (this.A) {
            return System.currentTimeMillis() - this.f15546y;
        }
        return -1L;
    }

    public final TreeSet<Integer> B() {
        return this.f15547z;
    }

    public final C1659hc B0() {
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("w0", AbstractC1661i0.a("w0", "TAG", "trySetTheLocalVideoDescriptor ", this));
        }
        C1646h m10 = m();
        if (m10 != null) {
            if (m10 instanceof R7) {
                R7 r72 = (R7) m10;
                C1674j b10 = AbstractC1882ya.a().b(r72.f14613a);
                if (b10 != null && b10.a()) {
                    String str = b10.c;
                    String str2 = r72.f14614b;
                    String str3 = r72.c;
                    List list = r72.f14615d;
                    List list2 = r72.f14616e;
                    AdConfig adConfig = this.f15524b;
                    kotlin.jvm.internal.g.b(adConfig);
                    return new C1659hc(str, str2, str3, list, list2, adConfig.getVastVideo());
                }
                throw new IllegalStateException("Asset not available in cache".toString());
            }
            return null;
        }
        throw new IllegalStateException("No ad");
    }

    public final long C() {
        return this.f15546y;
    }

    public final Handler D() {
        return this.f15533l;
    }

    public final String E() {
        String u7;
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("w0", AbstractC1661i0.a("w0", "TAG", "markupType getter ", this));
        }
        C1646h m10 = m();
        if (m10 == null || (u7 = m10.u()) == null) {
            return "unknown";
        }
        return u7;
    }

    public Integer F() {
        return null;
    }

    public final M6 G() {
        return this.f15529h;
    }

    public final R8 H() {
        return this.f15540s;
    }

    public final J I() {
        return this.f15541t;
    }

    public abstract byte J();

    public String K() {
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("w0", AbstractC1661i0.a("w0", "TAG", "getPodAdContext ", this));
        }
        if (this.A) {
            return this.B;
        }
        return null;
    }

    public final String L() {
        return c(0);
    }

    public final Map<String, String> M() {
        return this.f15541t.f();
    }

    public JSONArray N() {
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("w0", AbstractC1661i0.a("w0", "TAG", "getRenderableAdIndexes ", this));
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f15547z.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            kotlin.jvm.internal.g.b(num);
            jSONArray.put(num.intValue());
        }
        return jSONArray;
    }

    public long O() {
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("w0", AbstractC1661i0.a("w0", "TAG", "getShowTimeStamp ", this));
        }
        if (this.A) {
            return this.f15546y;
        }
        return -1L;
    }

    public final tf.d P() {
        AbstractC1689k0 r4 = r();
        long currentTimeMillis = System.currentTimeMillis();
        if (a(r4, currentTimeMillis)) {
            return tf.d.f30009a;
        }
        this.f15539r = true;
        if (this.f15540s == null) {
            this.f15540s = new R8(this);
        }
        C1819u c1819u = this.C;
        int hashCode = hashCode();
        N3 n32 = new N3(this, currentTimeMillis, this.f15531j);
        c1819u.getClass();
        C1819u.a(hashCode, n32);
        return tf.d.f30009a;
    }

    public final byte Q() {
        return this.f15523a;
    }

    public final String S() {
        LinkedList<C1646h> f10;
        C1646h c1646h;
        String w7;
        C1577c0 c1577c0 = this.f15542u;
        if (c1577c0 == null || (f10 = c1577c0.f()) == null || (c1646h = (C1646h) kotlin.collections.m.s0(f10)) == null || (w7 = c1646h.w()) == null) {
            return "";
        }
        return w7;
    }

    public final byte T() {
        return this.f15532k;
    }

    public final void V() {
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("w0", AbstractC1661i0.a("w0", "TAG", "handleInterActive ", this));
        }
        C1819u c1819u = this.C;
        int hashCode = hashCode();
        C1743o0 c1743o0 = new C1743o0(this);
        c1819u.getClass();
        C1819u.a(hashCode, c1743o0);
    }

    public final boolean W() {
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("w0", AbstractC1661i0.a("w0", "TAG", "hasAdExpired ", this));
        }
        C1646h m10 = m();
        if (m10 != null) {
            AdConfig adConfig = this.f15524b;
            kotlin.jvm.internal.g.b(adConfig);
            return m10.a(adConfig.getCacheConfig(q()).getTimeToLive());
        }
        return false;
    }

    public final boolean X() {
        AdConfig.RenderingConfig rendering;
        AdConfig adConfig = this.f15524b;
        if (adConfig != null && (rendering = adConfig.getRendering()) != null && rendering.getEnablePubMuteControl() && Ha.o()) {
            return true;
        }
        return false;
    }

    @SuppressLint({"SwitchIntDef"})
    public final boolean Y() {
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("w0", "isBlockingStateForLoadWithResponse getter " + this + " state=" + ((int) this.f15523a));
        }
        if (!M3.f14454a.a()) {
            g();
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.GDPR_COMPLIANCE_ENFORCED), true, (short) 2141);
            return true;
        } else if (f0()) {
            A4 a43 = this.f15531j;
            if (a43 != null) {
                StringBuilder a10 = A5.a("w0", "TAG", "Some of the dependency libraries for ");
                a10.append(q());
                a10.append(" not found");
                ((B4) a43).b("w0", a10.toString());
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES), true, (short) 2007);
            return true;
        } else {
            byte b10 = this.f15523a;
            if (b10 == 1) {
                A4 a44 = this.f15531j;
                if (a44 != null) {
                    ((B4) a44).b("w0", "load with reasponse called while loading");
                }
                b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOAD_WITH_RESPONSE_CALLED_WHILE_LOADING), false, (short) 2001);
                return true;
            } else if (b10 != 7) {
                return false;
            } else {
                A4 a45 = this.f15531j;
                if (a45 != null) {
                    ((B4) a45).b("w0", "ad active before load");
                }
                b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE), false, (short) 2003);
                return true;
            }
        }
    }

    public final boolean Z() {
        return this.f15536o;
    }

    public abstract /* synthetic */ void a(int i10, S9 s92);

    public final boolean a0() {
        return this.f15534m;
    }

    public abstract /* synthetic */ void b();

    public final boolean b0() {
        return this.A;
    }

    public final String c(int i10) {
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("w0", AbstractC1661i0.a("w0", "TAG", "getPubContent ", this));
        }
        if (i10 <= 0 || this.A) {
            C1646h a10 = a(i10);
            if (a10 != null) {
                return a10.x();
            }
            return null;
        }
        return "";
    }

    public void c0() {
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("w0", AbstractC1661i0.a("w0", "TAG", "load  ", this));
        }
        C1872y0 c1872y0 = this.I;
        c1872y0.getClass();
        c1872y0.c = SystemClock.elapsedRealtime();
        a(new C1769q0(this), new C1781r0(this));
    }

    public final void d(byte b10) {
        A4 a42 = this.f15531j;
        if (a42 != null) {
            StringBuilder a10 = A5.a("w0", "TAG", "from ");
            a10.append((int) this.f15523a);
            a10.append(" to ");
            a10.append((int) b10);
            a10.append(' ');
            a10.append(this);
            ((B4) a42).d("w0", a10.toString());
        }
        this.f15523a = b10;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d0() {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.AbstractC1846w0.d0():void");
    }

    public final void e0() {
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).a("w0", AbstractC1661i0.a("w0", "TAG", "makeUnitActive ", this));
        }
        this.f15536o = false;
    }

    public final void f(AbstractC1689k0 listener) {
        kotlin.jvm.internal.g.e(listener, "listener");
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).a("w0", AbstractC1661i0.a("w0", "TAG", "onLoadSuccess ", this));
        }
        AdMetaInfo l10 = l();
        if (l10 == null) {
            A4 a43 = this.f15531j;
            if (a43 != null) {
                ((B4) a43).b("w0", "load success - ad unit null");
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2107);
            return;
        }
        b((byte) 1);
        A4 a44 = this.f15531j;
        if (a44 != null) {
            ((B4) a44).a("w0", "callback - onAdLoadSucceeded");
        }
        listener.c(l10);
    }

    public boolean f0() {
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("w0", AbstractC1661i0.a("w0", "TAG", "missingPrerequisitesForAd ", this));
        }
        try {
            kotlin.jvm.internal.i.a(RecyclerView.class).b();
            kotlin.jvm.internal.i.a(u.d.class).b();
            return false;
        } catch (NoClassDefFoundError unused) {
            return true;
        }
    }

    public final void g(int i10) {
        this.f15544w = i10;
    }

    public void g0() {
        C1872y0 c1872y0 = this.I;
        c1872y0.getClass();
        c1872y0.f15669h = SystemClock.elapsedRealtime();
    }

    public final void h(int i10) {
        this.f15545x = i10;
    }

    public final D h0() {
        O8 o82;
        String str;
        String jSONArray;
        boolean z10;
        int i10;
        Integer num;
        Integer num2;
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).a("w0", AbstractC1661i0.a("w0", "TAG", "prepareAdRequest ", this));
        }
        Context t4 = t();
        M8 m82 = null;
        if (t4 != null) {
            o82 = new O8(t4, this.f15531j);
        } else {
            o82 = null;
        }
        AdConfig adConfig = this.f15524b;
        if (adConfig != null) {
            str = adConfig.getUrl();
        } else {
            str = null;
        }
        AdConfig adConfig2 = this.f15524b;
        kotlin.jvm.internal.g.b(adConfig2);
        Ib ib2 = new Ib(adConfig2.getIncludeIdParams());
        ArrayList a10 = AbstractC1882ya.a().a();
        if (a10.isEmpty()) {
            jSONArray = null;
        } else {
            JSONArray jSONArray2 = new JSONArray();
            Iterator it = a10.iterator();
            while (it.hasNext()) {
                try {
                    jSONArray2.put(URLEncoder.encode(((C1674j) it.next()).f15197b, "UTF-8"));
                } catch (UnsupportedEncodingException unused) {
                }
            }
            jSONArray = jSONArray2.toString();
        }
        J j10 = this.f15541t;
        if (o82 != null) {
            if (!o82.f14557d) {
                A4 a43 = o82.f14556b;
                if (a43 != null) {
                    ((B4) a43).a("NovatiqDataHandler", "Novatiq disabled. skip");
                }
                m82 = new M8(kotlin.collections.q.y0());
            } else {
                m82 = new M8(kotlin.collections.q.z0(new Pair("n-h-id", o82.c)));
            }
        }
        M8 m83 = m82;
        A4 a44 = this.f15531j;
        AdConfig adConfig3 = this.f15524b;
        if (adConfig3 != null) {
            z10 = adConfig3.getApplyGzipReq();
        } else {
            z10 = false;
        }
        D d10 = new D(str, ib2, jSONArray, j10, m83, a44, z10);
        d10.C = this.f15541t.i();
        d10.B = q();
        d10.A = "unifiedSdkJson";
        d10.D = o();
        C1762p6 c1762p6 = this.F;
        int i11 = Cb.DEFAULT_TIMEOUT;
        if (c1762p6 != null && (num2 = c1762p6.f15375d) != null) {
            i10 = num2.intValue();
        } else {
            i10 = 15000;
        }
        d10.f14289p = i10;
        C1762p6 c1762p62 = this.F;
        if (c1762p62 != null && (num = c1762p62.f15375d) != null) {
            i11 = num.intValue();
        }
        d10.f14290q = i11;
        d10.f14288o = X();
        return d10;
    }

    public final void i() {
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).a("w0", AbstractC1661i0.a("w0", "TAG", "fireAdServedBeacon ", this));
        }
        r k10 = k();
        if (k10 == null) {
            return;
        }
        k10.a((byte) 2, null);
    }

    public Cb i0() {
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("w0", AbstractC1661i0.a("w0", "TAG", "provideTimeoutConfigurations ", this));
        }
        Cb cb2 = this.f15525d;
        kotlin.jvm.internal.g.b(cb2);
        return cb2;
    }

    public final AdConfig j() {
        return this.f15524b;
    }

    public abstract void j0();

    public final r k() {
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("w0", AbstractC1661i0.a("w0", "TAG", "adMarkupContainer getter ", this));
        }
        byte b10 = this.f15523a;
        String E = E();
        int hashCode = E.hashCode();
        if (hashCode != -1084172778) {
            if (hashCode != 3213227) {
                if (hashCode == 1236050372 && E.equals("htmlUrl") && b10 != 0 && 1 != b10 && 3 != b10) {
                    return w();
                }
            } else if (E.equals("html") && b10 != 0 && 1 != b10 && 3 != b10) {
                return w();
            }
        } else if (E.equals("inmobiJson") && b10 != 0 && 1 != b10 && 3 != b10 && 2 != b10) {
            return this.f15529h;
        }
        return null;
    }

    public void k0() {
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).a("w0", AbstractC1661i0.a("w0", "TAG", "resetContainersForNextAd ", this));
        }
        M6 m62 = this.f15529h;
        if (m62 != null) {
            m62.b();
        }
        this.f15529h = null;
        int size = this.f15528g.size();
        int i10 = this.f15545x;
        if (size > i10 && this.f15528g.get(i10) != null) {
            a(this.f15545x, false);
        }
    }

    public final AdMetaInfo l() {
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("w0", AbstractC1661i0.a("w0", "TAG", "adMetaInfo getter ", this));
        }
        C1646h m10 = m();
        if (m10 != null) {
            return m10.d();
        }
        return null;
    }

    public final L5 l0() {
        String str;
        String str2;
        boolean z10;
        Boolean o10;
        String w7;
        String p10;
        long l10 = this.f15541t.l();
        String valueOf = String.valueOf(this.f15541t.m());
        String q5 = q();
        String E = E();
        C1646h u7 = u();
        if (u7 == null || (p10 = u7.p()) == null) {
            str = "";
        } else {
            str = p10;
        }
        C1646h u10 = u();
        if (u10 == null || (w7 = u10.w()) == null) {
            str2 = "";
        } else {
            str2 = w7;
        }
        C1577c0 c1577c0 = this.f15542u;
        if (c1577c0 != null && (o10 = c1577c0.o()) != null) {
            z10 = o10.booleanValue();
        } else {
            z10 = false;
        }
        return new L5(l10, valueOf, q5, E, str, str2, z10, System.currentTimeMillis());
    }

    public final C1646h m() {
        return a(0);
    }

    public final void m0() {
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).d("w0", "AdUnit " + this + " state - FAILED");
        }
        d((byte) 3);
        b((byte) 1);
    }

    public final String n() {
        C1577c0 c1577c0 = this.f15542u;
        if (c1577c0 != null) {
            return c1577c0.c();
        }
        return null;
    }

    public final void n0() {
        toString();
        String b10 = Ha.b();
        LinkedHashMap linkedHashMap = C1732n2.f15334a;
        AdConfig adConfig = null;
        Config a10 = C1705l2.a("ads", b10, null);
        if (a10 instanceof AdConfig) {
            adConfig = (AdConfig) a10;
        }
        this.f15524b = adConfig;
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("w0", AbstractC1661i0.a("w0", "TAG", "timeOutConfiguration getter ", this));
        }
        AdConfig adConfig2 = this.f15524b;
        kotlin.jvm.internal.g.b(adConfig2);
        this.f15525d = adConfig2.getTimeouts();
        d((byte) 0);
        this.f15526e = new C1633g0(this, this, this.f15541t);
        this.f15530i = new HashMap();
        this.f15532k = (byte) -1;
        this.f15533l = new Handler(Looper.getMainLooper());
        this.f15534m = false;
        this.f15543v = new C1870xb(this);
    }

    public HashMap o() {
        return new HashMap();
    }

    public final boolean o0() {
        tf.d dVar;
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("w0", AbstractC1661i0.a("w0", "TAG", "shouldBlockLoadAd ", this));
        }
        C1646h m10 = m();
        if (m10 != null && 4 == this.f15523a && !W()) {
            AbstractC1689k0 r4 = r();
            if (r4 != null) {
                A4 a43 = this.f15531j;
                if (a43 != null) {
                    ((B4) a43).a("w0", "ad is ready - load success");
                }
                f(r4);
                dVar = tf.d.f30009a;
            } else {
                dVar = null;
            }
            if (dVar == null) {
                b((short) 2188);
            }
            return true;
        } else if (m10 == null) {
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_NO_LONGER_AVAILABLE), true, ChartEndBlockRecord.sid);
            A4 a44 = this.f15531j;
            if (a44 != null) {
                ((B4) a44).b("w0", "ad no longer available");
            }
            return true;
        } else if (2 != this.f15523a) {
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_NO_LONGER_AVAILABLE), true, (short) 2132);
            A4 a45 = this.f15531j;
            if (a45 != null) {
                StringBuilder a10 = A5.a("w0", "TAG", "ad no longer available. state - ");
                a10.append((int) this.f15523a);
                ((B4) a45).b("w0", a10.toString());
            }
            return true;
        } else if (W()) {
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_NO_LONGER_AVAILABLE), true, (short) 2133);
            A4 a46 = this.f15531j;
            if (a46 != null) {
                ((B4) a46).b("w0", "ad is expired");
            }
            return true;
        } else {
            return false;
        }
    }

    public final C1633g0 p() {
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("w0", AbstractC1661i0.a("w0", "TAG", "adStore getter ", this));
        }
        if (this.f15526e == null) {
            this.f15526e = new C1633g0(this, this, this.f15541t);
        }
        C1633g0 c1633g0 = this.f15526e;
        kotlin.jvm.internal.g.b(c1633g0);
        return c1633g0;
    }

    public final boolean p0() {
        AdConfig adConfig;
        if (kotlin.jvm.internal.g.a(this.f15541t.m(), "AB") && (adConfig = this.f15524b) != null && adConfig.getSkipNetCheckHB()) {
            return true;
        }
        return false;
    }

    public abstract String q();

    public void q0() {
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("w0", AbstractC1661i0.a("w0", "TAG", "signalAvailabilityChange ", this));
        }
    }

    public final AbstractC1689k0 r() {
        A4 a42;
        A4 a43 = this.f15531j;
        if (a43 != null) {
            ((B4) a43).c("w0", AbstractC1661i0.a("w0", "TAG", "adUnitEventListener getter ", this));
        }
        AbstractC1689k0 abstractC1689k0 = (AbstractC1689k0) this.f15527f.get();
        if (abstractC1689k0 == null && (a42 = this.f15531j) != null) {
            ((B4) a42).b("InMobi", "Listener was garbage collected. Unable to give callback");
        }
        return abstractC1689k0;
    }

    public void r0() {
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("w0", AbstractC1661i0.a("w0", "TAG", "signalSuccess ", this));
        }
    }

    public final C1872y0 s() {
        return this.I;
    }

    public final void s0() {
        String str;
        LinkedList<C1646h> f10;
        C1646h c1646h;
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("w0", AbstractC1661i0.a("w0", "TAG", "startLoadingHTMLAd ", this));
        }
        S9 s92 = null;
        try {
            e(this.f15544w);
            A4 a43 = this.f15531j;
            if (a43 != null) {
                StringBuilder sb2 = new StringBuilder("Loading ad with impressionId : ");
                C1577c0 c1577c0 = this.f15542u;
                if (c1577c0 != null && (f10 = c1577c0.f()) != null && (c1646h = f10.get(this.f15544w)) != null) {
                    str = c1646h.s();
                } else {
                    str = null;
                }
                sb2.append(str);
                ((B4) a43).a("w0", sb2.toString());
            }
            S9 s93 = (S9) this.f15528g.get(this.f15544w);
            String E = E();
            if (kotlin.jvm.internal.g.a(E, "html")) {
                A4 a44 = this.f15531j;
                if (a44 != null) {
                    ((B4) a44).a("w0", "loading into weview for " + E());
                }
                if (s93 != null) {
                    s93.c(c(this.f15544w));
                }
            } else if (kotlin.jvm.internal.g.a(E, "htmlUrl")) {
                A4 a45 = this.f15531j;
                if (a45 != null) {
                    ((B4) a45).a("w0", "loading into weview for " + E());
                }
                if (s93 != null) {
                    s93.d(c(this.f15544w));
                }
            }
            a(true, s93);
            if (s93 != null && kotlin.jvm.internal.g.a(E(), "htmlUrl")) {
                j(s93);
            }
        } catch (Exception e10) {
            A4 a46 = this.f15531j;
            if (a46 != null) {
                ((B4) a46).a("w0", Cc.a(e10, A5.a("w0", "TAG", "Loading ad markup into container encountered an unexpected error: ")));
            }
            Q4 q42 = Q4.f14590a;
            Q4.c.a(AbstractC1863x4.a(e10, "event"));
            int i10 = this.f15544w;
            if (i10 >= 0 && i10 < this.f15528g.size()) {
                s92 = (S9) this.f15528g.get(this.f15544w);
            }
            b(s92, (short) 2135);
        }
    }

    public final Context t() {
        WeakReference weakReference = this.c;
        if (weakReference != null) {
            return (Context) weakReference.get();
        }
        return null;
    }

    public final void t0() {
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("w0", AbstractC1661i0.a("w0", "TAG", "submitAdLoadCalled ", this));
        }
        HashMap hashMap = new HashMap();
        c(hashMap);
        c("AdLoadCalled", hashMap);
    }

    public final C1646h u() {
        if (this.A) {
            return a(this.f15544w);
        }
        return m();
    }

    public final void u0() {
        Boolean o10;
        String p10;
        A4 a42 = this.f15531j;
        if (a42 != null) {
            StringBuilder a10 = A5.a("w0", "TAG", "submitAdLoadSuccessfulEvent ADunit markuptype : ");
            a10.append(E());
            a10.append(' ');
            a10.append(this);
            ((B4) a42).c("w0", a10.toString());
        }
        HashMap hashMap = new HashMap();
        long j10 = this.I.c;
        ScheduledExecutorService scheduledExecutorService = Vb.f14759a;
        hashMap.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
        hashMap.put("markupType", E());
        C1646h u7 = u();
        if (u7 != null && (p10 = u7.p()) != null) {
            hashMap.put("creativeType", OperatorName.SHOW_TEXT_LINE_AND_SPACE + p10 + '\"');
        }
        C1596d5 c1596d5 = this.E;
        if (c1596d5 != null) {
            hashMap.put("retryCount", Integer.valueOf(c1596d5.f15013b));
        }
        C1577c0 c1577c0 = this.f15542u;
        if (c1577c0 != null && (o10 = c1577c0.o()) != null) {
            hashMap.put("isRewarded", o10);
        }
        if (S().length() > 0) {
            hashMap.put("metadataBlob", S());
        }
        c(hashMap);
        c("AdLoadSuccessful", hashMap);
    }

    public final C1819u v() {
        return this.C;
    }

    public final void v0() {
        String p10;
        Boolean o10;
        HashMap hashMap = new HashMap();
        c(hashMap);
        hashMap.put("markupType", E());
        long j10 = this.I.f15669h;
        ScheduledExecutorService scheduledExecutorService = Vb.f14759a;
        hashMap.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
        hashMap.put("metadataBlob", S());
        C1596d5 c1596d5 = this.E;
        if (c1596d5 != null) {
            hashMap.put("retryCount", Integer.valueOf(c1596d5.f15013b));
        }
        C1577c0 c1577c0 = this.f15542u;
        if (c1577c0 != null && (o10 = c1577c0.o()) != null) {
            hashMap.put("isRewarded", o10);
        }
        C1646h u7 = u();
        if (u7 != null && (p10 = u7.p()) != null) {
            hashMap.put("creativeType", OperatorName.SHOW_TEXT_LINE_AND_SPACE + p10 + '\"');
        }
        c("ParseSuccess", hashMap);
    }

    public S9 w() {
        if (this.f15528g.size() > 0 && this.f15545x < this.f15528g.size()) {
            return (S9) this.f15528g.get(this.f15545x);
        }
        return null;
    }

    public final void w0() {
        C1646h m10;
        Boolean o10;
        String p10;
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("w0", AbstractC1661i0.a("w0", "TAG", "submitAdShowCalled ", this));
        }
        C1872y0 c1872y0 = this.I;
        c1872y0.getClass();
        c1872y0.f15666e = SystemClock.elapsedRealtime();
        HashMap hashMap = new HashMap();
        hashMap.put("markupType", E());
        long j10 = this.I.f15670i;
        ScheduledExecutorService scheduledExecutorService = Vb.f14759a;
        hashMap.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
        if (this.A) {
            m10 = a(this.f15545x);
        } else {
            m10 = m();
        }
        if (m10 != null && (p10 = m10.p()) != null) {
            hashMap.put("creativeType", OperatorName.SHOW_TEXT_LINE_AND_SPACE + p10 + '\"');
        }
        C1577c0 c1577c0 = this.f15542u;
        if (c1577c0 != null && (o10 = c1577c0.o()) != null) {
            hashMap.put("isRewarded", o10);
        }
        if (S().length() > 0) {
            hashMap.put("metadataBlob", S());
        }
        c(hashMap);
        c("AdShowCalled", hashMap);
    }

    public final S9 x() {
        return this.f15535n;
    }

    public final void x0() {
        C1646h m10;
        Boolean o10;
        String p10;
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("w0", AbstractC1661i0.a("w0", "TAG", "submitAdShowSuccess ", this));
        }
        HashMap hashMap = new HashMap();
        long j10 = this.I.f15666e;
        ScheduledExecutorService scheduledExecutorService = Vb.f14759a;
        hashMap.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
        hashMap.put("markupType", E());
        if (this.A) {
            m10 = a(this.f15545x);
        } else {
            m10 = m();
        }
        if (m10 != null && (p10 = m10.p()) != null) {
            hashMap.put("creativeType", OperatorName.SHOW_TEXT_LINE_AND_SPACE + p10 + '\"');
        }
        C1577c0 c1577c0 = this.f15542u;
        if (c1577c0 != null && (o10 = c1577c0.o()) != null) {
            hashMap.put("isRewarded", o10);
        }
        if (S().length() > 0) {
            hashMap.put("metadataBlob", S());
        }
        c(hashMap);
        c("AdShowSuccessful", hashMap);
    }

    public final C1577c0 y() {
        return this.f15542u;
    }

    public final void y0() {
        HashMap hashMap = new HashMap();
        c(hashMap);
        c("AdGetSignalsCalled", hashMap);
    }

    public final int z() {
        return this.f15544w;
    }

    public final void z0() {
        C1646h m10;
        Boolean o10;
        String p10;
        A4 a42 = this.f15531j;
        if (a42 != null) {
            StringBuilder a10 = A5.a("w0", "TAG", "submitRenderSuccessEvent ADunit markuptype : ");
            a10.append(E());
            a10.append(' ');
            a10.append(this);
            ((B4) a42).c("w0", a10.toString());
        }
        HashMap hashMap = new HashMap();
        long j10 = this.I.f15668g;
        ScheduledExecutorService scheduledExecutorService = Vb.f14759a;
        hashMap.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
        hashMap.put("markupType", E());
        if (this.A) {
            m10 = a(this.f15545x);
        } else {
            m10 = m();
        }
        if (m10 != null && (p10 = m10.p()) != null) {
            hashMap.put("creativeType", OperatorName.SHOW_TEXT_LINE_AND_SPACE + p10 + '\"');
        }
        C1596d5 c1596d5 = this.E;
        if (c1596d5 != null) {
            hashMap.put("retryCount", Integer.valueOf(c1596d5.f15013b));
        }
        hashMap.put("plType", Byte.valueOf(J()));
        C1577c0 c1577c0 = this.f15542u;
        if (c1577c0 != null && (o10 = c1577c0.o()) != null) {
            hashMap.put("isRewarded", o10);
        }
        if (S().length() > 0) {
            hashMap.put("metadataBlob", S());
        }
        c(hashMap);
        c((Map) hashMap);
        c("RenderSuccess", hashMap);
    }

    public final void e(C1577c0 c1577c0) {
        this.f15542u = c1577c0;
    }

    public final void g(AbstractC1689k0 abstractC1689k0) {
        Boolean o10;
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("w0", AbstractC1661i0.a("w0", "TAG", "adUnitEventListener setter ", this));
        }
        WeakReference weakReference = new WeakReference(abstractC1689k0);
        this.f15527f = weakReference;
        String q5 = q();
        C1577c0 c1577c0 = this.f15542u;
        C1884z c1884z = new C1884z(weakReference, q5, (c1577c0 == null || (o10 = c1577c0.o()) == null) ? false : o10.booleanValue());
        this.D = c1884z;
        A4 a43 = this.f15531j;
        if (a43 != null) {
            c1884z.f15695f = a43;
        }
    }

    @Override // com.inmobi.media.U9
    public void h(S9 renderView) {
        kotlin.jvm.internal.g.e(renderView, "renderView");
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).a("w0", AbstractC1661i0.a("w0", "TAG", "onRenderViewSignaledAdReady ", this));
        }
        if (!this.f15536o && t() != null) {
            Handler handler = this.f15533l;
            if (handler != null) {
                handler.post(new n0.g(20, this, renderView));
                return;
            } else {
                b((short) 2187);
                return;
            }
        }
        b((short) 2186);
    }

    public final void j(S9 s92) {
        List<String> c;
        int indexOf = this.f15528g.indexOf(s92);
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).a("w0", "fireLoadAdTokenUrlSuccessful : " + indexOf + ' ' + this);
        }
        C1646h a10 = a(indexOf);
        if (a10 == null || (c = a10.c(C1646h.LOAD_AD_TOKEN_URL)) == null) {
            return;
        }
        for (String str : c) {
            Y1.f14860a.a(str, true, this.f15531j);
        }
    }

    public final void b(boolean z10) {
        this.f15534m = z10;
    }

    public final void e(int i10) {
        S9 s92;
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).a("w0", AbstractC1661i0.a("w0", "TAG", "initializeHtmlAdContainer ", this));
        }
        Context t4 = t();
        if (t4 == null) {
            return;
        }
        try {
            if (this.f15528g.get(i10) == null || ((s92 = (S9) this.f15528g.get(i10)) != null && s92.I.get())) {
                C1646h a10 = a(i10);
                V9 a11 = a(i10, a10);
                byte J = J();
                HashMap hashMap = this.f15530i;
                Set set = hashMap != null ? (Set) hashMap.get(Integer.valueOf(i10)) : null;
                C1646h a12 = a(i10);
                S9 s93 = new S9(t4, J, set, a12 != null ? a12.s() : null, false, (a10 == null || (r6 = a10.t()) == null) ? "DEFAULT" : "DEFAULT", 0L, a11, null, this.f15531j, 336);
                String p10 = a10 != null ? a10.p() : null;
                A4 a43 = s93.f14665j;
                if (a43 != null) {
                    String TAG = S9.O0;
                    kotlin.jvm.internal.g.d(TAG, "TAG");
                    ((B4) a43).c(TAG, "creativeType " + s93 + ' ' + p10);
                }
                s93.f14684s0 = p10;
                s93.setMarkupTypeAdUnit((a10 == null || (r3 = a10.u()) == null) ? "html" : "html");
                this.f15528g.set(i10, s93);
                if (kotlin.jvm.internal.g.a(this.f15541t.b(), "banner") || kotlin.jvm.internal.g.a(this.f15541t.b(), "audio")) {
                    s93.setAdSize(this.f15541t.a());
                }
                s93.setAdType(this.f15541t.b());
                s93.setImmersiveMode(b(a10));
                AdConfig adConfig = this.f15524b;
                kotlin.jvm.internal.g.b(adConfig);
                s93.a(this, adConfig);
                s93.setAdPodHandler(this);
                s93.setPlacementId(this.f15541t.l());
                s93.setAllowAutoRedirection(b(i10));
                s93.setContentURL(this.f15541t.e());
                AdMetaInfo l10 = l();
                if (l10 != null) {
                    s93.setCreativeId(l10.getCreativeID());
                }
                if (this.f15541t.p()) {
                    s93.e();
                }
                s93.setTelemetryManagerMap(this.H);
                s93.a(a10);
                a(a10, s93);
                WatermarkData watermarkData = this.J;
                if (watermarkData != null) {
                    s93.setWatermark(watermarkData);
                }
            }
        } catch (Exception e10) {
            b((S9) this.f15528g.get(this.f15544w), (short) 2136);
            A4 a44 = this.f15531j;
            if (a44 != null) {
                ((B4) a44).a("w0", "Exception while initializing WebView", e10);
            }
            Q4 q42 = Q4.f14590a;
            Q4.c.a(AbstractC1863x4.a(e10, "event"));
        }
    }

    public final boolean b(C1646h c1646h) {
        Z q5;
        AdConfig.RenderingConfig rendering;
        AdConfig adConfig = this.f15524b;
        boolean z10 = false;
        boolean enableImmersive = (adConfig == null || (rendering = adConfig.getRendering()) == null) ? false : rendering.getEnableImmersive();
        boolean z11 = AbstractC1692k3.f15257i;
        boolean a10 = (c1646h == null || (q5 = c1646h.q()) == null) ? false : q5.a(false);
        if (enableImmersive && z11 && a10) {
            z10 = true;
        }
        if (!z10) {
            b(enableImmersive, z11, a10);
        }
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).a("w0", "Immersive support - config, device, adResponse - (" + enableImmersive + ' ' + z11 + ' ' + a10 + ')');
        }
        return z10;
    }

    public static final /* synthetic */ void a(AbstractC1846w0 abstractC1846w0, C1646h c1646h, S9 s92) {
        abstractC1846w0.getClass();
        a(c1646h, s92);
    }

    public final Set d(int i10) {
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("w0", AbstractC1661i0.a("w0", "TAG", "getViewabilityTrackers ", this));
        }
        HashMap hashMap = this.f15530i;
        if (hashMap != null) {
            return (Set) hashMap.get(Integer.valueOf(i10));
        }
        return null;
    }

    public final void a(AdConfig adConfig) {
        this.f15524b = adConfig;
    }

    public final void c(boolean z10) {
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("w0", AbstractC1661i0.a("w0", "TAG", "setIsAssetReady ", this));
        }
        this.f15537p = z10;
    }

    @Override // com.inmobi.media.U9
    public void i(S9 renderView) {
        kotlin.jvm.internal.g.e(renderView, "renderView");
        A4 a42 = this.f15531j;
        if (a42 != null) {
            StringBuilder a10 = A5.a("w0", "TAG", "RenderView visible, for index ");
            a10.append(this.f15528g.indexOf(renderView));
            a10.append(' ');
            a10.append(this);
            ((B4) a42).a("w0", a10.toString());
        }
    }

    public void l(S9 s92) {
        A4 a42 = this.f15531j;
        if (a42 != null) {
            StringBuilder a10 = A5.a("w0", "TAG", "Render view signaled ad ready, for index ");
            a10.append(this.f15528g.indexOf(s92));
            a10.append(' ');
            a10.append(this);
            ((B4) a42).a("w0", a10.toString());
        }
        A4 a43 = this.f15531j;
        if (a43 != null) {
            ((B4) a43).a("w0", "==== CHECKPOINT REACHED - LOAD SUCCESS ====");
        }
        A4 a44 = this.f15531j;
        if (a44 != null) {
            ((B4) a44).b();
        }
    }

    public final void a(Handler handler) {
        this.f15533l = handler;
    }

    public final void a(R8 r82) {
        this.f15540s = r82;
    }

    public final void h() {
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("w0", AbstractC1661i0.a("w0", "TAG", "destroyAllContainer ", this));
        }
        int size = this.f15528g.size();
        for (int i10 = 0; i10 < size; i10++) {
            a(this, i10, false, 2, null);
        }
    }

    public final void a(long j10) {
        this.f15546y = j10;
    }

    public final void d(AbstractC1689k0 listener) {
        kotlin.jvm.internal.g.e(listener, "listener");
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("w0", AbstractC1661i0.a("w0", "TAG", "onAdDisplayed ", this));
        }
        AdMetaInfo l10 = l();
        if (l10 == null) {
            A4 a43 = this.f15531j;
            if (a43 != null) {
                ((B4) a43).b("w0", "callback onAdDisplayed failed. ad meta info is null");
            }
            a(listener, (short) 85);
            return;
        }
        A4 a44 = this.f15531j;
        if (a44 != null) {
            ((B4) a44).a("w0", "callback - onAdDisplayed");
        }
        listener.a(l10);
    }

    public void g() {
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).a("w0", AbstractC1661i0.a("w0", "TAG", "clear ", this));
        }
        if (this.f15536o) {
            return;
        }
        this.f15536o = true;
        Handler handler = this.f15533l;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        A4 a43 = this.f15531j;
        if (a43 != null) {
            ((B4) a43).a("w0", AbstractC1661i0.a("w0", "TAG", "clearAdPods ", this));
        }
        if (this.A) {
            h();
            this.f15528g.clear();
            this.f15544w = 0;
            this.f15545x = 0;
            this.f15547z.clear();
        }
        C1596d5 c1596d5 = this.E;
        if (c1596d5 != null) {
            c1596d5.f15013b = 0;
        }
        HashMap hashMap = this.f15530i;
        if (hashMap != null) {
            hashMap.clear();
        }
        k0();
        d((byte) 0);
        A4 a44 = this.f15531j;
        if (a44 != null) {
            ((B4) a44).d("w0", "AdUnit " + this + " state - CREATED");
        }
        C1819u c1819u = this.C;
        int hashCode = hashCode();
        c1819u.getClass();
        SparseArray sparseArray = C1819u.f15484b;
        sparseArray.remove(hashCode);
        sparseArray.size();
        this.f15538q = false;
        this.f15535n = null;
        this.f15534m = false;
        this.f15537p = false;
        this.f15539r = false;
        this.f15542u = null;
        this.A = false;
    }

    public final void a(TreeSet<Integer> treeSet) {
        kotlin.jvm.internal.g.e(treeSet, "<set-?>");
        this.f15547z = treeSet;
    }

    public final void c(C1577c0 adSet) {
        kotlin.jvm.internal.g.e(adSet, "adSet");
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("w0", AbstractC1661i0.a("w0", "TAG", "onAdFetchSuccessful ", this));
        }
        if (this.f15523a == 1) {
            this.f15542u = adSet;
        }
        if (!this.f15536o && t() != null) {
            a(adSet);
            return;
        }
        b((short) 2185);
        A4 a43 = this.f15531j;
        if (a43 != null) {
            ((B4) a43).b("w0", "adUnit is destroyed");
        }
    }

    @Override // com.inmobi.media.U9
    public void f(S9 renderView) {
        kotlin.jvm.internal.g.e(renderView, "renderView");
        A4 a42 = this.f15531j;
        if (a42 != null) {
            StringBuilder a10 = A5.a("w0", "TAG", "RenderView completed loading ad content, for index ");
            a10.append(this.f15528g.indexOf(renderView));
            a10.append(' ');
            a10.append(this);
            ((B4) a42).a("w0", a10.toString());
        }
    }

    public final void a(Context context, J adPlacement, AbstractC1689k0 abstractC1689k0) {
        String m10;
        String b10;
        TimeoutConfigurations$AdNonABConfig banner;
        C1762p6 c1762p6;
        TimeoutConfigurations$AdPreloadConfig banner2;
        TimeoutConfigurations$AdABConfig banner3;
        A4 a42;
        A4 a43;
        A4 a44;
        Boolean o10;
        kotlin.jvm.internal.g.e(context, "context");
        kotlin.jvm.internal.g.e(adPlacement, "adPlacement");
        toString();
        a(context);
        WeakReference weakReference = new WeakReference(abstractC1689k0);
        this.f15527f = weakReference;
        String q5 = q();
        C1577c0 c1577c0 = this.f15542u;
        this.D = new C1884z(weakReference, q5, (c1577c0 == null || (o10 = c1577c0.o()) == null) ? false : o10.booleanValue());
        this.f15541t = adPlacement;
        A4 a45 = this.f15531j;
        if (a45 != null) {
            ((B4) a45).a("w0", AbstractC1661i0.a("w0", "TAG", "initTelemetry ", this));
        }
        this.H.put("AdImpressionSuccessful", this.I);
        A4 a46 = this.f15531j;
        if (a46 != null) {
            ((B4) a46).c("w0", "initInternetAvailabilityAdRetry");
        }
        if (this.f15524b == null && (a44 = this.f15531j) != null) {
            ((B4) a44).c("w0", "adConfig is null");
            tf.d dVar = tf.d.f30009a;
        }
        if (this.f15541t.m() == null && (a43 = this.f15531j) != null) {
            ((B4) a43).c("w0", "placement.placementType is null");
            tf.d dVar2 = tf.d.f30009a;
        }
        if (this.f15541t.b() == null && (a42 = this.f15531j) != null) {
            ((B4) a42).c("w0", "placement.adType is null");
            tf.d dVar3 = tf.d.f30009a;
        }
        AdConfig adConfig = this.f15524b;
        if (adConfig != null && (m10 = this.f15541t.m()) != null && (b10 = this.f15541t.b()) != null) {
            TimeoutConfigurations$MediationConfig mediationConfig = adConfig.getTimeouts().X();
            String d10 = Ia.d();
            kotlin.jvm.internal.g.e(mediationConfig, "mediationConfig");
            if (m10.equals("AB")) {
                TimeoutConfigurations$ABConfig aBConfig = mediationConfig.getABConfig();
                int hashCode = b10.hashCode();
                if (hashCode == -1396342996) {
                    if (b10.equals("banner")) {
                        banner3 = aBConfig.getBanner();
                        c1762p6 = new C1762p6(AbstractC1749o6.a(d10, banner3.getRetryInterval()), AbstractC1749o6.a(d10, banner3.getMaxRetries()), AbstractC1749o6.a(d10, banner3.getLoadTimeout()), (Integer) null, 24);
                    }
                    banner3 = aBConfig.getBanner();
                    c1762p6 = new C1762p6(AbstractC1749o6.a(d10, banner3.getRetryInterval()), AbstractC1749o6.a(d10, banner3.getMaxRetries()), AbstractC1749o6.a(d10, banner3.getLoadTimeout()), (Integer) null, 24);
                } else if (hashCode == -1052618729) {
                    if (b10.equals("native")) {
                        banner3 = aBConfig.getNative();
                        c1762p6 = new C1762p6(AbstractC1749o6.a(d10, banner3.getRetryInterval()), AbstractC1749o6.a(d10, banner3.getMaxRetries()), AbstractC1749o6.a(d10, banner3.getLoadTimeout()), (Integer) null, 24);
                    }
                    banner3 = aBConfig.getBanner();
                    c1762p6 = new C1762p6(AbstractC1749o6.a(d10, banner3.getRetryInterval()), AbstractC1749o6.a(d10, banner3.getMaxRetries()), AbstractC1749o6.a(d10, banner3.getLoadTimeout()), (Integer) null, 24);
                } else if (hashCode == 104431) {
                    if (b10.equals("int")) {
                        banner3 = aBConfig.getInterstitial();
                        c1762p6 = new C1762p6(AbstractC1749o6.a(d10, banner3.getRetryInterval()), AbstractC1749o6.a(d10, banner3.getMaxRetries()), AbstractC1749o6.a(d10, banner3.getLoadTimeout()), (Integer) null, 24);
                    }
                    banner3 = aBConfig.getBanner();
                    c1762p6 = new C1762p6(AbstractC1749o6.a(d10, banner3.getRetryInterval()), AbstractC1749o6.a(d10, banner3.getMaxRetries()), AbstractC1749o6.a(d10, banner3.getLoadTimeout()), (Integer) null, 24);
                } else {
                    if (hashCode == 93166550 && b10.equals("audio")) {
                        banner3 = aBConfig.getAudio();
                        c1762p6 = new C1762p6(AbstractC1749o6.a(d10, banner3.getRetryInterval()), AbstractC1749o6.a(d10, banner3.getMaxRetries()), AbstractC1749o6.a(d10, banner3.getLoadTimeout()), (Integer) null, 24);
                    }
                    banner3 = aBConfig.getBanner();
                    c1762p6 = new C1762p6(AbstractC1749o6.a(d10, banner3.getRetryInterval()), AbstractC1749o6.a(d10, banner3.getMaxRetries()), AbstractC1749o6.a(d10, banner3.getLoadTimeout()), (Integer) null, 24);
                }
            } else if (m10.equals("Preload")) {
                TimeoutConfigurations$PreloadConfig preloadConfig = mediationConfig.getPreloadConfig();
                int hashCode2 = b10.hashCode();
                if (hashCode2 == -1396342996) {
                    if (b10.equals("banner")) {
                        banner2 = preloadConfig.getBanner();
                        c1762p6 = new C1762p6(AbstractC1749o6.a(d10, banner2.getRetryInterval()), AbstractC1749o6.a(d10, banner2.getMaxRetries()), AbstractC1749o6.a(d10, banner2.getLoadTimeout()), Integer.valueOf(AbstractC1749o6.a(d10, banner2.getMuttTimeout())), Integer.valueOf(AbstractC1749o6.a(d10, banner2.getPreloadTimeout())));
                    }
                    banner2 = preloadConfig.getBanner();
                    c1762p6 = new C1762p6(AbstractC1749o6.a(d10, banner2.getRetryInterval()), AbstractC1749o6.a(d10, banner2.getMaxRetries()), AbstractC1749o6.a(d10, banner2.getLoadTimeout()), Integer.valueOf(AbstractC1749o6.a(d10, banner2.getMuttTimeout())), Integer.valueOf(AbstractC1749o6.a(d10, banner2.getPreloadTimeout())));
                } else if (hashCode2 == -1052618729) {
                    if (b10.equals("native")) {
                        banner2 = preloadConfig.getNative();
                        c1762p6 = new C1762p6(AbstractC1749o6.a(d10, banner2.getRetryInterval()), AbstractC1749o6.a(d10, banner2.getMaxRetries()), AbstractC1749o6.a(d10, banner2.getLoadTimeout()), Integer.valueOf(AbstractC1749o6.a(d10, banner2.getMuttTimeout())), Integer.valueOf(AbstractC1749o6.a(d10, banner2.getPreloadTimeout())));
                    }
                    banner2 = preloadConfig.getBanner();
                    c1762p6 = new C1762p6(AbstractC1749o6.a(d10, banner2.getRetryInterval()), AbstractC1749o6.a(d10, banner2.getMaxRetries()), AbstractC1749o6.a(d10, banner2.getLoadTimeout()), Integer.valueOf(AbstractC1749o6.a(d10, banner2.getMuttTimeout())), Integer.valueOf(AbstractC1749o6.a(d10, banner2.getPreloadTimeout())));
                } else if (hashCode2 == 104431) {
                    if (b10.equals("int")) {
                        banner2 = preloadConfig.getInterstitial();
                        c1762p6 = new C1762p6(AbstractC1749o6.a(d10, banner2.getRetryInterval()), AbstractC1749o6.a(d10, banner2.getMaxRetries()), AbstractC1749o6.a(d10, banner2.getLoadTimeout()), Integer.valueOf(AbstractC1749o6.a(d10, banner2.getMuttTimeout())), Integer.valueOf(AbstractC1749o6.a(d10, banner2.getPreloadTimeout())));
                    }
                    banner2 = preloadConfig.getBanner();
                    c1762p6 = new C1762p6(AbstractC1749o6.a(d10, banner2.getRetryInterval()), AbstractC1749o6.a(d10, banner2.getMaxRetries()), AbstractC1749o6.a(d10, banner2.getLoadTimeout()), Integer.valueOf(AbstractC1749o6.a(d10, banner2.getMuttTimeout())), Integer.valueOf(AbstractC1749o6.a(d10, banner2.getPreloadTimeout())));
                } else {
                    if (hashCode2 == 93166550 && b10.equals("audio")) {
                        banner2 = preloadConfig.getAudio();
                        c1762p6 = new C1762p6(AbstractC1749o6.a(d10, banner2.getRetryInterval()), AbstractC1749o6.a(d10, banner2.getMaxRetries()), AbstractC1749o6.a(d10, banner2.getLoadTimeout()), Integer.valueOf(AbstractC1749o6.a(d10, banner2.getMuttTimeout())), Integer.valueOf(AbstractC1749o6.a(d10, banner2.getPreloadTimeout())));
                    }
                    banner2 = preloadConfig.getBanner();
                    c1762p6 = new C1762p6(AbstractC1749o6.a(d10, banner2.getRetryInterval()), AbstractC1749o6.a(d10, banner2.getMaxRetries()), AbstractC1749o6.a(d10, banner2.getLoadTimeout()), Integer.valueOf(AbstractC1749o6.a(d10, banner2.getMuttTimeout())), Integer.valueOf(AbstractC1749o6.a(d10, banner2.getPreloadTimeout())));
                }
            } else {
                TimeoutConfigurations$NonABConfig nonABConfig = mediationConfig.getNonABConfig();
                int hashCode3 = b10.hashCode();
                if (hashCode3 == -1396342996) {
                    if (b10.equals("banner")) {
                        banner = nonABConfig.getBanner();
                        c1762p6 = new C1762p6(AbstractC1749o6.a(d10, banner.getRetryInterval()), AbstractC1749o6.a(d10, banner.getMaxRetries()), AbstractC1749o6.a(d10, banner.getLoadTimeout()), Integer.valueOf(AbstractC1749o6.a(d10, banner.getMuttTimeout())), 16);
                    }
                    banner = nonABConfig.getBanner();
                    c1762p6 = new C1762p6(AbstractC1749o6.a(d10, banner.getRetryInterval()), AbstractC1749o6.a(d10, banner.getMaxRetries()), AbstractC1749o6.a(d10, banner.getLoadTimeout()), Integer.valueOf(AbstractC1749o6.a(d10, banner.getMuttTimeout())), 16);
                } else if (hashCode3 == -1052618729) {
                    if (b10.equals("native")) {
                        banner = nonABConfig.getNative();
                        c1762p6 = new C1762p6(AbstractC1749o6.a(d10, banner.getRetryInterval()), AbstractC1749o6.a(d10, banner.getMaxRetries()), AbstractC1749o6.a(d10, banner.getLoadTimeout()), Integer.valueOf(AbstractC1749o6.a(d10, banner.getMuttTimeout())), 16);
                    }
                    banner = nonABConfig.getBanner();
                    c1762p6 = new C1762p6(AbstractC1749o6.a(d10, banner.getRetryInterval()), AbstractC1749o6.a(d10, banner.getMaxRetries()), AbstractC1749o6.a(d10, banner.getLoadTimeout()), Integer.valueOf(AbstractC1749o6.a(d10, banner.getMuttTimeout())), 16);
                } else if (hashCode3 == 104431) {
                    if (b10.equals("int")) {
                        banner = nonABConfig.getInterstitial();
                        c1762p6 = new C1762p6(AbstractC1749o6.a(d10, banner.getRetryInterval()), AbstractC1749o6.a(d10, banner.getMaxRetries()), AbstractC1749o6.a(d10, banner.getLoadTimeout()), Integer.valueOf(AbstractC1749o6.a(d10, banner.getMuttTimeout())), 16);
                    }
                    banner = nonABConfig.getBanner();
                    c1762p6 = new C1762p6(AbstractC1749o6.a(d10, banner.getRetryInterval()), AbstractC1749o6.a(d10, banner.getMaxRetries()), AbstractC1749o6.a(d10, banner.getLoadTimeout()), Integer.valueOf(AbstractC1749o6.a(d10, banner.getMuttTimeout())), 16);
                } else {
                    if (hashCode3 == 93166550 && b10.equals("audio")) {
                        banner = nonABConfig.getAudio();
                        c1762p6 = new C1762p6(AbstractC1749o6.a(d10, banner.getRetryInterval()), AbstractC1749o6.a(d10, banner.getMaxRetries()), AbstractC1749o6.a(d10, banner.getLoadTimeout()), Integer.valueOf(AbstractC1749o6.a(d10, banner.getMuttTimeout())), 16);
                    }
                    banner = nonABConfig.getBanner();
                    c1762p6 = new C1762p6(AbstractC1749o6.a(d10, banner.getRetryInterval()), AbstractC1749o6.a(d10, banner.getMaxRetries()), AbstractC1749o6.a(d10, banner.getLoadTimeout()), Integer.valueOf(AbstractC1749o6.a(d10, banner.getMuttTimeout())), 16);
                }
            }
            this.E = new C1596d5(c1762p6);
            this.F = c1762p6;
        }
        if (AbstractC1692k3.f15256h == null) {
            AbstractC1692k3.f15256h = Float.valueOf(new TextView(context).getTextSize());
        }
        n0();
    }

    public final void b(boolean z10, boolean z11, boolean z12) {
        Pair<String, Short> a10 = a(z10, z11, z12);
        short shortValue = a10.component2().shortValue();
        HashMap h10 = a6.h.h("reason", a10.component1());
        h10.put("errorCode", Short.valueOf(shortValue));
        c("ImmersiveNotSupported", h10);
    }

    public int k(S9 renderView) {
        kotlin.jvm.internal.g.e(renderView, "renderView");
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("w0", AbstractC1661i0.a("w0", "TAG", "getCurrentRenderingPodAdIndex ", this));
        }
        if (this.A) {
            return this.f15528g.indexOf(renderView);
        }
        return -1;
    }

    public final void f() {
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("w0", AbstractC1661i0.a("w0", "TAG", "checkInteractiveAndSignal ", this));
        }
        if (this.f15534m && this.f15537p && this.f15538q) {
            r0();
        }
    }

    public static /* synthetic */ void R() {
    }

    public static /* synthetic */ void U() {
    }

    public final void d(C1577c0 adSet) {
        kotlin.jvm.internal.g.e(adSet, "adSet");
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("w0", AbstractC1661i0.a("w0", "TAG", "onAuctionNotClosed ", this));
        }
        if (this.f15536o || t() == null) {
            return;
        }
        A4 a43 = this.f15531j;
        if (a43 != null) {
            ((B4) a43).c("w0", AbstractC1661i0.a("w0", "TAG", "handleAuctionNotClosed ", this));
        }
        if (this.f15523a == 1) {
            this.f15542u = adSet;
            this.A = adSet.n();
            AbstractC1689k0 r4 = r();
            if (r4 != null) {
                r4.a(this.f15541t, adSet);
            }
        }
    }

    public void c(String monetizationContext) {
        kotlin.jvm.internal.g.e(monetizationContext, "monetizationContext");
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("w0", AbstractC1661i0.a("w0", "TAG", "setMonetizationContext ", this));
        }
        this.f15541t.b(monetizationContext);
    }

    public final void f(int i10) {
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("w0", AbstractC1661i0.a("w0", "TAG", "resetCurrentRenderingIndex ", this));
        }
        this.f15545x = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(com.inmobi.media.AbstractC1846w0 r9) {
        /*
            com.inmobi.media.A4 r0 = r9.f15531j
            java.lang.String r1 = "TAG"
            java.lang.String r2 = "w0"
            if (r0 == 0) goto L13
            java.lang.String r3 = "startAdFetchWorker "
            java.lang.String r3 = com.inmobi.media.AbstractC1661i0.a(r2, r1, r3, r9)
            com.inmobi.media.B4 r0 = (com.inmobi.media.B4) r0
            r0.a(r2, r3)
        L13:
            com.inmobi.media.y0 r0 = r9.I
            r0.getClass()
            long r3 = android.os.SystemClock.elapsedRealtime()
            r0.f15665d = r3
            java.lang.String r0 = "AdUnit "
            com.inmobi.media.A4 r3 = r9.f15531j
            if (r3 == 0) goto L2f
            java.lang.String r4 = "doAdLoadWork "
            java.lang.String r4 = com.inmobi.media.AbstractC1661i0.a(r2, r1, r4, r9)
            com.inmobi.media.B4 r3 = (com.inmobi.media.B4) r3
            r3.a(r2, r4)
        L2f:
            r3 = -2
            r4 = 1
            r9.d(r4)     // Catch: java.lang.Exception -> L85
            com.inmobi.media.A4 r5 = r9.f15531j     // Catch: java.lang.Exception -> L85
            if (r5 == 0) goto L4e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L85
            r6.<init>(r0)     // Catch: java.lang.Exception -> L85
            r6.append(r9)     // Catch: java.lang.Exception -> L85
            java.lang.String r0 = " state - LOADING"
            r6.append(r0)     // Catch: java.lang.Exception -> L85
            java.lang.String r0 = r6.toString()     // Catch: java.lang.Exception -> L85
            com.inmobi.media.B4 r5 = (com.inmobi.media.B4) r5     // Catch: java.lang.Exception -> L85
            r5.d(r2, r0)     // Catch: java.lang.Exception -> L85
        L4e:
            com.inmobi.media.A4 r0 = r9.f15531j     // Catch: java.lang.Exception -> L85
            if (r0 == 0) goto L65
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L85
            java.lang.String r6 = "printPublisherTestId "
            r5.<init>(r6)     // Catch: java.lang.Exception -> L85
            r5.append(r9)     // Catch: java.lang.Exception -> L85
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L85
            com.inmobi.media.B4 r0 = (com.inmobi.media.B4) r0     // Catch: java.lang.Exception -> L85
            r0.c(r2, r5)     // Catch: java.lang.Exception -> L85
        L65:
            com.inmobi.media.Hb r0 = com.inmobi.media.Hb.f14332a     // Catch: java.lang.Exception -> L85
            r0.d()     // Catch: java.lang.Exception -> L85
            r0 = 0
            boolean r5 = r9.e(r0)     // Catch: java.lang.Exception -> L85
            if (r5 == 0) goto Lb2
            com.inmobi.media.u r5 = r9.C     // Catch: java.lang.Exception -> L85
            int r6 = r9.hashCode()     // Catch: java.lang.Exception -> L85
            com.inmobi.media.x r7 = new com.inmobi.media.x     // Catch: java.lang.Exception -> L85
            com.inmobi.media.A4 r8 = r9.f15531j     // Catch: java.lang.Exception -> L85
            r7.<init>(r9, r8)     // Catch: java.lang.Exception -> L85
            r5.getClass()     // Catch: java.lang.Exception -> L85
            com.inmobi.media.C1819u.a(r6, r7)     // Catch: java.lang.Exception -> L85
            goto Lb3
        L85:
            r0 = move-exception
            com.inmobi.media.A4 r5 = r9.f15531j
            if (r5 == 0) goto L99
            java.lang.String r6 = "Load failed with unexpected error: "
            java.lang.StringBuilder r1 = com.inmobi.media.A5.a(r2, r1, r6)
            java.lang.String r1 = com.inmobi.media.Cc.a(r0, r1)
            com.inmobi.media.B4 r5 = (com.inmobi.media.B4) r5
            r5.b(r2, r1)
        L99:
            com.inmobi.media.Q4 r1 = com.inmobi.media.Q4.f14590a
            java.lang.String r1 = "event"
            com.inmobi.media.J1 r0 = com.inmobi.media.AbstractC1863x4.a(r0, r1)
            com.inmobi.media.y5 r1 = com.inmobi.media.Q4.c
            r1.a(r0)
            com.inmobi.ads.InMobiAdRequestStatus r0 = new com.inmobi.ads.InMobiAdRequestStatus
            com.inmobi.ads.InMobiAdRequestStatus$StatusCode r1 = com.inmobi.ads.InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR
            r0.<init>(r1)
            r1 = 2000(0x7d0, float:2.803E-42)
            r9.a(r0, r4, r1)
        Lb2:
            r0 = r3
        Lb3:
            if (r0 == r3) goto Ld4
            r1 = -1
            if (r0 == r1) goto Ld1
            if (r0 == 0) goto Lce
            if (r0 == r4) goto Lcb
            r1 = 2
            if (r0 == r1) goto Lc8
            java.lang.String r1 = "Unknown return value ("
            java.lang.String r3 = ") from #doAdLoadWork()"
            java.lang.String r0 = a0.a.g(r1, r0, r3)
            goto Ld6
        Lc8:
            java.lang.String r0 = "Already Loading"
            goto Ld6
        Lcb:
            java.lang.String r0 = "Returning pre-cached ad"
            goto Ld6
        Lce:
            java.lang.String r0 = "Fresh ad requested"
            goto Ld6
        Ld1:
            java.lang.String r0 = "Ad request skipped as monetization is disabled"
            goto Ld6
        Ld4:
            java.lang.String r0 = "Loading an ad resulted in an unexpected error"
        Ld6:
            com.inmobi.media.A4 r9 = r9.f15531j
            if (r9 == 0) goto Ldf
            com.inmobi.media.B4 r9 = (com.inmobi.media.B4) r9
            r9.c(r2, r0)
        Ldf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.AbstractC1846w0.c(com.inmobi.media.w0):void");
    }

    public final boolean b(int i10) {
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("w0", "getAllowAutoRedirectionForIndex " + this + " index - " + i10);
        }
        C1646h a10 = a(i10);
        return a10 != null && a10.i();
    }

    public void d(String podAdContext) {
        kotlin.jvm.internal.g.e(podAdContext, "podAdContext");
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("w0", AbstractC1661i0.a("w0", "TAG", "setPodAdContext ", this));
        }
        if (this.A) {
            this.B = podAdContext;
        }
    }

    public final int b(String str) {
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).a("w0", AbstractC1661i0.a("w0", "TAG", "parseViewabilityResponseValue ", this));
        }
        if (kotlin.text.j.M(str, "track_", false)) {
            str = str.substring(6);
            kotlin.jvm.internal.g.d(str, "this as java.lang.String).substring(startIndex)");
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static final void d(AbstractC1846w0 this$0) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        if (6 == this$0.f15523a) {
            this$0.a(true, (short) 2158);
        }
    }

    public final void b(InMobiAdRequestStatus requestStatus, boolean z10, short s4) {
        kotlin.jvm.internal.g.e(requestStatus, "requestStatus");
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).b("w0", "handleAdLoadFailure " + this + " errorCode - " + ((int) s4));
        }
        if (this.f15523a == 1 && z10) {
            A4 a43 = this.f15531j;
            if (a43 != null) {
                ((B4) a43).b("w0", b.a.c("load failed - ", s4));
            }
            A4 a44 = this.f15531j;
            if (a44 != null) {
                ((B4) a44).d("w0", "AdUnit " + this + " state - FAILED");
            }
            d((byte) 3);
            b((byte) 1);
        }
        AbstractC1689k0 r4 = r();
        if (r4 != null) {
            r4.a(this, requestStatus);
        } else {
            A4 a45 = this.f15531j;
            if (a45 != null) {
                ((B4) a45).a();
            }
        }
        if (s4 != 0) {
            b(s4);
        }
    }

    @Override // com.inmobi.media.U9
    public void g(S9 renderView) {
        Handler handler;
        kotlin.jvm.internal.g.e(renderView, "renderView");
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).a("w0", AbstractC1661i0.a("w0", "TAG", "onRenderViewSignaledAdFailed ", this));
        }
        if (this.f15536o || t() == null || (handler = this.f15533l) == null) {
            return;
        }
        handler.post(new f0.s(14, this, renderView));
    }

    public final void e(AbstractC1689k0 listener) {
        kotlin.jvm.internal.g.e(listener, "listener");
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("w0", AbstractC1661i0.a("w0", "TAG", "onFetchSuccess ", this));
        }
        v0();
        AdMetaInfo l10 = l();
        if (l10 == null) {
            A4 a43 = this.f15531j;
            if (a43 != null) {
                ((B4) a43).b("w0", "ad meta info null. fail");
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2106);
            return;
        }
        A4 a44 = this.f15531j;
        if (a44 != null) {
            ((B4) a44).a("w0", "callback - onAdFetchSuccess");
        }
        listener.b(l10);
    }

    @SuppressLint({"SwitchIntDef"})
    public final boolean e(byte b10) {
        int Y;
        Integer num;
        long j10;
        Timer timer;
        Integer num2;
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).a("w0", AbstractC1661i0.a("w0", "TAG", "startTimer ", this));
        }
        if (b10 == 0) {
            C1762p6 c1762p6 = this.F;
            if (c1762p6 != null && (num2 = c1762p6.f15375d) != null) {
                Y = num2.intValue();
                j10 = Y;
            }
            j10 = 15000;
        } else if (b10 == 1) {
            C1762p6 c1762p62 = this.F;
            if (c1762p62 != null) {
                Y = c1762p62.c;
                j10 = Y;
            }
            j10 = 15000;
        } else {
            if (b10 == 2) {
                C1762p6 c1762p63 = this.F;
                if (c1762p63 != null && (num = c1762p63.f15376e) != null) {
                    Y = num.intValue();
                }
                j10 = 15000;
            } else if (b10 == 4) {
                Cb cb2 = this.f15525d;
                kotlin.jvm.internal.g.b(cb2);
                Y = cb2.Y();
            } else {
                A4 a43 = this.f15531j;
                if (a43 != null) {
                    ((B4) a43).b("w0", "Invalid value for timeOutScenario passed!. Please pass a valid value");
                }
                return false;
            }
            j10 = Y;
        }
        C1870xb c1870xb = this.f15543v;
        if (c1870xb != null) {
            if (c1870xb.f15659b.containsKey(Byte.valueOf(b10)) && (timer = (Timer) c1870xb.f15659b.get(Byte.valueOf(b10))) != null) {
                timer.cancel();
                c1870xb.f15659b.remove(Byte.valueOf(b10));
            }
            try {
                Timer timer2 = new Timer("xb");
                c1870xb.f15659b.put(Byte.valueOf(b10), timer2);
                timer2.schedule(new C1857wb(c1870xb, b10), j10);
                return true;
            } catch (InternalError e10) {
                e10.toString();
                return false;
            } catch (OutOfMemoryError unused) {
                Z5.a((byte) 1, "xb", "Could not execute timer due to OutOfMemory.");
                ((AbstractC1846w0) c1870xb.f15658a).c(b10);
                return false;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final short c(com.inmobi.media.AbstractC1689k0 r25) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.AbstractC1846w0.c(com.inmobi.media.k0):short");
    }

    public final void b(C1577c0 adSet) {
        kotlin.jvm.internal.g.e(adSet, "adSet");
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("w0", AbstractC1661i0.a("w0", "TAG", "loadResponse ", this));
        }
        c(adSet);
    }

    public void a(Context context) {
        kotlin.jvm.internal.g.e(context, "context");
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("w0", AbstractC1661i0.a("w0", "TAG", "setContext ", this));
        }
        this.c = new WeakReference(context);
    }

    public void b(AbstractC1689k0 abstractC1689k0) {
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("w0", AbstractC1661i0.a("w0", "TAG", "handleAdScreenDisplayed ", this));
        }
    }

    public static final void b(AbstractC1846w0 this$0, S9 renderView) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        kotlin.jvm.internal.g.e(renderView, "$renderView");
        this$0.b(renderView, (short) 2137);
    }

    public final void a(A4 logger) {
        kotlin.jvm.internal.g.e(logger, "logger");
        this.f15531j = logger;
        C1633g0 p10 = p();
        p10.getClass();
        p10.f15084f = logger;
        C1884z c1884z = this.D;
        c1884z.getClass();
        c1884z.f15695f = logger;
    }

    public void b(S9 s92, short s4) {
        List<String> c;
        A4 a42 = this.f15531j;
        if (a42 != null) {
            StringBuilder a10 = A5.a("w0", "TAG", "Render view signaled ad failed, for index ");
            a10.append(this.f15528g.indexOf(s92));
            a10.append(' ');
            a10.append(this);
            ((B4) a42).b("w0", a10.toString());
        }
        if (s92 == null || !kotlin.jvm.internal.g.a(s92.getMarkupType(), "htmlUrl")) {
            return;
        }
        int indexOf = this.f15528g.indexOf(s92);
        A4 a43 = this.f15531j;
        if (a43 != null) {
            ((B4) a43).b("w0", "fireLoadAdTokenUrlFailed : " + indexOf + ' ' + this);
        }
        C1646h a11 = a(indexOf);
        if (a11 == null || (c = a11.c(C1646h.LOAD_AD_TOKEN_URL_FAILURE)) == null) {
            return;
        }
        for (String str : c) {
            Y1.f14860a.a(str, true, this.f15531j);
        }
    }

    public final V9 a(int i10, C1646h c1646h) {
        Boolean o10;
        String w7;
        LinkedHashMap linkedHashMap = C1732n2.f15334a;
        Y9 y92 = new Y9(((TelemetryConfig) AbstractC1773q4.a("telemetry", "null cannot be cast to non-null type com.inmobi.commons.core.configs.TelemetryConfig", null)).getMaxTemplateEvents());
        J j10 = this.f15541t;
        String E = E();
        String str = (c1646h == null || (w7 = c1646h.w()) == null) ? "" : w7;
        C1596d5 c1596d5 = this.E;
        int i11 = c1596d5 != null ? c1596d5.f15013b : 0;
        C1646h u7 = u();
        String str2 = (u7 == null || (str2 = u7.p()) == null) ? "" : "";
        C1646h u10 = u();
        String str3 = (u10 == null || (str3 = u10.o()) == null) ? "" : "";
        C1577c0 c1577c0 = this.f15542u;
        return new V9(j10, E, str, i11, str2, str3, (c1577c0 == null || (o10 = c1577c0.o()) == null) ? false : o10.booleanValue(), i10, this.I.f15671j, y92);
    }

    @Override // com.inmobi.media.U9
    public void b(HashMap<Object, Object> rewards) {
        kotlin.jvm.internal.g.e(rewards, "rewards");
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("w0", AbstractC1661i0.a("w0", "TAG", "onAdRewardActionCompleted ", this));
        }
        if (this.f15536o || t() == null) {
            return;
        }
        A4 a43 = this.f15531j;
        if (a43 != null) {
            ((B4) a43).a("w0", "Ad reward action completed. Params:" + rewards);
        }
        AbstractC1689k0 r4 = r();
        if (r4 != null) {
            r4.b(rewards);
        }
    }

    public static final void c(AbstractC1846w0 this$0, S9 renderView) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        kotlin.jvm.internal.g.e(renderView, "$renderView");
        this$0.l(renderView);
    }

    @Override // com.inmobi.media.U9
    public void c() {
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("w0", AbstractC1661i0.a("w0", "TAG", "onAdScreenDisplayFailed ", this));
        }
        if (this.f15536o || t() == null) {
            return;
        }
        A4 a43 = this.f15531j;
        if (a43 != null) {
            ((B4) a43).b("w0", "Ad failed to display");
        }
        Handler handler = this.f15533l;
        if (handler != null) {
            handler.post(new qb.z0(this, 1));
        }
    }

    public final void b(short s4) {
        long j10;
        long elapsedRealtime;
        Boolean o10;
        String p10;
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("w0", AbstractC1661i0.a("w0", "TAG", "submitAdLoadFailedEvent ", this));
        }
        HashMap hashMap = new HashMap();
        if (s4 == 2138 || s4 == 2109) {
            j10 = this.I.f15665d;
            ScheduledExecutorService scheduledExecutorService = Vb.f14759a;
            elapsedRealtime = SystemClock.elapsedRealtime();
        } else if (s4 == 2139) {
            j10 = this.I.f15668g;
            ScheduledExecutorService scheduledExecutorService2 = Vb.f14759a;
            elapsedRealtime = SystemClock.elapsedRealtime();
        } else {
            j10 = this.I.c;
            ScheduledExecutorService scheduledExecutorService3 = Vb.f14759a;
            elapsedRealtime = SystemClock.elapsedRealtime();
        }
        hashMap.put("latency", Long.valueOf(elapsedRealtime - j10));
        hashMap.put("errorCode", Short.valueOf(s4));
        hashMap.put("markupType", E());
        C1646h u7 = u();
        if (u7 != null && (p10 = u7.p()) != null) {
            hashMap.put("creativeType", OperatorName.SHOW_TEXT_LINE_AND_SPACE + p10 + '\"');
        }
        C1596d5 c1596d5 = this.E;
        if (c1596d5 != null) {
            hashMap.put("retryCount", Integer.valueOf(c1596d5.f15013b));
        }
        C1577c0 c1577c0 = this.f15542u;
        if (c1577c0 != null && (o10 = c1577c0.o()) != null) {
            hashMap.put("isRewarded", o10);
        }
        if (S().length() > 0) {
            hashMap.put("metadataBlob", S());
        }
        c(hashMap);
        c((Map) hashMap);
        c("AdLoadFailed", hashMap);
    }

    public final void c(HashMap hashMap) {
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("w0", AbstractC1661i0.a("w0", "TAG", "constructTelemetryPayload ", this));
        }
        hashMap.put("adType", q());
        hashMap.put("networkType", C1566b3.q());
        hashMap.put("plId", Long.valueOf(this.f15541t.l()));
        String m10 = this.f15541t.m();
        if (m10 != null) {
            hashMap.put("plType", m10);
        }
    }

    public final Pair<String, Short> a(boolean z10, boolean z11, boolean z12) {
        Short sh2;
        StringBuilder sb2 = new StringBuilder("Immersive not supported on");
        BitSet bitSet = new BitSet(3);
        ArrayList arrayList = new ArrayList();
        if (!z10) {
            arrayList.add(" config");
            bitSet.set(0);
        }
        if (!z11) {
            arrayList.add(" device");
            bitSet.set(1);
        }
        if (!z12) {
            arrayList.add(" ad");
            bitSet.set(2);
        }
        sb2.append(kotlin.collections.m.w0(arrayList, ",", null, null, null, 62));
        if (bitSet.get(0) && bitSet.get(1) && bitSet.get(2)) {
            sh2 = (short) 2202;
        } else if (bitSet.get(0) && bitSet.get(1)) {
            sh2 = (short) 2200;
        } else if (bitSet.get(0) && bitSet.get(2)) {
            sh2 = (short) 2199;
        } else if (bitSet.get(1) && bitSet.get(2)) {
            sh2 = (short) 2201;
        } else if (bitSet.get(0)) {
            sh2 = Short.valueOf((short) NameCommentRecord.sid);
        } else if (bitSet.get(1)) {
            sh2 = (short) 2197;
        } else {
            sh2 = bitSet.get(2) ? (short) 2198 : null;
        }
        short shortValue = sh2 != null ? sh2.shortValue() : (short) -1;
        if (shortValue == -1) {
            return new Pair<>("Invalid Reason", (short) -1);
        }
        return new Pair<>(sb2.toString(), Short.valueOf(shortValue));
    }

    public final void c(short s4) {
        C1646h m10;
        Boolean o10;
        String p10;
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("w0", AbstractC1661i0.a("w0", "TAG", "submitAdShowFailed ", this));
        }
        HashMap hashMap = new HashMap();
        long j10 = this.I.f15666e;
        ScheduledExecutorService scheduledExecutorService = Vb.f14759a;
        hashMap.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
        hashMap.put("errorCode", Short.valueOf(s4));
        hashMap.put("markupType", E());
        if (this.A) {
            m10 = a(this.f15545x);
        } else {
            m10 = m();
        }
        if (m10 != null && (p10 = m10.p()) != null) {
            hashMap.put("creativeType", OperatorName.SHOW_TEXT_LINE_AND_SPACE + p10 + '\"');
        }
        C1577c0 c1577c0 = this.f15542u;
        if (c1577c0 != null && (o10 = c1577c0.o()) != null) {
            hashMap.put("isRewarded", o10);
        }
        if (S().length() > 0) {
            hashMap.put("metadataBlob", S());
        }
        c(hashMap);
        c((Map) hashMap);
        c("AdShowFailed", hashMap);
    }

    public static void a(C1646h c1646h, S9 s92) {
        AdQualityControl e10;
        W adQualityManager;
        if (c1646h == null || (e10 = c1646h.e()) == null || s92 == null || (adQualityManager = s92.getAdQualityManager()) == null) {
            return;
        }
        adQualityManager.a("adQuality session setup");
        if (!adQualityManager.f14760a.getEnabled()) {
            adQualityManager.a("config kill switch - false. ad quality will skip");
        } else if (adQualityManager.c.get()) {
            adQualityManager.a("session already started. skip");
        } else {
            adQualityManager.a("verifying control flags");
            String beacon = e10.getBeacon();
            if (beacon != null && beacon.length() == 0) {
                adQualityManager.a("no beacon received. aborting...");
                ScheduledExecutorService scheduledExecutorService = P.f14562a;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdown();
                    try {
                        try {
                            scheduledExecutorService.shutdownNow();
                        } catch (Exception unused) {
                            Thread.currentThread().interrupt();
                            adQualityManager.a("session end - cleanup");
                            adQualityManager.f14765g = null;
                            adQualityManager.f14764f.clear();
                            adQualityManager.c.set(false);
                            adQualityManager.f14762d.set(false);
                            adQualityManager.a("ad quality session is already in progress. skipping...");
                            return;
                        }
                    } catch (InterruptedException unused2) {
                        scheduledExecutorService.shutdownNow();
                        Thread.currentThread().interrupt();
                        adQualityManager.a("session end - cleanup");
                        adQualityManager.f14765g = null;
                        adQualityManager.f14764f.clear();
                        adQualityManager.c.set(false);
                        adQualityManager.f14762d.set(false);
                        adQualityManager.a("ad quality session is already in progress. skipping...");
                        return;
                    }
                }
                adQualityManager.a("session end - cleanup");
                adQualityManager.f14765g = null;
                adQualityManager.f14764f.clear();
                adQualityManager.c.set(false);
                adQualityManager.f14762d.set(false);
                adQualityManager.a("ad quality session is already in progress. skipping...");
                return;
            }
            adQualityManager.f14765g = e10;
        }
    }

    public final void b(Map<String, Object> payload) {
        Boolean o10;
        String p10;
        kotlin.jvm.internal.g.e(payload, "payload");
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("w0", AbstractC1661i0.a("w0", "TAG", "submitServerError ", this));
        }
        if (this.f15526e == null) {
            return;
        }
        if (payload.get("reason") == null) {
            payload.put("reason", "");
        }
        C1646h u7 = u();
        if (u7 != null && (p10 = u7.p()) != null) {
            payload.put("creativeType", OperatorName.SHOW_TEXT_LINE_AND_SPACE + p10 + '\"');
        }
        C1596d5 c1596d5 = this.E;
        if (c1596d5 != null) {
            payload.put("retryCount", Integer.valueOf(c1596d5.f15013b));
        }
        C1577c0 c1577c0 = this.f15542u;
        if (c1577c0 != null && (o10 = c1577c0.o()) != null) {
            payload.put("isRewarded", o10);
        }
        c(payload);
        C1633g0 c1633g0 = this.f15526e;
        kotlin.jvm.internal.g.b(c1633g0);
        c1633g0.a(payload);
    }

    public final void c(Map map) {
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("w0", AbstractC1661i0.a("w0", "TAG", "updateIdsInTelemetryPayload ", this));
        }
        C1646h m10 = m();
        if (m10 != null) {
            map.put("creativeId", OperatorName.SHOW_TEXT_LINE_AND_SPACE + m10.o() + '\"');
            map.put("impressionId", OperatorName.SHOW_TEXT_LINE_AND_SPACE + m10.s() + '\"');
        }
    }

    public final void c(String eventType, Map<String, Object> kv) {
        kotlin.jvm.internal.g.e(eventType, "eventType");
        kotlin.jvm.internal.g.e(kv, "kv");
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("w0", AbstractC1661i0.a("w0", "TAG", "submitTelemetryEvent ", this));
        }
        C1616eb c1616eb = C1616eb.f15034a;
        C1616eb.b(eventType, kv, EnumC1686jb.f15238a);
    }

    public void c(byte b10) {
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).b("w0", AbstractC1661i0.a("w0", "TAG", "onOOM ", this));
        }
        if (b10 == 0) {
            a(this.f15541t, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOW_MEMORY), (short) 2110);
        } else if (b10 == 2 || b10 == 1) {
            byte b11 = this.f15523a;
            if (b11 == 0 || 1 == b11 || 2 == b11) {
                A4 a43 = this.f15531j;
                if (a43 != null) {
                    ((B4) a43).a("w0", "onOOM INTERNAL_LOAD_TIME_OUT or PRE_LOAD_TIME_OUT");
                }
                this.G.removeCallbacksAndMessages(null);
                m0();
                b((short) 2112);
                AbstractC1689k0 r4 = r();
                if (r4 != null) {
                    r4.a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOW_MEMORY));
                }
            }
        } else if (b10 == 4) {
            AbstractC1689k0 r10 = r();
            if (r10 != null) {
                r10.g();
            }
        } else if (b10 == 3) {
            A4 a44 = this.f15531j;
            if (a44 != null) {
                ((B4) a44).a("w0", b.a.c("OOM Timeout scenario ignored for : ", b10));
            }
        } else {
            A4 a45 = this.f15531j;
            if (a45 != null) {
                ((B4) a45).a("w0", b.a.c("OOM Timeout scenario ignored for : ", b10));
            }
        }
    }

    public final void b(long j10) {
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("w0", AbstractC1661i0.a("w0", "TAG", "submitAdGetSignalsSucceeded ", this));
        }
        this.f15539r = false;
        HashMap hashMap = new HashMap();
        hashMap.put("adType", q());
        hashMap.put("latency", Long.valueOf(System.currentTimeMillis() - j10));
        hashMap.put("networkType", C1566b3.q());
        c("AdGetSignalsSucceeded", hashMap);
    }

    public final C1646h a(int i10) {
        Iterable iterable;
        LinkedList<C1646h> f10;
        LinkedList<C1646h> f11;
        toString();
        C1577c0 c1577c0 = this.f15542u;
        if (c1577c0 != null && (f11 = c1577c0.f()) != null) {
            iterable = new hg.c(0, f11.size() - 1);
        } else {
            iterable = EmptyList.INSTANCE;
        }
        if (kotlin.collections.m.o0(iterable, Integer.valueOf(i10))) {
            C1577c0 c1577c02 = this.f15542u;
            if (c1577c02 != null && (f10 = c1577c02.f()) != null) {
                return f10.get(i10);
            }
        } else {
            C1577c0 c1577c03 = this.f15542u;
            if (c1577c03 != null) {
                return c1577c03.p();
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
        if (r5.equals("ServerNoFill") == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005e, code lost:
        if (r5.equals("AdLoadFailed") == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0067, code lost:
        if (r5.equals("AdLoadSuccessful") == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006e, code lost:
        if (r5.equals("ServerError") == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0075, code lost:
        if (r5.equals("ServerFill") == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007e, code lost:
        if (r5.equals("RenderSuccess") != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0080, code lost:
        r0 = r4.E;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0082, code lost:
        if (r0 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0084, code lost:
        r6.put("retryCount", java.lang.Integer.valueOf(r0.f15013b));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(java.lang.String r5, java.util.Map<java.lang.String, java.lang.Object> r6) {
        /*
            r4 = this;
            java.lang.String r0 = "eventType"
            kotlin.jvm.internal.g.e(r5, r0)
            java.lang.String r0 = "kv"
            kotlin.jvm.internal.g.e(r6, r0)
            com.inmobi.media.A4 r0 = r4.f15531j
            java.lang.String r1 = "w0"
            if (r0 == 0) goto L2d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "onTelemetryEvent "
            r2.<init>(r3)
            r2.append(r4)
            java.lang.String r3 = " adState="
            r2.append(r3)
            byte r3 = r4.f15523a
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.inmobi.media.B4 r0 = (com.inmobi.media.B4) r0
            r0.c(r1, r2)
        L2d:
            byte r0 = r4.f15523a
            r2 = 3
            if (r0 == r2) goto Lb1
            com.inmobi.media.A4 r0 = r4.f15531j
            if (r0 == 0) goto L43
            java.lang.String r2 = "TAG"
            java.lang.String r3 = "addRetryCountToTelemetryEvent event - "
            java.lang.String r2 = com.inmobi.media.AbstractC1890z5.a(r1, r2, r3, r5)
            com.inmobi.media.B4 r0 = (com.inmobi.media.B4) r0
            r0.c(r1, r2)
        L43:
            int r0 = r5.hashCode()
            java.lang.String r1 = "ServerError"
            java.lang.String r2 = "ServerFill"
            switch(r0) {
                case -1959333523: goto L78;
                case 167123846: goto L71;
                case 885222501: goto L6a;
                case 925075267: goto L61;
                case 1881615718: goto L58;
                case 1925668903: goto L4f;
                default: goto L4e;
            }
        L4e:
            goto L8f
        L4f:
            java.lang.String r0 = "ServerNoFill"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L80
            goto L8f
        L58:
            java.lang.String r0 = "AdLoadFailed"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L80
            goto L8f
        L61:
            java.lang.String r0 = "AdLoadSuccessful"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L80
            goto L8f
        L6a:
            boolean r0 = r5.equals(r1)
            if (r0 != 0) goto L80
            goto L8f
        L71:
            boolean r0 = r5.equals(r2)
            if (r0 != 0) goto L80
            goto L8f
        L78:
            java.lang.String r0 = "RenderSuccess"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L8f
        L80:
            com.inmobi.media.d5 r0 = r4.E
            if (r0 == 0) goto L8f
            int r0 = r0.f15013b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r3 = "retryCount"
            r6.put(r3, r0)
        L8f:
            boolean r0 = kotlin.jvm.internal.g.a(r5, r2)
            if (r0 == 0) goto L97
            r0 = 1
            goto L9b
        L97:
            boolean r0 = kotlin.jvm.internal.g.a(r5, r1)
        L9b:
            if (r0 == 0) goto Lae
            com.inmobi.media.h r0 = r4.u()
            if (r0 == 0) goto Lae
            java.lang.String r0 = r0.p()
            if (r0 == 0) goto Lae
            java.lang.String r1 = "creativeType"
            r6.put(r1, r0)
        Lae:
            r4.c(r5, r6)
        Lb1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.AbstractC1846w0.b(java.lang.String, java.util.Map):void");
    }

    public final void a(AbstractC1689k0 listener, short s4) {
        kotlin.jvm.internal.g.e(listener, "listener");
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).a("w0", AbstractC1661i0.a("w0", "TAG", "onAdShowFailed ", this));
        }
        c(s4);
        listener.d();
    }

    public void a(int i10, S9 renderView, Context context) {
        kotlin.jvm.internal.g.e(renderView, "renderView");
        A4 a42 = this.f15531j;
        if (a42 != null) {
            StringBuilder e10 = androidx.appcompat.view.menu.d.e("Show pod ad with index : ", i10, " from creative: ");
            e10.append(this.f15528g.indexOf(renderView));
            e10.append(' ');
            e10.append(this);
            ((B4) a42).c("w0", e10.toString());
        }
        if (i10 >= 0) {
            this.f15545x = i10;
        } else {
            this.f15545x++;
        }
    }

    public final void b(byte b10) {
        Timer timer;
        C1870xb c1870xb;
        Timer timer2;
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).a("w0", AbstractC1661i0.a("w0", "TAG", "cancelTimer ", this));
        }
        if (b10 == 1 && (c1870xb = this.f15543v) != null && (timer2 = (Timer) c1870xb.f15659b.get((byte) 2)) != null) {
            timer2.cancel();
            c1870xb.f15659b.remove((byte) 2);
        }
        C1870xb c1870xb2 = this.f15543v;
        if (c1870xb2 == null || (timer = (Timer) c1870xb2.f15659b.get(Byte.valueOf(b10))) == null) {
            return;
        }
        timer.cancel();
        c1870xb2.f15659b.remove(Byte.valueOf(b10));
    }

    public final void b(int i10, boolean z10) {
        S9 s92;
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).a("w0", AbstractC1661i0.a("w0", "TAG", "fireAdPodShowResult ", this));
        }
        ArrayList list = this.f15528g;
        kotlin.jvm.internal.g.e(list, "list");
        if (i10 < 0 || i10 >= list.size() || (s92 = (S9) this.f15528g.get(i10)) == null) {
            return;
        }
        s92.b(z10);
    }

    @Override // com.inmobi.media.U9
    public void b(S9 renderView) {
        List<String> c;
        kotlin.jvm.internal.g.e(renderView, "renderView");
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).a("w0", AbstractC1661i0.a("w0", "TAG", "fireClickTracker ", this));
        }
        C1646h a10 = a(this.f15528g.indexOf(renderView));
        if (((a10 != null ? a10.p() : null) != null && kotlin.jvm.internal.g.a(a10.p(), "video")) || a10 == null || (c = a10.c(C1646h.CLICK_BEACON)) == null) {
            return;
        }
        for (String str : c) {
            Y1.f14860a.a(str, true, this.f15531j);
        }
    }

    @Override // com.inmobi.media.U9
    public void c(S9 renderView) {
        List<String> c;
        kotlin.jvm.internal.g.e(renderView, "renderView");
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).a("w0", AbstractC1661i0.a("w0", "TAG", "fireImpressionTracker ", this));
        }
        C1646h a10 = a(this.f15528g.indexOf(renderView));
        if (((a10 != null ? a10.p() : null) != null && kotlin.jvm.internal.g.a(a10.p(), "video")) || a10 == null || (c = a10.c("impression")) == null) {
            return;
        }
        for (String str : c) {
            C1780qb telemetryOnAdImpression = renderView.getTelemetryOnAdImpression();
            telemetryOnAdImpression.getClass();
            telemetryOnAdImpression.f15397e = "adResponseTracker";
            Y1.f14860a.b(str, true, (D1) new C1871y(this.D, telemetryOnAdImpression), this.f15531j);
        }
    }

    public void a(S9 renderView, Context context) {
        kotlin.jvm.internal.g.e(renderView, "renderView");
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("w0", AbstractC1661i0.a("w0", "TAG", "closeCurrentPodAd ", this));
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:99:0x0228
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public boolean a(com.inmobi.media.C1646h r23, int r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 762
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.AbstractC1846w0.a(com.inmobi.media.h, int, boolean):boolean");
    }

    public static final void a(Context context, AbstractC1846w0 this$0) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        C1572b9 c1572b9 = AbstractC1558a9.f14936a;
        AdConfig adConfig = this$0.f15524b;
        c1572b9.getClass();
        try {
            if (!Omid.isActive()) {
                Omid.activate(context);
            } else {
                c1572b9.a(adConfig);
            }
        } catch (Exception e10) {
            Q4 q42 = Q4.f14590a;
            Q4.c.a(AbstractC1863x4.a(e10, "event"));
        }
    }

    public final HashMap a(JSONArray jSONArray) {
        JSONObject jSONObject;
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).a("w0", AbstractC1661i0.a("w0", "TAG", "parseInMobiViewabilityParams ", this));
        }
        try {
            int length = jSONArray.length();
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    jSONObject = null;
                    break;
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                if (jSONObject2.has("inmobi")) {
                    jSONObject = jSONObject2.getJSONObject("inmobi");
                    break;
                }
                i10++;
            }
            if (jSONObject != null) {
                HashMap hashMap = new HashMap();
                String optString = jSONObject.optString("time");
                kotlin.jvm.internal.g.d(optString, "optString(...)");
                int b10 = b(optString);
                if (b10 != -1) {
                    hashMap.put("time", Integer.valueOf(b10));
                }
                String optString2 = jSONObject.optString("view");
                kotlin.jvm.internal.g.d(optString2, "optString(...)");
                int b11 = b(optString2);
                if (b11 != -1) {
                    hashMap.put("view", Integer.valueOf(b11));
                }
                String optString3 = jSONObject.optString("pixel");
                kotlin.jvm.internal.g.d(optString3, "optString(...)");
                int b12 = b(optString3);
                if (b12 != -1) {
                    hashMap.put("pixel", Integer.valueOf(b12));
                }
                int optInt = jSONObject.optInt("type");
                if (optInt != -1) {
                    hashMap.put("type", Integer.valueOf(optInt));
                    if (optInt == 2) {
                        JSONArray optJSONArray = jSONObject.optJSONArray("frame");
                        if (optJSONArray != null && optJSONArray.length() == 4) {
                            JSONArray optJSONArray2 = jSONObject.optJSONArray("frame");
                            kotlin.jvm.internal.g.d(optJSONArray2, "optJSONArray(...)");
                            hashMap.put("frame", optJSONArray2);
                        } else {
                            hashMap.put("frame", new JSONArray("[0,0,0,0]"));
                        }
                    }
                }
                return hashMap;
            }
            return null;
        } catch (JSONException e10) {
            A4 a43 = this.f15531j;
            if (a43 != null) {
                StringBuilder a10 = A5.a("w0", "TAG", "Exception while parsing MoatParams from response : ");
                a10.append(e10.getMessage());
                ((B4) a43).b("w0", a10.toString());
            }
            Q4 q42 = Q4.f14590a;
            Q4.c.a(AbstractC1675j0.a(e10, "event"));
            return null;
        }
    }

    public void a(J placement, boolean z10, short s4) {
        kotlin.jvm.internal.g.e(placement, "placement");
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).a("w0", AbstractC1661i0.a("w0", "TAG", "onAssetAvailabilityChanged ", this));
        }
        if (this.f15536o || t() == null) {
            return;
        }
        if (s4 != 0) {
            b(s4);
        }
        a(placement, z10);
    }

    public void a(J placement, boolean z10) {
        kotlin.jvm.internal.g.e(placement, "placement");
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("w0", AbstractC1661i0.a("w0", "TAG", "handleAssetAvailabilityChanged ", this));
        }
        A4 a43 = this.f15531j;
        if (a43 != null) {
            ((B4) a43).a("w0", "Asset availability changed (" + z10 + ") for placement ID (" + placement + ')');
        }
    }

    public void a(C1577c0 adSet) {
        LinkedList<C1646h> f10;
        LinkedList<C1646h> f11;
        kotlin.jvm.internal.g.e(adSet, "adSet");
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("w0", AbstractC1661i0.a("w0", "TAG", "handleAdFetchSuccessful ", this));
        }
        if (this.f15523a == 1) {
            this.f15542u = adSet;
            this.A = adSet.n();
            C1577c0 c1577c0 = this.f15542u;
            this.f15528g = new ArrayList((c1577c0 == null || (f11 = c1577c0.f()) == null) ? 0 : f11.size());
            C1577c0 c1577c02 = this.f15542u;
            if (c1577c02 != null && (f10 = c1577c02.f()) != null) {
                for (C1646h c1646h : f10) {
                    this.f15528g.add(null);
                }
            }
            C1646h p10 = adSet.p();
            if (p10 == null) {
                A4 a43 = this.f15531j;
                if (a43 != null) {
                    ((B4) a43).b("w0", "top ad is null. failed.");
                }
                b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2119);
                return;
            }
            A4 a44 = this.f15531j;
            if (a44 != null) {
                ((B4) a44).a("w0", "starting executor. parsing ad response");
            }
            C1819u c1819u = this.C;
            int hashCode = hashCode();
            C1656h9 c1656h9 = new C1656h9(this, p10, adSet, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), this.f15531j);
            c1819u.getClass();
            C1819u.a(hashCode, c1656h9);
            return;
        }
        A4 a45 = this.f15531j;
        if (a45 != null) {
            StringBuilder a10 = A5.a("w0", "TAG", "incorrect state - ");
            a10.append((int) this.f15523a);
            ((B4) a45).b("w0", a10.toString());
        }
        b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2118);
    }

    public boolean a(S9 renderView) {
        kotlin.jvm.internal.g.e(renderView, "renderView");
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("w0", AbstractC1661i0.a("w0", "TAG", "hasNextAdInAdPod ", this));
            return false;
        }
        return false;
    }

    public void a(byte b10) {
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).a("w0", AbstractC1661i0.a("w0", "TAG", "onTimeOut ", this));
        }
        if (b10 == 0) {
            A4 a43 = this.f15531j;
            if (a43 != null) {
                StringBuilder a10 = A5.a("w0", "TAG", "AdRequestTimeOut by timer, Adstate=");
                a10.append((int) this.f15523a);
                ((B4) a43).a("w0", a10.toString());
            }
            if (this.f15523a != 3) {
                a(this.f15541t, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT), (short) 2109);
            }
        } else if (b10 != 2 && b10 != 1) {
            if (b10 == 4) {
                A4 a44 = this.f15531j;
                if (a44 != null) {
                    ((B4) a44).a("w0", "Show RequestTimeOut by show timer");
                }
                AbstractC1689k0 r4 = r();
                if (r4 != null) {
                    r4.g();
                }
            } else if (b10 == 3) {
                A4 a45 = this.f15531j;
                if (a45 != null) {
                    ((B4) a45).a("w0", "Bitmap TimeOut not handled here");
                }
            } else {
                A4 a46 = this.f15531j;
                if (a46 != null) {
                    ((B4) a46).a("w0", "Unknown TimeOut ignored");
                }
            }
        } else {
            A4 a47 = this.f15531j;
            if (a47 != null) {
                StringBuilder a11 = A5.a("w0", "TAG", "Internal LoadTimeOut by timer, Adstate=");
                a11.append((int) this.f15523a);
                ((B4) a47).a("w0", a11.toString());
            }
            if (this.f15523a != 3) {
                this.G.removeCallbacksAndMessages(null);
                A4 a48 = this.f15531j;
                if (a48 != null) {
                    StringBuilder a12 = A5.a("w0", "TAG", "adUnitEventListener=");
                    a12.append(r());
                    a12.append(", Adstate=");
                    a12.append((int) this.f15523a);
                    ((B4) a48).a("w0", a12.toString());
                }
                byte b11 = this.f15523a;
                if (2 == b11) {
                    m0();
                    b(K8.a() == null ? (short) 2139 : (short) 2203);
                    AbstractC1689k0 r10 = r();
                    if (r10 != null) {
                        r10.a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                    }
                } else if (1 == b11) {
                    m0();
                    b((short) 2138);
                    AbstractC1689k0 r11 = r();
                    if (r11 != null) {
                        r11.a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT));
                    }
                }
            }
        }
    }

    public void a(boolean z10, InMobiAdRequestStatus status) {
        kotlin.jvm.internal.g.e(status, "status");
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("w0", AbstractC1661i0.a("w0", "TAG", "onDidParseAfterFetch ", this));
        }
        if (z10) {
            A4 a43 = this.f15531j;
            if (a43 != null) {
                ((B4) a43).a("w0", "Ad fetch successful");
            }
            A4 a44 = this.f15531j;
            if (a44 != null) {
                ((B4) a44).d("w0", "AdUnit " + this + " state - AVAILABLE");
            }
            d((byte) 2);
            return;
        }
        A4 a45 = this.f15531j;
        if (a45 != null) {
            ((B4) a45).b("w0", "onComplete parse success");
        }
        b(status, true, (short) 0);
    }

    public final void a(J placement, InMobiAdRequestStatus requestStatus, short s4) {
        kotlin.jvm.internal.g.e(placement, "placement");
        kotlin.jvm.internal.g.e(requestStatus, "requestStatus");
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).a("w0", AbstractC1661i0.a("w0", "TAG", "onAdFetchFailed ", this));
        }
        if (!this.f15536o && t() != null && this.f15523a != 3) {
            A4 a43 = this.f15531j;
            if (a43 != null) {
                ((B4) a43).c("w0", AbstractC1661i0.a("w0", "TAG", "handleMarkupFetchFailure ", this));
            }
            try {
                if (kotlin.jvm.internal.g.a(this.f15541t, placement) && this.f15523a == 1) {
                    A4 a44 = this.f15531j;
                    if (a44 != null) {
                        ((B4) a44).b("w0", "Failed to fetch ad for placement id: " + placement + ", reason - " + requestStatus.getMessage());
                    }
                    String str = "MarkupFetch failed reason is: " + requestStatus.getMessage();
                    A4 a45 = this.f15531j;
                    if (a45 != null) {
                        ((B4) a45).b("w0", str);
                    }
                    A4 a46 = this.f15531j;
                    if (a46 != null) {
                        ((B4) a46).d("w0", "AdUnit " + this + " state - FAILED");
                    }
                    d((byte) 3);
                    b((byte) 1);
                    if (s4 != 0) {
                        a(s4);
                    }
                    AbstractC1689k0 r4 = r();
                    if (r4 != null) {
                        r4.a(requestStatus);
                        return;
                    }
                    A4 a47 = this.f15531j;
                    if (a47 != null) {
                        ((B4) a47).a();
                        return;
                    }
                    return;
                }
                return;
            } catch (Exception e10) {
                A4 a48 = this.f15531j;
                if (a48 != null) {
                    ((B4) a48).a("w0", "onAdFetchFailed with error: ", e10);
                }
                Q4 q42 = Q4.f14590a;
                Q4.c.a(AbstractC1863x4.a(e10, "event"));
                return;
            }
        }
        A4 a49 = this.f15531j;
        if (a49 != null) {
            StringBuilder a10 = A5.a("w0", "TAG", "callback ignored - isDestroyed - ");
            a10.append(this.f15536o);
            a10.append(" context - ");
            a10.append(t());
            a10.append(" state- ");
            a10.append((int) this.f15523a);
            ((B4) a49).b("w0", a10.toString());
        }
    }

    public final void a(boolean z10, short s4) {
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).b("w0", "handleAdShowFailure " + this + " errorCode - " + ((int) s4));
        }
        if (z10) {
            A4 a43 = this.f15531j;
            if (a43 != null) {
                ((B4) a43).d("w0", "AdUnit " + this + " state - FAILED");
            }
            d((byte) 3);
            b((byte) 4);
        }
        AbstractC1689k0 r4 = r();
        if (r4 != null) {
            r4.d();
        }
        if (s4 != 0) {
            c(s4);
        }
    }

    public final void a(InMobiAdRequestStatus requestStatus, boolean z10, short s4) {
        kotlin.jvm.internal.g.e(requestStatus, "requestStatus");
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).b("w0", "handleAdFetchFailure " + this + " errorCode - " + ((int) s4));
        }
        if (this.f15523a == 1 && z10) {
            A4 a43 = this.f15531j;
            if (a43 != null) {
                ((B4) a43).d("w0", "AdUnit " + this + " state - FAILED");
            }
            d((byte) 3);
            b((byte) 1);
        }
        AbstractC1689k0 r4 = r();
        if (r4 != null) {
            r4.a(this, requestStatus);
        }
        if (s4 != 0) {
            a(s4);
        }
    }

    public final void a(Map<String, String> map) {
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("w0", "setPublisherSuppliedExtras " + this + " - " + map);
        }
        this.f15541t.a(map);
    }

    public final void a(JSONObject responseJson) {
        kotlin.jvm.internal.g.e(responseJson, "responseJson");
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("w0", AbstractC1661i0.a("w0", "TAG", "onAuctionClosed ", this));
        }
        new Handler(Looper.getMainLooper()).post(new l1.a(10, this, responseJson));
    }

    public static final void a(AbstractC1846w0 this$0, JSONObject responseJson) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        kotlin.jvm.internal.g.e(responseJson, "$responseJson");
        C1819u c1819u = this$0.C;
        int hashCode = this$0.hashCode();
        C1578c1 c1578c1 = new C1578c1(this$0, responseJson, this$0.f15531j);
        c1819u.getClass();
        C1819u.a(hashCode, c1578c1);
    }

    public final void a(cg.a onSuccess, cg.l onMaxRetryReached) {
        kotlin.jvm.internal.g.e(onSuccess, "onSuccess");
        kotlin.jvm.internal.g.e(onMaxRetryReached, "onMaxRetryReached");
        A4 a42 = this.f15531j;
        Object obj = null;
        if (a42 != null) {
            StringBuilder a10 = A5.a("w0", "TAG", "loadWithRetry ");
            C1596d5 c1596d5 = this.E;
            a10.append(c1596d5 != null ? Integer.valueOf(c1596d5.f15013b) : null);
            ((B4) a42).c("w0", a10.toString());
        }
        C1596d5 c1596d52 = this.E;
        if (c1596d52 != null) {
            EnumC1849w3 a11 = K8.a();
            if (a11 == null) {
                obj = C1642g9.f15100a;
            } else {
                int i10 = c1596d52.f15013b + 1;
                c1596d52.f15013b = i10;
                if (i10 >= c1596d52.f15012a.f15374b) {
                    obj = new C1625f6(a11);
                } else {
                    obj = C1881y9.f15684a;
                }
            }
        }
        if (obj instanceof C1625f6) {
            onMaxRetryReached.invoke(((C1625f6) obj).f15049a);
        } else if (obj instanceof C1642g9) {
            A4 a43 = this.f15531j;
            if (a43 != null) {
                ((B4) a43).c("w0", "load with retry success");
            }
            onSuccess.invoke();
        } else if (!(obj instanceof C1881y9)) {
            if (obj == null) {
                A4 a44 = this.f15531j;
                if (a44 != null) {
                    ((B4) a44).c("w0", "shouldProceedToLoad result null. starting as if we have internet.");
                }
                onSuccess.invoke();
            }
        } else {
            A4 a45 = this.f15531j;
            if (a45 != null) {
                ((B4) a45).c("w0", "load failed, retrying");
            }
            Handler handler = this.G;
            androidx.fragment.app.d dVar = new androidx.fragment.app.d(7, this, onSuccess, onMaxRetryReached);
            C1762p6 c1762p6 = this.F;
            handler.postDelayed(dVar, c1762p6 != null ? c1762p6.f15373a : 1000L);
        }
    }

    public static final void a(AbstractC1846w0 this$0, cg.a onSuccess, cg.l onMaxRetryReached) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        kotlin.jvm.internal.g.e(onSuccess, "$onSuccess");
        kotlin.jvm.internal.g.e(onMaxRetryReached, "$onMaxRetryReached");
        A4 a42 = this$0.f15531j;
        if (a42 != null) {
            StringBuilder a10 = A5.a("w0", "TAG", "Loading from retry Handler ");
            C1596d5 c1596d5 = this$0.E;
            a10.append(c1596d5 != null ? Integer.valueOf(c1596d5.f15013b) : null);
            ((B4) a42).c("w0", a10.toString());
        }
        this$0.a(onSuccess, onMaxRetryReached);
    }

    public void a(byte[] bArr) {
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("w0", AbstractC1661i0.a("w0", "TAG", "load response ", this));
        }
        C1872y0 c1872y0 = this.I;
        c1872y0.getClass();
        c1872y0.c = SystemClock.elapsedRealtime();
        C1872y0 c1872y02 = this.I;
        c1872y02.getClass();
        c1872y02.f15669h = SystemClock.elapsedRealtime();
        if (Y()) {
            A4 a43 = this.f15531j;
            if (a43 != null) {
                ((B4) a43).a("w0", "isBlockingStateForLoadWithResponse - blocking");
            }
        } else if (bArr != null && bArr.length != 0) {
            if (this.f15540s == null) {
                this.f15540s = new R8(this);
            }
            C1807t0 c1807t0 = new C1807t0(this, bArr);
            if (p0()) {
                A4 a44 = this.f15531j;
                if (a44 != null) {
                    ((B4) a44).a("w0", "skipping internet check on load(byte[])");
                }
                c1807t0.invoke();
                return;
            }
            A4 a45 = this.f15531j;
            if (a45 != null) {
                ((B4) a45).a("w0", "starting load with retry");
            }
            a(c1807t0, new C1794s0(this));
        } else {
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INVALID_RESPONSE_IN_LOAD), true, (short) 2143);
            A4 a46 = this.f15531j;
            if (a46 != null) {
                ((B4) a46).a("w0", "null response. failing");
            }
        }
    }

    public final void a(InMobiAdRequestStatus requestStatus, short s4) {
        kotlin.jvm.internal.g.e(requestStatus, "requestStatus");
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).b("w0", "loadResponseFailed " + this + " errorCode - " + ((int) s4));
        }
        b(requestStatus, true, s4);
    }

    @SuppressLint({"SwitchIntDef"})
    public final boolean a(AbstractC1689k0 abstractC1689k0, long j10) {
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("w0", AbstractC1661i0.a("w0", "TAG", "isBlockingStateForGetSignals ", this));
        }
        if (this.f15539r) {
            Z5.a((byte) 2, "InMobi", "getSignals() call is already in progress. Please wait for its execution to get complete");
            A4 a43 = this.f15531j;
            if (a43 != null) {
                ((B4) a43).b("w0", "getSignals() call is already in progress. Please wait for its execution to get complete");
            }
            return true;
        } else if (f0()) {
            if (abstractC1689k0 != null) {
                abstractC1689k0.b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES));
            }
            a(2007, j10);
            return true;
        } else {
            return false;
        }
    }

    public final void a(WeakReference<AbstractC1689k0> listenerWeakReference, short s4, InMobiAdRequestStatus status) {
        kotlin.jvm.internal.g.e(listenerWeakReference, "listenerWeakReference");
        kotlin.jvm.internal.g.e(status, "status");
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).a("w0", AbstractC1661i0.a("w0", "TAG", "onLoadAdMarkupFailed ", this));
        }
        d((byte) 3);
        A4 a43 = this.f15531j;
        if (a43 != null) {
            ((B4) a43).d("w0", "AdUnit " + this + " state - FAILED");
        }
        b((byte) 1);
        if (this.f15536o) {
            A4 a44 = this.f15531j;
            if (a44 != null) {
                ((B4) a44).b("w0", "AdUnit destroyed while onLoadAdMarkupFailed");
                return;
            }
            return;
        }
        AbstractC1689k0 abstractC1689k0 = listenerWeakReference.get();
        if (abstractC1689k0 != null) {
            if (kotlin.jvm.internal.g.a("int", q())) {
                a(abstractC1689k0, s4);
                return;
            }
            b(s4);
            abstractC1689k0.a(this, status);
            return;
        }
        A4 a45 = this.f15531j;
        if (a45 != null) {
            ((B4) a45).b("w0", "Listener was garbage collected.Unable to give callback");
        }
    }

    public final void a(WatermarkData watermarkData) {
        kotlin.jvm.internal.g.e(watermarkData, "watermarkData");
        this.J = watermarkData;
        S9 w7 = w();
        if (w7 != null) {
            w7.setWatermark(watermarkData);
        }
    }

    public static /* synthetic */ void a(AbstractC1846w0 abstractC1846w0, int i10, boolean z10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: destroyContainer");
        }
        if ((i11 & 2) != 0) {
            z10 = true;
        }
        abstractC1846w0.a(i10, z10);
    }

    public final void a(int i10, boolean z10) {
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).a("w0", "Destroying container for index " + i10 + ' ' + this);
        }
        ArrayList list = this.f15528g;
        kotlin.jvm.internal.g.e(list, "list");
        if (i10 < 0 || i10 >= list.size()) {
            return;
        }
        S9 s92 = (S9) this.f15528g.get(i10);
        if (s92 != null) {
            s92.f14690v0.set(z10);
            s92.stopLoading();
            s92.b();
        }
        this.f15528g.set(i10, null);
    }

    @Override // com.inmobi.media.U9
    public void a(String log) {
        kotlin.jvm.internal.g.e(log, "log");
        AbstractC1689k0 r4 = r();
        if (r4 != null) {
            r4.a(log);
        }
    }

    public void a(AbstractC1689k0 abstractC1689k0) {
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("w0", AbstractC1661i0.a("w0", "TAG", "handleAdScreenDismissed ", this));
        }
    }

    @Override // com.inmobi.media.U9
    public void a(final S9 renderView, final short s4) {
        kotlin.jvm.internal.g.e(renderView, "renderView");
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("w0", AbstractC1661i0.a("w0", "TAG", "onRenderViewError ", this));
        }
        if (this.f15536o || t() == null) {
            return;
        }
        try {
            Handler handler = this.f15533l;
            if (handler != null) {
                handler.post(new Runnable() { // from class: qb.h1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC1846w0.a(AbstractC1846w0.this, renderView, s4);
                    }
                });
            }
        } catch (Exception e10) {
            A4 a43 = this.f15531j;
            if (a43 != null) {
                ((B4) a43).b("w0", Cc.a(e10, A5.a("w0", "TAG", "Loading ad markup into container encountered an unexpected error: ")));
            }
        }
    }

    public static final void a(AbstractC1846w0 this$0, S9 renderView, short s4) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        kotlin.jvm.internal.g.e(renderView, "$renderView");
        this$0.b(renderView, s4);
    }

    @Override // com.inmobi.media.U9
    public void a(HashMap<Object, Object> params) {
        kotlin.jvm.internal.g.e(params, "params");
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("w0", AbstractC1661i0.a("w0", "TAG", "onAdInteraction ", this));
        }
        if (this.f15536o || t() == null) {
            return;
        }
        A4 a43 = this.f15531j;
        if (a43 != null) {
            ((B4) a43).a("w0", "Ad interaction. Params: " + params);
        }
        AbstractC1689k0 r4 = r();
        if (r4 != null) {
            r4.a(params);
        }
    }

    @Override // com.inmobi.media.U9
    public void a(C1780qb telemetryOnAdImpression) {
        kotlin.jvm.internal.g.e(telemetryOnAdImpression, "telemetryOnAdImpression");
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("w0", AbstractC1661i0.a("w0", "TAG", "onImpressionFiredFromTemplate ", this));
        }
        telemetryOnAdImpression.f15397e = "imraid_impressionFired";
        if (!this.f15536o && t() != null) {
            A4 a43 = this.f15531j;
            if (a43 != null) {
                ((B4) a43).a("w0", "onImpressionFiredFromTemplate");
            }
            Handler handler = this.f15533l;
            if (handler != null) {
                handler.post(new androidx.fragment.app.a1(7, this, telemetryOnAdImpression));
                return;
            }
            return;
        }
        telemetryOnAdImpression.b();
    }

    public static final void a(AbstractC1846w0 this$0, C1780qb telemetryOnAdImpression) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        kotlin.jvm.internal.g.e(telemetryOnAdImpression, "$telemetryOnAdImpression");
        this$0.D.a(telemetryOnAdImpression);
    }

    @Override // com.inmobi.media.U9, com.inmobi.media.Tb
    public void a() {
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("w0", AbstractC1661i0.a("w0", "TAG", "onUserLeaveApplication ", this));
        }
        if (this.f15536o || t() == null) {
            return;
        }
        A4 a43 = this.f15531j;
        if (a43 != null) {
            ((B4) a43).a("w0", "User left application");
        }
        AbstractC1689k0 r4 = r();
        if (r4 != null) {
            r4.h();
        }
    }

    public final void a(short s4) {
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("w0", AbstractC1661i0.a("w0", "TAG", "submitAdLoadDroppedAtSDK ", this));
        }
        HashMap hashMap = new HashMap();
        hashMap.put("errorCode", Short.valueOf(s4));
        c(hashMap);
        c("AdLoadDroppedAtSDK", hashMap);
    }

    public final void a(int i10, long j10) {
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("w0", AbstractC1661i0.a("w0", "TAG", "submitAdGetSignalsFailed ", this));
        }
        this.f15539r = false;
        HashMap hashMap = new HashMap();
        hashMap.put("adType", q());
        hashMap.put("latency", Long.valueOf(System.currentTimeMillis() - j10));
        hashMap.put("networkType", C1566b3.q());
        hashMap.put("errorCode", Integer.valueOf(i10));
        c("AdGetSignalsFailed", hashMap);
    }

    @Override // com.inmobi.media.U9
    public void a(String eventType, Map<String, Object> kv) {
        kotlin.jvm.internal.g.e(eventType, "eventType");
        kotlin.jvm.internal.g.e(kv, "kv");
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("w0", AbstractC1661i0.a("w0", "TAG", "onRenderViewRequestedAction ", this));
        }
        c(eventType, kv);
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x039f, code lost:
        if (r6 == null) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0205, code lost:
        if (r6 == null) goto L92;
     */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0267  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.inmobi.media.C1646h r43) {
        /*
            Method dump skipped, instructions count: 1059
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.AbstractC1846w0.a(com.inmobi.media.h):void");
    }

    public final W6 a(C1682j7 c1682j7) {
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("w0", AbstractC1661i0.a("w0", "TAG", "isSkippableVideo ", this));
        }
        Iterator it = c1682j7.c().iterator();
        while (it.hasNext()) {
            W6 w62 = (W6) c1682j7.n((String) it.next()).get(0);
            if (2 == w62.f14795k) {
                return w62;
            }
        }
        return null;
    }

    public final void a(boolean z10, S9 s92) {
        Set<Fb> d10;
        AdConfig.ViewabilityConfig viewability;
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).a("w0", AbstractC1661i0.a("w0", "TAG", "omidSessionForHtmlMarkup ", this));
        }
        AdConfig adConfig = this.f15524b;
        AdConfig.OmidConfig omidConfig = (adConfig == null || (viewability = adConfig.getViewability()) == null) ? null : viewability.getOmidConfig();
        if (omidConfig == null || omidConfig.isOmidEnabled()) {
            AbstractC1558a9.f14936a.getClass();
            if (Omid.isActive() && (d10 = d(this.f15528g.indexOf(s92))) != null) {
                for (Fb fb2 : d10) {
                    if (3 == fb2.f14255a) {
                        try {
                            String str = (String) fb2.a("creativeType", String.class);
                            String str2 = (String) fb2.a("customReferenceData", String.class);
                            Boolean bool = (Boolean) fb2.a("isolateVerificationScripts", Boolean.class);
                            Byte b10 = (Byte) fb2.a("impressionType", Byte.class);
                            T8 a10 = (str == null || bool == null || b10 == null) ? null : W8.a(str, s92, bool.booleanValue(), this.f15541t.e(), b10.byteValue(), str2);
                            if (a10 != null) {
                                fb2.f14256b.put("omidAdSession", a10);
                                fb2.f14256b.put("deferred", Boolean.valueOf(z10));
                                A4 a43 = this.f15531j;
                                if (a43 != null) {
                                    ((B4) a43).a("w0", "OMID ad session created and WebView container registered with OMID");
                                }
                            } else {
                                A4 a44 = this.f15531j;
                                if (a44 != null) {
                                    ((B4) a44).a("w0", "Ignoring IAB meta data for this ad markup");
                                }
                            }
                        } catch (Exception e10) {
                            A4 a45 = this.f15531j;
                            if (a45 != null) {
                                ((B4) a45).b("w0", Cc.a(e10, A5.a("w0", "TAG", "Setting up impression tracking for IAB encountered an unexpected error: ")));
                            }
                            Q4 q42 = Q4.f14590a;
                            Q4.c.a(AbstractC1863x4.a(e10, "event"));
                        }
                    }
                }
            }
        }
    }

    public static final void a(AbstractC1846w0 abstractC1846w0, C1646h c1646h, String str) {
        A4 a42 = abstractC1846w0.f15531j;
        if (a42 != null) {
            ((B4) a42).c("w0", AbstractC1661i0.a("w0", "TAG", "updateAdForBlob ", abstractC1846w0));
        }
        c1646h.e(str);
        A4 a43 = abstractC1846w0.f15531j;
        if (a43 != null) {
            ((B4) a43).c("w0", AbstractC1661i0.a("w0", "TAG", "updateAd ", abstractC1846w0));
        }
        C1577c0 c1577c0 = abstractC1846w0.f15542u;
        if (c1577c0 != null) {
            c1577c0.a(c1646h);
        }
    }

    public void a(String blob, String str) {
        kotlin.jvm.internal.g.e(blob, "blob");
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("w0", AbstractC1661i0.a("w0", "TAG", "saveBlob ", this));
        }
        C1819u c1819u = this.C;
        int hashCode = hashCode();
        C1833v0 c1833v0 = new C1833v0(this, str, blob);
        c1819u.getClass();
        C1819u.a(hashCode, c1833v0);
    }

    public void a(String jsCallbackNamespace, String callback, G1 receiver, String str) {
        kotlin.jvm.internal.g.e(jsCallbackNamespace, "jsCallbackNamespace");
        kotlin.jvm.internal.g.e(callback, "callback");
        kotlin.jvm.internal.g.e(receiver, "receiver");
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("w0", AbstractC1661i0.a("w0", "TAG", "getBlob ", this));
        }
        C1819u c1819u = this.C;
        int hashCode = hashCode();
        C1730n0 c1730n0 = new C1730n0(this, str, receiver, jsCallbackNamespace, callback);
        c1819u.getClass();
        C1819u.a(hashCode, c1730n0);
    }

    public void a(C1646h ad2, boolean z10, short s4) {
        C1577c0 c1577c0;
        kotlin.jvm.internal.g.e(ad2, "ad");
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("w0", AbstractC1661i0.a("w0", "TAG", "onVastProcessCompleted ", this));
        }
        C1646h c1646h = (m() == null || W()) ? null : null;
        if (c1646h == null) {
            return;
        }
        A4 a43 = this.f15531j;
        if (a43 != null) {
            StringBuilder a10 = A5.a("w0", "TAG", "Vast processing completed for ad with impressionId : ");
            a10.append(c1646h.s());
            ((B4) a43).c("w0", a10.toString());
        }
        String u7 = c1646h.u();
        int hashCode = u7.hashCode();
        if (hashCode != -1084172778) {
            if (hashCode != 3213227) {
                if (hashCode == 1236050372 && u7.equals("htmlUrl")) {
                    return;
                }
            } else if (u7.equals("html")) {
                return;
            }
        } else if (u7.equals("inmobiJson")) {
            if (this.f15523a == 2 && (c1577c0 = this.f15542u) != null) {
                c1577c0.a(ad2);
                C1633g0 p10 = p();
                String clientReqId = c1577c0.k();
                p10.getClass();
                kotlin.jvm.internal.g.e(clientReqId, "clientReqId");
                Set<C1894z9> y10 = ad2.y();
                if (y10.isEmpty()) {
                    ((AbstractC1846w0) p10.f15080a).a(p10.c, true, (short) 0);
                    return;
                }
                String uuid = UUID.randomUUID().toString();
                kotlin.jvm.internal.g.d(uuid, "toString(...)");
                C1688k c1688k = new C1688k(uuid, y10, p10.f15085g, null, 16);
                String f10 = ad2.f();
                if (f10 != null) {
                    X0.a(c1688k, f10);
                    return;
                }
                return;
            }
            A4 a44 = this.f15531j;
            if (a44 != null) {
                ((B4) a44).b("w0", "Found inconsistent state after vast processing");
                return;
            }
            return;
        }
        A4 a45 = this.f15531j;
        if (a45 != null) {
            StringBuilder a11 = A5.a("w0", "TAG", "Can not handle fallback for");
            a11.append(c1646h.u());
            ((B4) a45).b("w0", a11.toString());
        }
        throw new IllegalStateException("Can not handle fallback for markup type: " + c1646h.u());
    }
}
