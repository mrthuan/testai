package lib.zj.office.fc.ss.usermodel;

import java.util.Iterator;

/* loaded from: classes3.dex */
public interface IRow extends Iterable<ICell> {
    public static final MissingCellPolicy RETURN_NULL_AND_BLANK = new MissingCellPolicy(0);
    public static final MissingCellPolicy RETURN_BLANK_AS_NULL = new MissingCellPolicy(0);
    public static final MissingCellPolicy CREATE_NULL_AS_BLANK = new MissingCellPolicy(0);

    /* loaded from: classes3.dex */
    public static final class MissingCellPolicy {
        private static int NEXT_ID = 1;

        /* renamed from: id  reason: collision with root package name */
        public final int f20687id;

        public /* synthetic */ MissingCellPolicy(int i10) {
            this();
        }

        private MissingCellPolicy() {
            int i10 = NEXT_ID;
            NEXT_ID = i10 + 1;
            this.f20687id = i10;
        }
    }

    Iterator<ICell> cellIterator();

    ICell createCell(int i10);

    ICell createCell(int i10, int i11);

    ICell getCell(int i10);

    ICell getCell(int i10, MissingCellPolicy missingCellPolicy);

    short getFirstCellNum();

    short getHeight();

    float getHeightInPoints();

    short getLastCellNum();

    int getPhysicalNumberOfCells();

    int getRowNum();

    ICellStyle getRowStyle();

    Sheet getSheet();

    boolean getZeroHeight();

    boolean isFormatted();

    void removeCell(ICell iCell);

    void setHeight(short s4);

    void setHeightInPoints(float f10);

    void setRowNum(int i10);

    void setRowStyle(ICellStyle iCellStyle);

    void setZeroHeight(boolean z10);
}
