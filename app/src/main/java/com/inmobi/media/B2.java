package com.inmobi.media;

import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.commons.core.configs.Config;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes2.dex */
public final class B2 implements InterfaceC1719m2 {
    @Override // com.inmobi.media.InterfaceC1719m2
    public final void a(Config config) {
        List<String> list;
        AdConfig.ContextualDataConfig contextualData;
        kotlin.jvm.internal.g.e(config, "config");
        synchronized (this) {
            D2 d22 = D2.f14184a;
            D2.f14187e = (AdConfig) config;
            String str = D2.f14189g;
            AdConfig adConfig = D2.f14187e;
            if (adConfig == null || (contextualData = adConfig.getContextualData()) == null || (list = contextualData.getSkipFields()) == null) {
                list = EmptyList.INSTANCE;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(E2.f14212j);
            arrayList.removeAll(list);
            String w02 = kotlin.collections.m.w0(arrayList, ",", null, null, null, 62);
            D2.f14189g = w02;
            if (!kotlin.jvm.internal.g.a(w02, str)) {
                d22.d();
            }
            D2.a();
            tf.d dVar = tf.d.f30009a;
        }
    }
}
