package com.tom_roush.pdfbox.pdmodel.fdf;

import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import org.w3c.dom.Element;

/* loaded from: classes2.dex */
public class FDFAnnotationText extends FDFAnnotation {
    public static final String SUBTYPE = "Text";

    public FDFAnnotationText() {
        this.annot.setName(COSName.SUBTYPE, "Text");
    }

    public String getIcon() {
        return this.annot.getNameAsString(COSName.NAME, "Note");
    }

    public String getState() {
        return this.annot.getString(COSName.STATE);
    }

    public String getStateModel() {
        return this.annot.getString(COSName.STATE_MODEL);
    }

    public void setIcon(String str) {
        this.annot.setName(COSName.NAME, str);
    }

    public void setState(String str) {
        this.annot.setString(COSName.STATE, str);
    }

    public void setStateModel(String str) {
        this.annot.setString(COSName.STATE_MODEL, str);
    }

    public FDFAnnotationText(COSDictionary cOSDictionary) {
        super(cOSDictionary);
    }

    public FDFAnnotationText(Element element) {
        super(element);
        String attribute;
        this.annot.setName(COSName.SUBTYPE, "Text");
        String attribute2 = element.getAttribute(InMobiNetworkValues.ICON);
        if (attribute2 != null && !attribute2.isEmpty()) {
            setIcon(element.getAttribute(InMobiNetworkValues.ICON));
        }
        String attribute3 = element.getAttribute("state");
        if (attribute3 == null || attribute3.isEmpty() || (attribute = element.getAttribute("statemodel")) == null || attribute.isEmpty()) {
            return;
        }
        setState(element.getAttribute("state"));
        setStateModel(element.getAttribute("statemodel"));
    }
}
