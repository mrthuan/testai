package lib.zj.office.java.awt;

import a6.h;
import java.io.Serializable;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* loaded from: classes3.dex */
public class Color implements Serializable {
    public static final Color BLACK;
    public static final Color BLUE;
    public static final Color CYAN;
    public static final Color DARK_GRAY;
    public static final Color GRAY;
    public static final Color GREEN;
    public static final Color LIGHT_GRAY;
    public static final Color MAGENTA;
    public static final Color ORANGE;
    public static final Color PINK;
    public static final Color RED;
    public static final Color WHITE;
    public static final Color YELLOW;
    public static final Color black;
    public static final Color blue;
    public static final Color cyan;
    public static final Color darkGray;
    public static final Color gray;
    public static final Color green;
    public static final Color lightGray;
    public static final Color magenta;
    public static final Color orange;
    public static final Color pink;
    public static final Color red;
    private static final long serialVersionUID = 118526816881161077L;
    public static final Color white;
    public static final Color yellow;
    private float falpha;
    private float[] frgbvalue;
    private float[] fvalue;
    int value;

    static {
        Color color = new Color((int) FunctionEval.FunctionID.EXTERNAL_FUNC, (int) FunctionEval.FunctionID.EXTERNAL_FUNC, (int) FunctionEval.FunctionID.EXTERNAL_FUNC);
        white = color;
        WHITE = color;
        Color color2 = new Color(192, 192, 192);
        lightGray = color2;
        LIGHT_GRAY = color2;
        Color color3 = new Color(128, 128, 128);
        gray = color3;
        GRAY = color3;
        Color color4 = new Color(64, 64, 64);
        darkGray = color4;
        DARK_GRAY = color4;
        Color color5 = new Color(0, 0, 0);
        black = color5;
        BLACK = color5;
        Color color6 = new Color((int) FunctionEval.FunctionID.EXTERNAL_FUNC, 0, 0);
        red = color6;
        RED = color6;
        Color color7 = new Color((int) FunctionEval.FunctionID.EXTERNAL_FUNC, (int) ShapeTypes.FUNNEL, (int) ShapeTypes.FUNNEL);
        pink = color7;
        PINK = color7;
        Color color8 = new Color((int) FunctionEval.FunctionID.EXTERNAL_FUNC, 200, 0);
        orange = color8;
        ORANGE = color8;
        Color color9 = new Color((int) FunctionEval.FunctionID.EXTERNAL_FUNC, (int) FunctionEval.FunctionID.EXTERNAL_FUNC, 0);
        yellow = color9;
        YELLOW = color9;
        Color color10 = new Color(0, (int) FunctionEval.FunctionID.EXTERNAL_FUNC, 0);
        green = color10;
        GREEN = color10;
        Color color11 = new Color((int) FunctionEval.FunctionID.EXTERNAL_FUNC, 0, (int) FunctionEval.FunctionID.EXTERNAL_FUNC);
        magenta = color11;
        MAGENTA = color11;
        Color color12 = new Color(0, (int) FunctionEval.FunctionID.EXTERNAL_FUNC, (int) FunctionEval.FunctionID.EXTERNAL_FUNC);
        cyan = color12;
        CYAN = color12;
        Color color13 = new Color(0, 0, (int) FunctionEval.FunctionID.EXTERNAL_FUNC);
        blue = color13;
        BLUE = color13;
    }

    public Color(int i10, int i11, int i12) {
        this(i10, i11, i12, (int) FunctionEval.FunctionID.EXTERNAL_FUNC);
    }

