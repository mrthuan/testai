package com.inmobi.media;

import android.content.Context;
import com.inmobi.commons.core.configs.Config;
import com.inmobi.commons.core.configs.SignalsConfig;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class C2 implements InterfaceC1719m2 {
    @Override // com.inmobi.media.InterfaceC1719m2
    public final void a(Config config) {
        kotlin.jvm.internal.g.e(config, "config");
        synchronized (this) {
            D2 d22 = D2.f14184a;
            SignalsConfig signalsConfig = (SignalsConfig) config;
            D2.f14186d = signalsConfig;
            D2.f14188f = AbstractC1823u3.a(signalsConfig.getAK());
            Context d10 = Ha.d();
            if (d10 != null) {
                ConcurrentHashMap concurrentHashMap = C1851w5.f15578b;
                C1851w5 a10 = AbstractC1838v5.a(d10, "c_data_store");
                Context d11 = Ha.d();
                int i10 = 1;
                if (d11 != null) {
                    i10 = AbstractC1838v5.a(d11, "c_data_store").f15579a.getInt("akv", 1);
                }
                SignalsConfig signalsConfig2 = D2.f14186d;
                if (signalsConfig2 == null || signalsConfig2.getAKV() != i10) {
                    SignalsConfig signalsConfig3 = D2.f14186d;
                    if (signalsConfig3 != null) {
                        i10 = signalsConfig3.getAKV();
                    }
                    a10.a("akv", i10);
                    d22.d();
                }
            }
            tf.d dVar = tf.d.f30009a;
        }
    }
}
