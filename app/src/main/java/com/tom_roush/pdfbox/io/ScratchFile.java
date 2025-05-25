package com.tom_roush.pdfbox.io;

import a0.a;
import a6.h;
import androidx.appcompat.view.menu.d;
import com.google.android.gms.common.api.Api;
import com.tom_roush.pdfbox.android.PDFBoxConfig;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.BitSet;
import java.util.Objects;

/* loaded from: classes2.dex */
public class ScratchFile implements Closeable {
    private static final int ENLARGE_PAGE_COUNT = 16;
    private static final int INIT_UNRESTRICTED_MAINMEM_PAGECOUNT = 100000;
    private static final int PAGE_SIZE = 4096;
    private File file;
    private final BitSet freePages;
    private final int inMemoryMaxPageCount;
    private volatile byte[][] inMemoryPages;
    private final Object ioLock;
    private volatile boolean isClosed;
    private final boolean maxMainMemoryIsRestricted;
    private final int maxPageCount;
    private volatile int pageCount;
    private java.io.RandomAccessFile raf;
    private final File scratchFileDirectory;
    private final boolean useScratchFile;

    public ScratchFile(File file) {
        this(MemoryUsageSetting.setupTempFileOnly().setTempDir(file));
    }

    private void enlarge() {
        synchronized (this.ioLock) {
            checkClosed();
            if (this.pageCount >= this.maxPageCount) {
                return;
            }
            if (this.useScratchFile) {
                if (this.raf == null) {
                    this.file = File.createTempFile("PDFBox", ".tmp", this.scratchFileDirectory);
                    try {
                        this.raf = new java.io.RandomAccessFile(this.file, "rw");
                    } catch (IOException e10) {
                        if (!this.file.delete()) {
                            this.file.getAbsolutePath();
                        }
                        throw e10;
                    }
                }
                long length = this.raf.length();
                long j10 = (this.pageCount - this.inMemoryMaxPageCount) * 4096;
                if (j10 == length) {
                    if (this.pageCount + 16 > this.pageCount) {
                        if (PDFBoxConfig.isDebugEnabled()) {
                            Objects.toString(this.file);
                            this.raf.length();
                            this.file.length();
                        }
                        long j11 = length + 65536;
                        this.raf.setLength(j11);
                        if (PDFBoxConfig.isDebugEnabled()) {
                            this.raf.length();
                            this.file.length();
                        }
                        if (j11 != this.raf.length()) {
                            long filePointer = this.raf.getFilePointer();
                            this.raf.seek(j11 - 1);
                            this.raf.write(0);
                            this.raf.seek(filePointer);
                            this.raf.length();
                            this.file.length();
                        }
                        this.freePages.set(this.pageCount, this.pageCount + 16);
                    }
                } else {
                    throw new IOException("Expected scratch file size of " + j10 + " but found " + length + " in file " + this.file);
                }
            } else if (!this.maxMainMemoryIsRestricted) {
                int length2 = this.inMemoryPages.length;
                int min = (int) Math.min(length2 * 2, 2147483647L);
                if (min > length2) {
                    byte[][] bArr = new byte[min];
                    System.arraycopy(this.inMemoryPages, 0, bArr, 0, length2);
                    this.inMemoryPages = bArr;
                    this.freePages.set(length2, min);
                }
            }
        }
    }

    public static ScratchFile getMainMemoryOnlyInstance() {
        try {
            return new ScratchFile(MemoryUsageSetting.setupMainMemoryOnly());
        } catch (IOException e10) {
            e10.getMessage();
            return null;
        }
    }

