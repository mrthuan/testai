package com.tom_roush.pdfbox.pdmodel.interactive.form;

import android.graphics.Path;
import android.graphics.RectF;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSNumber;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.PDPage;
import com.tom_roush.pdfbox.pdmodel.PDPageContentStream;
import com.tom_roush.pdfbox.pdmodel.PDResources;
import com.tom_roush.pdfbox.pdmodel.common.COSArrayList;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.pdmodel.fdf.FDFCatalog;
import com.tom_roush.pdfbox.pdmodel.fdf.FDFDictionary;
import com.tom_roush.pdfbox.pdmodel.fdf.FDFDocument;
import com.tom_roush.pdfbox.pdmodel.fdf.FDFField;
import com.tom_roush.pdfbox.pdmodel.graphics.form.PDFormXObject;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotation;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationWidget;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream;
import com.tom_roush.pdfbox.util.Matrix;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class PDAcroForm implements COSObjectable {
    private static final int FLAG_APPEND_ONLY = 2;
    private static final int FLAG_SIGNATURES_EXIST = 1;
    private final COSDictionary dictionary;
    private final PDDocument document;
    private Map<String, PDField> fieldCache;
    private ScriptingHandler scriptingHandler;

    public PDAcroForm(PDDocument pDDocument) {
        this.document = pDDocument;
        COSDictionary cOSDictionary = new COSDictionary();
        this.dictionary = cOSDictionary;
        cOSDictionary.setItem(COSName.FIELDS, (COSBase) new COSArray());
    }

    private Map<COSDictionary, Set<COSDictionary>> buildPagesWidgetsMap(List<PDField> list) {
        HashMap hashMap = new HashMap();
        boolean z10 = false;
        for (PDField pDField : list) {
            for (PDAnnotationWidget pDAnnotationWidget : pDField.getWidgets()) {
                PDPage page = pDAnnotationWidget.getPage();
                if (page != null) {
                    fillPagesAnnotationMap(hashMap, page, pDAnnotationWidget);
                } else {
                    z10 = true;
                }
            }
        }
        if (!z10) {
            return hashMap;
        }
        Iterator<PDPage> it = this.document.getPages().iterator();
        while (it.hasNext()) {
            PDPage next = it.next();
            for (PDAnnotation pDAnnotation : next.getAnnotations()) {
                if (pDAnnotation instanceof PDAnnotationWidget) {
                    fillPagesAnnotationMap(hashMap, next, (PDAnnotationWidget) pDAnnotation);
                }
            }
        }
        return hashMap;
    }

    private void fillPagesAnnotationMap(Map<COSDictionary, Set<COSDictionary>> map, PDPage pDPage, PDAnnotationWidget pDAnnotationWidget) {
        if (map.get(pDPage.getCOSObject()) == null) {
            HashSet hashSet = new HashSet();
            hashSet.add(pDAnnotationWidget.getCOSObject());
            map.put(pDPage.getCOSObject(), hashSet);
            return;
        }
        map.get(pDPage.getCOSObject()).add(pDAnnotationWidget.getCOSObject());
    }

    private RectF getTransformedAppearanceBBox(PDAppearanceStream pDAppearanceStream) {
        Path transform = pDAppearanceStream.getBBox().transform(pDAppearanceStream.getMatrix());
        RectF rectF = new RectF();
        transform.computeBounds(rectF, true);
        return rectF;
    }

    private boolean isVisibleAnnotation(PDAnnotation pDAnnotation) {
        PDAppearanceStream normalAppearanceStream;
        PDRectangle bBox;
        if (pDAnnotation.isInvisible() || pDAnnotation.isHidden() || (normalAppearanceStream = pDAnnotation.getNormalAppearanceStream()) == null || (bBox = normalAppearanceStream.getBBox()) == null || bBox.getWidth() <= 0.0f || bBox.getHeight() <= 0.0f) {
            return false;
        }
        return true;
    }

    private void removeFields(List<PDField> list) {
        COSBase dictionaryObject;
        for (PDField pDField : list) {
            if (pDField.getParent() == null) {
                dictionaryObject = this.dictionary.getDictionaryObject(COSName.FIELDS);
            } else {
                dictionaryObject = pDField.getParent().getCOSObject().getDictionaryObject(COSName.KIDS);
            }
            ((COSArray) dictionaryObject).removeObject(pDField.getCOSObject());
        }
    }

    private Matrix resolveTransformationMatrix(PDAnnotation pDAnnotation, PDAppearanceStream pDAppearanceStream) {
        RectF transformedAppearanceBBox = getTransformedAppearanceBBox(pDAppearanceStream);
        PDRectangle rectangle = pDAnnotation.getRectangle();
        Matrix matrix = new Matrix();
        matrix.translate(rectangle.getLowerLeftX() - transformedAppearanceBBox.left, rectangle.getLowerLeftY() - transformedAppearanceBBox.top);
        matrix.scale(rectangle.getWidth() / transformedAppearanceBBox.width(), rectangle.getHeight() / transformedAppearanceBBox.height());
        return matrix;
    }

    public FDFDocument exportFDF() {
        FDFDocument fDFDocument = new FDFDocument();
        FDFCatalog catalog = fDFDocument.getCatalog();
        FDFDictionary fDFDictionary = new FDFDictionary();
        catalog.setFDF(fDFDictionary);
        ArrayList arrayList = new ArrayList();
        for (PDField pDField : getFields()) {
            arrayList.add(pDField.exportFDF());
        }
        fDFDictionary.setID(this.document.getDocument().getDocumentID());
        if (!arrayList.isEmpty()) {
            fDFDictionary.setFields(arrayList);
        }
        return fDFDocument;
    }

    public void flatten() {
        if (xfaIsDynamic()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<PDField> it = getFieldTree().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        flatten(arrayList, false);
    }

    public String getDefaultAppearance() {
        return this.dictionary.getString(COSName.DA, "");
    }

    public PDResources getDefaultResources() {
        COSBase dictionaryObject = this.dictionary.getDictionaryObject(COSName.DR);
        if (dictionaryObject instanceof COSDictionary) {
            return new PDResources((COSDictionary) dictionaryObject, this.document.getResourceCache());
        }
        return null;
    }

    public PDDocument getDocument() {
        return this.document;
    }

    public PDField getField(String str) {
        Map<String, PDField> map = this.fieldCache;
        if (map != null) {
            return map.get(str);
        }
        Iterator<PDField> it = getFieldTree().iterator();
        while (it.hasNext()) {
            PDField next = it.next();
            if (next.getFullyQualifiedName().equals(str)) {
                return next;
            }
        }
        return null;
    }

    public Iterator<PDField> getFieldIterator() {
        return new PDFieldTree(this).iterator();
    }

    public PDFieldTree getFieldTree() {
        return new PDFieldTree(this);
    }

    public List<PDField> getFields() {
        PDField fromDictionary;
        COSArray cOSArray = this.dictionary.getCOSArray(COSName.FIELDS);
        if (cOSArray == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < cOSArray.size(); i10++) {
            COSDictionary cOSDictionary = (COSDictionary) cOSArray.getObject(i10);
            if (cOSDictionary != null && (fromDictionary = PDField.fromDictionary(this, cOSDictionary, null)) != null) {
                arrayList.add(fromDictionary);
            }
        }
        return new COSArrayList(arrayList, cOSArray);
    }

    public boolean getNeedAppearances() {
        return this.dictionary.getBoolean(COSName.NEED_APPEARANCES, false);
    }

    public int getQ() {
        COSNumber cOSNumber = (COSNumber) this.dictionary.getDictionaryObject(COSName.Q);
        if (cOSNumber != null) {
            return cOSNumber.intValue();
        }
        return 0;
    }

    public ScriptingHandler getScriptingHandler() {
        return this.scriptingHandler;
    }

    public PDXFAResource getXFA() {
        COSBase dictionaryObject = this.dictionary.getDictionaryObject(COSName.XFA);
        if (dictionaryObject != null) {
            return new PDXFAResource(dictionaryObject);
        }
        return null;
    }

    public boolean hasXFA() {
        return this.dictionary.containsKey(COSName.XFA);
    }

    public void importFDF(FDFDocument fDFDocument) {
        List<FDFField> fields = fDFDocument.getCatalog().getFDF().getFields();
        if (fields != null) {
            for (FDFField fDFField : fields) {
                PDField field = getField(fDFField.getPartialFieldName());
                if (field != null) {
                    field.importFDF(fDFField);
                }
            }
        }
    }

    public boolean isAppendOnly() {
        return this.dictionary.getFlag(COSName.SIG_FLAGS, 2);
    }

    public boolean isCachingFields() {
        if (this.fieldCache != null) {
            return true;
        }
        return false;
    }

    public boolean isSignaturesExist() {
        return this.dictionary.getFlag(COSName.SIG_FLAGS, 1);
    }

    public void refreshAppearances() {
        Iterator<PDField> it = getFieldTree().iterator();
        while (it.hasNext()) {
            PDField next = it.next();
            if (next instanceof PDTerminalField) {
                ((PDTerminalField) next).constructAppearances();
            }
        }
    }

    public void setAppendOnly(boolean z10) {
        this.dictionary.setFlag(COSName.SIG_FLAGS, 2, z10);
    }

    public void setCacheFields(boolean z10) {
        if (z10) {
            this.fieldCache = new HashMap();
            Iterator<PDField> it = getFieldTree().iterator();
            while (it.hasNext()) {
                PDField next = it.next();
                this.fieldCache.put(next.getFullyQualifiedName(), next);
            }
            return;
        }
        this.fieldCache = null;
    }

    public void setDefaultAppearance(String str) {
        this.dictionary.setString(COSName.DA, str);
    }

    public void setDefaultResources(PDResources pDResources) {
        this.dictionary.setItem(COSName.DR, pDResources);
    }

    public void setFields(List<PDField> list) {
        this.dictionary.setItem(COSName.FIELDS, (COSBase) COSArrayList.converterToCOSArray(list));
    }

    public void setNeedAppearances(Boolean bool) {
        this.dictionary.setBoolean(COSName.NEED_APPEARANCES, bool.booleanValue());
    }

    public void setQ(int i10) {
        this.dictionary.setInt(COSName.Q, i10);
    }

    public void setScriptingHandler(ScriptingHandler scriptingHandler) {
        this.scriptingHandler = scriptingHandler;
    }

    public void setSignaturesExist(boolean z10) {
        this.dictionary.setFlag(COSName.SIG_FLAGS, 1, z10);
    }

    public void setXFA(PDXFAResource pDXFAResource) {
        this.dictionary.setItem(COSName.XFA, pDXFAResource);
    }

    public boolean xfaIsDynamic() {
        if (hasXFA() && getFields().isEmpty()) {
            return true;
        }
        return false;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.dictionary;
    }

    public void refreshAppearances(List<PDField> list) {
        for (PDField pDField : list) {
            if (pDField instanceof PDTerminalField) {
                ((PDTerminalField) pDField).constructAppearances();
            }
        }
    }

    public PDAcroForm(PDDocument pDDocument, COSDictionary cOSDictionary) {
        this.document = pDDocument;
        this.dictionary = cOSDictionary;
    }

    public void flatten(List<PDField> list, boolean z10) {
        if (list.isEmpty()) {
            return;
        }
        if (!z10) {
            getNeedAppearances();
        }
        if (xfaIsDynamic()) {
            return;
        }
        if (z10) {
            refreshAppearances(list);
        }
        Map<COSDictionary, Set<COSDictionary>> buildPagesWidgetsMap = buildPagesWidgetsMap(list);
        Iterator<PDPage> it = this.document.getPages().iterator();
        while (it.hasNext()) {
            PDPage next = it.next();
            Set<COSDictionary> set = buildPagesWidgetsMap.get(next.getCOSObject());
            ArrayList arrayList = new ArrayList();
            boolean z11 = false;
            for (PDAnnotation pDAnnotation : next.getAnnotations()) {
                if (set != null && set.contains(pDAnnotation.getCOSObject())) {
                    if (isVisibleAnnotation(pDAnnotation)) {
                        PDPageContentStream pDPageContentStream = new PDPageContentStream(this.document, next, PDPageContentStream.AppendMode.APPEND, true, !z11);
                        try {
                            PDAppearanceStream normalAppearanceStream = pDAnnotation.getNormalAppearanceStream();
                            PDFormXObject pDFormXObject = new PDFormXObject(normalAppearanceStream.getCOSObject());
                            pDPageContentStream.saveGraphicsState();
                            pDPageContentStream.transform(resolveTransformationMatrix(pDAnnotation, normalAppearanceStream));
                            pDPageContentStream.drawForm(pDFormXObject);
                            pDPageContentStream.restoreGraphicsState();
                            pDPageContentStream.close();
                            z11 = true;
                        } catch (Throwable th2) {
                            pDPageContentStream.close();
                            throw th2;
                        }
                    } else {
                        continue;
                    }
                } else {
                    arrayList.add(pDAnnotation);
                }
            }
            next.setAnnotations(arrayList);
        }
        removeFields(list);
        this.dictionary.removeItem(COSName.XFA);
    }
}
