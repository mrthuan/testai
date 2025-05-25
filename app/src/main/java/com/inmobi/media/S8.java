package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.commons.core.configs.Config;
import com.inmobi.commons.core.configs.RootConfig;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Pair;

/* loaded from: classes2.dex */
public final class S8 {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC1846w0 f14648a;

    public S8(AbstractC1846w0 adUnit) {
        kotlin.jvm.internal.g.e(adUnit, "adUnit");
        this.f14648a = adUnit;
    }

    public final byte[] a() {
        D h02 = this.f14648a.h0();
        HashMap z02 = kotlin.collections.q.z0(new Pair("h-user-agent", Ha.k()));
        HashMap hashMap = h02.f14284k;
        if (hashMap != null) {
            hashMap.putAll(z02);
        }
        h02.f();
        LinkedHashMap linkedHashMap = C1732n2.f15334a;
        RootConfig rootConfig = null;
        Config a10 = C1705l2.a("root", Ha.b(), null);
        if (a10 instanceof RootConfig) {
            rootConfig = (RootConfig) a10;
        }
        if (rootConfig != null && rootConfig.isMonetizationDisabled()) {
            throw new C1845w(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MONETIZATION_DISABLED), (short) 2012);
        }
        if (h02.f14277d) {
            byte[] bytes = h02.c().getBytes(kotlin.text.a.f19966b);
            kotlin.jvm.internal.g.d(bytes, "this as java.lang.String).getBytes(charset)");
            return bytes;
        }
        throw new C1845w(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.GDPR_COMPLIANCE_ENFORCED), (short) 2141);
    }
}
