package lib.zj.office.fc.openxml4j.util;

import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;

/* loaded from: classes3.dex */
public interface ZipEntrySource {
    void close();

    Enumeration<? extends ZipEntry> getEntries();

    InputStream getInputStream(ZipEntry zipEntry);
}
