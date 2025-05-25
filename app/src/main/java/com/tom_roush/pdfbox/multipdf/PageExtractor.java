package com.tom_roush.pdfbox.multipdf;

import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.PDPage;

/* loaded from: classes2.dex */
public class PageExtractor {
    private int endPage;
    private final PDDocument sourceDocument;
    private int startPage;

    public PageExtractor(PDDocument pDDocument) {
        this.startPage = 1;
        this.sourceDocument = pDDocument;
        this.endPage = pDDocument.getNumberOfPages();
    }

    public PDDocument extract() {
        PDDocument pDDocument = new PDDocument();
        pDDocument.setDocumentInformation(this.sourceDocument.getDocumentInformation());
        pDDocument.getDocumentCatalog().setViewerPreferences(this.sourceDocument.getDocumentCatalog().getViewerPreferences());
        for (int i10 = this.startPage; i10 <= this.endPage; i10++) {
            PDPage page = this.sourceDocument.getPage(i10 - 1);
            PDPage importPage = pDDocument.importPage(page);
            importPage.setCropBox(page.getCropBox());
            importPage.setMediaBox(page.getMediaBox());
            importPage.setResources(page.getResources());
            importPage.setRotation(page.getRotation());
        }
        return pDDocument;
    }

    public int getEndPage() {
        return this.endPage;
    }

    public int getStartPage() {
        return this.startPage;
    }

    public void setEndPage(int i10) {
        this.endPage = i10;
    }

    public void setStartPage(int i10) {
        this.startPage = i10;
    }

    public PageExtractor(PDDocument pDDocument, int i10, int i11) {
        this.sourceDocument = pDDocument;
        this.startPage = i10;
        this.endPage = i11;
    }
}
