package lib.zj.office.fc.hssf.util;

/* loaded from: classes3.dex */
public class HSSFPaneInformation {
    public static final byte PANE_LOWER_LEFT = 2;
    public static final byte PANE_LOWER_RIGHT = 0;
    public static final byte PANE_UPPER_LEFT = 3;
    public static final byte PANE_UPPER_RIGHT = 1;
    private byte activePane;
    private boolean frozen;
    private short leftColumn;
    private short topRow;

    /* renamed from: x  reason: collision with root package name */
    private short f20673x;

    /* renamed from: y  reason: collision with root package name */
    private short f20674y;

    public HSSFPaneInformation(short s4, short s10, short s11, short s12, byte b10, boolean z10) {
        this.f20673x = s4;
        this.f20674y = s10;
        this.topRow = s11;
        this.leftColumn = s12;
        this.activePane = b10;
        this.frozen = z10;
    }

    public byte getActivePane() {
        return this.activePane;
    }

    public short getHorizontalSplitPosition() {
        return this.f20674y;
    }

    public short getHorizontalSplitTopRow() {
        return this.topRow;
    }

    public short getVerticalSplitLeftColumn() {
        return this.leftColumn;
    }

    public short getVerticalSplitPosition() {
        return this.f20673x;
    }

    public boolean isFreezePane() {
        return this.frozen;
    }
}
