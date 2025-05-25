package com.tom_roush.pdfbox.pdmodel.interactive.action;

import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;

/* loaded from: classes2.dex */
public final class PDActionFactory {
    private PDActionFactory() {
    }

    public static PDAction createAction(COSDictionary cOSDictionary) {
        if (cOSDictionary != null) {
            String nameAsString = cOSDictionary.getNameAsString(COSName.S);
            if (PDActionJavaScript.SUB_TYPE.equals(nameAsString)) {
                return new PDActionJavaScript(cOSDictionary);
            }
            if (PDActionGoTo.SUB_TYPE.equals(nameAsString)) {
                return new PDActionGoTo(cOSDictionary);
            }
            if (PDActionLaunch.SUB_TYPE.equals(nameAsString)) {
                return new PDActionLaunch(cOSDictionary);
            }
            if (PDActionRemoteGoTo.SUB_TYPE.equals(nameAsString)) {
                return new PDActionRemoteGoTo(cOSDictionary);
            }
            if (PDActionURI.SUB_TYPE.equals(nameAsString)) {
                return new PDActionURI(cOSDictionary);
            }
            if (PDActionNamed.SUB_TYPE.equals(nameAsString)) {
                return new PDActionNamed(cOSDictionary);
            }
            if ("Sound".equals(nameAsString)) {
                return new PDActionSound(cOSDictionary);
            }
            if (PDActionMovie.SUB_TYPE.equals(nameAsString)) {
                return new PDActionMovie(cOSDictionary);
            }
            if (PDActionImportData.SUB_TYPE.equals(nameAsString)) {
                return new PDActionImportData(cOSDictionary);
            }
            if (PDActionResetForm.SUB_TYPE.equals(nameAsString)) {
                return new PDActionResetForm(cOSDictionary);
            }
            if (PDActionHide.SUB_TYPE.equals(nameAsString)) {
                return new PDActionHide(cOSDictionary);
            }
            if (PDActionSubmitForm.SUB_TYPE.equals(nameAsString)) {
                return new PDActionSubmitForm(cOSDictionary);
            }
            if (PDActionThread.SUB_TYPE.equals(nameAsString)) {
                return new PDActionThread(cOSDictionary);
            }
            if (PDActionEmbeddedGoTo.SUB_TYPE.equals(nameAsString)) {
                return new PDActionEmbeddedGoTo(cOSDictionary);
            }
        }
        return null;
    }
}
