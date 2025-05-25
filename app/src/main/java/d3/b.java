package d3;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import com.afollestad.materialdialogs.GravityEnum;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: DialogUtils.java */
/* loaded from: classes.dex */
public final class b {

    /* compiled from: DialogUtils.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f16114a;

        static {
            int[] iArr = new int[GravityEnum.values().length];
            f16114a = iArr;
            try {
                iArr[GravityEnum.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16114a[GravityEnum.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static int a(float f10, int i10) {
        return Color.argb(Math.round(Color.alpha(i10) * f10), Color.red(i10), Color.green(i10), Color.blue(i10));
    }

    public static ColorStateList b(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(R.color.colorAccent, typedValue, true);
        int i10 = typedValue.type;
        if (i10 >= 28 && i10 <= 31) {
            return c(context, typedValue.data);
        }
        return context.getColorStateList(R.color.colorAccent);
    }

    public static ColorStateList c(Context context, int i10) {
        int g10 = g(context, 16842806, 0);
        if (i10 == 0) {
            i10 = g10;
        }
        return new ColorStateList(new int[][]{new int[]{-16842910}, new int[0]}, new int[]{a(0.4f, i10), i10});
    }

    public static boolean d(int i10) {
        if (1.0d - (((Color.blue(i10) * 0.114d) + ((Color.green(i10) * 0.587d) + (Color.red(i10) * 0.299d))) / 255.0d) >= 0.5d) {
            return true;
        }
        return false;
    }

    public static ColorStateList e(Context context, int i10, ColorStateList colorStateList) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i10});
        try {
            TypedValue peekValue = obtainStyledAttributes.peekValue(0);
            if (peekValue == null) {
                return colorStateList;
            }
            int i11 = peekValue.type;
            if (i11 >= 28 && i11 <= 31) {
                return c(context, peekValue.data);
            }
            ColorStateList colorStateList2 = obtainStyledAttributes.getColorStateList(0);
            if (colorStateList2 != null) {
                return colorStateList2;
            }
            return colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static boolean f(Context context, boolean z10, int i10) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i10});
        try {
            return obtainStyledAttributes.getBoolean(0, z10);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int g(Context context, int i10, int i11) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i10});
        try {
            return obtainStyledAttributes.getColor(0, i11);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static Drawable h(Context context, int i10) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i10});
        try {
            return obtainStyledAttributes.getDrawable(0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static GravityEnum i(Context context, int i10, GravityEnum gravityEnum) {
        int i11;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i10});
        try {
            int i12 = a.f16114a[gravityEnum.ordinal()];
            if (i12 != 1) {
                if (i12 != 2) {
                    i11 = 0;
                } else {
                    i11 = 2;
                }
            } else {
                i11 = 1;
            }
            int i13 = obtainStyledAttributes.getInt(0, i11);
            if (i13 != 1) {
                if (i13 != 2) {
                    return GravityEnum.START;
                }
                return GravityEnum.END;
            }
            return GravityEnum.CENTER;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
