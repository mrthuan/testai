package com.tom_roush.pdfbox.multipdf;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSObject;
import com.tom_roush.pdfbox.io.IOUtils;
import com.tom_roush.pdfbox.io.MemoryUsageSetting;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.PDDocumentCatalog;
import com.tom_roush.pdfbox.pdmodel.PDDocumentInformation;
import com.tom_roush.pdfbox.pdmodel.PDPage;
import com.tom_roush.pdfbox.pdmodel.PDResources;
import com.tom_roush.pdfbox.pdmodel.PDStructureElementNameTreeNode;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import com.tom_roush.pdfbox.pdmodel.common.PDMetadata;
import com.tom_roush.pdfbox.pdmodel.common.PDNameTreeNode;
import com.tom_roush.pdfbox.pdmodel.common.PDNumberTreeNode;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure.PDMarkInfo;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure.PDParentTreeValue;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureElement;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureTreeRoot;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDOutputIntent;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotation;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationWidget;
import com.tom_roush.pdfbox.pdmodel.interactive.form.PDAcroForm;
import com.tom_roush.pdfbox.pdmodel.interactive.form.PDField;
import com.tom_roush.pdfbox.pdmodel.interactive.form.PDNonTerminalField;
import com.tom_roush.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
public class PDFMergerUtility {
    private String destinationFileName;
    private OutputStream destinationStream;
    private boolean ignoreAcroFormErrors = false;
    private PDDocumentInformation destinationDocumentInformation = null;
    private PDMetadata destinationMetadata = null;
    private DocumentMergeMode documentMergeMode = DocumentMergeMode.PDFBOX_LEGACY_MODE;
    private AcroFormMergeMode acroFormMergeMode = AcroFormMergeMode.PDFBOX_LEGACY_MODE;
    private int nextFieldNum = 1;
    private final List<Object> sources = new ArrayList();

    /* loaded from: classes2.dex */
    public enum AcroFormMergeMode {
        JOIN_FORM_FIELDS_MODE,
        PDFBOX_LEGACY_MODE
    }

    /* loaded from: classes2.dex */
    public enum DocumentMergeMode {
        OPTIMIZE_RESOURCES_MODE,
        PDFBOX_LEGACY_MODE
    }

    private void acroFormJoinFieldsMode(PDFCloneUtility pDFCloneUtility, PDAcroForm pDAcroForm, PDAcroForm pDAcroForm2) {
        COSArray cOSArray;
        List<PDField> fields = pDAcroForm2.getFields();
        if (fields != null && !fields.isEmpty()) {
            COSBase item = pDAcroForm.getCOSObject().getItem(COSName.FIELDS);
            if (item instanceof COSArray) {
                cOSArray = (COSArray) item;
            } else {
                cOSArray = new COSArray();
            }
            Iterator<PDField> it = pDAcroForm2.getFieldTree().iterator();
            while (it.hasNext()) {
                PDField next = it.next();
                PDField field = pDAcroForm.getField(next.getFullyQualifiedName());
                if (field == null) {
                    cOSArray.add((COSBase) ((COSDictionary) pDFCloneUtility.cloneForNewDocument(next.getCOSObject())));
                } else {
                    mergeFields(pDFCloneUtility, field, next);
                }
            }
            pDAcroForm.getCOSObject().setItem(COSName.FIELDS, (COSBase) cOSArray);
        }
    }

