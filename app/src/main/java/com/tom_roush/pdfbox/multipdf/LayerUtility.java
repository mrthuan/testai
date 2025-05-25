package com.tom_roush.pdfbox.multipdf;

import a0.a;
import com.tom_roush.fontbox.util.BoundingBox;
import com.tom_roush.harmony.awt.geom.AffineTransform;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSStream;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.PDDocumentCatalog;
import com.tom_roush.pdfbox.pdmodel.PDPage;
import com.tom_roush.pdfbox.pdmodel.PDPageContentStream;
import com.tom_roush.pdfbox.pdmodel.PDResources;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.pdmodel.common.PDStream;
import com.tom_roush.pdfbox.pdmodel.graphics.form.PDFormXObject;
import com.tom_roush.pdfbox.pdmodel.graphics.optionalcontent.PDOptionalContentGroup;
import com.tom_roush.pdfbox.pdmodel.graphics.optionalcontent.PDOptionalContentProperties;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationMarkup;
import com.tom_roush.pdfbox.util.Matrix;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import lib.zj.office.fc.codec.CharEncoding;

/* loaded from: classes2.dex */
public class LayerUtility {
    private static final boolean DEBUG = true;
    private static final Set<String> PAGE_TO_FORM_FILTER = new HashSet(Arrays.asList(PDAnnotationMarkup.RT_GROUP, "LastModified", "Metadata"));
    private final PDFCloneUtility cloner;
    private final PDDocument targetDoc;

    public LayerUtility(PDDocument pDDocument) {
        this.targetDoc = pDDocument;
        this.cloner = new PDFCloneUtility(pDDocument);
    }

    private void importOcProperties(PDDocument pDDocument) {
        PDOptionalContentProperties oCProperties = pDDocument.getDocumentCatalog().getOCProperties();
        if (oCProperties == null) {
            return;
        }
        PDDocumentCatalog documentCatalog = this.targetDoc.getDocumentCatalog();
        PDOptionalContentProperties oCProperties2 = documentCatalog.getOCProperties();
        if (oCProperties2 == null) {
            documentCatalog.setOCProperties(new PDOptionalContentProperties((COSDictionary) this.cloner.cloneForNewDocument(oCProperties)));
        } else {
            this.cloner.cloneMerge(oCProperties, oCProperties2);
        }
    }

    private void transferDict(COSDictionary cOSDictionary, COSDictionary cOSDictionary2, Set<String> set, boolean z10) {
        for (Map.Entry<COSName, COSBase> entry : cOSDictionary.entrySet()) {
            COSName key = entry.getKey();
            if (!z10 || set.contains(key.getName())) {
                if (z10 || !set.contains(key.getName())) {
                    cOSDictionary2.setItem(key, this.cloner.cloneForNewDocument(entry.getValue()));
                }
            }
        }
    }

    public PDOptionalContentGroup appendFormAsLayer(PDPage pDPage, PDFormXObject pDFormXObject, AffineTransform affineTransform, String str) {
        PDDocumentCatalog documentCatalog = this.targetDoc.getDocumentCatalog();
        PDOptionalContentProperties oCProperties = documentCatalog.getOCProperties();
        if (oCProperties == null) {
            oCProperties = new PDOptionalContentProperties();
            documentCatalog.setOCProperties(oCProperties);
        }
        if (!oCProperties.hasGroup(str)) {
            PDRectangle cropBox = pDPage.getCropBox();
            if ((cropBox.getLowerLeftX() < 0.0f || cropBox.getLowerLeftY() < 0.0f) && affineTransform.isIdentity()) {
                cropBox.toString();
            }
            PDOptionalContentGroup pDOptionalContentGroup = new PDOptionalContentGroup(str);
            oCProperties.addGroup(pDOptionalContentGroup);
            PDPageContentStream pDPageContentStream = new PDPageContentStream(this.targetDoc, pDPage, PDPageContentStream.AppendMode.APPEND, false);
            pDPageContentStream.beginMarkedContent(COSName.OC, pDOptionalContentGroup);
            pDPageContentStream.saveGraphicsState();
            pDPageContentStream.transform(new Matrix(affineTransform));
            pDPageContentStream.drawForm(pDFormXObject);
            pDPageContentStream.restoreGraphicsState();
            pDPageContentStream.endMarkedContent();
            pDPageContentStream.close();
            return pDOptionalContentGroup;
        }
        throw new IllegalArgumentException(a.h("Optional group (layer) already exists: ", str));
    }

