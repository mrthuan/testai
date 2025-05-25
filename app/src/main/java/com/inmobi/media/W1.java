package com.inmobi.media;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class W1 extends Lambda implements cg.l {

    /* renamed from: a  reason: collision with root package name */
    public static final W1 f14770a = new W1();

    public W1() {
        super(1);
    }

    @Override // cg.l
    public final Object invoke(Object obj) {
        AtomicBoolean atomicBoolean;
        H1 it = (H1) obj;
        kotlin.jvm.internal.g.e(it, "it");
        int i10 = it.f14310a;
        if (i10 != 1 && i10 != 2) {
            if (i10 != 10) {
                if (i10 != 11) {
                    kotlin.jvm.internal.g.d(Y1.f(), "access$getTAG$p(...)");
                } else if (!Boolean.parseBoolean(it.f14311b)) {
                    Y1.f14860a.g();
                }
            } else if (kotlin.jvm.internal.g.a("available", it.f14311b)) {
                Y1.f14860a.g();
            }
        } else {
            kotlin.jvm.internal.g.d(Y1.f(), "access$getTAG$p(...)");
            atomicBoolean = Y1.f14866h;
            atomicBoolean.set(false);
        }
        return tf.d.f30009a;
    }
}
