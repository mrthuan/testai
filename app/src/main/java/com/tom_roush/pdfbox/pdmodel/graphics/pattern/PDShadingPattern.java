package com.tom_roush.pdfbox.pdmodel.graphics.pattern;

import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.graphics.shading.PDShading;
import com.tom_roush.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState;

/* loaded from: classes2.dex */
public class PDShadingPattern extends PDAbstractPattern {
    private PDExtendedGraphicsState extendedGraphicsState;
    private PDShading shading;

    public PDShadingPattern() {
        getCOSObject().setInt(COSName.PATTERN_TYPE, 2);
    }

    public PDExtendedGraphicsState getExtendedGraphicsState() {
        if (this.extendedGraphicsState == null) {
            COSBase dictionaryObject = getCOSObject().getDictionaryObject(COSName.EXT_G_STATE);
            if (dictionaryObject instanceof COSDictionary) {
                this.extendedGraphicsState = new PDExtendedGraphicsState((COSDictionary) dictionaryObject);
            }
        }
        return this.extendedGraphicsState;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.pattern.PDAbstractPattern
    public int getPatternType() {
        return 2;
    }

    public PDShading getShading() {
        if (this.shading == null) {
            COSBase dictionaryObject = getCOSObject().getDictionaryObject(COSName.SHADING);
            if (dictionaryObject instanceof COSDictionary) {
                this.shading = PDShading.create((COSDictionary) dictionaryObject);
            }
        }
        return this.shading;
    }

    public void setExtendedGraphicsState(PDExtendedGraphicsState pDExtendedGraphicsState) {
        this.extendedGraphicsState = pDExtendedGraphicsState;
        getCOSObject().setItem(COSName.EXT_G_STATE, pDExtendedGraphicsState);
    }

    public void setShading(PDShading pDShading) {
        this.shading = pDShading;
        getCOSObject().setItem(COSName.SHADING, pDShading);
    }

    public PDShadingPattern(COSDictionary cOSDictionary) {
        super(cOSDictionary);
    }
}
