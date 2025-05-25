package com.bytedance.sdk.openadsdk.core;

import android.graphics.Rect;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.bannerexpress.BannerExpressView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;
import com.bytedance.sdk.openadsdk.utils.zn;

/* compiled from: VisibilityChecker.java */
/* loaded from: classes.dex */
public class sDy {
    private static int CJ(View view, int i10) {
        if (i10 == 3) {
            return zn.CJ(view.getContext().getApplicationContext()) / 2;
        }
        return 20;
    }

    private static boolean Qhi(View view, int i10) {
        float Qhi = Qhi(view);
        return Qhi > 0.0f && Qhi >= ((float) i10) / 100.0f;
    }

    private static int ac(View view, int i10) {
        if (i10 == 3) {
            return (int) (zn.ac(view.getContext().getApplicationContext()) * 0.7d);
        }
        return 20;
    }

    private static boolean cJ(View view) {
        return view != null && view.isShown();
    }

    public static float Qhi(View view) {
        if (view != null) {
            try {
                if (view.getVisibility() == 0 && view.getParent() != null) {
                    Rect rect = new Rect();
                    if (view.getGlobalVisibleRect(rect)) {
                        long height = rect.height() * rect.width();
                        long height2 = view.getHeight() * view.getWidth();
                        if (height2 <= 0) {
                            return -1.0f;
                        }
                        return ((float) height) / ((float) height2);
                    }
                    return -1.0f;
                }
            } catch (Throwable unused) {
            }
        }
        return -1.0f;
    }

    private static boolean cJ(View view, int i10) {
        return view.getWidth() >= ac(view, i10) && view.getHeight() >= CJ(view, i10);
    }

    private static int cJ(View view, int i10, int i11) {
        if (view.getWindowVisibility() != 0) {
            return 4;
        }
        if (cJ(view)) {
            if (cJ(view, i11)) {
                return !Qhi(view, i10) ? 3 : 0;
            }
            return 6;
        }
        return 1;
    }

    public static boolean Qhi(View view, int i10, int i11) {
        if (i11 == 1) {
            while (view != null) {
                try {
                    if (view.getVisibility() == 0) {
                        if ((view instanceof NativeExpressView) || (view instanceof BannerExpressView)) {
                            break;
                        }
                        view = (View) view.getParent();
                    } else {
                        return false;
                    }
                } catch (Throwable unused) {
                }
            }
        }
        return cJ(view, i10, i11) == 0;
    }
}
