package com.tom_roush.pdfbox.pdmodel.interactive.form;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;

/* loaded from: classes2.dex */
public final class PDFieldFactory {
    private static final String FIELD_TYPE_BUTTON = "Btn";
    private static final String FIELD_TYPE_CHOICE = "Ch";
    private static final String FIELD_TYPE_SIGNATURE = "Sig";
    private static final String FIELD_TYPE_TEXT = "Tx";

    private PDFieldFactory() {
    }

    private static PDField createButtonSubType(PDAcroForm pDAcroForm, COSDictionary cOSDictionary, PDNonTerminalField pDNonTerminalField) {
        int i10 = cOSDictionary.getInt(COSName.FF, 0);
        if ((32768 & i10) != 0) {
            return new PDRadioButton(pDAcroForm, cOSDictionary, pDNonTerminalField);
        }
        if ((i10 & 65536) != 0) {
            return new PDPushButton(pDAcroForm, cOSDictionary, pDNonTerminalField);
        }
        return new PDCheckBox(pDAcroForm, cOSDictionary, pDNonTerminalField);
    }

    private static PDField createChoiceSubType(PDAcroForm pDAcroForm, COSDictionary cOSDictionary, PDNonTerminalField pDNonTerminalField) {
        if ((cOSDictionary.getInt(COSName.FF, 0) & 131072) != 0) {
            return new PDComboBox(pDAcroForm, cOSDictionary, pDNonTerminalField);
        }
        return new PDListBox(pDAcroForm, cOSDictionary, pDNonTerminalField);
    }

    public static PDField createField(PDAcroForm pDAcroForm, COSDictionary cOSDictionary, PDNonTerminalField pDNonTerminalField) {
        COSArray cOSArray;
        String findFieldType = findFieldType(cOSDictionary);
        COSName cOSName = COSName.KIDS;
        if (cOSDictionary.containsKey(cOSName) && (cOSArray = (COSArray) cOSDictionary.getDictionaryObject(cOSName)) != null && cOSArray.size() > 0) {
            for (int i10 = 0; i10 < cOSArray.size(); i10++) {
                COSBase object = cOSArray.getObject(i10);
                if ((object instanceof COSDictionary) && ((COSDictionary) object).getString(COSName.T) != null) {
                    return new PDNonTerminalField(pDAcroForm, cOSDictionary, pDNonTerminalField);
                }
            }
        }
        if (FIELD_TYPE_CHOICE.equals(findFieldType)) {
            return createChoiceSubType(pDAcroForm, cOSDictionary, pDNonTerminalField);
        }
        if (FIELD_TYPE_TEXT.equals(findFieldType)) {
            return new PDTextField(pDAcroForm, cOSDictionary, pDNonTerminalField);
        }
        if (FIELD_TYPE_SIGNATURE.equals(findFieldType)) {
            return new PDSignatureField(pDAcroForm, cOSDictionary, pDNonTerminalField);
        }
        if (FIELD_TYPE_BUTTON.equals(findFieldType)) {
            return createButtonSubType(pDAcroForm, cOSDictionary, pDNonTerminalField);
        }
        return null;
    }

    private static String findFieldType(COSDictionary cOSDictionary) {
        String nameAsString = cOSDictionary.getNameAsString(COSName.FT);
        if (nameAsString == null) {
            COSBase dictionaryObject = cOSDictionary.getDictionaryObject(COSName.PARENT, COSName.P);
            if (dictionaryObject instanceof COSDictionary) {
                return findFieldType((COSDictionary) dictionaryObject);
            }
            return nameAsString;
        }
        return nameAsString;
    }
}
