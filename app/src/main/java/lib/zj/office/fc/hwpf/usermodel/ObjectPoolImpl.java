package lib.zj.office.fc.hwpf.usermodel;

import java.io.FileNotFoundException;
import lib.zj.office.fc.poifs.filesystem.DirectoryEntry;
import lib.zj.office.fc.poifs.filesystem.Entry;
import lib.zj.office.fc.util.Internal;
import lib.zj.office.fc.util.POIUtils;

@Internal
/* loaded from: classes3.dex */
public class ObjectPoolImpl implements ObjectsPool {
    private DirectoryEntry _objectPool;

    public ObjectPoolImpl(DirectoryEntry directoryEntry) {
        this._objectPool = directoryEntry;
    }

    @Override // lib.zj.office.fc.hwpf.usermodel.ObjectsPool
    public Entry getObjectById(String str) {
        DirectoryEntry directoryEntry = this._objectPool;
        if (directoryEntry == null) {
            return null;
        }
        try {
            return directoryEntry.getEntry(str);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    @Internal
    public void writeTo(DirectoryEntry directoryEntry) {
        DirectoryEntry directoryEntry2 = this._objectPool;
        if (directoryEntry2 != null) {
            POIUtils.copyNodeRecursively(directoryEntry2, directoryEntry);
        }
    }
}
