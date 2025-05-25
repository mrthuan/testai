package com.inmobi.media;

import com.inmobi.adquality.models.AdQualityResult;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class L extends Lambda implements cg.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ N f14415a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(N n10) {
        super(0);
        this.f14415a = n10;
    }

    @Override // cg.a
    public final Object invoke() {
        N n10 = this.f14415a;
        n10.getClass();
        n10.f14502b.set(true);
        ScheduledExecutorService scheduledExecutorService = P.f14562a;
        tf.c cVar = AbstractC1882ya.f15685a;
        int a10 = AbstractC1860x1.a((AbstractC1860x1) ((S) cVar.getValue()));
        S s4 = (S) cVar.getValue();
        s4.getClass();
        List<AdQualityResult> a11 = AbstractC1860x1.a(s4, null, null, null, null, null, Integer.valueOf(a10), 31);
        if (a11.isEmpty()) {
            a11 = EmptyList.INSTANCE;
        }
        for (AdQualityResult adQualityResult : a11) {
            if (adQualityResult != null) {
                AdConfig adConfig = n10.f14501a;
                C1799s5 c1799s5 = new C1799s5(adQualityResult, new Ib(adConfig.getIncludeIdParams()), adConfig.getAdQuality());
                M m10 = new M(n10, adQualityResult);
                c1799s5.f();
                c1799s5.f14296w = new C1629fa(c1799s5.f15439z.getMaxRetries(), c1799s5.f15439z.getRetryInterval());
                c1799s5.a(new C1786r5(m10));
            }
        }
        n10.c.set(true);
        return tf.d.f30009a;
    }
}
