package com.inmobi.media;

import android.os.Message;
import com.inmobi.commons.core.configs.AdConfig;

/* loaded from: classes2.dex */
public final class S0 implements R0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ T0 f14622a;

    public S0(T0 t02) {
        this.f14622a = t02;
    }

    @Override // com.inmobi.media.R0
    public final void a(H8 response, String locationOnDisk, C1674j asset) {
        kotlin.jvm.internal.g.e(response, "response");
        kotlin.jvm.internal.g.e(locationOnDisk, "locationOnDisk");
        kotlin.jvm.internal.g.e(asset, "asset");
        X0 x02 = (X0) this.f14622a.f14703a.get();
        AdConfig.AssetCacheConfig assetCacheConfig = x02 != null ? X0.c : null;
        if (assetCacheConfig != null) {
            X0 x03 = X0.f14813a;
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
            x02.a(c1674j, (byte) -1);
            T0 t02 = this.f14622a;
            t02.getClass();
            try {
                t02.sendEmptyMessage(3);
                return;
            } catch (Exception unused) {
                X0 x04 = X0.f14813a;
                return;
            }
        }
        X0 x05 = X0.f14813a;
    }

    @Override // com.inmobi.media.R0
    public final void a(C1674j asset) {
        kotlin.jvm.internal.g.e(asset, "asset");
        X0 x02 = (X0) this.f14622a.f14703a.get();
        if (x02 != null) {
            X0 x03 = X0.f14813a;
            X0.f14822k.remove(asset.f15197b);
            int i10 = asset.f15198d;
            if (i10 > 0) {
                asset.f15198d = i10 - 1;
                asset.f15199e = System.currentTimeMillis();
                AbstractC1882ya.a().a(asset);
                this.f14622a.a();
                return;
            }
            x02.a(asset, asset.f15206l);
            T0 t02 = this.f14622a;
            t02.getClass();
            try {
                Message obtain = Message.obtain();
                obtain.what = 4;
                obtain.obj = asset;
                t02.sendMessage(obtain);
                return;
            } catch (Exception unused) {
                X0 x04 = X0.f14813a;
                return;
            }
        }
        X0 x05 = X0.f14813a;
    }
}
