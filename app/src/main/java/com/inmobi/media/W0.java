package com.inmobi.media;

import com.inmobi.commons.core.configs.AdConfig;

/* loaded from: classes2.dex */
public final class W0 implements R0 {
    @Override // com.inmobi.media.R0
    public final void a(H8 response, String locationOnDisk, C1674j asset) {
        kotlin.jvm.internal.g.e(response, "response");
        kotlin.jvm.internal.g.e(locationOnDisk, "locationOnDisk");
        kotlin.jvm.internal.g.e(asset, "asset");
        AdConfig.AssetCacheConfig assetCacheConfig = X0.c;
        if (assetCacheConfig != null) {
            C1660i a10 = new C1660i().a(asset.f15197b, locationOnDisk, response, assetCacheConfig.getMaxRetries(), assetCacheConfig.getTimeToLive());
            int i10 = a10.f15153a;
            String str = a10.c;
            if (str == null) {
                str = "";
            }
            C1674j c1674j = new C1674j(i10, str, a10.f15155d, a10.f15154b, a10.f15156e, a10.f15157f, a10.f15158g, a10.f15159h);
            AbstractC1882ya.a().a(c1674j);
            c1674j.f15204j = asset.f15204j;
            c1674j.f15205k = asset.f15205k;
            X0.f14813a.a(c1674j, (byte) -1);
        }
        try {
            X0 x02 = X0.f14813a;
            if (X0.f14821j.get()) {
                return;
            }
            x02.c();
        } catch (Exception e10) {
            X0 x03 = X0.f14813a;
            Q4 q42 = Q4.f14590a;
            Q4.c.a(AbstractC1863x4.a(e10, "event"));
        }
    }

    @Override // com.inmobi.media.R0
    public final void a(C1674j asset) {
        kotlin.jvm.internal.g.e(asset, "asset");
        X0 x02 = X0.f14813a;
        String str = asset.f15197b;
        X0 x03 = X0.f14813a;
        X0.f14822k.remove(str);
        if (asset.f15198d <= 0) {
            x03.a(asset, asset.f15206l);
            Q0 a10 = AbstractC1882ya.a();
            a10.getClass();
            a10.a("id = ?", new String[]{String.valueOf(asset.f15196a)});
        } else {
            asset.f15199e = System.currentTimeMillis();
            AbstractC1882ya.a().a(asset);
            if (K8.a() != null) {
                x03.a(asset, asset.f15206l);
            }
        }
        try {
            if (X0.f14821j.get()) {
                return;
            }
            x03.c();
        } catch (Exception e10) {
            X0 x04 = X0.f14813a;
            Q4 q42 = Q4.f14590a;
            Q4.c.a(AbstractC1863x4.a(e10, "event"));
        }
    }
}
