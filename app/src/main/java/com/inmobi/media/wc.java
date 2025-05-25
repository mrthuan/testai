package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public abstract class wc {

    /* renamed from: a  reason: collision with root package name */
    public final Map f15602a;

    /* renamed from: b  reason: collision with root package name */
    public final qc f15603b;
    public final Handler c;

    /* renamed from: d  reason: collision with root package name */
    public final byte f15604d;

    /* renamed from: e  reason: collision with root package name */
    public final A4 f15605e;

    /* renamed from: f  reason: collision with root package name */
    public final int f15606f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f15607g;

    /* renamed from: h  reason: collision with root package name */
    public long f15608h;

    /* renamed from: i  reason: collision with root package name */
    public final AtomicBoolean f15609i;

    /* renamed from: j  reason: collision with root package name */
    public sc f15610j;

    /* renamed from: k  reason: collision with root package name */
    public final tf.c f15611k;

    /* renamed from: l  reason: collision with root package name */
    public final tf.c f15612l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f15613m;

    public wc(qc visibilityChecker, byte b10, A4 a42) {
        kotlin.jvm.internal.g.e(visibilityChecker, "visibilityChecker");
        WeakHashMap weakHashMap = new WeakHashMap(10);
        Handler handler = new Handler(Looper.getMainLooper());
        this.f15602a = weakHashMap;
        this.f15603b = visibilityChecker;
        this.c = handler;
        this.f15604d = b10;
        this.f15605e = a42;
        this.f15606f = 50;
        this.f15607g = new ArrayList(50);
        this.f15609i = new AtomicBoolean(true);
        this.f15611k = kotlin.a.a(new uc(this));
        this.f15612l = kotlin.a.a(new vc(this));
    }

    public final void a(View view, Object obj, int i10) {
        kotlin.jvm.internal.g.e(view, "view");
        A4 a42 = this.f15605e;
        if (a42 != null) {
            ((B4) a42).c("VisibilityTracker", "add view to tracker - minPercent - " + i10 + "  " + this);
        }
        tc tcVar = (tc) this.f15602a.get(view);
        if (tcVar == null) {
            tcVar = new tc();
            this.f15602a.put(view, tcVar);
            this.f15608h++;
        }
        tcVar.f15480a = i10;
        long j10 = this.f15608h;
        tcVar.f15481b = j10;
        tcVar.c = view;
        tcVar.f15482d = obj;
        long j11 = this.f15606f;
        if (j10 % j11 == 0) {
            long j12 = j10 - j11;
            for (Map.Entry entry : this.f15602a.entrySet()) {
                View view2 = (View) entry.getKey();
                if (((tc) entry.getValue()).f15481b < j12) {
                    this.f15607g.add(view2);
                }
            }
            Iterator it = this.f15607g.iterator();
            while (it.hasNext()) {
                View view3 = (View) it.next();
                kotlin.jvm.internal.g.b(view3);
                a(view3);
            }
            this.f15607g.clear();
        }
        if (this.f15602a.size() == 1) {
            f();
        }
    }

    public void b() {
        A4 a42 = this.f15605e;
        if (a42 != null) {
            ((B4) a42).c("VisibilityTracker", "destroy " + this);
        }
        a();
        this.f15610j = null;
        this.f15609i.set(true);
    }

    public abstract int c();

    public abstract void d();

    public void e() {
        A4 a42 = this.f15605e;
        if (a42 != null) {
            ((B4) a42).c("VisibilityTracker", "pause " + this);
        }
        ((rc) this.f15611k.getValue()).run();
        this.c.removeCallbacksAndMessages(null);
        this.f15613m = false;
        this.f15609i.set(true);
    }

    public void f() {
        A4 a42 = this.f15605e;
        if (a42 != null) {
            ((B4) a42).c("VisibilityTracker", "resume " + this);
        }
        this.f15609i.set(false);
        g();
    }

    public final void g() {
        toString();
        if (!this.f15613m && !this.f15609i.get()) {
            this.f15613m = true;
            ((ScheduledThreadPoolExecutor) G3.c.getValue()).schedule((Runnable) this.f15612l.getValue(), c(), TimeUnit.MILLISECONDS);
        }
    }

    public final void a(View view) {
        kotlin.jvm.internal.g.e(view, "view");
        A4 a42 = this.f15605e;
        if (a42 != null) {
            ((B4) a42).c("VisibilityTracker", "removed view from tracker " + this);
        }
        if (((tc) this.f15602a.remove(view)) != null) {
            this.f15608h--;
            if (this.f15602a.isEmpty()) {
                e();
            }
        }
    }

    public final void a() {
        A4 a42 = this.f15605e;
        if (a42 != null) {
            ((B4) a42).c("VisibilityTracker", "clear " + this);
        }
        this.f15602a.clear();
        this.c.removeMessages(0);
        this.f15613m = false;
    }
}
