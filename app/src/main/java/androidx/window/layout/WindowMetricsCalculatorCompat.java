package androidx.window.layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.DisplayCutout;
import androidx.emoji2.text.u;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: WindowMetricsCalculatorCompat.kt */
/* loaded from: classes.dex */
public final class WindowMetricsCalculatorCompat implements WindowMetricsCalculator {
    public static final WindowMetricsCalculatorCompat INSTANCE = new WindowMetricsCalculatorCompat();
    private static final String TAG = "WindowMetricsCalculatorCompat";

    private WindowMetricsCalculatorCompat() {
    }

    @SuppressLint({"BanUncheckedReflection"})
    private final DisplayCutout getCutoutForDisplay(Display display) {
        try {
            Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(new Class[0]);
            constructor.setAccessible(true);
            Object newInstance = constructor.newInstance(new Object[0]);
            Method declaredMethod = display.getClass().getDeclaredMethod("getDisplayInfo", newInstance.getClass());
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(display, newInstance);
            Field declaredField = newInstance.getClass().getDeclaredField("displayCutout");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(newInstance);
            if (k.i(obj)) {
                return u.d(obj);
            }
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException unused) {
        }
        return null;
    }

    private final int getNavigationBarHeight(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private final void getRectSizeFromDisplay(Activity activity, Rect rect) {
        activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
    }

    @Override // androidx.window.layout.WindowMetricsCalculator
    public WindowMetrics computeCurrentWindowMetrics(Activity activity) {
        Rect computeWindowBoundsIceCreamSandwich$window_release;
        kotlin.jvm.internal.g.e(activity, "activity");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            computeWindowBoundsIceCreamSandwich$window_release = ActivityCompatHelperApi30.INSTANCE.currentWindowBounds(activity);
        } else if (i10 >= 29) {
            computeWindowBoundsIceCreamSandwich$window_release = computeWindowBoundsQ$window_release(activity);
        } else if (i10 >= 28) {
            computeWindowBoundsIceCreamSandwich$window_release = computeWindowBoundsP$window_release(activity);
        } else if (i10 >= 24) {
            computeWindowBoundsIceCreamSandwich$window_release = computeWindowBoundsN$window_release(activity);
        } else {
            computeWindowBoundsIceCreamSandwich$window_release = computeWindowBoundsIceCreamSandwich$window_release(activity);
        }
        return new WindowMetrics(computeWindowBoundsIceCreamSandwich$window_release);
    }

    @Override // androidx.window.layout.WindowMetricsCalculator
    public WindowMetrics computeMaximumWindowMetrics(Activity activity) {
        Rect rect;
        kotlin.jvm.internal.g.e(activity, "activity");
        if (Build.VERSION.SDK_INT >= 30) {
            rect = ActivityCompatHelperApi30.INSTANCE.maximumWindowBounds(activity);
        } else {
            Display display = activity.getWindowManager().getDefaultDisplay();
            kotlin.jvm.internal.g.d(display, "display");
            Point realSizeForDisplay$window_release = getRealSizeForDisplay$window_release(display);
            rect = new Rect(0, 0, realSizeForDisplay$window_release.x, realSizeForDisplay$window_release.y);
        }
        return new WindowMetrics(rect);
    }

    public final Rect computeWindowBoundsIceCreamSandwich$window_release(Activity activity) {
        int i10;
        kotlin.jvm.internal.g.e(activity, "activity");
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        kotlin.jvm.internal.g.d(defaultDisplay, "defaultDisplay");
        Point realSizeForDisplay$window_release = getRealSizeForDisplay$window_release(defaultDisplay);
        Rect rect = new Rect();
        int i11 = realSizeForDisplay$window_release.x;
        if (i11 != 0 && (i10 = realSizeForDisplay$window_release.y) != 0) {
            rect.right = i11;
            rect.bottom = i10;
        } else {
            defaultDisplay.getRectSize(rect);
        }
        return rect;
    }

