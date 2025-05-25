package c9;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.StateSet;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

/* compiled from: RippleUtils.java */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f5667a = {16842919};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f5668b = {16842908};
    public static final int[] c = {16842913, 16842919};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f5669d = {16842913};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f5670e = {16842910, 16842919};

    public static ColorStateList a(ColorStateList colorStateList) {
        int[] iArr = f5668b;
        return new ColorStateList(new int[][]{f5669d, iArr, StateSet.NOTHING}, new int[]{b(colorStateList, c), b(colorStateList, iArr), b(colorStateList, f5667a)});
    }

    public static int b(ColorStateList colorStateList, int[] iArr) {
        int i10;
        if (colorStateList != null) {
            i10 = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        } else {
            i10 = 0;
        }
        return o0.a.d(i10, Math.min(Color.alpha(i10) * 2, (int) FunctionEval.FunctionID.EXTERNAL_FUNC));
    }

    public static ColorStateList c(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0) {
                Color.alpha(colorStateList.getColorForState(f5670e, 0));
            }
            return colorStateList;
        }
        return ColorStateList.valueOf(0);
    }

    public static boolean d(int[] iArr) {
        boolean z10 = false;
        boolean z11 = false;
        for (int i10 : iArr) {
            if (i10 == 16842910) {
                z10 = true;
            } else if (i10 == 16842908 || i10 == 16842919 || i10 == 16843623) {
                z11 = true;
            }
        }
        if (!z10 || !z11) {
            return false;
        }
        return true;
    }
}
