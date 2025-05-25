// Auto-fixed: added missing class declaration
public class PageOrder {
package lib.zj.office.fc.ss.usermodel;

/* loaded from: classes3.dex */
public enum PageOrder {
    DOWN_THEN_OVER(1),
    OVER_THEN_DOWN(2);
    
    private static PageOrder[] _table = new PageOrder[3];
    private int order;

    static {
        PageOrder[] values;
        for (PageOrder pageOrder : values()) {
            _table[pageOrder.getValue()] = pageOrder;
        }
    }

    PageOrder(int i10) {
        this.order = i10;
    }

    public int getValue() {
        return this.order;
    }

    public static PageOrder valueOf(int i10) {
        return _table[i10];
    }
}

}
