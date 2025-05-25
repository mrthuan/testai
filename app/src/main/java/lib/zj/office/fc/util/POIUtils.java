package lib.zj.office.fc.util;

import java.util.Iterator;
import java.util.List;
import lib.zj.office.fc.poifs.filesystem.DirectoryEntry;
import lib.zj.office.fc.poifs.filesystem.DocumentEntry;
import lib.zj.office.fc.poifs.filesystem.DocumentInputStream;
import lib.zj.office.fc.poifs.filesystem.Entry;
import lib.zj.office.fc.poifs.filesystem.POIFSFileSystem;

@Internal
/* loaded from: classes3.dex */
public class POIUtils {
    @Internal
    public static void copyNodeRecursively(Entry entry, DirectoryEntry directoryEntry) {
        if (entry.isDirectoryEntry()) {
            DirectoryEntry createDirectory = directoryEntry.createDirectory(entry.getName());
            Iterator<Entry> entries = ((DirectoryEntry) entry).getEntries();
            while (entries.hasNext()) {
                copyNodeRecursively(entries.next(), createDirectory);
            }
            return;
        }
        DocumentEntry documentEntry = (DocumentEntry) entry;
        DocumentInputStream documentInputStream = new DocumentInputStream(documentEntry);
        directoryEntry.createDocument(documentEntry.getName(), documentInputStream);
        documentInputStream.close();
    }

    public static void copyNodes(DirectoryEntry directoryEntry, DirectoryEntry directoryEntry2, List<String> list) {
        Iterator<Entry> entries = directoryEntry.getEntries();
        while (entries.hasNext()) {
            Entry next = entries.next();
            if (!list.contains(next.getName())) {
                copyNodeRecursively(next, directoryEntry2);
            }
        }
    }

    public static void copyNodes(POIFSFileSystem pOIFSFileSystem, POIFSFileSystem pOIFSFileSystem2, List<String> list) {
        copyNodes(pOIFSFileSystem.getRoot(), pOIFSFileSystem2.getRoot(), list);
    }
}
