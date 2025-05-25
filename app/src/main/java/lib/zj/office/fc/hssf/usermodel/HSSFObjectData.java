package lib.zj.office.fc.hssf.usermodel;

import a6.h;
import java.io.IOException;
import lib.zj.office.fc.hssf.record.EmbeddedObjectRefSubRecord;
import lib.zj.office.fc.hssf.record.ObjRecord;
import lib.zj.office.fc.hssf.record.SubRecord;
import lib.zj.office.fc.poifs.filesystem.DirectoryEntry;
import lib.zj.office.fc.poifs.filesystem.Entry;
import lib.zj.office.fc.util.HexDump;

/* loaded from: classes3.dex */
public final class HSSFObjectData {
    private final ObjRecord _record;
    private final DirectoryEntry _root;

    public HSSFObjectData(ObjRecord objRecord, DirectoryEntry directoryEntry) {
        this._record = objRecord;
        this._root = directoryEntry;
    }

    public EmbeddedObjectRefSubRecord findObjectRecord() {
        for (SubRecord subRecord : this._record.getSubRecords()) {
            if (subRecord instanceof EmbeddedObjectRefSubRecord) {
                return (EmbeddedObjectRefSubRecord) subRecord;
            }
        }
        throw new IllegalStateException("Object data does not contain a reference to an embedded object OLE2 directory");
    }

    public DirectoryEntry getDirectory() {
        int intValue = findObjectRecord().getStreamId().intValue();
        String str = "MBD" + HexDump.toHex(intValue);
        Entry entry = this._root.getEntry(str);
        if (entry instanceof DirectoryEntry) {
            return (DirectoryEntry) entry;
        }
        throw new IOException(h.d("Stream ", str, " was not an OLE2 directory"));
    }

    public String getOLE2ClassName() {
        return findObjectRecord().getOLEClassName();
    }

    public byte[] getObjectData() {
        return findObjectRecord().getObjectData();
    }

    public boolean hasDirectoryEntry() {
        Integer streamId = findObjectRecord().getStreamId();
        if (streamId != null && streamId.intValue() != 0) {
            return true;
        }
        return false;
    }
}
