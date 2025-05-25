package lib.zj.office.fc.hslf.model;

import lib.zj.office.fc.hslf.model.textproperties.TextProp;
import lib.zj.office.fc.hslf.record.SheetContainer;

/* loaded from: classes3.dex */
public abstract class MasterSheet extends Sheet {
    public MasterSheet(SheetContainer sheetContainer, int i10) {
        super(sheetContainer, i10);
    }

    public static boolean isPlaceholder(Shape shape) {
        if (!(shape instanceof TextShape) || ((TextShape) shape).getPlaceholderAtom() == null) {
            return false;
        }
        return true;
    }

    public abstract TextProp getStyleAttribute(int i10, int i11, String str, boolean z10);
}
