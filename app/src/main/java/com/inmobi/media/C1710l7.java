package com.inmobi.media;

import kotlin.jvm.internal.Lambda;

/* renamed from: com.inmobi.media.l7  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1710l7 extends Lambda implements cg.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f15285a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C1724m7 f15286b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1710l7(C1724m7 c1724m7, String str) {
        super(0);
        this.f15285a = str;
        this.f15286b = c1724m7;
    }

    @Override // cg.a
    public final Object invoke() {
        C1674j b10 = AbstractC1882ya.a().b(this.f15285a);
        P3 p32 = null;
        if (b10 == null) {
            return null;
        }
        C1724m7 c1724m7 = this.f15286b;
        try {
            String str = b10.c;
            if (str == null) {
                return null;
            }
            p32 = C1724m7.a(c1724m7, str);
            tf.d dVar = tf.d.f30009a;
            return p32;
        } catch (Exception e10) {
            kotlin.jvm.internal.g.d(c1724m7.f15316x, "access$getTAG$p(...)");
            Q4 q42 = Q4.f14590a;
            Q4.c.a(AbstractC1863x4.a(e10, "event"));
            tf.d dVar2 = tf.d.f30009a;
            return p32;
        }
    }
}
