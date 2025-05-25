package com.inmobi.media;

import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class Z0 extends Lambda implements cg.l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C1550a1 f14899a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z0(C1550a1 c1550a1) {
        super(1);
        this.f14899a = c1550a1;
    }

    @Override // cg.l
    public final Object invoke(Object obj) {
        H8 response = (H8) obj;
        kotlin.jvm.internal.g.e(response, "response");
        if (response.b()) {
            A4 a42 = this.f14899a.f14929a.f15360a.f15372d;
            if (a42 != null) {
                String str = AbstractC1774q5.f15390a;
                kotlin.jvm.internal.g.d(str, "access$getTAG$p(...)");
                ((B4) a42).b(str, "asyncPing Failed");
            }
        } else {
            A4 a43 = this.f14899a.f14929a.f15360a.f15372d;
            if (a43 != null) {
                String str2 = AbstractC1774q5.f15390a;
                kotlin.jvm.internal.g.d(str2, "access$getTAG$p(...)");
                ((B4) a43).a(str2, "asyncPing Successful");
            }
        }
        return tf.d.f30009a;
    }
}
