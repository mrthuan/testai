package com.tom_roush.pdfbox.pdmodel.fixup;

import com.tom_roush.pdfbox.pdmodel.PDDocument;

/* loaded from: classes2.dex */
public abstract class AbstractFixup implements PDDocumentFixup {
    protected PDDocument document;

    public AbstractFixup(PDDocument pDDocument) {
        this.document = pDDocument;
    }
}
