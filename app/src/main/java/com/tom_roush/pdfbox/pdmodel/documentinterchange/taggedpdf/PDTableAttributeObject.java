package com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf;

import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure.PDAttributeObject;

/* loaded from: classes2.dex */
public class PDTableAttributeObject extends PDStandardAttributeObject {
    protected static final String COL_SPAN = "ColSpan";
    protected static final String HEADERS = "Headers";
    public static final String OWNER_TABLE = "Table";
    protected static final String ROW_SPAN = "RowSpan";
    protected static final String SCOPE = "Scope";
    public static final String SCOPE_BOTH = "Both";
    public static final String SCOPE_COLUMN = "Column";
    public static final String SCOPE_ROW = "Row";
    protected static final String SUMMARY = "Summary";

    public PDTableAttributeObject() {
        setOwner("Table");
    }

    public int getColSpan() {
        return getInteger(COL_SPAN, 1);
    }

    public String[] getHeaders() {
        return getArrayOfString(HEADERS);
    }

    public int getRowSpan() {
        return getInteger(ROW_SPAN, 1);
    }

    public String getScope() {
        return getName(SCOPE);
    }

    public String getSummary() {
        return getString(SUMMARY);
    }

    public void setColSpan(int i10) {
        setInteger(COL_SPAN, i10);
    }

    public void setHeaders(String[] strArr) {
        setArrayOfString(HEADERS, strArr);
    }

    public void setRowSpan(int i10) {
        setInteger(ROW_SPAN, i10);
    }

    public void setScope(String str) {
        setName(SCOPE, str);
    }

    public void setSummary(String str) {
        setString(SUMMARY, str);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure.PDAttributeObject
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        if (isSpecified(ROW_SPAN)) {
            sb2.append(", RowSpan=");
            sb2.append(getRowSpan());
        }
        if (isSpecified(COL_SPAN)) {
            sb2.append(", ColSpan=");
            sb2.append(getColSpan());
        }
        if (isSpecified(HEADERS)) {
            sb2.append(", Headers=");
            sb2.append(PDAttributeObject.arrayToString(getHeaders()));
        }
        if (isSpecified(SCOPE)) {
            sb2.append(", Scope=");
            sb2.append(getScope());
        }
        if (isSpecified(SUMMARY)) {
            sb2.append(", Summary=");
            sb2.append(getSummary());
        }
        return sb2.toString();
    }

    public PDTableAttributeObject(COSDictionary cOSDictionary) {
        super(cOSDictionary);
    }
}
