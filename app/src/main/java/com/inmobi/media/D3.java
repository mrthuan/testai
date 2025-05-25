package com.inmobi.media;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class D3 extends Lambda implements cg.a {

    /* renamed from: a  reason: collision with root package name */
    public static final D3 f14190a = new D3();

    public D3() {
        super(0);
    }

    @Override // cg.a
    public final Object invoke() {
        int i10 = G3.f14267a;
        return new ScheduledThreadPoolExecutor(5, new I4("ExecutorProvider.high"));
    }
}
