package x8;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import b9.b;
import o0.d;

/* compiled from: MotionUtils.java */
/* loaded from: classes2.dex */
public final class a {
    public static float a(int i10, String[] strArr) {
        float parseFloat = Float.parseFloat(strArr[i10]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    public static boolean b(String str, String str2) {
        if (str.startsWith(str2.concat("(")) && str.endsWith(")")) {
            return true;
        }
        return false;
    }

    public static int c(Context context, int i10, int i11) {
        TypedValue a10 = b.a(context, i10);
        if (a10 != null && a10.type == 16) {
            return a10.data;
        }
        return i11;
    }

    public static TimeInterpolator d(Context context, int i10, Interpolator interpolator) {
        boolean z10;
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i10, typedValue, true)) {
            return interpolator;
        }
        if (typedValue.type == 3) {
            String valueOf = String.valueOf(typedValue.string);
            if (!b(valueOf, "cubic-bezier") && !b(valueOf, "path")) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                if (b(valueOf, "cubic-bezier")) {
                    String[] split = valueOf.substring(13, valueOf.length() - 1).split(",");
                    if (split.length == 4) {
                        return z0.a.b(a(0, split), a(1, split), a(2, split), a(3, split));
                    }
                    throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + split.length);
                } else if (b(valueOf, "path")) {
                    return z0.a.c(d.d(valueOf.substring(5, valueOf.length() - 1)));
                } else {
                    throw new IllegalArgumentException("Invalid motion easing type: ".concat(valueOf));
                }
            }
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
    }
}
