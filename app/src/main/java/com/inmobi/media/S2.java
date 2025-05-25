package com.inmobi.media;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import com.inmobi.media.S2;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class S2 extends wc {

    /* renamed from: n  reason: collision with root package name */
    public final A4 f14627n;

    /* renamed from: o  reason: collision with root package name */
    public final String f14628o;

    /* renamed from: p  reason: collision with root package name */
    public final ViewTreeObserver.OnPreDrawListener f14629p;

    /* renamed from: q  reason: collision with root package name */
    public final WeakReference f14630q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S2(Q6 visibilityChecker, Activity activity, A4 a42) {
        super(visibilityChecker, (byte) 1, a42);
        kotlin.jvm.internal.g.e(visibilityChecker, "visibilityChecker");
        kotlin.jvm.internal.g.e(activity, "activity");
        this.f14627n = a42;
        this.f14628o = "S2";
        View decorView = activity.getWindow().getDecorView();
        kotlin.jvm.internal.g.d(decorView, "getDecorView(...)");
        this.f14630q = new WeakReference(decorView);
        ViewTreeObserver viewTreeObserver = decorView.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: qb.x
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
                    return S2.a(S2.this);
                }
            };
            this.f14629p = onPreDrawListener;
            viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
        } else if (a42 != null) {
            ((B4) a42).b("S2", "Visibility Tracker was unable to track views because the  root view tree observer was not alive");
        }
    }

    public static final boolean a(S2 this$0) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        this$0.g();
        return true;
    }

    @Override // com.inmobi.media.wc
    public final void b() {
        A4 a42 = this.f14627n;
        if (a42 != null) {
            String TAG = this.f14628o;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).c(TAG, "unregisterPreDrawListener");
        }
        View view = (View) this.f14630q.get();
        if (view != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f14629p);
            }
        }
        super.b();
    }

    @Override // com.inmobi.media.wc
    public final int c() {
        return 100;
    }

    @Override // com.inmobi.media.wc
    public final void e() {
        A4 a42 = this.f14627n;
        if (a42 != null) {
            String TAG = this.f14628o;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).c(TAG, "pause");
        }
        if (!this.f15609i.get()) {
            A4 a43 = this.f14627n;
            if (a43 != null) {
                String TAG2 = this.f14628o;
                kotlin.jvm.internal.g.d(TAG2, "TAG");
                ((B4) a43).c(TAG2, "unregisterPreDrawListener");
            }
            View view = (View) this.f14630q.get();
            if (view != null) {
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(this.f14629p);
                }
            }
            super.e();
        }
    }

    @Override // com.inmobi.media.wc
    public final void f() {
        A4 a42 = this.f14627n;
        if (a42 != null) {
            String TAG = this.f14628o;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).c(TAG, "resume");
        }
        if (this.f15609i.get()) {
            View view = (View) this.f14630q.get();
            if (view != null) {
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.addOnPreDrawListener(this.f14629p);
                } else {
                    A4 a43 = this.f14627n;
                    if (a43 != null) {
                        String TAG2 = this.f14628o;
                        kotlin.jvm.internal.g.d(TAG2, "TAG");
                        ((B4) a43).b(TAG2, "Visibility Tracker was unable to track views because the root view tree observer was not alive");
                    }
                }
            }
            super.f();
        }
    }

    @Override // com.inmobi.media.wc
    public final void d() {
    }
}
