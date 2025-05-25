package com.inmobi.media;

import android.view.View;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class W3 {

    /* renamed from: k  reason: collision with root package name */
    public static final T3 f14772k = new T3();

    /* renamed from: a  reason: collision with root package name */
    public final byte f14773a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14774b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final int f14775d;

    /* renamed from: e  reason: collision with root package name */
    public final int f14776e;

    /* renamed from: f  reason: collision with root package name */
    public final A4 f14777f;

    /* renamed from: g  reason: collision with root package name */
    public C1665i4 f14778g;

    /* renamed from: h  reason: collision with root package name */
    public Z3 f14779h;

    /* renamed from: i  reason: collision with root package name */
    public final LinkedHashMap f14780i = new LinkedHashMap();

    /* renamed from: j  reason: collision with root package name */
    public final U3 f14781j = new U3(this);

    public W3(byte b10, String str, int i10, int i11, int i12, A4 a42) {
        this.f14773a = b10;
        this.f14774b = str;
        this.c = i10;
        this.f14775d = i11;
        this.f14776e = i12;
        this.f14777f = a42;
    }

    public final void a(View view) {
        C1665i4 c1665i4;
        kotlin.jvm.internal.g.e(view, "view");
        A4 a42 = this.f14777f;
        if (a42 != null) {
            ((B4) a42).c("HtmlAdTracker", "stopTrackingForImpression");
        }
        if (kotlin.jvm.internal.g.a(this.f14774b, "video") || kotlin.jvm.internal.g.a(this.f14774b, "audio") || (c1665i4 = this.f14778g) == null) {
            return;
        }
        c1665i4.f15182a.remove(view);
        c1665i4.f15183b.remove(view);
        c1665i4.c.a(view);
        if (!c1665i4.f15182a.isEmpty()) {
            return;
        }
        A4 a43 = this.f14777f;
        if (a43 != null) {
            ((B4) a43).a("HtmlAdTracker", "Impression tracker is free, removing it");
        }
        C1665i4 c1665i42 = this.f14778g;
        if (c1665i42 != null) {
            c1665i42.f15182a.clear();
            c1665i42.f15183b.clear();
            c1665i42.c.a();
            c1665i42.f15185e.removeMessages(0);
            c1665i42.c.b();
        }
        this.f14778g = null;
    }

    public final void b(View view) {
        kotlin.jvm.internal.g.e(view, "view");
        A4 a42 = this.f14777f;
        if (a42 != null) {
            ((B4) a42).c("HtmlAdTracker", "stopTrackingForVisibility");
        }
        Z3 z32 = this.f14779h;
        if (z32 != null) {
            z32.a(view);
            if (!(!z32.f15602a.isEmpty())) {
                A4 a43 = this.f14777f;
                if (a43 != null) {
                    ((B4) a43).a("HtmlAdTracker", "Visibility tracker is free, removing it");
                }
                Z3 z33 = this.f14779h;
                if (z33 != null) {
                    z33.b();
                }
                this.f14779h = null;
            }
        }
        this.f14780i.remove(view);
    }

    public final void b() {
        A4 a42 = this.f14777f;
        if (a42 != null) {
            ((B4) a42).c("HtmlAdTracker", "onActivityStopped");
        }
        C1665i4 c1665i4 = this.f14778g;
        if (c1665i4 != null) {
            String TAG = c1665i4.f15184d;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            c1665i4.c.a();
            c1665i4.f15185e.removeCallbacksAndMessages(null);
            c1665i4.f15183b.clear();
        }
        Z3 z32 = this.f14779h;
        if (z32 != null) {
            z32.e();
        }
    }

    public final void a() {
        A4 a42 = this.f14777f;
        if (a42 != null) {
            ((B4) a42).c("HtmlAdTracker", "onActivityStarted");
        }
        C1665i4 c1665i4 = this.f14778g;
        if (c1665i4 != null) {
            String TAG = c1665i4.f15184d;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            for (Map.Entry entry : c1665i4.f15182a.entrySet()) {
                C1637g4 c1637g4 = (C1637g4) entry.getValue();
                c1665i4.c.a((View) entry.getKey(), c1637g4.f15092a, c1637g4.f15093b);
            }
            if (!c1665i4.f15185e.hasMessages(0)) {
                c1665i4.f15185e.postDelayed(c1665i4.f15186f, c1665i4.f15187g);
            }
            c1665i4.c.f();
        }
        Z3 z32 = this.f14779h;
        if (z32 != null) {
            z32.f();
        }
    }
}
