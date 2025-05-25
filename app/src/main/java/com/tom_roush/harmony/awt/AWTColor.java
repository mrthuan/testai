package com.tom_roush.harmony.awt;

import android.graphics.Color;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* loaded from: classes2.dex */
public class AWTColor {
    public static final AWTColor BLACK;
    public static final AWTColor BLUE;
    public static final AWTColor CYAN;
    public static final AWTColor DARK_GRAY;
    public static final AWTColor GRAY;
    public static final AWTColor GREEN;
    public static final AWTColor LIGHT_GRAY;
    public static final AWTColor MAGENTA;
    public static final AWTColor ORANGE;
    public static final AWTColor PINK;
    public static final AWTColor RED;
    public static final AWTColor WHITE;
    public static final AWTColor YELLOW;
    public static final AWTColor black;
    public static final AWTColor blue;
    public static final AWTColor cyan;
    public static final AWTColor darkGray;
    public static final AWTColor gray;
    public static final AWTColor green;
    public static final AWTColor lightGray;
    public static final AWTColor magenta;
    public static final AWTColor orange;
    public static final AWTColor pink;
    public static final AWTColor red;
    public static final AWTColor white;
    public static final AWTColor yellow;
    public int color;

    static {
        AWTColor aWTColor = new AWTColor((int) FunctionEval.FunctionID.EXTERNAL_FUNC, (int) FunctionEval.FunctionID.EXTERNAL_FUNC, (int) FunctionEval.FunctionID.EXTERNAL_FUNC);
        white = aWTColor;
        WHITE = aWTColor;
        AWTColor aWTColor2 = new AWTColor(192, 192, 192);
        lightGray = aWTColor2;
        LIGHT_GRAY = aWTColor2;
        AWTColor aWTColor3 = new AWTColor(128, 128, 128);
        gray = aWTColor3;
        GRAY = aWTColor3;
        AWTColor aWTColor4 = new AWTColor(64, 64, 64);
        darkGray = aWTColor4;
        DARK_GRAY = aWTColor4;
        AWTColor aWTColor5 = new AWTColor(0, 0, 0);
        black = aWTColor5;
        BLACK = aWTColor5;
        AWTColor aWTColor6 = new AWTColor((int) FunctionEval.FunctionID.EXTERNAL_FUNC, 0, 0);
        red = aWTColor6;
        RED = aWTColor6;
        AWTColor aWTColor7 = new AWTColor((int) FunctionEval.FunctionID.EXTERNAL_FUNC, (int) ShapeTypes.FUNNEL, (int) ShapeTypes.FUNNEL);
        pink = aWTColor7;
        PINK = aWTColor7;
        AWTColor aWTColor8 = new AWTColor((int) FunctionEval.FunctionID.EXTERNAL_FUNC, 200, 0);
        orange = aWTColor8;
        ORANGE = aWTColor8;
        AWTColor aWTColor9 = new AWTColor((int) FunctionEval.FunctionID.EXTERNAL_FUNC, (int) FunctionEval.FunctionID.EXTERNAL_FUNC, 0);
        yellow = aWTColor9;
        YELLOW = aWTColor9;
        AWTColor aWTColor10 = new AWTColor(0, (int) FunctionEval.FunctionID.EXTERNAL_FUNC, 0);
        green = aWTColor10;
        GREEN = aWTColor10;
        AWTColor aWTColor11 = new AWTColor((int) FunctionEval.FunctionID.EXTERNAL_FUNC, 0, (int) FunctionEval.FunctionID.EXTERNAL_FUNC);
        magenta = aWTColor11;
        MAGENTA = aWTColor11;
        AWTColor aWTColor12 = new AWTColor(0, (int) FunctionEval.FunctionID.EXTERNAL_FUNC, (int) FunctionEval.FunctionID.EXTERNAL_FUNC);
        cyan = aWTColor12;
        CYAN = aWTColor12;
        AWTColor aWTColor13 = new AWTColor(0, 0, (int) FunctionEval.FunctionID.EXTERNAL_FUNC);
        blue = aWTColor13;
        BLUE = aWTColor13;
    }

    public AWTColor(int i10) {
        this.color = i10;
    }

    public int getAlpha() {
        return Color.alpha(this.color);
    }

    public int getBlue() {
        return Color.blue(this.color);
    }

    public int getGreen() {
        return Color.green(this.color);
    }

    public float[] getRGBColorComponents(float[] fArr) {
        if (fArr == null) {
            fArr = new float[3];
        }
        fArr[0] = getRed() / 255.0f;
        fArr[1] = getGreen() / 255.0f;
        fArr[2] = getBlue() / 255.0f;
        return fArr;
    }

    public int getRed() {
        return Color.red(this.color);
    }

    public AWTColor(int i10, int i11, int i12) {
        this(i10, i11, i12, FunctionEval.FunctionID.EXTERNAL_FUNC);
    }

    public AWTColor(int i10, int i11, int i12, int i13) {
        this.color = Color.argb(i13, i10, i11, i12);
    }

    public AWTColor(float f10, float f11, float f12) {
        this.color = Color.rgb((int) (f10 * 255.0f), (int) (f11 * 255.0f), (int) (f12 * 255.0f));
    }
}
