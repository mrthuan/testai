package com.inmobi.media;

/* loaded from: classes2.dex */
public final class J6 extends AbstractRunnableC1690k1 {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ M6 f14378d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J6(M6 m62) {
        super(m62);
        this.f14378d = m62;
    }

    @Override // com.inmobi.media.AbstractRunnableC1690k1
    public final void a() {
        M6 m62 = this.f14378d;
        if (m62.f14460a == 0 && m62.f14461b.f15218d && !m62.f14477s) {
            kotlin.jvm.internal.g.d(m62.f14470l, "access$getTAG$p(...)");
            this.f14378d.m();
        }
    }
}