    private void acroFormLegacyMode(PDFCloneUtility pDFCloneUtility, PDAcroForm pDAcroForm, PDAcroForm pDAcroForm2) {
        COSArray cOSArray;
        List<PDField> fields = pDAcroForm2.getFields();
        if (fields != null && !fields.isEmpty()) {
            Iterator<PDField> it = pDAcroForm.getFieldTree().iterator();
            while (it.hasNext()) {
                String partialName = it.next().getPartialName();
                if (partialName.startsWith("dummyFieldName")) {
                    this.nextFieldNum = Math.max(this.nextFieldNum, Integer.parseInt(partialName.substring(14)) + 1);
                }
            }
            COSBase item = pDAcroForm.getCOSObject().getItem(COSName.FIELDS);
            if (item instanceof COSArray) {
                cOSArray = (COSArray) item;
            } else {
                cOSArray = new COSArray();
            }
            for (PDField pDField : pDAcroForm2.getFields()) {
                COSDictionary cOSDictionary = (COSDictionary) pDFCloneUtility.cloneForNewDocument(pDField.getCOSObject());
                if (pDAcroForm.getField(pDField.getFullyQualifiedName()) != null) {
                    COSName cOSName = COSName.T;
                    StringBuilder sb2 = new StringBuilder("dummyFieldName");
                    int i10 = this.nextFieldNum;
                    this.nextFieldNum = i10 + 1;
                    sb2.append(i10);
                    cOSDictionary.setString(cOSName, sb2.toString());
                }
                cOSArray.add((COSBase) cOSDictionary);
            }
            pDAcroForm.getCOSObject().setItem(COSName.FIELDS, (COSBase) cOSArray);
        }
    }

    private void cleanupFieldCOSDictionary(COSDictionary cOSDictionary) {
        cOSDictionary.removeItem(COSName.F);
        cOSDictionary.removeItem(COSName.MK);
        cOSDictionary.removeItem(COSName.P);
        cOSDictionary.removeItem(COSName.RECT);
        cOSDictionary.removeItem(COSName.SUBTYPE);
        cOSDictionary.removeItem(COSName.TYPE);
    }

    private void cleanupWidgetCOSDictionary(COSDictionary cOSDictionary, boolean z10) {
        if (z10) {
            cOSDictionary.removeItem(COSName.DA);
        }
        cOSDictionary.removeItem(COSName.FT);
        cOSDictionary.removeItem(COSName.T);
        cOSDictionary.removeItem(COSName.V);
    }

    public static Map<String, PDStructureElement> getIDTreeAsMap(PDNameTreeNode<PDStructureElement> pDNameTreeNode) {
        LinkedHashMap linkedHashMap;
        Map<String, PDStructureElement> names = pDNameTreeNode.getNames();
        if (names == null) {
            linkedHashMap = new LinkedHashMap();
        } else {
            linkedHashMap = new LinkedHashMap(names);
        }
        List<PDNameTreeNode<PDStructureElement>> kids = pDNameTreeNode.getKids();
        if (kids != null) {
            for (PDNameTreeNode<PDStructureElement> pDNameTreeNode2 : kids) {
                linkedHashMap.putAll(getIDTreeAsMap(pDNameTreeNode2));
            }
        }
        return linkedHashMap;
    }

    public static Map<Integer, COSObjectable> getNumberTreeAsMap(PDNumberTreeNode pDNumberTreeNode) {
        LinkedHashMap linkedHashMap;
        Map<Integer, COSObjectable> numbers = pDNumberTreeNode.getNumbers();
        if (numbers == null) {
            linkedHashMap = new LinkedHashMap();
        } else {
            linkedHashMap = new LinkedHashMap(numbers);
        }
        List<PDNumberTreeNode> kids = pDNumberTreeNode.getKids();
        if (kids != null) {
            for (PDNumberTreeNode pDNumberTreeNode2 : kids) {
                linkedHashMap.putAll(getNumberTreeAsMap(pDNumberTreeNode2));
            }
        }
        return linkedHashMap;
    }

    private boolean hasOnlyDocumentsOrParts(COSArray cOSArray) {
        for (int i10 = 0; i10 < cOSArray.size(); i10++) {
            COSBase object = cOSArray.getObject(i10);
            if (!(object instanceof COSDictionary)) {
                return false;
            }
            COSDictionary cOSDictionary = (COSDictionary) object;
            COSName cOSName = COSName.DOCUMENT;
            COSName cOSName2 = COSName.S;
            if (!cOSName.equals(cOSDictionary.getCOSName(cOSName2)) && !COSName.PART.equals(cOSDictionary.getCOSName(cOSName2))) {
                return false;
            }
        }
        return true;
    }

    private boolean isDynamicXfa(PDAcroForm pDAcroForm) {
        if (pDAcroForm != null && pDAcroForm.xfaIsDynamic()) {
            return true;
        }
        return false;
    }

