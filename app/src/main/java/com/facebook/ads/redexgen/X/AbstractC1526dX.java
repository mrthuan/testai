package com.facebook.ads.redexgen.X;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.dX  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1526dX {
    public static final Point A00 = new Point();

    public static boolean A00(View view, Rect rect, Rect rect2, Rect rect3) {
        if (!view.isShown()) {
            rect.setEmpty();
            rect2.setEmpty();
            return false;
        } else if (!view.getGlobalVisibleRect(rect, A00)) {
            rect2.setEmpty();
            rect.setEmpty();
            return false;
        } else if (!rect.intersect(rect3)) {
            rect2.setEmpty();
            rect.setEmpty();
            return false;
        } else {
            rect2.set(A00.x, A00.y, A00.x + view.getWidth(), A00.y + view.getHeight());
            return true;
        }
    }
}
