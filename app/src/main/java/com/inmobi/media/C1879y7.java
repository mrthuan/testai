package com.inmobi.media;

import android.os.SystemClock;
import com.inmobi.ads.InMobiAdRequestStatus;
import java.lang.ref.WeakReference;

/* renamed from: com.inmobi.media.y7  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1879y7 extends Gb {

    /* renamed from: d  reason: collision with root package name */
    public final WeakReference f15683d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1879y7(V6 adUnit) {
        super(adUnit, (byte) 6);
        kotlin.jvm.internal.g.e(adUnit, "adUnit");
        this.f15683d = new WeakReference(adUnit);
    }

    @Override // com.inmobi.media.Gb
    public final void a(Object obj) {
        short shortValue = ((Number) obj).shortValue();
        AbstractC1846w0 abstractC1846w0 = (V6) this.f15683d.get();
        if (abstractC1846w0 == null) {
            return;
        }
        if (shortValue == 0) {
            if (2 == abstractC1846w0.Q()) {
                abstractC1846w0.d((byte) 4);
                r k10 = abstractC1846w0.k();
                S9 x4 = abstractC1846w0.x();
                AbstractC1689k0 r4 = abstractC1846w0.r();
                if (!(k10 instanceof M6)) {
                    if (r4 != null) {
                        r4.a(abstractC1846w0, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                        return;
                    }
                    return;
                }
                M6 m62 = (M6) k10;
                m62.G = x4;
                m62.J = abstractC1846w0.T();
                C1872y0 s4 = abstractC1846w0.s();
                s4.getClass();
                s4.f15670i = SystemClock.elapsedRealtime();
                abstractC1846w0.u0();
                abstractC1846w0.z0();
                if (r4 != null) {
                    abstractC1846w0.f(r4);
                    return;
                }
                return;
            }
            return;
        }
        abstractC1846w0.a(new WeakReference<>(abstractC1846w0.r()), shortValue, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
    }

    @Override // com.inmobi.media.AbstractRunnableC1690k1
    public final void c() {
        AbstractC1689k0 r4;
        super.c();
        AbstractC1846w0 abstractC1846w0 = (V6) this.f15683d.get();
        if (abstractC1846w0 != null && (r4 = abstractC1846w0.r()) != null) {
            r4.a(abstractC1846w0, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOW_MEMORY));
        }
    }

    @Override // com.inmobi.media.AbstractRunnableC1690k1
    public final void a() {
        V6 v62 = (V6) this.f15683d.get();
        if (v62 == null) {
            b((short) 13);
            return;
        }
        AbstractC1689k0 r4 = v62.r();
        if (r4 != null) {
            b(Short.valueOf(v62.c(r4)));
        }
    }
}
