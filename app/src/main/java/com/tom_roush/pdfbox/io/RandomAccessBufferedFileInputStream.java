package com.tom_roush.pdfbox.io;

import java.io.EOFException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class RandomAccessBufferedFileInputStream extends InputStream implements RandomAccessRead {
    private static final String TMP_FILE_PREFIX = "tmpPDFBox";
    private byte[] curPage;
    private long curPageOffset;
    private final long fileLength;
    private long fileOffset;
    private boolean isClosed;
    private byte[] lastRemovedCachePage;
    private int maxCachedPages;
    private int offsetWithinPage;
    private final Map<Long, byte[]> pageCache;
    private long pageOffsetMask;
    private int pageSize;
    private int pageSizeShift;
    private final java.io.RandomAccessFile raFile;
    private File tempFile;

    public RandomAccessBufferedFileInputStream(String str) {
        this(new File(str));
    }

    private File createTmpFile(InputStream inputStream) {
        FileOutputStream fileOutputStream;
        Throwable th2;
        File createTempFile;
        try {
            createTempFile = File.createTempFile(TMP_FILE_PREFIX, ".pdf");
            fileOutputStream = new FileOutputStream(createTempFile);
        } catch (Throwable th3) {
            fileOutputStream = null;
            th2 = th3;
        }
        try {
            IOUtils.copy(inputStream, fileOutputStream);
            IOUtils.closeQuietly(inputStream);
            IOUtils.closeQuietly(fileOutputStream);
            return createTempFile;
        } catch (Throwable th4) {
            th2 = th4;
            IOUtils.closeQuietly(inputStream);
            IOUtils.closeQuietly(fileOutputStream);
            throw th2;
        }
    }

    private void deleteTempFile() {
        File file = this.tempFile;
        if (file != null) {
            file.delete();
        }
    }

    private byte[] readPage() {
        int read;
        byte[] bArr = this.lastRemovedCachePage;
        if (bArr != null) {
            this.lastRemovedCachePage = null;
        } else {
            bArr = new byte[this.pageSize];
        }
        int i10 = 0;
        while (true) {
            int i11 = this.pageSize;
            if (i10 >= i11 || (read = this.raFile.read(bArr, i10, i11 - i10)) < 0) {
                break;
            }
            i10 += read;
        }
        return bArr;
    }

    @Override // java.io.InputStream, com.tom_roush.pdfbox.io.RandomAccessRead
    public int available() {
        return (int) Math.min(this.fileLength - this.fileOffset, 2147483647L);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.raFile.close();
        deleteTempFile();
        this.pageCache.clear();
        this.isClosed = true;
    }

    @Override // com.tom_roush.pdfbox.io.RandomAccessRead
    public long getPosition() {
        return this.fileOffset;
    }

    @Override // com.tom_roush.pdfbox.io.RandomAccessRead
    public boolean isClosed() {
        return this.isClosed;
    }

    @Override // com.tom_roush.pdfbox.io.RandomAccessRead
    public boolean isEOF() {
        if (peek() == -1) {
            return true;
        }
        return false;
    }

    @Override // com.tom_roush.pdfbox.io.RandomAccessRead
    public long length() {
        return this.fileLength;
    }

    @Override // com.tom_roush.pdfbox.io.RandomAccessRead
    public int peek() {
        int read = read();
        if (read != -1) {
            rewind(1);
        }
        return read;
    }

    @Override // java.io.InputStream, com.tom_roush.pdfbox.io.RandomAccessRead
    public int read() {
        long j10 = this.fileOffset;
        if (j10 >= this.fileLength) {
            return -1;
        }
        if (this.offsetWithinPage == this.pageSize) {
            seek(j10);
        }
        this.fileOffset++;
        byte[] bArr = this.curPage;
        int i10 = this.offsetWithinPage;
        this.offsetWithinPage = i10 + 1;
        return bArr[i10] & 255;
    }

    @Override // com.tom_roush.pdfbox.io.RandomAccessRead
    public byte[] readFully(int i10) {
        byte[] bArr = new byte[i10];
        int i11 = 0;
        do {
            int read = read(bArr, i11, i10 - i11);
            if (read >= 0) {
                i11 += read;
            } else {
                throw new EOFException();
            }
        } while (i11 < i10);
        return bArr;
    }

    @Override // com.tom_roush.pdfbox.io.RandomAccessRead
    public void rewind(int i10) {
        seek(getPosition() - i10);
    }

    @Override // com.tom_roush.pdfbox.io.RandomAccessRead
    public void seek(long j10) {
        long j11 = this.pageOffsetMask & j10;
        if (j11 != this.curPageOffset) {
            byte[] bArr = this.pageCache.get(Long.valueOf(j11));
            if (bArr == null) {
                this.raFile.seek(j11);
                bArr = readPage();
                this.pageCache.put(Long.valueOf(j11), bArr);
            }
            this.curPageOffset = j11;
            this.curPage = bArr;
        }
        this.offsetWithinPage = (int) (j10 - this.curPageOffset);
        this.fileOffset = j10;
    }

    @Override // java.io.InputStream
    public long skip(long j10) {
        long j11 = this.fileLength;
        long j12 = this.fileOffset;
        if (j11 - j12 < j10) {
            j10 = j11 - j12;
        }
        int i10 = this.pageSize;
        if (j10 < i10) {
            int i11 = this.offsetWithinPage;
            if (i11 + j10 <= i10) {
                this.offsetWithinPage = (int) (i11 + j10);
                this.fileOffset = j12 + j10;
                return j10;
            }
        }
        seek(j12 + j10);
        return j10;
    }

    public RandomAccessBufferedFileInputStream(File file) {
        this.pageSizeShift = 12;
        this.pageSize = 1 << 12;
        this.pageOffsetMask = (-1) << 12;
        this.maxCachedPages = 1000;
        this.lastRemovedCachePage = null;
        this.pageCache = new LinkedHashMap<Long, byte[]>(this.maxCachedPages, 0.75f, true) { // from class: com.tom_roush.pdfbox.io.RandomAccessBufferedFileInputStream.1
            private static final long serialVersionUID = -6302488539257741101L;

            @Override // java.util.LinkedHashMap
            public boolean removeEldestEntry(Map.Entry<Long, byte[]> entry) {
                boolean z10;
                if (size() > RandomAccessBufferedFileInputStream.this.maxCachedPages) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    RandomAccessBufferedFileInputStream.this.lastRemovedCachePage = entry.getValue();
                }
                return z10;
            }
        };
        this.curPageOffset = -1L;
        this.curPage = new byte[this.pageSize];
        this.offsetWithinPage = 0;
        this.fileOffset = 0L;
        this.raFile = new java.io.RandomAccessFile(file, "r");
        this.fileLength = file.length();
        seek(0L);
    }

    @Override // java.io.InputStream, com.tom_roush.pdfbox.io.RandomAccessRead
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream, com.tom_roush.pdfbox.io.RandomAccessRead
    public int read(byte[] bArr, int i10, int i11) {
        long j10 = this.fileOffset;
        if (j10 >= this.fileLength) {
            return -1;
        }
        if (this.offsetWithinPage == this.pageSize) {
            seek(j10);
        }
        int min = Math.min(this.pageSize - this.offsetWithinPage, i11);
        long j11 = this.fileLength;
        long j12 = this.fileOffset;
        if (j11 - j12 < this.pageSize) {
            min = Math.min(min, (int) (j11 - j12));
        }
        System.arraycopy(this.curPage, this.offsetWithinPage, bArr, i10, min);
        this.offsetWithinPage += min;
        this.fileOffset += min;
        return min;
    }

    public RandomAccessBufferedFileInputStream(InputStream inputStream) {
        this.pageSizeShift = 12;
        this.pageSize = 1 << 12;
        this.pageOffsetMask = (-1) << 12;
        this.maxCachedPages = 1000;
        this.lastRemovedCachePage = null;
        this.pageCache = new LinkedHashMap<Long, byte[]>(this.maxCachedPages, 0.75f, true) { // from class: com.tom_roush.pdfbox.io.RandomAccessBufferedFileInputStream.1
            private static final long serialVersionUID = -6302488539257741101L;

            @Override // java.util.LinkedHashMap
            public boolean removeEldestEntry(Map.Entry<Long, byte[]> entry) {
                boolean z10;
                if (size() > RandomAccessBufferedFileInputStream.this.maxCachedPages) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    RandomAccessBufferedFileInputStream.this.lastRemovedCachePage = entry.getValue();
                }
                return z10;
            }
        };
        this.curPageOffset = -1L;
        this.curPage = new byte[this.pageSize];
        this.offsetWithinPage = 0;
        this.fileOffset = 0L;
        File createTmpFile = createTmpFile(inputStream);
        this.tempFile = createTmpFile;
        this.fileLength = createTmpFile.length();
        this.raFile = new java.io.RandomAccessFile(this.tempFile, "r");
        seek(0L);
    }
}
