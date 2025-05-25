package com.inmobi.media;

import android.content.Context;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.EmptyList;

/* loaded from: classes2.dex */
public final class A2 {

    /* renamed from: a  reason: collision with root package name */
    public final C1646h f14110a;

    /* renamed from: b  reason: collision with root package name */
    public final long f14111b;
    public final String c = "A2";

    /* renamed from: d  reason: collision with root package name */
    public final E2 f14112d = new E2();

    /* renamed from: e  reason: collision with root package name */
    public long f14113e = -1;

    /* renamed from: f  reason: collision with root package name */
    public final AtomicBoolean f14114f = new AtomicBoolean();

    /* renamed from: g  reason: collision with root package name */
    public final AtomicBoolean f14115g = new AtomicBoolean();

    public A2(C1646h c1646h, long j10) {
        this.f14110a = c1646h;
        this.f14111b = j10;
    }

    public final void a() {
        C1646h c1646h;
        C1646h c1646h2;
        Long m10;
        String h10;
        Boolean C;
        kotlin.jvm.internal.g.b(this.c);
        C1646h c1646h3 = this.f14110a;
        if (c1646h3 != null && (C = c1646h3.C()) != null) {
            boolean booleanValue = C.booleanValue();
            D2 d22 = D2.f14184a;
            Context d10 = Ha.d();
            if (d10 != null && booleanValue != D2.c()) {
                ConcurrentHashMap concurrentHashMap = C1851w5.f15578b;
                AbstractC1838v5.a(d10, "c_data_store").a("isEnabled", booleanValue);
                if (!booleanValue) {
                    d22.d();
                }
            }
        }
        if (D2.c() && !this.f14114f.getAndSet(true)) {
            this.f14113e = System.currentTimeMillis();
            if (!this.f14115g.get()) {
                C1646h c1646h4 = this.f14110a;
                if ((c1646h4 != null ? c1646h4.h() : null) != null && (h10 = this.f14110a.h()) != null) {
                    E2 e22 = this.f14112d;
                    e22.getClass();
                    e22.f14213a = h10;
                    kotlin.jvm.internal.g.b(this.c);
                }
            }
            if (!this.f14115g.get() && (c1646h2 = this.f14110a) != null && (m10 = c1646h2.m()) != null) {
                this.f14112d.f14214b = m10.longValue();
                kotlin.jvm.internal.g.b(this.c);
            }
            if (!this.f14115g.get()) {
                this.f14112d.f14216e = this.f14111b;
                kotlin.jvm.internal.g.b(this.c);
            }
            if (!this.f14115g.get() && (c1646h = this.f14110a) != null) {
                this.f14112d.f14217f = c1646h.n();
                kotlin.jvm.internal.g.b(this.c);
            }
            long j10 = this.f14113e / 1000;
            if (this.f14115g.get()) {
                return;
            }
            this.f14112d.c = j10;
            kotlin.jvm.internal.g.b(this.c);
        }
    }

    public final void b() {
        if (!D2.c()) {
            kotlin.jvm.internal.g.b(this.c);
        } else if (!this.f14114f.get()) {
            kotlin.jvm.internal.g.b(this.c);
        } else {
            int currentTimeMillis = (int) (System.currentTimeMillis() - this.f14113e);
            if (!this.f14115g.get()) {
                this.f14112d.f14215d = currentTimeMillis;
                kotlin.jvm.internal.g.b(this.c);
            }
            if (this.f14115g.getAndSet(true)) {
                kotlin.jvm.internal.g.b(this.c);
                return;
            }
            kotlin.jvm.internal.g.b(this.c);
            Ha.a(new androidx.activity.b(this, 10));
        }
    }

    public static final void a(A2 this$0) {
        List<String> list;
        AdConfig.ContextualDataConfig contextualData;
        AdConfig.ContextualDataConfig contextualData2;
        AdConfig.ContextualDataConfig contextualData3;
        AdConfig.ContextualDataConfig contextualData4;
        kotlin.jvm.internal.g.e(this$0, "this$0");
        D2 d22 = D2.f14184a;
        E2 contextualDataModel = this$0.f14112d;
        kotlin.jvm.internal.g.e(contextualDataModel, "contextualDataModel");
        synchronized (d22) {
            long currentTimeMillis = System.currentTimeMillis();
            AdConfig adConfig = D2.f14187e;
            int i10 = 0;
            long expiryTime = currentTimeMillis - (((adConfig == null || (contextualData4 = adConfig.getContextualData()) == null) ? 0 : contextualData4.getExpiryTime()) * 1000);
            AdConfig adConfig2 = D2.f14187e;
            D2.a(expiryTime, ((adConfig2 == null || (contextualData3 = adConfig2.getContextualData()) == null) ? 0 : contextualData3.getMaxAdRecords()) - 1);
            AdConfig adConfig3 = D2.f14187e;
            if (adConfig3 == null || (contextualData2 = adConfig3.getContextualData()) == null || (list = contextualData2.getSkipFields()) == null) {
                list = EmptyList.INSTANCE;
            }
            String jSONArray = F2.a(contextualDataModel, list).toString();
            kotlin.jvm.internal.g.d(jSONArray, "toString(...)");
            C1810t3 c1810t3 = new C1810t3(AbstractC1823u3.a(jSONArray, D2.f14188f), currentTimeMillis);
            D2.f14185b.add(c1810t3);
            Object clone = D2.f14185b.clone();
            kotlin.jvm.internal.g.c(clone, "null cannot be cast to non-null type java.util.LinkedList<com.inmobi.signals.contextualdata.EncryptedContextualData>");
            D2.c = (LinkedList) clone;
            AdConfig adConfig4 = D2.f14187e;
            if (adConfig4 != null && (contextualData = adConfig4.getContextualData()) != null) {
                i10 = contextualData.getMaxAdRecords();
            }
            C1887z2 c1887z2 = (C1887z2) AbstractC1882ya.f15687d.getValue();
            c1887z2.getClass();
            Objects.toString(c1810t3);
            c1887z2.a(c1810t3);
            c1887z2.a("id NOT IN (SELECT id FROM ( SELECT id FROM c_data WHERE timestamp > " + expiryTime + " ORDER BY timestamp DESC LIMIT " + i10 + ") foo);", null);
            tf.d dVar = tf.d.f30009a;
        }
    }
}
