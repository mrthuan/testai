package com.tom_roush.pdfbox.pdmodel.interactive.annotation;

import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;

/* loaded from: classes2.dex */
public class PDAnnotationRubberStamp extends PDAnnotationMarkup {
    public static final String NAME_APPROVED = "Approved";
    public static final String NAME_AS_IS = "AsIs";
    public static final String NAME_CONFIDENTIAL = "Confidential";
    public static final String NAME_DEPARTMENTAL = "Departmental";
    public static final String NAME_DRAFT = "Draft";
    public static final String NAME_EXPERIMENTAL = "Experimental";
    public static final String NAME_EXPIRED = "Expired";
    public static final String NAME_FINAL = "Final";
    public static final String NAME_FOR_COMMENT = "ForComment";
    public static final String NAME_FOR_PUBLIC_RELEASE = "ForPublicRelease";
    public static final String NAME_NOT_APPROVED = "NotApproved";
    public static final String NAME_NOT_FOR_PUBLIC_RELEASE = "NotForPublicRelease";
    public static final String NAME_SOLD = "Sold";
    public static final String NAME_TOP_SECRET = "TopSecret";
    public static final String SUB_TYPE = "Stamp";

    public PDAnnotationRubberStamp() {
        getCOSObject().setName(COSName.SUBTYPE, "Stamp");
    }

    public String getName() {
        return getCOSObject().getNameAsString(COSName.NAME, NAME_DRAFT);
    }

    public void setName(String str) {
        getCOSObject().setName(COSName.NAME, str);
    }

    public PDAnnotationRubberStamp(COSDictionary cOSDictionary) {
        super(cOSDictionary);
    }
}
