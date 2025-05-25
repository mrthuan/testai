package lib.zj.office.fc.hslf.record;

import java.util.LinkedList;
import lib.zj.office.fc.hslf.model.textproperties.AutoNumberTextProp;

/* loaded from: classes3.dex */
public abstract class RecordAtom extends Record {
    @Override // lib.zj.office.fc.hslf.record.Record
    public Record[] getChildRecords() {
        return null;
    }

    public LinkedList<AutoNumberTextProp> getExtendedParagraphPropList() {
        return null;
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public boolean isAnAtom() {
        return true;
    }
}
