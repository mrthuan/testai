// Auto-fixed: added missing class declaration
public class PrintCellComments {
package lib.zj.office.fc.ss.usermodel;

/* loaded from: classes3.dex */
public enum PrintCellComments {
    NONE(1),
    AS_DISPLAYED(2),
    AT_END(3);
    
    private static PrintCellComments[] _table = new PrintCellComments[4];
    private int comments;

    static {
        PrintCellComments[] values;
        for (PrintCellComments printCellComments : values()) {
            _table[printCellComments.getValue()] = printCellComments;
        }
    }

    PrintCellComments(int i10) {
        this.comments = i10;
    }

    public int getValue() {
        return this.comments;
    }

    public static PrintCellComments valueOf(int i10) {
        return _table[i10];
    }
}

}
