package dc;

import android.content.res.Resources;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.webkit.WebView;
import android.widget.AbsListView;
import android.widget.ScrollView;
import androidx.activity.r;
import androidx.viewpager.widget.ViewPager;
import pdf.pdfreader.viewer.editor.free.R;
import x0.o;
import x0.s;
import x0.z;

/* compiled from: SmartUtil.java */
/* loaded from: classes2.dex */
public final class b implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    public static final float f16186a = Resources.getSystem().getDisplayMetrics().density;

    /* renamed from: b  reason: collision with root package name */
    public static final float f16187b;
    public static final float c;

    static {
        float g10 = 1.0f / g(1.0f);
        f16187b = g10;
        c = 1.0f - (g(1.0f) * g10);
    }

    public static boolean a(View view, PointF pointF, boolean z10) {
        boolean z11;
        if (view.canScrollVertically(1) && view.getVisibility() == 0) {
            return false;
        }
        if ((view instanceof ViewGroup) && pointF != null) {
            if ((view instanceof yb.a) || (!(view instanceof AbsListView) && !(view instanceof ScrollView) && !(view instanceof z) && !(view instanceof WebView) && !(view instanceof o))) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (!z11) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                PointF pointF2 = new PointF();
                while (childCount > 0) {
                    childCount--;
                    View childAt = viewGroup.getChildAt(childCount);
                    if (e(viewGroup, childAt, pointF.x, pointF.y, pointF2)) {
                        Object tag = childAt.getTag(R.id.srl_tag);
                        if ("fixed".equals(tag) || "fixed-top".equals(tag)) {
                            return false;
                        }
                        pointF.offset(pointF2.x, pointF2.y);
                        boolean a10 = a(childAt, pointF, z10);
                        pointF.offset(-pointF2.x, -pointF2.y);
                        return a10;
                    }
                }
            }
        }
        if (z10 || view.canScrollVertically(-1)) {
            return true;
        }
        return false;
    }

    public static boolean b(View view, PointF pointF) {
        if (view.canScrollVertically(-1) && view.getVisibility() == 0) {
            return false;
        }
        if ((view instanceof ViewGroup) && pointF != null) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            PointF pointF2 = new PointF();
            while (childCount > 0) {
                childCount--;
                View childAt = viewGroup.getChildAt(childCount);
                if (e(viewGroup, childAt, pointF.x, pointF.y, pointF2)) {
                    Object tag = childAt.getTag(R.id.srl_tag);
                    if ("fixed".equals(tag) || "fixed-bottom".equals(tag)) {
                        return false;
                    }
                    pointF.offset(pointF2.x, pointF2.y);
                    boolean b10 = b(childAt, pointF);
                    pointF.offset(-pointF2.x, -pointF2.y);
                    return b10;
                }
            }
            return true;
        }
        return true;
    }

    public static int c(float f10) {
        return (int) ((f10 * f16186a) + 0.5f);
    }

    public static boolean d(View view) {
        boolean z10;
        boolean z11 = view instanceof yb.a;
        if (z11) {
            return false;
        }
        if (z11 || (!(view instanceof AbsListView) && !(view instanceof ScrollView) && !(view instanceof z) && !(view instanceof WebView) && !(view instanceof o))) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10 && !(view instanceof ViewPager) && !(view instanceof s)) {
            return false;
        }
        return true;
    }

    public static boolean e(View view, View view2, float f10, float f11, PointF pointF) {
        boolean z10;
        if (view2.getVisibility() != 0) {
            return false;
        }
        float[] fArr = {f10, f11};
        fArr[0] = (view.getScrollX() - view2.getLeft()) + f10;
        float scrollY = fArr[1] + (view.getScrollY() - view2.getTop());
        fArr[1] = scrollY;
        float f12 = fArr[0];
        if (f12 >= 0.0f && scrollY >= 0.0f && f12 < view2.getWidth() && fArr[1] < view2.getHeight()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            pointF.set(fArr[0] - f10, fArr[1] - f11);
        }
        return z10;
    }

    public static int f(View view) {
        int makeMeasureSpec;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(0, 0, layoutParams.width);
        int i10 = layoutParams.height;
        if (i10 > 0) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
        } else {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        view.measure(childMeasureSpec, makeMeasureSpec);
        return view.getMeasuredHeight();
    }

    public static float g(float f10) {
        float f11 = f10 * 8.0f;
        if (f11 < 1.0f) {
            return f11 - (1.0f - ((float) Math.exp(-f11)));
        }
        return r.l(1.0f, (float) Math.exp(1.0f - f11), 0.63212055f, 0.36787945f);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f10) {
        float g10 = g(f10) * f16187b;
        if (g10 > 0.0f) {
            return g10 + c;
        }
        return g10;
    }
}
