package com.inmobi.media;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.commons.core.configs.TelemetryConfig;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ScheduledExecutorService;
import lib.zj.office.fc.hssf.record.FeatHdrRecord;
import lib.zj.office.fc.hssf.record.FeatRecord;
import lib.zj.office.fc.hssf.record.HeaderFooterRecord;
import lib.zj.office.fc.hssf.record.chart.DataLabelExtensionRecord;

/* renamed from: com.inmobi.media.i5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1666i5 extends AbstractC1846w0 {
    public int M;
    public boolean N;
    public C1588cb O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1666i5(Context context, J adPlacement, AbstractC1689k0 abstractC1689k0) {
        super(context, adPlacement, abstractC1689k0);
        kotlin.jvm.internal.g.e(context, "context");
        kotlin.jvm.internal.g.e(adPlacement, "adPlacement");
        this.O = new C1588cb();
        adPlacement.l();
        a(context, adPlacement, abstractC1689k0);
        c("activity");
    }

    public static final void c(C1666i5 this$0) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        this$0.a(this$0.r());
    }

    public static final void d(C1666i5 this$0) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        this$0.b(this$0.r());
    }

    public static final void e(C1666i5 this$0) {
        LinkedList<C1646h> f10;
        kotlin.jvm.internal.g.e(this$0, "this$0");
        this$0.s0();
        if (this$0.b0()) {
            C1577c0 y10 = this$0.y();
            int size = (y10 == null || (f10 = y10.f()) == null) ? 0 : f10.size();
            for (int i10 = 1; i10 < size; i10++) {
                this$0.g(this$0.z() + 1);
                this$0.s0();
            }
        }
    }

    public final boolean C0() {
        if (f0()) {
            A4 a42 = this.f15531j;
            if (a42 != null) {
                ((B4) a42).a("i5", "Some of the dependency libraries for Interstitial not found");
            }
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES), true, (short) 2007);
            return false;
        }
        AbstractC1689k0 r4 = r();
        if (r4 == null) {
            return false;
        }
        byte Q = Q();
        if (Q == 1) {
            A4 a43 = this.f15531j;
            if (a43 != null) {
                ((B4) a43).b("InMobiInterstitial", Kb.f14408n + I());
            }
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD), false, (short) 2008);
        } else if (Q == 7 || Q == 6) {
            A4 a44 = this.f15531j;
            if (a44 != null) {
                ((B4) a44).b("InMobiInterstitial", Kb.f14404j + I());
            }
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE), false, (short) 2010);
        } else if (Q == 2) {
            if (!kotlin.jvm.internal.g.a("html", E()) && !kotlin.jvm.internal.g.a("htmlUrl", E())) {
                e(r4);
            } else {
                A4 a45 = this.f15531j;
                if (a45 != null) {
                    ((B4) a45).b("InMobiInterstitial", Kb.f14408n + I());
                }
                a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD), false, (short) 2011);
            }
        } else {
            if (4 == Q()) {
                if (W()) {
                    g();
                } else {
                    A4 a46 = this.f15531j;
                    if (a46 != null) {
                        ((B4) a46).a("i5", "An ad is ready with the ad unit. Signaling ad load success ...");
                    }
                    AbstractC1689k0 r10 = r();
                    if (r10 == null) {
                        A4 a47 = this.f15531j;
                        if (a47 != null) {
                            ((B4) a47).b("InMobiInterstitial", "Listener was garbage collected. Unable to give callback");
                        }
                    } else {
                        e(r10);
                        f(r10);
                    }
                    return false;
                }
            }
            e0();
            return true;
        }
        return false;
    }

    public final boolean D0() {
        A4 a42;
        C1646h m10 = m();
        if (m10 == null) {
            return false;
        }
        AdConfig j10 = j();
        kotlin.jvm.internal.g.b(j10);
        boolean a10 = m10.a(j10.getCacheConfig(q()).getTimeToLive());
        if (a10 && (a42 = this.f15531j) != null) {
            ((B4) a42).b("i5", "Top ad has expired, failing show of ad.");
        }
        return !a10;
    }

    public final void E0() {
        r k10 = k();
        if (k10 == null) {
            return;
        }
        this.N = true;
        k10.e();
    }

    @Override // com.inmobi.media.AbstractC1846w0
    public Integer F() {
        AdConfig j10 = j();
        if (j10 != null) {
            return Integer.valueOf(j10.getMinimumRefreshInterval());
        }
        return null;
    }

    public final C1588cb F0() {
        return this.O;
    }

    public final boolean G0() {
        if (Q() == 4) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
        r0 = D();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
        if (r0 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
        r0.post(new b1.e(r5, 6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void H0() {
        /*
            r5 = this;
            java.lang.String r0 = "Cannot handle markupType: "
            com.inmobi.media.A4 r1 = r5.f15531j
            java.lang.String r2 = "i5"
            if (r1 == 0) goto Lf
            com.inmobi.media.B4 r1 = (com.inmobi.media.B4) r1
            java.lang.String r3 = "renderAdPostInternetCheck"
            r1.a(r2, r3)
        Lf:
            r5.k0()
            boolean r1 = r5.o0()     // Catch: java.lang.IllegalStateException -> L90
            if (r1 == 0) goto L19
            return
        L19:
            com.inmobi.media.y0 r1 = r5.s()     // Catch: java.lang.IllegalStateException -> L90
            r1.getClass()     // Catch: java.lang.IllegalStateException -> L90
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.IllegalStateException -> L90
            r1.f15668g = r3     // Catch: java.lang.IllegalStateException -> L90
            r5.d0()     // Catch: java.lang.IllegalStateException -> L90
            java.lang.String r1 = r5.E()     // Catch: java.lang.IllegalStateException -> L90
            int r3 = r1.hashCode()     // Catch: java.lang.IllegalStateException -> L90
            r4 = -1084172778(0xffffffffbf60d616, float:-0.8782667)
            if (r3 == r4) goto L62
            r4 = 3213227(0x3107ab, float:4.50269E-39)
            if (r3 == r4) goto L4a
            r4 = 1236050372(0x49aca1c4, float:1414200.5)
            if (r3 == r4) goto L41
            goto L6a
        L41:
            java.lang.String r3 = "htmlUrl"
            boolean r1 = r1.equals(r3)     // Catch: java.lang.IllegalStateException -> L90
            if (r1 != 0) goto L52
            goto L6a
        L4a:
            java.lang.String r3 = "html"
            boolean r1 = r1.equals(r3)     // Catch: java.lang.IllegalStateException -> L90
            if (r1 == 0) goto L6a
        L52:
            android.os.Handler r0 = r5.D()     // Catch: java.lang.IllegalStateException -> L90
            if (r0 == 0) goto La9
            b1.e r1 = new b1.e     // Catch: java.lang.IllegalStateException -> L90
            r3 = 6
            r1.<init>(r5, r3)     // Catch: java.lang.IllegalStateException -> L90
            r0.post(r1)     // Catch: java.lang.IllegalStateException -> L90
            goto La9
        L62:
            java.lang.String r3 = "inmobiJson"
            boolean r1 = r1.equals(r3)     // Catch: java.lang.IllegalStateException -> L90
            if (r1 != 0) goto L84
        L6a:
            com.inmobi.media.A4 r1 = r5.f15531j     // Catch: java.lang.IllegalStateException -> L90
            if (r1 == 0) goto La9
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.IllegalStateException -> L90
            r3.<init>(r0)     // Catch: java.lang.IllegalStateException -> L90
            java.lang.String r0 = r5.E()     // Catch: java.lang.IllegalStateException -> L90
            r3.append(r0)     // Catch: java.lang.IllegalStateException -> L90
            java.lang.String r0 = r3.toString()     // Catch: java.lang.IllegalStateException -> L90
            com.inmobi.media.B4 r1 = (com.inmobi.media.B4) r1     // Catch: java.lang.IllegalStateException -> L90
            r1.a(r2, r0)     // Catch: java.lang.IllegalStateException -> L90
            goto La9
        L84:
            com.inmobi.media.A4 r0 = r5.f15531j     // Catch: java.lang.IllegalStateException -> L90
            if (r0 == 0) goto La9
            java.lang.String r1 = "Waiting for Vast Processing"
            com.inmobi.media.B4 r0 = (com.inmobi.media.B4) r0     // Catch: java.lang.IllegalStateException -> L90
            r0.a(r2, r1)     // Catch: java.lang.IllegalStateException -> L90
            goto La9
        L90:
            r0 = move-exception
            com.inmobi.media.A4 r1 = r5.f15531j
            if (r1 == 0) goto L9c
            com.inmobi.media.B4 r1 = (com.inmobi.media.B4) r1
            java.lang.String r3 = "Exception while loading ad."
            r1.a(r2, r3, r0)
        L9c:
            com.inmobi.ads.InMobiAdRequestStatus r0 = new com.inmobi.ads.InMobiAdRequestStatus
            com.inmobi.ads.InMobiAdRequestStatus$StatusCode r1 = com.inmobi.ads.InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR
            r0.<init>(r1)
            r1 = 1
            r2 = 2134(0x856, float:2.99E-42)
            r5.b(r0, r1, r2)
        La9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C1666i5.H0():void");
    }

    public boolean I0() {
        if (2 == Q()) {
            return true;
        }
        return false;
    }

    @Override // com.inmobi.media.AbstractC1846w0
    public final byte J() {
        return (byte) 1;
    }

    public final void J0() {
        C1646h m10;
        String str;
        short s4;
        A4 a42 = this.f15531j;
        if (a42 != null) {
            String e10 = AbstractC1846w0.e();
            kotlin.jvm.internal.g.d(e10, "<get-TAG>(...)");
            ((B4) a42).c(e10, "submitAdNotReady " + this);
        }
        C1588cb c1588cb = this.O;
        C1872y0 s10 = s();
        if (this.A) {
            m10 = a(this.f15545x);
        } else {
            m10 = m();
        }
        Boolean bool = null;
        if (m10 != null) {
            str = m10.p();
        } else {
            str = null;
        }
        C1577c0 y10 = y();
        if (y10 != null) {
            bool = y10.o();
        }
        Boolean bool2 = bool;
        String E = E();
        byte Q = Q();
        new G(s10, str, bool2, E, Q);
        c1588cb.getClass();
        HashMap hashMap = new HashMap();
        long j10 = s10.c;
        ScheduledExecutorService scheduledExecutorService = Vb.f14759a;
        hashMap.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
        if (Q == 0) {
            s4 = HeaderFooterRecord.sid;
        } else if (Q == 1) {
            s4 = 2205;
        } else if (Q == 2) {
            s4 = 2206;
        } else if (Q == 3) {
            s4 = 2207;
        } else if (Q == 6) {
            s4 = 2208;
        } else if (Q == 7) {
            s4 = 2209;
        } else {
            s4 = 2210;
        }
        hashMap.put("errorCode", Short.valueOf(s4));
        if (E != null) {
            hashMap.put("markupType", E);
        }
        if (str != null) {
            hashMap.put("creativeType", OperatorName.SHOW_TEXT_LINE_AND_SPACE + str + '\"');
        }
        if (bool2 != null) {
            hashMap.put("isRewarded", bool2);
        }
        String a10 = s10.a();
        if (a10.length() > 0) {
            hashMap.put("metadataBlob", a10);
        }
        hashMap.put("adType", s10.f15663a.q());
        hashMap.put("networkType", C1566b3.q());
        hashMap.put("plId", Long.valueOf(s10.f15663a.I().l()));
        hashMap.put("isAdLoaded", Boolean.valueOf(c1588cb.f15002a));
        String m11 = s10.f15663a.I().m();
        if (m11 != null) {
            hashMap.put("plType", m11);
        }
        C1616eb c1616eb = C1616eb.f15034a;
        C1616eb.b("AdNotReady", hashMap, EnumC1686jb.f15238a);
    }

    public final void K0() {
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).a("InMobiInterstitial", "Successfully loaded Interstitial ad markup in the WebView for placement id: " + I());
        }
        i();
        r0();
    }

    @Override // com.inmobi.media.AbstractC1846w0, com.inmobi.media.K
    public void a(int i10, S9 renderView) {
        kotlin.jvm.internal.g.e(renderView, "renderView");
    }

    public final short b(Context context) {
        int i10;
        try {
            A4 a42 = this.f15531j;
            if (a42 != null) {
                ((B4) a42).a("i5", ">>> Starting InMobiAdActivity to display interstitial ad ...");
            }
            r k10 = k();
            if (k10 == null) {
                return DataLabelExtensionRecord.sid;
            }
            if (kotlin.jvm.internal.g.a("unknown", k10.getMarkupType())) {
                return (short) 2156;
            }
            SparseArray sparseArray = InMobiAdActivity.f14092j;
            int hashCode = k10.hashCode();
            InMobiAdActivity.f14092j.put(hashCode, k10);
            Intent intent = new Intent(context, InMobiAdActivity.class);
            A4 a43 = this.f15531j;
            if (a43 != null) {
                String uuid = UUID.randomUUID().toString();
                kotlin.jvm.internal.g.d(uuid, "toString(...)");
                HashMap hashMap = AbstractC1747o4.f15359a;
                AbstractC1747o4.f15359a.put(uuid, new WeakReference(a43));
                intent.putExtra("loggerCacheKey", uuid);
            }
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_INDEX", hashCode);
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_TYPE", 102);
            String E = E();
            if (kotlin.jvm.internal.g.a(E, "html")) {
                i10 = 200;
            } else {
                i10 = kotlin.jvm.internal.g.a(E, "htmlUrl") ? 202 : 201;
            }
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_TYPE", i10);
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_IS_FULL_SCREEN", true);
            if (context == null) {
                return (short) 2157;
            }
            if (b0()) {
                if (C() == -1) {
                    a(System.currentTimeMillis());
                }
                if (z() > 0) {
                    intent.setFlags(603979776);
                }
            }
            Ha.f14324a.a(context, intent);
            return (short) 0;
        } catch (Exception e10) {
            A4 a44 = this.f15531j;
            if (a44 != null) {
                ((B4) a44).b("InMobiInterstitial", "Cannot show ad; SDK encountered an unexpected error");
            }
            Q4 q42 = Q4.f14590a;
            Q4.c.a(AbstractC1863x4.a(e10, "event"));
            return (short) 2154;
        }
    }

    @Override // com.inmobi.media.AbstractC1846w0
    public void c0() {
        if (C0()) {
            super.c0();
        }
    }

    public final void h(AbstractC1689k0 abstractC1689k0) {
        short b10 = b(t());
        if (abstractC1689k0 == null) {
            A4 a42 = this.f15531j;
            if (a42 != null) {
                ((B4) a42).b("InMobiInterstitial", "Listener was garbage collected.Unable to give callback");
            }
        } else if (b10 != 0) {
            a(true, b10);
        } else {
            abstractC1689k0.e();
        }
    }

    public final void i(AbstractC1689k0 abstractC1689k0) {
        if (abstractC1689k0 == null) {
            A4 a42 = this.f15531j;
            if (a42 != null) {
                ((B4) a42).b("InMobiInterstitial", "Listener was garbage collected. Unable to give callback");
            }
            a(true, FeatHdrRecord.sid);
        } else if (!G0()) {
            Z5.a((byte) 2, "InMobiInterstitial", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
            A4 a43 = this.f15531j;
            if (a43 != null) {
                ((B4) a43).b("i5", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
            }
            Z5.a((byte) 1, "i5", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
            a(true, FeatRecord.sid);
        } else {
            g(abstractC1689k0);
            d((byte) 6);
            if (!kotlin.jvm.internal.g.a("html", E()) && !kotlin.jvm.internal.g.a("htmlUrl", E())) {
                C1819u v10 = v();
                int hashCode = hashCode();
                C1582c5 c1582c5 = new C1582c5(this, abstractC1689k0);
                v10.getClass();
                C1819u.a(hashCode, c1582c5);
            } else if (W()) {
                b(abstractC1689k0, (short) 2153);
                r k10 = k();
                if (k10 != null) {
                    k10.b();
                }
            } else {
                h(abstractC1689k0);
            }
        }
    }

    public final void j(AbstractC1689k0 abstractC1689k0) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            i(abstractC1689k0);
        } else {
            ((ExecutorC1639g6) G3.f14269d.getValue()).f15096a.post(new n0.g(14, this, abstractC1689k0));
        }
    }

    @Override // com.inmobi.media.AbstractC1846w0
    public void j0() {
        if (p0()) {
            A4 a42 = this.f15531j;
            if (a42 != null) {
                ((B4) a42).a("i5", "renderAd without internet check");
            }
            H0();
            return;
        }
        A4 a43 = this.f15531j;
        if (a43 != null) {
            ((B4) a43).a("i5", "renderAd");
        }
        a(new C1638g5(this), new C1652h5(this));
    }

    @Override // com.inmobi.media.AbstractC1846w0
    public void k0() {
        super.k0();
        this.M = 0;
    }

    @Override // com.inmobi.media.AbstractC1846w0
    public void l(S9 s92) {
        super.l(s92);
        if (b0()) {
            int indexOf = this.f15528g.indexOf(s92);
            if (indexOf < A()) {
                A4 a42 = this.f15531j;
                if (a42 != null) {
                    StringBuilder e10 = androidx.appcompat.view.menu.d.e("Ignoring loaded ad with index ", indexOf, " as current rendering index is ");
                    e10.append(A());
                    ((B4) a42).a("i5", e10.toString());
                    return;
                }
                return;
            }
            B().add(Integer.valueOf(indexOf));
            for (int i10 = 0; i10 < indexOf; i10++) {
                if (this.f15528g.get(i10) != null) {
                    return;
                }
            }
            if (Q() == 2) {
                A4 a43 = this.f15531j;
                if (a43 != null) {
                    ((B4) a43).a("i5", b.a.c("Providing success based on index ", indexOf));
                }
                b((byte) 1);
                h(indexOf);
                K0();
            }
        } else if (Q() == 2) {
            b((byte) 1);
            K0();
        }
    }

    @Override // com.inmobi.media.AbstractC1846w0
    public String q() {
        return "int";
    }

    @Override // com.inmobi.media.AbstractC1846w0
    public void q0() {
        AbstractC1689k0 r4 = r();
        if (r4 != null) {
            A4 a42 = this.f15531j;
            if (a42 != null) {
                ((B4) a42).a("i5", "callback - onFetchSuccess");
            }
            e(r4);
            return;
        }
        b((short) 2188);
        A4 a43 = this.f15531j;
        if (a43 != null) {
            ((B4) a43).b("i5", "listener is null");
        }
    }

    @Override // com.inmobi.media.AbstractC1846w0
    public void r0() {
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).d("i5", "AdUnit " + this + " state - READY");
        }
        d((byte) 4);
        C1872y0 s4 = s();
        s4.getClass();
        s4.f15670i = SystemClock.elapsedRealtime();
        u0();
        z0();
        this.O.f15002a = true;
        AbstractC1689k0 r4 = r();
        if (r4 != null && r4.a()) {
            A4 a43 = this.f15531j;
            if (a43 != null) {
                ((B4) a43).a("i5", "signaling Success");
            }
            f(r4);
        }
    }

    @Override // com.inmobi.media.AbstractC1846w0
    public S9 w() {
        S9 w7 = super.w();
        if (this.N && w7 != null) {
            w7.e();
        }
        return w7;
    }

    @Override // com.inmobi.media.AbstractC1846w0
    public void c(String monetizationContext) {
        kotlin.jvm.internal.g.e(monetizationContext, "monetizationContext");
        super.c("activity");
    }

    @Override // com.inmobi.media.U9
    public synchronized void d(S9 renderView) {
        kotlin.jvm.internal.g.e(renderView, "renderView");
        super.d(renderView);
        Handler D = D();
        if (D != null) {
            D.post(new b7.g(this, 8));
        }
    }

    public final void a(C1588cb c1588cb) {
        kotlin.jvm.internal.g.e(c1588cb, "<set-?>");
        this.O = c1588cb;
    }

    @Override // com.inmobi.media.AbstractC1846w0
    public void a(byte[] bArr) {
        if (C0()) {
            super.a(bArr);
        }
    }

    public static final void a(C1666i5 this$0, AbstractC1689k0 abstractC1689k0) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        this$0.i(abstractC1689k0);
    }

    @Override // com.inmobi.media.U9
    public synchronized void e(S9 renderView) {
        kotlin.jvm.internal.g.e(renderView, "renderView");
        super.e(renderView);
        Handler D = D();
        if (D != null) {
            D.post(new androidx.appcompat.widget.z0(this, 11));
        }
    }

    public static final void a(C1666i5 this$0, S9 renderView, Context context) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        kotlin.jvm.internal.g.e(renderView, "$renderView");
        int indexOf = this$0.f15528g.indexOf(renderView);
        ArrayList list = this$0.f15528g;
        kotlin.jvm.internal.g.e(list, "list");
        if (indexOf < 0 || indexOf >= list.size()) {
            return;
        }
        short b10 = this$0.b(context);
        if (b10 != 0) {
            this$0.f(indexOf);
        }
        this$0.b(indexOf, b10 == 0);
        Handler D = this$0.D();
        if (D != null) {
            D.post(new qb.t0(this$0, indexOf, 0));
        }
    }

    @Override // com.inmobi.media.AbstractC1846w0, com.inmobi.media.K
    public void a(S9 renderView, Context context) {
        kotlin.jvm.internal.g.e(renderView, "renderView");
        A4 a42 = this.f15531j;
        if (a42 != null) {
            String e10 = AbstractC1846w0.e();
            kotlin.jvm.internal.g.d(e10, "<get-TAG>(...)");
            ((B4) a42).c(e10, "closeCurrentPodAd " + this);
        }
        if (b0()) {
            Integer higher = B().higher(Integer.valueOf(this.f15528g.indexOf(renderView)));
            if (higher != null) {
                a(higher.intValue(), renderView, context);
            } else {
                b();
            }
        }
    }

    @Override // com.inmobi.media.AbstractC1846w0
    public void a(AbstractC1689k0 abstractC1689k0) {
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("i5", "handleAdScreenDismissed");
        }
        if (Q() == 7) {
            int i10 = this.M - 1;
            this.M = i10;
            if (i10 == 1) {
                d((byte) 6);
                A4 a43 = this.f15531j;
                if (a43 != null) {
                    ((B4) a43).d("i5", "AdUnit " + this + " state - RENDERED");
                }
            }
        } else if (Q() == 6) {
            this.M--;
            A4 a44 = this.f15531j;
            if (a44 != null) {
                ((B4) a44).a("InMobiInterstitial", "Interstitial ad dismissed for placement id: " + I());
            }
            if (abstractC1689k0 != null) {
                abstractC1689k0.b();
                return;
            }
            A4 a45 = this.f15531j;
            if (a45 != null) {
                ((B4) a45).c("InMobiInterstitial", "Listener was garbage collected. Unable to give callback");
            }
        }
    }

    @Override // com.inmobi.media.AbstractC1846w0
    public void b(S9 s92, short s4) {
        super.b(s92, s4);
        if (b0()) {
            int indexOf = this.f15528g.indexOf(s92);
            boolean z10 = false;
            AbstractC1846w0.a(this, indexOf, false, 2, null);
            int size = this.f15528g.size();
            boolean z11 = true;
            boolean z12 = true;
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    z10 = z11;
                    i10 = -1;
                    break;
                }
                if (i10 != indexOf && this.f15528g.get(i10) != null) {
                    if (B().contains(Integer.valueOf(i10))) {
                        break;
                    }
                    z11 = false;
                    z12 = false;
                }
                i10++;
            }
            if (i10 != -1) {
                if (z12 && Q() == 2) {
                    b((byte) 1);
                    h(i10);
                    A4 a42 = this.f15531j;
                    if (a42 != null) {
                        StringBuilder a10 = A5.a("i5", "TAG", "Providing success based on currIndex ");
                        a10.append(A());
                        a10.append(" as ");
                        a10.append(indexOf);
                        a10.append(" failed");
                        ((B4) a42).a("i5", a10.toString());
                    }
                    K0();
                }
            } else if (z10 && Q() == 2) {
                A4 a43 = this.f15531j;
                if (a43 != null) {
                    ((B4) a43).a("InMobiInterstitial", "Failed to load the Interstitial markup in the WebView for placement id: " + I());
                }
                b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, s4);
            }
        } else if (Q() == 2) {
            A4 a44 = this.f15531j;
            if (a44 != null) {
                ((B4) a44).a("InMobiInterstitial", "Failed to load the Interstitial markup in the WebView for placement id: " + I());
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, s4);
        }
    }

    @Override // com.inmobi.media.AbstractC1846w0
    public void a(boolean z10, InMobiAdRequestStatus status) {
        String m10;
        kotlin.jvm.internal.g.e(status, "status");
        A4 a42 = this.f15531j;
        if (a42 != null) {
            ((B4) a42).c("i5", "onDidParseAfterFetch - parsingResult - " + z10);
        }
        super.a(z10, status);
        if (Q() == 2) {
            A4 a43 = this.f15531j;
            if (a43 != null) {
                ((B4) a43).a("InMobiInterstitial", "Interstitial ad successfully fetched for placement id: " + I());
            }
            if (kotlin.jvm.internal.g.a(E(), "inmobiJson") && (m10 = I().m()) != null) {
                S5 s52 = E9.f14227a;
                A4 a44 = this.f15531j;
                TelemetryConfig.LoggingConfig loggingConfig = E9.f14229d.getLoggingConfig();
                if (a44 != null) {
                    S5 logLevel = E9.a("intNative", m10, loggingConfig);
                    double b10 = E9.b("intNative", m10, loggingConfig);
                    C1889z4 c1889z4 = new C1889z4(logLevel, b10);
                    Objects.toString(c1889z4);
                    C9 c92 = ((B4) a44).f14141a;
                    if (c92 != null) {
                        Objects.toString(c1889z4);
                        Objects.toString(c92.f14171i);
                        if (!c92.f14171i.get()) {
                            U5 u52 = c92.f14167e;
                            u52.getClass();
                            kotlin.jvm.internal.g.e(logLevel, "logLevel");
                            u52.f14732a = logLevel;
                            c92.f14168f.f14174a = b10;
                        }
                    }
                }
            }
            q0();
        }
    }

    @Override // com.inmobi.media.AbstractC1846w0
    public void b(AbstractC1689k0 abstractC1689k0) {
        if (Q() == 6) {
            int i10 = this.M + 1;
            this.M = i10;
            if (i10 == 1) {
                A4 a42 = this.f15531j;
                if (a42 != null) {
                    ((B4) a42).a("InMobiInterstitial", "Successfully displayed Interstitial for placement id: " + I());
                }
                if (abstractC1689k0 != null) {
                    b((byte) 4);
                    d(abstractC1689k0);
                    return;
                }
                return;
            }
            d((byte) 7);
        } else if (Q() == 7) {
            this.M++;
        }
    }

    @Override // com.inmobi.media.AbstractC1846w0, com.inmobi.media.InterfaceC1645gc
    public void a(C1646h ad2, boolean z10, short s4) {
        kotlin.jvm.internal.g.e(ad2, "ad");
        if (!z10) {
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, s4);
            return;
        }
        try {
            super.a(ad2, z10, s4);
        } catch (IllegalStateException e10) {
            A4 a42 = this.f15531j;
            if (a42 != null) {
                StringBuilder a10 = A5.a("i5", "TAG", "Exception while onVastProcessCompleted : ");
                a10.append(e10.getMessage());
                ((B4) a42).b("i5", a10.toString());
            }
        }
        C1646h m10 = m();
        if (m10 == null) {
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 55);
        } else if (m10.G()) {
            b(true);
            V();
        } else {
            a(m10);
        }
    }

    public final void b(AbstractC1689k0 abstractC1689k0, short s4) {
        a(true, s4);
        d((byte) 0);
    }

    @Override // com.inmobi.media.AbstractC1846w0, com.inmobi.media.K
    public void b() {
        if (b0()) {
            A4 a42 = this.f15531j;
            if (a42 != null) {
                ((B4) a42).a("i5", "Closing the ad as closeAll is called");
            }
            Handler D = D();
            if (D != null) {
                D.post(new androidx.activity.b(this, 14));
            }
        }
    }

    public static final void b(C1666i5 this$0) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        A4 a42 = this$0.f15531j;
        if (a42 != null) {
            ((B4) a42).a("w0", "clearAdPods " + this$0);
        }
        if (this$0.A) {
            this$0.h();
            this$0.f15528g.clear();
            this$0.f15544w = 0;
            this$0.f15545x = 0;
            this$0.f15547z.clear();
        }
        A4 a43 = this$0.f15531j;
        if (a43 != null) {
            ((B4) a43).c("InMobiInterstitial", "Interstitial ad dismissed for placement id: " + this$0.I());
        }
        if (this$0.r() != null) {
            AbstractC1689k0 r4 = this$0.r();
            if (r4 != null) {
                r4.b();
                return;
            }
            return;
        }
        A4 a44 = this$0.f15531j;
        if (a44 != null) {
            ((B4) a44).c("InMobiInterstitial", "Listener was garbage collected. Unable to give callback");
        }
    }

    @Override // com.inmobi.media.AbstractC1846w0
    public void a(J placement, boolean z10) {
        kotlin.jvm.internal.g.e(placement, "placement");
        super.a(placement, z10);
        if (!z10) {
            if (kotlin.jvm.internal.g.a(I(), placement)) {
                if (2 == Q() || 4 == Q()) {
                    d((byte) 0);
                    A4 a42 = this.f15531j;
                    if (a42 != null) {
                        ((B4) a42).d("i5", "AdUnit " + this + " state - CREATED");
                    }
                    b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_NO_LONGER_AVAILABLE), false, (short) 0);
                }
            }
        } else if (kotlin.jvm.internal.g.a(I(), placement) && 2 == Q()) {
            A4 a43 = this.f15531j;
            if (a43 != null) {
                ((B4) a43).a("i5", "Asset are ready now");
            }
            if (a0()) {
                c(true);
                f();
                return;
            }
            r0();
        }
    }

    @Override // com.inmobi.media.AbstractC1846w0, com.inmobi.media.K
    public void a(int i10, S9 renderView, Context context) {
        S9 s92;
        kotlin.jvm.internal.g.e(renderView, "renderView");
        if (!b0()) {
            A4 a42 = this.f15531j;
            if (a42 != null) {
                ((B4) a42).a("i5", "Cannot show an pod ad as isPod is not set.");
            }
        } else if (B().contains(Integer.valueOf(i10)) && i10 > this.f15528g.indexOf(renderView) && i10 < this.f15528g.size() && this.f15528g.get(i10) != null && ((s92 = (S9) this.f15528g.get(i10)) == null || s92.f14678p0)) {
            if (context == null) {
                context = t();
            }
            super.a(i10, renderView, context);
            Handler D = D();
            if (D != null) {
                D.post(new androidx.emoji2.text.h(3, this, renderView, context));
            }
        } else {
            A4 a43 = this.f15531j;
            if (a43 != null) {
                ((B4) a43).a("i5", "Cannot show an pod ad with invalid index passed");
            }
            b(this.f15528g.indexOf(renderView), false);
        }
    }

    public static final void a(C1666i5 this$0, int i10) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        this$0.a(i10, false);
    }

    @Override // com.inmobi.media.AbstractC1846w0, com.inmobi.media.K
    public boolean a(S9 renderView) {
        kotlin.jvm.internal.g.e(renderView, "renderView");
        if (b0()) {
            return B().higher(Integer.valueOf(this.f15528g.indexOf(renderView))) != null;
        }
        return false;
    }

    @Override // com.inmobi.media.AbstractC1846w0, com.inmobi.media.InterfaceC1844vb
    public void a(byte b10) {
        if (b10 == 1) {
            if (b0()) {
                if (Q() == 2) {
                    if (B().isEmpty()) {
                        A4 a42 = this.f15531j;
                        if (a42 != null) {
                            ((B4) a42).b("i5", "RenderView time out, none of the ad provided success");
                        }
                        h();
                        b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2139);
                        return;
                    }
                    b((byte) 1);
                    A4 a43 = this.f15531j;
                    if (a43 != null) {
                        StringBuilder a10 = A5.a("i5", "TAG", "RenderView time out, providing success based on ");
                        a10.append(B().first());
                        ((B4) a43).a("i5", a10.toString());
                    }
                    Integer first = B().first();
                    kotlin.jvm.internal.g.d(first, "first(...)");
                    h(first.intValue());
                    K0();
                    int size = this.f15528g.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (!B().contains(Integer.valueOf(i10))) {
                            AbstractC1846w0.a(this, i10, false, 2, null);
                        }
                    }
                    return;
                }
                h();
                return;
            }
            super.a(b10);
            return;
        }
        super.a(b10);
    }
}
