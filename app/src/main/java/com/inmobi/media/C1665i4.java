package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.inmobi.media.i4  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1665i4 {

    /* renamed from: a  reason: collision with root package name */
    public final Map f15182a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f15183b;
    public final wc c;

    /* renamed from: d  reason: collision with root package name */
    public final String f15184d;

    /* renamed from: e  reason: collision with root package name */
    public final Handler f15185e;

    /* renamed from: f  reason: collision with root package name */
    public final RunnableC1651h4 f15186f;

    /* renamed from: g  reason: collision with root package name */
    public final long f15187g;

    /* renamed from: h  reason: collision with root package name */
    public final InterfaceC1623f4 f15188h;

    public C1665i4(AdConfig.ViewabilityConfig viewabilityConfig, wc visibilityTracker, InterfaceC1623f4 listener) {
        kotlin.jvm.internal.g.e(viewabilityConfig, "viewabilityConfig");
        kotlin.jvm.internal.g.e(visibilityTracker, "visibilityTracker");
        kotlin.jvm.internal.g.e(listener, "listener");
        WeakHashMap weakHashMap = new WeakHashMap();
        WeakHashMap weakHashMap2 = new WeakHashMap();
        Handler handler = new Handler(Looper.getMainLooper());
        this.f15182a = weakHashMap;
        this.f15183b = weakHashMap2;
        this.c = visibilityTracker;
        this.f15184d = "i4";
        this.f15187g = viewabilityConfig.getImpressionPollIntervalMillis();
        C1609e4 c1609e4 = new C1609e4(this);
        A4 a42 = visibilityTracker.f15605e;
        if (a42 != null) {
            ((B4) a42).c("VisibilityTracker", "setVisibilityTrackerListener logger");
        }
        visibilityTracker.f15610j = c1609e4;
        this.f15185e = handler;
        this.f15186f = new RunnableC1651h4(this);
        this.f15188h = listener;
    }

    public final void a(View view, Object token, int i10, int i11) {
        kotlin.jvm.internal.g.e(view, "view");
        kotlin.jvm.internal.g.e(token, "token");
        C1637g4 c1637g4 = (C1637g4) this.f15182a.get(view);
        if (kotlin.jvm.internal.g.a(c1637g4 != null ? c1637g4.f15092a : null, token)) {
            return;
        }
        a(view);
        this.f15182a.put(view, new C1637g4(token, i10, i11));
        this.c.a(view, token, i10);
    }

    public final void a(View view) {
        kotlin.jvm.internal.g.e(view, "view");
        this.f15182a.remove(view);
        this.f15183b.remove(view);
        this.c.a(view);
    }
}
