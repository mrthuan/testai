package com.tom_roush.pdfbox.multipdf;

import com.google.android.gms.common.api.Api;
import com.tom_roush.pdfbox.io.MemoryUsageSetting;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.PDPage;
import com.tom_roush.pdfbox.pdmodel.interactive.action.PDAction;
import com.tom_roush.pdfbox.pdmodel.interactive.action.PDActionGoTo;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotation;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink;
import com.tom_roush.pdfbox.pdmodel.interactive.documentnavigation.destination.PDDestination;
import com.tom_roush.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageDestination;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lib.zj.office.fc.hslf.record.SlideAtom;

/* loaded from: classes2.dex */
public class Splitter {
    private PDDocument currentDestinationDocument;
    private int currentPageNumber;
    private List<PDDocument> destinationDocuments;
    private PDDocument sourceDocument;
    private int splitLength = 1;
    private int startPage = SlideAtom.USES_MASTER_SLIDE_ID;
    private int endPage = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    private MemoryUsageSetting memoryUsageSetting = null;

    private void createNewDocumentIfNecessary() {
        if (splitAtPage(this.currentPageNumber) || this.currentDestinationDocument == null) {
            PDDocument createNewDocument = createNewDocument();
            this.currentDestinationDocument = createNewDocument;
            this.destinationDocuments.add(createNewDocument);
        }
    }

    private void processAnnotations(PDPage pDPage) {
        for (PDAnnotation pDAnnotation : pDPage.getAnnotations()) {
            if (pDAnnotation instanceof PDAnnotationLink) {
                PDAnnotationLink pDAnnotationLink = (PDAnnotationLink) pDAnnotation;
                PDDestination destination = pDAnnotationLink.getDestination();
                PDAction action = pDAnnotationLink.getAction();
                if (destination == null && (action instanceof PDActionGoTo)) {
                    destination = ((PDActionGoTo) action).getDestination();
                }
                if (destination instanceof PDPageDestination) {
                    ((PDPageDestination) destination).setPage(null);
                }
            }
            pDAnnotation.setPage(null);
        }
    }

    private void processPages() {
        Iterator<PDPage> it = this.sourceDocument.getPages().iterator();
        while (it.hasNext()) {
            PDPage next = it.next();
            int i10 = this.currentPageNumber;
            if (i10 + 1 >= this.startPage && i10 + 1 <= this.endPage) {
                processPage(next);
                this.currentPageNumber++;
            } else if (i10 <= this.endPage) {
                this.currentPageNumber = i10 + 1;
            } else {
                return;
            }
        }
    }

    public PDDocument createNewDocument() {
        PDDocument pDDocument;
        if (this.memoryUsageSetting == null) {
            pDDocument = new PDDocument();
        } else {
            pDDocument = new PDDocument(this.memoryUsageSetting);
        }
        pDDocument.getDocument().setVersion(getSourceDocument().getVersion());
        pDDocument.setDocumentInformation(getSourceDocument().getDocumentInformation());
        pDDocument.getDocumentCatalog().setViewerPreferences(getSourceDocument().getDocumentCatalog().getViewerPreferences());
        return pDDocument;
    }

    public final PDDocument getDestinationDocument() {
        return this.currentDestinationDocument;
    }

    public MemoryUsageSetting getMemoryUsageSetting() {
        return this.memoryUsageSetting;
    }

    public final PDDocument getSourceDocument() {
        return this.sourceDocument;
    }

    public void processPage(PDPage pDPage) {
        createNewDocumentIfNecessary();
        PDPage importPage = getDestinationDocument().importPage(pDPage);
        importPage.setResources(pDPage.getResources());
        processAnnotations(importPage);
    }

    public void setEndPage(int i10) {
        if (i10 > 0) {
            this.endPage = i10;
            return;
        }
        throw new IllegalArgumentException("End page is smaller than one");
    }

    public void setMemoryUsageSetting(MemoryUsageSetting memoryUsageSetting) {
        this.memoryUsageSetting = memoryUsageSetting;
    }

    public void setSplitAtPage(int i10) {
        if (i10 > 0) {
            this.splitLength = i10;
            return;
        }
        throw new IllegalArgumentException("Number of pages is smaller than one");
    }

    public void setStartPage(int i10) {
        if (i10 > 0) {
            this.startPage = i10;
            return;
        }
        throw new IllegalArgumentException("Start page is smaller than one");
    }

    public List<PDDocument> split(PDDocument pDDocument) {
        this.currentPageNumber = 0;
        this.destinationDocuments = new ArrayList();
        this.sourceDocument = pDDocument;
        processPages();
        return this.destinationDocuments;
    }

    public boolean splitAtPage(int i10) {
        if (((i10 + 1) - Math.max(1, this.startPage)) % this.splitLength == 0) {
            return true;
        }
        return false;
    }
}
