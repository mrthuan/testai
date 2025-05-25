package com.tom_roush.pdfbox.pdmodel.interactive.annotation;

import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.interactive.action.PDAction;
import com.tom_roush.pdfbox.pdmodel.interactive.action.PDActionFactory;
import com.tom_roush.pdfbox.pdmodel.interactive.action.PDAnnotationAdditionalActions;
import com.tom_roush.pdfbox.pdmodel.interactive.form.PDTerminalField;
import com.tom_roush.pdfbox.pdmodel.interactive.measurement.PDNumberFormatDictionary;

/* loaded from: classes2.dex */
public class PDAnnotationWidget extends PDAnnotation {
    public static final String SUB_TYPE = "Widget";

    public PDAnnotationWidget() {
        getCOSObject().setName(COSName.SUBTYPE, SUB_TYPE);
    }

    public PDAction getAction() {
        COSBase dictionaryObject = getCOSObject().getDictionaryObject(COSName.A);
        if (dictionaryObject instanceof COSDictionary) {
            return PDActionFactory.createAction((COSDictionary) dictionaryObject);
        }
        return null;
    }

    public PDAnnotationAdditionalActions getActions() {
        COSBase dictionaryObject = getCOSObject().getDictionaryObject(COSName.AA);
        if (dictionaryObject instanceof COSDictionary) {
            return new PDAnnotationAdditionalActions((COSDictionary) dictionaryObject);
        }
        return null;
    }

    public PDAppearanceCharacteristicsDictionary getAppearanceCharacteristics() {
        COSBase dictionaryObject = getCOSObject().getDictionaryObject(COSName.MK);
        if (dictionaryObject instanceof COSDictionary) {
            return new PDAppearanceCharacteristicsDictionary((COSDictionary) dictionaryObject);
        }
        return null;
    }

    public PDBorderStyleDictionary getBorderStyle() {
        COSBase dictionaryObject = getCOSObject().getDictionaryObject(COSName.BS);
        if (dictionaryObject instanceof COSDictionary) {
            return new PDBorderStyleDictionary((COSDictionary) dictionaryObject);
        }
        return null;
    }

    public String getHighlightingMode() {
        return getCOSObject().getNameAsString(COSName.H, "I");
    }

    public void setAction(PDAction pDAction) {
        getCOSObject().setItem(COSName.A, pDAction);
    }

    public void setActions(PDAnnotationAdditionalActions pDAnnotationAdditionalActions) {
        getCOSObject().setItem(COSName.AA, pDAnnotationAdditionalActions);
    }

    public void setAppearanceCharacteristics(PDAppearanceCharacteristicsDictionary pDAppearanceCharacteristicsDictionary) {
        getCOSObject().setItem(COSName.MK, pDAppearanceCharacteristicsDictionary);
    }

    public void setBorderStyle(PDBorderStyleDictionary pDBorderStyleDictionary) {
        getCOSObject().setItem(COSName.BS, pDBorderStyleDictionary);
    }

    public void setHighlightingMode(String str) {
        if (str != null && !"N".equals(str) && !"I".equals(str) && !PDAnnotationLink.HIGHLIGHT_MODE_OUTLINE.equals(str) && !"P".equals(str) && !PDNumberFormatDictionary.FRACTIONAL_DISPLAY_TRUNCATE.equals(str)) {
            throw new IllegalArgumentException("Valid values for highlighting mode are 'N', 'N', 'O', 'P' or 'T'");
        }
        getCOSObject().setName(COSName.H, str);
    }

    public void setParent(PDTerminalField pDTerminalField) {
        if (!getCOSObject().equals(pDTerminalField.getCOSObject())) {
            getCOSObject().setItem(COSName.PARENT, pDTerminalField);
            return;
        }
        throw new IllegalArgumentException("setParent() is not to be called for a field that shares a dictionary with its only widget");
    }

    public PDAnnotationWidget(COSDictionary cOSDictionary) {
        super(cOSDictionary);
        getCOSObject().setName(COSName.SUBTYPE, SUB_TYPE);
    }
}
