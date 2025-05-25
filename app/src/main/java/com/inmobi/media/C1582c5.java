package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import java.lang.ref.WeakReference;

/* renamed from: com.inmobi.media.c5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1582c5 extends Gb {

    /* renamed from: d  reason: collision with root package name */
    public final WeakReference f14983d;

    /* renamed from: e  reason: collision with root package name */
    public final WeakReference f14984e;

    /* renamed from: f  reason: collision with root package name */
    public short f14985f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1582c5(C1666i5 adUnit, AbstractC1689k0 eventListener) {
        super(adUnit, (byte) 5);
        kotlin.jvm.internal.g.e(adUnit, "adUnit");
        kotlin.jvm.internal.g.e(eventListener, "eventListener");
        this.f14983d = new WeakReference(adUnit);
        this.f14984e = new WeakReference(eventListener);
    }

    @Override // com.inmobi.media.Gb
    public final void a(Object obj) {
        AbstractC1689k0 abstractC1689k0;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C1666i5 c1666i5 = (C1666i5) this.f14983d.get();
        if (c1666i5 == null || (abstractC1689k0 = (AbstractC1689k0) this.f14984e.get()) == null) {
            return;
        }
        if (booleanValue) {
            r k10 = c1666i5.k();
            S9 x4 = c1666i5.x();
            if (x4 != null) {
                if (k10 instanceof M6) {
                    M6 m62 = (M6) k10;
                    m62.G = x4;
                    m62.J = c1666i5.T();
                } else {
                    c1666i5.b(abstractC1689k0, (short) 84);
                }
            }
            c1666i5.h(abstractC1689k0);
            return;
        }
        short s4 = this.f14985f;
        if (s4 != 0) {
            c1666i5.a(this.f14984e, s4, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
        } else {
            c1666i5.b(abstractC1689k0, (short) 85);
        }
    }

    @Override // com.inmobi.media.AbstractRunnableC1690k1
    public final void c() {
        super.c();
        C1666i5 c1666i5 = (C1666i5) this.f14983d.get();
        if (c1666i5 != null && ((AbstractC1689k0) this.f14984e.get()) != null) {
            c1666i5.a(this.f14984e, (short) 40, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOW_MEMORY));
        }
    }

    @Override // com.inmobi.media.AbstractRunnableC1690k1
    public final void a() {
        C1666i5 c1666i5 = (C1666i5) this.f14983d.get();
        AbstractC1689k0 abstractC1689k0 = (AbstractC1689k0) this.f14984e.get();
        if (c1666i5 != null && abstractC1689k0 != null) {
            if (c1666i5.D0()) {
                short c = c1666i5.c(abstractC1689k0);
                this.f14985f = c;
                b(Boolean.valueOf(c == 0));
                return;
            }
            b(Boolean.FALSE);
            return;
        }
        b(Boolean.FALSE);
    }
}
