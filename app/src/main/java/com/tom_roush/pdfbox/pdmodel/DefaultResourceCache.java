package com.tom_roush.pdfbox.pdmodel;

import com.tom_roush.pdfbox.cos.COSObject;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.markedcontent.PDPropertyList;
import com.tom_roush.pdfbox.pdmodel.font.PDFont;
import com.tom_roush.pdfbox.pdmodel.graphics.PDXObject;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDColorSpace;
import com.tom_roush.pdfbox.pdmodel.graphics.pattern.PDAbstractPattern;
import com.tom_roush.pdfbox.pdmodel.graphics.shading.PDShading;
import com.tom_roush.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class DefaultResourceCache implements ResourceCache {
    private final Map<COSObject, SoftReference<PDFont>> fonts = new HashMap();
    private final Map<COSObject, SoftReference<PDColorSpace>> colorSpaces = new HashMap();
    private final Map<COSObject, SoftReference<PDXObject>> xobjects = new HashMap();
    private final Map<COSObject, SoftReference<PDExtendedGraphicsState>> extGStates = new HashMap();
    private final Map<COSObject, SoftReference<PDShading>> shadings = new HashMap();
    private final Map<COSObject, SoftReference<PDAbstractPattern>> patterns = new HashMap();
    private final Map<COSObject, SoftReference<PDPropertyList>> properties = new HashMap();

    @Override // com.tom_roush.pdfbox.pdmodel.ResourceCache
    public PDColorSpace getColorSpace(COSObject cOSObject) {
        SoftReference<PDColorSpace> softReference = this.colorSpaces.get(cOSObject);
        if (softReference != null) {
            return softReference.get();
        }
        return null;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.ResourceCache
    public PDExtendedGraphicsState getExtGState(COSObject cOSObject) {
        SoftReference<PDExtendedGraphicsState> softReference = this.extGStates.get(cOSObject);
        if (softReference != null) {
            return softReference.get();
        }
        return null;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.ResourceCache
    public PDFont getFont(COSObject cOSObject) {
        SoftReference<PDFont> softReference = this.fonts.get(cOSObject);
        if (softReference != null) {
            return softReference.get();
        }
        return null;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.ResourceCache
    public PDAbstractPattern getPattern(COSObject cOSObject) {
        SoftReference<PDAbstractPattern> softReference = this.patterns.get(cOSObject);
        if (softReference != null) {
            return softReference.get();
        }
        return null;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.ResourceCache
    public PDPropertyList getProperties(COSObject cOSObject) {
        SoftReference<PDPropertyList> softReference = this.properties.get(cOSObject);
        if (softReference != null) {
            return softReference.get();
        }
        return null;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.ResourceCache
    public PDShading getShading(COSObject cOSObject) {
        SoftReference<PDShading> softReference = this.shadings.get(cOSObject);
        if (softReference != null) {
            return softReference.get();
        }
        return null;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.ResourceCache
    public PDXObject getXObject(COSObject cOSObject) {
        SoftReference<PDXObject> softReference = this.xobjects.get(cOSObject);
        if (softReference != null) {
            return softReference.get();
        }
        return null;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.ResourceCache
    public void put(COSObject cOSObject, PDFont pDFont) {
        this.fonts.put(cOSObject, new SoftReference<>(pDFont));
    }

    @Override // com.tom_roush.pdfbox.pdmodel.ResourceCache
    public void put(COSObject cOSObject, PDColorSpace pDColorSpace) {
        this.colorSpaces.put(cOSObject, new SoftReference<>(pDColorSpace));
    }

    @Override // com.tom_roush.pdfbox.pdmodel.ResourceCache
    public void put(COSObject cOSObject, PDExtendedGraphicsState pDExtendedGraphicsState) {
        this.extGStates.put(cOSObject, new SoftReference<>(pDExtendedGraphicsState));
    }

    @Override // com.tom_roush.pdfbox.pdmodel.ResourceCache
    public void put(COSObject cOSObject, PDShading pDShading) {
        this.shadings.put(cOSObject, new SoftReference<>(pDShading));
    }

    @Override // com.tom_roush.pdfbox.pdmodel.ResourceCache
    public void put(COSObject cOSObject, PDAbstractPattern pDAbstractPattern) {
        this.patterns.put(cOSObject, new SoftReference<>(pDAbstractPattern));
    }

    @Override // com.tom_roush.pdfbox.pdmodel.ResourceCache
    public void put(COSObject cOSObject, PDPropertyList pDPropertyList) {
        this.properties.put(cOSObject, new SoftReference<>(pDPropertyList));
    }

    @Override // com.tom_roush.pdfbox.pdmodel.ResourceCache
    public void put(COSObject cOSObject, PDXObject pDXObject) {
        this.xobjects.put(cOSObject, new SoftReference<>(pDXObject));
    }
}
