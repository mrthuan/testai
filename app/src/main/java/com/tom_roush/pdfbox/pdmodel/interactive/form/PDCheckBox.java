package com.tom_roush.pdfbox.pdmodel.interactive.form;

import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAppearanceEntry;

/* loaded from: classes2.dex */
public final class PDCheckBox extends PDButton {
    public PDCheckBox(PDAcroForm pDAcroForm) {
        super(pDAcroForm);
    }

    public void check() {
        setValue(getOnValue());
    }

    public String getOnValue() {
        PDAppearanceEntry normalAppearance;
        PDAppearanceDictionary appearance = getWidgets().get(0).getAppearance();
        if (appearance != null && (normalAppearance = appearance.getNormalAppearance()) != null) {
            for (COSName cOSName : normalAppearance.getSubDictionary().keySet()) {
                if (COSName.Off.compareTo(cOSName) != 0) {
                    return cOSName.getName();
                }
            }
            return "";
        }
        return "";
    }

    public boolean isChecked() {
        if (getValue().compareTo(getOnValue()) == 0) {
            return true;
        }
        return false;
    }

    public void unCheck() {
        setValue(COSName.Off.getName());
    }

    public PDCheckBox(PDAcroForm pDAcroForm, COSDictionary cOSDictionary, PDNonTerminalField pDNonTerminalField) {
        super(pDAcroForm, cOSDictionary, pDNonTerminalField);
    }
}
