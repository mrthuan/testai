package lib.zj.office.fc.poifs.filesystem;

import androidx.appcompat.view.menu.d;
import java.io.IOException;
import lib.zj.office.fc.poifs.storage.DataInputBlock;

/* loaded from: classes3.dex */
public final class ODocumentInputStream extends DocumentInputStream {
    private boolean _closed;
    private DataInputBlock _currentBlock;
    private int _current_offset;
    private POIFSDocument _document;
    private int _document_size;
    private int _marked_offset;

    public ODocumentInputStream(DocumentEntry documentEntry) {
        if (documentEntry instanceof DocumentNode) {
            DocumentNode documentNode = (DocumentNode) documentEntry;
            if (documentNode.getDocument() != null) {
                this._current_offset = 0;
                this._marked_offset = 0;
                this._document_size = documentEntry.getSize();
                this._closed = false;
                this._document = documentNode.getDocument();
                this._currentBlock = getDataInputBlock(0);
                return;
            }
            throw new IOException("Cannot open internal document storage");
        }
        throw new IOException("Cannot open internal document storage");
    }

    private boolean atEOD() {
        if (this._current_offset == this._document_size) {
            return true;
        }
        return false;
    }

    private void checkAvaliable(int i10) {
        if (!this._closed) {
            if (i10 <= this._document_size - this._current_offset) {
                return;
            }
            StringBuilder e10 = d.e("Buffer underrun - requested ", i10, " bytes but ");
            e10.append(this._document_size - this._current_offset);
            e10.append(" was available");
            throw new RuntimeException(e10.toString());
        }
        throw new IllegalStateException("cannot perform requested operation on a closed stream");
    }

    private void dieIfClosed() {
        if (!this._closed) {
            return;
        }
        throw new IOException("cannot perform requested operation on a closed stream");
    }

    private DataInputBlock getDataInputBlock(int i10) {
        return this._document.getDataInputBlock(i10);
    }

    @Override // lib.zj.office.fc.poifs.filesystem.DocumentInputStream, java.io.InputStream, lib.zj.office.fc.util.LittleEndianInput
    public int available() {
        if (!this._closed) {
            return this._document_size - this._current_offset;
        }
        throw new IllegalStateException("cannot perform requested operation on a closed stream");
    }

