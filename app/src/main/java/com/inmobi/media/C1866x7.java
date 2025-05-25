package com.inmobi.media;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.inmobi.commons.core.configs.AdConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.inmobi.media.x7  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1866x7 implements E7 {

    /* renamed from: a  reason: collision with root package name */
    public final AdConfig f15635a;

    /* renamed from: b  reason: collision with root package name */
    public final M6 f15636b;
    public final C1682j7 c;

    /* renamed from: d  reason: collision with root package name */
    public final C1776q7 f15637d;

    /* renamed from: e  reason: collision with root package name */
    public final C1763p7 f15638e;

    /* renamed from: f  reason: collision with root package name */
    public final A4 f15639f;

    /* renamed from: g  reason: collision with root package name */
    public final String f15640g;

    /* renamed from: h  reason: collision with root package name */
    public final Handler f15641h;

    /* renamed from: i  reason: collision with root package name */
    public final WeakReference f15642i;

    /* renamed from: j  reason: collision with root package name */
    public G7 f15643j;

    /* renamed from: k  reason: collision with root package name */
    public int f15644k;

    /* renamed from: l  reason: collision with root package name */
    public final F0 f15645l;

    /* renamed from: m  reason: collision with root package name */
    public final C1867x8 f15646m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f15647n;

    /* renamed from: o  reason: collision with root package name */
    public S9 f15648o;

    /* renamed from: p  reason: collision with root package name */
    public C1788r7 f15649p;

    public C1866x7(Context context, AdConfig adConfig, M6 nativeAdContainer, C1682j7 dataModel, C1776q7 viewEventListener, C1763p7 clickEventListener, C1788r7 timerFinishListener, A4 a42) {
        C1867x8 c1867x8;
        C1867x8 c1867x82;
        kotlin.jvm.internal.g.e(context, "context");
        kotlin.jvm.internal.g.e(adConfig, "adConfig");
        kotlin.jvm.internal.g.e(nativeAdContainer, "nativeAdContainer");
        kotlin.jvm.internal.g.e(dataModel, "dataModel");
        kotlin.jvm.internal.g.e(viewEventListener, "viewEventListener");
        kotlin.jvm.internal.g.e(clickEventListener, "clickEventListener");
        kotlin.jvm.internal.g.e(timerFinishListener, "timerFinishListener");
        this.f15635a = adConfig;
        this.f15636b = nativeAdContainer;
        this.c = dataModel;
        this.f15637d = viewEventListener;
        this.f15638e = clickEventListener;
        this.f15639f = a42;
        this.f15640g = "x7";
        this.f15641h = new Handler(Looper.getMainLooper());
        this.f15642i = new WeakReference(context);
        this.f15645l = new F0();
        HashMap hashMap = C1867x8.c;
        WeakReference weakReference = C1867x8.f15650d;
        if (weakReference != null) {
            c1867x8 = (C1867x8) weakReference.get();
        } else {
            c1867x8 = null;
        }
        if (c1867x8 == null) {
            synchronized (C1867x8.class) {
                WeakReference weakReference2 = C1867x8.f15650d;
                if (weakReference2 == null || (c1867x82 = (C1867x8) weakReference2.get()) == null) {
                    c1867x82 = new C1867x8(context);
                    C1867x8.f15650d = new WeakReference(c1867x82);
                }
            }
            c1867x8 = c1867x82;
        }
        this.f15646m = c1867x8;
        this.f15649p = timerFinishListener;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.ViewGroup a(android.view.ViewGroup r4, com.inmobi.media.C1570b7 r5) {
        /*
            r3 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.g.e(r4, r0)
            java.lang.String r0 = "root"
            kotlin.jvm.internal.g.e(r5, r0)
            java.lang.ref.WeakReference r0 = r3.f15642i
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            if (r0 == 0) goto L23
            com.inmobi.media.x8 r1 = r3.f15646m
            com.inmobi.commons.core.configs.AdConfig r2 = r3.f15635a
            android.view.View r0 = r1.a(r0, r5, r2)
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L23
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L24
        L23:
            r0 = 0
        L24:
            if (r0 != 0) goto L27
            goto L30
        L27:
            java.util.HashMap r1 = com.inmobi.media.C1867x8.c
            android.view.ViewGroup$LayoutParams r4 = com.inmobi.media.C1655h8.a(r5, r4)
            r0.setLayoutParams(r4)
        L30:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C1866x7.a(android.view.ViewGroup, com.inmobi.media.b7):android.view.ViewGroup");
    }

    public final void b(View view, W6 w62) {
        if (w62.f14790f) {
            view.setOnClickListener(new qb.j1(0, this, w62));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x011c, code lost:
        if (kotlin.jvm.internal.g.a("UNKNOWN", r0.f15707y) != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x012c, code lost:
        if (r12.f14789e == null) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0419 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0149  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r10v27 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.ViewGroup b(android.view.ViewGroup r22, com.inmobi.media.C1570b7 r23) {
        /*
            Method dump skipped, instructions count: 1070
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C1866x7.b(android.view.ViewGroup, com.inmobi.media.b7):android.view.ViewGroup");
    }

    public final D7 a(D7 d72, ViewGroup parent, S9 s92) {
        kotlin.jvm.internal.g.e(parent, "parent");
        this.f15648o = s92;
        D7 a10 = a(d72, parent);
        this.f15641h.post(new androidx.emoji2.text.h(4, this, a10, parent));
        return a10;
    }

    public static final void a(C1866x7 this$0, D7 d72, ViewGroup parent) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        kotlin.jvm.internal.g.e(parent, "$parent");
        if (this$0.f15647n) {
            return;
        }
        C1570b7 c1570b7 = this$0.c.f15220f;
        if (d72 == null || c1570b7 == null) {
            return;
        }
        this$0.b((ViewGroup) d72, c1570b7);
    }

    public final D7 a(D7 d72, ViewGroup viewGroup) {
        D7 d73;
        C1570b7 c1570b7 = this.c.f15220f;
        if (d72 == null) {
            Context context = (Context) this.f15642i.get();
            if (context != null && c1570b7 != null) {
                View a10 = this.f15646m.a(context, c1570b7, this.f15635a);
                if (a10 instanceof D7) {
                    d73 = (D7) a10;
                }
            }
            d73 = null;
        } else {
            d73 = d72;
        }
        if (d73 != null && d72 != null) {
            ViewParent parent = d73.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(d73);
            }
            C1867x8 c1867x8 = this.f15646m;
            c1867x8.getClass();
            int childCount = d73.getChildCount();
            while (true) {
                childCount--;
                if (-1 >= childCount) {
                    break;
                }
                View childAt = d73.getChildAt(childCount);
                d73.removeViewAt(childCount);
                kotlin.jvm.internal.g.b(childAt);
                c1867x8.a(childAt);
            }
            if (c1570b7 != null) {
                HashMap hashMap = C1867x8.c;
                C1655h8.a(d73, c1570b7.f14788d);
            }
        }
        if (c1570b7 != null) {
            C1867x8 c1867x82 = this.f15646m;
            int i10 = c1570b7.f14788d.f14841a.x;
            c1867x82.getClass();
            C1867x8.f15653g = i10;
        }
        if (d73 != null && c1570b7 != null) {
            HashMap hashMap2 = C1867x8.c;
            d73.setLayoutParams(C1655h8.a(c1570b7, viewGroup));
        }
        return d73;
    }

    public final void a(View view, W6 nativeAsset) {
        F0 f02 = this.f15645l;
        f02.getClass();
        kotlin.jvm.internal.g.e(view, "view");
        kotlin.jvm.internal.g.e(nativeAsset, "nativeAsset");
        ArrayList arrayList = new ArrayList();
        boolean z10 = true;
        try {
            HashMap hashMap = C1867x8.c;
            float a10 = C1655h8.a(nativeAsset.f14788d.c.x);
            float a11 = C1655h8.a(nativeAsset.f14788d.f14843d.x);
            if (a10 != a11) {
                arrayList.add(F0.a(F0.a(view, a10, a11), nativeAsset));
            }
            float a12 = C1655h8.a(nativeAsset.f14788d.c.y);
            float a13 = C1655h8.a(nativeAsset.f14788d.f14843d.y);
            if (a12 != a13) {
                arrayList.add(F0.a(F0.b(view, a12, a13), nativeAsset));
            }
            float a14 = C1655h8.a(nativeAsset.f14788d.f14841a.x);
            float a15 = C1655h8.a(nativeAsset.f14788d.f14842b.x);
            if (a14 != a15) {
                view.setPivotX(0.0f);
                view.setPivotY(0.0f);
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", a15 / a14);
                kotlin.jvm.internal.g.d(ofFloat, "ofFloat(...)");
                arrayList.add(F0.a(ofFloat, nativeAsset));
            }
            float a16 = C1655h8.a(nativeAsset.f14788d.f14841a.y);
            float a17 = C1655h8.a(nativeAsset.f14788d.f14842b.y);
            if (a16 != a17) {
                view.setPivotX(0.0f);
                view.setPivotY(0.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", a17 / a16);
                kotlin.jvm.internal.g.d(ofFloat2, "ofFloat(...)");
                arrayList.add(F0.a(ofFloat2, nativeAsset));
            }
        } catch (Exception unused) {
            String TAG = f02.f14242a;
            kotlin.jvm.internal.g.d(TAG, "TAG");
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        Iterator it = nativeAsset.f14803s.iterator();
        while (true) {
            if (!it.hasNext()) {
                z10 = false;
                break;
            } else if (kotlin.jvm.internal.g.a("creativeView", ((P7) it.next()).c)) {
                break;
            }
        }
        if (arrayList != null || z10) {
            view.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC1801s7(this, arrayList, nativeAsset));
        }
    }

    public static final void a(WeakReference childViewRef) {
        kotlin.jvm.internal.g.e(childViewRef, "$childViewRef");
        View view = (View) childViewRef.get();
        if (view != null) {
            view.setVisibility(4);
        }
    }

    public static final void a(C1866x7 this$0, W6 asset, View view) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        kotlin.jvm.internal.g.e(asset, "$asset");
        C1763p7 c1763p7 = this$0.f15638e;
        kotlin.jvm.internal.g.b(view);
        c1763p7.getClass();
        C1788r7 c1788r7 = c1763p7.f15377a;
        if (c1788r7.f15416a) {
            return;
        }
        c1788r7.f15417b.a(view, asset);
        c1763p7.f15377a.f15417b.a(asset, false);
    }

    public static final void b(WeakReference childViewRef) {
        kotlin.jvm.internal.g.e(childViewRef, "$childViewRef");
        View view = (View) childViewRef.get();
        if (view != null) {
            view.setVisibility(0);
        }
    }
}
