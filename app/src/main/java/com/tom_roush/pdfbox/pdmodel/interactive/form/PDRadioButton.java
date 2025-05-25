package com.tom_roush.pdfbox.pdmodel.interactive.form;

import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationWidget;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import lib.zj.office.fc.hpsf.Variant;

/* loaded from: classes2.dex */
public final class PDRadioButton extends PDButton {
    private static final int FLAG_NO_TOGGLE_TO_OFF = 16384;

    public PDRadioButton(PDAcroForm pDAcroForm) {
        super(pDAcroForm);
        getCOSObject().setFlag(COSName.FF, Variant.VT_RESERVED, true);
    }

    public List<String> getSelectedExportValues() {
        Set<String> onValues = getOnValues();
        List<String> exportValues = getExportValues();
        ArrayList arrayList = new ArrayList();
        if (exportValues.isEmpty()) {
            arrayList.add(getValue());
            return arrayList;
        }
        String value = getValue();
        int i10 = 0;
        for (String str : onValues) {
            if (str.compareTo(value) == 0) {
                arrayList.add(exportValues.get(i10));
            }
            i10++;
        }
        return arrayList;
    }

    public int getSelectedIndex() {
        int i10 = 0;
        for (PDAnnotationWidget pDAnnotationWidget : getWidgets()) {
            if (!COSName.Off.equals(pDAnnotationWidget.getAppearanceState())) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public boolean isRadiosInUnison() {
        return getCOSObject().getFlag(COSName.FF, 33554432);
    }

    public void setRadiosInUnison(boolean z10) {
        getCOSObject().setFlag(COSName.FF, 33554432, z10);
    }

    public PDRadioButton(PDAcroForm pDAcroForm, COSDictionary cOSDictionary, PDNonTerminalField pDNonTerminalField) {
        super(pDAcroForm, cOSDictionary, pDNonTerminalField);
    }
}
