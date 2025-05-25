package lib.zj.office.fc.ss.usermodel;

/* loaded from: classes3.dex */
public interface Workbook {
    public static final int PICTURE_TYPE_DIB = 7;
    public static final int PICTURE_TYPE_EMF = 2;
    public static final int PICTURE_TYPE_JPEG = 5;
    public static final int PICTURE_TYPE_PICT = 4;
    public static final int PICTURE_TYPE_PNG = 6;
    public static final int PICTURE_TYPE_WMF = 3;
    public static final int SHEET_STATE_HIDDEN = 1;
    public static final int SHEET_STATE_VERY_HIDDEN = 2;
    public static final int SHEET_STATE_VISIBLE = 0;

    int getNumberOfSheets();

    Sheet getSheetAt(int i10);
}
