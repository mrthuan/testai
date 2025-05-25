package com.google.android.material.carousel;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.w;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.a;
import lib.zj.office.fc.hslf.record.SlideAtom;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: MultiBrowseCarouselStrategy.java */
/* loaded from: classes2.dex */
public final class c extends w {

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f12267d = {1};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f12268e = {1, 0};

    /* compiled from: MultiBrowseCarouselStrategy.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f12269a;

        /* renamed from: b  reason: collision with root package name */
        public float f12270b;
        public final int c;

        /* renamed from: d  reason: collision with root package name */
        public final int f12271d;

        /* renamed from: e  reason: collision with root package name */
        public float f12272e;

        /* renamed from: f  reason: collision with root package name */
        public float f12273f;

        /* renamed from: g  reason: collision with root package name */
        public final int f12274g;

        /* renamed from: h  reason: collision with root package name */
        public final float f12275h;

        /* JADX WARN: Code restructure failed: missing block: B:30:0x009f, code lost:
            if (r9 > r5.f12270b) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00ac, code lost:
            if (r5.f12273f <= r5.f12270b) goto L31;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public a(int r6, float r7, float r8, float r9, int r10, float r11, int r12, float r13, int r14, float r15) {
            /*
                Method dump skipped, instructions count: 194
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.carousel.c.a.<init>(int, float, float, float, int, float, int, float, int, float):void");
        }

        public final String toString() {
            return "Arrangement [priority=" + this.f12269a + ", smallCount=" + this.c + ", smallSize=" + this.f12270b + ", mediumCount=" + this.f12271d + ", mediumSize=" + this.f12272e + ", largeCount=" + this.f12274g + ", largeSize=" + this.f12273f + ", cost=" + this.f12275h + "]";
        }
    }

    @Override // androidx.fragment.app.w
    public final com.google.android.material.carousel.a G(o8.a aVar, View view) {
        CarouselLayoutManager carouselLayoutManager;
        float f10;
        float f11;
        CarouselLayoutManager carouselLayoutManager2;
        float f12;
        CarouselLayoutManager carouselLayoutManager3 = (CarouselLayoutManager) aVar;
        float f13 = carouselLayoutManager3.f4297n;
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        float f14 = ((ViewGroup.MarginLayoutParams) nVar).leftMargin + ((ViewGroup.MarginLayoutParams) nVar).rightMargin;
        float dimension = view.getContext().getResources().getDimension(R.dimen.m3_carousel_small_item_size_min) + f14;
        float dimension2 = view.getContext().getResources().getDimension(R.dimen.m3_carousel_small_item_size_max) + f14;
        float measuredWidth = view.getMeasuredWidth();
        float min = Math.min(measuredWidth + f14, f13);
        float m10 = com.google.android.play.core.assetpacks.c.m((measuredWidth / 3.0f) + f14, view.getContext().getResources().getDimension(R.dimen.m3_carousel_small_item_size_min) + f14, view.getContext().getResources().getDimension(R.dimen.m3_carousel_small_item_size_max) + f14);
        float f15 = (min + m10) / 2.0f;
        int[] iArr = f12267d;
        int[] iArr2 = f12268e;
        int i10 = SlideAtom.USES_MASTER_SLIDE_ID;
        int i11 = 0;
        int i12 = Integer.MIN_VALUE;
        for (int i13 : iArr2) {
            if (i13 > i12) {
                i12 = i13;
            }
        }
        float f16 = f13 - (i12 * f15);
        int i14 = iArr[0];
        if (i14 > Integer.MIN_VALUE) {
            i10 = i14;
        }
        int ceil = (int) Math.ceil(f13 / min);
        int i15 = 1;
        int max = (ceil - ((int) Math.max(1.0d, Math.floor((f16 - (i10 * dimension2)) / min)))) + 1;
        int[] iArr3 = new int[max];
        for (int i16 = 0; i16 < max; i16++) {
            iArr3[i16] = ceil - i16;
        }
        a aVar2 = null;
        int i17 = 1;
        int i18 = 0;
        loop2: while (true) {
            float f17 = 0.0f;
            if (i18 < max) {
                int i19 = iArr3[i18];
                int length = iArr2.length;
                int i20 = i11;
                while (i20 < length) {
                    int i21 = iArr2[i20];
                    int i22 = i17;
                    a aVar3 = aVar2;
                    int i23 = i11;
                    while (i23 < i15) {
                        carouselLayoutManager = carouselLayoutManager3;
                        int i24 = i23;
                        f11 = f14;
                        a aVar4 = aVar3;
                        int i25 = i20;
                        int i26 = length;
                        float f18 = dimension;
                        float f19 = dimension;
                        f10 = f17;
                        int i27 = i18;
                        int[] iArr4 = iArr3;
                        int i28 = max;
                        int[] iArr5 = iArr2;
                        a aVar5 = new a(i22, m10, f18, dimension2, iArr[i23], f15, i21, min, i19, f13);
                        float f20 = aVar5.f12275h;
                        if (aVar4 != null && f20 >= aVar4.f12275h) {
                            aVar3 = aVar4;
                        } else if (f20 == f10) {
                            aVar2 = aVar5;
                            break loop2;
                        } else {
                            aVar3 = aVar5;
                        }
                        i22++;
                        i23 = i24 + 1;
                        carouselLayoutManager3 = carouselLayoutManager;
                        f17 = f10;
                        iArr3 = iArr4;
                        f14 = f11;
                        i20 = i25;
                        length = i26;
                        dimension = f19;
                        i18 = i27;
                        max = i28;
                        iArr2 = iArr5;
                        i15 = 1;
                    }
                    i20++;
                    aVar2 = aVar3;
                    i17 = i22;
                    f14 = f14;
                    dimension = dimension;
                    i15 = 1;
                    i11 = 0;
                }
                i18++;
                i15 = 1;
                i11 = 0;
            } else {
                carouselLayoutManager = carouselLayoutManager3;
                f10 = 0.0f;
                f11 = f14;
                break;
            }
        }
        float dimension3 = view.getContext().getResources().getDimension(R.dimen.m3_carousel_gone_size) + f11;
        float f21 = dimension3 / 2.0f;
        float f22 = f10 - f21;
        float f23 = (aVar2.f12273f / 2.0f) + f10;
        int i29 = aVar2.f12274g;
        int i30 = 0;
        float f24 = aVar2.f12273f;
        float max2 = (Math.max(0, i29 - 1) * f24) + f23;
        float f25 = (f24 / 2.0f) + max2;
        int i31 = aVar2.f12271d;
        if (i31 > 0) {
            max2 = (aVar2.f12272e / 2.0f) + f25;
        }
        if (i31 > 0) {
            f25 = (aVar2.f12272e / 2.0f) + max2;
        }
        int i32 = aVar2.c;
        if (i32 > 0) {
            f12 = (aVar2.f12270b / 2.0f) + f25;
            carouselLayoutManager2 = carouselLayoutManager;
        } else {
            carouselLayoutManager2 = carouselLayoutManager;
            f12 = max2;
        }
        float f26 = f21 + carouselLayoutManager2.f4297n;
        float f27 = 1.0f - ((dimension3 - f11) / (f24 - f11));
        float f28 = 1.0f - ((aVar2.f12270b - f11) / (f24 - f11));
        float f29 = 1.0f - ((aVar2.f12272e - f11) / (f24 - f11));
        a.C0164a c0164a = new a.C0164a(f24);
        c0164a.a(f22, f27, dimension3, false);
        float f30 = aVar2.f12273f;
        if (i29 > 0 && f30 > 0.0f) {
            while (i30 < i29) {
                c0164a.a((i30 * f30) + f23, 0.0f, f30, true);
                i30++;
                f23 = f23;
                i29 = i29;
            }
        }
        if (i31 > 0) {
            c0164a.a(max2, f29, aVar2.f12272e, false);
        }
        if (i32 > 0) {
            float f31 = aVar2.f12270b;
            if (i32 > 0 && f31 > 0.0f) {
                for (int i33 = 0; i33 < i32; i33++) {
                    c0164a.a((i33 * f31) + f12, f28, f31, false);
                }
            }
        }
        c0164a.a(f26, f27, dimension3, false);
        return c0164a.b();
    }
}
