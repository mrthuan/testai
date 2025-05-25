package com.tom_roush.pdfbox.pdmodel.fixup;

import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.fixup.processor.AcroFormDefaultsProcessor;
import com.tom_roush.pdfbox.pdmodel.fixup.processor.AcroFormGenerateAppearancesProcessor;
import com.tom_roush.pdfbox.pdmodel.fixup.processor.AcroFormOrphanWidgetsProcessor;
import com.tom_roush.pdfbox.pdmodel.interactive.form.PDAcroForm;

/* loaded from: classes2.dex */
public class AcroFormDefaultFixup extends AbstractFixup {
    public AcroFormDefaultFixup(PDDocument pDDocument) {
        super(pDDocument);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.fixup.PDDocumentFixup
    public void apply() {
        new AcroFormDefaultsProcessor(this.document).process();
        PDAcroForm acroForm = this.document.getDocumentCatalog().getAcroForm(null);
        if (acroForm != null && acroForm.getNeedAppearances()) {
            if (acroForm.getFields().isEmpty()) {
                new AcroFormOrphanWidgetsProcessor(this.document).process();
            }
            new AcroFormGenerateAppearancesProcessor(this.document).process();
        }
    }
}
