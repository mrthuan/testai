package com.inmobi.media;

import kotlin.jvm.internal.Lambda;

/* renamed from: com.inmobi.media.o1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1744o1 extends Lambda implements cg.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C1770q1 f15357a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1744o1(C1770q1 c1770q1) {
        super(0);
        this.f15357a = c1770q1;
    }

    @Override // cg.a
    public final Object invoke() {
        String str;
        C1770q1 c1770q1 = this.f15357a;
        A4 a42 = c1770q1.f15531j;
        if (a42 != null) {
            str = c1770q1.M;
            kotlin.jvm.internal.g.d(str, "access$getTAG$p(...)");
            ((B4) a42).a(str, "loadWithRetry success");
        }
        this.f15357a.H0();
        return tf.d.f30009a;
    }
}
