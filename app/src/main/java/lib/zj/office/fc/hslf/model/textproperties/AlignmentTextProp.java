package lib.zj.office.fc.hslf.model.textproperties;

import lib.zj.office.fc.ss.util.CellUtil;

/* loaded from: classes3.dex */
public class AlignmentTextProp extends TextProp {
    public static final int CENTER = 1;
    public static final int JUSTIFY = 3;
    public static final int JUSTIFYLOW = 6;
    public static final int LEFT = 0;
    public static final int RIGHT = 2;
    public static final int THAIDISTRIBUTED = 5;

    public AlignmentTextProp() {
        super(2, 2048, CellUtil.ALIGNMENT);
    }
}
