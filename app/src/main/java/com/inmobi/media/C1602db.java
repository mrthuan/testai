package com.inmobi.media;

import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.inmobi.media.db  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1602db extends Lambda implements cg.l {

    /* renamed from: a  reason: collision with root package name */
    public static final C1602db f15020a = new C1602db();

    public C1602db() {
        super(1);
    }

    @Override // cg.l
    public final Object invoke(Object obj) {
        H1 it = (H1) obj;
        kotlin.jvm.internal.g.e(it, "it");
        int i10 = it.f14310a;
        if (i10 != 1 && i10 != 2) {
            C1616eb c1616eb = C1616eb.f15034a;
        } else {
            C1616eb.f15036d.set(false);
            A3 a32 = C1616eb.f15038f;
            if (a32 != null) {
                ScheduledExecutorService scheduledExecutorService = a32.f14122h;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                }
                a32.f14122h = null;
                a32.f14119e.set(false);
                a32.f14120f.set(true);
                a32.f14121g.clear();
                a32.f14123i = null;
            }
            C1616eb.f15038f = null;
            C1616eb.f15041i = null;
            Ha.f().a(C1616eb.f15040h);
        }
        return tf.d.f30009a;
    }
}
