package com.inmobi.commons.core.configs;

import com.inmobi.commons.core.configs.SignalsConfig;
import com.inmobi.media.AbstractC1753oa;
import com.inmobi.media.C1653h6;
import com.inmobi.media.C1722m5;
import com.inmobi.media.C1766pa;
import com.inmobi.media.M5;
import com.inmobi.media.Oa;
import com.inmobi.media.Pa;
import com.inmobi.media.Qa;
import com.inmobi.media.Ra;

/* loaded from: classes2.dex */
public final class f {
    public static C1722m5 a() {
        return new C1722m5().a(new C1766pa("carrierNames", SignalsConfig.NovatiqConfig.class), (AbstractC1753oa) new M5(new Oa(), String.class)).a(new C1766pa("control", SignalsConfig.SessionConfig.class), (AbstractC1753oa) new M5(new Pa(), Integer.TYPE)).a(new C1766pa("generalKeys", SignalsConfig.PublisherConfig.class), (AbstractC1753oa) new C1653h6(new Qa(), String.class)).a(new C1766pa("adSpecificKeys", SignalsConfig.PublisherConfig.class), (AbstractC1753oa) new C1653h6(new Ra(), String.class));
    }
}
