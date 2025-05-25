package com.inmobi.media;

import kotlin.jvm.internal.Lambda;

/* renamed from: com.inmobi.media.t0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1807t0 extends Lambda implements cg.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AbstractC1846w0 f15454a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ byte[] f15455b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1807t0(AbstractC1846w0 abstractC1846w0, byte[] bArr) {
        super(0);
        this.f15454a = abstractC1846w0;
        this.f15455b = bArr;
    }

    @Override // cg.a
    public final Object invoke() {
        this.f15454a.d((byte) 1);
        A4 a42 = this.f15454a.f15531j;
        if (a42 != null) {
            String e10 = AbstractC1846w0.e();
            StringBuilder a10 = A5.a(e10, "<get-TAG>(...)", "AdUnit ");
            a10.append(this.f15454a);
            a10.append(" state - LOADING");
            ((B4) a42).d(e10, a10.toString());
        }
        A4 a43 = this.f15454a.f15531j;
        if (a43 != null) {
            String e11 = AbstractC1846w0.e();
            kotlin.jvm.internal.g.d(e11, "<get-TAG>(...)");
            ((B4) a43).c(e11, "starting load with response worker");
        }
        C1819u v10 = this.f15454a.v();
        int hashCode = this.f15454a.hashCode();
        AbstractC1846w0 abstractC1846w0 = this.f15454a;
        R8 H = abstractC1846w0.H();
        kotlin.jvm.internal.g.b(H);
        N5 n52 = new N5(abstractC1846w0, H, this.f15455b, this.f15454a.I().l(), this.f15454a.f15531j);
        v10.getClass();
        C1819u.a(hashCode, n52);
        return tf.d.f30009a;
    }
}
