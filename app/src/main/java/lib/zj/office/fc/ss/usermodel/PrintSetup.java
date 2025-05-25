package lib.zj.office.fc.ss.usermodel;

/* loaded from: classes3.dex */
public interface PrintSetup {
    public static final short A3_PAPERSIZE = 8;
    public static final short A4_EXTRA_PAPERSIZE = 53;
    public static final short A4_PAPERSIZE = 9;
    public static final short A4_PLUS_PAPERSIZE = 60;
    public static final short A4_ROTATED_PAPERSIZE = 77;
    public static final short A4_SMALL_PAPERSIZE = 10;
    public static final short A4_TRANSVERSE_PAPERSIZE = 55;
    public static final short A5_PAPERSIZE = 11;
    public static final short B4_PAPERSIZE = 12;
    public static final short B5_PAPERSIZE = 13;
    public static final short ELEVEN_BY_SEVENTEEN_PAPERSIZE = 17;
    public static final short ENVELOPE_10_PAPERSIZE = 20;
    public static final short ENVELOPE_9_PAPERSIZE = 19;
    public static final short ENVELOPE_C3_PAPERSIZE = 29;
    public static final short ENVELOPE_C4_PAPERSIZE = 30;
    public static final short ENVELOPE_C5_PAPERSIZE = 28;
    public static final short ENVELOPE_C6_PAPERSIZE = 31;
    public static final short ENVELOPE_CS_PAPERSIZE = 28;
    public static final short ENVELOPE_DL_PAPERSIZE = 27;
    public static final short ENVELOPE_MONARCH_PAPERSIZE = 37;
    public static final short EXECUTIVE_PAPERSIZE = 7;
    public static final short FOLIO8_PAPERSIZE = 14;
    public static final short LEDGER_PAPERSIZE = 4;
    public static final short LEGAL_PAPERSIZE = 5;
    public static final short LETTER_PAPERSIZE = 1;
    public static final short LETTER_ROTATED_PAPERSIZE = 75;
    public static final short LETTER_SMALL_PAGESIZE = 2;
    public static final short NOTE8_PAPERSIZE = 18;
    public static final short QUARTO_PAPERSIZE = 15;
    public static final short STATEMENT_PAPERSIZE = 6;
    public static final short TABLOID_PAPERSIZE = 3;
    public static final short TEN_BY_FOURTEEN_PAPERSIZE = 16;

    short getCopies();

    boolean getDraft();

    short getFitHeight();

    short getFitWidth();

    double getFooterMargin();

    short getHResolution();

    double getHeaderMargin();

    boolean getLandscape();

    boolean getLeftToRight();

    boolean getNoColor();

    boolean getNoOrientation();

    boolean getNotes();

    short getPageStart();

    short getPaperSize();

    short getScale();

    boolean getUsePage();

    short getVResolution();

    boolean getValidSettings();

    void setCopies(short s4);

    void setDraft(boolean z10);

    void setFitHeight(short s4);

    void setFitWidth(short s4);

    void setFooterMargin(double d10);

    void setHResolution(short s4);

    void setHeaderMargin(double d10);

    void setLandscape(boolean z10);

    void setLeftToRight(boolean z10);

    void setNoColor(boolean z10);

    void setNoOrientation(boolean z10);

    void setNotes(boolean z10);

    void setPageStart(short s4);

    void setPaperSize(short s4);

    void setScale(short s4);

    void setUsePage(boolean z10);

    void setVResolution(short s4);

    void setValidSettings(boolean z10);
}
