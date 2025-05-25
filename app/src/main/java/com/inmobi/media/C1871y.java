package com.inmobi.media;

import java.util.LinkedHashMap;

/* renamed from: com.inmobi.media.y  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1871y extends D1 {

    /* renamed from: a  reason: collision with root package name */
    public final C1884z f15661a;

    /* renamed from: b  reason: collision with root package name */
    public final C1780qb f15662b;

    public C1871y(C1884z adImpressionCallbackHandler, C1780qb c1780qb) {
        kotlin.jvm.internal.g.e(adImpressionCallbackHandler, "adImpressionCallbackHandler");
        this.f15661a = adImpressionCallbackHandler;
        this.f15662b = c1780qb;
    }

    @Override // com.inmobi.media.D1
    public final void a(N1 click) {
        kotlin.jvm.internal.g.e(click, "click");
        this.f15661a.a(this.f15662b);
    }

    @Override // com.inmobi.media.D1
    public final void a(N1 click, String error) {
        kotlin.jvm.internal.g.e(click, "click");
        kotlin.jvm.internal.g.e(error, "error");
        C1780qb c1780qb = this.f15662b;
        if (c1780qb != null) {
            LinkedHashMap a10 = c1780qb.a();
            a10.put("networkType", C1566b3.q());
            a10.put("errorCode", (short) 2178);
            a10.put("reason", error);
            C1616eb c1616eb = C1616eb.f15034a;
            C1616eb.b("AdImpressionSuccessful", a10, EnumC1686jb.f15238a);
        }
    }
}
