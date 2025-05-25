package com.tom_roush.pdfbox.pdmodel;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSObject;
import com.tom_roush.pdfbox.cos.COSStream;
import com.tom_roush.pdfbox.pdmodel.common.COSArrayList;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import com.tom_roush.pdfbox.pdmodel.common.PDDestinationOrAction;
import com.tom_roush.pdfbox.pdmodel.common.PDMetadata;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabels;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure.PDMarkInfo;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureTreeRoot;
import com.tom_roush.pdfbox.pdmodel.fixup.AcroFormDefaultFixup;
import com.tom_roush.pdfbox.pdmodel.fixup.PDDocumentFixup;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDOutputIntent;
import com.tom_roush.pdfbox.pdmodel.graphics.optionalcontent.PDOptionalContentProperties;
import com.tom_roush.pdfbox.pdmodel.interactive.action.PDActionFactory;
import com.tom_roush.pdfbox.pdmodel.interactive.action.PDDocumentCatalogAdditionalActions;
import com.tom_roush.pdfbox.pdmodel.interactive.action.PDURIDictionary;
import com.tom_roush.pdfbox.pdmodel.interactive.documentnavigation.destination.PDDestination;
import com.tom_roush.pdfbox.pdmodel.interactive.documentnavigation.destination.PDNamedDestination;
import com.tom_roush.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageDestination;
import com.tom_roush.pdfbox.pdmodel.interactive.documentnavigation.outline.PDDocumentOutline;
import com.tom_roush.pdfbox.pdmodel.interactive.form.PDAcroForm;
import com.tom_roush.pdfbox.pdmodel.interactive.pagenavigation.PDThread;
import com.tom_roush.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class PDDocumentCatalog implements COSObjectable {
    private PDDocumentFixup acroFormFixupApplied;
    private PDAcroForm cachedAcroForm;
    private final PDDocument document;
    private final COSDictionary root;

    public PDDocumentCatalog(PDDocument pDDocument) {
        this.document = pDDocument;
        COSDictionary cOSDictionary = new COSDictionary();
        this.root = cOSDictionary;
        cOSDictionary.setItem(COSName.TYPE, (COSBase) COSName.CATALOG);
        pDDocument.getDocument().getTrailer().setItem(COSName.ROOT, (COSBase) cOSDictionary);
    }

    public void addOutputIntent(PDOutputIntent pDOutputIntent) {
        COSDictionary cOSDictionary = this.root;
        COSName cOSName = COSName.OUTPUT_INTENTS;
        COSArray cOSArray = (COSArray) cOSDictionary.getDictionaryObject(cOSName);
        if (cOSArray == null) {
            cOSArray = new COSArray();
            this.root.setItem(cOSName, (COSBase) cOSArray);
        }
        cOSArray.add(pDOutputIntent.getCOSObject());
    }

    public PDPageDestination findNamedDestinationPage(PDNamedDestination pDNamedDestination) {
        PDPageDestination pDPageDestination;
        PDDocumentNameDestinationDictionary dests;
        PDDestinationNameTreeNode dests2;
        PDDocumentNameDictionary names = getNames();
        if (names != null && (dests2 = names.getDests()) != null) {
            pDPageDestination = dests2.getValue(pDNamedDestination.getNamedDestination());
        } else {
            pDPageDestination = null;
        }
        if (pDPageDestination == null && (dests = getDests()) != null) {
            return (PDPageDestination) dests.getDestination(pDNamedDestination.getNamedDestination());
        }
        return pDPageDestination;
    }

    public PDAcroForm getAcroForm() {
        return getAcroForm(new AcroFormDefaultFixup(this.document));
    }

    public PDDocumentCatalogAdditionalActions getActions() {
        COSDictionary cOSDictionary = this.root;
        COSName cOSName = COSName.AA;
        COSDictionary cOSDictionary2 = (COSDictionary) cOSDictionary.getDictionaryObject(cOSName);
        if (cOSDictionary2 == null) {
            cOSDictionary2 = new COSDictionary();
            this.root.setItem(cOSName, (COSBase) cOSDictionary2);
        }
        return new PDDocumentCatalogAdditionalActions(cOSDictionary2);
    }

    public PDDocumentNameDestinationDictionary getDests() {
        COSDictionary cOSDictionary = (COSDictionary) this.root.getDictionaryObject(COSName.DESTS);
        if (cOSDictionary != null) {
            return new PDDocumentNameDestinationDictionary(cOSDictionary);
        }
        return null;
    }

    public PDDocumentOutline getDocumentOutline() {
        COSBase dictionaryObject = this.root.getDictionaryObject(COSName.OUTLINES);
        if (dictionaryObject instanceof COSDictionary) {
            return new PDDocumentOutline((COSDictionary) dictionaryObject);
        }
        return null;
    }

    public String getLanguage() {
        return this.root.getString(COSName.LANG);
    }

    public PDMarkInfo getMarkInfo() {
        COSDictionary cOSDictionary = (COSDictionary) this.root.getDictionaryObject(COSName.MARK_INFO);
        if (cOSDictionary == null) {
            return null;
        }
        return new PDMarkInfo(cOSDictionary);
    }

    public PDMetadata getMetadata() {
        COSBase dictionaryObject = this.root.getDictionaryObject(COSName.METADATA);
        if (dictionaryObject instanceof COSStream) {
            return new PDMetadata((COSStream) dictionaryObject);
        }
        return null;
    }

    public PDDocumentNameDictionary getNames() {
        COSDictionary cOSDictionary = (COSDictionary) this.root.getDictionaryObject(COSName.NAMES);
        if (cOSDictionary == null) {
            return null;
        }
        return new PDDocumentNameDictionary(this, cOSDictionary);
    }

    public PDOptionalContentProperties getOCProperties() {
        COSDictionary cOSDictionary = (COSDictionary) this.root.getDictionaryObject(COSName.OCPROPERTIES);
        if (cOSDictionary == null) {
            return null;
        }
        return new PDOptionalContentProperties(cOSDictionary);
    }

    public PDDestinationOrAction getOpenAction() {
        COSBase dictionaryObject = this.root.getDictionaryObject(COSName.OPEN_ACTION);
        if (dictionaryObject instanceof COSDictionary) {
            return PDActionFactory.createAction((COSDictionary) dictionaryObject);
        }
        if (dictionaryObject instanceof COSArray) {
            return PDDestination.create(dictionaryObject);
        }
        return null;
    }

    public List<PDOutputIntent> getOutputIntents() {
        ArrayList arrayList = new ArrayList();
        COSArray cOSArray = (COSArray) this.root.getDictionaryObject(COSName.OUTPUT_INTENTS);
        if (cOSArray != null) {
            Iterator<COSBase> it = cOSArray.iterator();
            while (it.hasNext()) {
                COSBase next = it.next();
                if (next instanceof COSObject) {
                    next = ((COSObject) next).getObject();
                }
                arrayList.add(new PDOutputIntent((COSDictionary) next));
            }
        }
        return arrayList;
    }

    public PDPageLabels getPageLabels() {
        COSDictionary cOSDictionary = (COSDictionary) this.root.getDictionaryObject(COSName.PAGE_LABELS);
        if (cOSDictionary == null) {
            return null;
        }
        return new PDPageLabels(this.document, cOSDictionary);
    }

    public PageLayout getPageLayout() {
        String nameAsString = this.root.getNameAsString(COSName.PAGE_LAYOUT);
        if (nameAsString != null) {
            return PageLayout.fromString(nameAsString);
        }
        return PageLayout.SINGLE_PAGE;
    }

    public PageMode getPageMode() {
        String nameAsString = this.root.getNameAsString(COSName.PAGE_MODE);
        if (nameAsString != null) {
            try {
                return PageMode.fromString(nameAsString);
            } catch (IllegalArgumentException unused) {
                return PageMode.USE_NONE;
            }
        }
        return PageMode.USE_NONE;
    }

    public PDPageTree getPages() {
        return new PDPageTree((COSDictionary) this.root.getDictionaryObject(COSName.PAGES), this.document);
    }

    public PDStructureTreeRoot getStructureTreeRoot() {
        COSDictionary cOSDictionary = this.root.getCOSDictionary(COSName.STRUCT_TREE_ROOT);
        if (cOSDictionary == null) {
            return null;
        }
        return new PDStructureTreeRoot(cOSDictionary);
    }

    public List<PDThread> getThreads() {
        COSDictionary cOSDictionary = this.root;
        COSName cOSName = COSName.THREADS;
        COSArray cOSArray = (COSArray) cOSDictionary.getDictionaryObject(cOSName);
        if (cOSArray == null) {
            cOSArray = new COSArray();
            this.root.setItem(cOSName, (COSBase) cOSArray);
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < cOSArray.size(); i10++) {
            arrayList.add(new PDThread((COSDictionary) cOSArray.getObject(i10)));
        }
        return new COSArrayList(arrayList, cOSArray);
    }

    public PDURIDictionary getURI() {
        COSDictionary cOSDictionary = (COSDictionary) this.root.getDictionaryObject(COSName.URI);
        if (cOSDictionary == null) {
            return null;
        }
        return new PDURIDictionary(cOSDictionary);
    }

    public String getVersion() {
        return this.root.getNameAsString(COSName.VERSION);
    }

    public PDViewerPreferences getViewerPreferences() {
        COSBase dictionaryObject = this.root.getDictionaryObject(COSName.VIEWER_PREFERENCES);
        if (dictionaryObject instanceof COSDictionary) {
            return new PDViewerPreferences((COSDictionary) dictionaryObject);
        }
        return null;
    }

    public void setAcroForm(PDAcroForm pDAcroForm) {
        this.root.setItem(COSName.ACRO_FORM, pDAcroForm);
        this.cachedAcroForm = null;
    }

    public void setActions(PDDocumentCatalogAdditionalActions pDDocumentCatalogAdditionalActions) {
        this.root.setItem(COSName.AA, pDDocumentCatalogAdditionalActions);
    }

    public void setDocumentOutline(PDDocumentOutline pDDocumentOutline) {
        this.root.setItem(COSName.OUTLINES, pDDocumentOutline);
    }

    public void setLanguage(String str) {
        this.root.setString(COSName.LANG, str);
    }

    public void setMarkInfo(PDMarkInfo pDMarkInfo) {
        this.root.setItem(COSName.MARK_INFO, pDMarkInfo);
    }

    public void setMetadata(PDMetadata pDMetadata) {
        this.root.setItem(COSName.METADATA, pDMetadata);
    }

    public void setNames(PDDocumentNameDictionary pDDocumentNameDictionary) {
        this.root.setItem(COSName.NAMES, pDDocumentNameDictionary);
    }

    public void setOCProperties(PDOptionalContentProperties pDOptionalContentProperties) {
        this.root.setItem(COSName.OCPROPERTIES, pDOptionalContentProperties);
        if (pDOptionalContentProperties != null && this.document.getVersion() < 1.5d) {
            this.document.setVersion(1.5f);
        }
    }

    public void setOpenAction(PDDestinationOrAction pDDestinationOrAction) {
        this.root.setItem(COSName.OPEN_ACTION, pDDestinationOrAction);
    }

    public void setOutputIntents(List<PDOutputIntent> list) {
        COSArray cOSArray = new COSArray();
        for (PDOutputIntent pDOutputIntent : list) {
            cOSArray.add(pDOutputIntent.getCOSObject());
        }
        this.root.setItem(COSName.OUTPUT_INTENTS, (COSBase) cOSArray);
    }

    public void setPageLabels(PDPageLabels pDPageLabels) {
        this.root.setItem(COSName.PAGE_LABELS, pDPageLabels);
    }

    public void setPageLayout(PageLayout pageLayout) {
        this.root.setName(COSName.PAGE_LAYOUT, pageLayout.stringValue());
    }

    public void setPageMode(PageMode pageMode) {
        this.root.setName(COSName.PAGE_MODE, pageMode.stringValue());
    }

    public void setStructureTreeRoot(PDStructureTreeRoot pDStructureTreeRoot) {
        this.root.setItem(COSName.STRUCT_TREE_ROOT, pDStructureTreeRoot);
    }

    public void setThreads(List<PDThread> list) {
        this.root.setItem(COSName.THREADS, (COSBase) COSArrayList.converterToCOSArray(list));
    }

    public void setURI(PDURIDictionary pDURIDictionary) {
        this.root.setItem(COSName.URI, pDURIDictionary);
    }

    public void setVersion(String str) {
        this.root.setName(COSName.VERSION, str);
    }

    public void setViewerPreferences(PDViewerPreferences pDViewerPreferences) {
        this.root.setItem(COSName.VIEWER_PREFERENCES, pDViewerPreferences);
    }

    public PDAcroForm getAcroForm(PDDocumentFixup pDDocumentFixup) {
        if (pDDocumentFixup != null && pDDocumentFixup != this.acroFormFixupApplied) {
            pDDocumentFixup.apply();
            this.cachedAcroForm = null;
            this.acroFormFixupApplied = pDDocumentFixup;
        }
        if (this.cachedAcroForm == null) {
            COSDictionary cOSDictionary = (COSDictionary) this.root.getDictionaryObject(COSName.ACRO_FORM);
            this.cachedAcroForm = cOSDictionary != null ? new PDAcroForm(this.document, cOSDictionary) : null;
        }
        return this.cachedAcroForm;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.root;
    }

    public PDDocumentCatalog(PDDocument pDDocument, COSDictionary cOSDictionary) {
        this.document = pDDocument;
        this.root = cOSDictionary;
    }
}
