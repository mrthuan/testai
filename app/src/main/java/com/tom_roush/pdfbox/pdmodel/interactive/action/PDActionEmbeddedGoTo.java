package com.tom_roush.pdfbox.pdmodel.interactive.action;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSBoolean;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.common.filespecification.PDFileSpecification;
import com.tom_roush.pdfbox.pdmodel.interactive.documentnavigation.destination.PDDestination;
import com.tom_roush.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageDestination;

/* loaded from: classes2.dex */
public class PDActionEmbeddedGoTo extends PDAction {
    public static final String SUB_TYPE = "GoToE";

    /* renamed from: com.tom_roush.pdfbox.pdmodel.interactive.action.PDActionEmbeddedGoTo$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$tom_roush$pdfbox$pdmodel$interactive$action$OpenMode;

        static {
            int[] iArr = new int[OpenMode.values().length];
            $SwitchMap$com$tom_roush$pdfbox$pdmodel$interactive$action$OpenMode = iArr;
            try {
                iArr[OpenMode.USER_PREFERENCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$tom_roush$pdfbox$pdmodel$interactive$action$OpenMode[OpenMode.SAME_WINDOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$tom_roush$pdfbox$pdmodel$interactive$action$OpenMode[OpenMode.NEW_WINDOW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public PDActionEmbeddedGoTo() {
        setSubType(SUB_TYPE);
    }

    public PDDestination getDestination() {
        return PDDestination.create(getCOSObject().getDictionaryObject(COSName.D));
    }

    public PDFileSpecification getFile() {
        return PDFileSpecification.createFS(getCOSObject().getDictionaryObject(COSName.F));
    }

    public OpenMode getOpenInNewWindow() {
        COSDictionary cOSObject = getCOSObject();
        COSName cOSName = COSName.NEW_WINDOW;
        if (cOSObject.getDictionaryObject(cOSName) instanceof COSBoolean) {
            if (((COSBoolean) getCOSObject().getDictionaryObject(cOSName)).getValue()) {
                return OpenMode.NEW_WINDOW;
            }
            return OpenMode.SAME_WINDOW;
        }
        return OpenMode.USER_PREFERENCE;
    }

    public PDTargetDirectory getTargetDirectory() {
        COSBase dictionaryObject = getCOSObject().getDictionaryObject(COSName.T);
        if (dictionaryObject instanceof COSDictionary) {
            return new PDTargetDirectory((COSDictionary) dictionaryObject);
        }
        return null;
    }

    public void setDestination(PDDestination pDDestination) {
        if (pDDestination instanceof PDPageDestination) {
            COSArray cOSObject = ((PDPageDestination) pDDestination).getCOSObject();
            if (cOSObject.size() >= 1 && !(cOSObject.getObject(0) instanceof COSDictionary)) {
                throw new IllegalArgumentException("Destination of a GoToE action must be a page dictionary object");
            }
        }
        getCOSObject().setItem(COSName.D, pDDestination);
    }

    public void setFile(PDFileSpecification pDFileSpecification) {
        getCOSObject().setItem(COSName.F, pDFileSpecification);
    }

    public void setOpenInNewWindow(OpenMode openMode) {
        if (openMode == null) {
            getCOSObject().removeItem(COSName.NEW_WINDOW);
            return;
        }
        int i10 = AnonymousClass1.$SwitchMap$com$tom_roush$pdfbox$pdmodel$interactive$action$OpenMode[openMode.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    getCOSObject().setBoolean(COSName.NEW_WINDOW, true);
                    return;
                }
                return;
            }
            getCOSObject().setBoolean(COSName.NEW_WINDOW, false);
            return;
        }
        getCOSObject().removeItem(COSName.NEW_WINDOW);
    }

    public void setTargetDirectory(PDTargetDirectory pDTargetDirectory) {
        getCOSObject().setItem(COSName.T, pDTargetDirectory);
    }

    public PDActionEmbeddedGoTo(COSDictionary cOSDictionary) {
        super(cOSDictionary);
    }
}
