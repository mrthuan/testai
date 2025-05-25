package com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf;

import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure.PDAttributeObject;

/* loaded from: classes2.dex */
public class PDExportFormatAttributeObject extends PDLayoutAttributeObject {
    public static final String OWNER_CSS_1_00 = "CSS-1.00";
    public static final String OWNER_CSS_2_00 = "CSS-2.00";
    public static final String OWNER_HTML_3_20 = "HTML-3.2";
    public static final String OWNER_HTML_4_01 = "HTML-4.01";
    public static final String OWNER_OEB_1_00 = "OEB-1.00";
    public static final String OWNER_RTF_1_05 = "RTF-1.05";
    public static final String OWNER_XML_1_00 = "XML-1.00";

    public PDExportFormatAttributeObject(String str) {
        setOwner(str);
    }

    public int getColSpan() {
        return getInteger("ColSpan", 1);
    }

    public String[] getHeaders() {
        return getArrayOfString("Headers");
    }

    public String getListNumbering() {
        return getName("ListNumbering", "None");
    }

    public int getRowSpan() {
        return getInteger("RowSpan", 1);
    }

    public String getScope() {
        return getName("Scope");
    }

    public String getSummary() {
        return getString("Summary");
    }

    public void setColSpan(int i10) {
        setInteger("ColSpan", i10);
    }

    public void setHeaders(String[] strArr) {
        setArrayOfString("Headers", strArr);
    }

    public void setListNumbering(String str) {
        setName("ListNumbering", str);
    }

    public void setRowSpan(int i10) {
        setInteger("RowSpan", i10);
    }

    public void setScope(String str) {
        setName("Scope", str);
    }

    public void setSummary(String str) {
        setString("Summary", str);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject, com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure.PDAttributeObject
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        if (isSpecified("ListNumbering")) {
            sb2.append(", ListNumbering=");
            sb2.append(getListNumbering());
        }
        if (isSpecified("RowSpan")) {
            sb2.append(", RowSpan=");
            sb2.append(getRowSpan());
        }
        if (isSpecified("ColSpan")) {
            sb2.append(", ColSpan=");
            sb2.append(getColSpan());
        }
        if (isSpecified("Headers")) {
            sb2.append(", Headers=");
            sb2.append(PDAttributeObject.arrayToString(getHeaders()));
        }
        if (isSpecified("Scope")) {
            sb2.append(", Scope=");
            sb2.append(getScope());
        }
        if (isSpecified("Summary")) {
            sb2.append(", Summary=");
            sb2.append(getSummary());
        }
        return sb2.toString();
    }

    public PDExportFormatAttributeObject(COSDictionary cOSDictionary) {
        super(cOSDictionary);
    }
}
