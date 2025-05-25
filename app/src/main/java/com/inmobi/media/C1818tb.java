package com.inmobi.media;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: com.inmobi.media.tb  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1818tb {

    /* renamed from: a  reason: collision with root package name */
    public final C1658hb f15478a;

    /* renamed from: b  reason: collision with root package name */
    public final C1895za f15479b;
    public final C1831ub c;

    public C1818tb(C1658hb telemetryConfigMetaData, List samplingEvents) {
        kotlin.jvm.internal.g.e(telemetryConfigMetaData, "telemetryConfigMetaData");
        kotlin.jvm.internal.g.e(samplingEvents, "samplingEvents");
        this.f15478a = telemetryConfigMetaData;
        double random = Math.random();
        this.f15479b = new C1895za(telemetryConfigMetaData, random, samplingEvents);
        this.c = new C1831ub(telemetryConfigMetaData, random);
    }

    public final int a(EnumC1686jb telemetryEventType, String eventType) {
        kotlin.jvm.internal.g.e(telemetryEventType, "telemetryEventType");
        kotlin.jvm.internal.g.e(eventType, "eventType");
        int ordinal = telemetryEventType.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                C1831ub c1831ub = this.c;
                c1831ub.getClass();
                if (c1831ub.f15502b < c1831ub.f15501a.f15144g) {
                    C1616eb c1616eb = C1616eb.f15034a;
                    return 2;
                }
                return 0;
            }
            throw new NoWhenBranchMatchedException();
        }
        C1895za c1895za = this.f15479b;
        c1895za.getClass();
        if (!c1895za.c.contains(eventType)) {
            return 1;
        }
        if (c1895za.f15712b < c1895za.f15711a.f15144g) {
            C1616eb c1616eb2 = C1616eb.f15034a;
            return 2;
        }
        return 0;
    }
}
