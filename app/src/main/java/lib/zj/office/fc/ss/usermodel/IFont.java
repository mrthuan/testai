package lib.zj.office.fc.ss.usermodel;

/* loaded from: classes3.dex */
public interface IFont {
    public static final byte ANSI_CHARSET = 0;
    public static final short BOLDWEIGHT_BOLD = 700;
    public static final short BOLDWEIGHT_NORMAL = 400;
    public static final short COLOR_NORMAL = Short.MAX_VALUE;
    public static final short COLOR_RED = 10;
    public static final byte DEFAULT_CHARSET = 1;
    public static final short SS_NONE = 0;
    public static final short SS_SUB = 2;
    public static final short SS_SUPER = 1;
    public static final byte SYMBOL_CHARSET = 2;
    public static final byte U_DOUBLE = 2;
    public static final byte U_DOUBLE_ACCOUNTING = 34;
    public static final byte U_NONE = 0;
    public static final byte U_SINGLE = 1;
    public static final byte U_SINGLE_ACCOUNTING = 33;

    short getBoldweight();

    int getCharSet();

    short getColor();

    short getFontHeight();

    short getFontHeightInPoints();

    String getFontName();

    short getIndex();

    boolean getItalic();

    boolean getStrikeout();

    short getTypeOffset();

    byte getUnderline();

    void setBoldweight(short s4);

    void setCharSet(byte b10);

    void setCharSet(int i10);

    void setColor(short s4);

    void setFontHeight(short s4);

    void setFontHeightInPoints(short s4);

    void setFontName(String str);

    void setItalic(boolean z10);

    void setStrikeout(boolean z10);

    void setTypeOffset(short s4);

    void setUnderline(byte b10);
}
