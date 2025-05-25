package com.tom_roush.pdfbox.io;

import androidx.appcompat.view.menu.d;
import com.tom_roush.pdfbox.android.PDFBoxConfig;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class ScratchFileBuffer implements RandomAccess {
    private byte[] currentPage;
    private long currentPageOffset;
    private int currentPagePositionInPageIndexes;
    private ScratchFile pageHandler;
    private final int pageSize;
    private int positionInPage;
    private long size = 0;
    private boolean currentPageContentChanged = false;
    private int[] pageIndexes = new int[16];
    private int pageCount = 0;

    public ScratchFileBuffer(ScratchFile scratchFile) {
        scratchFile.checkClosed();
        this.pageHandler = scratchFile;
        this.pageSize = scratchFile.getPageSize();
        addPage();
    }

    private void addPage() {
        int i10 = this.pageCount;
        int i11 = i10 + 1;
        int[] iArr = this.pageIndexes;
        if (i11 >= iArr.length) {
            int length = iArr.length * 2;
            if (length < iArr.length) {
                if (iArr.length != Integer.MAX_VALUE) {
                    length = Integer.MAX_VALUE;
                } else {
                    throw new IOException("Maximum buffer size reached.");
                }
            }
            int[] iArr2 = new int[length];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            this.pageIndexes = iArr2;
        }
        int newPage = this.pageHandler.getNewPage();
        int[] iArr3 = this.pageIndexes;
        int i12 = this.pageCount;
        iArr3[i12] = newPage;
        this.currentPagePositionInPageIndexes = i12;
        int i13 = this.pageSize;
        this.currentPageOffset = i12 * i13;
        this.pageCount = i12 + 1;
        this.currentPage = new byte[i13];
        this.positionInPage = 0;
    }

    private void checkClosed() {
        ScratchFile scratchFile = this.pageHandler;
        if (scratchFile != null) {
            scratchFile.checkClosed();
            return;
        }
        throw new IOException("Buffer already closed");
    }

    private boolean ensureAvailableBytesInPage(boolean z10) {
        if (this.positionInPage >= this.pageSize) {
            if (this.currentPageContentChanged) {
                this.pageHandler.writePage(this.pageIndexes[this.currentPagePositionInPageIndexes], this.currentPage);
                this.currentPageContentChanged = false;
            }
            int i10 = this.currentPagePositionInPageIndexes;
            if (i10 + 1 < this.pageCount) {
                ScratchFile scratchFile = this.pageHandler;
                int[] iArr = this.pageIndexes;
                int i11 = i10 + 1;
                this.currentPagePositionInPageIndexes = i11;
                this.currentPage = scratchFile.readPage(iArr[i11]);
                this.currentPageOffset = this.currentPagePositionInPageIndexes * this.pageSize;
                this.positionInPage = 0;
            } else if (!z10) {
                return false;
            } else {
                addPage();
            }
        }
        return true;
    }

    @Override // com.tom_roush.pdfbox.io.RandomAccessRead
    public int available() {
        checkClosed();
        return (int) Math.min(this.size - (this.currentPageOffset + this.positionInPage), 2147483647L);
    }

    @Override // com.tom_roush.pdfbox.io.RandomAccessWrite
    public final void clear() {
        checkClosed();
        this.pageHandler.markPagesAsFree(this.pageIndexes, 1, this.pageCount - 1);
        this.pageCount = 1;
        if (this.currentPagePositionInPageIndexes > 0) {
            this.currentPage = this.pageHandler.readPage(this.pageIndexes[0]);
            this.currentPagePositionInPageIndexes = 0;
            this.currentPageOffset = 0L;
        }
        this.positionInPage = 0;
        this.size = 0L;
        this.currentPageContentChanged = false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ScratchFile scratchFile = this.pageHandler;
        if (scratchFile != null) {
            scratchFile.markPagesAsFree(this.pageIndexes, 0, this.pageCount);
            this.pageHandler = null;
            this.pageIndexes = null;
            this.currentPage = null;
            this.currentPageOffset = 0L;
            this.currentPagePositionInPageIndexes = -1;
            this.positionInPage = 0;
            this.size = 0L;
        }
    }

    public void finalize() {
        try {
            if (this.pageHandler != null) {
                PDFBoxConfig.isDebugEnabled();
            }
            close();
        } finally {
            super.finalize();
        }
    }

    @Override // com.tom_roush.pdfbox.io.RandomAccessRead
    public long getPosition() {
        checkClosed();
        return this.currentPageOffset + this.positionInPage;
    }

    @Override // com.tom_roush.pdfbox.io.RandomAccessRead
    public boolean isClosed() {
        if (this.pageHandler == null) {
            return true;
        }
        return false;
    }

    @Override // com.tom_roush.pdfbox.io.RandomAccessRead
    public boolean isEOF() {
        checkClosed();
        if (this.currentPageOffset + this.positionInPage >= this.size) {
            return true;
        }
        return false;
    }

    @Override // com.tom_roush.pdfbox.io.RandomAccessRead
    public long length() {
        return this.size;
    }

    @Override // com.tom_roush.pdfbox.io.RandomAccessRead
    public int peek() {
        int read = read();
        if (read != -1) {
            rewind(1);
        }
        return read;
    }

    @Override // com.tom_roush.pdfbox.io.RandomAccessRead
    public int read() {
        checkClosed();
        if (this.currentPageOffset + this.positionInPage >= this.size) {
            return -1;
        }
        if (ensureAvailableBytesInPage(false)) {
            byte[] bArr = this.currentPage;
            int i10 = this.positionInPage;
            this.positionInPage = i10 + 1;
            return bArr[i10] & 255;
        }
        throw new IOException("Unexpectedly no bytes available for read in buffer.");
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
        seek((this.currentPageOffset + this.positionInPage) - i10);
    }

    @Override // com.tom_roush.pdfbox.io.RandomAccessRead
    public void seek(long j10) {
        checkClosed();
        if (j10 <= this.size) {
            if (j10 >= 0) {
                long j11 = this.currentPageOffset;
                if (j10 >= j11 && j10 <= this.pageSize + j11) {
                    this.positionInPage = (int) (j10 - j11);
                    return;
                }
                if (this.currentPageContentChanged) {
                    this.pageHandler.writePage(this.pageIndexes[this.currentPagePositionInPageIndexes], this.currentPage);
                    this.currentPageContentChanged = false;
                }
                int i10 = this.pageSize;
                int i11 = (int) (j10 / i10);
                if (j10 % i10 == 0 && j10 == this.size) {
                    i11--;
                }
                this.currentPage = this.pageHandler.readPage(this.pageIndexes[i11]);
                this.currentPagePositionInPageIndexes = i11;
                long j12 = i11 * this.pageSize;
                this.currentPageOffset = j12;
                this.positionInPage = (int) (j10 - j12);
                return;
            }
            throw new IOException(d.c("Negative seek offset: ", j10));
        }
        throw new EOFException();
    }

    @Override // com.tom_roush.pdfbox.io.RandomAccessWrite
    public void write(int i10) {
        checkClosed();
        ensureAvailableBytesInPage(true);
        byte[] bArr = this.currentPage;
        int i11 = this.positionInPage;
        int i12 = i11 + 1;
        this.positionInPage = i12;
        bArr[i11] = (byte) i10;
        this.currentPageContentChanged = true;
        long j10 = this.currentPageOffset;
        if (i12 + j10 > this.size) {
            this.size = j10 + i12;
        }
    }

    @Override // com.tom_roush.pdfbox.io.RandomAccessRead
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // com.tom_roush.pdfbox.io.RandomAccessRead
    public int read(byte[] bArr, int i10, int i11) {
        checkClosed();
        long j10 = this.currentPageOffset;
        int i12 = this.positionInPage;
        long j11 = this.size;
        if (i12 + j10 >= j11) {
            return -1;
        }
        int min = (int) Math.min(i11, j11 - (j10 + i12));
        int i13 = 0;
        while (min > 0) {
            if (ensureAvailableBytesInPage(false)) {
                int min2 = Math.min(min, this.pageSize - this.positionInPage);
                System.arraycopy(this.currentPage, this.positionInPage, bArr, i10, min2);
                this.positionInPage += min2;
                i13 += min2;
                i10 += min2;
                min -= min2;
            } else {
                throw new IOException("Unexpectedly no bytes available for read in buffer.");
            }
        }
        return i13;
    }

    @Override // com.tom_roush.pdfbox.io.RandomAccessWrite
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // com.tom_roush.pdfbox.io.RandomAccessWrite
    public void write(byte[] bArr, int i10, int i11) {
        checkClosed();
        while (i11 > 0) {
            ensureAvailableBytesInPage(true);
            int min = Math.min(i11, this.pageSize - this.positionInPage);
            System.arraycopy(bArr, i10, this.currentPage, this.positionInPage, min);
            this.positionInPage += min;
            this.currentPageContentChanged = true;
            i10 += min;
            i11 -= min;
        }
        long j10 = this.currentPageOffset;
        int i12 = this.positionInPage;
        if (i12 + j10 > this.size) {
            this.size = j10 + i12;
        }
    }
}
