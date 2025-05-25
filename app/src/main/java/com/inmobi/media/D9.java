package com.inmobi.media;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Lambda;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* loaded from: classes2.dex */
public final class D9 extends Lambda implements cg.l {

    /* renamed from: a  reason: collision with root package name */
    public static final D9 f14203a = new D9();

    public D9() {
        super(1);
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
                        R4 r4 = (R4) obj2;
                        S5 s52 = E9.f14227a;
                        boolean z10 = r4 instanceof I2;
                        if (!z10 && !(r4 instanceof xc)) {
                            if (E9.f14230e.getANRConfig().getAppExitReason().getReportToLogs() && (r4 instanceof H0)) {
                                new X4(E9.f14230e.getANRConfig().getAppExitReason().getIncompleteLogThresholdTime()).a(r4.f15672a, r4.a(), ((H0) r4).f14308g, r4.f15673b);
                                break;
                            }
                        } else {
                            Iterator it2 = E4.a().iterator();
                            while (it2.hasNext()) {
                                C1779qa c1779qa = (C1779qa) it2.next();
                                S5 logLevel = S5.c;
                                String message = "TYPE - " + r4.f15672a + ", TIMESTAMP - " + r4.f15673b + ", PAYLOAD - " + r4.a();
                                c1779qa.getClass();
                                kotlin.jvm.internal.g.e(logLevel, "logLevel");
                                kotlin.jvm.internal.g.e(message, "message");
                                c1779qa.f15393a.a(logLevel, "LOGGER CRASH", message);
                                if (z10) {
                                    c1779qa.f15393a.b();
                                }
                            }
                            break;
                        }
                    }
                    break;
            }
        } else {
            S5 s53 = E9.f14227a;
            Iterator it3 = E4.a().iterator();
            while (it3.hasNext()) {
                C1779qa c1779qa2 = (C1779qa) it3.next();
                S5 logLevel2 = S5.c;
                String message2 = "SYSTEM SHUTDOWN RECEIVED - " + i10;
                c1779qa2.getClass();
                kotlin.jvm.internal.g.e(logLevel2, "logLevel");
                kotlin.jvm.internal.g.e(message2, "message");
                c1779qa2.f15393a.a(logLevel2, "LOGGER CRASH", message2);
                c1779qa2.f15393a.b();
            }
            AtomicBoolean atomicBoolean = E9.c;
            atomicBoolean.set(false);
            B6 f10 = Ha.f();
            D9 d92 = E9.f14232g;
            f10.a(d92);
            E9.f14228b = null;
            atomicBoolean.set(false);
            Ha.f().a(d92);
            E9.f14228b = null;
        }
        return tf.d.f30009a;
    }
}
