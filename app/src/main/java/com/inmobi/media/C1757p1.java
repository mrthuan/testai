package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.inmobi.media.p1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1757p1 extends Lambda implements cg.l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C1770q1 f15369a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1757p1(C1770q1 c1770q1) {
        super(1);
        this.f15369a = c1770q1;
    }

    @Override // cg.l
    public final Object invoke(Object obj) {
        String str;
        EnumC1849w3 it = (EnumC1849w3) obj;
        kotlin.jvm.internal.g.e(it, "it");
        C1770q1 c1770q1 = this.f15369a;
        A4 a42 = c1770q1.f15531j;
        if (a42 != null) {
            str = c1770q1.M;
            kotlin.jvm.internal.g.d(str, "access$getTAG$p(...)");
            ((B4) a42).b(str, "loadWithRetry error - " + it);
        }
        this.f15369a.a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.NETWORK_UNREACHABLE), true, AbstractC1805sb.a(it));
        return tf.d.f30009a;
    }
}
