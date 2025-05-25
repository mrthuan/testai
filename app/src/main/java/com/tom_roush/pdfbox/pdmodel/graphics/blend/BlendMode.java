package com.tom_roush.pdfbox.pdmodel.graphics.blend;

import androidx.activity.r;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSName;
import java.util.HashMap;
import java.util.Map;
import lib.zj.office.fc.hpsf.Variant;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* loaded from: classes2.dex */
public abstract class BlendMode {
    private static final Map<COSName, BlendMode> BLEND_MODES;
    private static final Map<BlendMode, COSName> BLEND_MODE_NAMES;
    public static final NonSeparableBlendMode COLOR;
    public static final SeparableBlendMode COLOR_BURN;
    public static final SeparableBlendMode COLOR_DODGE;
    public static final SeparableBlendMode COMPATIBLE;
    public static final SeparableBlendMode DARKEN;
    public static final SeparableBlendMode DIFFERENCE;
    public static final SeparableBlendMode EXCLUSION;
    public static final SeparableBlendMode HARD_LIGHT;
    public static final NonSeparableBlendMode HUE;
    public static final SeparableBlendMode LIGHTEN;
    public static final NonSeparableBlendMode LUMINOSITY;
    public static final SeparableBlendMode MULTIPLY;
    public static final SeparableBlendMode NORMAL;
    public static final SeparableBlendMode OVERLAY;
    public static final NonSeparableBlendMode SATURATION;
    public static final SeparableBlendMode SCREEN;
    public static final SeparableBlendMode SOFT_LIGHT;

