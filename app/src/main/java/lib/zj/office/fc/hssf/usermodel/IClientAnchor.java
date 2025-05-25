package lib.zj.office.fc.hssf.usermodel;

/* loaded from: classes3.dex */
public interface IClientAnchor {
    public static final int DONT_MOVE_AND_RESIZE = 3;
    public static final int MOVE_AND_RESIZE = 0;
    public static final int MOVE_DONT_RESIZE = 2;

    int getAnchorType();

    short getCol1();

    short getCol2();

    int getDx1();

    int getDx2();

    int getDy1();

    int getDy2();

    int getRow1();

    int getRow2();

    void setAnchorType(int i10);

    void setCol1(int i10);

    void setCol2(int i10);

    void setDx1(int i10);

    void setDx2(int i10);

    void setDy1(int i10);

    void setDy2(int i10);

    void setRow1(int i10);

    void setRow2(int i10);
}
