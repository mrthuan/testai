package com.inmobi.media;

import android.content.Context;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class A3 {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC1875y3 f14116a;

    /* renamed from: b  reason: collision with root package name */
    public final InterfaceC1670i9 f14117b;
    public final F9 c;

    /* renamed from: d  reason: collision with root package name */
    public final String f14118d;

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f14119e;

    /* renamed from: f  reason: collision with root package name */
    public final AtomicBoolean f14120f;

    /* renamed from: g  reason: collision with root package name */
    public final LinkedList f14121g;

    /* renamed from: h  reason: collision with root package name */
    public ScheduledExecutorService f14122h;

    /* renamed from: i  reason: collision with root package name */
    public C1862x3 f14123i;

    public A3(AbstractC1875y3 mEventDao, InterfaceC1670i9 mPayloadProvider, C1862x3 eventConfig, F9 f92) {
        kotlin.jvm.internal.g.e(mEventDao, "mEventDao");
        kotlin.jvm.internal.g.e(mPayloadProvider, "mPayloadProvider");
        kotlin.jvm.internal.g.e(eventConfig, "eventConfig");
        this.f14116a = mEventDao;
        this.f14117b = mPayloadProvider;
        this.c = f92;
        this.f14118d = "A3";
        this.f14119e = new AtomicBoolean(false);
        this.f14120f = new AtomicBoolean(false);
        this.f14121g = new LinkedList();
        this.f14123i = eventConfig;
    }

    public final void a(long j10, boolean z10) {
        AbstractC1875y3 abstractC1875y3;
        if (this.f14121g.contains("default")) {
            return;
        }
        this.f14121g.add("default");
        if (this.f14122h == null) {
            String TAG = this.f14118d;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            this.f14122h = Executors.newSingleThreadScheduledExecutor(new I4(TAG));
        }
        kotlin.jvm.internal.g.d(this.f14118d, "TAG");
        ScheduledExecutorService scheduledExecutorService = this.f14122h;
        if (scheduledExecutorService != null) {
            u.i iVar = new u.i(this, z10);
            C1862x3 c1862x3 = this.f14123i;
            this.f14116a.getClass();
            Context d10 = Ha.d();
            long j11 = -1;
            if (d10 != null) {
                ConcurrentHashMap concurrentHashMap = C1851w5.f15578b;
                C1851w5 a10 = AbstractC1838v5.a(d10, "batch_processing_info");
                String key = abstractC1875y3.f15618a + "_last_batch_process";
                kotlin.jvm.internal.g.e(key, "key");
                j11 = a10.f15579a.getLong(key, -1L);
            }
            if (((int) j11) == -1) {
                this.f14116a.a(System.currentTimeMillis());
            }
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            scheduledExecutorService.scheduleAtFixedRate(iVar, Math.max(0L, (timeUnit.toSeconds(j11) + (c1862x3 != null ? c1862x3.c : 0L)) - timeUnit.toSeconds(System.currentTimeMillis())), j10, TimeUnit.SECONDS);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00dd A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(com.inmobi.media.A3 r16, com.inmobi.media.Ib r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.A3.a(com.inmobi.media.A3, com.inmobi.media.Ib, boolean):void");
    }

    public final void a(C1888z3 eventPayload, boolean z10) {
        kotlin.jvm.internal.g.e(eventPayload, "eventPayload");
        String TAG = this.f14118d;
        kotlin.jvm.internal.g.d(TAG, "TAG");
        this.f14116a.a(System.currentTimeMillis());
        if (this.c != null) {
            List eventIds = eventPayload.f15699a;
            kotlin.jvm.internal.g.e(eventIds, "eventIds");
            Integer num = AbstractC1700kb.c;
            if (num != null && eventIds.contains(Integer.valueOf(num.intValue()))) {
                AbstractC1700kb.c = null;
            }
        }
        this.f14119e.set(false);
    }
}
