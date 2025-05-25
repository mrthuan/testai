package lib.zj.office.fc.poifs.filesystem;

import java.io.InputStream;
import java.util.Iterator;
import lib.zj.office.fc.hpsf.ClassID;

/* loaded from: classes3.dex */
public interface DirectoryEntry extends Entry, Iterable<Entry> {
    DirectoryEntry createDirectory(String str);

    DocumentEntry createDocument(String str, int i10, POIFSWriterListener pOIFSWriterListener);

    DocumentEntry createDocument(String str, InputStream inputStream);

    Iterator<Entry> getEntries();

    Entry getEntry(String str);

    int getEntryCount();

    ClassID getStorageClsid();

    boolean hasEntry(String str);

    boolean isEmpty();

    void setStorageClsid(ClassID classID);
}
