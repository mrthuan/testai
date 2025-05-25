package com.inmobi.media;

/* renamed from: com.inmobi.media.u7  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1827u7 implements InterfaceC1557a8 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C1866x7 f15494a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ W7 f15495b;

    public C1827u7(C1866x7 c1866x7, W7 w7) {
        this.f15494a = c1866x7;
        this.f15495b = w7;
    }

    public final void a(byte b10) {
        M6 m62 = this.f15494a.f15636b;
        if (!m62.f14477s && (m62 instanceof U7) && b10 != 4) {
            try {
                if (b10 == 0) {
                    AbstractC1701kc abstractC1701kc = ((U7) m62).f14473o;
                    if (abstractC1701kc != null) {
                        abstractC1701kc.a((byte) 5);
                    }
                } else if (b10 == 1) {
                    ((U7) m62).g(this.f15495b);
                } else if (b10 == 2) {
                    ((U7) m62).f(this.f15495b);
                } else if (b10 == 3) {
                    ((U7) m62).h(this.f15495b);
                } else if (b10 == 5) {
                    ((U7) m62).d(this.f15495b);
                }
            } catch (Exception e10) {
                C1866x7 c1866x7 = this.f15494a;
                A4 a42 = c1866x7.f15639f;
                if (a42 != null) {
                    String str = c1866x7.f15640g;
                    kotlin.jvm.internal.g.d(str, "access$getTAG$p(...)");
                    StringBuilder sb2 = new StringBuilder("SDK encountered unexpected error in handling (");
                    sb2.append((int) b10);
                    sb2.append(") event; ");
                    ((B4) a42).b(str, Cc.a(e10, sb2));
                }
                Q4 q42 = Q4.f14590a;
                Q4.c.a(AbstractC1863x4.a(e10, "event"));
            }
        }
    }
}
