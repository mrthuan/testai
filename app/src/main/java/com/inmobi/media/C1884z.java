package com.inmobi.media;

import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.inmobi.media.z  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1884z {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference f15691a;

    /* renamed from: b  reason: collision with root package name */
    public final String f15692b;
    public final boolean c;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicBoolean f15693d;

    /* renamed from: e  reason: collision with root package name */
    public final String f15694e;

    /* renamed from: f  reason: collision with root package name */
    public A4 f15695f;

    public C1884z(WeakReference adUnitEventListener, String adtype, boolean z10) {
        kotlin.jvm.internal.g.e(adUnitEventListener, "adUnitEventListener");
        kotlin.jvm.internal.g.e(adtype, "adtype");
        this.f15691a = adUnitEventListener;
        this.f15692b = adtype;
        this.c = z10;
        this.f15693d = new AtomicBoolean(false);
        this.f15694e = String.valueOf(kotlin.jvm.internal.i.a(C1884z.class).b());
    }

    public final void a(C1780qb c1780qb) {
        C1792rb c1792rb;
        AtomicBoolean atomicBoolean;
        if (this.f15693d.getAndSet(true)) {
            A4 a42 = this.f15695f;
            if (a42 != null) {
                ((B4) a42).c(this.f15694e, "skipping as Impression is already Called");
            }
            if (c1780qb != null) {
                C1872y0 c1872y0 = c1780qb.f15394a;
                if (c1872y0 == null || (c1792rb = c1872y0.f15664b) == null || (atomicBoolean = c1792rb.f15421a) == null || !atomicBoolean.getAndSet(true)) {
                    c1780qb.a().put("networkType", C1566b3.q());
                    c1780qb.a().put("errorCode", (short) 2179);
                    LinkedHashMap a10 = c1780qb.a();
                    C1616eb c1616eb = C1616eb.f15034a;
                    C1616eb.b("AdImpressionSuccessful", a10, EnumC1686jb.f15238a);
                    return;
                }
                return;
            }
            return;
        }
        Ma ma2 = Ma.f14488a;
        String str = this.f15692b;
        Boolean valueOf = Boolean.valueOf(this.c);
        ma2.getClass();
        Ma.a(str, valueOf);
        AbstractC1689k0 abstractC1689k0 = (AbstractC1689k0) this.f15691a.get();
        if (abstractC1689k0 == null) {
            if (c1780qb != null) {
                c1780qb.c();
            }
        } else {
            abstractC1689k0.a(c1780qb);
        }
        A4 a43 = this.f15695f;
        if (a43 != null) {
            ((B4) a43).a(this.f15694e, "==== CHECKPOINT REACHED - IMPRESSION FIRED ====");
        }
        A4 a44 = this.f15695f;
        if (a44 != null) {
            ((B4) a44).b();
        }
    }
}
