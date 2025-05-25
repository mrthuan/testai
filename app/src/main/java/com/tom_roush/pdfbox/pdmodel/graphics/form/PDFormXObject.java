package com.tom_roush.pdfbox.pdmodel.graphics.form;

import com.tom_roush.harmony.awt.geom.AffineTransform;
import com.tom_roush.pdfbox.contentstream.PDContentStream;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSFloat;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSStream;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.PDResources;
import com.tom_roush.pdfbox.pdmodel.ResourceCache;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.pdmodel.common.PDStream;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.markedcontent.PDPropertyList;
import com.tom_roush.pdfbox.pdmodel.graphics.PDXObject;
import com.tom_roush.pdfbox.util.Matrix;
import java.io.InputStream;

/* loaded from: classes2.dex */
public class PDFormXObject extends PDXObject implements PDContentStream {
    private final ResourceCache cache;
    private PDTransparencyGroupAttributes group;

    public PDFormXObject(PDStream pDStream) {
        super(pDStream, COSName.FORM);
        this.cache = null;
    }

    @Override // com.tom_roush.pdfbox.contentstream.PDContentStream
    public PDRectangle getBBox() {
        COSArray cOSArray = (COSArray) getCOSObject().getDictionaryObject(COSName.BBOX);
        if (cOSArray != null) {
            return new PDRectangle(cOSArray);
        }
        return null;
    }

    public PDStream getContentStream() {
        return new PDStream(getCOSObject());
    }

    @Override // com.tom_roush.pdfbox.contentstream.PDContentStream
    public InputStream getContents() {
        return getCOSObject().createInputStream();
    }

    public int getFormType() {
        return getCOSObject().getInt(COSName.FORMTYPE, 1);
    }

    public PDTransparencyGroupAttributes getGroup() {
        COSDictionary cOSDictionary;
        if (this.group == null && (cOSDictionary = (COSDictionary) getCOSObject().getDictionaryObject(COSName.GROUP)) != null) {
            this.group = new PDTransparencyGroupAttributes(cOSDictionary);
        }
        return this.group;
    }

    @Override // com.tom_roush.pdfbox.contentstream.PDContentStream
    public Matrix getMatrix() {
        return Matrix.createMatrix(getCOSObject().getDictionaryObject(COSName.MATRIX));
    }

    public PDPropertyList getOptionalContent() {
        COSBase dictionaryObject = getCOSObject().getDictionaryObject(COSName.OC);
        if (dictionaryObject instanceof COSDictionary) {
            return PDPropertyList.create((COSDictionary) dictionaryObject);
        }
        return null;
    }

    @Override // com.tom_roush.pdfbox.contentstream.PDContentStream
    public PDResources getResources() {
        COSStream cOSObject = getCOSObject();
        COSName cOSName = COSName.RESOURCES;
        COSDictionary cOSDictionary = cOSObject.getCOSDictionary(cOSName);
        if (cOSDictionary != null) {
            return new PDResources(cOSDictionary, this.cache);
        }
        if (getCOSObject().containsKey(cOSName)) {
            return new PDResources();
        }
        return null;
    }

    public int getStructParents() {
        return getCOSObject().getInt(COSName.STRUCT_PARENTS);
    }

    public void setBBox(PDRectangle pDRectangle) {
        if (pDRectangle == null) {
            getCOSObject().removeItem(COSName.BBOX);
        } else {
            getCOSObject().setItem(COSName.BBOX, (COSBase) pDRectangle.getCOSArray());
        }
    }

    public void setFormType(int i10) {
        getCOSObject().setInt(COSName.FORMTYPE, i10);
    }

    public void setMatrix(AffineTransform affineTransform) {
        COSArray cOSArray = new COSArray();
        double[] dArr = new double[6];
        affineTransform.getMatrix(dArr);
        for (int i10 = 0; i10 < 6; i10++) {
            cOSArray.add((COSBase) new COSFloat((float) dArr[i10]));
        }
        getCOSObject().setItem(COSName.MATRIX, (COSBase) cOSArray);
    }

    public void setOptionalContent(PDPropertyList pDPropertyList) {
        getCOSObject().setItem(COSName.OC, pDPropertyList);
    }

    public void setResources(PDResources pDResources) {
        getCOSObject().setItem(COSName.RESOURCES, pDResources);
    }

    public void setStructParents(int i10) {
        getCOSObject().setInt(COSName.STRUCT_PARENTS, i10);
    }

    public PDFormXObject(COSStream cOSStream) {
        super(cOSStream, COSName.FORM);
        this.cache = null;
    }

    public PDFormXObject(COSStream cOSStream, ResourceCache resourceCache) {
        super(cOSStream, COSName.FORM);
        this.cache = resourceCache;
    }

    public PDFormXObject(PDDocument pDDocument) {
        super(pDDocument, COSName.FORM);
        this.cache = null;
    }
}
