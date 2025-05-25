package com.inmobi.media;

import java.util.LinkedList;

/* renamed from: com.inmobi.media.y0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1872y0 {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC1846w0 f15663a;

    /* renamed from: b  reason: collision with root package name */
    public final C1792rb f15664b;
    public long c;

    /* renamed from: d  reason: collision with root package name */
    public long f15665d;

    /* renamed from: e  reason: collision with root package name */
    public long f15666e;

    /* renamed from: f  reason: collision with root package name */
    public long f15667f;

    /* renamed from: g  reason: collision with root package name */
    public long f15668g;

    /* renamed from: h  reason: collision with root package name */
    public long f15669h;

    /* renamed from: i  reason: collision with root package name */
    public long f15670i;

    /* renamed from: j  reason: collision with root package name */
    public final C1859x0 f15671j;

    public C1872y0(AbstractC1846w0 adUnit) {
        kotlin.jvm.internal.g.e(adUnit, "adUnit");
        this.f15663a = adUnit;
        this.f15664b = new C1792rb();
        this.f15671j = new C1859x0(this);
    }

    public final String a() {
        C1577c0 y10;
        LinkedList<C1646h> f10;
        C1646h c1646h;
        String w7;
        AbstractC1846w0 abstractC1846w0 = this.f15663a;
        if (abstractC1846w0 == null || (y10 = abstractC1846w0.y()) == null || (f10 = y10.f()) == null || (c1646h = (C1646h) kotlin.collections.m.s0(f10)) == null || (w7 = c1646h.w()) == null) {
            return "";
        }
        return w7;
    }
}
