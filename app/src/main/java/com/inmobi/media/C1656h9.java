package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.ListIterator;

/* renamed from: com.inmobi.media.h9  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1656h9 extends Gb {

    /* renamed from: d  reason: collision with root package name */
    public final C1646h f15133d;

    /* renamed from: e  reason: collision with root package name */
    public final C1577c0 f15134e;

    /* renamed from: f  reason: collision with root package name */
    public InMobiAdRequestStatus f15135f;

    /* renamed from: g  reason: collision with root package name */
    public final A4 f15136g;

    /* renamed from: h  reason: collision with root package name */
    public final WeakReference f15137h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1656h9(AbstractC1846w0 adUnit, C1646h ad2, C1577c0 adSet, InMobiAdRequestStatus status, A4 a42) {
        super(adUnit, (byte) 1);
        kotlin.jvm.internal.g.e(adUnit, "adUnit");
        kotlin.jvm.internal.g.e(ad2, "ad");
        kotlin.jvm.internal.g.e(adSet, "adSet");
        kotlin.jvm.internal.g.e(status, "status");
        this.f15133d = ad2;
        this.f15134e = adSet;
        this.f15135f = status;
        this.f15136g = a42;
        this.f15137h = new WeakReference(adUnit);
    }

    @Override // com.inmobi.media.Gb
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        a(((Boolean) obj).booleanValue());
    }

    @Override // com.inmobi.media.AbstractRunnableC1690k1
    public final void c() {
        super.c();
        this.f15135f = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOW_MEMORY);
        a(false);
    }

    public final void a(boolean z10) {
        A4 a42 = this.f15136g;
        if (a42 != null) {
            ((B4) a42).c("ParseAdResponseWorker", "onComplete result - " + z10);
        }
        AbstractC1846w0 abstractC1846w0 = (AbstractC1846w0) this.f15137h.get();
        if (abstractC1846w0 != null) {
            A4 a43 = this.f15136g;
            if (a43 != null) {
                ((B4) a43).c("ParseAdResponseWorker", "updating vitals in logger");
            }
            abstractC1846w0.a(z10, this.f15135f);
            return;
        }
        A4 a44 = this.f15136g;
        if (a44 != null) {
            ((B4) a44).b("ParseAdResponseWorker", "onComplete - adunit is null");
        }
    }

    @Override // com.inmobi.media.AbstractRunnableC1690k1
    public final void a() {
        A4 a42 = this.f15136g;
        if (a42 != null) {
            ((B4) a42).c("ParseAdResponseWorker", "execute task");
        }
        AbstractC1846w0 abstractC1846w0 = (AbstractC1846w0) this.f15137h.get();
        if (abstractC1846w0 == null) {
            A4 a43 = this.f15136g;
            if (a43 != null) {
                ((B4) a43).b("ParseAdResponseWorker", "adUnit is null. fail.");
            }
            b(Boolean.FALSE);
        } else if (this.f15134e.n()) {
            A4 a44 = this.f15136g;
            if (a44 != null) {
                ((B4) a44).c("ParseAdResponseWorker", "parsing for ad pods");
            }
            LinkedList<C1646h> f10 = this.f15134e.f();
            C1646h first = f10.getFirst();
            kotlin.jvm.internal.g.b(first);
            if (abstractC1846w0.a(first, 0, true)) {
                A4 a45 = this.f15136g;
                if (a45 != null) {
                    ((B4) a45).c("ParseAdResponseWorker", "parse success for ad index 0");
                }
                ListIterator<C1646h> listIterator = f10.listIterator(1);
                kotlin.jvm.internal.g.d(listIterator, "listIterator(...)");
                while (listIterator.hasNext()) {
                    C1646h next = listIterator.next();
                    if (!abstractC1846w0.a(next, f10.indexOf(next), false)) {
                        A4 a46 = this.f15136g;
                        if (a46 != null) {
                            ((B4) a46).b("ParseAdResponseWorker", "parseAdResponse fail for index - " + f10.indexOf(next));
                        }
                        listIterator.remove();
                    } else {
                        A4 a47 = this.f15136g;
                        if (a47 != null) {
                            ((B4) a47).c("ParseAdResponseWorker", "parseAdResponse success for index - " + f10.indexOf(next));
                        }
                    }
                }
                b(Boolean.TRUE);
                return;
            }
            A4 a48 = this.f15136g;
            if (a48 != null) {
                ((B4) a48).b("ParseAdResponseWorker", "didParseAdResponseAndExtractData failed");
            }
            b(Boolean.FALSE);
        } else {
            A4 a49 = this.f15136g;
            if (a49 != null) {
                ((B4) a49).c("ParseAdResponseWorker", "parsing for single ad");
            }
            b(Boolean.valueOf(abstractC1846w0.a(this.f15133d, 0, true)));
        }
    }
}
