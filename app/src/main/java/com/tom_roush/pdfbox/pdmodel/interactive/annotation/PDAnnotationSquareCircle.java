package com.tom_roush.pdfbox.pdmodel.interactive.annotation;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSFloat;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDColor;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers.PDAppearanceHandler;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers.PDCircleAppearanceHandler;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers.PDSquareAppearanceHandler;

/* loaded from: classes2.dex */
public class PDAnnotationSquareCircle extends PDAnnotationMarkup {
    public static final String SUB_TYPE_CIRCLE = "Circle";
    public static final String SUB_TYPE_SQUARE = "Square";
    private PDAppearanceHandler customAppearanceHandler;

    public PDAnnotationSquareCircle(String str) {
        setSubtype(str);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationMarkup, com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotation
    public void constructAppearances() {
        constructAppearances(null);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationMarkup
    public PDBorderEffectDictionary getBorderEffect() {
        COSDictionary cOSDictionary = (COSDictionary) getCOSObject().getDictionaryObject(COSName.BE);
        if (cOSDictionary != null) {
            return new PDBorderEffectDictionary(cOSDictionary);
        }
        return null;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationMarkup
    public PDBorderStyleDictionary getBorderStyle() {
        COSBase dictionaryObject = getCOSObject().getDictionaryObject(COSName.BS);
        if (dictionaryObject instanceof COSDictionary) {
            return new PDBorderStyleDictionary((COSDictionary) dictionaryObject);
        }
        return null;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationMarkup
    public PDColor getInteriorColor() {
        return getColor(COSName.IC);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationMarkup
    public PDRectangle getRectDifference() {
        COSArray cOSArray = (COSArray) getCOSObject().getDictionaryObject(COSName.RD);
        if (cOSArray != null) {
            return new PDRectangle(cOSArray);
        }
        return null;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationMarkup
    public float[] getRectDifferences() {
        COSBase item = getCOSObject().getItem(COSName.RD);
        if (item instanceof COSArray) {
            return ((COSArray) item).toFloatArray();
        }
        return new float[0];
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotation
    public String getSubtype() {
        return getCOSObject().getNameAsString(COSName.SUBTYPE);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationMarkup
    public void setBorderEffect(PDBorderEffectDictionary pDBorderEffectDictionary) {
        getCOSObject().setItem(COSName.BE, pDBorderEffectDictionary);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationMarkup
    public void setBorderStyle(PDBorderStyleDictionary pDBorderStyleDictionary) {
        getCOSObject().setItem(COSName.BS, pDBorderStyleDictionary);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationMarkup
    public void setCustomAppearanceHandler(PDAppearanceHandler pDAppearanceHandler) {
        this.customAppearanceHandler = pDAppearanceHandler;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationMarkup
    public void setInteriorColor(PDColor pDColor) {
        getCOSObject().setItem(COSName.IC, (COSBase) pDColor.toCOSArray());
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationMarkup
    public void setRectDifference(PDRectangle pDRectangle) {
        getCOSObject().setItem(COSName.RD, pDRectangle);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationMarkup
    public void setRectDifferences(float f10) {
        setRectDifferences(f10, f10, f10, f10);
    }

    public void setSubtype(String str) {
        getCOSObject().setName(COSName.SUBTYPE, str);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationMarkup, com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotation
    public void constructAppearances(PDDocument pDDocument) {
        PDAppearanceHandler pDAppearanceHandler = this.customAppearanceHandler;
        if (pDAppearanceHandler == null) {
            if ("Circle".equals(getSubtype())) {
                new PDCircleAppearanceHandler(this, pDDocument).generateAppearanceStreams();
                return;
            } else if ("Square".equals(getSubtype())) {
                new PDSquareAppearanceHandler(this, pDDocument).generateAppearanceStreams();
                return;
            } else {
                return;
            }
        }
        pDAppearanceHandler.generateAppearanceStreams();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationMarkup
    public void setRectDifferences(float f10, float f11, float f12, float f13) {
        COSArray cOSArray = new COSArray();
        cOSArray.add((COSBase) new COSFloat(f10));
        cOSArray.add((COSBase) new COSFloat(f11));
        cOSArray.add((COSBase) new COSFloat(f12));
        cOSArray.add((COSBase) new COSFloat(f13));
        getCOSObject().setItem(COSName.RD, (COSBase) cOSArray);
    }

    public PDAnnotationSquareCircle(COSDictionary cOSDictionary) {
        super(cOSDictionary);
    }
}
