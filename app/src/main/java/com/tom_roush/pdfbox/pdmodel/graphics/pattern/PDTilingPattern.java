package com.tom_roush.pdfbox.pdmodel.graphics.pattern;

import com.tom_roush.pdfbox.contentstream.PDContentStream;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSStream;
import com.tom_roush.pdfbox.pdmodel.PDResources;
import com.tom_roush.pdfbox.pdmodel.ResourceCache;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.pdmodel.common.PDStream;
import java.io.InputStream;

/* loaded from: classes2.dex */
public class PDTilingPattern extends PDAbstractPattern implements PDContentStream {
    public static final int PAINT_COLORED = 1;
    public static final int PAINT_UNCOLORED = 2;
    public static final int TILING_CONSTANT_SPACING = 1;
    public static final int TILING_CONSTANT_SPACING_FASTER_TILING = 3;
    public static final int TILING_NO_DISTORTION = 2;
    private final ResourceCache resourceCache;

    public PDTilingPattern() {
        super(new COSStream());
        getCOSObject().setName(COSName.TYPE, COSName.PATTERN.getName());
        getCOSObject().setInt(COSName.PATTERN_TYPE, 1);
        setResources(new PDResources());
        this.resourceCache = null;
    }

    @Override // com.tom_roush.pdfbox.contentstream.PDContentStream
    public PDRectangle getBBox() {
        COSBase dictionaryObject = getCOSObject().getDictionaryObject(COSName.BBOX);
        if (dictionaryObject instanceof COSArray) {
            return new PDRectangle((COSArray) dictionaryObject);
        }
        return null;
    }

    public PDStream getContentStream() {
        return new PDStream((COSStream) getCOSObject());
    }

    @Override // com.tom_roush.pdfbox.contentstream.PDContentStream
    public InputStream getContents() {
        if (getCOSObject() instanceof COSStream) {
            return ((COSStream) getCOSObject()).createInputStream();
        }
        return null;
    }

    public int getPaintType() {
        return getCOSObject().getInt(COSName.PAINT_TYPE, 0);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.pattern.PDAbstractPattern
    public int getPatternType() {
        return 1;
    }

    @Override // com.tom_roush.pdfbox.contentstream.PDContentStream
    public PDResources getResources() {
        COSBase dictionaryObject = getCOSObject().getDictionaryObject(COSName.RESOURCES);
        if (dictionaryObject instanceof COSDictionary) {
            return new PDResources((COSDictionary) dictionaryObject);
        }
        return null;
    }

    public int getTilingType() {
        return getCOSObject().getInt(COSName.TILING_TYPE, 0);
    }

    public float getXStep() {
        return getCOSObject().getFloat(COSName.X_STEP, 0.0f);
    }

    public float getYStep() {
        return getCOSObject().getFloat(COSName.Y_STEP, 0.0f);
    }

    public void setBBox(PDRectangle pDRectangle) {
        if (pDRectangle == null) {
            getCOSObject().removeItem(COSName.BBOX);
        } else {
            getCOSObject().setItem(COSName.BBOX, (COSBase) pDRectangle.getCOSArray());
        }
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.pattern.PDAbstractPattern
    public void setPaintType(int i10) {
        getCOSObject().setInt(COSName.PAINT_TYPE, i10);
    }

    public final void setResources(PDResources pDResources) {
        getCOSObject().setItem(COSName.RESOURCES, pDResources);
    }

    public void setTilingType(int i10) {
        getCOSObject().setInt(COSName.TILING_TYPE, i10);
    }

    public void setXStep(float f10) {
        getCOSObject().setFloat(COSName.X_STEP, f10);
    }

    public void setYStep(float f10) {
        getCOSObject().setFloat(COSName.Y_STEP, f10);
    }

    public PDTilingPattern(COSDictionary cOSDictionary) {
        this(cOSDictionary, null);
    }

    public PDTilingPattern(COSDictionary cOSDictionary, ResourceCache resourceCache) {
        super(cOSDictionary);
        this.resourceCache = resourceCache;
    }
}
