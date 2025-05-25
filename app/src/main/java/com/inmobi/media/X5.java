package com.inmobi.media;

import android.content.Context;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.EmptyList;

/* loaded from: classes2.dex */
public final class X5 {

    /* renamed from: a  reason: collision with root package name */
    public final String f14835a;

    /* renamed from: b  reason: collision with root package name */
    public final long f14836b;
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final int f14837d;

    /* renamed from: e  reason: collision with root package name */
    public final int f14838e;

    /* renamed from: f  reason: collision with root package name */
    public final WeakReference f14839f;

    /* renamed from: g  reason: collision with root package name */
    public final AtomicBoolean f14840g;

    public X5(Context context, String url, long j10, long j11, int i10, int i11) {
        kotlin.jvm.internal.g.e(context, "context");
        kotlin.jvm.internal.g.e(url, "url");
        this.f14835a = url;
        this.f14836b = j10;
        this.c = j11;
        this.f14837d = i10;
        this.f14838e = i11;
        this.f14839f = new WeakReference(context);
        this.f14840g = new AtomicBoolean(false);
        a();
    }

    public final void a() {
        Context context = (Context) this.f14839f.get();
        if (context != null) {
            AbstractC1597d6.f15014a.submit(new l1.a(7, this, context));
        }
    }

    public static final void a(X5 this$0, Context context) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        kotlin.jvm.internal.g.e(context, "$context");
        if (this$0.f14840g.get()) {
            return;
        }
        if (!this$0.f14840g.get()) {
            int a10 = AbstractC1860x1.a((AbstractC1860x1) AbstractC1882ya.d());
            R5 d10 = AbstractC1882ya.d();
            d10.getClass();
            ArrayList a11 = AbstractC1860x1.a(d10, "hasLoggerFinished=1", null, null, null, null, Integer.valueOf(a10), 30);
            W5 w52 = new W5(this$0, context);
            kotlin.jvm.internal.g.e(a11, "<this>");
            Iterator it = kotlin.collections.m.p0(a11).iterator();
            while (it.hasNext()) {
                w52.invoke(it.next());
            }
        }
        ScheduledExecutorService scheduledExecutorService = AbstractC1597d6.f15014a;
        AbstractC1583c6.a(AbstractC1882ya.d(), Calendar.getInstance().getTimeInMillis() - this$0.c, this$0.f14838e);
    }

    public final void a(Context context, String str, Q5 q5) {
        Context context2;
        Iterable<String> iterable;
        R5 d10;
        int i10;
        if (this.f14840g.get()) {
            return;
        }
        if (q5.f14594d == 0 || System.currentTimeMillis() - q5.f14594d >= this.f14836b) {
            H8 b10 = new Y5(str, q5).b();
            if (b10.b() && (i10 = q5.c + 1) < this.f14837d) {
                D8 d82 = b10.c;
                if ((d82 != null ? d82.f14201a : null) != EnumC1849w3.f15568s) {
                    Q5 q52 = new Q5(q5.f14592a, q5.f14593b, i10, System.currentTimeMillis(), false, 0, 48);
                    AbstractC1882ya.d().b(q52);
                    ScheduledExecutorService scheduledExecutorService = AbstractC1597d6.f15014a;
                    AbstractC1597d6.f15014a.schedule(new qb.e0(0, this, context, str, q52), this.f14836b, TimeUnit.MILLISECONDS);
                    return;
                }
            }
            AbstractC1611e6.a(q5.f14592a);
            AbstractC1882ya.d().a(q5);
            if (((Context) this.f14839f.get()) != null) {
                ScheduledExecutorService scheduledExecutorService2 = AbstractC1597d6.f15014a;
                String directoryPath = context2.getFilesDir() + "/logging";
                kotlin.jvm.internal.g.e(directoryPath, "directoryPath");
                File file = new File(directoryPath);
                if (file.exists() && file.isDirectory()) {
                    String[] list = file.list();
                    if (list == null || (iterable = kotlin.collections.f.H(list)) == null) {
                        iterable = EmptyList.INSTANCE;
                    }
                } else {
                    iterable = EmptyList.INSTANCE;
                }
                for (String fileName : iterable) {
                    AbstractC1882ya.d().getClass();
                    kotlin.jvm.internal.g.e(fileName, "fileName");
                    if (!(!AbstractC1860x1.a(d10, "filename=\"" + fileName + '\"', null, null, null, null, null, 62).isEmpty())) {
                        AbstractC1611e6.a(fileName);
                    }
                }
            }
        }
    }

    public static final void a(X5 this$0, Context context, String url, Q5 updatedData) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        kotlin.jvm.internal.g.e(context, "$context");
        kotlin.jvm.internal.g.e(url, "$url");
        kotlin.jvm.internal.g.e(updatedData, "$updatedData");
        this$0.a(context, url, updatedData);
    }
}
