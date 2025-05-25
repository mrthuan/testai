package com.tom_roush.pdfbox.pdmodel.fixup.processor;

import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.PDResources;
import com.tom_roush.pdfbox.pdmodel.font.PDType1Font;
import com.tom_roush.pdfbox.pdmodel.interactive.form.PDAcroForm;

/* loaded from: classes2.dex */
public class AcroFormDefaultsProcessor extends AbstractProcessor {
    public AcroFormDefaultsProcessor(PDDocument pDDocument) {
        super(pDDocument);
    }

    private void verifyOrCreateDefaults(PDAcroForm pDAcroForm) {
        if (pDAcroForm.getDefaultAppearance().length() == 0) {
            pDAcroForm.setDefaultAppearance("/Helv 0 Tf 0 g ");
            pDAcroForm.getCOSObject().setNeedToBeUpdated(true);
        }
        PDResources defaultResources = pDAcroForm.getDefaultResources();
        if (defaultResources == null) {
            defaultResources = new PDResources();
            pDAcroForm.setDefaultResources(defaultResources);
            pDAcroForm.getCOSObject().setNeedToBeUpdated(true);
        }
        COSDictionary cOSObject = defaultResources.getCOSObject();
        COSName cOSName = COSName.FONT;
        COSDictionary cOSDictionary = cOSObject.getCOSDictionary(cOSName);
        if (cOSDictionary == null) {
            cOSDictionary = new COSDictionary();
            defaultResources.getCOSObject().setItem(cOSName, (COSBase) cOSDictionary);
        }
        COSName cOSName2 = COSName.HELV;
        if (!cOSDictionary.containsKey(cOSName2)) {
            defaultResources.put(cOSName2, PDType1Font.HELVETICA);
            defaultResources.getCOSObject().setNeedToBeUpdated(true);
            cOSDictionary.setNeedToBeUpdated(true);
        }
        COSName cOSName3 = COSName.ZA_DB;
        if (!cOSDictionary.containsKey(cOSName3)) {
            defaultResources.put(cOSName3, PDType1Font.ZAPF_DINGBATS);
            defaultResources.getCOSObject().setNeedToBeUpdated(true);
            cOSDictionary.setNeedToBeUpdated(true);
        }
    }

    @Override // com.tom_roush.pdfbox.pdmodel.fixup.processor.PDDocumentProcessor
    public void process() {
        PDAcroForm acroForm = this.document.getDocumentCatalog().getAcroForm(null);
        if (acroForm != null) {
            verifyOrCreateDefaults(acroForm);
        }
    }
}
