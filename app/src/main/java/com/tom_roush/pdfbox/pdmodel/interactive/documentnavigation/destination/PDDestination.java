package com.tom_roush.pdfbox.pdmodel.interactive.documentnavigation.destination;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSString;
import com.tom_roush.pdfbox.pdmodel.common.PDDestinationOrAction;
import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class PDDestination implements PDDestinationOrAction {
    public static PDDestination create(COSBase cOSBase) {
        PDNamedDestination pDNamedDestination;
        if (cOSBase == null) {
            return null;
        }
        if (cOSBase instanceof COSArray) {
            COSArray cOSArray = (COSArray) cOSBase;
            if (cOSArray.size() > 1 && (cOSArray.getObject(1) instanceof COSName)) {
                COSName cOSName = (COSName) cOSArray.getObject(1);
                String name = cOSName.getName();
                if (!name.equals("Fit") && !name.equals("FitB")) {
                    if (!name.equals("FitV") && !name.equals("FitBV")) {
                        if (name.equals("FitR")) {
                            return new PDPageFitRectangleDestination(cOSArray);
                        }
                        if (!name.equals("FitH") && !name.equals("FitBH")) {
                            if (name.equals("XYZ")) {
                                return new PDPageXYZDestination(cOSArray);
                            }
                            throw new IOException("Unknown destination type: " + cOSName.getName());
                        }
                        return new PDPageFitWidthDestination(cOSArray);
                    }
                    return new PDPageFitHeightDestination(cOSArray);
                }
                return new PDPageFitDestination(cOSArray);
            }
        }
        if (cOSBase instanceof COSString) {
            pDNamedDestination = new PDNamedDestination((COSString) cOSBase);
        } else if (cOSBase instanceof COSName) {
            pDNamedDestination = new PDNamedDestination((COSName) cOSBase);
        } else {
            throw new IOException("Error: can't convert to Destination " + cOSBase);
        }
        return pDNamedDestination;
    }
}
