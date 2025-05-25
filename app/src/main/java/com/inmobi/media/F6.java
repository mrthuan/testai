package com.inmobi.media;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class F6 extends D1 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ M6 f14246a;

    public F6(M6 m62) {
        this.f14246a = m62;
    }

    @Override // com.inmobi.media.D1
    public final void a(N1 click) {
        kotlin.jvm.internal.g.e(click, "click");
        M6 m62 = this.f14246a;
        Map map = m62.Q;
        C1872y0 c1872y0 = map != null ? (C1872y0) map.get("AdImpressionSuccessful") : null;
        L5 l52 = m62.f14467i;
        C1780qb c1780qb = new C1780qb(c1872y0, l52 != null ? l52.f14428e : null, m62.getCreativeId(), "inmobiJson");
        c1780qb.f15397e = "nativeBeacon";
        C1820u0 c1820u0 = this.f14246a.f14480v;
        if (c1820u0 != null) {
            c1780qb.f15397e = "nativeBeacon";
            if (c1820u0.f15485a.Z()) {
                c1780qb.b();
            } else {
                c1820u0.f15485a.D.a(c1780qb);
            }
        }
    }

    @Override // com.inmobi.media.D1
    public final void a(N1 click, String error) {
        kotlin.jvm.internal.g.e(click, "click");
        kotlin.jvm.internal.g.e(error, "error");
        M6 m62 = this.f14246a;
        Map map = m62.Q;
        C1872y0 c1872y0 = map != null ? (C1872y0) map.get("AdImpressionSuccessful") : null;
        L5 l52 = m62.f14467i;
        C1780qb c1780qb = new C1780qb(c1872y0, l52 != null ? l52.f14428e : null, m62.getCreativeId(), "inmobiJson");
        c1780qb.f15397e = "nativeBeacon";
        LinkedHashMap a10 = c1780qb.a();
        a10.put("networkType", C1566b3.q());
        a10.put("errorCode", (short) 2178);
        a10.put("reason", error);
        C1616eb c1616eb = C1616eb.f15034a;
        C1616eb.b("AdImpressionSuccessful", a10, EnumC1686jb.f15238a);
    }
}