    private void legacyMergeDocuments(MemoryUsageSetting memoryUsageSetting) {
        PDDocument pDDocument;
        MemoryUsageSetting memoryUsageSetting2;
        PDDocument load;
        if (this.sources.size() > 0) {
            ArrayList arrayList = new ArrayList(this.sources.size());
            try {
                if (memoryUsageSetting != null) {
                    memoryUsageSetting2 = memoryUsageSetting.getPartitionedCopy(this.sources.size() + 1);
                } else {
                    memoryUsageSetting2 = MemoryUsageSetting.setupMainMemoryOnly();
                }
                pDDocument = new PDDocument(memoryUsageSetting2);
                try {
                    for (Object obj : this.sources) {
                        if (obj instanceof File) {
                            load = PDDocument.load((File) obj, memoryUsageSetting2);
                        } else {
                            load = PDDocument.load((InputStream) obj, memoryUsageSetting2);
                        }
                        arrayList.add(load);
                        appendDocument(pDDocument, load);
                    }
                    PDDocumentInformation pDDocumentInformation = this.destinationDocumentInformation;
                    if (pDDocumentInformation != null) {
                        pDDocument.setDocumentInformation(pDDocumentInformation);
                    }
                    if (this.destinationMetadata != null) {
                        pDDocument.getDocumentCatalog().setMetadata(this.destinationMetadata);
                    }
                    OutputStream outputStream = this.destinationStream;
                    if (outputStream == null) {
                        pDDocument.save(this.destinationFileName);
                    } else {
                        pDDocument.save(outputStream);
                    }
                    IOUtils.closeAndLogException(pDDocument, "PDDocument", null);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        IOUtils.closeAndLogException((PDDocument) it.next(), "PDDocument", null);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (pDDocument != null) {
                        IOUtils.closeAndLogException(pDDocument, "PDDocument", null);
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        IOUtils.closeAndLogException((PDDocument) it2.next(), "PDDocument", null);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                pDDocument = null;
            }
        }
    }

    private void mergeAcroForm(PDFCloneUtility pDFCloneUtility, PDDocumentCatalog pDDocumentCatalog, PDDocumentCatalog pDDocumentCatalog2) {
        try {
            PDAcroForm acroForm = pDDocumentCatalog.getAcroForm();
            PDAcroForm acroForm2 = pDDocumentCatalog2.getAcroForm();
            if (acroForm == null && acroForm2 != null) {
                pDDocumentCatalog.getCOSObject().setItem(COSName.ACRO_FORM, pDFCloneUtility.cloneForNewDocument(acroForm2.getCOSObject()));
            } else if (acroForm2 != null) {
                AcroFormMergeMode acroFormMergeMode = this.acroFormMergeMode;
                if (acroFormMergeMode == AcroFormMergeMode.PDFBOX_LEGACY_MODE) {
                    acroFormLegacyMode(pDFCloneUtility, acroForm, acroForm2);
                } else if (acroFormMergeMode == AcroFormMergeMode.JOIN_FORM_FIELDS_MODE) {
                    acroFormJoinFieldsMode(pDFCloneUtility, acroForm, acroForm2);
                }
            }
        } catch (IOException e10) {
            if (this.ignoreAcroFormErrors) {
                return;
            }
            throw new IOException(e10);
        }
    }

    private void mergeFields(PDFCloneUtility pDFCloneUtility, PDField pDField, PDField pDField2) {
        if ((pDField instanceof PDNonTerminalField) && (pDField2 instanceof PDNonTerminalField)) {
            pDField2.getFullyQualifiedName();
        } else if (pDField.getFieldType() == "Tx" && pDField.getFieldType() == "Tx") {
            COSDictionary cOSObject = pDField.getCOSObject();
            COSName cOSName = COSName.KIDS;
            if (cOSObject.containsKey(cOSName)) {
                COSArray cOSArray = pDField.getCOSObject().getCOSArray(cOSName);
                for (PDAnnotationWidget pDAnnotationWidget : pDField2.getWidgets()) {
                    try {
                        cOSArray.add(pDFCloneUtility.cloneForNewDocument(pDAnnotationWidget.getCOSObject()));
                    } catch (IOException unused) {
                        pDField2.getFullyQualifiedName();
                    }
                }
                return;
            }
            COSArray cOSArray2 = new COSArray();
            try {
                COSDictionary cOSDictionary = (COSDictionary) pDFCloneUtility.cloneForNewDocument(pDField.getWidgets().get(0));
                cleanupWidgetCOSDictionary(cOSDictionary, true);
                cOSDictionary.setItem(COSName.PARENT, pDField);
                cOSArray2.add((COSBase) cOSDictionary);
                for (PDAnnotationWidget pDAnnotationWidget2 : pDField2.getWidgets()) {
                    try {
                        COSDictionary cOSDictionary2 = (COSDictionary) pDFCloneUtility.cloneForNewDocument(pDAnnotationWidget2.getCOSObject());
                        cleanupWidgetCOSDictionary(cOSDictionary2, false);
                        cOSDictionary2.setItem(COSName.PARENT, pDField);
                        cOSArray2.add((COSBase) cOSDictionary2);
                    } catch (IOException unused2) {
                        pDField2.getFullyQualifiedName();
                    }
                }
                pDField.getCOSObject().setItem(COSName.KIDS, (COSBase) cOSArray2);
                cleanupFieldCOSDictionary(pDField.getCOSObject());
            } catch (IOException unused3) {
                pDField.getFullyQualifiedName();
            }
        } else {
            pDField2.getFullyQualifiedName();
            pDField.getFullyQualifiedName();
        }
    }

    private void mergeIDTree(PDFCloneUtility pDFCloneUtility, PDStructureTreeRoot pDStructureTreeRoot, PDStructureTreeRoot pDStructureTreeRoot2) {
        PDNameTreeNode<PDStructureElement> iDTree = pDStructureTreeRoot.getIDTree();
        if (iDTree == null) {
            return;
        }
        PDNameTreeNode<PDStructureElement> iDTree2 = pDStructureTreeRoot2.getIDTree();
        if (iDTree2 == null) {
            iDTree2 = new PDStructureElementNameTreeNode();
        }
        Map<String, PDStructureElement> iDTreeAsMap = getIDTreeAsMap(iDTree);
        Map<String, PDStructureElement> iDTreeAsMap2 = getIDTreeAsMap(iDTree2);
        for (Map.Entry<String, PDStructureElement> entry : iDTreeAsMap.entrySet()) {
            if (iDTreeAsMap2.containsKey(entry.getKey())) {
                entry.getKey();
            } else {
                iDTreeAsMap2.put(entry.getKey(), new PDStructureElement((COSDictionary) pDFCloneUtility.cloneForNewDocument(entry.getValue().getCOSObject())));
            }
        }
        PDStructureElementNameTreeNode pDStructureElementNameTreeNode = new PDStructureElementNameTreeNode();
        pDStructureElementNameTreeNode.setNames(iDTreeAsMap2);
        pDStructureTreeRoot2.setIDTree(pDStructureElementNameTreeNode);
    }

    private void mergeInto(COSDictionary cOSDictionary, COSDictionary cOSDictionary2, Set<COSName> set) {
        for (Map.Entry<COSName, COSBase> entry : cOSDictionary.entrySet()) {
            if (!set.contains(entry.getKey()) && !cOSDictionary2.containsKey(entry.getKey())) {
                cOSDictionary2.setItem(entry.getKey(), entry.getValue());
            }
        }
    }

    private void mergeKEntries(PDFCloneUtility pDFCloneUtility, PDStructureTreeRoot pDStructureTreeRoot, PDStructureTreeRoot pDStructureTreeRoot2) {
        COSArray cOSArray;
        COSArray cOSArray2 = new COSArray();
        if (pDStructureTreeRoot2.getK() != null) {
            COSBase k10 = pDStructureTreeRoot2.getK();
            if (k10 instanceof COSArray) {
                cOSArray2.addAll((COSArray) k10);
            } else if (k10 instanceof COSDictionary) {
                cOSArray2.add(k10);
            }
        }
        COSArray cOSArray3 = new COSArray();
        if (pDStructureTreeRoot.getK() != null) {
            COSBase cloneForNewDocument = pDFCloneUtility.cloneForNewDocument(pDStructureTreeRoot.getK());
            if (cloneForNewDocument instanceof COSArray) {
                cOSArray3.addAll((COSArray) cloneForNewDocument);
            } else if (cloneForNewDocument instanceof COSDictionary) {
                cOSArray3.add(cloneForNewDocument);
            }
        }
        if (cOSArray3.size() == 0) {
            return;
        }
        if (cOSArray2.size() == 1 && (cOSArray2.getObject(0) instanceof COSDictionary)) {
            COSDictionary cOSDictionary = (COSDictionary) cOSArray2.getObject(0);
            if (COSName.DOCUMENT.equals(cOSDictionary.getCOSName(COSName.S)) && (cOSArray = cOSDictionary.getCOSArray(COSName.K)) != null && hasOnlyDocumentsOrParts(cOSArray)) {
                cOSArray.addAll(cOSArray3);
                updateParentEntry(cOSArray, cOSDictionary, COSName.PART);
                return;
            }
        }
        COSName cOSName = null;
        if (cOSArray2.size() == 0) {
            updateParentEntry(cOSArray3, pDStructureTreeRoot2.getCOSObject(), null);
            pDStructureTreeRoot2.setK(cOSArray3);
            return;
        }
        cOSArray2.addAll(cOSArray3);
        COSDictionary cOSDictionary2 = new COSDictionary();
        if (hasOnlyDocumentsOrParts(cOSArray2)) {
            cOSName = COSName.PART;
        }
        updateParentEntry(cOSArray2, cOSDictionary2, cOSName);
        cOSDictionary2.setItem(COSName.K, (COSBase) cOSArray2);
        cOSDictionary2.setItem(COSName.P, pDStructureTreeRoot2);
        cOSDictionary2.setItem(COSName.S, COSName.DOCUMENT);
        pDStructureTreeRoot2.setK(cOSDictionary2);
    }

    private void mergeLanguage(PDDocumentCatalog pDDocumentCatalog, PDDocumentCatalog pDDocumentCatalog2) {
        String language;
        if (pDDocumentCatalog.getLanguage() == null && (language = pDDocumentCatalog2.getLanguage()) != null) {
            pDDocumentCatalog.setLanguage(language);
        }
    }

    private void mergeMarkInfo(PDDocumentCatalog pDDocumentCatalog, PDDocumentCatalog pDDocumentCatalog2) {
        boolean z10;
        PDMarkInfo markInfo = pDDocumentCatalog.getMarkInfo();
        PDMarkInfo markInfo2 = pDDocumentCatalog2.getMarkInfo();
        if (markInfo == null) {
            markInfo = new PDMarkInfo();
        }
        if (markInfo2 == null) {
            markInfo2 = new PDMarkInfo();
        }
        boolean z11 = true;
        markInfo.setMarked(true);
        if (!markInfo2.isSuspect() && !markInfo.isSuspect()) {
            z10 = false;
        } else {
            z10 = true;
        }
        markInfo.setSuspect(z10);
        if (!markInfo2.usesUserProperties() && !markInfo.usesUserProperties()) {
            z11 = false;
        }
        markInfo.setSuspect(z11);
        pDDocumentCatalog.setMarkInfo(markInfo);
    }

    private void mergeOutputIntents(PDFCloneUtility pDFCloneUtility, PDDocumentCatalog pDDocumentCatalog, PDDocumentCatalog pDDocumentCatalog2) {
        boolean z10;
        List<PDOutputIntent> outputIntents = pDDocumentCatalog.getOutputIntents();
        List<PDOutputIntent> outputIntents2 = pDDocumentCatalog2.getOutputIntents();
        for (PDOutputIntent pDOutputIntent : outputIntents) {
            String outputConditionIdentifier = pDOutputIntent.getOutputConditionIdentifier();
            if (outputConditionIdentifier != null && !"Custom".equals(outputConditionIdentifier)) {
                Iterator<PDOutputIntent> it = outputIntents2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().getOutputConditionIdentifier().equals(outputConditionIdentifier)) {
                            z10 = true;
                            break;
                        }
                    } else {
                        z10 = false;
                        break;
                    }
                }
                if (z10) {
                }
            }
            pDDocumentCatalog2.addOutputIntent(new PDOutputIntent((COSDictionary) pDFCloneUtility.cloneForNewDocument(pDOutputIntent)));
            outputIntents2.add(pDOutputIntent);
        }
    }

    private void mergeRoleMap(PDStructureTreeRoot pDStructureTreeRoot, PDStructureTreeRoot pDStructureTreeRoot2) {
        COSDictionary cOSObject = pDStructureTreeRoot.getCOSObject();
        COSName cOSName = COSName.ROLE_MAP;
        COSDictionary cOSDictionary = cOSObject.getCOSDictionary(cOSName);
        COSDictionary cOSDictionary2 = pDStructureTreeRoot2.getCOSObject().getCOSDictionary(cOSName);
        if (cOSDictionary == null) {
            return;
        }
        if (cOSDictionary2 == null) {
            pDStructureTreeRoot2.getCOSObject().setItem(cOSName, (COSBase) cOSDictionary);
            return;
        }
        for (Map.Entry<COSName, COSBase> entry : cOSDictionary.entrySet()) {
            COSBase dictionaryObject = cOSDictionary2.getDictionaryObject(entry.getKey());
            if (dictionaryObject == null || !dictionaryObject.equals(entry.getValue())) {
                if (cOSDictionary2.containsKey(entry.getKey())) {
                    Objects.toString(entry.getKey());
                } else {
                    cOSDictionary2.setItem(entry.getKey(), entry.getValue());
                }
            }
        }
    }

    private void mergeViewerPreferences(PDDocumentCatalog pDDocumentCatalog, PDDocumentCatalog pDDocumentCatalog2) {
        PDViewerPreferences viewerPreferences = pDDocumentCatalog2.getViewerPreferences();
        if (viewerPreferences == null) {
            return;
        }
        PDViewerPreferences viewerPreferences2 = pDDocumentCatalog.getViewerPreferences();
        if (viewerPreferences2 == null) {
            viewerPreferences2 = new PDViewerPreferences(new COSDictionary());
            pDDocumentCatalog.setViewerPreferences(viewerPreferences2);
        }
        mergeInto(viewerPreferences.getCOSObject(), viewerPreferences2.getCOSObject(), Collections.emptySet());
        if (viewerPreferences.hideToolbar() || viewerPreferences2.hideToolbar()) {
            viewerPreferences2.setHideToolbar(true);
        }
        if (viewerPreferences.hideMenubar() || viewerPreferences2.hideMenubar()) {
            viewerPreferences2.setHideMenubar(true);
        }
        if (viewerPreferences.hideWindowUI() || viewerPreferences2.hideWindowUI()) {
            viewerPreferences2.setHideWindowUI(true);
        }
        if (viewerPreferences.fitWindow() || viewerPreferences2.fitWindow()) {
            viewerPreferences2.setFitWindow(true);
        }
        if (viewerPreferences.centerWindow() || viewerPreferences2.centerWindow()) {
            viewerPreferences2.setCenterWindow(true);
        }
        if (viewerPreferences.displayDocTitle() || viewerPreferences2.displayDocTitle()) {
            viewerPreferences2.setDisplayDocTitle(true);
        }
    }

    private void optimizedMergeDocuments(MemoryUsageSetting memoryUsageSetting) {
        PDDocument pDDocument;
        PDDocument load;
        PDDocument pDDocument2 = null;
        try {
            pDDocument = new PDDocument(memoryUsageSetting);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            PDFCloneUtility pDFCloneUtility = new PDFCloneUtility(pDDocument);
            for (Object obj : this.sources) {
                try {
                    if (obj instanceof File) {
                        load = PDDocument.load((File) obj, memoryUsageSetting);
                    } else {
                        load = PDDocument.load((InputStream) obj, memoryUsageSetting);
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
                try {
                    Iterator<PDPage> it = load.getPages().iterator();
                    while (it.hasNext()) {
                        PDPage next = it.next();
                        PDPage pDPage = new PDPage((COSDictionary) pDFCloneUtility.cloneForNewDocument(next.getCOSObject()));
                        pDPage.setCropBox(next.getCropBox());
                        pDPage.setMediaBox(next.getMediaBox());
                        pDPage.setRotation(next.getRotation());
                        PDResources resources = next.getResources();
                        if (resources != null) {
                            pDPage.setResources(new PDResources((COSDictionary) pDFCloneUtility.cloneForNewDocument(resources)));
                        } else {
                            pDPage.setResources(new PDResources());
                        }
                        pDDocument.addPage(pDPage);
                    }
                    IOUtils.closeQuietly(load);
                } catch (Throwable th4) {
                    th = th4;
                    pDDocument2 = load;
                    IOUtils.closeQuietly(pDDocument2);
                    throw th;
                }
            }
            OutputStream outputStream = this.destinationStream;
            if (outputStream == null) {
                pDDocument.save(this.destinationFileName);
            } else {
                pDDocument.save(outputStream);
            }
            IOUtils.closeQuietly(pDDocument);
        } catch (Throwable th5) {
            th = th5;
            pDDocument2 = pDDocument;
            IOUtils.closeQuietly(pDDocument2);
            throw th;
        }
    }

    private void updatePageReferences(PDFCloneUtility pDFCloneUtility, Map<Integer, COSObjectable> map, Map<COSDictionary, COSDictionary> map2) {
        for (COSObjectable cOSObjectable : map.values()) {
            if (cOSObjectable != null) {
                COSBase cOSObject = ((PDParentTreeValue) cOSObjectable).getCOSObject();
                if (cOSObject instanceof COSArray) {
                    updatePageReferences(pDFCloneUtility, (COSArray) cOSObject, map2);
                } else {
                    updatePageReferences(pDFCloneUtility, (COSDictionary) cOSObject, map2);
                }
            }
        }
    }

    private void updateParentEntry(COSArray cOSArray, COSDictionary cOSDictionary, COSName cOSName) {
        for (int i10 = 0; i10 < cOSArray.size(); i10++) {
            COSBase object = cOSArray.getObject(i10);
            if (object instanceof COSDictionary) {
                COSDictionary cOSDictionary2 = (COSDictionary) object;
                cOSDictionary2.setItem(COSName.P, (COSBase) cOSDictionary);
                if (cOSName != null) {
                    cOSDictionary2.setItem(COSName.S, (COSBase) cOSName);
                }
            }
        }
    }

    private void updateStructParentEntries(PDPage pDPage, int i10) {
        if (pDPage.getStructParents() >= 0) {
            pDPage.setStructParents(pDPage.getStructParents() + i10);
        }
        List<PDAnnotation> annotations = pDPage.getAnnotations();
        ArrayList arrayList = new ArrayList(annotations.size());
        for (PDAnnotation pDAnnotation : annotations) {
            if (pDAnnotation.getStructParent() >= 0) {
                pDAnnotation.setStructParent(pDAnnotation.getStructParent() + i10);
            }
            arrayList.add(pDAnnotation);
        }
        pDPage.setAnnotations(arrayList);
    }

    public void addSource(String str) {
        addSource(new File(str));
    }

    public void addSources(List<InputStream> list) {
        this.sources.addAll(list);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:194:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void appendDocument(com.tom_roush.pdfbox.pdmodel.PDDocument r24, com.tom_roush.pdfbox.pdmodel.PDDocument r25) {
        /*
            Method dump skipped, instructions count: 1165
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tom_roush.pdfbox.multipdf.PDFMergerUtility.appendDocument(com.tom_roush.pdfbox.pdmodel.PDDocument, com.tom_roush.pdfbox.pdmodel.PDDocument):void");
    }

    public AcroFormMergeMode getAcroFormMergeMode() {
        return this.acroFormMergeMode;
    }

    public PDDocumentInformation getDestinationDocumentInformation() {
        return this.destinationDocumentInformation;
    }

    public String getDestinationFileName() {
        return this.destinationFileName;
    }

    public PDMetadata getDestinationMetadata() {
        return this.destinationMetadata;
    }

    public OutputStream getDestinationStream() {
        return this.destinationStream;
    }

    public DocumentMergeMode getDocumentMergeMode() {
        return this.documentMergeMode;
    }

    public boolean isIgnoreAcroFormErrors() {
        return this.ignoreAcroFormErrors;
    }

    @Deprecated
    public void mergeDocuments() {
        mergeDocuments(MemoryUsageSetting.setupMainMemoryOnly());
    }

    public void setAcroFormMergeMode(AcroFormMergeMode acroFormMergeMode) {
        this.acroFormMergeMode = acroFormMergeMode;
    }

    public void setDestinationDocumentInformation(PDDocumentInformation pDDocumentInformation) {
        this.destinationDocumentInformation = pDDocumentInformation;
    }

    public void setDestinationFileName(String str) {
        this.destinationFileName = str;
    }

    public void setDestinationMetadata(PDMetadata pDMetadata) {
        this.destinationMetadata = pDMetadata;
    }

    public void setDestinationStream(OutputStream outputStream) {
        this.destinationStream = outputStream;
    }

    public void setDocumentMergeMode(DocumentMergeMode documentMergeMode) {
        this.documentMergeMode = documentMergeMode;
    }

    public void setIgnoreAcroFormErrors(boolean z10) {
        this.ignoreAcroFormErrors = z10;
    }

    public void addSource(File file) {
        this.sources.add(file);
    }

    public void mergeDocuments(MemoryUsageSetting memoryUsageSetting) {
        DocumentMergeMode documentMergeMode = this.documentMergeMode;
        if (documentMergeMode == DocumentMergeMode.PDFBOX_LEGACY_MODE) {
            legacyMergeDocuments(memoryUsageSetting);
        } else if (documentMergeMode == DocumentMergeMode.OPTIMIZE_RESOURCES_MODE) {
            optimizedMergeDocuments(memoryUsageSetting);
        }
    }

    public void addSource(InputStream inputStream) {
        this.sources.add(inputStream);
    }

    private void updatePageReferences(PDFCloneUtility pDFCloneUtility, COSDictionary cOSDictionary, Map<COSDictionary, COSDictionary> map) {
        COSName cOSName = COSName.PG;
        COSDictionary cOSDictionary2 = cOSDictionary.getCOSDictionary(cOSName);
        if (map.containsKey(cOSDictionary2)) {
            cOSDictionary.setItem(cOSName, (COSBase) map.get(cOSDictionary2));
        }
        COSName cOSName2 = COSName.OBJ;
        COSBase dictionaryObject = cOSDictionary.getDictionaryObject(cOSName2);
        if (dictionaryObject instanceof COSDictionary) {
            COSDictionary cOSDictionary3 = (COSDictionary) dictionaryObject;
            if (map.containsKey(cOSDictionary3)) {
                cOSDictionary.setItem(cOSName2, (COSBase) map.get(cOSDictionary3));
            } else {
                COSBase item = cOSDictionary.getItem(cOSName2);
                if (item instanceof COSObject) {
                    Objects.toString(item);
                    cOSDictionary3.getNameAsString(COSName.TYPE);
                    cOSDictionary3.getNameAsString(COSName.SUBTYPE);
                    cOSDictionary3.getNameAsString(COSName.T);
                } else {
                    cOSDictionary3.getNameAsString(COSName.TYPE);
                    cOSDictionary3.getNameAsString(COSName.SUBTYPE);
                    cOSDictionary3.getNameAsString(COSName.T);
                }
                cOSDictionary.setItem(cOSName2, pDFCloneUtility.cloneForNewDocument(dictionaryObject));
            }
        }
        COSBase dictionaryObject2 = cOSDictionary.getDictionaryObject(COSName.K);
        if (dictionaryObject2 instanceof COSArray) {
            updatePageReferences(pDFCloneUtility, (COSArray) dictionaryObject2, map);
        } else if (dictionaryObject2 instanceof COSDictionary) {
            updatePageReferences(pDFCloneUtility, (COSDictionary) dictionaryObject2, map);
        }
    }

    private void updatePageReferences(PDFCloneUtility pDFCloneUtility, COSArray cOSArray, Map<COSDictionary, COSDictionary> map) {
        for (int i10 = 0; i10 < cOSArray.size(); i10++) {
            COSBase object = cOSArray.getObject(i10);
            if (object instanceof COSArray) {
                updatePageReferences(pDFCloneUtility, (COSArray) object, map);
            } else if (object instanceof COSDictionary) {
                updatePageReferences(pDFCloneUtility, (COSDictionary) object, map);
            }
        }
    }
}