    static {
        SeparableBlendMode separableBlendMode = new SeparableBlendMode() { // from class: com.tom_roush.pdfbox.pdmodel.graphics.blend.BlendMode.1
            @Override // com.tom_roush.pdfbox.pdmodel.graphics.blend.SeparableBlendMode
            public float blendChannel(float f10, float f11) {
                return f10;
            }
        };
        NORMAL = separableBlendMode;
        COMPATIBLE = separableBlendMode;
        MULTIPLY = new SeparableBlendMode() { // from class: com.tom_roush.pdfbox.pdmodel.graphics.blend.BlendMode.2
            @Override // com.tom_roush.pdfbox.pdmodel.graphics.blend.SeparableBlendMode
            public float blendChannel(float f10, float f11) {
                return f10 * f11;
            }
        };
        SCREEN = new SeparableBlendMode() { // from class: com.tom_roush.pdfbox.pdmodel.graphics.blend.BlendMode.3
            @Override // com.tom_roush.pdfbox.pdmodel.graphics.blend.SeparableBlendMode
            public float blendChannel(float f10, float f11) {
                return (f10 + f11) - (f10 * f11);
            }
        };
        OVERLAY = new SeparableBlendMode() { // from class: com.tom_roush.pdfbox.pdmodel.graphics.blend.BlendMode.4
            @Override // com.tom_roush.pdfbox.pdmodel.graphics.blend.SeparableBlendMode
            public float blendChannel(float f10, float f11) {
                if (f11 <= 0.5d) {
                    return f11 * 2.0f * f10;
                }
                return (((f10 + f11) - (f10 * f11)) * 2.0f) - 1.0f;
            }
        };
        DARKEN = new SeparableBlendMode() { // from class: com.tom_roush.pdfbox.pdmodel.graphics.blend.BlendMode.5
            @Override // com.tom_roush.pdfbox.pdmodel.graphics.blend.SeparableBlendMode
            public float blendChannel(float f10, float f11) {
                return Math.min(f10, f11);
            }
        };
        LIGHTEN = new SeparableBlendMode() { // from class: com.tom_roush.pdfbox.pdmodel.graphics.blend.BlendMode.6
            @Override // com.tom_roush.pdfbox.pdmodel.graphics.blend.SeparableBlendMode
            public float blendChannel(float f10, float f11) {
                return Math.max(f10, f11);
            }
        };
        COLOR_DODGE = new SeparableBlendMode() { // from class: com.tom_roush.pdfbox.pdmodel.graphics.blend.BlendMode.7
            @Override // com.tom_roush.pdfbox.pdmodel.graphics.blend.SeparableBlendMode
            public float blendChannel(float f10, float f11) {
                if (f11 == 0.0f) {
                    return 0.0f;
                }
                float f12 = 1.0f - f10;
                if (f11 >= f12) {
                    return 1.0f;
                }
                return f11 / f12;
            }
        };
        COLOR_BURN = new SeparableBlendMode() { // from class: com.tom_roush.pdfbox.pdmodel.graphics.blend.BlendMode.8
            @Override // com.tom_roush.pdfbox.pdmodel.graphics.blend.SeparableBlendMode
            public float blendChannel(float f10, float f11) {
                if (f11 == 1.0f) {
                    return 1.0f;
                }
                float f12 = 1.0f - f11;
                if (f12 >= f10) {
                    return 0.0f;
                }
                return 1.0f - (f12 / f10);
            }
        };
        HARD_LIGHT = new SeparableBlendMode() { // from class: com.tom_roush.pdfbox.pdmodel.graphics.blend.BlendMode.9
            @Override // com.tom_roush.pdfbox.pdmodel.graphics.blend.SeparableBlendMode
            public float blendChannel(float f10, float f11) {
                if (f10 <= 0.5d) {
                    return f11 * 2.0f * f10;
                }
                return (((f10 + f11) - (f10 * f11)) * 2.0f) - 1.0f;
            }
        };
        SOFT_LIGHT = new SeparableBlendMode() { // from class: com.tom_roush.pdfbox.pdmodel.graphics.blend.BlendMode.10
            @Override // com.tom_roush.pdfbox.pdmodel.graphics.blend.SeparableBlendMode
            public float blendChannel(float f10, float f11) {
                float sqrt;
                if (f10 <= 0.5d) {
                    return f11 - ((1.0f - f11) * ((1.0f - (f10 * 2.0f)) * f11));
                }
                double d10 = f11;
                if (d10 <= 0.25d) {
                    sqrt = ((((16.0f * f11) - 12.0f) * f11) + 4.0f) * f11;
                } else {
                    sqrt = (float) Math.sqrt(d10);
                }
                return r.l(sqrt, f11, (f10 * 2.0f) - 1.0f, f11);
            }
        };
        DIFFERENCE = new SeparableBlendMode() { // from class: com.tom_roush.pdfbox.pdmodel.graphics.blend.BlendMode.11
            @Override // com.tom_roush.pdfbox.pdmodel.graphics.blend.SeparableBlendMode
            public float blendChannel(float f10, float f11) {
                return Math.abs(f11 - f10);
            }
        };
        EXCLUSION = new SeparableBlendMode() { // from class: com.tom_roush.pdfbox.pdmodel.graphics.blend.BlendMode.12
            @Override // com.tom_roush.pdfbox.pdmodel.graphics.blend.SeparableBlendMode
            public float blendChannel(float f10, float f11) {
                return (f11 + f10) - ((f11 * 2.0f) * f10);
            }
        };
        HUE = new NonSeparableBlendMode() { // from class: com.tom_roush.pdfbox.pdmodel.graphics.blend.BlendMode.13
            @Override // com.tom_roush.pdfbox.pdmodel.graphics.blend.NonSeparableBlendMode
            public void blend(float[] fArr, float[] fArr2, float[] fArr3) {
                float[] fArr4 = new float[3];
                BlendMode.getSaturationRGB(fArr2, fArr, fArr4);
                BlendMode.getLuminosityRGB(fArr2, fArr4, fArr3);
            }
        };
        SATURATION = new NonSeparableBlendMode() { // from class: com.tom_roush.pdfbox.pdmodel.graphics.blend.BlendMode.14
            @Override // com.tom_roush.pdfbox.pdmodel.graphics.blend.NonSeparableBlendMode
            public void blend(float[] fArr, float[] fArr2, float[] fArr3) {
                BlendMode.getSaturationRGB(fArr, fArr2, fArr3);
            }
        };
        COLOR = new NonSeparableBlendMode() { // from class: com.tom_roush.pdfbox.pdmodel.graphics.blend.BlendMode.15
            @Override // com.tom_roush.pdfbox.pdmodel.graphics.blend.NonSeparableBlendMode
            public void blend(float[] fArr, float[] fArr2, float[] fArr3) {
                BlendMode.getLuminosityRGB(fArr2, fArr, fArr3);
            }
        };
        LUMINOSITY = new NonSeparableBlendMode() { // from class: com.tom_roush.pdfbox.pdmodel.graphics.blend.BlendMode.16
            @Override // com.tom_roush.pdfbox.pdmodel.graphics.blend.NonSeparableBlendMode
            public void blend(float[] fArr, float[] fArr2, float[] fArr3) {
                BlendMode.getLuminosityRGB(fArr, fArr2, fArr3);
            }
        };
        BLEND_MODES = createBlendModeMap();
        BLEND_MODE_NAMES = createBlendModeNamesMap();
    }

