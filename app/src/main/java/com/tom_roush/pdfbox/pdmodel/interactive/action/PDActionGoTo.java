package com.tom_roush.pdfbox.pdmodel.interactive.action;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.interactive.documentnavigation.destination.PDDestination;
import com.tom_roush.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageDestination;

/* loaded from: classes2.dex */
public class PDActionGoTo extends PDAction {
    public static final String SUB_TYPE = "GoTo";

    public PDActionGoTo() {
        setSubType(SUB_TYPE);
    }

    public PDDestination getDestination() {
        return PDDestination.create(getCOSObject().getDictionaryObject(COSName.D));
    }

    public void setDestination(PDDestination pDDestination) {
        if (pDDestination instanceof PDPageDestination) {
            COSArray cOSObject = ((PDPageDestination) pDDestination).getCOSObject();
            if (cOSObject.size() >= 1 && !(cOSObject.getObject(0) instanceof COSDictionary)) {
                throw new IllegalArgumentException("Destination of a GoTo action must be a page dictionary object");
            }
        }
        getCOSObject().setItem(COSName.D, pDDestination);
    }

    public PDActionGoTo(COSDictionary cOSDictionary) {
        super(cOSDictionary);
    }
}
