package b9;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.appcompat.widget.u0;

/* compiled from: MaterialResources.java */
/* loaded from: classes2.dex */
public final class c {
    public static ColorStateList a(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        ColorStateList colorStateList;
        if (typedArray.hasValue(i10) && (resourceId = typedArray.getResourceId(i10, 0)) != 0 && (colorStateList = androidx.core.content.a.getColorStateList(context, resourceId)) != null) {
            return colorStateList;
        }
        return typedArray.getColorStateList(i10);
    }

    public static ColorStateList b(Context context, u0 u0Var, int i10) {
        int i11;
        ColorStateList colorStateList;
        if (u0Var.l(i10) && (i11 = u0Var.i(i10, 0)) != 0 && (colorStateList = androidx.core.content.a.getColorStateList(context, i11)) != null) {
            return colorStateList;
        }
        return u0Var.b(i10);
    }

    public static int c(Context context, TypedArray typedArray, int i10, int i11) {
        TypedValue typedValue = new TypedValue();
        if (typedArray.getValue(i10, typedValue) && typedValue.type == 2) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i11);
            obtainStyledAttributes.recycle();
            return dimensionPixelSize;
        }
        return typedArray.getDimensionPixelSize(i10, i11);
    }

    public static Drawable d(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        Drawable a10;
        if (typedArray.hasValue(i10) && (resourceId = typedArray.getResourceId(i10, 0)) != 0 && (a10 = m.a.a(context, resourceId)) != null) {
            return a10;
        }
        return typedArray.getDrawable(i10);
    }

    public static boolean e(Context context) {
        if (context.getResources().getConfiguration().fontScale >= 1.3f) {
            return true;
        }
        return false;
    }
}
