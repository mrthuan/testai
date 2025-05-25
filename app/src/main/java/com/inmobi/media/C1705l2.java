package com.inmobi.media;

import android.os.Message;
import com.inmobi.commons.core.configs.Config;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.inmobi.media.l2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1705l2 {
    public static void a() {
        if (C1732n2.c.getAndSet(true)) {
            return;
        }
        kotlin.jvm.internal.g.d(C1732n2.f(), "access$getTAG$cp(...)");
        b();
        a("root", Ha.b(), null);
    }

    public static void b() {
        tf.c cVar;
        ArrayList arrayList = new ArrayList();
        cVar = C1732n2.f15338f;
        C1758p2 c1758p2 = (C1758p2) cVar.getValue();
        c1758p2.getClass();
        Iterator it = kotlin.collections.m.p0(AbstractC1860x1.a(c1758p2, null, null, null, null, null, null, 63)).iterator();
        while (it.hasNext()) {
            Config config = (Config) it.next();
            ConcurrentHashMap concurrentHashMap = C1732n2.f15337e;
            kotlin.jvm.internal.g.e(config, "<this>");
            HashMap hashMap = U2.f14728a;
            String accountId$media_release = config.getAccountId$media_release();
            String type = config.getType();
            kotlin.jvm.internal.g.e(type, "type");
            Config config2 = (Config) concurrentHashMap.put(accountId$media_release + '-' + type, config);
            if (config2 == null || config2.getLastUpdateTimeStamp() != config.getLastUpdateTimeStamp()) {
                String accountId$media_release2 = config.getAccountId$media_release();
                String type2 = config.getType();
                kotlin.jvm.internal.g.e(type2, "type");
                arrayList.add(accountId$media_release2 + '-' + type2);
            }
        }
        ((HandlerC1649h2) C1732n2.f15335b.getValue()).post(new qb.v0(arrayList, 0));
    }

    public static final void a(List changedConfigKeys) {
        kotlin.jvm.internal.g.e(changedConfigKeys, "$changedConfigKeys");
        try {
            kotlin.jvm.internal.g.d(C1732n2.f(), "access$getTAG$cp(...)");
            Iterator it = changedConfigKeys.iterator();
            while (it.hasNext()) {
                Config config = (Config) C1732n2.f15337e.get((String) it.next());
                if (config != null) {
                    b(config);
                }
            }
        } catch (Exception unused) {
            kotlin.jvm.internal.g.d(C1732n2.f(), "access$getTAG$cp(...)");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.inmobi.commons.core.configs.Config a(java.lang.String r3, java.lang.String r4, com.inmobi.media.InterfaceC1719m2 r5) {
        /*
            java.lang.String r0 = "type"
            kotlin.jvm.internal.g.e(r3, r0)
            java.lang.String r0 = com.inmobi.media.C1732n2.f()
            java.lang.String r1 = "access$getTAG$cp(...)"
            kotlin.jvm.internal.g.d(r0, r1)
            java.util.Objects.toString(r5)
            com.inmobi.commons.core.configs.Config r3 = com.inmobi.media.U2.a(r4, r3)
            if (r4 != 0) goto L1f
            java.lang.String r4 = com.inmobi.media.C1732n2.f()
            kotlin.jvm.internal.g.d(r4, r1)
            return r3
        L1f:
            tf.c r4 = com.inmobi.media.C1732n2.d()
            java.lang.Object r4 = r4.getValue()
            com.inmobi.media.h2 r4 = (com.inmobi.media.HandlerC1649h2) r4
            android.os.Message r4 = r4.obtainMessage()
            java.lang.String r0 = "obtainMessage(...)"
            kotlin.jvm.internal.g.d(r4, r0)
            r0 = 0
            r4.what = r0
            com.inmobi.media.r2 r0 = new com.inmobi.media.r2
            r0.<init>(r3, r5)
            r4.obj = r0
            tf.c r5 = com.inmobi.media.C1732n2.d()
            java.lang.Object r5 = r5.getValue()
            com.inmobi.media.h2 r5 = (com.inmobi.media.HandlerC1649h2) r5
            r5.sendMessage(r4)
            java.lang.String r4 = com.inmobi.media.C1732n2.f()
            kotlin.jvm.internal.g.d(r4, r1)
            java.util.Objects.toString(r3)
            java.lang.String r4 = r3.getAccountId$media_release()
            if (r4 == 0) goto L92
            java.lang.String r5 = r3.getType()
            java.lang.String r0 = com.inmobi.media.C1732n2.f()
            kotlin.jvm.internal.g.d(r0, r1)
            java.util.concurrent.ConcurrentHashMap r0 = com.inmobi.media.C1732n2.f15337e
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.g.e(r5, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            r4 = 45
            r2.append(r4)
            r2.append(r5)
            java.lang.String r4 = r2.toString()
            java.lang.Object r4 = r0.get(r4)
            com.inmobi.commons.core.configs.Config r4 = (com.inmobi.commons.core.configs.Config) r4
            if (r4 == 0) goto L92
            java.lang.String r5 = com.inmobi.media.C1732n2.f()
            kotlin.jvm.internal.g.d(r5, r1)
            r4.getLastUpdateTimeStamp()
            goto L93
        L92:
            r4 = 0
        L93:
            if (r4 != 0) goto L96
            goto L97
        L96:
            r3 = r4
        L97:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C1705l2.a(java.lang.String, java.lang.String, com.inmobi.media.m2):com.inmobi.commons.core.configs.Config");
    }

    public static void b(Config config) {
        Map map;
        Map map2;
        kotlin.jvm.internal.g.d(C1732n2.f(), "access$getTAG$cp(...)");
        map = C1732n2.f15334a;
        ArrayList arrayList = (ArrayList) map.get(config);
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            kotlin.jvm.internal.g.d(it, "iterator(...)");
            while (it.hasNext()) {
                Object next = it.next();
                kotlin.jvm.internal.g.d(next, "next(...)");
                if (((WeakReference) next).get() == null) {
                    it.remove();
                }
            }
        }
        map2 = C1732n2.f15334a;
        ArrayList<WeakReference> arrayList2 = (ArrayList) map2.get(config);
        if (arrayList2 != null) {
            for (WeakReference weakReference : arrayList2) {
                InterfaceC1719m2 interfaceC1719m2 = (InterfaceC1719m2) weakReference.get();
                if (interfaceC1719m2 != null) {
                    kotlin.jvm.internal.g.d(C1732n2.f(), "access$getTAG$cp(...)");
                    interfaceC1719m2.getClass().toString();
                    interfaceC1719m2.a(config);
                }
            }
        }
    }

    public static Config a(String accountId, String type) {
        tf.c cVar;
        kotlin.jvm.internal.g.e(accountId, "accountId");
        kotlin.jvm.internal.g.e(type, "type");
        kotlin.jvm.internal.g.d(C1732n2.f(), "access$getTAG$cp(...)");
        ConcurrentHashMap concurrentHashMap = C1732n2.f15337e;
        HashMap hashMap = U2.f14728a;
        Config config = (Config) concurrentHashMap.get(accountId + '-' + type);
        Config config2 = null;
        if (config != null) {
            kotlin.jvm.internal.g.d(C1732n2.f(), "access$getTAG$cp(...)");
            config.getLastUpdateTimeStamp();
        } else {
            config = null;
        }
        if (config == null) {
            cVar = C1732n2.f15338f;
            C1758p2 c1758p2 = (C1758p2) cVar.getValue();
            c1758p2.getClass();
            Config config3 = (Config) c1758p2.b("account_id=? AND config_type=?", new String[]{accountId, type});
            if (config3 != null) {
                kotlin.jvm.internal.g.d(C1732n2.f(), "access$getTAG$cp(...)");
                config3.toString();
                if (AbstractC1579c2.a(config3.getAccountId$media_release()) && config3.getType().length() > 0) {
                    String accountId$media_release = config3.getAccountId$media_release();
                    String type2 = config3.getType();
                    kotlin.jvm.internal.g.e(type2, "type");
                    concurrentHashMap.put(accountId$media_release + '-' + type2, config3);
                    b(config3);
                }
                config2 = config3;
            }
            kotlin.jvm.internal.g.d(C1732n2.f(), "access$getTAG$cp(...)");
            if (config2 != null) {
                config2.getLastUpdateTimeStamp();
            }
            return config2;
        }
        return config;
    }

    public static Config a(String accountId) {
        kotlin.jvm.internal.g.e(accountId, "accountId");
        kotlin.jvm.internal.g.d(C1732n2.f(), "access$getTAG$cp(...)");
        Config a10 = a(accountId, "root");
        return a10 == null ? U2.a(accountId, "root") : a10;
    }

    public static void a(Config config) {
        kotlin.jvm.internal.g.d(C1732n2.f(), "access$getTAG$cp(...)");
        Message obtainMessage = ((HandlerC1649h2) C1732n2.f15335b.getValue()).obtainMessage();
        kotlin.jvm.internal.g.d(obtainMessage, "obtainMessage(...)");
        obtainMessage.what = 1;
        obtainMessage.obj = config;
        ((HandlerC1649h2) C1732n2.f15335b.getValue()).sendMessage(obtainMessage);
    }
}