    public PDDocument getDocument() {
        return this.targetDoc;
    }

    public PDFormXObject importPageAsForm(PDDocument pDDocument, int i10) {
        return importPageAsForm(pDDocument, pDDocument.getPage(i10));
    }

    public void wrapInSaveRestore(PDPage pDPage) {
        COSStream createCOSStream = getDocument().getDocument().createCOSStream();
        OutputStream createOutputStream = createCOSStream.createOutputStream();
        createOutputStream.write("q\n".getBytes(CharEncoding.ISO_8859_1));
        createOutputStream.close();
        COSStream createCOSStream2 = getDocument().getDocument().createCOSStream();
        OutputStream createOutputStream2 = createCOSStream2.createOutputStream();
        createOutputStream2.write("Q\n".getBytes(CharEncoding.ISO_8859_1));
        createOutputStream2.close();
        COSDictionary cOSObject = pDPage.getCOSObject();
        COSName cOSName = COSName.CONTENTS;
        COSBase dictionaryObject = cOSObject.getDictionaryObject(cOSName);
        if (dictionaryObject instanceof COSStream) {
            COSArray cOSArray = new COSArray();
            cOSArray.add((COSBase) createCOSStream);
            cOSArray.add((COSBase) ((COSStream) dictionaryObject));
            cOSArray.add((COSBase) createCOSStream2);
            cOSObject.setItem(cOSName, (COSBase) cOSArray);
        } else if (dictionaryObject instanceof COSArray) {
            COSArray cOSArray2 = (COSArray) dictionaryObject;
            cOSArray2.add(0, createCOSStream);
            cOSArray2.add((COSBase) createCOSStream2);
        } else {
            throw new IOException("Contents are unknown type: ".concat(dictionaryObject.getClass().getName()));
        }
    }

    public PDFormXObject importPageAsForm(PDDocument pDDocument, PDPage pDPage) {
        importOcProperties(pDDocument);
        PDFormXObject pDFormXObject = new PDFormXObject(new PDStream(this.targetDoc, pDPage.getContents(), COSName.FLATE_DECODE));
        PDResources resources = pDPage.getResources();
        PDResources pDResources = new PDResources();
        this.cloner.cloneMerge(resources, pDResources);
        pDFormXObject.setResources(pDResources);
        transferDict(pDPage.getCOSObject(), pDFormXObject.getCOSObject(), PAGE_TO_FORM_FILTER, true);
        AffineTransform createAffineTransform = pDFormXObject.getMatrix().createAffineTransform();
        PDRectangle mediaBox = pDPage.getMediaBox();
        PDRectangle cropBox = pDPage.getCropBox();
        if (cropBox == null) {
            cropBox = mediaBox;
        }
        int rotation = pDPage.getRotation();
        createAffineTransform.translate(mediaBox.getLowerLeftX() - cropBox.getLowerLeftX(), mediaBox.getLowerLeftY() - cropBox.getLowerLeftY());
        if (rotation == 90) {
            createAffineTransform.scale(cropBox.getWidth() / cropBox.getHeight(), cropBox.getHeight() / cropBox.getWidth());
            createAffineTransform.translate(0.0d, cropBox.getWidth());
            createAffineTransform.rotate(-1.5707963267948966d);
        } else if (rotation == 180) {
            createAffineTransform.translate(cropBox.getWidth(), cropBox.getHeight());
            createAffineTransform.rotate(-3.141592653589793d);
        } else if (rotation == 270) {
            createAffineTransform.scale(cropBox.getWidth() / cropBox.getHeight(), cropBox.getHeight() / cropBox.getWidth());
            createAffineTransform.translate(cropBox.getHeight(), 0.0d);
            createAffineTransform.rotate(-4.71238898038469d);
        }
        createAffineTransform.translate(-cropBox.getLowerLeftX(), -cropBox.getLowerLeftY());
        if (!createAffineTransform.isIdentity()) {
            pDFormXObject.setMatrix(createAffineTransform);
        }
        BoundingBox boundingBox = new BoundingBox();
        boundingBox.setLowerLeftX(cropBox.getLowerLeftX());
        boundingBox.setLowerLeftY(cropBox.getLowerLeftY());
        boundingBox.setUpperRightX(cropBox.getUpperRightX());
        boundingBox.setUpperRightY(cropBox.getUpperRightY());
        pDFormXObject.setBBox(new PDRectangle(boundingBox));
        return pDFormXObject;
    }
}
