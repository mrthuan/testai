package com.tom_roush.pdfbox.pdmodel.interactive.form;

import b.a;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationWidget;
import com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValue;
import com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature.PDSignature;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class PDSignatureField extends PDTerminalField {
    public PDSignatureField(PDAcroForm pDAcroForm) {
        super(pDAcroForm);
        getCOSObject().setItem(COSName.FT, (COSBase) COSName.SIG);
        getWidgets().get(0).setLocked(true);
        getWidgets().get(0).setPrinted(true);
        setPartialName(generatePartialName());
    }

    private String generatePartialName() {
        HashSet hashSet = new HashSet();
        Iterator<PDField> it = getAcroForm().getFieldTree().iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().getPartialName());
        }
        int i10 = 1;
        while (true) {
            if (hashSet.contains("Signature" + i10)) {
                i10++;
            } else {
                return a.c("Signature", i10);
            }
        }
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.form.PDTerminalField
    public void constructAppearances() {
        PDAnnotationWidget pDAnnotationWidget = getWidgets().get(0);
        if (pDAnnotationWidget != null && pDAnnotationWidget.getRectangle() != null) {
            if ((pDAnnotationWidget.getRectangle().getHeight() != 0.0f || pDAnnotationWidget.getRectangle().getWidth() != 0.0f) && !pDAnnotationWidget.isNoView()) {
                pDAnnotationWidget.isHidden();
            }
        }
    }

    public PDSignature getDefaultValue() {
        COSBase dictionaryObject = getCOSObject().getDictionaryObject(COSName.DV);
        if (dictionaryObject == null) {
            return null;
        }
        return new PDSignature((COSDictionary) dictionaryObject);
    }

    public PDSeedValue getSeedValue() {
        COSDictionary cOSDictionary = (COSDictionary) getCOSObject().getDictionaryObject(COSName.SV);
        if (cOSDictionary != null) {
            return new PDSeedValue(cOSDictionary);
        }
        return null;
    }

    public PDSignature getSignature() {
        return getValue();
    }

    public PDSignature getValue() {
        COSBase dictionaryObject = getCOSObject().getDictionaryObject(COSName.V);
        if (dictionaryObject instanceof COSDictionary) {
            return new PDSignature((COSDictionary) dictionaryObject);
        }
        return null;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.form.PDField
    public String getValueAsString() {
        PDSignature value = getValue();
        if (value != null) {
            return value.toString();
        }
        return "";
    }

    public void setDefaultValue(PDSignature pDSignature) {
        getCOSObject().setItem(COSName.DV, pDSignature);
    }

    public void setSeedValue(PDSeedValue pDSeedValue) {
        if (pDSeedValue != null) {
            getCOSObject().setItem(COSName.SV, pDSeedValue);
        }
    }

    @Deprecated
    public void setSignature(PDSignature pDSignature) {
        setValue(pDSignature);
    }

    public void setValue(PDSignature pDSignature) {
        getCOSObject().setItem(COSName.V, pDSignature);
        applyChange();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.form.PDField
    public void setValue(String str) {
        throw new UnsupportedOperationException("Signature fields don't support setting the value as String - use setValue(PDSignature value) instead");
    }

    public PDSignatureField(PDAcroForm pDAcroForm, COSDictionary cOSDictionary, PDNonTerminalField pDNonTerminalField) {
        super(pDAcroForm, cOSDictionary, pDNonTerminalField);
    }
}