    private static Map<COSName, BlendMode> createBlendModeMap() {
        HashMap hashMap = new HashMap(13);
        COSName cOSName = COSName.NORMAL;
        SeparableBlendMode separableBlendMode = NORMAL;
        hashMap.put(cOSName, separableBlendMode);
        hashMap.put(COSName.COMPATIBLE, separableBlendMode);
        hashMap.put(COSName.MULTIPLY, MULTIPLY);
        hashMap.put(COSName.SCREEN, SCREEN);
        hashMap.put(COSName.OVERLAY, OVERLAY);
        hashMap.put(COSName.DARKEN, DARKEN);
        hashMap.put(COSName.LIGHTEN, LIGHTEN);
        hashMap.put(COSName.COLOR_DODGE, COLOR_DODGE);
        hashMap.put(COSName.COLOR_BURN, COLOR_BURN);
        hashMap.put(COSName.HARD_LIGHT, HARD_LIGHT);
        hashMap.put(COSName.SOFT_LIGHT, SOFT_LIGHT);
        hashMap.put(COSName.DIFFERENCE, DIFFERENCE);
        hashMap.put(COSName.EXCLUSION, EXCLUSION);
        hashMap.put(COSName.HUE, HUE);
        hashMap.put(COSName.SATURATION, SATURATION);
        hashMap.put(COSName.LUMINOSITY, LUMINOSITY);
        hashMap.put(COSName.COLOR, COLOR);
        return hashMap;
    }

    private static Map<BlendMode, COSName> createBlendModeNamesMap() {
        HashMap hashMap = new HashMap(13);
        SeparableBlendMode separableBlendMode = NORMAL;
        COSName cOSName = COSName.NORMAL;
        hashMap.put(separableBlendMode, cOSName);
        hashMap.put(COMPATIBLE, cOSName);
        hashMap.put(MULTIPLY, COSName.MULTIPLY);
        hashMap.put(SCREEN, COSName.SCREEN);
        hashMap.put(OVERLAY, COSName.OVERLAY);
        hashMap.put(DARKEN, COSName.DARKEN);
        hashMap.put(LIGHTEN, COSName.LIGHTEN);
        hashMap.put(COLOR_DODGE, COSName.COLOR_DODGE);
        hashMap.put(COLOR_BURN, COSName.COLOR_BURN);
        hashMap.put(HARD_LIGHT, COSName.HARD_LIGHT);
        hashMap.put(SOFT_LIGHT, COSName.SOFT_LIGHT);
        hashMap.put(DIFFERENCE, COSName.DIFFERENCE);
        hashMap.put(EXCLUSION, COSName.EXCLUSION);
        hashMap.put(HUE, COSName.HUE);
        hashMap.put(SATURATION, COSName.SATURATION);
        hashMap.put(LUMINOSITY, COSName.LUMINOSITY);
        hashMap.put(COLOR, COSName.COLOR);
        return hashMap;
    }

    private static int get255Value(float f10) {
        double d10 = f10;
        double d11 = 255.0d;
        if (d10 < 1.0d) {
            d11 = 255.0d * d10;
        }
        return (int) Math.floor(d11);
    }

    public static COSName getCOSName(BlendMode blendMode) {
        return BLEND_MODE_NAMES.get(blendMode);
    }

