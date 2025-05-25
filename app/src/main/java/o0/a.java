package o0;

import android.graphics.Color;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

/* compiled from: ColorUtils.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<double[]> f22637a = new ThreadLocal<>();

    public static int a(double d10, double d11, double d12) {
        double d13;
        double d14;
        double d15;
        int min;
        int min2;
        double d16 = (((-0.4986d) * d12) + (((-1.5372d) * d11) + (3.2406d * d10))) / 100.0d;
        double d17 = ((0.0415d * d12) + ((1.8758d * d11) + ((-0.9689d) * d10))) / 100.0d;
        double d18 = ((1.057d * d12) + (((-0.204d) * d11) + (0.0557d * d10))) / 100.0d;
        if (d16 > 0.0031308d) {
            d13 = (Math.pow(d16, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d13 = d16 * 12.92d;
        }
        if (d17 > 0.0031308d) {
            d14 = (Math.pow(d17, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d14 = d17 * 12.92d;
        }
        if (d18 > 0.0031308d) {
            d15 = (Math.pow(d18, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d15 = d18 * 12.92d;
        }
        int round = (int) Math.round(d13 * 255.0d);
        int i10 = 0;
        if (round < 0) {
            min = 0;
        } else {
            min = Math.min(round, (int) FunctionEval.FunctionID.EXTERNAL_FUNC);
        }
        int round2 = (int) Math.round(d14 * 255.0d);
        if (round2 < 0) {
            min2 = 0;
        } else {
            min2 = Math.min(round2, (int) FunctionEval.FunctionID.EXTERNAL_FUNC);
        }
        int round3 = (int) Math.round(d15 * 255.0d);
        if (round3 >= 0) {
            i10 = Math.min(round3, (int) FunctionEval.FunctionID.EXTERNAL_FUNC);
        }
        return Color.rgb(min, min2, i10);
    }

    public static int b(float f10, int i10, int i11) {
        float f11 = 1.0f - f10;
        return Color.argb((int) ((Color.alpha(i11) * f10) + (Color.alpha(i10) * f11)), (int) ((Color.red(i11) * f10) + (Color.red(i10) * f11)), (int) ((Color.green(i11) * f10) + (Color.green(i10) * f11)), (int) ((Color.blue(i11) * f10) + (Color.blue(i10) * f11)));
    }

    public static int c(int i10, int i11) {
        int i12;
        int i13;
        int alpha = Color.alpha(i11);
        int alpha2 = Color.alpha(i10);
        int i14 = 255 - alpha2;
        int i15 = 255 - (((255 - alpha) * i14) / FunctionEval.FunctionID.EXTERNAL_FUNC);
        int red = Color.red(i10);
        int red2 = Color.red(i11);
        int i16 = 0;
        if (i15 == 0) {
            i12 = 0;
        } else {
            i12 = (((red2 * alpha) * i14) + ((red * FunctionEval.FunctionID.EXTERNAL_FUNC) * alpha2)) / (i15 * FunctionEval.FunctionID.EXTERNAL_FUNC);
        }
        int green = Color.green(i10);
        int green2 = Color.green(i11);
        if (i15 == 0) {
            i13 = 0;
        } else {
            i13 = (((green2 * alpha) * i14) + ((green * FunctionEval.FunctionID.EXTERNAL_FUNC) * alpha2)) / (i15 * FunctionEval.FunctionID.EXTERNAL_FUNC);
        }
        int blue = Color.blue(i10);
        int blue2 = Color.blue(i11);
        if (i15 != 0) {
            i16 = (((blue2 * alpha) * i14) + ((blue * FunctionEval.FunctionID.EXTERNAL_FUNC) * alpha2)) / (i15 * FunctionEval.FunctionID.EXTERNAL_FUNC);
        }
        return Color.argb(i15, i12, i13, i16);
    }

    public static int d(int i10, int i11) {
        if (i11 >= 0 && i11 <= 255) {
            return (i10 & 16777215) | (i11 << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }
}
