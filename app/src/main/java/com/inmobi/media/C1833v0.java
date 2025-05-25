package com.inmobi.media;

/* renamed from: com.inmobi.media.v0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1833v0 extends AbstractRunnableC1690k1 {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ AbstractC1846w0 f15505d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ String f15506e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f15507f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1833v0(AbstractC1846w0 abstractC1846w0, String str, String str2) {
        super(abstractC1846w0);
        this.f15505d = abstractC1846w0;
        this.f15506e = str;
        this.f15507f = str2;
    }

    @Override // com.inmobi.media.AbstractRunnableC1690k1
    public final void a() {
        AbstractC1846w0 abstractC1846w0 = (AbstractC1846w0) this.f15248b.get();
        if (abstractC1846w0 != null) {
            C1646h m10 = abstractC1846w0.m();
            if (m10 != null && kotlin.jvm.internal.g.a(m10.s(), this.f15506e)) {
                AbstractC1846w0.a(abstractC1846w0, m10, this.f15507f);
                A4 a42 = this.f15505d.f15531j;
                if (a42 != null) {
                    String e10 = AbstractC1846w0.e();
                    StringBuilder a10 = A5.a(e10, "<get-TAG>(...)", "Updated blob ");
                    a10.append(this.f15507f);
                    ((B4) a42).c(e10, a10.toString());
                    return;
                }
                return;
            }
            A4 a43 = this.f15505d.f15531j;
            if (a43 != null) {
                String e11 = AbstractC1846w0.e();
                kotlin.jvm.internal.g.d(e11, "<get-TAG>(...)");
                ((B4) a43).b(e11, "Impression ID is null for saveBlob");
            }
        }
    }
}
