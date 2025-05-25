package com.tom_roush.pdfbox.pdmodel;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSObject;
import com.tom_roush.pdfbox.cos.COSStream;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.markedcontent.PDPropertyList;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes;
import com.tom_roush.pdfbox.pdmodel.font.PDFont;
import com.tom_roush.pdfbox.pdmodel.font.PDFontFactory;
import com.tom_roush.pdfbox.pdmodel.graphics.PDXObject;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDColorSpace;
import com.tom_roush.pdfbox.pdmodel.graphics.form.PDFormXObject;
import com.tom_roush.pdfbox.pdmodel.graphics.image.PDImageXObject;
import com.tom_roush.pdfbox.pdmodel.graphics.optionalcontent.PDOptionalContentGroup;
import com.tom_roush.pdfbox.pdmodel.graphics.pattern.PDAbstractPattern;
import com.tom_roush.pdfbox.pdmodel.graphics.shading.PDShading;
import com.tom_roush.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState;
import java.lang.ref.SoftReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class PDResources implements COSObjectable {
    private final ResourceCache cache;
    private final Map<COSName, SoftReference<PDFont>> directFontCache;
    private final COSDictionary resources;

    public PDResources() {
        this.directFontCache = new HashMap();
        this.resources = new COSDictionary();
        this.cache = null;
    }

    private COSName createKey(COSName cOSName, String str) {
        String str2;
        COSDictionary cOSDictionary = (COSDictionary) this.resources.getDictionaryObject(cOSName);
        if (cOSDictionary == null) {
            return COSName.getPDFName(str + 1);
        }
        int size = cOSDictionary.keySet().size();
        do {
            size++;
            str2 = str + size;
        } while (cOSDictionary.containsKey(str2));
        return COSName.getPDFName(str2);
    }

    private COSBase get(COSName cOSName, COSName cOSName2) {
        COSDictionary cOSDictionary = (COSDictionary) this.resources.getDictionaryObject(cOSName);
        if (cOSDictionary == null) {
            return null;
        }
        return cOSDictionary.getDictionaryObject(cOSName2);
    }

    private COSObject getIndirect(COSName cOSName, COSName cOSName2) {
        COSDictionary cOSDictionary = (COSDictionary) this.resources.getDictionaryObject(cOSName);
        if (cOSDictionary == null) {
            return null;
        }
        COSBase item = cOSDictionary.getItem(cOSName2);
        if (!(item instanceof COSObject)) {
            return null;
        }
        return (COSObject) item;
    }

    private Iterable<COSName> getNames(COSName cOSName) {
        COSDictionary cOSDictionary = (COSDictionary) this.resources.getDictionaryObject(cOSName);
        if (cOSDictionary == null) {
            return Collections.emptySet();
        }
        return cOSDictionary.keySet();
    }

    private boolean isAllowedCache(PDXObject pDXObject) {
        if (pDXObject instanceof PDImageXObject) {
            COSBase dictionaryObject = pDXObject.getCOSObject().getDictionaryObject(COSName.COLORSPACE);
            if (dictionaryObject instanceof COSName) {
                COSName cOSName = (COSName) dictionaryObject;
                if (cOSName.equals(COSName.DEVICECMYK) && hasColorSpace(COSName.DEFAULT_CMYK)) {
                    return false;
                }
                if (cOSName.equals(COSName.DEVICERGB) && hasColorSpace(COSName.DEFAULT_RGB)) {
                    return false;
                }
                if ((cOSName.equals(COSName.DEVICEGRAY) && hasColorSpace(COSName.DEFAULT_GRAY)) || hasColorSpace(cOSName)) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    private void put(COSName cOSName, COSName cOSName2, COSObjectable cOSObjectable) {
        COSDictionary cOSDictionary = (COSDictionary) this.resources.getDictionaryObject(cOSName);
        if (cOSDictionary == null) {
            cOSDictionary = new COSDictionary();
            this.resources.setItem(cOSName, (COSBase) cOSDictionary);
        }
        cOSDictionary.setItem(cOSName2, cOSObjectable);
    }

    public COSName add(PDFont pDFont) {
        return add(COSName.FONT, "F", pDFont);
    }

    public PDColorSpace getColorSpace(COSName cOSName) {
        return getColorSpace(cOSName, false);
    }

    public Iterable<COSName> getColorSpaceNames() {
        return getNames(COSName.COLORSPACE);
    }

    public PDExtendedGraphicsState getExtGState(COSName cOSName) {
        PDExtendedGraphicsState pDExtendedGraphicsState;
        PDExtendedGraphicsState extGState;
        COSName cOSName2 = COSName.EXT_G_STATE;
        COSObject indirect = getIndirect(cOSName2, cOSName);
        ResourceCache resourceCache = this.cache;
        if (resourceCache != null && indirect != null && (extGState = resourceCache.getExtGState(indirect)) != null) {
            return extGState;
        }
        COSBase cOSBase = get(cOSName2, cOSName);
        if (cOSBase instanceof COSDictionary) {
            pDExtendedGraphicsState = new PDExtendedGraphicsState((COSDictionary) cOSBase);
        } else {
            pDExtendedGraphicsState = null;
        }
        ResourceCache resourceCache2 = this.cache;
        if (resourceCache2 != null && indirect != null) {
            resourceCache2.put(indirect, pDExtendedGraphicsState);
        }
        return pDExtendedGraphicsState;
    }

    public Iterable<COSName> getExtGStateNames() {
        return getNames(COSName.EXT_G_STATE);
    }

    public PDFont getFont(COSName cOSName) {
        SoftReference<PDFont> softReference;
        PDFont pDFont;
        PDFont pDFont2;
        COSName cOSName2 = COSName.FONT;
        COSObject indirect = getIndirect(cOSName2, cOSName);
        ResourceCache resourceCache = this.cache;
        if (resourceCache != null && indirect != null) {
            PDFont font = resourceCache.getFont(indirect);
            if (font != null) {
                return font;
            }
        } else if (indirect == null && (softReference = this.directFontCache.get(cOSName)) != null && (pDFont = softReference.get()) != null) {
            return pDFont;
        }
        COSBase cOSBase = get(cOSName2, cOSName);
        if (cOSBase instanceof COSDictionary) {
            pDFont2 = PDFontFactory.createFont((COSDictionary) cOSBase, this.cache);
        } else {
            pDFont2 = null;
        }
        ResourceCache resourceCache2 = this.cache;
        if (resourceCache2 != null && indirect != null) {
            resourceCache2.put(indirect, pDFont2);
        } else if (indirect == null) {
            this.directFontCache.put(cOSName, new SoftReference<>(pDFont2));
        }
        return pDFont2;
    }

    public Iterable<COSName> getFontNames() {
        return getNames(COSName.FONT);
    }

    public PDAbstractPattern getPattern(COSName cOSName) {
        PDAbstractPattern pDAbstractPattern;
        PDAbstractPattern pattern;
        COSName cOSName2 = COSName.PATTERN;
        COSObject indirect = getIndirect(cOSName2, cOSName);
        ResourceCache resourceCache = this.cache;
        if (resourceCache != null && indirect != null && (pattern = resourceCache.getPattern(indirect)) != null) {
            return pattern;
        }
        COSBase cOSBase = get(cOSName2, cOSName);
        if (cOSBase instanceof COSDictionary) {
            pDAbstractPattern = PDAbstractPattern.create((COSDictionary) cOSBase, getResourceCache());
        } else {
            pDAbstractPattern = null;
        }
        ResourceCache resourceCache2 = this.cache;
        if (resourceCache2 != null && indirect != null) {
            resourceCache2.put(indirect, pDAbstractPattern);
        }
        return pDAbstractPattern;
    }

    public Iterable<COSName> getPatternNames() {
        return getNames(COSName.PATTERN);
    }

    public PDPropertyList getProperties(COSName cOSName) {
        PDPropertyList pDPropertyList;
        PDPropertyList properties;
        COSName cOSName2 = COSName.PROPERTIES;
        COSObject indirect = getIndirect(cOSName2, cOSName);
        ResourceCache resourceCache = this.cache;
        if (resourceCache != null && indirect != null && (properties = resourceCache.getProperties(indirect)) != null) {
            return properties;
        }
        COSBase cOSBase = get(cOSName2, cOSName);
        if (cOSBase instanceof COSDictionary) {
            pDPropertyList = PDPropertyList.create((COSDictionary) cOSBase);
        } else {
            pDPropertyList = null;
        }
        ResourceCache resourceCache2 = this.cache;
        if (resourceCache2 != null && indirect != null) {
            resourceCache2.put(indirect, pDPropertyList);
        }
        return pDPropertyList;
    }

    public Iterable<COSName> getPropertiesNames() {
        return getNames(COSName.PROPERTIES);
    }

    public ResourceCache getResourceCache() {
        return this.cache;
    }

    public PDShading getShading(COSName cOSName) {
        PDShading pDShading;
        PDShading shading;
        COSName cOSName2 = COSName.SHADING;
        COSObject indirect = getIndirect(cOSName2, cOSName);
        ResourceCache resourceCache = this.cache;
        if (resourceCache != null && indirect != null && (shading = resourceCache.getShading(indirect)) != null) {
            return shading;
        }
        COSBase cOSBase = get(cOSName2, cOSName);
        if (cOSBase instanceof COSDictionary) {
            pDShading = PDShading.create((COSDictionary) cOSBase);
        } else {
            pDShading = null;
        }
        ResourceCache resourceCache2 = this.cache;
        if (resourceCache2 != null && indirect != null) {
            resourceCache2.put(indirect, pDShading);
        }
        return pDShading;
    }

    public Iterable<COSName> getShadingNames() {
        return getNames(COSName.SHADING);
    }

    public PDXObject getXObject(COSName cOSName) {
        PDXObject createXObject;
        PDXObject xObject;
        COSName cOSName2 = COSName.XOBJECT;
        COSObject indirect = getIndirect(cOSName2, cOSName);
        ResourceCache resourceCache = this.cache;
        if (resourceCache != null && indirect != null && (xObject = resourceCache.getXObject(indirect)) != null) {
            return xObject;
        }
        COSBase cOSBase = get(cOSName2, cOSName);
        if (cOSBase == null) {
            createXObject = null;
        } else if (cOSBase instanceof COSObject) {
            createXObject = PDXObject.createXObject(((COSObject) cOSBase).getObject(), this);
        } else {
            createXObject = PDXObject.createXObject(cOSBase, this);
        }
        if (this.cache != null && indirect != null && isAllowedCache(createXObject)) {
            this.cache.put(indirect, createXObject);
        }
        return createXObject;
    }

    public Iterable<COSName> getXObjectNames() {
        return getNames(COSName.XOBJECT);
    }

    public boolean hasColorSpace(COSName cOSName) {
        if (get(COSName.COLORSPACE, cOSName) != null) {
            return true;
        }
        return false;
    }

    public boolean isImageXObject(COSName cOSName) {
        COSBase cOSBase = get(COSName.XOBJECT, cOSName);
        if (cOSBase == null) {
            return false;
        }
        if (cOSBase instanceof COSObject) {
            cOSBase = ((COSObject) cOSBase).getObject();
        }
        if (!(cOSBase instanceof COSStream)) {
            return false;
        }
        return COSName.IMAGE.equals(((COSStream) cOSBase).getCOSName(COSName.SUBTYPE));
    }

    public COSName add(PDColorSpace pDColorSpace) {
        return add(COSName.COLORSPACE, OperatorName.NON_STROKING_COLORSPACE, pDColorSpace);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.resources;
    }

    public PDColorSpace getColorSpace(COSName cOSName, boolean z10) {
        PDColorSpace create;
        PDColorSpace colorSpace;
        COSName cOSName2 = COSName.COLORSPACE;
        COSObject indirect = getIndirect(cOSName2, cOSName);
        ResourceCache resourceCache = this.cache;
        if (resourceCache == null || indirect == null || (colorSpace = resourceCache.getColorSpace(indirect)) == null) {
            COSBase cOSBase = get(cOSName2, cOSName);
            if (cOSBase != null) {
                create = PDColorSpace.create(cOSBase, this, z10);
            } else {
                create = PDColorSpace.create(cOSName, this, z10);
            }
            ResourceCache resourceCache2 = this.cache;
            if (resourceCache2 != null && indirect != null) {
                resourceCache2.put(indirect, create);
            }
            return create;
        }
        return colorSpace;
    }

    public COSName add(PDExtendedGraphicsState pDExtendedGraphicsState) {
        return add(COSName.EXT_G_STATE, OperatorName.SET_GRAPHICS_STATE_PARAMS, pDExtendedGraphicsState);
    }

    public COSName add(PDShading pDShading) {
        return add(COSName.SHADING, OperatorName.SHADING_FILL, pDShading);
    }

    public PDResources(COSDictionary cOSDictionary) {
        this.directFontCache = new HashMap();
        if (cOSDictionary != null) {
            this.resources = cOSDictionary;
            this.cache = null;
            return;
        }
        throw new IllegalArgumentException("resourceDictionary is null");
    }

    public COSName add(PDAbstractPattern pDAbstractPattern) {
        return add(COSName.PATTERN, "p", pDAbstractPattern);
    }

    public void put(COSName cOSName, PDFont pDFont) {
        put(COSName.FONT, cOSName, pDFont);
    }

    public COSName add(PDPropertyList pDPropertyList) {
        if (pDPropertyList instanceof PDOptionalContentGroup) {
            return add(COSName.PROPERTIES, "oc", pDPropertyList);
        }
        return add(COSName.PROPERTIES, "Prop", pDPropertyList);
    }

    public void put(COSName cOSName, PDColorSpace pDColorSpace) {
        put(COSName.COLORSPACE, cOSName, pDColorSpace);
    }

    public void put(COSName cOSName, PDExtendedGraphicsState pDExtendedGraphicsState) {
        put(COSName.EXT_G_STATE, cOSName, pDExtendedGraphicsState);
    }

    public void put(COSName cOSName, PDShading pDShading) {
        put(COSName.SHADING, cOSName, pDShading);
    }

    public COSName add(PDImageXObject pDImageXObject) {
        return add(COSName.XOBJECT, "Im", pDImageXObject);
    }

    public void put(COSName cOSName, PDAbstractPattern pDAbstractPattern) {
        put(COSName.PATTERN, cOSName, pDAbstractPattern);
    }

    public PDResources(COSDictionary cOSDictionary, ResourceCache resourceCache) {
        this.directFontCache = new HashMap();
        if (cOSDictionary != null) {
            this.resources = cOSDictionary;
            this.cache = resourceCache;
            return;
        }
        throw new IllegalArgumentException("resourceDictionary is null");
    }

    public COSName add(PDFormXObject pDFormXObject) {
        return add(COSName.XOBJECT, StandardStructureTypes.FORM, pDFormXObject);
    }

    public void put(COSName cOSName, PDPropertyList pDPropertyList) {
        put(COSName.PROPERTIES, cOSName, pDPropertyList);
    }

    public COSName add(PDXObject pDXObject, String str) {
        return add(COSName.XOBJECT, str, pDXObject);
    }

    public void put(COSName cOSName, PDXObject pDXObject) {
        put(COSName.XOBJECT, cOSName, pDXObject);
    }

    private COSName add(COSName cOSName, String str, COSObjectable cOSObjectable) {
        COSDictionary cOSDictionary = (COSDictionary) this.resources.getDictionaryObject(cOSName);
        if (cOSDictionary != null && cOSDictionary.containsValue(cOSObjectable.getCOSObject())) {
            return cOSDictionary.getKeyForValue(cOSObjectable.getCOSObject());
        }
        if (cOSDictionary != null && COSName.FONT.equals(cOSName)) {
            for (Map.Entry<COSName, COSBase> entry : cOSDictionary.entrySet()) {
                if ((entry.getValue() instanceof COSObject) && cOSObjectable.getCOSObject() == ((COSObject) entry.getValue()).getObject()) {
                    return entry.getKey();
                }
            }
        }
        COSName createKey = createKey(cOSName, str);
        put(cOSName, createKey, cOSObjectable);
        return createKey;
    }
}
