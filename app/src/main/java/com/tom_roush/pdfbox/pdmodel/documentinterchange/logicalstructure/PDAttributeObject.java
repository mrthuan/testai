package com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure;

import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.common.PDDictionaryWrapper;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDListAttributeObject;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDPrintFieldAttributeObject;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDTableAttributeObject;

/* loaded from: classes2.dex */
public abstract class PDAttributeObject extends PDDictionaryWrapper {
    private PDStructureElement structureElement;

    public PDAttributeObject() {
    }

    public static String arrayToString(Object[] objArr) {
        StringBuilder sb2 = new StringBuilder("[");
        for (int i10 = 0; i10 < objArr.length; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(objArr[i10]);
        }
        sb2.append(']');
        return sb2.toString();
    }

    public static PDAttributeObject create(COSDictionary cOSDictionary) {
        String nameAsString = cOSDictionary.getNameAsString(COSName.O);
        if (PDUserAttributeObject.OWNER_USER_PROPERTIES.equals(nameAsString)) {
            return new PDUserAttributeObject(cOSDictionary);
        }
        if (PDListAttributeObject.OWNER_LIST.equals(nameAsString)) {
            return new PDListAttributeObject(cOSDictionary);
        }
        if (PDPrintFieldAttributeObject.OWNER_PRINT_FIELD.equals(nameAsString)) {
            return new PDPrintFieldAttributeObject(cOSDictionary);
        }
        if ("Table".equals(nameAsString)) {
            return new PDTableAttributeObject(cOSDictionary);
        }
        if (PDLayoutAttributeObject.OWNER_LAYOUT.equals(nameAsString)) {
            return new PDLayoutAttributeObject(cOSDictionary);
        }
        if (!PDExportFormatAttributeObject.OWNER_XML_1_00.equals(nameAsString) && !PDExportFormatAttributeObject.OWNER_HTML_3_20.equals(nameAsString) && !PDExportFormatAttributeObject.OWNER_HTML_4_01.equals(nameAsString) && !PDExportFormatAttributeObject.OWNER_OEB_1_00.equals(nameAsString) && !PDExportFormatAttributeObject.OWNER_RTF_1_05.equals(nameAsString) && !PDExportFormatAttributeObject.OWNER_CSS_1_00.equals(nameAsString) && !PDExportFormatAttributeObject.OWNER_CSS_2_00.equals(nameAsString)) {
            return new PDDefaultAttributeObject(cOSDictionary);
        }
        return new PDExportFormatAttributeObject(cOSDictionary);
    }

    private PDStructureElement getStructureElement() {
        return this.structureElement;
    }

    private boolean isValueChanged(COSBase cOSBase, COSBase cOSBase2) {
        if (cOSBase == null) {
            if (cOSBase2 != null) {
                return true;
            }
            return false;
        }
        return !cOSBase.equals(cOSBase2);
    }

    public String getOwner() {
        return getCOSObject().getNameAsString(COSName.O);
    }

    public boolean isEmpty() {
        if (getCOSObject().size() == 1 && getOwner() != null) {
            return true;
        }
        return false;
    }

    public void notifyChanged() {
        if (getStructureElement() != null) {
            getStructureElement().attributeChanged(this);
        }
    }

    public void potentiallyNotifyChanged(COSBase cOSBase, COSBase cOSBase2) {
        if (isValueChanged(cOSBase, cOSBase2)) {
            notifyChanged();
        }
    }

    public void setOwner(String str) {
        getCOSObject().setName(COSName.O, str);
    }

    public void setStructureElement(PDStructureElement pDStructureElement) {
        this.structureElement = pDStructureElement;
    }

    public String toString() {
        return "O=" + getOwner();
    }

    public PDAttributeObject(COSDictionary cOSDictionary) {
        super(cOSDictionary);
    }

    public static String arrayToString(float[] fArr) {
        StringBuilder sb2 = new StringBuilder("[");
        for (int i10 = 0; i10 < fArr.length; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(fArr[i10]);
        }
        sb2.append(']');
        return sb2.toString();
    }
}
