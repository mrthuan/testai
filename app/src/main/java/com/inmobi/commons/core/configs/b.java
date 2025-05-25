package com.inmobi.commons.core.configs;

import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.media.AbstractC1753oa;
import com.inmobi.media.C1653h6;
import com.inmobi.media.C1722m5;
import com.inmobi.media.C1729n;
import com.inmobi.media.C1742o;
import com.inmobi.media.C1755p;
import com.inmobi.media.C1766pa;
import com.inmobi.media.M5;

/* loaded from: classes2.dex */
public final class b {
    public static C1722m5 a() {
        return new C1722m5().a(new C1766pa("cache", AdConfig.class), (AbstractC1753oa) new C1653h6(new a(), AdConfig.CacheConfig.class)).a(new C1766pa("allowedContentType", AdConfig.VastVideoConfig.class), (AbstractC1753oa) new M5(new C1729n(), String.class)).a(new C1766pa("gestures", AdConfig.RenderingConfig.class), (AbstractC1753oa) new M5(new C1742o(), Integer.TYPE)).a(new C1766pa("skipFields", AdConfig.ContextualDataConfig.class), (AbstractC1753oa) new M5(new C1755p(), String.class));
    }
}
