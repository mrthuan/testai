package com.inmobi.media;

import android.os.SystemClock;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.commons.core.configs.RootConfig;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;

/* renamed from: com.inmobi.media.x  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1858x extends Gb {

    /* renamed from: d  reason: collision with root package name */
    public final A4 f15614d;

    /* renamed from: e  reason: collision with root package name */
    public final WeakReference f15615e;

    /* renamed from: f  reason: collision with root package name */
    public C1845w f15616f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1858x(AbstractC1846w0 adUnit, A4 a42) {
        super(adUnit, (byte) 0);
        kotlin.jvm.internal.g.e(adUnit, "adUnit");
        this.f15614d = a42;
        this.f15615e = new WeakReference(adUnit);
    }

    @Override // com.inmobi.media.Gb
    public final void a(Object obj) {
        C1577c0 c1577c0 = (C1577c0) obj;
        AbstractC1846w0 abstractC1846w0 = (AbstractC1846w0) this.f15615e.get();
        if (abstractC1846w0 == null) {
            return;
        }
        abstractC1846w0.b((byte) 0);
        if (this.f15616f == null) {
            if (c1577c0 == null) {
                abstractC1846w0.a(abstractC1846w0.I(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), (short) 0);
                return;
            } else if (c1577c0.m()) {
                abstractC1846w0.c(c1577c0);
                return;
            } else {
                abstractC1846w0.d(c1577c0);
                return;
            }
        }
        J I = abstractC1846w0.I();
        C1845w c1845w = this.f15616f;
        kotlin.jvm.internal.g.b(c1845w);
        InMobiAdRequestStatus inMobiAdRequestStatus = c1845w.f15521a;
        C1845w c1845w2 = this.f15616f;
        kotlin.jvm.internal.g.b(c1845w2);
        abstractC1846w0.a(I, inMobiAdRequestStatus, c1845w2.f15522b);
    }

    @Override // com.inmobi.media.AbstractRunnableC1690k1
    public final void c() {
        super.c();
        AbstractC1846w0 abstractC1846w0 = (AbstractC1846w0) this.f15615e.get();
        if (abstractC1846w0 == null) {
            return;
        }
        abstractC1846w0.b((byte) 0);
        abstractC1846w0.a(abstractC1846w0.I(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOW_MEMORY), (short) 2117);
    }

    @Override // com.inmobi.media.AbstractRunnableC1690k1
    public final void a() {
        A4 a42 = this.f15614d;
        if (a42 != null) {
            ((B4) a42).c("AdFetcherTask", "executeTask " + this);
        }
        AbstractC1846w0 abstractC1846w0 = (AbstractC1846w0) this.f15615e.get();
        if (abstractC1846w0 == null) {
            A4 a43 = this.f15614d;
            if (a43 != null) {
                ((B4) a43).b("AdFetcherTask", "adUnit is null. fail");
            }
            this.f15616f = new C1845w(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), (short) 2111);
            b(null);
            return;
        }
        LinkedHashMap linkedHashMap = C1732n2.f15334a;
        if (!((RootConfig) AbstractC1773q4.a("root", "null cannot be cast to non-null type com.inmobi.commons.core.configs.RootConfig", null)).isMonetizationDisabled()) {
            C1872y0 s4 = abstractC1846w0.s();
            s4.getClass();
            s4.f15667f = SystemClock.elapsedRealtime();
            try {
                A4 a44 = this.f15614d;
                if (a44 != null) {
                    ((B4) a44).a("AdFetcherTask", "getting ad from store");
                }
                b(abstractC1846w0.p().a(abstractC1846w0.h0(), abstractC1846w0.F()));
                return;
            } catch (C1845w e10) {
                kotlin.jvm.internal.g.d(AbstractC1846w0.e(), "<get-TAG>(...)");
                this.f15616f = e10;
                b(null);
                return;
            }
        }
        A4 a45 = this.f15614d;
        if (a45 != null) {
            ((B4) a45).b("AdFetcherTask", "SDK will not perform this load operation as monetization has been disabled. Please contact InMobi for further info.");
        }
        this.f15616f = new C1845w(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MONETIZATION_DISABLED), (short) 2012);
        b(null);
    }
}
