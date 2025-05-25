package com.tom_roush.pdfbox.pdmodel.interactive.annotation;

import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers.PDAppearanceHandler;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers.PDTextAppearanceHandler;

/* loaded from: classes2.dex */
public class PDAnnotationText extends PDAnnotationMarkup {
    public static final String NAME_CHECK = "Check";
    public static final String NAME_CIRCLE = "Circle";
    public static final String NAME_COMMENT = "Comment";
    public static final String NAME_CROSS = "Cross";
    public static final String NAME_CROSS_HAIRS = "CrossHairs";
    public static final String NAME_HELP = "Help";
    public static final String NAME_INSERT = "Insert";
    public static final String NAME_KEY = "Key";
    public static final String NAME_NEW_PARAGRAPH = "NewParagraph";
    public static final String NAME_NOTE = "Note";
    public static final String NAME_PARAGRAPH = "Paragraph";
    public static final String NAME_RIGHT_ARROW = "RightArrow";
    public static final String NAME_RIGHT_POINTER = "RightPointer";
    public static final String NAME_STAR = "Star";
    public static final String NAME_UP_ARROW = "UpArrow";
    public static final String NAME_UP_LEFT_ARROW = "UpLeftArrow";
    public static final String SUB_TYPE = "Text";
    private PDAppearanceHandler customAppearanceHandler;

    public PDAnnotationText() {
        getCOSObject().setName(COSName.SUBTYPE, "Text");
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationMarkup, com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotation
    public void constructAppearances() {
        constructAppearances(null);
    }

    public String getName() {
        return getCOSObject().getNameAsString(COSName.NAME, "Note");
    }

    public boolean getOpen() {
        return getCOSObject().getBoolean(COSName.getPDFName("Open"), false);
    }

    public String getState() {
        return getCOSObject().getString(COSName.STATE);
    }

    public String getStateModel() {
        return getCOSObject().getString(COSName.STATE_MODEL);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationMarkup
    public void setCustomAppearanceHandler(PDAppearanceHandler pDAppearanceHandler) {
        this.customAppearanceHandler = pDAppearanceHandler;
    }

    public void setName(String str) {
        getCOSObject().setName(COSName.NAME, str);
    }

    public void setOpen(boolean z10) {
        getCOSObject().setBoolean(COSName.getPDFName("Open"), z10);
    }

    public void setState(String str) {
        getCOSObject().setString(COSName.STATE, str);
    }

    public void setStateModel(String str) {
        getCOSObject().setString(COSName.STATE_MODEL, str);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationMarkup, com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotation
    public void constructAppearances(PDDocument pDDocument) {
        PDAppearanceHandler pDAppearanceHandler = this.customAppearanceHandler;
        if (pDAppearanceHandler == null) {
            new PDTextAppearanceHandler(this, pDDocument).generateAppearanceStreams();
        } else {
            pDAppearanceHandler.generateAppearanceStreams();
        }
    }

    public PDAnnotationText(COSDictionary cOSDictionary) {
        super(cOSDictionary);
    }
}