    public void checkClosed() {
        if (!this.isClosed) {
            return;
        }
        throw new IOException("Scratch file already closed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.ioLock) {
            if (this.isClosed) {
                return;
            }
            this.isClosed = true;
            java.io.RandomAccessFile randomAccessFile = this.raf;
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (IOException e10) {
                    e = e10;
                }
            }
            e = null;
            File file = this.file;
            if (file != null && !file.delete() && this.file.exists() && e == null) {
                e = new IOException("Error deleting scratch file: " + this.file.getAbsolutePath());
            }
            synchronized (this.freePages) {
                this.freePages.clear();
                this.pageCount = 0;
            }
            if (e == null) {
                return;
            }
            throw e;
        }
    }

    public RandomAccess createBuffer() {
        return new ScratchFileBuffer(this);
    }

    public int getNewPage() {
        int nextSetBit;
        synchronized (this.freePages) {
            nextSetBit = this.freePages.nextSetBit(0);
            if (nextSetBit < 0) {
                enlarge();
                nextSetBit = this.freePages.nextSetBit(0);
                if (nextSetBit < 0) {
                    throw new IOException("Maximum allowed scratch file memory exceeded.");
                }
            }
            this.freePages.clear(nextSetBit);
            if (nextSetBit >= this.pageCount) {
                this.pageCount = nextSetBit + 1;
            }
        }
        return nextSetBit;
    }

    public int getPageSize() {
        return 4096;
    }

    public void markPagesAsFree(int[] iArr, int i10, int i11) {
        synchronized (this.freePages) {
            while (i10 < i11) {
                int i12 = iArr[i10];
                if (i12 >= 0 && i12 < this.pageCount && !this.freePages.get(i12)) {
                    this.freePages.set(i12);
                    if (i12 < this.inMemoryMaxPageCount) {
                        this.inMemoryPages[i12] = null;
                    }
                }
                i10++;
            }
        }
    }

    public byte[] readPage(int i10) {
        byte[] bArr;
        if (i10 >= 0 && i10 < this.pageCount) {
            if (i10 < this.inMemoryMaxPageCount) {
                byte[] bArr2 = this.inMemoryPages[i10];
                if (bArr2 != null) {
                    return bArr2;
                }
                checkClosed();
                throw new IOException(a.g("Requested page with index ", i10, " was not written before."));
            }
            synchronized (this.ioLock) {
                java.io.RandomAccessFile randomAccessFile = this.raf;
                if (randomAccessFile != null) {
                    bArr = new byte[4096];
                    randomAccessFile.seek((i10 - this.inMemoryMaxPageCount) * 4096);
                    this.raf.readFully(bArr);
                } else {
                    checkClosed();
                    throw new IOException("Missing scratch file to read page with index " + i10 + " from.");
                }
            }
            return bArr;
        }
        checkClosed();
        StringBuilder e10 = d.e("Page index out of range: ", i10, ". Max value: ");
        e10.append(this.pageCount - 1);
        throw new IOException(e10.toString());
    }

    public void writePage(int i10, byte[] bArr) {
        if (i10 >= 0 && i10 < this.pageCount) {
            if (bArr.length == 4096) {
                if (i10 < this.inMemoryMaxPageCount) {
                    if (this.maxMainMemoryIsRestricted) {
                        this.inMemoryPages[i10] = bArr;
                    } else {
                        synchronized (this.ioLock) {
                            this.inMemoryPages[i10] = bArr;
                        }
                    }
                    checkClosed();
                    return;
                }
                synchronized (this.ioLock) {
                    checkClosed();
                    this.raf.seek((i10 - this.inMemoryMaxPageCount) * 4096);
                    this.raf.write(bArr);
                }
                return;
            }
            throw new IOException(h.g(new StringBuilder("Wrong page size to write: "), bArr.length, ". Expected: 4096"));
        }
        checkClosed();
        StringBuilder e10 = d.e("Page index out of range: ", i10, ". Max value: ");
        e10.append(this.pageCount - 1);
        throw new IOException(e10.toString());
    }

    public ScratchFile(MemoryUsageSetting memoryUsageSetting) {
        this.ioLock = new Object();
        this.pageCount = 0;
        BitSet bitSet = new BitSet();
        this.freePages = bitSet;
        this.isClosed = false;
        boolean z10 = !memoryUsageSetting.useMainMemory() || memoryUsageSetting.isMainMemoryRestricted();
        this.maxMainMemoryIsRestricted = z10;
        boolean useTempFile = z10 ? memoryUsageSetting.useTempFile() : false;
        this.useScratchFile = useTempFile;
        File tempDir = useTempFile ? memoryUsageSetting.getTempDir() : null;
        this.scratchFileDirectory = tempDir;
        if (tempDir != null && !tempDir.isDirectory()) {
            throw new IOException("Scratch file directory does not exist: " + tempDir);
        }
        boolean isStorageRestricted = memoryUsageSetting.isStorageRestricted();
        int i10 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.maxPageCount = isStorageRestricted ? (int) Math.min(2147483647L, memoryUsageSetting.getMaxStorageBytes() / 4096) : Integer.MAX_VALUE;
        if (!memoryUsageSetting.useMainMemory()) {
            i10 = 0;
        } else if (memoryUsageSetting.isMainMemoryRestricted()) {
            i10 = (int) Math.min(2147483647L, memoryUsageSetting.getMaxMainMemoryBytes() / 4096);
        }
        this.inMemoryMaxPageCount = i10;
        this.inMemoryPages = new byte[z10 ? i10 : INIT_UNRESTRICTED_MAINMEM_PAGECOUNT];
        bitSet.set(0, this.inMemoryPages.length);
    }

    public RandomAccess createBuffer(InputStream inputStream) {
        ScratchFileBuffer scratchFileBuffer = new ScratchFileBuffer(this);
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read > -1) {
                scratchFileBuffer.write(bArr, 0, read);
            } else {
                scratchFileBuffer.seek(0L);
                return scratchFileBuffer;
            }
        }
    }
}
