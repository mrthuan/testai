package com.inmobi.media;

import android.content.Context;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.commons.core.configs.Config;
import com.inmobi.commons.core.configs.SignalsConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.EmptyList;
import org.json.JSONArray;

/* loaded from: classes2.dex */
public final class D2 {

    /* renamed from: a  reason: collision with root package name */
    public static final D2 f14184a;

    /* renamed from: b  reason: collision with root package name */
    public static LinkedList f14185b;
    public static LinkedList c;

    /* renamed from: d  reason: collision with root package name */
    public static SignalsConfig f14186d;

    /* renamed from: e  reason: collision with root package name */
    public static AdConfig f14187e;

    /* renamed from: f  reason: collision with root package name */
    public static byte[] f14188f;

    /* renamed from: g  reason: collision with root package name */
    public static String f14189g;

    static {
        SignalsConfig signalsConfig;
        AdConfig adConfig;
        List<String> list;
        AdConfig.ContextualDataConfig contextualData;
        D2 d22 = new D2();
        f14184a = d22;
        LinkedList linkedList = new LinkedList();
        f14185b = linkedList;
        Object clone = linkedList.clone();
        kotlin.jvm.internal.g.c(clone, "null cannot be cast to non-null type java.util.LinkedList<com.inmobi.signals.contextualdata.EncryptedContextualData>");
        c = (LinkedList) clone;
        C2 c22 = new C2();
        B2 b22 = new B2();
        LinkedHashMap linkedHashMap = C1732n2.f15334a;
        Config a10 = C1705l2.a("signals", Ha.b(), c22);
        String str = null;
        if (a10 instanceof SignalsConfig) {
            signalsConfig = (SignalsConfig) a10;
        } else {
            signalsConfig = null;
        }
        f14186d = signalsConfig;
        Config a11 = C1705l2.a("ads", Ha.b(), b22);
        if (a11 instanceof AdConfig) {
            adConfig = (AdConfig) a11;
        } else {
            adConfig = null;
        }
        f14187e = adConfig;
        SignalsConfig signalsConfig2 = f14186d;
        if (signalsConfig2 != null) {
            str = signalsConfig2.getAK();
        }
        f14188f = AbstractC1823u3.a(str);
        AdConfig adConfig2 = f14187e;
        if (adConfig2 == null || (contextualData = adConfig2.getContextualData()) == null || (list = contextualData.getSkipFields()) == null) {
            list = EmptyList.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(E2.f14212j);
        arrayList.removeAll(list);
        f14189g = kotlin.collections.m.w0(arrayList, ",", null, null, null, 62);
        Context d10 = Ha.d();
        if (d10 != null) {
            ConcurrentHashMap concurrentHashMap = C1851w5.f15578b;
            C1851w5 a12 = AbstractC1838v5.a(d10, "c_data_store");
            Context d11 = Ha.d();
            int i10 = 1;
            if (d11 != null) {
                i10 = AbstractC1838v5.a(d11, "c_data_store").f15579a.getInt("akv", 1);
            }
            SignalsConfig signalsConfig3 = f14186d;
            if (signalsConfig3 == null || signalsConfig3.getAKV() != i10) {
                SignalsConfig signalsConfig4 = f14186d;
                if (signalsConfig4 != null) {
                    i10 = signalsConfig4.getAKV();
                }
                a12.a("akv", i10);
                d22.d();
            }
        }
    }

    public static final void a() {
        AdConfig.ContextualDataConfig contextualData;
        AdConfig.ContextualDataConfig contextualData2;
        AdConfig.ContextualDataConfig contextualData3;
        long currentTimeMillis = System.currentTimeMillis();
        AdConfig adConfig = f14187e;
        int i10 = 0;
        long expiryTime = currentTimeMillis - (((adConfig == null || (contextualData3 = adConfig.getContextualData()) == null) ? 0 : contextualData3.getExpiryTime()) * 1000);
        AdConfig adConfig2 = f14187e;
        a(expiryTime, (adConfig2 == null || (contextualData2 = adConfig2.getContextualData()) == null) ? 0 : contextualData2.getMaxAdRecords());
        Object clone = f14185b.clone();
        kotlin.jvm.internal.g.c(clone, "null cannot be cast to non-null type java.util.LinkedList<com.inmobi.signals.contextualdata.EncryptedContextualData>");
        c = (LinkedList) clone;
        AdConfig adConfig3 = f14187e;
        if (adConfig3 != null && (contextualData = adConfig3.getContextualData()) != null) {
            i10 = contextualData.getMaxAdRecords();
        }
        C1887z2 c1887z2 = (C1887z2) AbstractC1882ya.f15687d.getValue();
        c1887z2.getClass();
        c1887z2.a("id NOT IN (SELECT id FROM ( SELECT id FROM c_data WHERE timestamp > " + expiryTime + " ORDER BY timestamp DESC LIMIT " + i10 + ") foo);", null);
    }

    public static String b() {
        int i10;
        AdConfig.ContextualDataConfig contextualData;
        if (f14189g.length() == 0) {
            return "";
        }
        JSONArray jSONArray = new JSONArray();
        long currentTimeMillis = System.currentTimeMillis();
        AdConfig adConfig = f14187e;
        if (adConfig != null && (contextualData = adConfig.getContextualData()) != null) {
            i10 = contextualData.getExpiryTime();
        } else {
            i10 = 0;
        }
        long j10 = currentTimeMillis - (i10 * 1000);
        LinkedList linkedList = c;
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedList) {
            if (((C1810t3) obj).f15460b >= j10) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArray.put(kotlin.text.k.n0(((C1810t3) it.next()).f15459a).toString());
        }
        String jSONArray2 = jSONArray.toString();
        kotlin.jvm.internal.g.d(jSONArray2, "toString(...)");
        return jSONArray2;
    }

    public static boolean c() {
        boolean z10;
        int i10;
        AdConfig.ContextualDataConfig contextualData;
        Context d10 = Ha.d();
        if (d10 != null) {
            ConcurrentHashMap concurrentHashMap = C1851w5.f15578b;
            z10 = AbstractC1838v5.a(d10, "c_data_store").f15579a.getBoolean("isEnabled", true);
        } else {
            z10 = true;
        }
        if (!z10) {
            return false;
        }
        AdConfig adConfig = f14187e;
        if (adConfig != null && (contextualData = adConfig.getContextualData()) != null) {
            i10 = contextualData.getMaxAdRecords();
        } else {
            i10 = 1;
        }
        if (i10 > 0) {
            return true;
        }
        return false;
    }

    public final void d() {
        synchronized (this) {
            C1887z2 c1887z2 = (C1887z2) AbstractC1882ya.f15687d.getValue();
            c1887z2.getClass();
            try {
                R2.a(c1887z2.f15618a, null, null);
            } catch (Exception unused) {
            }
            LinkedList linkedList = new LinkedList();
            f14185b = linkedList;
            Object clone = linkedList.clone();
            kotlin.jvm.internal.g.c(clone, "null cannot be cast to non-null type java.util.LinkedList<com.inmobi.signals.contextualdata.EncryptedContextualData>");
            c = (LinkedList) clone;
            tf.d dVar = tf.d.f30009a;
        }
    }

    public static void a(long j10, int i10) {
        for (int size = f14185b.size(); size > i10; size--) {
            f14185b.remove();
        }
        Iterator it = f14185b.iterator();
        kotlin.jvm.internal.g.d(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            kotlin.jvm.internal.g.d(next, "next(...)");
            if (((C1810t3) next).f15460b >= j10) {
                return;
            }
            it.remove();
        }
    }
}
