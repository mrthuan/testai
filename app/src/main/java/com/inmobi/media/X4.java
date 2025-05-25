package com.inmobi.media;

import com.inmobi.media.X4;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Result;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class X4 {

    /* renamed from: a  reason: collision with root package name */
    public final long f14834a;

    public X4(long j10) {
        this.f14834a = j10;
    }

    public final void a(final String message, final String exitData, final int i10, final long j10) {
        kotlin.jvm.internal.g.e(message, "message");
        kotlin.jvm.internal.g.e(exitData, "exitData");
        AbstractC1597d6.f15014a.submit(new Runnable() { // from class: qb.d0
            @Override // java.lang.Runnable
            public final void run() {
                X4.a(X4.this, j10, message, i10, exitData);
            }
        });
    }

    public static final void a(X4 this$0, long j10, String message, int i10, String exitData) {
        Object m13constructorimpl;
        kotlin.jvm.internal.g.e(this$0, "this$0");
        kotlin.jvm.internal.g.e(message, "$message");
        kotlin.jvm.internal.g.e(exitData, "$exitData");
        ArrayList arrayList = new ArrayList();
        CopyOnWriteArrayList copyOnWriteArrayList = E4.f14222a;
        ArrayList arrayList2 = new ArrayList();
        V4 v42 = new V4();
        ArrayList arrayList3 = new ArrayList();
        R5 d10 = AbstractC1882ya.d();
        ArrayList a10 = AbstractC1860x1.a(d10, "hasLoggerFinished=0", null, null, null, null, Integer.valueOf(AbstractC1860x1.a((AbstractC1860x1) d10)), 30);
        U4 u42 = new U4(v42, arrayList3);
        kotlin.jvm.internal.g.e(a10, "<this>");
        Iterator it = kotlin.collections.m.p0(a10).iterator();
        while (it.hasNext()) {
            u42.invoke(it.next());
        }
        C4 c42 = new C4(arrayList2);
        Iterator it2 = kotlin.collections.m.p0(arrayList3).iterator();
        while (it2.hasNext()) {
            c42.invoke(it2.next());
        }
        arrayList.addAll(arrayList2);
        Iterator it3 = arrayList.iterator();
        kotlin.jvm.internal.g.d(it3, "iterator(...)");
        while (it3.hasNext()) {
            Object next = it3.next();
            kotlin.jvm.internal.g.d(next, "next(...)");
            C1554a5 c1554a5 = (C1554a5) next;
            long j11 = c1554a5.f14933a.c.f14593b;
            if (j10 >= j11 && j10 - j11 <= this$0.f14834a) {
                String message2 = "Message - " + message + ", Reason - " + i10 + ", Timestamp - " + j10 + ", Data - " + exitData;
                kotlin.jvm.internal.g.e(message2, "message");
                try {
                    JSONArray jSONArray = c1554a5.f14933a.f14783b;
                    S5 logLevel = S5.c;
                    SimpleDateFormat simpleDateFormat = V5.f14748a;
                    kotlin.jvm.internal.g.e(logLevel, "logLevel");
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("scope", "ERROR");
                    jSONObject.put("timestamp", V5.f14748a.format(new Date()));
                    jSONObject.put("tag", "IncompleteLogFinalizer");
                    jSONObject.put("data", message2);
                    jSONArray.put(jSONObject);
                } catch (Exception unused) {
                }
                String value = String.valueOf(i10);
                kotlin.jvm.internal.g.e(value, "value");
                try {
                    c1554a5.f14933a.f14782a.put("exitReason", value);
                } catch (Exception unused2) {
                }
                try {
                    JSONObject jSONObject2 = c1554a5.f14933a.f14782a;
                    kotlin.jvm.internal.g.e(jSONObject2, "<this>");
                    if (!kotlin.jvm.internal.g.a(jSONObject2.toString(), "{}") && !AbstractC1579c2.a(c1554a5.f14933a.f14783b)) {
                        ScheduledExecutorService scheduledExecutorService = AbstractC1597d6.f15014a;
                        AbstractC1583c6.a(new Z4(c1554a5));
                    }
                    m13constructorimpl = Result.m13constructorimpl(tf.d.f30009a);
                } catch (Throwable th2) {
                    m13constructorimpl = Result.m13constructorimpl(androidx.activity.s.v(th2));
                }
                Throwable m16exceptionOrNullimpl = Result.m16exceptionOrNullimpl(m13constructorimpl);
                if (m16exceptionOrNullimpl != null) {
                    try {
                        Q4.c.a(new J1(m16exceptionOrNullimpl));
                        ScheduledExecutorService scheduledExecutorService2 = AbstractC1597d6.f15014a;
                        Object m13constructorimpl2 = Result.m13constructorimpl(Result.m12boximpl(AbstractC1583c6.a(new Y4(c1554a5))));
                        Throwable m16exceptionOrNullimpl2 = Result.m16exceptionOrNullimpl(m13constructorimpl2);
                        if (m16exceptionOrNullimpl2 != null) {
                            Q4.c.a(new J1(m16exceptionOrNullimpl2));
                            m13constructorimpl2 = Result.m13constructorimpl(tf.d.f30009a);
                        }
                        Result.m13constructorimpl(Result.m12boximpl(m13constructorimpl2));
                    } catch (Throwable th3) {
                        Result.m13constructorimpl(androidx.activity.s.v(th3));
                    }
                }
            }
        }
    }
}
