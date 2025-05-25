package com.tom_roush.pdfbox.pdmodel.fixup.processor;

import com.tom_roush.pdfbox.pdmodel.PDDocument;

/* loaded from: classes2.dex */
public abstract class AbstractProcessor implements PDDocumentProcessor {
    protected PDDocument document;

    public AbstractProcessor(PDDocument pDDocument) {
        this.document = pDDocument;
    }
}
