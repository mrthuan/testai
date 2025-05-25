package com.tom_roush.pdfbox.pdmodel.documentinterchange.markedcontent;

import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent;
import com.tom_roush.pdfbox.pdmodel.graphics.PDXObject;
import com.tom_roush.pdfbox.text.TextPosition;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class PDMarkedContent {
    private final List<Object> contents;
    private final COSDictionary properties;
    private final String tag;

    public PDMarkedContent(COSName cOSName, COSDictionary cOSDictionary) {
        String name;
        if (cOSName == null) {
            name = null;
        } else {
            name = cOSName.getName();
        }
        this.tag = name;
        this.properties = cOSDictionary;
        this.contents = new ArrayList();
    }

    public static PDMarkedContent create(COSName cOSName, COSDictionary cOSDictionary) {
        if (COSName.ARTIFACT.equals(cOSName)) {
            return new PDArtifactMarkedContent(cOSDictionary);
        }
        return new PDMarkedContent(cOSName, cOSDictionary);
    }

    public void addMarkedContent(PDMarkedContent pDMarkedContent) {
        getContents().add(pDMarkedContent);
    }

    public void addText(TextPosition textPosition) {
        getContents().add(textPosition);
    }

    public void addXObject(PDXObject pDXObject) {
        getContents().add(pDXObject);
    }

    public String getActualText() {
        if (getProperties() == null) {
            return null;
        }
        return getProperties().getString(COSName.ACTUAL_TEXT);
    }

    public String getAlternateDescription() {
        if (getProperties() == null) {
            return null;
        }
        return getProperties().getString(COSName.ALT);
    }

    public List<Object> getContents() {
        return this.contents;
    }

    public String getExpandedForm() {
        if (getProperties() == null) {
            return null;
        }
        return getProperties().getString(COSName.E);
    }

    public String getLanguage() {
        if (getProperties() == null) {
            return null;
        }
        return getProperties().getNameAsString(COSName.LANG);
    }

    public int getMCID() {
        if (getProperties() == null) {
            return -1;
        }
        return getProperties().getInt(COSName.MCID);
    }

    public COSDictionary getProperties() {
        return this.properties;
    }

    public String getTag() {
        return this.tag;
    }

    public String toString() {
        return "tag=" + this.tag + ", properties=" + this.properties + ", contents=" + this.contents;
    }
}
