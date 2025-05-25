package com.tom_roush.pdfbox.pdmodel.fixup.processor;

import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.interactive.form.PDAcroForm;
import java.io.IOException;

/* loaded from: classes2.dex */
public class AcroFormGenerateAppearancesProcessor extends AbstractProcessor {
    public AcroFormGenerateAppearancesProcessor(PDDocument pDDocument) {
        super(pDDocument);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.fixup.processor.PDDocumentProcessor
    public void process() {
        PDAcroForm acroForm = this.document.getDocumentCatalog().getAcroForm(null);
        if (acroForm != null && acroForm.getNeedAppearances()) {
            try {
                acroForm.refreshAppearances();
                acroForm.setNeedAppearances(Boolean.FALSE);
            } catch (IOException e10) {
                e10.getMessage();
            } catch (IllegalArgumentException e11) {
                e11.getMessage();
            }
        }
    }
}
