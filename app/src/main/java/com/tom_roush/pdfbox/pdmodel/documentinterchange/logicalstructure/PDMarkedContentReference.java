package com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure;

import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.PDPage;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;

/* loaded from: classes2.dex */
public class PDMarkedContentReference implements COSObjectable {
    public static final String TYPE = "MCR";
    private final COSDictionary dictionary;

    public PDMarkedContentReference() {
        COSDictionary cOSDictionary = new COSDictionary();
        this.dictionary = cOSDictionary;
        cOSDictionary.setName(COSName.TYPE, TYPE);
    }

    public int getMCID() {
        return getCOSObject().getInt(COSName.MCID);
    }

    public PDPage getPage() {
        COSDictionary cOSDictionary = (COSDictionary) getCOSObject().getDictionaryObject(COSName.PG);
        if (cOSDictionary != null) {
            return new PDPage(cOSDictionary);
        }
        return null;
    }

    public void setMCID(int i10) {
        getCOSObject().setInt(COSName.MCID, i10);
    }

    public void setPage(PDPage pDPage) {
        getCOSObject().setItem(COSName.PG, pDPage);
    }

    public String toString() {
        return "mcid=" + getMCID();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.dictionary;
    }

    public PDMarkedContentReference(COSDictionary cOSDictionary) {
        this.dictionary = cOSDictionary;
    }
}
