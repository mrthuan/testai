package com.inmobi.media;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class F3 extends Lambda implements cg.a {

    /* renamed from: a  reason: collision with root package name */
    public static final F3 f14244a = new F3();

    public F3() {
        super(0);
    }

    @Override // cg.a
    public final Object invoke() {
        return new ScheduledThreadPoolExecutor(G3.f14267a, new I4("ExecutorProvider.normal"));
    }
}
