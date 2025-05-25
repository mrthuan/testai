package com.tom_roush.pdfbox.pdmodel.interactive.annotation;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.interactive.action.PDAction;
import com.tom_roush.pdfbox.pdmodel.interactive.action.PDActionFactory;
import com.tom_roush.pdfbox.pdmodel.interactive.action.PDActionURI;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers.PDAppearanceHandler;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers.PDLinkAppearanceHandler;
import com.tom_roush.pdfbox.pdmodel.interactive.documentnavigation.destination.PDDestination;

/* loaded from: classes2.dex */
public class PDAnnotationLink extends PDAnnotation {
    public static final String HIGHLIGHT_MODE_INVERT = "I";
    public static final String HIGHLIGHT_MODE_NONE = "N";
    public static final String HIGHLIGHT_MODE_OUTLINE = "O";
    public static final String HIGHLIGHT_MODE_PUSH = "P";
    public static final String SUB_TYPE = "Link";
    private PDAppearanceHandler customAppearanceHandler;

    public PDAnnotationLink() {
        getCOSObject().setName(COSName.SUBTYPE, "Link");
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotation
    public void constructAppearances() {
        constructAppearances(null);
    }

    public PDAction getAction() {
        COSBase dictionaryObject = getCOSObject().getDictionaryObject(COSName.A);
        if (dictionaryObject instanceof COSDictionary) {
            return PDActionFactory.createAction((COSDictionary) dictionaryObject);
        }
        return null;
    }

    public PDBorderStyleDictionary getBorderStyle() {
        COSBase dictionaryObject = getCOSObject().getDictionaryObject(COSName.BS);
        if (dictionaryObject instanceof COSDictionary) {
            return new PDBorderStyleDictionary((COSDictionary) dictionaryObject);
        }
        return null;
    }

    public PDDestination getDestination() {
        return PDDestination.create(getCOSObject().getDictionaryObject(COSName.DEST));
    }

    public String getHighlightMode() {
        return getCOSObject().getNameAsString(COSName.H, "I");
    }

    public PDActionURI getPreviousURI() {
        COSBase dictionaryObject = getCOSObject().getDictionaryObject("PA");
        if (dictionaryObject instanceof COSDictionary) {
            return new PDActionURI((COSDictionary) dictionaryObject);
        }
        return null;
    }

    public float[] getQuadPoints() {
        COSBase dictionaryObject = getCOSObject().getDictionaryObject(COSName.QUADPOINTS);
        if (dictionaryObject instanceof COSArray) {
            return ((COSArray) dictionaryObject).toFloatArray();
        }
        return null;
    }

    public void setAction(PDAction pDAction) {
        getCOSObject().setItem(COSName.A, pDAction);
    }

    public void setBorderStyle(PDBorderStyleDictionary pDBorderStyleDictionary) {
        getCOSObject().setItem(COSName.BS, pDBorderStyleDictionary);
    }

    public void setCustomAppearanceHandler(PDAppearanceHandler pDAppearanceHandler) {
        this.customAppearanceHandler = pDAppearanceHandler;
    }

    public void setDestination(PDDestination pDDestination) {
        getCOSObject().setItem(COSName.DEST, pDDestination);
    }

    public void setHighlightMode(String str) {
        getCOSObject().setName(COSName.H, str);
    }

    public void setPreviousURI(PDActionURI pDActionURI) {
        getCOSObject().setItem("PA", pDActionURI);
    }

    public void setQuadPoints(float[] fArr) {
        COSArray cOSArray = new COSArray();
        cOSArray.setFloatArray(fArr);
        getCOSObject().setItem(COSName.QUADPOINTS, (COSBase) cOSArray);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotation
    public void constructAppearances(PDDocument pDDocument) {
        PDAppearanceHandler pDAppearanceHandler = this.customAppearanceHandler;
        if (pDAppearanceHandler == null) {
            new PDLinkAppearanceHandler(this, pDDocument).generateAppearanceStreams();
        } else {
            pDAppearanceHandler.generateAppearanceStreams();
        }
    }

    public PDAnnotationLink(COSDictionary cOSDictionary) {
        super(cOSDictionary);
    }
}
