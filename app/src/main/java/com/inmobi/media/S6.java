package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class S6 {

    /* renamed from: a  reason: collision with root package name */
    public final byte f14639a;

    /* renamed from: b  reason: collision with root package name */
    public final A4 f14640b;
    public final String c = "S6";

    /* renamed from: d  reason: collision with root package name */
    public final WeakHashMap f14641d = new WeakHashMap();

    /* renamed from: e  reason: collision with root package name */
    public final WeakHashMap f14642e = new WeakHashMap();

    /* renamed from: f  reason: collision with root package name */
    public final LinkedHashMap f14643f = new LinkedHashMap();

    /* renamed from: g  reason: collision with root package name */
    public final P6 f14644g = new P6();

    /* renamed from: h  reason: collision with root package name */
    public final R6 f14645h = new R6(this);

    /* renamed from: i  reason: collision with root package name */
    public final Q6 f14646i = new Q6();

    public S6(byte b10, A4 a42) {
        this.f14639a = b10;
        this.f14640b = a42;
    }

    public final void a(Context context, View view, M6 token, AdConfig.ViewabilityConfig viewabilityConfig) {
        kotlin.jvm.internal.g.e(context, "context");
        kotlin.jvm.internal.g.e(view, "view");
        kotlin.jvm.internal.g.e(token, "token");
        kotlin.jvm.internal.g.e(viewabilityConfig, "viewabilityConfig");
        C1665i4 c1665i4 = (C1665i4) this.f14641d.get(context);
        if (c1665i4 == null) {
            if (context instanceof Activity) {
                c1665i4 = new C1665i4(viewabilityConfig, new S2(this.f14646i, (Activity) context, this.f14640b), this.f14644g);
            } else {
                c1665i4 = new C1665i4(viewabilityConfig, new C1739n9(this.f14646i, viewabilityConfig, (byte) 1, this.f14640b), this.f14644g);
            }
            this.f14641d.put(context, c1665i4);
        }
        byte b10 = this.f14639a;
        if (b10 == 0) {
            c1665i4.a(view, token, viewabilityConfig.getVideoImpressionMinPercentageViewed(), viewabilityConfig.getVideoImpressionMinTimeViewed());
        } else if (b10 == 1) {
            c1665i4.a(view, token, viewabilityConfig.getImpressionMinPercentageViewed(), viewabilityConfig.getImpressionMinTimeViewed());
        } else {
            c1665i4.a(view, token, viewabilityConfig.getImpressionMinPercentageViewed(), viewabilityConfig.getImpressionMinTimeViewed());
        }
    }

    public final void a(Context context, M6 token) {
        View view;
        kotlin.jvm.internal.g.e(context, "context");
        kotlin.jvm.internal.g.e(token, "token");
        C1665i4 c1665i4 = (C1665i4) this.f14641d.get(context);
        if (c1665i4 != null) {
            Iterator it = c1665i4.f15182a.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    view = null;
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (kotlin.jvm.internal.g.a(((C1637g4) entry.getValue()).f15092a, token)) {
                    view = (View) entry.getKey();
                    break;
                }
            }
            if (view != null) {
                c1665i4.f15182a.remove(view);
                c1665i4.f15183b.remove(view);
                c1665i4.c.a(view);
            }
            if (!c1665i4.f15182a.isEmpty()) {
                return;
            }
            A4 a42 = this.f14640b;
            if (a42 != null) {
                String TAG = this.c;
                kotlin.jvm.internal.g.d(TAG, "TAG");
                ((B4) a42).a(TAG, "Impression tracker is free, removing it");
            }
            C1665i4 c1665i42 = (C1665i4) this.f14641d.remove(context);
            if (c1665i42 != null) {
                c1665i42.f15182a.clear();
                c1665i42.f15183b.clear();
                c1665i42.c.a();
                c1665i42.f15185e.removeMessages(0);
                c1665i42.c.b();
            }
            if (context instanceof Activity) {
                this.f14641d.isEmpty();
            }
        }
    }

    public final void a(Context context, View view, M6 token) {
        View view2;
        kotlin.jvm.internal.g.e(context, "context");
        kotlin.jvm.internal.g.e(view, "view");
        kotlin.jvm.internal.g.e(token, "token");
        wc wcVar = (wc) this.f14642e.get(context);
        if (wcVar != null) {
            Iterator it = wcVar.f15602a.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    view2 = null;
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (kotlin.jvm.internal.g.a(((tc) entry.getValue()).f15482d, token)) {
                    view2 = (View) entry.getKey();
                    break;
                }
            }
            if (view2 != null) {
                wcVar.a(view2);
            }
            if (!(!wcVar.f15602a.isEmpty())) {
                A4 a42 = this.f14640b;
                if (a42 != null) {
                    String TAG = this.c;
                    kotlin.jvm.internal.g.d(TAG, "TAG");
                    ((B4) a42).a(TAG, "Impression tracker is free, removing it");
                }
                wc wcVar2 = (wc) this.f14642e.remove(context);
                if (wcVar2 != null) {
                    wcVar2.b();
                }
                if (context instanceof Activity) {
                    this.f14642e.isEmpty();
                }
            }
        }
        this.f14643f.remove(view);
    }

    public final void a(Context context, View view, M6 token, pc listener, AdConfig.ViewabilityConfig config) {
        kotlin.jvm.internal.g.e(context, "context");
        kotlin.jvm.internal.g.e(view, "view");
        kotlin.jvm.internal.g.e(token, "token");
        kotlin.jvm.internal.g.e(listener, "listener");
        kotlin.jvm.internal.g.e(config, "config");
        wc wcVar = (wc) this.f14642e.get(context);
        if (wcVar == null) {
            if (context instanceof Activity) {
                wcVar = new S2(this.f14646i, (Activity) context, this.f14640b);
            } else {
                wcVar = new C1739n9(this.f14646i, config, (byte) 1, this.f14640b);
            }
            R6 r62 = this.f14645h;
            A4 a42 = wcVar.f15605e;
            if (a42 != null) {
                ((B4) a42).c("VisibilityTracker", "setVisibilityTrackerListener logger");
            }
            wcVar.f15610j = r62;
            this.f14642e.put(context, wcVar);
        }
        this.f14643f.put(view, listener);
        byte b10 = this.f14639a;
        if (b10 == 0) {
            wcVar.a(view, token, config.getVideoMinPercentagePlay());
        } else if (b10 == 1) {
            wcVar.a(view, token, config.getDisplayMinPercentageAnimate());
        } else {
            wcVar.a(view, token, config.getDisplayMinPercentageAnimate());
        }
    }
}
