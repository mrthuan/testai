package lib.zj.office.fc.openxml4j.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* loaded from: classes3.dex */
public class ZipInputStreamZipEntrySource implements ZipEntrySource {
    private ArrayList<FakeZipEntry> zipEntries = new ArrayList<>();

    /* loaded from: classes3.dex */
    public class EntryEnumerator implements Enumeration<ZipEntry> {
        private Iterator<? extends ZipEntry> iterator;

        public /* synthetic */ EntryEnumerator(ZipInputStreamZipEntrySource zipInputStreamZipEntrySource, int i10) {
            this();
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            return this.iterator.hasNext();
        }

        private EntryEnumerator() {
            this.iterator = ZipInputStreamZipEntrySource.this.zipEntries.iterator();
        }

        @Override // java.util.Enumeration
        public ZipEntry nextElement() {
            return this.iterator.next();
        }
    }

    /* loaded from: classes3.dex */
    public static class FakeZipEntry extends ZipEntry {
        private byte[] data;

        public FakeZipEntry(ZipEntry zipEntry, ZipInputStream zipInputStream) {
            super(zipEntry.getName());
            ByteArrayOutputStream byteArrayOutputStream;
            long size = zipEntry.getSize();
            if (size != -1) {
                if (size < 2147483647L) {
                    byteArrayOutputStream = new ByteArrayOutputStream((int) size);
                } else {
                    throw new IOException("ZIP entry size is too large");
                }
            } else {
                byteArrayOutputStream = new ByteArrayOutputStream();
            }
            byte[] bArr = new byte[4096];
            while (true) {
                int read = zipInputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    this.data = byteArrayOutputStream.toByteArray();
                    return;
                }
            }
        }

        public InputStream getInputStream() {
            return new ByteArrayInputStream(this.data);
        }
    }

    public ZipInputStreamZipEntrySource(ZipInputStream zipInputStream) {
        boolean z10 = true;
        while (z10) {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            if (nextEntry == null) {
                z10 = false;
            } else {
                FakeZipEntry fakeZipEntry = new FakeZipEntry(nextEntry, zipInputStream);
                zipInputStream.closeEntry();
                this.zipEntries.add(fakeZipEntry);
            }
        }
        zipInputStream.close();
    }

    @Override // lib.zj.office.fc.openxml4j.util.ZipEntrySource
    public void close() {
        this.zipEntries = null;
    }

    @Override // lib.zj.office.fc.openxml4j.util.ZipEntrySource
    public Enumeration<? extends ZipEntry> getEntries() {
        return new EntryEnumerator(this, 0);
    }

    @Override // lib.zj.office.fc.openxml4j.util.ZipEntrySource
    public InputStream getInputStream(ZipEntry zipEntry) {
        return ((FakeZipEntry) zipEntry).getInputStream();
    }
}
