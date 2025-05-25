package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class N3 extends Gb {

    /* renamed from: d  reason: collision with root package name */
    public final long f14517d;

    /* renamed from: e  reason: collision with root package name */
    public final A4 f14518e;

    /* renamed from: f  reason: collision with root package name */
    public final WeakReference f14519f;

    /* renamed from: g  reason: collision with root package name */
    public C1845w f14520g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N3(AbstractC1846w0 adUnit, long j10, A4 a42) {
        super(adUnit, (byte) 2);
        kotlin.jvm.internal.g.e(adUnit, "adUnit");
        this.f14517d = j10;
        this.f14518e = a42;
        this.f14519f = new WeakReference(adUnit);
    }

    @Override // com.inmobi.media.Gb
    public final void a(Object obj) {
        byte[] bArr = (byte[]) obj;
        AbstractC1846w0 abstractC1846w0 = (AbstractC1846w0) this.f14519f.get();
        if (abstractC1846w0 == null) {
            return;
        }
        if (this.f14520g != null) {
            A4 a42 = this.f14518e;
            if (a42 != null) {
                ((B4) a42).d("GetSignalsWorker", "AdUnit " + abstractC1846w0 + " state - FAILED");
            }
            abstractC1846w0.d((byte) 3);
        }
        AbstractC1689k0 r4 = abstractC1846w0.r();
        if (r4 == null) {
            return;
        }
        C1845w c1845w = this.f14520g;
        if (c1845w != null) {
            A4 a43 = this.f14518e;
            if (a43 != null) {
                ((B4) a43).a("GetSignalsWorker", "get signals failed", c1845w);
            }
            abstractC1846w0.a(c1845w.f15522b, this.f14517d);
            r4.b(new InMobiAdRequestStatus(c1845w.f15521a.getStatusCode()));
        } else if (bArr == null) {
            abstractC1846w0.d((byte) 3);
            A4 a44 = this.f14518e;
            if (a44 != null) {
                ((B4) a44).d("GetSignalsWorker", "AdUnit " + this + " state - FAILED");
            }
            A4 a45 = this.f14518e;
            if (a45 != null) {
                ((B4) a45).b("GetSignalsWorker", "no request created - fail");
            }
            abstractC1846w0.a(13, this.f14517d);
            r4.b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
        } else {
            abstractC1846w0.b(this.f14517d);
            r4.a(bArr);
            A4 a46 = this.f14518e;
            if (a46 != null) {
                ((B4) a46).a("GetSignalsWorker", "callback - onRequestCreated");
            }
        }
    }

    @Override // com.inmobi.media.AbstractRunnableC1690k1
    public final void c() {
        super.c();
        AbstractC1846w0 abstractC1846w0 = (AbstractC1846w0) this.f14519f.get();
        if (abstractC1846w0 == null) {
            return;
        }
        AbstractC1689k0 r4 = abstractC1846w0.r();
        A4 a42 = this.f14518e;
        if (a42 != null) {
            ((B4) a42).a("GetSignalsWorker", "onOOM");
        }
        if (r4 != null) {
            r4.b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOW_MEMORY));
        }
    }

    @Override // com.inmobi.media.AbstractRunnableC1690k1
    public final void a() {
        AbstractC1846w0 abstractC1846w0 = (AbstractC1846w0) this.f14519f.get();
        if ((abstractC1846w0 != null ? abstractC1846w0.H() : null) == null) {
            A4 a42 = this.f14518e;
            if (a42 != null) {
                ((B4) a42).b("GetSignalsWorker", "OAManager is null");
            }
            b(null);
        } else if (abstractC1846w0.r() == null) {
            A4 a43 = this.f14518e;
            if (a43 != null) {
                ((B4) a43).b("GetSignalsWorker", "listener is null");
            }
            b(null);
        } else {
            try {
                R8 H = abstractC1846w0.H();
                b(H != null ? new S8(H.f14617a).a() : null);
            } catch (C1845w e10) {
                this.f14520g = e10;
                b(null);
            }
        }
    }
}
