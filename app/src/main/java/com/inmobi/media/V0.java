package com.inmobi.media;

import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class V0 extends Lambda implements cg.l {

    /* renamed from: a  reason: collision with root package name */
    public static final V0 f14746a = new V0();

    public V0() {
        super(1);
    }

    @Override // cg.l
    public final Object invoke(Object obj) {
        H1 event = (H1) obj;
        kotlin.jvm.internal.g.e(event, "event");
        int i10 = event.f14310a;
        if (i10 != 1 && i10 != 2) {
            if (i10 != 10) {
                X0 x02 = X0.f14813a;
            } else if (kotlin.jvm.internal.g.a("available", event.f14311b)) {
                X0 x03 = X0.f14813a;
                if (!X0.f14821j.get()) {
                    x03.c();
                }
            } else {
                X0.d();
            }
        } else {
            X0.f14824m.set(false);
        }
        return tf.d.f30009a;
    }
}
