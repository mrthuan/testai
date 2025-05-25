package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.commons.core.configs.AdConfig;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.c1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1578c1 extends Gb {

    /* renamed from: d  reason: collision with root package name */
    public final JSONObject f14979d;

    /* renamed from: e  reason: collision with root package name */
    public final A4 f14980e;

    /* renamed from: f  reason: collision with root package name */
    public final WeakReference f14981f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1578c1(AbstractC1846w0 adUnit, JSONObject response, A4 a42) {
        super(adUnit, (byte) 4);
        kotlin.jvm.internal.g.e(adUnit, "adUnit");
        kotlin.jvm.internal.g.e(response, "response");
        this.f14979d = response;
        this.f14980e = a42;
        this.f14981f = new WeakReference(adUnit);
    }

    @Override // com.inmobi.media.Gb
    public final void a(Object obj) {
        AbstractC1689k0 r4;
        InMobiAdRequestStatus inMobiAdRequestStatus = (InMobiAdRequestStatus) obj;
        AbstractC1846w0 abstractC1846w0 = (AbstractC1846w0) this.f14981f.get();
        if (abstractC1846w0 == null || (r4 = abstractC1846w0.r()) == null) {
            return;
        }
        if (inMobiAdRequestStatus == null) {
            abstractC1846w0.d((byte) 2);
            A4 a42 = this.f14980e;
            if (a42 != null) {
                ((B4) a42).d("AuctionCloseWorker", "AdUnit " + abstractC1846w0 + " state - AVAILABLE");
            }
            abstractC1846w0.e(r4);
            return;
        }
        abstractC1846w0.b(inMobiAdRequestStatus, true, (short) 2182);
    }

    @Override // com.inmobi.media.AbstractRunnableC1690k1
    public final void c() {
        super.c();
        AbstractC1846w0 abstractC1846w0 = (AbstractC1846w0) this.f14981f.get();
        if (abstractC1846w0 == null) {
            return;
        }
        abstractC1846w0.b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOW_MEMORY), true, (short) 2181);
    }

    @Override // com.inmobi.media.AbstractRunnableC1690k1
    public final void a() {
        C1577c0 y10;
        AbstractC1846w0 abstractC1846w0 = (AbstractC1846w0) this.f14981f.get();
        InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR);
        if ((abstractC1846w0 != null ? abstractC1846w0.y() : null) == null) {
            b(inMobiAdRequestStatus);
            return;
        }
        try {
            AdConfig j10 = abstractC1846w0.j();
            if (j10 != null && (y10 = abstractC1846w0.y()) != null) {
                y10.a(this.f14979d, j10, this.f14980e);
            }
            b(null);
        } catch (Exception unused) {
            AbstractC1846w0.e();
            b(inMobiAdRequestStatus);
        }
    }
}
