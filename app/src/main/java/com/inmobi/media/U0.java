package com.inmobi.media;

import android.os.SystemClock;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import kotlin.Pair;

/* loaded from: classes2.dex */
public final class U0 implements InvocationHandler {

    /* renamed from: a  reason: collision with root package name */
    public final CountDownLatch f14723a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14724b;
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final String f14725d;

    public U0(CountDownLatch countDownLatch, String remoteUrl, long j10, String assetAdType) {
        kotlin.jvm.internal.g.e(countDownLatch, "countDownLatch");
        kotlin.jvm.internal.g.e(remoteUrl, "remoteUrl");
        kotlin.jvm.internal.g.e(assetAdType, "assetAdType");
        this.f14723a = countDownLatch;
        this.f14724b = remoteUrl;
        this.c = j10;
        this.f14725d = assetAdType;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object proxy, Method method, Object[] args) {
        kotlin.jvm.internal.g.e(proxy, "proxy");
        kotlin.jvm.internal.g.e(args, "args");
        X0 x02 = X0.f14813a;
        Objects.toString(method);
        if (method != null) {
            if (kotlin.text.j.G("onSuccess", method.getName(), true)) {
                HashMap z02 = kotlin.collections.q.z0(new Pair("latency", Long.valueOf(SystemClock.elapsedRealtime() - this.c)), new Pair("size", 0), new Pair("assetType", "image"), new Pair("networkType", C1566b3.q()), new Pair("adType", this.f14725d));
                C1616eb c1616eb = C1616eb.f15034a;
                C1616eb.b("AssetDownloaded", z02, EnumC1686jb.f15238a);
                X0.f14813a.d(this.f14724b);
                this.f14723a.countDown();
                return null;
            } else if (kotlin.text.j.G("onError", method.getName(), true)) {
                X0.f14813a.c(this.f14724b);
                this.f14723a.countDown();
                return null;
            } else {
                return null;
            }
        }
        return null;
    }
}
