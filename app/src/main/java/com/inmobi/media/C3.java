package com.inmobi.media;

import com.inmobi.media.C3;
import com.inmobi.media.G8;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;

/* loaded from: classes2.dex */
public abstract class C3 {

    /* renamed from: a  reason: collision with root package name */
    public static final tf.c f14158a = kotlin.a.a(B3.f14140a);

    public static final void a(G8 request, int i10, C1888z3 eventPayload, String str, int i11, long j10, Ib ib2, A3 listener, boolean z10) {
        kotlin.jvm.internal.g.e(request, "$request");
        kotlin.jvm.internal.g.e(eventPayload, "$eventPayload");
        kotlin.jvm.internal.g.e(listener, "$listener");
        H8 b10 = request.b();
        if (b10.b()) {
            if (i10 > 1) {
                b10.a();
                a(eventPayload, str, i11, i10 - 1, j10, ib2, listener, z10);
                return;
            }
            listener.a(eventPayload, true);
            return;
        }
        String TAG = listener.f14118d;
        kotlin.jvm.internal.g.d(TAG, "TAG");
        listener.f14116a.a(eventPayload.f15699a);
        listener.f14116a.a(System.currentTimeMillis());
        if (listener.c != null) {
            List eventIds = eventPayload.f15699a;
            kotlin.jvm.internal.g.e(eventIds, "eventIds");
            Integer num = AbstractC1700kb.c;
            if (num != null && eventIds.contains(Integer.valueOf(num.intValue()))) {
                AbstractC1700kb.f15270b = 0;
                C1851w5 c1851w5 = AbstractC1700kb.f15269a;
                if (c1851w5 != null) {
                    c1851w5.a("count", 0);
                }
                AbstractC1700kb.c = null;
            }
        }
        listener.f14119e.set(false);
    }

    public static void a(final C1888z3 c1888z3, final String str, final int i10, final int i11, final long j10, final Ib ib2, final A3 a32, final boolean z10) {
        long j11;
        long j12;
        if (K8.a() == null && Ha.m()) {
            final G8 g82 = new G8("POST", str, ib2, false, (A4) null, (String) null, 104);
            HashMap z02 = kotlin.collections.q.z0(new Pair("payload", c1888z3.f15700b));
            HashMap hashMap = g82.f14284k;
            if (hashMap != null) {
                hashMap.putAll(z02);
            }
            int i12 = i10 - i11;
            if (i12 > 0) {
                g82.f14282i.putAll(kotlin.collections.q.z0(new Pair("X-im-retry-count", String.valueOf(i12))));
            }
            g82.f14297x = false;
            g82.f14293t = false;
            g82.f14294u = false;
            if (z10) {
                if (i11 != i10) {
                    j12 = ((long) Math.pow(2.0d, i12)) * j10;
                    j11 = j12;
                    Object value = f14158a.getValue();
                    kotlin.jvm.internal.g.d(value, "getValue(...)");
                    ((ScheduledExecutorService) value).schedule(new Runnable() { // from class: qb.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            C3.a(G8.this, i11, c1888z3, str, i10, j10, ib2, a32, z10);
                        }
                    }, j11, TimeUnit.SECONDS);
                    return;
                }
            } else if (i11 != i10) {
                j11 = j10;
                Object value2 = f14158a.getValue();
                kotlin.jvm.internal.g.d(value2, "getValue(...)");
                ((ScheduledExecutorService) value2).schedule(new Runnable() { // from class: qb.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3.a(G8.this, i11, c1888z3, str, i10, j10, ib2, a32, z10);
                    }
                }, j11, TimeUnit.SECONDS);
                return;
            }
            j12 = 0;
            j11 = j12;
            Object value22 = f14158a.getValue();
            kotlin.jvm.internal.g.d(value22, "getValue(...)");
            ((ScheduledExecutorService) value22).schedule(new Runnable() { // from class: qb.b
                @Override // java.lang.Runnable
                public final void run() {
                    C3.a(G8.this, i11, c1888z3, str, i10, j10, ib2, a32, z10);
                }
            }, j11, TimeUnit.SECONDS);
            return;
        }
        a32.a(c1888z3, false);
    }
}
