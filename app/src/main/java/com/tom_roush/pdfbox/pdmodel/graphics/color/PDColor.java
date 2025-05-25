package com.tom_roush.pdfbox.pdmodel.graphics.color;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSNumber;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class PDColor {
    private final PDColorSpace colorSpace;
    private final float[] components;
    private final COSName patternName;

    public PDColor(COSArray cOSArray, PDColorSpace pDColorSpace) {
        int i10 = 0;
        if (cOSArray.size() > 0 && (cOSArray.get(cOSArray.size() - 1) instanceof COSName)) {
            this.components = new float[cOSArray.size() - 1];
            while (i10 < cOSArray.size() - 1) {
                this.components[i10] = ((COSNumber) cOSArray.get(i10)).floatValue();
                i10++;
            }
            this.patternName = (COSName) cOSArray.get(cOSArray.size() - 1);
        } else {
            this.components = new float[cOSArray.size()];
            while (i10 < cOSArray.size()) {
                this.components[i10] = ((COSNumber) cOSArray.get(i10)).floatValue();
                i10++;
            }
            this.patternName = null;
        }
        this.colorSpace = pDColorSpace;
    }

    public PDColorSpace getColorSpace() {
        return this.colorSpace;
    }

    public float[] getComponents() {
        PDColorSpace pDColorSpace = this.colorSpace;
        if (pDColorSpace == null) {
            return (float[]) this.components.clone();
        }
        return Arrays.copyOf(this.components, pDColorSpace.getNumberOfComponents());
    }

    public COSName getPatternName() {
        return this.patternName;
    }

    public boolean isPattern() {
        if (this.patternName != null) {
            return true;
        }
        return false;
    }

    public COSArray toCOSArray() {
        COSArray cOSArray = new COSArray();
        cOSArray.setFloatArray(this.components);
        COSName cOSName = this.patternName;
        if (cOSName != null) {
            cOSArray.add((COSBase) cOSName);
        }
        return cOSArray;
    }

    public int toRGB() {
        float[] rgb = this.colorSpace.toRGB(this.components);
        int round = Math.round(rgb[0] * 255.0f);
        return (((round << 8) + Math.round(rgb[1] * 255.0f)) << 8) + Math.round(rgb[2] * 255.0f);
    }

    public String toString() {
        return "PDColor{components=" + Arrays.toString(this.components) + ", patternName=" + this.patternName + "}";
    }

    public PDColor(float[] fArr, PDColorSpace pDColorSpace) {
        this.components = (float[]) fArr.clone();
        this.patternName = null;
        this.colorSpace = pDColorSpace;
    }

    public PDColor(COSName cOSName, PDColorSpace pDColorSpace) {
        this.components = new float[0];
        this.patternName = cOSName;
        this.colorSpace = pDColorSpace;
    }

    public PDColor(float[] fArr, COSName cOSName, PDColorSpace pDColorSpace) {
        this.components = (float[]) fArr.clone();
        this.patternName = cOSName;
        this.colorSpace = pDColorSpace;
    }
}
