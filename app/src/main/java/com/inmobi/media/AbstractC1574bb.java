package com.inmobi.media;

import android.os.Handler;

/* renamed from: com.inmobi.media.bb  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1574bb {

    /* renamed from: a  reason: collision with root package name */
    public static final tf.c f14970a = kotlin.a.a(C1560ab.f14938a);

    public static final void a(Runnable runnable, long j10) {
        kotlin.jvm.internal.g.e(runnable, "runnable");
        ((Handler) f14970a.getValue()).postDelayed(runnable, j10);
    }

    public static final void a(Runnable runnable) {
        kotlin.jvm.internal.g.e(runnable, "runnable");
        ((Handler) f14970a.getValue()).post(runnable);
    }
}
