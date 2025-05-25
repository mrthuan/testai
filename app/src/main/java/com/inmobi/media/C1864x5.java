package com.inmobi.media;

import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.Lambda;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* renamed from: com.inmobi.media.x5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1864x5 extends Lambda implements cg.l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C1877y5 f15633a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1864x5(C1877y5 c1877y5) {
        super(1);
        this.f15633a = c1877y5;
    }

    @Override // cg.l
    public final Object invoke(Object obj) {
        H1 it = (H1) obj;
        kotlin.jvm.internal.g.e(it, "it");
        int i10 = it.f14310a;
        if (i10 != 1 && i10 != 2) {
            switch (i10) {
                case ShapeTypes.FLOW_CHART_EXTRACT /* 150 */:
                case ShapeTypes.FLOW_CHART_MERGE /* 151 */:
                case ShapeTypes.FLOW_CHART_OFFLINE_STORAGE /* 152 */:
                    Map map = it.c;
                    if (map != null && map.containsKey("data")) {
                        Object obj2 = it.c.get("data");
                        kotlin.jvm.internal.g.c(obj2, "null cannot be cast to non-null type com.inmobi.commons.core.incident.IncidentEvent");
                        this.f15633a.b((R4) obj2);
                        break;
                    }
                    break;
            }
        } else {
            C1877y5 c1877y5 = this.f15633a;
            A3 a32 = c1877y5.f15676b;
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
            Ha.f().a(c1877y5.f15677d);
        }
        return tf.d.f30009a;
    }
}
