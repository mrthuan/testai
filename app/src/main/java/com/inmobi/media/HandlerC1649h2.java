package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.inmobi.commons.core.configs.Config;
import com.inmobi.commons.core.configs.RootConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.inmobi.media.h2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class HandlerC1649h2 extends Handler implements InterfaceC1796s2 {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f15119a;

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashMap f15120b;
    public Map c;

    /* renamed from: d  reason: collision with root package name */
    public ThreadPoolExecutor f15121d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC1649h2(Looper looper) {
        super(looper);
        kotlin.jvm.internal.g.e(looper, "looper");
        this.f15119a = new ArrayList();
        this.f15120b = new LinkedHashMap();
        this.c = new LinkedHashMap();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        tf.c cVar;
        byte b10;
        tf.c cVar2;
        long j10;
        Map map;
        Map map2;
        Config a10;
        HashMap hashMap;
        C1822u2 c1822u2;
        ThreadPoolExecutor threadPoolExecutor;
        tf.c cVar3;
        tf.c cVar4;
        kotlin.jvm.internal.g.e(message, "message");
        if (!C1732n2.f15336d.get()) {
            return;
        }
        boolean z10 = false;
        tf.d dVar = null;
        ThreadPoolExecutor threadPoolExecutor2 = null;
        ThreadPoolExecutor threadPoolExecutor3 = null;
        tf.d dVar2 = null;
        boolean z11 = true;
        switch (message.what) {
            case 0:
                kotlin.jvm.internal.g.d(C1732n2.f(), "access$getTAG$cp(...)");
                Object obj = message.obj;
                kotlin.jvm.internal.g.c(obj, "null cannot be cast to non-null type com.inmobi.commons.core.configs.ConfigFetchInputs");
                C1783r2 c1783r2 = (C1783r2) obj;
                Config config = c1783r2.f15400a;
                InterfaceC1719m2 interfaceC1719m2 = c1783r2.f15401b;
                if (interfaceC1719m2 != null) {
                    kotlin.jvm.internal.g.d(C1732n2.f(), "access$getTAG$cp(...)");
                    interfaceC1719m2.toString();
                    map = C1732n2.f15334a;
                    ArrayList arrayList = (ArrayList) map.get(config);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(new WeakReference(interfaceC1719m2));
                    map2 = C1732n2.f15334a;
                    map2.put(config, arrayList);
                }
                if (!C1732n2.c.get()) {
                    kotlin.jvm.internal.g.d(C1732n2.f(), "access$getTAG$cp(...)");
                    config.getType();
                    return;
                }
                String accountId$media_release = config.getAccountId$media_release();
                if (accountId$media_release != null) {
                    String type = config.getType();
                    kotlin.jvm.internal.g.d(C1732n2.f(), "access$getTAG$cp(...)");
                    Config a11 = U2.a(accountId$media_release, type);
                    cVar = C1732n2.f15338f;
                    if (((C1758p2) cVar.getValue()).b("root", accountId$media_release)) {
                        kotlin.jvm.internal.g.d(C1732n2.f(), "access$getTAG$cp(...)");
                        C1705l2.a(U2.a(accountId$media_release, "root"));
                    } else {
                        Config a12 = C1705l2.a(accountId$media_release);
                        kotlin.jvm.internal.g.c(a12, "null cannot be cast to non-null type com.inmobi.commons.core.configs.RootConfig");
                        RootConfig rootConfig = (RootConfig) a12;
                        long lastUpdateTimeStamp = rootConfig.getLastUpdateTimeStamp();
                        long expiryForType = rootConfig.getExpiryForType(rootConfig.getType());
                        kotlin.jvm.internal.g.d(C1732n2.f(), "access$getTAG$cp(...)");
                        long currentTimeMillis = System.currentTimeMillis() - lastUpdateTimeStamp;
                        long j11 = 1000;
                        if (currentTimeMillis > expiryForType * j11) {
                            b10 = 1;
                        } else {
                            b10 = 0;
                        }
                        kotlin.jvm.internal.g.d(C1732n2.f(), "access$getTAG$cp(...)");
                        if (b10 != 0) {
                            kotlin.jvm.internal.g.d(C1732n2.f(), "access$getTAG$cp(...)");
                            C1705l2.a(U2.a(accountId$media_release, "root"));
                        }
                        if (!kotlin.jvm.internal.g.a("root", type)) {
                            cVar2 = C1732n2.f15338f;
                            if (((C1758p2) cVar2.getValue()).b(type, accountId$media_release)) {
                                kotlin.jvm.internal.g.d(C1732n2.f(), "access$getTAG$cp(...)");
                                C1705l2.a(a11);
                            } else {
                                Config a13 = C1705l2.a(accountId$media_release, type);
                                if (a13 != null) {
                                    j10 = a13.getLastUpdateTimeStamp();
                                } else {
                                    j10 = 0;
                                }
                                long expiryForType2 = rootConfig.getExpiryForType(type);
                                kotlin.jvm.internal.g.d(C1732n2.f(), "access$getTAG$cp(...)");
                                if (System.currentTimeMillis() - j10 > expiryForType2 * j11) {
                                    z10 = true;
                                }
                                kotlin.jvm.internal.g.d(C1732n2.f(), "access$getTAG$cp(...)");
                                if (z10) {
                                    kotlin.jvm.internal.g.d(C1732n2.f(), "access$getTAG$cp(...)");
                                    C1705l2.a(a11);
                                }
                            }
                        }
                    }
                    dVar = tf.d.f30009a;
                }
                if (dVar == null) {
                    kotlin.jvm.internal.g.d(C1732n2.f(), "access$getTAG$cp(...)");
                    config.getType();
                    return;
                }
                return;
            case 1:
                kotlin.jvm.internal.g.d(C1732n2.f(), "access$getTAG$cp(...)");
                Object obj2 = message.obj;
                kotlin.jvm.internal.g.c(obj2, "null cannot be cast to non-null type com.inmobi.commons.core.configs.Config");
                Config config2 = (Config) obj2;
                String accountId$media_release2 = config2.getAccountId$media_release();
                if (accountId$media_release2 != null) {
                    String type2 = config2.getType();
                    kotlin.jvm.internal.g.d(C1732n2.f(), "access$getTAG$cp(...)");
                    Config a14 = C1705l2.a(accountId$media_release2);
                    kotlin.jvm.internal.g.c(a14, "null cannot be cast to non-null type com.inmobi.commons.core.configs.RootConfig");
                    Map map3 = (Map) this.f15120b.get(new C1663i2(((RootConfig) a14).getUrlForType(type2), accountId$media_release2));
                    if (map3 != null && map3.containsKey(type2)) {
                        z10 = true;
                    }
                    Map map4 = this.c;
                    if (map4 == null || !map4.containsKey(type2)) {
                        z11 = z10;
                    }
                    kotlin.jvm.internal.g.d(C1732n2.f(), "access$getTAG$cp(...)");
                    config2.getType();
                    if (!z11) {
                        this.f15119a.add(config2);
                        if (!hasMessages(2)) {
                            Message obtain = Message.obtain();
                            obtain.what = 2;
                            obtain.obj = accountId$media_release2;
                            sendMessage(obtain);
                        }
                    } else {
                        kotlin.jvm.internal.g.d(C1732n2.f(), "access$getTAG$cp(...)");
                        config2.getType();
                    }
                    dVar2 = tf.d.f30009a;
                }
                if (dVar2 == null) {
                    kotlin.jvm.internal.g.d(C1732n2.f(), "access$getTAG$cp(...)");
                    config2.getType();
                    return;
                }
                return;
            case 2:
                Object obj3 = message.obj;
                kotlin.jvm.internal.g.c(obj3, "null cannot be cast to non-null type kotlin.String");
                kotlin.jvm.internal.g.c(C1705l2.a((String) obj3), "null cannot be cast to non-null type com.inmobi.commons.core.configs.RootConfig");
                sendEmptyMessageDelayed(3, ((RootConfig) a10).getWaitTime() * 1000);
                return;
            case 3:
                Iterator it = this.f15119a.iterator();
                while (it.hasNext()) {
                    Config config3 = (Config) it.next();
                    String accountId$media_release3 = config3.getAccountId$media_release();
                    if (accountId$media_release3 != null) {
                        LinkedHashMap linkedHashMap = C1732n2.f15334a;
                        Config a15 = C1705l2.a(accountId$media_release3);
                        kotlin.jvm.internal.g.c(a15, "null cannot be cast to non-null type com.inmobi.commons.core.configs.RootConfig");
                        C1663i2 c1663i2 = new C1663i2(((RootConfig) a15).getUrlForType(config3.getType()), accountId$media_release3);
                        Map map5 = (Map) this.f15120b.get(c1663i2);
                        if (map5 == null) {
                            map5 = new HashMap();
                            this.f15120b.put(c1663i2, map5);
                        }
                        map5.put(config3.getType(), config3);
                    }
                }
                this.f15119a.clear();
                ThreadPoolExecutor threadPoolExecutor4 = this.f15121d;
                if (threadPoolExecutor4 != null && threadPoolExecutor4.isShutdown()) {
                    this.f15121d = null;
                } else {
                    threadPoolExecutor3 = this.f15121d;
                }
                if (threadPoolExecutor3 == null) {
                    int i10 = G3.f14267a;
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    LinkedBlockingDeque linkedBlockingDeque = new LinkedBlockingDeque();
                    String f10 = C1732n2.f();
                    kotlin.jvm.internal.g.d(f10, "access$getTAG$cp(...)");
                    ThreadPoolExecutor threadPoolExecutor5 = new ThreadPoolExecutor(1, 1, 5L, timeUnit, linkedBlockingDeque, new I4(f10));
                    threadPoolExecutor5.allowCoreThreadTimeOut(true);
                    this.f15121d = threadPoolExecutor5;
                    sendEmptyMessage(4);
                    return;
                }
                return;
            case 4:
                if (!this.f15120b.isEmpty()) {
                    Map.Entry entry = (Map.Entry) this.f15120b.entrySet().iterator().next();
                    this.c = (Map) entry.getValue();
                    this.f15120b.remove(entry.getKey());
                    C1663i2 c1663i22 = (C1663i2) entry.getKey();
                    Map map6 = this.c;
                    kotlin.jvm.internal.g.b(map6);
                    String str = ((C1663i2) entry.getKey()).f15165b;
                    kotlin.jvm.internal.g.d(C1732n2.f(), "access$getTAG$cp(...)");
                    Objects.toString(c1663i22);
                    Config a16 = C1705l2.a(str);
                    kotlin.jvm.internal.g.c(a16, "null cannot be cast to non-null type com.inmobi.commons.core.configs.RootConfig");
                    RootConfig rootConfig2 = (RootConfig) a16;
                    int retryInterval = rootConfig2.getRetryInterval();
                    int maxRetries = rootConfig2.getMaxRetries();
                    Ib ib2 = new Ib(rootConfig2.getIncludeIdParams());
                    boolean a17 = M3.a(M3.f14454a, false, 1, null);
                    if (!a17 && map6.containsKey("root")) {
                        HashMap hashMap2 = new HashMap(1);
                        Object obj4 = map6.get("root");
                        kotlin.jvm.internal.g.b(obj4);
                        hashMap2.put("root", obj4);
                        hashMap = hashMap2;
                        a17 = true;
                    } else {
                        hashMap = map6;
                    }
                    C1822u2 c1822u22 = new C1822u2(hashMap, ib2, c1663i22.f15164a, maxRetries, retryInterval, a17, str);
                    if (map6.containsKey("root")) {
                        String fallbackUrlForRootType = rootConfig2.getFallbackUrlForRootType();
                        HashMap hashMap3 = new HashMap(1);
                        Object obj5 = map6.get("root");
                        kotlin.jvm.internal.g.b(obj5);
                        hashMap3.put("root", obj5);
                        c1822u2 = new C1822u2(hashMap3, ib2, fallbackUrlForRootType, maxRetries, retryInterval, a17, str);
                    } else {
                        c1822u2 = null;
                    }
                    RunnableC1809t2 runnableC1809t2 = new RunnableC1809t2(this, c1822u22, c1822u2);
                    try {
                        ThreadPoolExecutor threadPoolExecutor6 = this.f15121d;
                        if (threadPoolExecutor6 != null && threadPoolExecutor6.isShutdown()) {
                            this.f15121d = null;
                        } else {
                            threadPoolExecutor2 = this.f15121d;
                        }
                        if (threadPoolExecutor2 != null) {
                            threadPoolExecutor2.execute(runnableC1809t2);
                            return;
                        }
                        return;
                    } catch (OutOfMemoryError unused) {
                        C1732n2.f();
                        if (this.f15120b.isEmpty()) {
                            kotlin.jvm.internal.g.d(C1732n2.f(), "access$getTAG$cp(...)");
                            sendEmptyMessage(5);
                            return;
                        }
                        return;
                    }
                }
                kotlin.jvm.internal.g.d(C1732n2.f(), "access$getTAG$cp(...)");
                sendEmptyMessage(5);
                return;
            case 5:
                ThreadPoolExecutor threadPoolExecutor7 = this.f15121d;
                if (threadPoolExecutor7 != null && threadPoolExecutor7.isShutdown()) {
                    this.f15121d = null;
                    threadPoolExecutor = null;
                } else {
                    threadPoolExecutor = this.f15121d;
                }
                if (threadPoolExecutor != null && !threadPoolExecutor.isShutdown()) {
                    this.c = null;
                    this.f15120b.clear();
                    removeMessages(3);
                    threadPoolExecutor.shutdownNow();
                    return;
                }
                return;
            case 6:
                Object obj6 = message.obj;
                kotlin.jvm.internal.g.c(obj6, "null cannot be cast to non-null type com.inmobi.commons.core.configs.ConfigNetworkResponse.ConfigResponse");
                C1848w2 c1848w2 = (C1848w2) obj6;
                if (c1848w2.c != null) {
                    kotlin.jvm.internal.g.d(C1732n2.f(), "access$getTAG$cp(...)");
                    c1848w2.f15550a.getType();
                    return;
                } else if (c1848w2.f15551b != 304) {
                    cVar3 = C1732n2.f15338f;
                    C1758p2 c1758p2 = (C1758p2) cVar3.getValue();
                    Config config4 = c1848w2.f15550a;
                    c1758p2.getClass();
                    kotlin.jvm.internal.g.e(config4, "config");
                    try {
                        if (config4.getAccountId$media_release() != null) {
                            config4.getType();
                            config4.getAccountId$media_release();
                            c1758p2.a(config4, "account_id=? AND config_type=?", new String[]{config4.getAccountId$media_release(), config4.getType()});
                        }
                    } catch (Exception unused2) {
                    }
                    kotlin.jvm.internal.g.d(C1732n2.f(), "access$getTAG$cp(...)");
                    c1848w2.f15550a.getType();
                    kotlin.jvm.internal.g.d(C1732n2.f(), "access$getTAG$cp(...)");
                    Objects.toString(c1848w2.f15550a.toJson());
                    kotlin.jvm.internal.g.d(C1732n2.f(), "access$getTAG$cp(...)");
                    c1848w2.f15550a.getAccountId$media_release();
                    Config config5 = c1848w2.f15550a;
                    ConcurrentHashMap concurrentHashMap = C1732n2.f15337e;
                    kotlin.jvm.internal.g.e(config5, "<this>");
                    HashMap hashMap4 = U2.f14728a;
                    String accountId$media_release4 = config5.getAccountId$media_release();
                    String type3 = config5.getType();
                    kotlin.jvm.internal.g.e(type3, "type");
                    concurrentHashMap.put(accountId$media_release4 + '-' + type3, config5);
                    C1705l2.b(c1848w2.f15550a);
                    return;
                } else {
                    kotlin.jvm.internal.g.d(C1732n2.f(), "access$getTAG$cp(...)");
                    c1848w2.f15550a.getType();
                    Config config6 = c1848w2.f15550a;
                    if (config6.getAccountId$media_release() != null) {
                        cVar4 = C1732n2.f15338f;
                        C1758p2 c1758p22 = (C1758p2) cVar4.getValue();
                        String type4 = config6.getType();
                        String accountId$media_release5 = config6.getAccountId$media_release();
                        kotlin.jvm.internal.g.b(accountId$media_release5);
                        long currentTimeMillis2 = System.currentTimeMillis();
                        c1758p22.getClass();
                        kotlin.jvm.internal.g.e(type4, "type");
                        Config config7 = (Config) c1758p22.b("account_id=? AND config_type=?", new String[]{accountId$media_release5, type4});
                        if (config7 != null) {
                            config7.setLastUpdateTimeStamp(currentTimeMillis2);
                            c1758p22.a(config7, "account_id=? AND config_type=?", new String[]{accountId$media_release5, type4});
                            return;
                        }
                        return;
                    }
                    return;
                }
            default:
                kotlin.jvm.internal.g.d(C1732n2.f(), "access$getTAG$cp(...)");
                return;
        }
    }
}
