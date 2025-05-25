package com.tom_roush.pdfbox.pdmodel.interactive.form;

import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;

/* loaded from: classes2.dex */
public final class PDTextField extends PDVariableText {
    private static final int FLAG_COMB = 16777216;
    private static final int FLAG_DO_NOT_SCROLL = 8388608;
    private static final int FLAG_DO_NOT_SPELL_CHECK = 4194304;
    private static final int FLAG_FILE_SELECT = 1048576;
    private static final int FLAG_MULTILINE = 4096;
    private static final int FLAG_PASSWORD = 8192;
    private static final int FLAG_RICH_TEXT = 33554432;

    public PDTextField(PDAcroForm pDAcroForm) {
        super(pDAcroForm);
        getCOSObject().setItem(COSName.FT, (COSBase) COSName.TX);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.form.PDTerminalField
    public void constructAppearances() {
        new AppearanceGeneratorHelper(this).setAppearanceValue(getValue());
    }

    public boolean doNotScroll() {
        return getCOSObject().getFlag(COSName.FF, FLAG_DO_NOT_SCROLL);
    }

    public boolean doNotSpellCheck() {
        return getCOSObject().getFlag(COSName.FF, FLAG_DO_NOT_SPELL_CHECK);
    }

    public String getDefaultValue() {
        return getStringOrStream(getInheritableAttribute(COSName.DV));
    }

    public int getMaxLen() {
        return getCOSObject().getInt(COSName.MAX_LEN);
    }

    public String getValue() {
        return getStringOrStream(getInheritableAttribute(COSName.V));
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.form.PDField
    public String getValueAsString() {
        return getValue();
    }

    public boolean isComb() {
        return getCOSObject().getFlag(COSName.FF, FLAG_COMB);
    }

    public boolean isFileSelect() {
        return getCOSObject().getFlag(COSName.FF, FLAG_FILE_SELECT);
    }

    public boolean isMultiline() {
        return getCOSObject().getFlag(COSName.FF, 4096);
    }

    public boolean isPassword() {
        return getCOSObject().getFlag(COSName.FF, 8192);
    }

    public boolean isRichText() {
        return getCOSObject().getFlag(COSName.FF, FLAG_RICH_TEXT);
    }

    public void setComb(boolean z10) {
        getCOSObject().setFlag(COSName.FF, FLAG_COMB, z10);
    }

    public void setDefaultValue(String str) {
        getCOSObject().setString(COSName.DV, str);
    }

    public void setDoNotScroll(boolean z10) {
        getCOSObject().setFlag(COSName.FF, FLAG_DO_NOT_SCROLL, z10);
    }

    public void setDoNotSpellCheck(boolean z10) {
        getCOSObject().setFlag(COSName.FF, FLAG_DO_NOT_SPELL_CHECK, z10);
    }

    public void setFileSelect(boolean z10) {
        getCOSObject().setFlag(COSName.FF, FLAG_FILE_SELECT, z10);
    }

    public void setMaxLen(int i10) {
        getCOSObject().setInt(COSName.MAX_LEN, i10);
    }

    public void setMultiline(boolean z10) {
        getCOSObject().setFlag(COSName.FF, 4096, z10);
    }

    public void setPassword(boolean z10) {
        getCOSObject().setFlag(COSName.FF, 8192, z10);
    }

    public void setRichText(boolean z10) {
        getCOSObject().setFlag(COSName.FF, FLAG_RICH_TEXT, z10);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.form.PDField
    public void setValue(String str) {
        getCOSObject().setString(COSName.V, str);
        applyChange();
    }

    public PDTextField(PDAcroForm pDAcroForm, COSDictionary cOSDictionary, PDNonTerminalField pDNonTerminalField) {
        super(pDAcroForm, cOSDictionary, pDNonTerminalField);
    }
}