    public static int HSBtoRGB(float f10, float f11, float f12) {
        int i10;
        int i11;
        int i12;
        if (f11 == 0.0f) {
            i10 = (int) ((f12 * 255.0f) + 0.5f);
        } else {
            float floor = (f10 - ((float) Math.floor(f10))) * 6.0f;
            float floor2 = floor - ((float) Math.floor(floor));
            float f13 = (1.0f - f11) * f12;
            float f14 = (1.0f - (f11 * floor2)) * f12;
            float f15 = (1.0f - ((1.0f - floor2) * f11)) * f12;
            int i13 = (int) floor;
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            if (i13 != 4) {
                                if (i13 != 5) {
                                    i10 = 0;
                                } else {
                                    i10 = (int) ((f12 * 255.0f) + 0.5f);
                                    i11 = (int) ((f13 * 255.0f) + 0.5f);
                                    i12 = (int) ((f14 * 255.0f) + 0.5f);
                                }
                            } else {
                                i10 = (int) ((f15 * 255.0f) + 0.5f);
                                i11 = (int) ((f13 * 255.0f) + 0.5f);
                            }
                        } else {
                            i10 = (int) ((f13 * 255.0f) + 0.5f);
                            i11 = (int) ((f14 * 255.0f) + 0.5f);
                        }
                        i12 = (int) ((f12 * 255.0f) + 0.5f);
                    } else {
                        i10 = (int) ((f13 * 255.0f) + 0.5f);
                        i11 = (int) ((f12 * 255.0f) + 0.5f);
                        i12 = (int) ((f15 * 255.0f) + 0.5f);
                    }
                    return (i10 << 16) | (-16777216) | (i11 << 8) | (i12 << 0);
                }
                i10 = (int) ((f14 * 255.0f) + 0.5f);
                i11 = (int) ((f12 * 255.0f) + 0.5f);
            } else {
                i10 = (int) ((f12 * 255.0f) + 0.5f);
                i11 = (int) ((f15 * 255.0f) + 0.5f);
            }
            i12 = (int) ((f13 * 255.0f) + 0.5f);
            return (i10 << 16) | (-16777216) | (i11 << 8) | (i12 << 0);
        }
        i11 = i10;
        i12 = i11;
        return (i10 << 16) | (-16777216) | (i11 << 8) | (i12 << 0);
    }

    public static float[] RGBtoHSB(int i10, int i11, int i12, float[] fArr) {
        int i13;
        int i14;
        float f10;
        float f11;
        if (fArr == null) {
            fArr = new float[3];
        }
        if (i10 > i11) {
            i13 = i10;
        } else {
            i13 = i11;
        }
        if (i12 > i13) {
            i13 = i12;
        }
        if (i10 < i11) {
            i14 = i10;
        } else {
            i14 = i11;
        }
        if (i12 < i14) {
            i14 = i12;
        }
        float f12 = i13;
        float f13 = f12 / 255.0f;
        float f14 = 0.0f;
        if (i13 != 0) {
            f10 = (i13 - i14) / f12;
        } else {
            f10 = 0.0f;
        }
        if (f10 != 0.0f) {
            float f15 = i13 - i14;
            float f16 = (i13 - i10) / f15;
            float f17 = (i13 - i11) / f15;
            float f18 = (i13 - i12) / f15;
            if (i10 == i13) {
                f11 = f18 - f17;
            } else if (i11 == i13) {
                f11 = (f16 + 2.0f) - f18;
            } else {
                f11 = (f17 + 4.0f) - f16;
            }
            float f19 = f11 / 6.0f;
            if (f19 < 0.0f) {
                f14 = f19 + 1.0f;
            } else {
                f14 = f19;
            }
        }
        fArr[0] = f14;
        fArr[1] = f10;
        fArr[2] = f13;
        return fArr;
    }

    public static Color decode(String str) {
        int intValue = Integer.decode(str).intValue();
        return new Color((intValue >> 16) & FunctionEval.FunctionID.EXTERNAL_FUNC, (intValue >> 8) & FunctionEval.FunctionID.EXTERNAL_FUNC, intValue & FunctionEval.FunctionID.EXTERNAL_FUNC);
    }

    public static Color getColor(String str) {
        return getColor(str, (Color) null);
    }

    public static Color getHSBColor(float f10, float f11, float f12) {
        return new Color(HSBtoRGB(f10, f11, f12));
    }

    private static native void initIDs();

    public Color brighter() {
        int red2 = getRed();
        int green2 = getGreen();
        int blue2 = getBlue();
        if (red2 == 0 && green2 == 0 && blue2 == 0) {
            return new Color(3, 3, 3);
        }
        if (red2 > 0 && red2 < 3) {
            red2 = 3;
        }
        if (green2 > 0 && green2 < 3) {
            green2 = 3;
        }
        if (blue2 > 0 && blue2 < 3) {
            blue2 = 3;
        }
        return new Color(Math.min((int) (red2 / 0.7d), (int) FunctionEval.FunctionID.EXTERNAL_FUNC), Math.min((int) (green2 / 0.7d), (int) FunctionEval.FunctionID.EXTERNAL_FUNC), Math.min((int) (blue2 / 0.7d), (int) FunctionEval.FunctionID.EXTERNAL_FUNC));
    }

    public Color darker() {
        return new Color(Math.max((int) (getRed() * 0.7d), 0), Math.max((int) (getGreen() * 0.7d), 0), Math.max((int) (getBlue() * 0.7d), 0));
    }

    public boolean equals(Object obj) {
        if ((obj instanceof Color) && ((Color) obj).getRGB() == getRGB()) {
            return true;
        }
        return false;
    }

    public int getAlpha() {
        return (getRGB() >> 24) & FunctionEval.FunctionID.EXTERNAL_FUNC;
    }

    public int getBlue() {
        return (getRGB() >> 0) & FunctionEval.FunctionID.EXTERNAL_FUNC;
    }

    public float[] getColorComponents(float[] fArr) {
        float[] fArr2 = this.fvalue;
        if (fArr2 == null) {
            return getRGBColorComponents(fArr);
        }
        int length = fArr2.length;
        if (fArr == null) {
            fArr = new float[length];
        }
        for (int i10 = 0; i10 < length; i10++) {
            fArr[i10] = this.fvalue[i10];
        }
        return fArr;
    }

    public float[] getComponents(float[] fArr) {
        float[] fArr2 = this.fvalue;
        if (fArr2 == null) {
            return getRGBComponents(fArr);
        }
        int length = fArr2.length;
        if (fArr == null) {
            fArr = new float[length + 1];
        }
        for (int i10 = 0; i10 < length; i10++) {
            fArr[i10] = this.fvalue[i10];
        }
        fArr[length] = this.falpha;
        return fArr;
    }

    public int getGreen() {
        return (getRGB() >> 8) & FunctionEval.FunctionID.EXTERNAL_FUNC;
    }

    public int getRGB() {
        return this.value;
    }

    public float[] getRGBColorComponents(float[] fArr) {
        if (fArr == null) {
            fArr = new float[3];
        }
        float[] fArr2 = this.frgbvalue;
        if (fArr2 == null) {
            fArr[0] = getRed() / 255.0f;
            fArr[1] = getGreen() / 255.0f;
            fArr[2] = getBlue() / 255.0f;
        } else {
            fArr[0] = fArr2[0];
            fArr[1] = fArr2[1];
            fArr[2] = fArr2[2];
        }
        return fArr;
    }

    public float[] getRGBComponents(float[] fArr) {
        if (fArr == null) {
            fArr = new float[4];
        }
        float[] fArr2 = this.frgbvalue;
        if (fArr2 == null) {
            fArr[0] = getRed() / 255.0f;
            fArr[1] = getGreen() / 255.0f;
            fArr[2] = getBlue() / 255.0f;
            fArr[3] = getAlpha() / 255.0f;
        } else {
            fArr[0] = fArr2[0];
            fArr[1] = fArr2[1];
            fArr[2] = fArr2[2];
            fArr[3] = this.falpha;
        }
        return fArr;
    }

    public int getRed() {
        return (getRGB() >> 16) & FunctionEval.FunctionID.EXTERNAL_FUNC;
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return getClass().getName() + "[r=" + getRed() + ",g=" + getGreen() + ",b=" + getBlue() + "]";
    }

    public Color(int i10, int i11, int i12, int i13) {
        String str;
        this.frgbvalue = null;
        this.fvalue = null;
        this.falpha = 0.0f;
        boolean z10 = false;
        this.value = ((i13 & FunctionEval.FunctionID.EXTERNAL_FUNC) << 24) | ((i10 & FunctionEval.FunctionID.EXTERNAL_FUNC) << 16) | ((i11 & FunctionEval.FunctionID.EXTERNAL_FUNC) << 8) | ((i12 & FunctionEval.FunctionID.EXTERNAL_FUNC) << 0);
        if (i13 < 0 || i13 > 255) {
            str = " Alpha";
            z10 = true;
        } else {
            str = "";
        }
        if (i10 < 0 || i10 > 255) {
            str = str.concat(" Red");
            z10 = true;
        }
        if (i11 < 0 || i11 > 255) {
            str = h.c(str, " Green");
            z10 = true;
        }
        if (i12 < 0 || i12 > 255) {
            str = h.c(str, " Blue");
            z10 = true;
        }
        if (z10) {
            throw new IllegalArgumentException(a0.a.h("Color parameter outside of expected range:", str));
        }
    }

    public static Color getColor(String str, Color color) {
        Integer integer = Integer.getInteger(str);
        if (integer == null) {
            return color;
        }
        int intValue = integer.intValue();
        return new Color((intValue >> 16) & FunctionEval.FunctionID.EXTERNAL_FUNC, (intValue >> 8) & FunctionEval.FunctionID.EXTERNAL_FUNC, intValue & FunctionEval.FunctionID.EXTERNAL_FUNC);
    }

    public static Color getColor(String str, int i10) {
        Integer integer = Integer.getInteger(str);
        if (integer != null) {
            i10 = integer.intValue();
        }
        return new Color((i10 >> 16) & FunctionEval.FunctionID.EXTERNAL_FUNC, (i10 >> 8) & FunctionEval.FunctionID.EXTERNAL_FUNC, (i10 >> 0) & FunctionEval.FunctionID.EXTERNAL_FUNC);
    }

    public Color(int i10) {
        this.frgbvalue = null;
        this.fvalue = null;
        this.falpha = 0.0f;
        this.value = i10 | (-16777216);
    }

    public Color(int i10, boolean z10) {
        this.frgbvalue = null;
        this.fvalue = null;
        this.falpha = 0.0f;
        if (z10) {
            this.value = i10;
        } else {
            this.value = i10 | (-16777216);
        }
    }

    public Color(int i10, int i11) {
        this.frgbvalue = null;
        this.fvalue = null;
        this.falpha = 0.0f;
        this.value = (i10 & 16777215) | ((i11 & FunctionEval.FunctionID.EXTERNAL_FUNC) << 24);
    }

    public Color(float f10, float f11, float f12) {
        this((int) ((f10 * 255.0f) + 0.5d), (int) ((f11 * 255.0f) + 0.5d), (int) ((255.0f * f12) + 0.5d));
        String str;
        boolean z10;
        double d10 = 1.0f;
        if (d10 < 0.0d || d10 > 1.0d) {
            str = " Alpha";
            z10 = true;
        } else {
            str = "";
            z10 = false;
        }
        double d11 = f10;
        if (d11 < 0.0d || d11 > 1.0d) {
            str = str.concat(" Red");
            z10 = true;
        }
        double d12 = f11;
        if (d12 < 0.0d || d12 > 1.0d) {
            str = h.c(str, " Green");
            z10 = true;
        }
        double d13 = f12;
        if (d13 < 0.0d || d13 > 1.0d) {
            str = h.c(str, " Blue");
            z10 = true;
        }
        if (!z10) {
            this.frgbvalue = r1;
            float[] fArr = {f10, f11, f12};
            this.falpha = 1.0f;
            this.fvalue = fArr;
            return;
        }
        throw new IllegalArgumentException(a0.a.h("Color parameter outside of expected range:", str));
    }

    public Color(float f10, float f11, float f12, float f13) {
        this((int) ((f10 * 255.0f) + 0.5d), (int) ((f11 * 255.0f) + 0.5d), (int) ((f12 * 255.0f) + 0.5d), (int) ((255.0f * f13) + 0.5d));
        this.frgbvalue = r0;
        float[] fArr = {f10, f11, f12};
        this.falpha = f13;
        this.fvalue = fArr;
    }
}
