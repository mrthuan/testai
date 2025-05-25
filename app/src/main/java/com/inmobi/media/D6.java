package com.inmobi.media;

import android.app.Activity;
import com.inmobi.commons.core.configs.AdConfig;
import java.lang.ref.WeakReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class D6 extends Thread {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference f14198a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ M6 f14199b;

    public D6(M6 m62, M6 originalContainer) {
        kotlin.jvm.internal.g.e(originalContainer, "originalContainer");
        this.f14199b = m62;
        this.f14198a = new WeakReference(originalContainer);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        String str;
        JSONArray jSONArray;
        boolean z10;
        String str2;
        M6 u7;
        Activity f10 = this.f14199b.f();
        if (f10 == null) {
            kotlin.jvm.internal.g.d(this.f14199b.f14470l, "access$getTAG$p(...)");
            return;
        }
        M6 m62 = (M6) this.f14198a.get();
        if (m62 != null && !m62.f14477s) {
            try {
                C1682j7 c1682j7 = m62.f14461b;
                try {
                    if ((c1682j7 instanceof C1682j7) && (jSONArray = c1682j7.f15221g) != null && !AbstractC1579c2.a(jSONArray)) {
                        kotlin.jvm.internal.g.d(this.f14199b.f14470l, "access$getTAG$p(...)");
                        JSONObject e10 = c1682j7.e();
                        if (e10 == null) {
                            return;
                        }
                        M6 m63 = this.f14199b;
                        byte b10 = m63.f14460a;
                        if (b10 == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        C1682j7 c1682j72 = new C1682j7(b10, e10, c1682j7, z10, m63.f14476r, m63.f14468j);
                        if (c1682j72.f()) {
                            String adImpressionId = this.f14199b.getImpressionId();
                            M6 m64 = this.f14199b;
                            AdConfig adConfig = m64.f14476r;
                            long j10 = m64.f14463e;
                            boolean z11 = m64.f14464f;
                            String creativeId = m64.getCreativeId();
                            M6 m65 = this.f14199b;
                            L5 l52 = m65.f14467i;
                            A4 a42 = m65.f14468j;
                            kotlin.jvm.internal.g.e(adImpressionId, "adImpressionId");
                            kotlin.jvm.internal.g.e(adConfig, "adConfig");
                            kotlin.jvm.internal.g.e(creativeId, "creativeId");
                            try {
                                if (c1682j72.c().contains("VIDEO")) {
                                    try {
                                        str2 = "access$getTAG$p(...)";
                                        u7 = new U7(f10, (byte) 0, c1682j72, adImpressionId, null, adConfig, j10, z11, creativeId, null, l52, a42);
                                    } catch (Exception e11) {
                                        e = e11;
                                        str2 = "access$getTAG$p(...)";
                                        str = str2;
                                        M6 m66 = this.f14199b;
                                        A4 a43 = m66.f14468j;
                                        if (a43 != null) {
                                            String str3 = m66.f14470l;
                                            kotlin.jvm.internal.g.d(str3, str);
                                            ((B4) a43).a(str3, "Encountered unexpected error in EndCardBuilder: ", e);
                                        }
                                        Q4 q42 = Q4.f14590a;
                                        Q4.c.a(AbstractC1863x4.a(e, "event"));
                                        return;
                                    }
                                } else {
                                    str2 = "access$getTAG$p(...)";
                                    u7 = new M6(f10, (byte) 0, c1682j72, adImpressionId, null, adConfig, j10, z11, creativeId, null, l52, a42);
                                }
                                M6 m67 = u7;
                                m67.G = m62.G;
                                m67.f14479u = m62;
                                M6 m68 = this.f14199b;
                                A4 a44 = m68.f14468j;
                                if (a44 != null) {
                                    String str4 = m68.f14470l;
                                    kotlin.jvm.internal.g.d(str4, str2);
                                    ((B4) a44).a(str4, "End-card container built successfully ...");
                                }
                                m62.I = m67;
                                return;
                            } catch (Exception e12) {
                                e = e12;
                            }
                        } else {
                            M6 m69 = this.f14199b;
                            A4 a45 = m69.f14468j;
                            if (a45 != null) {
                                String str5 = m69.f14470l;
                                kotlin.jvm.internal.g.d(str5, "access$getTAG$p(...)");
                                ((B4) a45).b(str5, "Invalid data model for end-card container! End card will not be shown ...");
                                return;
                            }
                            return;
                        }
                    }
                    kotlin.jvm.internal.g.d(this.f14199b.f14470l, "access$getTAG$p(...)");
                } catch (Exception e13) {
                    e = e13;
                }
            } catch (Exception e14) {
                e = e14;
                str = "access$getTAG$p(...)";
            }
        }
    }
}
