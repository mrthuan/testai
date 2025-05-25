package com.google.android.material.carousel;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.d;
import androidx.fragment.app.w;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import pdf.pdfreader.viewer.editor.free.R;

/* loaded from: classes2.dex */
public class CarouselLayoutManager extends RecyclerView.m implements o8.a {

    /* renamed from: p  reason: collision with root package name */
    public int f12224p;

    /* renamed from: q  reason: collision with root package name */
    public int f12225q;

    /* renamed from: r  reason: collision with root package name */
    public int f12226r;

    /* renamed from: v  reason: collision with root package name */
    public com.google.android.material.carousel.a f12230v;

    /* renamed from: s  reason: collision with root package name */
    public final b f12227s = new b();

    /* renamed from: w  reason: collision with root package name */
    public int f12231w = 0;

    /* renamed from: t  reason: collision with root package name */
    public w f12228t = new com.google.android.material.carousel.c();

    /* renamed from: u  reason: collision with root package name */
    public com.google.android.material.carousel.b f12229u = null;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final View f12232a;

        /* renamed from: b  reason: collision with root package name */
        public final float f12233b;
        public final c c;

        public a(View view, float f10, c cVar) {
            this.f12232a = view;
            this.f12233b = f10;
            this.c = cVar;
        }
    }

    /* loaded from: classes2.dex */
    public static class b extends RecyclerView.l {

        /* renamed from: a  reason: collision with root package name */
        public final Paint f12234a;

        /* renamed from: b  reason: collision with root package name */
        public List<a.b> f12235b;

        public b() {
            Paint paint = new Paint();
            this.f12234a = paint;
            this.f12235b = Collections.unmodifiableList(new ArrayList());
            paint.setStrokeWidth(5.0f);
            paint.setColor(-65281);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.l
        public final void g(Canvas canvas, RecyclerView recyclerView) {
            Paint paint = this.f12234a;
            paint.setStrokeWidth(recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width));
            for (a.b bVar : this.f12235b) {
                paint.setColor(o0.a.b(bVar.c, -65281, -16776961));
                float f10 = bVar.f12259b;
                CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) recyclerView.getLayoutManager();
                canvas.drawLine(bVar.f12259b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).getPaddingTop(), f10, carouselLayoutManager.f4298o - carouselLayoutManager.getPaddingBottom(), paint);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final a.b f12236a;

        /* renamed from: b  reason: collision with root package name */
        public final a.b f12237b;

        public c(a.b bVar, a.b bVar2) {
            boolean z10;
            if (bVar.f12258a <= bVar2.f12258a) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.f12236a = bVar;
                this.f12237b = bVar2;
                return;
            }
            throw new IllegalArgumentException();
        }
    }

    public CarouselLayoutManager() {
        z0();
    }

    public static float V0(float f10, c cVar) {
        a.b bVar = cVar.f12236a;
        float f11 = bVar.f12260d;
        a.b bVar2 = cVar.f12237b;
        return f8.b.a(f11, bVar2.f12260d, bVar.f12259b, bVar2.f12259b, f10);
    }

    public static c X0(float f10, List list, boolean z10) {
        float f11;
        float f12 = Float.MAX_VALUE;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        float f13 = -3.4028235E38f;
        float f14 = Float.MAX_VALUE;
        float f15 = Float.MAX_VALUE;
        for (int i14 = 0; i14 < list.size(); i14++) {
            a.b bVar = (a.b) list.get(i14);
            if (z10) {
                f11 = bVar.f12259b;
            } else {
                f11 = bVar.f12258a;
            }
            float abs = Math.abs(f11 - f10);
            if (f11 <= f10 && abs <= f12) {
                i10 = i14;
                f12 = abs;
            }
            if (f11 > f10 && abs <= f14) {
                i12 = i14;
                f14 = abs;
            }
            if (f11 <= f15) {
                i11 = i14;
                f15 = f11;
            }
            if (f11 > f13) {
                i13 = i14;
                f13 = f11;
            }
        }
        if (i10 == -1) {
            i10 = i11;
        }
        if (i12 == -1) {
            i12 = i13;
        }
        return new c((a.b) list.get(i10), (a.b) list.get(i12));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int A0(int i10, RecyclerView.t tVar, RecyclerView.y yVar) {
        if (I() == 0 || i10 == 0) {
            return 0;
        }
        int i11 = this.f12224p;
        int i12 = this.f12225q;
        int i13 = this.f12226r;
        int i14 = i11 + i10;
        if (i14 < i12) {
            i10 = i12 - i11;
        } else if (i14 > i13) {
            i10 = i13 - i11;
        }
        this.f12224p = i11 + i10;
        d1();
        float f10 = this.f12230v.f12249a / 2.0f;
        int T0 = T0(RecyclerView.m.P(H(0)));
        Rect rect = new Rect();
        for (int i15 = 0; i15 < I(); i15++) {
            View H = H(i15);
            float P0 = P0(T0, (int) f10);
            c X0 = X0(P0, this.f12230v.f12250b, false);
            float S0 = S0(H, P0, X0);
            if (H instanceof o8.c) {
                a.b bVar = X0.f12236a;
                float f11 = bVar.c;
                a.b bVar2 = X0.f12237b;
                ((o8.c) H).setMaskXPercentage(f8.b.a(f11, bVar2.c, bVar.f12258a, bVar2.f12258a, P0));
            }
            RecyclerView.Y(rect, H);
            H.offsetLeftAndRight((int) (S0 - (rect.left + f10)));
            T0 = P0(T0, (int) this.f12230v.f12249a);
        }
        U0(tVar, yVar);
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void B0(int i10) {
        com.google.android.material.carousel.b bVar = this.f12229u;
        if (bVar == null) {
            return;
        }
        this.f12224p = W0(bVar.f12261a, i10);
        this.f12231w = com.google.android.play.core.assetpacks.c.n(i10, 0, Math.max(0, M() - 1));
        d1();
        z0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final RecyclerView.n D() {
        return new RecyclerView.n(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void L(Rect rect, View view) {
        RecyclerView.Y(rect, view);
        float centerX = rect.centerX();
        float width = (rect.width() - V0(centerX, X0(centerX, this.f12230v.f12250b, true))) / 2.0f;
        rect.set((int) (rect.left + width), rect.top, (int) (rect.right - width), rect.bottom);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void L0(RecyclerView recyclerView, int i10) {
        o8.b bVar = new o8.b(this, recyclerView.getContext());
        bVar.f4320a = i10;
        M0(bVar);
    }

    public final void O0(float f10, int i10, View view) {
        float f11 = this.f12230v.f12249a / 2.0f;
        m(view, false, i10);
        RecyclerView.m.X(view, (int) (f10 - f11), getPaddingTop(), (int) (f10 + f11), this.f4298o - getPaddingBottom());
    }

    public final int P0(int i10, int i11) {
        if (Y0()) {
            return i10 - i11;
        }
        return i10 + i11;
    }

    public final void Q0(int i10, RecyclerView.t tVar, RecyclerView.y yVar) {
        int T0 = T0(i10);
        while (i10 < yVar.b()) {
            a b12 = b1(tVar, T0, i10);
            float f10 = b12.f12233b;
            c cVar = b12.c;
            if (!Z0(f10, cVar)) {
                T0 = P0(T0, (int) this.f12230v.f12249a);
                if (!a1(f10, cVar)) {
                    O0(f10, -1, b12.f12232a);
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void R0(int i10, RecyclerView.t tVar) {
        int T0 = T0(i10);
        while (i10 >= 0) {
            a b12 = b1(tVar, T0, i10);
            float f10 = b12.f12233b;
            c cVar = b12.c;
            if (!a1(f10, cVar)) {
                int i11 = (int) this.f12230v.f12249a;
                if (Y0()) {
                    T0 += i11;
                } else {
                    T0 -= i11;
                }
                if (!Z0(f10, cVar)) {
                    O0(f10, 0, b12.f12232a);
                }
                i10--;
            } else {
                return;
            }
        }
    }

    public final float S0(View view, float f10, c cVar) {
        a.b bVar = cVar.f12236a;
        float f11 = bVar.f12259b;
        a.b bVar2 = cVar.f12237b;
        float f12 = bVar2.f12259b;
        float f13 = bVar.f12258a;
        float f14 = bVar2.f12258a;
        float a10 = f8.b.a(f11, f12, f13, f14, f10);
        if (bVar2 == this.f12230v.b() || bVar == this.f12230v.d()) {
            RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
            return a10 + (((1.0f - bVar2.c) + ((((ViewGroup.MarginLayoutParams) nVar).rightMargin + ((ViewGroup.MarginLayoutParams) nVar).leftMargin) / this.f12230v.f12249a)) * (f10 - f14));
        }
        return a10;
    }

    public final int T0(int i10) {
        int i11;
        if (Y0()) {
            i11 = this.f4297n;
        } else {
            i11 = 0;
        }
        return P0(i11 - this.f12224p, (int) (this.f12230v.f12249a * i10));
    }

    public final void U0(RecyclerView.t tVar, RecyclerView.y yVar) {
        while (I() > 0) {
            View H = H(0);
            Rect rect = new Rect();
            RecyclerView.Y(rect, H);
            float centerX = rect.centerX();
            if (!a1(centerX, X0(centerX, this.f12230v.f12250b, true))) {
                break;
            }
            x0(H, tVar);
        }
        while (I() - 1 >= 0) {
            View H2 = H(I() - 1);
            Rect rect2 = new Rect();
            RecyclerView.Y(rect2, H2);
            float centerX2 = rect2.centerX();
            if (!Z0(centerX2, X0(centerX2, this.f12230v.f12250b, true))) {
                break;
            }
            x0(H2, tVar);
        }
        if (I() == 0) {
            R0(this.f12231w - 1, tVar);
            Q0(this.f12231w, tVar, yVar);
            return;
        }
        int P = RecyclerView.m.P(H(0));
        int P2 = RecyclerView.m.P(H(I() - 1));
        R0(P - 1, tVar);
        Q0(P2 + 1, tVar, yVar);
    }

    public final int W0(com.google.android.material.carousel.a aVar, int i10) {
        if (Y0()) {
            float f10 = aVar.f12249a;
            return (int) (((this.f4297n - aVar.c().f12258a) - (i10 * f10)) - (f10 / 2.0f));
        }
        return (int) ((aVar.f12249a / 2.0f) + ((i10 * aVar.f12249a) - aVar.a().f12258a));
    }

    public final boolean Y0() {
        if (N() == 1) {
            return true;
        }
        return false;
    }

    public final boolean Z0(float f10, c cVar) {
        int i10;
        float V0 = V0(f10, cVar);
        int i11 = (int) f10;
        int i12 = (int) (V0 / 2.0f);
        if (Y0()) {
            i10 = i11 + i12;
        } else {
            i10 = i11 - i12;
        }
        if (!Y0() ? i10 > this.f4297n : i10 < 0) {
            return true;
        }
        return false;
    }

    public final boolean a1(float f10, c cVar) {
        int P0 = P0((int) f10, (int) (V0(f10, cVar) / 2.0f));
        if (!Y0() ? P0 < 0 : P0 > this.f4297n) {
            return true;
        }
        return false;
    }

    public final a b1(RecyclerView.t tVar, float f10, int i10) {
        View d10 = tVar.d(i10);
        c1(d10);
        float P0 = P0((int) f10, (int) (this.f12230v.f12249a / 2.0f));
        c X0 = X0(P0, this.f12230v.f12250b, false);
        float S0 = S0(d10, P0, X0);
        if (d10 instanceof o8.c) {
            a.b bVar = X0.f12236a;
            float f11 = bVar.c;
            a.b bVar2 = X0.f12237b;
            ((o8.c) d10).setMaskXPercentage(f8.b.a(f11, bVar2.c, bVar.f12258a, bVar2.f12258a, P0));
        }
        return new a(d10, S0, X0);
    }

    public final void c1(View view) {
        float f10;
        if (view instanceof o8.c) {
            RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
            Rect rect = new Rect();
            o(rect, view);
            int i10 = rect.left + rect.right + 0;
            int i11 = rect.top + rect.bottom + 0;
            com.google.android.material.carousel.b bVar = this.f12229u;
            if (bVar != null) {
                f10 = bVar.f12261a.f12249a;
            } else {
                f10 = ((ViewGroup.MarginLayoutParams) nVar).width;
            }
            view.measure(RecyclerView.m.J(this.f4297n, this.f4295l, getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) nVar).leftMargin + ((ViewGroup.MarginLayoutParams) nVar).rightMargin + i10, (int) f10, true), RecyclerView.m.J(this.f4298o, this.f4296m, getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) nVar).topMargin + ((ViewGroup.MarginLayoutParams) nVar).bottomMargin + i11, ((ViewGroup.MarginLayoutParams) nVar).height, false));
            return;
        }
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    public final void d1() {
        com.google.android.material.carousel.a aVar;
        List<com.google.android.material.carousel.a> list;
        com.google.android.material.carousel.a aVar2;
        List<com.google.android.material.carousel.a> list2;
        int i10 = this.f12226r;
        int i11 = this.f12225q;
        if (i10 <= i11) {
            if (Y0()) {
                aVar2 = this.f12229u.c.get(list2.size() - 1);
            } else {
                aVar2 = this.f12229u.f12262b.get(list.size() - 1);
            }
            this.f12230v = aVar2;
        } else {
            com.google.android.material.carousel.b bVar = this.f12229u;
            float f10 = this.f12224p;
            float f11 = i11;
            float f12 = i10;
            float f13 = bVar.f12265f + f11;
            float f14 = f12 - bVar.f12266g;
            if (f10 < f13) {
                aVar = com.google.android.material.carousel.b.b(bVar.f12262b, f8.b.a(1.0f, 0.0f, f11, f13, f10), bVar.f12263d);
            } else if (f10 > f14) {
                aVar = com.google.android.material.carousel.b.b(bVar.c, f8.b.a(0.0f, 1.0f, f14, f12, f10), bVar.f12264e);
            } else {
                aVar = bVar.f12261a;
            }
            this.f12230v = aVar;
        }
        List<a.b> list3 = this.f12230v.f12250b;
        b bVar2 = this.f12227s;
        bVar2.getClass();
        bVar2.f12235b = Collections.unmodifiableList(list3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void e0(AccessibilityEvent accessibilityEvent) {
        super.e0(accessibilityEvent);
        if (I() > 0) {
            accessibilityEvent.setFromIndex(RecyclerView.m.P(H(0)));
            accessibilityEvent.setToIndex(RecyclerView.m.P(H(I() - 1)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void o0(RecyclerView.t tVar, RecyclerView.y yVar) {
        boolean z10;
        boolean z11;
        com.google.android.material.carousel.a aVar;
        a.b a10;
        int i10;
        int i11;
        com.google.android.material.carousel.a aVar2;
        a.b c10;
        float f10;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        List<a.b> list;
        boolean z12;
        boolean z13;
        int i17;
        int i18;
        int i19;
        boolean z14;
        int i20;
        if (yVar.b() <= 0) {
            v0(tVar);
            this.f12231w = 0;
            return;
        }
        boolean Y0 = Y0();
        boolean z15 = 1;
        if (this.f12229u == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            View d10 = tVar.d(0);
            c1(d10);
            com.google.android.material.carousel.a G = this.f12228t.G(this, d10);
            if (Y0) {
                a.C0164a c0164a = new a.C0164a(G.f12249a);
                float f11 = G.b().f12259b - (G.b().f12260d / 2.0f);
                List<a.b> list2 = G.f12250b;
                int size = list2.size() - 1;
                while (size >= 0) {
                    a.b bVar = list2.get(size);
                    float f12 = bVar.f12260d;
                    float f13 = (f12 / 2.0f) + f11;
                    if (size < G.c || size > G.f12251d) {
                        z15 = false;
                    }
                    c0164a.a(f13, bVar.c, f12, z15);
                    f11 += bVar.f12260d;
                    size--;
                    z15 = 1;
                }
                G = c0164a.b();
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(G);
            int i21 = 0;
            while (true) {
                int size2 = G.f12250b.size();
                list = G.f12250b;
                if (i21 < size2) {
                    if (list.get(i21).f12259b >= 0.0f) {
                        break;
                    }
                    i21++;
                } else {
                    i21 = -1;
                    break;
                }
            }
            if (G.a().f12259b - (G.a().f12260d / 2.0f) > 0.0f && G.a() != G.b()) {
                z12 = false;
            } else {
                z12 = true;
            }
            int i22 = G.f12251d;
            int i23 = G.c;
            if (!z12 && i21 != -1) {
                int i24 = (i23 - 1) - i21;
                float f14 = G.b().f12259b - (G.b().f12260d / 2.0f);
                int i25 = 0;
                while (i25 <= i24) {
                    com.google.android.material.carousel.a aVar3 = (com.google.android.material.carousel.a) arrayList.get(arrayList.size() - 1);
                    int size3 = list.size() - 1;
                    int i26 = (i21 + i25) - 1;
                    if (i26 >= 0) {
                        float f15 = list.get(i26).c;
                        i20 = i24;
                        int i27 = aVar3.f12251d;
                        while (true) {
                            List<a.b> list3 = aVar3.f12250b;
                            z14 = z10;
                            if (i27 < list3.size()) {
                                if (f15 == list3.get(i27).c) {
                                    break;
                                }
                                i27++;
                                z10 = z14;
                            } else {
                                i27 = list3.size() - 1;
                                break;
                            }
                        }
                        size3 = i27 - 1;
                    } else {
                        z14 = z10;
                        i20 = i24;
                    }
                    int i28 = i23;
                    arrayList.add(com.google.android.material.carousel.b.c(aVar3, i21, size3, f14, (i23 - i25) - 1, (i22 - i25) - 1));
                    i25++;
                    i23 = i28;
                    i22 = i22;
                    i24 = i20;
                    z10 = z14;
                }
            }
            z11 = z10;
            int i29 = i23;
            int i30 = i22;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(G);
            int size4 = list.size();
            while (true) {
                size4--;
                if (size4 >= 0) {
                    if (list.get(size4).f12259b <= this.f4297n) {
                        break;
                    }
                } else {
                    size4 = -1;
                    break;
                }
            }
            if ((G.c().f12260d / 2.0f) + G.c().f12259b < this.f4297n && G.c() != G.d()) {
                z13 = false;
            } else {
                z13 = true;
            }
            if (!z13 && size4 != -1) {
                int i31 = size4 - i30;
                float f16 = G.b().f12259b - (G.b().f12260d / 2.0f);
                int i32 = 0;
                while (i32 < i31) {
                    com.google.android.material.carousel.a aVar4 = (com.google.android.material.carousel.a) d.b(arrayList2, 1);
                    int i33 = (size4 - i32) + 1;
                    if (i33 < list.size()) {
                        float f17 = list.get(i33).c;
                        int i34 = aVar4.c - 1;
                        while (true) {
                            if (i34 >= 0) {
                                i17 = i31;
                                if (f17 == aVar4.f12250b.get(i34).c) {
                                    i19 = 1;
                                    break;
                                } else {
                                    i34--;
                                    i31 = i17;
                                }
                            } else {
                                i17 = i31;
                                i19 = 1;
                                i34 = 0;
                                break;
                            }
                        }
                        i18 = i34 + i19;
                    } else {
                        i17 = i31;
                        i18 = 0;
                    }
                    arrayList2.add(com.google.android.material.carousel.b.c(aVar4, size4, i18, f16, i29 + i32 + 1, i30 + i32 + 1));
                    i32++;
                    i31 = i17;
                }
            }
            this.f12229u = new com.google.android.material.carousel.b(G, arrayList, arrayList2);
            z15 = 1;
        } else {
            z11 = z10;
        }
        com.google.android.material.carousel.b bVar2 = this.f12229u;
        boolean Y02 = Y0();
        if (Y02) {
            aVar = (com.google.android.material.carousel.a) a0.a.f(bVar2.c, -1);
        } else {
            aVar = (com.google.android.material.carousel.a) a0.a.f(bVar2.f12262b, -1);
        }
        if (Y02) {
            a10 = aVar.c();
        } else {
            a10 = aVar.a();
        }
        int paddingStart = getPaddingStart();
        if (!Y02) {
            z15 = -1;
        }
        float f18 = paddingStart * z15;
        int i35 = (int) a10.f12258a;
        int i36 = (int) (aVar.f12249a / 2.0f);
        if (Y0()) {
            i10 = i35 + i36;
        } else {
            i10 = i35 - i36;
        }
        if (Y0()) {
            i11 = this.f4297n;
        } else {
            i11 = 0;
        }
        int i37 = (int) ((f18 + i11) - i10);
        com.google.android.material.carousel.b bVar3 = this.f12229u;
        boolean Y03 = Y0();
        if (Y03) {
            aVar2 = (com.google.android.material.carousel.a) a0.a.f(bVar3.f12262b, -1);
        } else {
            aVar2 = (com.google.android.material.carousel.a) a0.a.f(bVar3.c, -1);
        }
        if (Y03) {
            c10 = aVar2.a();
        } else {
            c10 = aVar2.c();
        }
        float b10 = ((yVar.b() - 1) * aVar2.f12249a) + getPaddingEnd();
        if (Y03) {
            f10 = -1.0f;
        } else {
            f10 = 1.0f;
        }
        float f19 = b10 * f10;
        float f20 = c10.f12258a;
        if (Y0()) {
            i12 = this.f4297n;
        } else {
            i12 = 0;
        }
        float f21 = f20 - i12;
        if (Y0()) {
            i13 = 0;
        } else {
            i13 = this.f4297n;
        }
        float f22 = i13 - c10.f12258a;
        if (Math.abs(f21) > Math.abs(f19)) {
            i14 = 0;
        } else {
            i14 = (int) ((f19 - f21) + f22);
        }
        if (Y0) {
            i15 = i14;
        } else {
            i15 = i37;
        }
        this.f12225q = i15;
        if (Y0) {
            i14 = i37;
        }
        this.f12226r = i14;
        if (z11) {
            this.f12224p = i37;
        } else {
            int i38 = this.f12224p;
            int i39 = i38 + 0;
            if (i39 < i15) {
                i16 = i15 - i38;
            } else if (i39 > i14) {
                i16 = i14 - i38;
            } else {
                i16 = 0;
            }
            this.f12224p = i16 + i38;
        }
        this.f12231w = com.google.android.play.core.assetpacks.c.n(this.f12231w, 0, yVar.b());
        d1();
        B(tVar);
        U0(tVar, yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void p0(RecyclerView.y yVar) {
        if (I() == 0) {
            this.f12231w = 0;
        } else {
            this.f12231w = RecyclerView.m.P(H(0));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int v(RecyclerView.y yVar) {
        return (int) this.f12229u.f12261a.f12249a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int w(RecyclerView.y yVar) {
        return this.f12224p;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int x(RecyclerView.y yVar) {
        return this.f12226r - this.f12225q;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean y0(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
        com.google.android.material.carousel.b bVar = this.f12229u;
        if (bVar == null) {
            return false;
        }
        int W0 = W0(bVar.f12261a, RecyclerView.m.P(view)) - this.f12224p;
        if (z11 || W0 == 0) {
            return false;
        }
        recyclerView.scrollBy(W0, 0);
        return true;
    }
}