    public static BlendMode getInstance(COSBase cOSBase) {
        BlendMode blendMode;
        if (cOSBase instanceof COSName) {
            blendMode = BLEND_MODES.get(cOSBase);
        } else {
            BlendMode blendMode2 = null;
            if (cOSBase instanceof COSArray) {
                COSArray cOSArray = (COSArray) cOSBase;
                for (int i10 = 0; i10 < cOSArray.size() && (blendMode2 = BLEND_MODES.get(cOSArray.getObject(i10))) == null; i10++) {
                }
            }
            blendMode = blendMode2;
        }
        if (blendMode != null) {
            return blendMode;
        }
        return NORMAL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void getLuminosityRGB(float[] fArr, float[] fArr2, float[] fArr3) {
        int i10;
        int i11 = get255Value(fArr2[0]);
        int i12 = get255Value(fArr2[1]);
        int i13 = get255Value(fArr2[2]);
        int i14 = get255Value(fArr[0]);
        int i15 = get255Value(fArr[1]);
        int i16 = get255Value(fArr[2]);
        int i17 = ((((i16 - i13) * 28) + (((i15 - i12) * ShapeTypes.FLOW_CHART_MERGE) + ((i14 - i11) * 77))) + 128) >> 8;
        int i18 = i11 + i17;
        int i19 = i12 + i17;
        int i20 = i13 + i17;
        if (((i18 | i19 | i20) & 256) == 256) {
            int i21 = (((i16 * 28) + ((i15 * ShapeTypes.FLOW_CHART_MERGE) + (i14 * 77))) + 128) >> 8;
            if (i17 > 0) {
                int max = Math.max(i18, Math.max(i19, i20));
                if (max != i21) {
                    i10 = ((255 - i21) << 16) / (max - i21);
                    i18 = ((((i18 - i21) * i10) + Variant.VT_RESERVED) >> 16) + i21;
                    i19 = ((((i19 - i21) * i10) + Variant.VT_RESERVED) >> 16) + i21;
                    i20 = ((((i20 - i21) * i10) + Variant.VT_RESERVED) >> 16) + i21;
                }
                i10 = 0;
                i18 = ((((i18 - i21) * i10) + Variant.VT_RESERVED) >> 16) + i21;
                i19 = ((((i19 - i21) * i10) + Variant.VT_RESERVED) >> 16) + i21;
                i20 = ((((i20 - i21) * i10) + Variant.VT_RESERVED) >> 16) + i21;
            } else {
                int min = Math.min(i18, Math.min(i19, i20));
                if (i21 != min) {
                    i10 = (i21 << 16) / (i21 - min);
                    i18 = ((((i18 - i21) * i10) + Variant.VT_RESERVED) >> 16) + i21;
                    i19 = ((((i19 - i21) * i10) + Variant.VT_RESERVED) >> 16) + i21;
                    i20 = ((((i20 - i21) * i10) + Variant.VT_RESERVED) >> 16) + i21;
                }
                i10 = 0;
                i18 = ((((i18 - i21) * i10) + Variant.VT_RESERVED) >> 16) + i21;
                i19 = ((((i19 - i21) * i10) + Variant.VT_RESERVED) >> 16) + i21;
                i20 = ((((i20 - i21) * i10) + Variant.VT_RESERVED) >> 16) + i21;
            }
        }
        fArr3[0] = i18 / 255.0f;
        fArr3[1] = i19 / 255.0f;
        fArr3[2] = i20 / 255.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void getSaturationRGB(float[] fArr, float[] fArr2, float[] fArr3) {
        int i10;
        int i11 = get255Value(fArr2[0]);
        int i12 = get255Value(fArr2[1]);
        int i13 = get255Value(fArr2[2]);
        int i14 = get255Value(fArr[0]);
        int i15 = get255Value(fArr[1]);
        int i16 = get255Value(fArr[2]);
        int min = Math.min(i11, Math.min(i12, i13));
        int max = Math.max(i11, Math.max(i12, i13));
        if (min == max) {
            float f10 = i12 / 255.0f;
            fArr3[0] = f10;
            fArr3[1] = f10;
            fArr3[2] = f10;
            return;
        }
        int max2 = ((Math.max(i14, Math.max(i15, i16)) - Math.min(i14, Math.min(i15, i16))) << 16) / (max - min);
        int i17 = (((i13 * 28) + ((i12 * ShapeTypes.FLOW_CHART_MERGE) + (i11 * 77))) + 128) >> 8;
        int i18 = ((((i11 - i17) * max2) + Variant.VT_RESERVED) >> 16) + i17;
        int i19 = ((((i12 - i17) * max2) + Variant.VT_RESERVED) >> 16) + i17;
        int i20 = ((((i13 - i17) * max2) + Variant.VT_RESERVED) >> 16) + i17;
        if (((i18 | i19 | i20) & 256) == 256) {
            int min2 = Math.min(i18, Math.min(i19, i20));
            int max3 = Math.max(i18, Math.max(i19, i20));
            int i21 = 65536;
            if (min2 < 0) {
                i10 = (i17 << 16) / (i17 - min2);
            } else {
                i10 = 65536;
            }
            if (max3 > 255) {
                i21 = ((255 - i17) << 16) / (max3 - i17);
            }
            int min3 = Math.min(i10, i21);
            i18 = ((((i18 - i17) * min3) + Variant.VT_RESERVED) >> 16) + i17;
            i19 = ((((i19 - i17) * min3) + Variant.VT_RESERVED) >> 16) + i17;
            i20 = ((((i20 - i17) * min3) + Variant.VT_RESERVED) >> 16) + i17;
        }
        fArr3[0] = i18 / 255.0f;
        fArr3[1] = i19 / 255.0f;
        fArr3[2] = i20 / 255.0f;
    }
}
