package com.inmobi.media;

import android.content.Context;
import android.graphics.Point;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewpager.widget.ViewPager;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class Fa extends F7 implements ViewPager.j {

    /* renamed from: b  reason: collision with root package name */
    public final String f14250b;
    public final ViewPager c;

    /* renamed from: d  reason: collision with root package name */
    public final Point f14251d;

    /* renamed from: e  reason: collision with root package name */
    public final Point f14252e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f14253f;

    /* renamed from: g  reason: collision with root package name */
    public E7 f14254g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Fa(Context context) {
        super(context, (byte) 0);
        kotlin.jvm.internal.g.e(context, "context");
        this.f14250b = "Fa";
        this.f14251d = new Point();
        this.f14252e = new Point();
        setClipChildren(false);
        setLayerType(1, null);
        ViewPager viewPager = new ViewPager(getContext());
        this.c = viewPager;
        viewPager.b(this);
        addView(viewPager);
    }

    @Override // com.inmobi.media.F7
    public final void a(C1570b7 scrollableContainerAsset, G7 dataSource, int i10, int i11, E7 e72) {
        W6 w62;
        FrameLayout.LayoutParams layoutParams;
        kotlin.jvm.internal.g.e(scrollableContainerAsset, "scrollableContainerAsset");
        kotlin.jvm.internal.g.e(dataSource, "dataSource");
        C1696k7 c1696k7 = null;
        if (scrollableContainerAsset.B > 0) {
            w62 = (W6) scrollableContainerAsset.A.get(0);
        } else {
            w62 = null;
        }
        if (w62 != null) {
            HashMap hashMap = C1867x8.c;
            ViewGroup.LayoutParams a10 = C1655h8.a(w62, this);
            kotlin.jvm.internal.g.c(a10, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            layoutParams = (FrameLayout.LayoutParams) a10;
            layoutParams.setMarginStart(20);
            layoutParams.setMarginEnd(20);
            layoutParams.gravity = i11;
        } else {
            layoutParams = null;
        }
        ViewPager viewPager = this.c;
        if (viewPager != null) {
            viewPager.setLayoutParams(layoutParams);
            if (dataSource instanceof C1696k7) {
                c1696k7 = (C1696k7) dataSource;
            }
            viewPager.setAdapter(c1696k7);
            viewPager.setOffscreenPageLimit(2);
            viewPager.setPageMargin(16);
            viewPager.setCurrentItem(i10);
        }
        this.f14254g = e72;
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageScrollStateChanged(int i10) {
        boolean z10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f14253f = z10;
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageScrolled(int i10, float f10, int i11) {
        if (this.f14253f) {
            invalidate();
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageSelected(int i10) {
        ViewGroup.LayoutParams layoutParams;
        FrameLayout.LayoutParams layoutParams2;
        int i11;
        kotlin.jvm.internal.g.d(this.f14250b, "TAG");
        ViewPager viewPager = this.c;
        if (viewPager != null) {
            layoutParams = viewPager.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        } else {
            layoutParams2 = null;
        }
        E7 e72 = this.f14254g;
        if (e72 != null) {
            if (layoutParams2 != null) {
                C1866x7 c1866x7 = (C1866x7) e72;
                c1866x7.f15644k = i10;
                C1570b7 b10 = c1866x7.c.b(i10);
                if (b10 != null) {
                    C1776q7 c1776q7 = c1866x7.f15637d;
                    c1776q7.getClass();
                    C1788r7 c1788r7 = c1776q7.f15391a;
                    if (!c1788r7.f15416a) {
                        M6 m62 = c1788r7.f15417b;
                        m62.getClass();
                        if (!m62.f14471m.contains(Integer.valueOf(i10)) && !m62.f14477s) {
                            m62.n();
                            if (!m62.f14477s) {
                                m62.f14471m.add(Integer.valueOf(i10));
                                b10.f14966y = System.currentTimeMillis();
                                if (m62.f14475q) {
                                    HashMap a10 = m62.a(b10);
                                    A4 a42 = m62.f14468j;
                                    if (a42 != null) {
                                        String TAG = m62.f14470l;
                                        kotlin.jvm.internal.g.d(TAG, "TAG");
                                        ((B4) a42).a(TAG, "Page-view impression record request");
                                    }
                                    b10.a("page_view", a10, (F6) null, m62.f14468j);
                                } else {
                                    m62.f14472n.add(b10);
                                }
                            }
                        }
                    }
                }
                int i12 = c1866x7.f15644k;
                if (i12 == 0) {
                    i11 = 8388611;
                } else if (i12 == c1866x7.c.d() - 1) {
                    i11 = 8388613;
                } else {
                    i11 = 1;
                }
                layoutParams2.gravity = i11;
            }
            ViewPager viewPager2 = this.c;
            if (viewPager2 != null) {
                viewPager2.requestLayout();
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        Point point = this.f14251d;
        point.x = i10 / 2;
        point.y = i11 / 2;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent ev) {
        Point point;
        double ceil;
        double ceil2;
        int i10;
        Point point2;
        Point point3;
        kotlin.jvm.internal.g.e(ev, "ev");
        int action = ev.getAction();
        if (action != 0) {
            if (action != 1) {
                int i11 = this.f14251d.x;
                Point point4 = this.f14252e;
                ev.offsetLocation(i11 - point4.x, point3.y - point4.y);
            } else {
                float f10 = this.f14252e.x;
                float x4 = ev.getX();
                ViewPager viewPager = this.c;
                kotlin.jvm.internal.g.b(viewPager);
                int currentItem = viewPager.getCurrentItem();
                j2.a adapter = this.c.getAdapter();
                kotlin.jvm.internal.g.b(adapter);
                int count = adapter.getCount();
                int width = this.c.getWidth();
                int width2 = getWidth();
                if (currentItem != 0 && count - 1 != currentItem) {
                    float f11 = (width2 - width) / 2;
                    if (f10 < f11 && x4 < f11) {
                        ceil = Math.ceil((f11 - x4) / width);
                        ceil2 = -ceil;
                        i10 = (int) ceil2;
                    } else {
                        float f12 = (width2 + width) / 2;
                        if (f10 > f12 && x4 > f12) {
                            ceil2 = Math.ceil((x4 - f12) / width);
                            i10 = (int) ceil2;
                        }
                        i10 = 0;
                    }
                } else {
                    int i12 = width2 - width;
                    if (currentItem == 0) {
                        float f13 = i12;
                        if (f10 > f13 && x4 > f13) {
                            ceil2 = Math.ceil((x4 - f13) / width);
                            i10 = (int) ceil2;
                        }
                    } else {
                        float f14 = i12;
                        if (f10 < f14 && x4 < f14) {
                            ceil = Math.ceil((f14 - x4) / width);
                            ceil2 = -ceil;
                            i10 = (int) ceil2;
                        }
                    }
                    i10 = 0;
                }
                if (i10 != 0) {
                    ev.setAction(3);
                    ViewPager viewPager2 = this.c;
                    if (viewPager2 != null) {
                        viewPager2.setCurrentItem(viewPager2.getCurrentItem() + i10);
                    }
                }
                int i13 = this.f14251d.x;
                Point point5 = this.f14252e;
                ev.offsetLocation(i13 - point5.x, point2.y - point5.y);
            }
        } else {
            this.f14252e.x = (int) ev.getX();
            this.f14252e.y = (int) ev.getY();
            int i14 = this.f14251d.x;
            Point point6 = this.f14252e;
            ev.offsetLocation(i14 - point6.x, point.y - point6.y);
        }
        ViewPager viewPager3 = this.c;
        if (viewPager3 == null) {
            return false;
        }
        return viewPager3.dispatchTouchEvent(ev);
    }
}
