package com.inmobi.media;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Process;
import com.google.android.gms.common.api.Api;
import com.inmobi.commons.core.configs.SignalsConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.PropertyReference1Impl;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Ma {

    /* renamed from: a  reason: collision with root package name */
    public static final Ma f14488a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ ig.h[] f14489b;
    public static final String c;

    /* renamed from: d  reason: collision with root package name */
    public static String f14490d;

    /* renamed from: e  reason: collision with root package name */
    public static boolean f14491e;

    /* renamed from: f  reason: collision with root package name */
    public static long f14492f;

    /* renamed from: g  reason: collision with root package name */
    public static final List f14493g;

    /* renamed from: h  reason: collision with root package name */
    public static final SignalsConfig.SessionConfig f14494h;

    /* renamed from: i  reason: collision with root package name */
    public static final AtomicBoolean f14495i;

    /* renamed from: j  reason: collision with root package name */
    public static final C1851w5 f14496j;

    /* renamed from: k  reason: collision with root package name */
    public static final C1564b1 f14497k;

    /* renamed from: l  reason: collision with root package name */
    public static final C1564b1 f14498l;

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(Ma.class, "sessionCnt", "getSessionCnt()I", 0);
        kotlin.jvm.internal.i.f19949a.getClass();
        f14489b = new ig.h[]{propertyReference1Impl, new PropertyReference1Impl(Ma.class, "userRetention", "getUserRetention()I", 0)};
        f14488a = new Ma();
        c = "Ma";
        f14493g = ge.a.J(0, 0, 0, 0);
        LinkedHashMap linkedHashMap = C1732n2.f15334a;
        C1851w5 c1851w5 = null;
        f14494h = ((SignalsConfig) AbstractC1773q4.a("signals", "null cannot be cast to non-null type com.inmobi.commons.core.configs.SignalsConfig", null)).getSessionConfig();
        f14495i = new AtomicBoolean(false);
        Context d10 = Ha.d();
        if (d10 != null) {
            ConcurrentHashMap concurrentHashMap = C1851w5.f15578b;
            c1851w5 = AbstractC1838v5.a(d10, "session_pref_file");
        }
        f14496j = c1851w5;
        f14497k = new C1564b1((Integer) (-1), (cg.a) Ka.f14401a, false, 12);
        f14498l = new C1564b1((Integer) (-1), (cg.a) La.f14436a, false, 12);
    }

    public static int a() {
        C1851w5 c1851w5 = f14496j;
        if (c1851w5 == null) {
            return 0;
        }
        long currentTimeMillis = System.currentTimeMillis();
        return Math.min((int) ((currentTimeMillis - c1851w5.f15579a.getLong("u-ret", currentTimeMillis)) / 86400000), (int) Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    public static void c() {
        if (f14495i.getAndSet(true)) {
            return;
        }
        if (Na.a().isSessionEnabled()) {
            String uuid = UUID.randomUUID().toString();
            kotlin.jvm.internal.g.d(uuid, "toString(...)");
            f14490d = uuid;
            String TAG = c;
            kotlin.jvm.internal.g.d(TAG, "TAG");
        }
        f14492f = System.currentTimeMillis() - Process.getElapsedCpuTime();
        if (a(5)) {
            C1851w5 c1851w5 = f14496j;
            if (c1851w5 != null) {
                int min = Math.min(c1851w5.f15579a.getInt("cnt", 0) + 1, (int) Api.BaseClientBuilder.API_PRIORITY_OTHER);
                SharedPreferences.Editor edit = c1851w5.f15579a.edit();
                edit.putInt("cnt", min);
                edit.apply();
            }
            f14497k.a();
        }
        if (a(6)) {
            C1851w5 c1851w52 = f14496j;
            if (c1851w52 != null && !c1851w52.f15579a.contains("u-ret")) {
                long currentTimeMillis = System.currentTimeMillis();
                SharedPreferences.Editor edit2 = c1851w52.f15579a.edit();
                edit2.putLong("u-ret", currentTimeMillis);
                edit2.apply();
            }
            f14498l.a();
        }
    }

    public final JSONObject b() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (a(0)) {
            linkedHashMap.put("st", Long.valueOf(f14492f));
        }
        if (a(5)) {
            C1564b1 c1564b1 = f14497k;
            ig.h[] hVarArr = f14489b;
            if (((Number) c1564b1.getValue(this, hVarArr[0])).intValue() != -1) {
                linkedHashMap.put("cnt", Integer.valueOf(((Number) c1564b1.getValue(this, hVarArr[0])).intValue()));
            }
        }
        if (a(6)) {
            C1564b1 c1564b12 = f14498l;
            ig.h[] hVarArr2 = f14489b;
            if (((Number) c1564b12.getValue(this, hVarArr2[1])).intValue() != -1) {
                linkedHashMap.put("u-ret", Integer.valueOf(((Number) c1564b12.getValue(this, hVarArr2[1])).intValue()));
            }
        }
        ArrayList F0 = kotlin.collections.m.F0(f14493g);
        if (!a(1)) {
            F0.set(0, -1);
        }
        if (!a(2)) {
            F0.set(1, -1);
        }
        if (!a(3)) {
            F0.set(2, -1);
        }
        if (!a(4)) {
            F0.set(3, -1);
        }
        if (!F0.isEmpty()) {
            Iterator it = F0.iterator();
            while (it.hasNext()) {
                if (((Number) it.next()).intValue() != -1) {
                    linkedHashMap.put("dep", F0);
                    break;
                }
            }
        }
        try {
            return new JSONObject(linkedHashMap);
        } catch (Exception unused) {
            return new JSONObject();
        }
    }

    public static boolean a(int i10) {
        return f14494h.getSigControlList().contains(Integer.valueOf(i10));
    }

    public static void a(String adtype, Boolean bool) {
        kotlin.jvm.internal.g.e(adtype, "adtype");
        if (kotlin.jvm.internal.g.a(adtype, "banner") && a(1)) {
            List list = f14493g;
            list.set(0, Integer.valueOf(Math.min(((Number) list.get(0)).intValue() + 1, (int) Api.BaseClientBuilder.API_PRIORITY_OTHER)));
        }
        if (kotlin.jvm.internal.g.a(adtype, "int") && !kotlin.jvm.internal.g.a(bool, Boolean.TRUE) && a(2)) {
            List list2 = f14493g;
            list2.set(1, Integer.valueOf(Math.min(((Number) list2.get(1)).intValue() + 1, (int) Api.BaseClientBuilder.API_PRIORITY_OTHER)));
        }
        if (kotlin.jvm.internal.g.a(adtype, "native") && a(4)) {
            List list3 = f14493g;
            list3.set(3, Integer.valueOf(Math.min(((Number) list3.get(3)).intValue() + 1, (int) Api.BaseClientBuilder.API_PRIORITY_OTHER)));
        }
        if (kotlin.jvm.internal.g.a(bool, Boolean.TRUE) && a(3)) {
            List list4 = f14493g;
            list4.set(2, Integer.valueOf(Math.min(((Number) list4.get(2)).intValue() + 1, (int) Api.BaseClientBuilder.API_PRIORITY_OTHER)));
        }
    }
}
