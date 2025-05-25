package com.inmobi.media;

import android.os.SystemClock;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;

/* loaded from: classes2.dex */
public final class Z9 {

    /* renamed from: a  reason: collision with root package name */
    public final V9 f14921a;

    /* renamed from: b  reason: collision with root package name */
    public long f14922b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public int f14923d;

    /* renamed from: e  reason: collision with root package name */
    public final AtomicInteger f14924e;

    /* renamed from: f  reason: collision with root package name */
    public final AtomicBoolean f14925f;

    public Z9(V9 renderViewMetaData) {
        kotlin.jvm.internal.g.e(renderViewMetaData, "renderViewMetaData");
        this.f14921a = renderViewMetaData;
        this.f14924e = new AtomicInteger(renderViewMetaData.f14757j.f14889a);
        this.f14925f = new AtomicBoolean(false);
    }

    public final Map a() {
        LinkedHashMap B0 = kotlin.collections.q.B0(new Pair("plType", String.valueOf(this.f14921a.f14749a.m())), new Pair("plId", String.valueOf(this.f14921a.f14749a.l())), new Pair("adType", String.valueOf(this.f14921a.f14749a.b())), new Pair("markupType", this.f14921a.f14750b), new Pair("networkType", C1566b3.q()), new Pair("retryCount", String.valueOf(this.f14921a.f14751d)), new Pair("creativeType", this.f14921a.f14752e), new Pair("adPosition", String.valueOf(this.f14921a.f14755h)), new Pair("isRewarded", String.valueOf(this.f14921a.f14754g)));
        if (this.f14921a.c.length() > 0) {
            B0.put("metadataBlob", this.f14921a.c);
        }
        return B0;
    }

    public final void b() {
        this.f14922b = SystemClock.elapsedRealtime();
        Map a10 = a();
        long j10 = this.f14921a.f14756i.f15617a.c;
        ScheduledExecutorService scheduledExecutorService = Vb.f14759a;
        a10.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
        a10.put("creativeId", this.f14921a.f14753f);
        C1616eb c1616eb = C1616eb.f15034a;
        C1616eb.b("WebViewLoadCalled", a10, EnumC1686jb.f15238a);
    }
}
