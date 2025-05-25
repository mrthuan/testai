package com.inmobi.media;

import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.inmobi.media.qb  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1780qb {

    /* renamed from: a  reason: collision with root package name */
    public final C1872y0 f15394a;

    /* renamed from: b  reason: collision with root package name */
    public final String f15395b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final String f15396d;

    /* renamed from: e  reason: collision with root package name */
    public String f15397e;

    public C1780qb(C1872y0 c1872y0, String str, String str2, String markupType) {
        kotlin.jvm.internal.g.e(markupType, "markupType");
        this.f15394a = c1872y0;
        this.f15395b = str;
        this.c = str2;
        this.f15396d = markupType;
    }

    public final LinkedHashMap a() {
        Boolean bool;
        String m10;
        String q5;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1872y0 c1872y0 = this.f15394a;
        if (c1872y0 != null && (q5 = c1872y0.f15663a.q()) != null) {
            linkedHashMap.put("adType", q5);
        }
        C1872y0 c1872y02 = this.f15394a;
        if (c1872y02 != null) {
            linkedHashMap.put("plId", Long.valueOf(c1872y02.f15663a.I().l()));
        }
        C1872y0 c1872y03 = this.f15394a;
        if (c1872y03 != null && (m10 = c1872y03.f15663a.I().m()) != null) {
            linkedHashMap.put("plType", m10);
        }
        C1872y0 c1872y04 = this.f15394a;
        if (c1872y04 != null) {
            C1577c0 y10 = c1872y04.f15663a.y();
            if (y10 != null) {
                bool = y10.o();
            } else {
                bool = null;
            }
            if (bool != null) {
                linkedHashMap.put("isRewarded", bool);
            }
        }
        String str = this.c;
        if (str != null) {
            linkedHashMap.put("creativeId", str);
        }
        String str2 = this.f15395b;
        if (str2 != null) {
            linkedHashMap.put("creativeType", str2);
        }
        linkedHashMap.put("markupType", this.f15396d);
        String str3 = this.f15397e;
        if (str3 != null) {
            linkedHashMap.put("trigger", str3);
            C1872y0 c1872y05 = this.f15394a;
            if (c1872y05 != null && c1872y05.a().length() > 0) {
                linkedHashMap.put("metadataBlob", this.f15394a.a());
            }
            return linkedHashMap;
        }
        kotlin.jvm.internal.g.i("triggerSource");
        throw null;
    }

    public final void b() {
        C1792rb c1792rb;
        AtomicBoolean atomicBoolean;
        C1872y0 c1872y0 = this.f15394a;
        if (c1872y0 != null && (c1792rb = c1872y0.f15664b) != null && (atomicBoolean = c1792rb.f15421a) != null && atomicBoolean.getAndSet(true)) {
            return;
        }
        a().put("networkType", C1566b3.q());
        a().put("errorCode", (short) 2180);
        LinkedHashMap a10 = a();
        C1616eb c1616eb = C1616eb.f15034a;
        C1616eb.b("AdImpressionSuccessful", a10, EnumC1686jb.f15238a);
    }

    public final void c() {
        C1792rb c1792rb;
        AtomicBoolean atomicBoolean;
        C1872y0 c1872y0 = this.f15394a;
        if (c1872y0 != null && (c1792rb = c1872y0.f15664b) != null && (atomicBoolean = c1792rb.f15421a) != null && atomicBoolean.getAndSet(true)) {
            return;
        }
        a().put("networkType", C1566b3.q());
        a().put("errorCode", (short) 2177);
        LinkedHashMap a10 = a();
        C1616eb c1616eb = C1616eb.f15034a;
        C1616eb.b("AdImpressionSuccessful", a10, EnumC1686jb.f15238a);
    }

    public final void d() {
        C1792rb c1792rb;
        AtomicBoolean atomicBoolean;
        C1872y0 c1872y0 = this.f15394a;
        if (c1872y0 != null && (c1792rb = c1872y0.f15664b) != null && (atomicBoolean = c1792rb.f15421a) != null && atomicBoolean.getAndSet(true)) {
            return;
        }
        a().put("networkType", C1566b3.q());
        a().put("errorCode", (short) 0);
        LinkedHashMap a10 = a();
        C1616eb c1616eb = C1616eb.f15034a;
        C1616eb.b("AdImpressionSuccessful", a10, EnumC1686jb.f15238a);
    }
}
