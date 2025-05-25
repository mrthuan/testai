package com.tom_roush.pdfbox.pdmodel.interactive.form;

import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSNumber;
import com.tom_roush.pdfbox.cos.COSStream;
import com.tom_roush.pdfbox.cos.COSString;

/* loaded from: classes2.dex */
public abstract class PDVariableText extends PDTerminalField {
    public static final int QUADDING_CENTERED = 1;
    public static final int QUADDING_LEFT = 0;
    public static final int QUADDING_RIGHT = 2;

    public PDVariableText(PDAcroForm pDAcroForm) {
        super(pDAcroForm);
    }

    public String getDefaultAppearance() {
        return ((COSString) getInheritableAttribute(COSName.DA)).getString();
    }

    public PDDefaultAppearanceString getDefaultAppearanceString() {
        return new PDDefaultAppearanceString((COSString) getInheritableAttribute(COSName.DA), getAcroForm().getDefaultResources());
    }

    public String getDefaultStyleString() {
        return ((COSString) getCOSObject().getDictionaryObject(COSName.DS)).getString();
    }

    public int getQ() {
        COSNumber cOSNumber = (COSNumber) getInheritableAttribute(COSName.Q);
        if (cOSNumber != null) {
            return cOSNumber.intValue();
        }
        return 0;
    }

    public String getRichTextValue() {
        return getStringOrStream(getInheritableAttribute(COSName.RV));
    }

    public final String getStringOrStream(COSBase cOSBase) {
        if (cOSBase == null) {
            return "";
        }
        if (cOSBase instanceof COSString) {
            return ((COSString) cOSBase).getString();
        }
        if (!(cOSBase instanceof COSStream)) {
            return "";
        }
        return ((COSStream) cOSBase).toTextString();
    }

    public void setDefaultAppearance(String str) {
        getCOSObject().setString(COSName.DA, str);
    }

    public void setDefaultStyleString(String str) {
        if (str != null) {
            getCOSObject().setItem(COSName.DS, (COSBase) new COSString(str));
        } else {
            getCOSObject().removeItem(COSName.DS);
        }
    }

    public void setQ(int i10) {
        getCOSObject().setInt(COSName.Q, i10);
    }

    public void setRichTextValue(String str) {
        if (str != null) {
            getCOSObject().setItem(COSName.RV, (COSBase) new COSString(str));
        } else {
            getCOSObject().removeItem(COSName.RV);
        }
    }

    public PDVariableText(PDAcroForm pDAcroForm, COSDictionary cOSDictionary, PDNonTerminalField pDNonTerminalField) {
        super(pDAcroForm, cOSDictionary, pDNonTerminalField);
    }
}
