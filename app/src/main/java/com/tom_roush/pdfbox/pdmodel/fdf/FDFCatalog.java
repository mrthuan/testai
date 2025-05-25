package com.tom_roush.pdfbox.pdmodel.fdf;

import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature.PDSignature;
import java.io.Writer;
import org.w3c.dom.Element;

/* loaded from: classes2.dex */
public class FDFCatalog implements COSObjectable {
    private COSDictionary catalog;

    public FDFCatalog() {
        this.catalog = new COSDictionary();
    }

    public FDFDictionary getFDF() {
        COSDictionary cOSDictionary = (COSDictionary) this.catalog.getDictionaryObject(COSName.FDF);
        if (cOSDictionary != null) {
            return new FDFDictionary(cOSDictionary);
        }
        FDFDictionary fDFDictionary = new FDFDictionary();
        setFDF(fDFDictionary);
        return fDFDictionary;
    }

    public PDSignature getSignature() {
        COSDictionary cOSDictionary = (COSDictionary) this.catalog.getDictionaryObject(COSName.SIG);
        if (cOSDictionary != null) {
            return new PDSignature(cOSDictionary);
        }
        return null;
    }

    public String getVersion() {
        return this.catalog.getNameAsString(COSName.VERSION);
    }

    public void setFDF(FDFDictionary fDFDictionary) {
        this.catalog.setItem(COSName.FDF, fDFDictionary);
    }

    public void setSignature(PDSignature pDSignature) {
        this.catalog.setItem(COSName.SIG, pDSignature);
    }

    public void setVersion(String str) {
        this.catalog.setName(COSName.VERSION, str);
    }

    public void writeXML(Writer writer) {
        getFDF().writeXML(writer);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.catalog;
    }

    public FDFCatalog(COSDictionary cOSDictionary) {
        this.catalog = cOSDictionary;
    }

    public FDFCatalog(Element element) {
        this();
        setFDF(new FDFDictionary(element));
    }
}
