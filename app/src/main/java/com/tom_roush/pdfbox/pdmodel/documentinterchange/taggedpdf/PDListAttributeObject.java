package com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf;

import com.tom_roush.pdfbox.cos.COSDictionary;

/* loaded from: classes2.dex */
public class PDListAttributeObject extends PDStandardAttributeObject {
    protected static final String LIST_NUMBERING = "ListNumbering";
    public static final String LIST_NUMBERING_CIRCLE = "Circle";
    public static final String LIST_NUMBERING_DECIMAL = "Decimal";
    public static final String LIST_NUMBERING_DISC = "Disc";
    public static final String LIST_NUMBERING_LOWER_ALPHA = "LowerAlpha";
    public static final String LIST_NUMBERING_LOWER_ROMAN = "LowerRoman";
    public static final String LIST_NUMBERING_NONE = "None";
    public static final String LIST_NUMBERING_SQUARE = "Square";
    public static final String LIST_NUMBERING_UPPER_ALPHA = "UpperAlpha";
    public static final String LIST_NUMBERING_UPPER_ROMAN = "UpperRoman";
    public static final String OWNER_LIST = "List";

    public PDListAttributeObject() {
        setOwner(OWNER_LIST);
    }

    public String getListNumbering() {
        return getName(LIST_NUMBERING, "None");
    }

    public void setListNumbering(String str) {
        setName(LIST_NUMBERING, str);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure.PDAttributeObject
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        if (isSpecified(LIST_NUMBERING)) {
            sb2.append(", ListNumbering=");
            sb2.append(getListNumbering());
        }
        return sb2.toString();
    }

    public PDListAttributeObject(COSDictionary cOSDictionary) {
        super(cOSDictionary);
    }
}
