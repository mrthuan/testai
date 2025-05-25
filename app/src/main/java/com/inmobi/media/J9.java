package com.inmobi.media;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class J9 extends Lambda implements cg.a {

    /* renamed from: a  reason: collision with root package name */
    public static final J9 f14382a = new J9();

    public J9() {
        super(0);
    }

    @Override // cg.a
    public final Object invoke() {
        ConcurrentHashMap concurrentHashMap = C1851w5.f15578b;
        Context d10 = Ha.d();
        kotlin.jvm.internal.g.b(d10);
        return Boolean.valueOf(AbstractC1838v5.a(d10, "default").f15579a.getBoolean("enableImraidLogs", false));
    }
}
