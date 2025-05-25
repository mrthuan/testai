package com.tom_roush.pdfbox.pdmodel.interactive.pagenavigation;

import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSBoolean;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSFloat;
import com.tom_roush.pdfbox.cos.COSInteger;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.common.PDDictionaryWrapper;

/* loaded from: classes2.dex */
public final class PDTransition extends PDDictionaryWrapper {
    public PDTransition() {
        this(PDTransitionStyle.R);
    }

    public String getDimension() {
        return getCOSObject().getNameAsString(COSName.DM, PDTransitionDimension.H.name());
    }

    public COSBase getDirection() {
        COSBase item = getCOSObject().getItem(COSName.DI);
        if (item == null) {
            return COSInteger.ZERO;
        }
        return item;
    }

    public float getDuration() {
        return getCOSObject().getFloat(COSName.D, 1.0f);
    }

    public float getFlyScale() {
        return getCOSObject().getFloat(COSName.SS, 1.0f);
    }

    public String getMotion() {
        return getCOSObject().getNameAsString(COSName.M, PDTransitionMotion.I.name());
    }

    public String getStyle() {
        return getCOSObject().getNameAsString(COSName.S, PDTransitionStyle.R.name());
    }

    public boolean isFlyAreaOpaque() {
        return getCOSObject().getBoolean(COSName.B, false);
    }

    public void setDimension(PDTransitionDimension pDTransitionDimension) {
        getCOSObject().setName(COSName.DM, pDTransitionDimension.name());
    }

    public void setDirection(PDTransitionDirection pDTransitionDirection) {
        getCOSObject().setItem(COSName.DI, pDTransitionDirection.getCOSBase());
    }

    public void setDuration(float f10) {
        getCOSObject().setItem(COSName.D, (COSBase) new COSFloat(f10));
    }

    public void setFlyAreaOpaque(boolean z10) {
        getCOSObject().setItem(COSName.B, (COSBase) COSBoolean.getBoolean(z10));
    }

    public void setFlyScale(float f10) {
        getCOSObject().setItem(COSName.SS, (COSBase) new COSFloat(f10));
    }

    public void setMotion(PDTransitionMotion pDTransitionMotion) {
        getCOSObject().setName(COSName.M, pDTransitionMotion.name());
    }

    public PDTransition(PDTransitionStyle pDTransitionStyle) {
        getCOSObject().setName(COSName.TYPE, COSName.TRANS.getName());
        getCOSObject().setName(COSName.S, pDTransitionStyle.name());
    }

    public PDTransition(COSDictionary cOSDictionary) {
        super(cOSDictionary);
    }
}
