package com.tom_roush.pdfbox.pdmodel.interactive.form;

import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public class PDPushButton extends PDButton {
    public PDPushButton(PDAcroForm pDAcroForm) {
        super(pDAcroForm);
        getCOSObject().setFlag(COSName.FF, 65536, true);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.form.PDButton
    public String getDefaultValue() {
        return "";
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.form.PDButton
    public List<String> getExportValues() {
        return Collections.emptyList();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.form.PDButton
    public Set<String> getOnValues() {
        return Collections.emptySet();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.form.PDButton
    public String getValue() {
        return "";
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.form.PDButton, com.tom_roush.pdfbox.pdmodel.interactive.form.PDField
    public String getValueAsString() {
        return getValue();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.form.PDButton
    public void setExportValues(List<String> list) {
        if (list != null && !list.isEmpty()) {
            throw new IllegalArgumentException("A PDPushButton shall not use the Opt entry in the field dictionary");
        }
    }

    public PDPushButton(PDAcroForm pDAcroForm, COSDictionary cOSDictionary, PDNonTerminalField pDNonTerminalField) {
        super(pDAcroForm, cOSDictionary, pDNonTerminalField);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.form.PDButton, com.tom_roush.pdfbox.pdmodel.interactive.form.PDTerminalField
    public void constructAppearances() {
    }
}