    @Override // lib.zj.office.fc.poifs.filesystem.DocumentInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this._closed = true;
    }

    @Override // lib.zj.office.fc.poifs.filesystem.DocumentInputStream, java.io.InputStream
    public void mark(int i10) {
        this._marked_offset = this._current_offset;
    }

    @Override // lib.zj.office.fc.poifs.filesystem.DocumentInputStream, java.io.InputStream
    public int read() {
        dieIfClosed();
        if (atEOD()) {
            return -1;
        }
        int readUByte = this._currentBlock.readUByte();
        this._current_offset++;
        if (this._currentBlock.available() < 1) {
            this._currentBlock = getDataInputBlock(this._current_offset);
        }
        return readUByte;
    }

    @Override // lib.zj.office.fc.poifs.filesystem.DocumentInputStream, lib.zj.office.fc.util.LittleEndianInput
    public byte readByte() {
        return (byte) readUByte();
    }

    @Override // lib.zj.office.fc.poifs.filesystem.DocumentInputStream, lib.zj.office.fc.util.LittleEndianInput
    public double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // lib.zj.office.fc.poifs.filesystem.DocumentInputStream, lib.zj.office.fc.util.LittleEndianInput
    public void readFully(byte[] bArr, int i10, int i11) {
        boolean z10;
        int i12;
        checkAvaliable(i11);
        int available = this._currentBlock.available();
        if (available > i11) {
            this._currentBlock.readFully(bArr, i10, i11);
            this._current_offset += i11;
            return;
        }
        while (i11 > 0) {
            if (i11 >= available) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                i12 = available;
            } else {
                i12 = i11;
            }
            this._currentBlock.readFully(bArr, i10, i12);
            i11 -= i12;
            i10 += i12;
            int i13 = this._current_offset + i12;
            this._current_offset = i13;
            if (z10) {
                if (i13 == this._document_size) {
                    if (i11 <= 0) {
                        this._currentBlock = null;
                        return;
                    }
                    throw new IllegalStateException("reached end of document stream unexpectedly");
                }
                DataInputBlock dataInputBlock = getDataInputBlock(i13);
                this._currentBlock = dataInputBlock;
                available = dataInputBlock.available();
            }
        }
    }

    @Override // lib.zj.office.fc.poifs.filesystem.DocumentInputStream, lib.zj.office.fc.util.LittleEndianInput
    public int readInt() {
        int readIntLE;
        checkAvaliable(4);
        int available = this._currentBlock.available();
        if (available > 4) {
            readIntLE = this._currentBlock.readIntLE();
        } else {
            DataInputBlock dataInputBlock = getDataInputBlock(this._current_offset + available);
            if (available == 4) {
                readIntLE = this._currentBlock.readIntLE();
            } else {
                readIntLE = dataInputBlock.readIntLE(this._currentBlock, available);
            }
            this._currentBlock = dataInputBlock;
        }
        this._current_offset += 4;
        return readIntLE;
    }

    @Override // lib.zj.office.fc.poifs.filesystem.DocumentInputStream, lib.zj.office.fc.util.LittleEndianInput
    public long readLong() {
        long readLongLE;
        long j10;
        checkAvaliable(8);
        int available = this._currentBlock.available();
        if (available > 8) {
            j10 = this._currentBlock.readLongLE();
        } else {
            DataInputBlock dataInputBlock = getDataInputBlock(this._current_offset + available);
            if (available == 8) {
                readLongLE = this._currentBlock.readLongLE();
            } else {
                readLongLE = dataInputBlock.readLongLE(this._currentBlock, available);
            }
            this._currentBlock = dataInputBlock;
            j10 = readLongLE;
        }
        this._current_offset += 8;
        return j10;
    }

    @Override // lib.zj.office.fc.poifs.filesystem.DocumentInputStream, lib.zj.office.fc.util.LittleEndianInput
    public short readShort() {
        return (short) readUShort();
    }

    @Override // lib.zj.office.fc.poifs.filesystem.DocumentInputStream, lib.zj.office.fc.util.LittleEndianInput
    public int readUByte() {
        checkAvaliable(1);
        int readUByte = this._currentBlock.readUByte();
        this._current_offset++;
        if (this._currentBlock.available() < 1) {
            this._currentBlock = getDataInputBlock(this._current_offset);
        }
        return readUByte;
    }

    @Override // lib.zj.office.fc.poifs.filesystem.DocumentInputStream, lib.zj.office.fc.util.LittleEndianInput
    public int readUShort() {
        int readUShortLE;
        checkAvaliable(2);
        int available = this._currentBlock.available();
        if (available > 2) {
            readUShortLE = this._currentBlock.readUShortLE();
        } else {
            DataInputBlock dataInputBlock = getDataInputBlock(this._current_offset + available);
            if (available == 2) {
                readUShortLE = this._currentBlock.readUShortLE();
            } else {
                readUShortLE = dataInputBlock.readUShortLE(this._currentBlock);
            }
            this._currentBlock = dataInputBlock;
        }
        this._current_offset += 2;
        return readUShortLE;
    }

    @Override // lib.zj.office.fc.poifs.filesystem.DocumentInputStream, java.io.InputStream
    public void reset() {
        int i10 = this._marked_offset;
        this._current_offset = i10;
        this._currentBlock = getDataInputBlock(i10);
    }

    @Override // lib.zj.office.fc.poifs.filesystem.DocumentInputStream, java.io.InputStream
    public long skip(long j10) {
        dieIfClosed();
        if (j10 < 0) {
            return 0L;
        }
        int i10 = this._current_offset;
        int i11 = ((int) j10) + i10;
        if (i11 < i10) {
            i11 = this._document_size;
        } else {
            int i12 = this._document_size;
            if (i11 > i12) {
                i11 = i12;
            }
        }
        long j11 = i11 - i10;
        this._current_offset = i11;
        this._currentBlock = getDataInputBlock(i11);
        return j11;
    }

    @Override // lib.zj.office.fc.poifs.filesystem.DocumentInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        dieIfClosed();
        if (bArr != null) {
            if (i10 < 0 || i11 < 0 || bArr.length < i10 + i11) {
                throw new IndexOutOfBoundsException("can't read past buffer boundaries");
            }
            if (i11 == 0) {
                return 0;
            }
            if (atEOD()) {
                return -1;
            }
            int min = Math.min(available(), i11);
            readFully(bArr, i10, min);
            return min;
        }
        throw new IllegalArgumentException("buffer must not be null");
    }

    public ODocumentInputStream(POIFSDocument pOIFSDocument) {
        this._current_offset = 0;
        this._marked_offset = 0;
        this._document_size = pOIFSDocument.getSize();
        this._closed = false;
        this._document = pOIFSDocument;
        this._currentBlock = getDataInputBlock(0);
    }
}
