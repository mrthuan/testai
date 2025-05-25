package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.inmobi.media.s0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1794s0 extends Lambda implements cg.l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AbstractC1846w0 f15427a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1794s0(AbstractC1846w0 abstractC1846w0) {
        super(1);
        this.f15427a = abstractC1846w0;
    }

    @Override // cg.l
    public final Object invoke(Object obj) {
        EnumC1849w3 it = (EnumC1849w3) obj;
        kotlin.jvm.internal.g.e(it, "it");
        A4 a42 = this.f15427a.f15531j;
        if (a42 != null) {
            String e10 = AbstractC1846w0.e();
            kotlin.jvm.internal.g.d(e10, "<get-TAG>(...)");
            ((B4) a42).b(e10, "load with retry failed - max retry reached - No network");
        }
        this.f15427a.a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.NETWORK_UNREACHABLE), true, AbstractC1805sb.a(it));
        return tf.d.f30009a;
    }
}
