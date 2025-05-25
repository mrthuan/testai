package com.inmobi.media;

import java.util.concurrent.Executors;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class B3 extends Lambda implements cg.a {

    /* renamed from: a  reason: collision with root package name */
    public static final B3 f14140a = new B3();

    public B3() {
        super(0);
    }

    @Override // cg.a
    public final Object invoke() {
        tf.c cVar = C3.f14158a;
        return Executors.newSingleThreadScheduledExecutor(new I4("C3"));
    }
}
