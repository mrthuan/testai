package com.inmobi.media;

import android.util.Base64;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.commons.core.configs.RootConfig;
import com.inmobi.media.Db;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes2.dex */
public abstract class Db {
    public static String a(Map map, String str) {
        B4 a10 = E9.a("getToken", "AB", false);
        long currentTimeMillis = System.currentTimeMillis();
        if (map != null) {
            Ia.a((String) map.get("tp"));
            Ia.b((String) map.get("tp-v"));
        }
        a();
        if (!Ha.q()) {
            if (a10 != null) {
                a10.b("com.inmobi.media.Db", "InMobi SDK is not initialised. Cannot fetch a token.");
            }
            a(90, currentTimeMillis, a10);
            return null;
        }
        LinkedHashMap linkedHashMap = C1732n2.f15334a;
        if (((RootConfig) AbstractC1773q4.a("root", "null cannot be cast to non-null type com.inmobi.commons.core.configs.RootConfig", null)).isMonetizationDisabled()) {
            a(2012, currentTimeMillis, a10);
            if (a10 != null) {
                a10.b("com.inmobi.media.Db", "Monetization disabled. cannot provide token");
            }
            return null;
        }
        Eb eb2 = new Eb(new Ib(((AdConfig) AbstractC1773q4.a("ads", "null cannot be cast to non-null type com.inmobi.commons.core.configs.AdConfig", null)).getIncludeIdParams()), a10);
        eb2.f14238z = map;
        eb2.f14237y = str;
        HashMap z02 = kotlin.collections.q.z0(new Pair("h-user-agent", Ha.k()));
        HashMap hashMap = eb2.f14284k;
        if (hashMap != null) {
            hashMap.putAll(z02);
        }
        eb2.f();
        if (eb2.f14277d) {
            a(currentTimeMillis, a10);
            if (a10 != null) {
                a10.a("com.inmobi.media.Db", "get signals success");
            }
            String c = eb2.c();
            Charset charset = kotlin.text.a.f19966b;
            byte[] bytes = c.getBytes(charset);
            kotlin.jvm.internal.g.d(bytes, "this as java.lang.String).getBytes(charset)");
            byte[] encode = Base64.encode(bytes, 8);
            kotlin.jvm.internal.g.d(encode, "encode(...)");
            return new String(encode, charset);
        }
        if (a10 != null) {
            a10.b("com.inmobi.media.Db", "get Signals failed - GDPR Compliance");
        }
        a(2141, currentTimeMillis, a10);
        return null;
    }

    public static final void b() {
        HashMap z02 = kotlin.collections.q.z0(new Pair("networkType", C1566b3.q()), new Pair("plType", "AB"));
        C1616eb c1616eb = C1616eb.f15034a;
        C1616eb.b("AdGetSignalsCalled", z02, EnumC1686jb.f15238a);
    }

    public static void a(final int i10, final long j10, B4 b42) {
        if (b42 != null) {
            b42.c("com.inmobi.media.Db", "submitAdGetSignalsFailed - errorCode - " + i10 + ", startTime - " + j10);
        }
        Ha.a(new Runnable() { // from class: qb.d
            @Override // java.lang.Runnable
            public final void run() {
                Db.a(j10, i10);
            }
        });
        if (b42 != null) {
            b42.a();
        }
    }

    public static final void a(long j10, int i10) {
        HashMap z02 = kotlin.collections.q.z0(new Pair("latency", Long.valueOf(System.currentTimeMillis() - j10)), new Pair("networkType", C1566b3.q()), new Pair("errorCode", Integer.valueOf(i10)), new Pair("plType", "AB"));
        C1616eb c1616eb = C1616eb.f15034a;
        C1616eb.b("AdGetSignalsFailed", z02, EnumC1686jb.f15238a);
    }

    public static void a(final long j10, B4 b42) {
        if (b42 != null) {
            b42.c("com.inmobi.media.Db", "submitAdGetSignalsSucceeded - startTime - " + j10);
        }
        Ha.a(new Runnable() { // from class: qb.c
            @Override // java.lang.Runnable
            public final void run() {
                Db.a(j10);
            }
        });
        if (b42 != null) {
            b42.a();
        }
    }

    public static final void a(long j10) {
        HashMap z02 = kotlin.collections.q.z0(new Pair("latency", Long.valueOf(System.currentTimeMillis() - j10)), new Pair("networkType", C1566b3.q()), new Pair("plType", "AB"));
        C1616eb c1616eb = C1616eb.f15034a;
        C1616eb.b("AdGetSignalsSucceeded", z02, EnumC1686jb.f15238a);
    }

    public static void a() {
        Ha.a(new com.facebook.appevents.h(2));
    }
}
