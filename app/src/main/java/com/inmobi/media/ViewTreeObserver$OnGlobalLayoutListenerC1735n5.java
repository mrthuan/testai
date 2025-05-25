package com.inmobi.media;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

/* renamed from: com.inmobi.media.n5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewTreeObserver$OnGlobalLayoutListenerC1735n5 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a  reason: collision with root package name */
    public final View f15344a;

    /* renamed from: b  reason: collision with root package name */
    public final A4 f15345b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public int f15346d;

    public ViewTreeObserver$OnGlobalLayoutListenerC1735n5(FrameLayout view, A4 a42) {
        kotlin.jvm.internal.g.e(view, "view");
        this.f15344a = view;
        this.f15345b = a42;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        try {
            A4 a42 = this.f15345b;
            if (a42 != null) {
                String str = AbstractC1774q5.f15390a;
                kotlin.jvm.internal.g.d(str, "access$getTAG$p(...)");
                ((B4) a42).a(str, "close called");
            }
            this.c = AbstractC1692k3.a(this.f15344a.getWidth());
            this.f15346d = AbstractC1692k3.a(this.f15344a.getHeight());
            this.f15344a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            Boolean bool = Boolean.FALSE;
            synchronized (bool) {
                bool.notify();
                tf.d dVar = tf.d.f30009a;
            }
        } catch (Exception e10) {
            A4 a43 = this.f15345b;
            if (a43 != null) {
                String str2 = AbstractC1774q5.f15390a;
                ((B4) a43).b(str2, Cc.a(e10, A5.a(str2, "access$getTAG$p(...)", "SDK encountered unexpected error in JavaScriptBridge$1.onGlobalLayout(); ")));
            }
        }
    }
}
