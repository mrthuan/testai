package com.tom_roush.pdfbox.pdmodel.interactive.action;

import com.tom_roush.pdfbox.cos.COSBoolean;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.common.filespecification.PDFileSpecification;

/* loaded from: classes2.dex */
public class PDActionLaunch extends PDAction {
    public static final String SUB_TYPE = "Launch";

    /* renamed from: com.tom_roush.pdfbox.pdmodel.interactive.action.PDActionLaunch$1  reason: invalid class name */
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

    public PDActionLaunch() {
        setSubType(SUB_TYPE);
    }

    public String getD() {
        return this.action.getString(COSName.D);
    }

    public String getF() {
        return this.action.getString(COSName.F);
    }

    public PDFileSpecification getFile() {
        return PDFileSpecification.createFS(getCOSObject().getDictionaryObject(COSName.F));
    }

    public String getO() {
        return this.action.getString(COSName.O);
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

    public String getP() {
        return this.action.getString(COSName.P);
    }

    public PDWindowsLaunchParams getWinLaunchParams() {
        COSDictionary cOSDictionary = (COSDictionary) this.action.getDictionaryObject("Win");
        if (cOSDictionary != null) {
            return new PDWindowsLaunchParams(cOSDictionary);
        }
        return null;
    }

    public void setD(String str) {
        this.action.setString(COSName.D, str);
    }

    public void setF(String str) {
        this.action.setString(COSName.F, str);
    }

    public void setFile(PDFileSpecification pDFileSpecification) {
        getCOSObject().setItem(COSName.F, pDFileSpecification);
    }

    public void setO(String str) {
        this.action.setString(COSName.O, str);
    }

    @Deprecated
    public void setOpenInNewWindow(boolean z10) {
        this.action.setBoolean(COSName.NEW_WINDOW, z10);
    }

    public void setP(String str) {
        this.action.setString(COSName.P, str);
    }

    public void setWinLaunchParams(PDWindowsLaunchParams pDWindowsLaunchParams) {
        this.action.setItem("Win", pDWindowsLaunchParams);
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

    public PDActionLaunch(COSDictionary cOSDictionary) {
        super(cOSDictionary);
    }
}
