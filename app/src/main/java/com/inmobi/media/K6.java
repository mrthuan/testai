package com.inmobi.media;

import java.util.HashMap;

/* loaded from: classes2.dex */
public final class K6 implements A9 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ M6 f14396a;

    public K6(M6 m62) {
        this.f14396a = m62;
    }

    @Override // com.inmobi.media.A9
    public final void a(String triggerApi) {
        kotlin.jvm.internal.g.e(triggerApi, "triggerApi");
        HashMap hashMap = new HashMap();
        hashMap.put("creativeId", this.f14396a.getCreativeId());
        hashMap.put("trigger", triggerApi);
        hashMap.put("impressionId", this.f14396a.getImpressionId());
        hashMap.put("adType", "native");
        C1616eb c1616eb = C1616eb.f15034a;
        C1616eb.b("BlockAutoRedirection", hashMap, EnumC1686jb.f15238a);
    }

    @Override // com.inmobi.media.A9
    public final boolean d() {
        return true;
    }

    @Override // com.inmobi.media.A9
    public final long getViewTouchTimestamp() {
        return -1L;
    }
}
