package com.tom_roush.pdfbox.pdmodel.font;

import com.tom_roush.fontbox.FontBoxFont;

/* loaded from: classes2.dex */
public abstract class FontInfo {
    public abstract CIDSystemInfo getCIDSystemInfo();

    public final long getCodePageRange() {
        return (getCodePageRange1() & 4294967295L) | ((4294967295L & getCodePageRange2()) << 32);
    }

    public abstract int getCodePageRange1();

    public abstract int getCodePageRange2();

    public abstract int getFamilyClass();

    public abstract FontBoxFont getFont();

    public abstract FontFormat getFormat();

    public abstract int getMacStyle();

    public abstract PDPanoseClassification getPanose();

    public abstract String getPostScriptName();

    public abstract int getWeightClass();

    public final int getWeightClassAsPanose() {
        int weightClass = getWeightClass();
        if (weightClass != 100) {
            if (weightClass != 200) {
                if (weightClass != 300) {
                    if (weightClass != 400) {
                        if (weightClass != 500) {
                            if (weightClass != 600) {
                                if (weightClass != 700) {
                                    if (weightClass != 800) {
                                        if (weightClass != 900) {
                                            return 0;
                                        }
                                        return 10;
                                    }
                                    return 9;
                                }
                                return 8;
                            }
                            return 7;
                        }
                        return 6;
                    }
                    return 5;
                }
                return 4;
            }
            return 3;
        }
        return 2;
    }

    public String toString() {
        return getPostScriptName() + " (" + getFormat() + ", mac: 0x" + Integer.toHexString(getMacStyle()) + ", os/2: 0x" + Integer.toHexString(getFamilyClass()) + ", cid: " + getCIDSystemInfo() + ")";
    }
}
