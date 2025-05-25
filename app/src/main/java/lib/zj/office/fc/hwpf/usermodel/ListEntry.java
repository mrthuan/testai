package lib.zj.office.fc.hwpf.usermodel;

import lib.zj.office.fc.hwpf.model.ListFormatOverride;
import lib.zj.office.fc.hwpf.model.ListFormatOverrideLevel;
import lib.zj.office.fc.hwpf.model.ListTables;
import lib.zj.office.fc.hwpf.model.PAPX;
import lib.zj.office.fc.hwpf.model.POIListLevel;
import lib.zj.office.fc.util.POILogFactory;
import lib.zj.office.fc.util.POILogger;

/* loaded from: classes3.dex */
public final class ListEntry extends Paragraph {
    private static POILogger log = POILogFactory.getLogger(ListEntry.class);
    POIListLevel _level;
    ListFormatOverrideLevel _overrideLevel;

    public ListEntry(PAPX papx, Range range, ListTables listTables) {
        super(papx, range);
        if (listTables != null && this._props.getIlfo() < listTables.getOverrideCount()) {
            ListFormatOverride override = listTables.getOverride(this._props.getIlfo());
            this._overrideLevel = override.getOverrideLevel(this._props.getIlvl());
            this._level = listTables.getLevel(override.getLsid(), this._props.getIlvl());
            return;
        }
        log.log(POILogger.WARN, "No ListTables found for ListEntry - document probably partly corrupt, and you may experience problems");
    }

    @Override // lib.zj.office.fc.hwpf.usermodel.Paragraph, lib.zj.office.fc.hwpf.usermodel.Range
    public int type() {
        return 4;
    }
}
