package com.bykv.vk.openvk.preload.geckox.statistic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: StatisticDataManager.java */
/* loaded from: classes.dex */
final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<Long, a> f7618a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, com.bykv.vk.openvk.preload.geckox.statistic.model.a> f7619b = new HashMap();

    public static a a(long j10) {
        a aVar;
        Map<Long, a> map = f7618a;
        synchronized (map) {
            aVar = map.get(Long.valueOf(j10));
            if (aVar == null) {
                aVar = new a();
                map.put(Long.valueOf(j10), aVar);
            }
        }
        return aVar;
    }

    public final com.bykv.vk.openvk.preload.geckox.statistic.model.a a(String str) {
        com.bykv.vk.openvk.preload.geckox.statistic.model.a aVar;
        synchronized (this.f7619b) {
            aVar = this.f7619b.get(str);
            if (aVar == null) {
                aVar = new com.bykv.vk.openvk.preload.geckox.statistic.model.a();
                this.f7619b.put(str, aVar);
            }
        }
        return aVar;
    }

    public final List<com.bykv.vk.openvk.preload.geckox.statistic.model.a> a() {
        ArrayList arrayList;
        synchronized (this.f7619b) {
            arrayList = new ArrayList(this.f7619b.values());
        }
        return arrayList;
    }
}
