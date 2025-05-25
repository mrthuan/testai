package com.facebook.ads.redexgen.X;

import android.os.Build;

/* renamed from: com.facebook.ads.redexgen.X.3r  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C05263r extends FL {
    public static String[] A00 = {"4mrgyhu5NuMSfoRJ7wvth", "0QrbVGKHuGc2eSGsbm7N10peHve4GVgP", "Meba3O6SWeMBrZzPyfP10SBJe7jX", "3Oa5wanHMWuCrkjHvXNfwyLB0ZtCKHr4", "YOQh7xYBrfW2123ECT3lDkRgUFpenV07", "JuO7BKBrPjkMVs4", "5m", "UWhmaXdvjdchgK72Wd2HML9QO634NCpp"};

    public C05263r(C1314Zs c1314Zs) {
        super(c1314Zs);
        setCarouselLayoutManager(c1314Zs);
    }

    public TU getFullscreenCarouselRecyclerViewAdapter() {
        getAdapter();
        if (0 != 0) {
            getAdapter();
            return null;
        } else if (A00[6].length() != 2) {
            throw new RuntimeException();
        } else {
            A00[2] = "XAsjP5XwQSgGjSaOGRXjEIyXW47w";
            return null;
        }
    }

    @Override // com.facebook.ads.redexgen.X.FL
    public C1376at getLayoutManager() {
        return (C1376at) super.getLayoutManager();
    }

    public AbstractC05534t getOnScrollListener() {
        return new VX(this);
    }

    private void setCarouselLayoutManager(C1314Zs c1314Zs) {
        C1376at c1376at = new C1376at(c1314Zs, 0, false);
        if (Build.VERSION.SDK_INT >= 24) {
            c1376at.A1R(true);
        }
        super.setLayoutManager(c1376at);
    }

    @Override // com.facebook.ads.redexgen.X.FL
    public void setLayoutManager(AbstractC05484o abstractC05484o) {
    }
}
