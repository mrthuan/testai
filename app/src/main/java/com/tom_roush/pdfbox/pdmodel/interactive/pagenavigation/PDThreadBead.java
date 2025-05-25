package com.tom_roush.pdfbox.pdmodel.interactive.pagenavigation;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.PDPage;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.pdmodel.interactive.measurement.PDNumberFormatDictionary;
import lib.zj.office.fc.openxml4j.opc.PackageRelationship;

/* loaded from: classes2.dex */
public class PDThreadBead implements COSObjectable {
    private final COSDictionary bead;

    public PDThreadBead(COSDictionary cOSDictionary) {
        this.bead = cOSDictionary;
    }

    public void appendBead(PDThreadBead pDThreadBead) {
        PDThreadBead nextBead = getNextBead();
        nextBead.setPreviousBead(pDThreadBead);
        pDThreadBead.setNextBead(nextBead);
        setNextBead(pDThreadBead);
        pDThreadBead.setPreviousBead(this);
    }

    public PDThreadBead getNextBead() {
        return new PDThreadBead((COSDictionary) this.bead.getDictionaryObject("N"));
    }

    public PDPage getPage() {
        COSDictionary cOSDictionary = (COSDictionary) this.bead.getDictionaryObject("P");
        if (cOSDictionary != null) {
            return new PDPage(cOSDictionary);
        }
        return null;
    }

    public PDThreadBead getPreviousBead() {
        return new PDThreadBead((COSDictionary) this.bead.getDictionaryObject("V"));
    }

    public PDRectangle getRectangle() {
        COSArray cOSArray = (COSArray) this.bead.getDictionaryObject(COSName.R);
        if (cOSArray != null) {
            return new PDRectangle(cOSArray);
        }
        return null;
    }

    public PDThread getThread() {
        COSDictionary cOSDictionary = (COSDictionary) this.bead.getDictionaryObject(PDNumberFormatDictionary.FRACTIONAL_DISPLAY_TRUNCATE);
        if (cOSDictionary != null) {
            return new PDThread(cOSDictionary);
        }
        return null;
    }

    public final void setNextBead(PDThreadBead pDThreadBead) {
        this.bead.setItem("N", pDThreadBead);
    }

    public void setPage(PDPage pDPage) {
        this.bead.setItem("P", pDPage);
    }

    public final void setPreviousBead(PDThreadBead pDThreadBead) {
        this.bead.setItem("V", pDThreadBead);
    }

    public void setRectangle(PDRectangle pDRectangle) {
        this.bead.setItem(COSName.R, pDRectangle);
    }

    public void setThread(PDThread pDThread) {
        this.bead.setItem(PDNumberFormatDictionary.FRACTIONAL_DISPLAY_TRUNCATE, pDThread);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.bead;
    }

    public PDThreadBead() {
        COSDictionary cOSDictionary = new COSDictionary();
        this.bead = cOSDictionary;
        cOSDictionary.setName(PackageRelationship.TYPE_ATTRIBUTE_NAME, "Bead");
        setNextBead(this);
        setPreviousBead(this);
    }
}
