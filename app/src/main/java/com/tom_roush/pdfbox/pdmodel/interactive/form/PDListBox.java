package com.tom_roush.pdfbox.pdmodel.interactive.form;

import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;

/* loaded from: classes2.dex */
public final class PDListBox extends PDChoice {
    public PDListBox(PDAcroForm pDAcroForm) {
        super(pDAcroForm);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.form.PDChoice, com.tom_roush.pdfbox.pdmodel.interactive.form.PDTerminalField
    public void constructAppearances() {
        new AppearanceGeneratorHelper(this).setAppearanceValue("");
    }

    public int getTopIndex() {
        return getCOSObject().getInt(COSName.TI, 0);
    }

    public void setTopIndex(Integer num) {
        if (num != null) {
            getCOSObject().setInt(COSName.TI, num.intValue());
        } else {
            getCOSObject().removeItem(COSName.TI);
        }
    }

    public PDListBox(PDAcroForm pDAcroForm, COSDictionary cOSDictionary, PDNonTerminalField pDNonTerminalField) {
        super(pDAcroForm, cOSDictionary, pDNonTerminalField);
    }
}
