package lib.zj.office.fc.openxml4j.util;

import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes3.dex */
public class ZipFileZipEntrySource implements ZipEntrySource {
    private ZipFile zipArchive;

    public ZipFileZipEntrySource(ZipFile zipFile) {
        this.zipArchive = zipFile;
    }

    @Override // lib.zj.office.fc.openxml4j.util.ZipEntrySource
    public void close() {
        this.zipArchive.close();
        this.zipArchive = null;
    }

    @Override // lib.zj.office.fc.openxml4j.util.ZipEntrySource
    public Enumeration<? extends ZipEntry> getEntries() {
        return this.zipArchive.entries();
    }

    @Override // lib.zj.office.fc.openxml4j.util.ZipEntrySource
    public InputStream getInputStream(ZipEntry zipEntry) {
        return this.zipArchive.getInputStream(zipEntry);
    }
}
