package com.tom_roush.pdfbox.pdmodel.interactive.action;

import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSBoolean;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.common.filespecification.PDFileSpecification;

/* loaded from: classes2.dex */
public class PDActionRemoteGoTo extends PDAction {
    public static final String SUB_TYPE = "GoToR";

    /* renamed from: com.tom_roush.pdfbox.pdmodel.interactive.action.PDActionRemoteGoTo$1  reason: invalid class name */
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

    public PDActionRemoteGoTo() {
        setSubType(SUB_TYPE);
    }

    public COSBase getD() {
        return this.action.getDictionaryObject(COSName.D);
    }

    public PDFileSpecification getFile() {
        return PDFileSpecification.createFS(this.action.getDictionaryObject(COSName.F));
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

    @Deprecated
    public String getS() {
        return this.action.getNameAsString(COSName.S);
    }

    public void setD(COSBase cOSBase) {
        this.action.setItem(COSName.D, cOSBase);
    }

    public void setFile(PDFileSpecification pDFileSpecification) {
        this.action.setItem(COSName.F, pDFileSpecification);
    }

    @Deprecated
    public void setOpenInNewWindow(boolean z10) {
        this.action.setBoolean(COSName.NEW_WINDOW, z10);
    }

    @Deprecated
    public void setS(String str) {
        this.action.setName(COSName.S, str);
    }

    @Deprecated
    public boolean shouldOpenInNewWindow() {
        return this.action.getBoolean(COSName.NEW_WINDOW, true);
    }

    public void setOpenInNewWindow(OpenMode openMode) {
        if (openMode == null) {
            getCOSObject().removeItem(COSName.NEW_WINDOW);
            return;
        }
        int i10 = AnonymousClass1.$SwitchMap$com$tom_roush$pdfbox$pdmodel$interactive$action$OpenMode[openMode.ordinal()];
        if (i10 == 1) {
            getCOSObject().removeItem(COSName.NEW_WINDOW);
        } else if (i10 == 2) {
            getCOSObject().setBoolean(COSName.NEW_WINDOW, false);
        } else if (i10 != 3) {
        } else {
            getCOSObject().setBoolean(COSName.NEW_WINDOW, true);
        }
    }

    public PDActionRemoteGoTo(COSDictionary cOSDictionary) {
        super(cOSDictionary);
    }
}
