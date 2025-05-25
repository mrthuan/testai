package lib.zj.office.fc.ss.usermodel;

import lib.zj.office.fc.ss.util.CellRangeAddressList;

/* loaded from: classes3.dex */
public interface DataValidation {

    /* loaded from: classes3.dex */
    public static final class ErrorStyle {
        public static final int INFO = 2;
        public static final int STOP = 0;
        public static final int WARNING = 1;
    }

    void createErrorBox(String str, String str2);

    void createPromptBox(String str, String str2);

    boolean getEmptyCellAllowed();

    String getErrorBoxText();

    String getErrorBoxTitle();

    int getErrorStyle();

    String getPromptBoxText();

    String getPromptBoxTitle();

    CellRangeAddressList getRegions();

    boolean getShowErrorBox();

    boolean getShowPromptBox();

    boolean getSuppressDropDownArrow();

    DataValidationConstraint getValidationConstraint();

    void setEmptyCellAllowed(boolean z10);

    void setErrorStyle(int i10);

    void setShowErrorBox(boolean z10);

    void setShowPromptBox(boolean z10);

    void setSuppressDropDownArrow(boolean z10);
}
