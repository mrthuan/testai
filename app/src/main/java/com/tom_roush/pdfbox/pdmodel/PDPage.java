package com.tom_roush.pdfbox.pdmodel;

import com.tom_roush.pdfbox.contentstream.PDContentStream;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSFloat;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSNumber;
import com.tom_roush.pdfbox.cos.COSStream;
import com.tom_roush.pdfbox.pdmodel.common.COSArrayList;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import com.tom_roush.pdfbox.pdmodel.common.PDMetadata;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.pdmodel.common.PDStream;
import com.tom_roush.pdfbox.pdmodel.interactive.action.PDPageAdditionalActions;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.AnnotationFilter;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotation;
import com.tom_roush.pdfbox.pdmodel.interactive.measurement.PDViewportDictionary;
import com.tom_roush.pdfbox.pdmodel.interactive.pagenavigation.PDThreadBead;
import com.tom_roush.pdfbox.pdmodel.interactive.pagenavigation.PDTransition;
import com.tom_roush.pdfbox.util.Matrix;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public class PDPage implements COSObjectable, PDContentStream {
    private PDRectangle mediaBox;
    private final COSDictionary page;
    private PDResources pageResources;
    private ResourceCache resourceCache;

    public PDPage() {
        this(PDRectangle.LETTER);
    }

    private PDRectangle clipToMediaBox(PDRectangle pDRectangle) {
        PDRectangle mediaBox = getMediaBox();
        PDRectangle pDRectangle2 = new PDRectangle();
        pDRectangle2.setLowerLeftX(Math.max(mediaBox.getLowerLeftX(), pDRectangle.getLowerLeftX()));
        pDRectangle2.setLowerLeftY(Math.max(mediaBox.getLowerLeftY(), pDRectangle.getLowerLeftY()));
        pDRectangle2.setUpperRightX(Math.min(mediaBox.getUpperRightX(), pDRectangle.getUpperRightX()));
        pDRectangle2.setUpperRightY(Math.min(mediaBox.getUpperRightY(), pDRectangle.getUpperRightY()));
        return pDRectangle2;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof PDPage) && ((PDPage) obj).getCOSObject() == getCOSObject()) {
            return true;
        }
        return false;
    }

    public PDPageAdditionalActions getActions() {
        COSDictionary cOSDictionary;
        COSDictionary cOSDictionary2 = this.page;
        COSName cOSName = COSName.AA;
        COSBase dictionaryObject = cOSDictionary2.getDictionaryObject(cOSName);
        if (dictionaryObject instanceof COSDictionary) {
            cOSDictionary = (COSDictionary) dictionaryObject;
        } else {
            cOSDictionary = new COSDictionary();
            this.page.setItem(cOSName, (COSBase) cOSDictionary);
        }
        return new PDPageAdditionalActions(cOSDictionary);
    }

    public List<PDAnnotation> getAnnotations() {
        return getAnnotations(new AnnotationFilter() { // from class: com.tom_roush.pdfbox.pdmodel.PDPage.1
            @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.AnnotationFilter
            public boolean accept(PDAnnotation pDAnnotation) {
                return true;
            }
        });
    }

    public PDRectangle getArtBox() {
        COSBase dictionaryObject = this.page.getDictionaryObject(COSName.ART_BOX);
        if (dictionaryObject instanceof COSArray) {
            return clipToMediaBox(new PDRectangle((COSArray) dictionaryObject));
        }
        return getCropBox();
    }

    @Override // com.tom_roush.pdfbox.contentstream.PDContentStream
    public PDRectangle getBBox() {
        return getCropBox();
    }

    public PDRectangle getBleedBox() {
        COSBase dictionaryObject = this.page.getDictionaryObject(COSName.BLEED_BOX);
        if (dictionaryObject instanceof COSArray) {
            return clipToMediaBox(new PDRectangle((COSArray) dictionaryObject));
        }
        return getCropBox();
    }

    public Iterator<PDStream> getContentStreams() {
        ArrayList arrayList = new ArrayList();
        COSBase dictionaryObject = this.page.getDictionaryObject(COSName.CONTENTS);
        if (dictionaryObject instanceof COSStream) {
            arrayList.add(new PDStream((COSStream) dictionaryObject));
        } else if (dictionaryObject instanceof COSArray) {
            COSArray cOSArray = (COSArray) dictionaryObject;
            if (cOSArray.size() > 0) {
                for (int i10 = 0; i10 < cOSArray.size(); i10++) {
                    arrayList.add(new PDStream((COSStream) cOSArray.getObject(i10)));
                }
            }
        }
        return arrayList.iterator();
    }

    @Override // com.tom_roush.pdfbox.contentstream.PDContentStream
    public InputStream getContents() {
        COSBase dictionaryObject = this.page.getDictionaryObject(COSName.CONTENTS);
        if (dictionaryObject instanceof COSStream) {
            return ((COSStream) dictionaryObject).createInputStream();
        }
        if (dictionaryObject instanceof COSArray) {
            COSArray cOSArray = (COSArray) dictionaryObject;
            if (cOSArray.size() > 0) {
                byte[] bArr = {10};
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < cOSArray.size(); i10++) {
                    COSBase object = cOSArray.getObject(i10);
                    if (object instanceof COSStream) {
                        arrayList.add(((COSStream) object).createInputStream());
                        arrayList.add(new ByteArrayInputStream(bArr));
                    }
                }
                return new SequenceInputStream(Collections.enumeration(arrayList));
            }
        }
        return new ByteArrayInputStream(new byte[0]);
    }

    public PDRectangle getCropBox() {
        COSBase inheritableAttribute = PDPageTree.getInheritableAttribute(this.page, COSName.CROP_BOX);
        if (inheritableAttribute instanceof COSArray) {
            return clipToMediaBox(new PDRectangle((COSArray) inheritableAttribute));
        }
        return getMediaBox();
    }

    @Override // com.tom_roush.pdfbox.contentstream.PDContentStream
    public Matrix getMatrix() {
        return new Matrix();
    }

    public PDRectangle getMediaBox() {
        if (this.mediaBox == null) {
            COSBase inheritableAttribute = PDPageTree.getInheritableAttribute(this.page, COSName.MEDIA_BOX);
            if (inheritableAttribute instanceof COSArray) {
                this.mediaBox = new PDRectangle((COSArray) inheritableAttribute);
            }
        }
        if (this.mediaBox == null) {
            this.mediaBox = PDRectangle.LETTER;
        }
        return this.mediaBox;
    }

    public PDMetadata getMetadata() {
        COSBase dictionaryObject = this.page.getDictionaryObject(COSName.METADATA);
        if (dictionaryObject instanceof COSStream) {
            return new PDMetadata((COSStream) dictionaryObject);
        }
        return null;
    }

    public ResourceCache getResourceCache() {
        return this.resourceCache;
    }

    @Override // com.tom_roush.pdfbox.contentstream.PDContentStream
    public PDResources getResources() {
        if (this.pageResources == null) {
            COSBase inheritableAttribute = PDPageTree.getInheritableAttribute(this.page, COSName.RESOURCES);
            if (inheritableAttribute instanceof COSDictionary) {
                this.pageResources = new PDResources((COSDictionary) inheritableAttribute, this.resourceCache);
            }
        }
        return this.pageResources;
    }

    public int getRotation() {
        COSBase inheritableAttribute = PDPageTree.getInheritableAttribute(this.page, COSName.ROTATE);
        if (inheritableAttribute instanceof COSNumber) {
            int intValue = ((COSNumber) inheritableAttribute).intValue();
            if (intValue % 90 == 0) {
                return ((intValue % 360) + 360) % 360;
            }
            return 0;
        }
        return 0;
    }

    public int getStructParents() {
        return this.page.getInt(COSName.STRUCT_PARENTS);
    }

    public List<PDThreadBead> getThreadBeads() {
        PDThreadBead pDThreadBead;
        COSArray cOSArray = (COSArray) this.page.getDictionaryObject(COSName.B);
        if (cOSArray == null) {
            cOSArray = new COSArray();
        }
        ArrayList arrayList = new ArrayList(cOSArray.size());
        for (int i10 = 0; i10 < cOSArray.size(); i10++) {
            COSBase object = cOSArray.getObject(i10);
            if (object instanceof COSDictionary) {
                pDThreadBead = new PDThreadBead((COSDictionary) object);
            } else {
                pDThreadBead = null;
            }
            arrayList.add(pDThreadBead);
        }
        return new COSArrayList(arrayList, cOSArray);
    }

    public PDTransition getTransition() {
        COSBase dictionaryObject = this.page.getDictionaryObject(COSName.TRANS);
        if (dictionaryObject instanceof COSDictionary) {
            return new PDTransition((COSDictionary) dictionaryObject);
        }
        return null;
    }

    public PDRectangle getTrimBox() {
        COSBase dictionaryObject = this.page.getDictionaryObject(COSName.TRIM_BOX);
        if (dictionaryObject instanceof COSArray) {
            return clipToMediaBox(new PDRectangle((COSArray) dictionaryObject));
        }
        return getCropBox();
    }

    public float getUserUnit() {
        float f10 = this.page.getFloat(COSName.USER_UNIT, 1.0f);
        if (f10 <= 0.0f) {
            return 1.0f;
        }
        return f10;
    }

    public List<PDViewportDictionary> getViewports() {
        COSBase dictionaryObject = this.page.getDictionaryObject(COSName.VP);
        if (!(dictionaryObject instanceof COSArray)) {
            return null;
        }
        COSArray cOSArray = (COSArray) dictionaryObject;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < cOSArray.size(); i10++) {
            COSBase object = cOSArray.getObject(i10);
            if (object instanceof COSDictionary) {
                arrayList.add(new PDViewportDictionary((COSDictionary) object));
            } else {
                Objects.toString(object);
            }
        }
        return arrayList;
    }

    public boolean hasContents() {
        COSBase dictionaryObject = this.page.getDictionaryObject(COSName.CONTENTS);
        if (dictionaryObject instanceof COSStream) {
            if (((COSStream) dictionaryObject).size() > 0) {
                return true;
            }
            return false;
        } else if ((dictionaryObject instanceof COSArray) && ((COSArray) dictionaryObject).size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.page.hashCode();
    }

    public void setActions(PDPageAdditionalActions pDPageAdditionalActions) {
        this.page.setItem(COSName.AA, pDPageAdditionalActions);
    }

    public void setAnnotations(List<PDAnnotation> list) {
        this.page.setItem(COSName.ANNOTS, (COSBase) COSArrayList.converterToCOSArray(list));
    }

    public void setArtBox(PDRectangle pDRectangle) {
        if (pDRectangle == null) {
            this.page.removeItem(COSName.ART_BOX);
        } else {
            this.page.setItem(COSName.ART_BOX, pDRectangle);
        }
    }

    public void setBleedBox(PDRectangle pDRectangle) {
        if (pDRectangle == null) {
            this.page.removeItem(COSName.BLEED_BOX);
        } else {
            this.page.setItem(COSName.BLEED_BOX, pDRectangle);
        }
    }

    public void setContents(PDStream pDStream) {
        this.page.setItem(COSName.CONTENTS, pDStream);
    }

    public void setCropBox(PDRectangle pDRectangle) {
        if (pDRectangle == null) {
            this.page.removeItem(COSName.CROP_BOX);
        } else {
            this.page.setItem(COSName.CROP_BOX, (COSBase) pDRectangle.getCOSArray());
        }
    }

    public void setMediaBox(PDRectangle pDRectangle) {
        this.mediaBox = pDRectangle;
        if (pDRectangle == null) {
            this.page.removeItem(COSName.MEDIA_BOX);
        } else {
            this.page.setItem(COSName.MEDIA_BOX, pDRectangle);
        }
    }

    public void setMetadata(PDMetadata pDMetadata) {
        this.page.setItem(COSName.METADATA, pDMetadata);
    }

    public void setResources(PDResources pDResources) {
        this.pageResources = pDResources;
        if (pDResources != null) {
            this.page.setItem(COSName.RESOURCES, pDResources);
        } else {
            this.page.removeItem(COSName.RESOURCES);
        }
    }

    public void setRotation(int i10) {
        this.page.setInt(COSName.ROTATE, i10);
    }

    public void setStructParents(int i10) {
        this.page.setInt(COSName.STRUCT_PARENTS, i10);
    }

    public void setThreadBeads(List<PDThreadBead> list) {
        this.page.setItem(COSName.B, (COSBase) COSArrayList.converterToCOSArray(list));
    }

    public void setTransition(PDTransition pDTransition) {
        this.page.setItem(COSName.TRANS, pDTransition);
    }

    public void setTrimBox(PDRectangle pDRectangle) {
        if (pDRectangle == null) {
            this.page.removeItem(COSName.TRIM_BOX);
        } else {
            this.page.setItem(COSName.TRIM_BOX, pDRectangle);
        }
    }

    public void setUserUnit(float f10) {
        if (f10 > 0.0f) {
            this.page.setFloat(COSName.USER_UNIT, f10);
            return;
        }
        throw new IllegalArgumentException("User unit must be positive");
    }

    public void setViewports(List<PDViewportDictionary> list) {
        if (list == null) {
            this.page.removeItem(COSName.VP);
            return;
        }
        COSArray cOSArray = new COSArray();
        for (PDViewportDictionary pDViewportDictionary : list) {
            cOSArray.add(pDViewportDictionary);
        }
        this.page.setItem(COSName.VP, (COSBase) cOSArray);
    }

    public PDPage(PDRectangle pDRectangle) {
        COSDictionary cOSDictionary = new COSDictionary();
        this.page = cOSDictionary;
        cOSDictionary.setItem(COSName.TYPE, (COSBase) COSName.PAGE);
        cOSDictionary.setItem(COSName.MEDIA_BOX, pDRectangle);
    }

    public List<PDAnnotation> getAnnotations(AnnotationFilter annotationFilter) {
        COSDictionary cOSDictionary = this.page;
        COSName cOSName = COSName.ANNOTS;
        COSBase dictionaryObject = cOSDictionary.getDictionaryObject(cOSName);
        if (dictionaryObject instanceof COSArray) {
            COSArray cOSArray = (COSArray) dictionaryObject;
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < cOSArray.size(); i10++) {
                COSBase object = cOSArray.getObject(i10);
                if (object != null) {
                    PDAnnotation createAnnotation = PDAnnotation.createAnnotation(object);
                    if (annotationFilter.accept(createAnnotation)) {
                        arrayList.add(createAnnotation);
                    }
                }
            }
            return new COSArrayList(arrayList, cOSArray);
        }
        return new COSArrayList(this.page, cOSName);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.page;
    }

    public void setContents(List<PDStream> list) {
        COSArray cOSArray = new COSArray();
        for (PDStream pDStream : list) {
            cOSArray.add(pDStream);
        }
        this.page.setItem(COSName.CONTENTS, (COSBase) cOSArray);
    }

    public void setTransition(PDTransition pDTransition, float f10) {
        this.page.setItem(COSName.TRANS, pDTransition);
        this.page.setItem(COSName.DUR, (COSBase) new COSFloat(f10));
    }

    public PDPage(COSDictionary cOSDictionary) {
        this.page = cOSDictionary;
    }

    public PDPage(COSDictionary cOSDictionary, ResourceCache resourceCache) {
        this.page = cOSDictionary;
        this.resourceCache = resourceCache;
    }
}
