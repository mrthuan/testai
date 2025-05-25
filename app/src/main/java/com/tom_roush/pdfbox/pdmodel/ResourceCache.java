package com.tom_roush.pdfbox.pdmodel;

import com.tom_roush.pdfbox.cos.COSObject;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.markedcontent.PDPropertyList;
import com.tom_roush.pdfbox.pdmodel.font.PDFont;
import com.tom_roush.pdfbox.pdmodel.graphics.PDXObject;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDColorSpace;
import com.tom_roush.pdfbox.pdmodel.graphics.pattern.PDAbstractPattern;
import com.tom_roush.pdfbox.pdmodel.graphics.shading.PDShading;
import com.tom_roush.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState;

/* loaded from: classes2.dex */
public interface ResourceCache {
    PDColorSpace getColorSpace(COSObject cOSObject);

    PDExtendedGraphicsState getExtGState(COSObject cOSObject);

    PDFont getFont(COSObject cOSObject);

    PDAbstractPattern getPattern(COSObject cOSObject);

    PDPropertyList getProperties(COSObject cOSObject);

    PDShading getShading(COSObject cOSObject);

    PDXObject getXObject(COSObject cOSObject);

    void put(COSObject cOSObject, PDPropertyList pDPropertyList);

    void put(COSObject cOSObject, PDFont pDFont);

    void put(COSObject cOSObject, PDXObject pDXObject);

    void put(COSObject cOSObject, PDColorSpace pDColorSpace);

    void put(COSObject cOSObject, PDAbstractPattern pDAbstractPattern);

    void put(COSObject cOSObject, PDShading pDShading);

    void put(COSObject cOSObject, PDExtendedGraphicsState pDExtendedGraphicsState);
}