    public final Rect computeWindowBoundsN$window_release(Activity activity) {
        kotlin.jvm.internal.g.e(activity, "activity");
        Rect rect = new Rect();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!ActivityCompatHelperApi24.INSTANCE.isInMultiWindowMode(activity)) {
            Point realSizeForDisplay$window_release = getRealSizeForDisplay$window_release(defaultDisplay);
            int navigationBarHeight = getNavigationBarHeight(activity);
            int i10 = rect.bottom;
            if (i10 + navigationBarHeight == realSizeForDisplay$window_release.y) {
                rect.bottom = i10 + navigationBarHeight;
            } else {
                int i11 = rect.right;
                if (i11 + navigationBarHeight == realSizeForDisplay$window_release.x) {
                    rect.right = i11 + navigationBarHeight;
                }
            }
        }
        return rect;
    }

    @SuppressLint({"BanUncheckedReflection", "BlockedPrivateApi"})
    public final Rect computeWindowBoundsP$window_release(Activity activity) {
        DisplayCutout cutoutForDisplay;
        kotlin.jvm.internal.g.e(activity, "activity");
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (ActivityCompatHelperApi24.INSTANCE.isInMultiWindowMode(activity)) {
                Object invoke = obj.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(obj, new Object[0]);
                if (invoke != null) {
                    rect.set((Rect) invoke);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                }
            } else {
                Object invoke2 = obj.getClass().getDeclaredMethod("getAppBounds", new Class[0]).invoke(obj, new Object[0]);
                if (invoke2 != null) {
                    rect.set((Rect) invoke2);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                }
            }
        } catch (IllegalAccessException unused) {
            getRectSizeFromDisplay(activity, rect);
        } catch (NoSuchFieldException unused2) {
            getRectSizeFromDisplay(activity, rect);
        } catch (NoSuchMethodException unused3) {
            getRectSizeFromDisplay(activity, rect);
        } catch (InvocationTargetException unused4) {
            getRectSizeFromDisplay(activity, rect);
        }
        Display currentDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        DisplayCompatHelperApi17 displayCompatHelperApi17 = DisplayCompatHelperApi17.INSTANCE;
        kotlin.jvm.internal.g.d(currentDisplay, "currentDisplay");
        displayCompatHelperApi17.getRealSize(currentDisplay, point);
        ActivityCompatHelperApi24 activityCompatHelperApi24 = ActivityCompatHelperApi24.INSTANCE;
        if (!activityCompatHelperApi24.isInMultiWindowMode(activity)) {
            int navigationBarHeight = getNavigationBarHeight(activity);
            int i10 = rect.bottom;
            if (i10 + navigationBarHeight == point.y) {
                rect.bottom = i10 + navigationBarHeight;
            } else {
                int i11 = rect.right;
                if (i11 + navigationBarHeight == point.x) {
                    rect.right = i11 + navigationBarHeight;
                } else if (rect.left == navigationBarHeight) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !activityCompatHelperApi24.isInMultiWindowMode(activity) && (cutoutForDisplay = getCutoutForDisplay(currentDisplay)) != null) {
            int i12 = rect.left;
            DisplayCompatHelperApi28 displayCompatHelperApi28 = DisplayCompatHelperApi28.INSTANCE;
            if (i12 == displayCompatHelperApi28.safeInsetLeft(cutoutForDisplay)) {
                rect.left = 0;
            }
            if (point.x - rect.right == displayCompatHelperApi28.safeInsetRight(cutoutForDisplay)) {
                rect.right = displayCompatHelperApi28.safeInsetRight(cutoutForDisplay) + rect.right;
            }
            if (rect.top == displayCompatHelperApi28.safeInsetTop(cutoutForDisplay)) {
                rect.top = 0;
            }
            if (point.y - rect.bottom == displayCompatHelperApi28.safeInsetBottom(cutoutForDisplay)) {
                rect.bottom = displayCompatHelperApi28.safeInsetBottom(cutoutForDisplay) + rect.bottom;
            }
        }
        return rect;
    }

    @SuppressLint({"BanUncheckedReflection", "BlockedPrivateApi"})
    public final Rect computeWindowBoundsQ$window_release(Activity activity) {
        kotlin.jvm.internal.g.e(activity, "activity");
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            Object invoke = obj.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(obj, new Object[0]);
            if (invoke != null) {
                return new Rect((Rect) invoke);
            }
            throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
        } catch (IllegalAccessException unused) {
            return computeWindowBoundsP$window_release(activity);
        } catch (NoSuchFieldException unused2) {
            return computeWindowBoundsP$window_release(activity);
        } catch (NoSuchMethodException unused3) {
            return computeWindowBoundsP$window_release(activity);
        } catch (InvocationTargetException unused4) {
            return computeWindowBoundsP$window_release(activity);
        }
    }

    public final Point getRealSizeForDisplay$window_release(Display display) {
        kotlin.jvm.internal.g.e(display, "display");
        Point point = new Point();
        DisplayCompatHelperApi17.INSTANCE.getRealSize(display, point);
        return point;
    }
}
