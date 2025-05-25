package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.inmobi.media.C1696k7;

/* renamed from: com.inmobi.media.k7  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1696k7 extends j2.a implements G7 {

    /* renamed from: a  reason: collision with root package name */
    public final C1682j7 f15261a;

    /* renamed from: b  reason: collision with root package name */
    public final C1866x7 f15262b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final int f15263d;

    /* renamed from: e  reason: collision with root package name */
    public final Handler f15264e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f15265f;

    /* renamed from: g  reason: collision with root package name */
    public final SparseArray f15266g;

    public C1696k7(C1682j7 mNativeDataModel, C1866x7 mNativeLayoutInflater) {
        kotlin.jvm.internal.g.e(mNativeDataModel, "mNativeDataModel");
        kotlin.jvm.internal.g.e(mNativeLayoutInflater, "mNativeLayoutInflater");
        this.f15261a = mNativeDataModel;
        this.f15262b = mNativeLayoutInflater;
        this.c = "k7";
        this.f15263d = 50;
        this.f15264e = new Handler(Looper.getMainLooper());
        this.f15266g = new SparseArray();
    }

    public static final void a(Object item, C1696k7 this$0) {
        kotlin.jvm.internal.g.e(item, "$item");
        kotlin.jvm.internal.g.e(this$0, "this$0");
        if (item instanceof View) {
            C1866x7 c1866x7 = this$0.f15262b;
            c1866x7.getClass();
            c1866x7.f15646m.a((View) item);
        }
    }

    @Override // com.inmobi.media.G7
    public final void destroy() {
        this.f15265f = true;
        int size = this.f15266g.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f15264e.removeCallbacks((Runnable) this.f15266g.get(this.f15266g.keyAt(i10)));
        }
        this.f15266g.clear();
    }

    @Override // j2.a
    public final void destroyItem(ViewGroup container, int i10, Object item) {
        kotlin.jvm.internal.g.e(container, "container");
        kotlin.jvm.internal.g.e(item, "item");
        if (item instanceof View) {
            container.removeView((View) item);
        }
        Runnable runnable = (Runnable) this.f15266g.get(i10);
        if (runnable != null) {
            this.f15264e.removeCallbacks(runnable);
            String TAG = this.c;
            kotlin.jvm.internal.g.d(TAG, "TAG");
        }
        this.f15264e.post(new n0.g(16, item, this));
    }

    @Override // j2.a
    public final int getCount() {
        return this.f15261a.d();
    }

    @Override // j2.a
    public final int getItemPosition(Object item) {
        View view;
        kotlin.jvm.internal.g.e(item, "item");
        Object obj = null;
        if (item instanceof View) {
            view = (View) item;
        } else {
            view = null;
        }
        if (view != null) {
            obj = view.getTag();
        }
        if (obj instanceof Integer) {
            return ((Number) obj).intValue();
        }
        return -2;
    }

    @Override // j2.a
    public final Object instantiateItem(ViewGroup container, int i10) {
        View relativeLayout;
        kotlin.jvm.internal.g.e(container, "container");
        String TAG = this.c;
        kotlin.jvm.internal.g.d(TAG, "TAG");
        C1570b7 b10 = this.f15261a.b(i10);
        if (b10 == null || (relativeLayout = a(i10, container, b10)) == null) {
            relativeLayout = new RelativeLayout(container.getContext());
        }
        relativeLayout.setTag(Integer.valueOf(i10));
        container.addView(relativeLayout);
        return relativeLayout;
    }

    @Override // j2.a
    public final boolean isViewFromObject(View view, Object obj) {
        kotlin.jvm.internal.g.e(view, "view");
        kotlin.jvm.internal.g.e(obj, "obj");
        return kotlin.jvm.internal.g.a(view, obj);
    }

    public final ViewGroup a(final int i10, final ViewGroup parent, final C1570b7 pageContainerAsset) {
        kotlin.jvm.internal.g.e(parent, "parent");
        kotlin.jvm.internal.g.e(pageContainerAsset, "pageContainerAsset");
        final ViewGroup a10 = this.f15262b.a(parent, pageContainerAsset);
        if (a10 != null) {
            int abs = Math.abs(this.f15262b.f15644k - i10);
            Runnable runnable = new Runnable() { // from class: qb.u0
                @Override // java.lang.Runnable
                public final void run() {
                    C1696k7.a(C1696k7.this, i10, a10, parent, pageContainerAsset);
                }
            };
            this.f15266g.put(i10, runnable);
            this.f15264e.postDelayed(runnable, abs * this.f15263d);
        }
        return a10;
    }

    public static final void a(C1696k7 this$0, int i10, ViewGroup it, ViewGroup parent, C1570b7 pageContainerAsset) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        kotlin.jvm.internal.g.e(it, "$it");
        kotlin.jvm.internal.g.e(parent, "$parent");
        kotlin.jvm.internal.g.e(pageContainerAsset, "$pageContainerAsset");
        if (this$0.f15265f) {
            return;
        }
        this$0.f15266g.remove(i10);
        C1866x7 c1866x7 = this$0.f15262b;
        c1866x7.getClass();
        c1866x7.b(it, pageContainerAsset);
    }
}
