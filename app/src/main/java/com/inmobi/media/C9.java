package com.inmobi.media;

import android.content.Context;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class C9 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f14164a;

    /* renamed from: b  reason: collision with root package name */
    public final long f14165b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f14166d;

    /* renamed from: e  reason: collision with root package name */
    public final U5 f14167e;

    /* renamed from: f  reason: collision with root package name */
    public final Ca f14168f;

    /* renamed from: g  reason: collision with root package name */
    public final List f14169g;

    /* renamed from: h  reason: collision with root package name */
    public final ConcurrentHashMap f14170h;

    /* renamed from: i  reason: collision with root package name */
    public final AtomicBoolean f14171i;

    /* renamed from: j  reason: collision with root package name */
    public String f14172j;

    /* renamed from: k  reason: collision with root package name */
    public final AtomicInteger f14173k;

    public C9(Context context, double d10, S5 logLevel, long j10, int i10, boolean z10) {
        kotlin.jvm.internal.g.e(context, "context");
        kotlin.jvm.internal.g.e(logLevel, "logLevel");
        this.f14164a = context;
        this.f14165b = j10;
        this.c = i10;
        this.f14166d = z10;
        this.f14167e = new U5(logLevel);
        this.f14168f = new Ca(d10);
        this.f14169g = Collections.synchronizedList(new ArrayList());
        this.f14170h = new ConcurrentHashMap();
        this.f14171i = new AtomicBoolean(false);
        this.f14172j = "";
        this.f14173k = new AtomicInteger(0);
    }

    public final void a(S5 logLevel, String tag, String message) {
        kotlin.jvm.internal.g.e(logLevel, "logLevel");
        kotlin.jvm.internal.g.e(tag, "tag");
        kotlin.jvm.internal.g.e(message, "message");
        if (this.f14171i.get()) {
            return;
        }
        SimpleDateFormat simpleDateFormat = V5.f14748a;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("scope", logLevel.name());
        jSONObject.put("timestamp", V5.f14748a.format(new Date()));
        jSONObject.put("tag", tag);
        jSONObject.put("data", message);
        AbstractC1597d6.f15014a.submit(new a6.e(3, this, logLevel, jSONObject));
    }

    public final void b() {
        Objects.toString(this.f14171i);
        if ((this.f14166d || this.f14168f.a()) && !this.f14171i.getAndSet(true)) {
            AbstractC1597d6.f15014a.submit(new androidx.activity.i(this, 5));
        }
    }

    public final String c() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        synchronized (this.f14170h) {
            for (Map.Entry entry : this.f14170h.entrySet()) {
                jSONObject2.put((String) entry.getKey(), entry.getValue());
            }
            tf.d dVar = tf.d.f30009a;
        }
        jSONObject.put("vitals", jSONObject2);
        jSONObject.put("log", d());
        String jSONObject3 = jSONObject.toString();
        kotlin.jvm.internal.g.d(jSONObject3, "toString(...)");
        return jSONObject3;
    }

    public final JSONArray d() {
        JSONArray jSONArray = new JSONArray();
        List logData = this.f14169g;
        kotlin.jvm.internal.g.d(logData, "logData");
        synchronized (logData) {
            List<JSONObject> logData2 = this.f14169g;
            kotlin.jvm.internal.g.d(logData2, "logData");
            for (JSONObject jSONObject : logData2) {
                jSONArray.put(jSONObject);
            }
            tf.d dVar = tf.d.f30009a;
        }
        return jSONArray;
    }

    public static final void b(C9 this$0) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        Objects.toString(this$0.f14171i);
        ScheduledExecutorService scheduledExecutorService = AbstractC1597d6.f15014a;
        if (Result.m16exceptionOrNullimpl(AbstractC1583c6.a(new B9(this$0, true))) != null) {
            try {
                Result.m13constructorimpl(tf.d.f30009a);
            } catch (Throwable th2) {
                Result.m13constructorimpl(androidx.activity.s.v(th2));
            }
        }
    }

    public static final void a(C9 this$0, S5 logLevel, JSONObject data) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        kotlin.jvm.internal.g.e(logLevel, "$logLevel");
        kotlin.jvm.internal.g.e(data, "$data");
        try {
            U5 u52 = this$0.f14167e;
            u52.getClass();
            int ordinal = u52.f14732a.ordinal();
            boolean z10 = true;
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (logLevel == S5.f14637d) {
                        }
                        z10 = false;
                    } else if (logLevel != S5.c) {
                        if (logLevel == S5.f14637d) {
                        }
                        z10 = false;
                    }
                } else if (logLevel != S5.f14636b) {
                    if (logLevel != S5.c) {
                        if (logLevel == S5.f14637d) {
                        }
                        z10 = false;
                    }
                }
            }
            if (z10) {
                this$0.f14169g.add(data);
            }
        } catch (Exception e10) {
            Q4 q42 = Q4.f14590a;
            Q4.c.a(AbstractC1863x4.a(e10, "event"));
        }
    }

    public final void a() {
        Objects.toString(this.f14171i);
        if ((this.f14166d || this.f14168f.a()) && !this.f14171i.get()) {
            AbstractC1597d6.f15014a.submit(new b1.e(this, 4));
        }
    }

    public static final void a(C9 this$0) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        this$0.f14173k.getAndIncrement();
        Objects.toString(this$0.f14171i);
        ScheduledExecutorService scheduledExecutorService = AbstractC1597d6.f15014a;
        if (Result.m16exceptionOrNullimpl(AbstractC1583c6.a(new B9(this$0, false))) != null) {
            try {
                Result.m13constructorimpl(tf.d.f30009a);
            } catch (Throwable th2) {
                Result.m13constructorimpl(androidx.activity.s.v(th2));
            }
        }
    }
}
