package lib.zj.office.fc.poifs.filesystem;

import androidx.appcompat.view.menu.d;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import lib.zj.office.fc.poifs.property.DocumentProperty;
import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public final class NDocumentInputStream extends DocumentInputStream {
    private ByteBuffer _buffer;
    private boolean _closed;
    private int _current_block_count;
    private int _current_offset;
    private Iterator<ByteBuffer> _data;
    private NPOIFSDocument _document;
    private int _document_size;
    private int _marked_offset;
    private int _marked_offset_count;

    public NDocumentInputStream(DocumentEntry documentEntry) {
        if (documentEntry instanceof DocumentNode) {
            this._current_offset = 0;
            this._current_block_count = 0;
            this._marked_offset = 0;
            this._marked_offset_count = 0;
            this._document_size = documentEntry.getSize();
            this._closed = false;
            DocumentNode documentNode = (DocumentNode) documentEntry;
            NPOIFSDocument nPOIFSDocument = new NPOIFSDocument((DocumentProperty) documentNode.getProperty(), ((DirectoryNode) documentNode.getParent()).getNFileSystem());
            this._document = nPOIFSDocument;
            this._data = nPOIFSDocument.getBlockIterator();
            return;
        }
        throw new IOException("Cannot open internal document storage, " + documentEntry + " not a Document Node");
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
        this._marked_offset_count = Math.max(0, this._current_block_count - 1);
    }

    @Override // lib.zj.office.fc.poifs.filesystem.DocumentInputStream, java.io.InputStream
    public int read() {
        dieIfClosed();
        if (atEOD()) {
            return -1;
        }
        byte[] bArr = new byte[1];
        int read = read(bArr, 0, 1);
        if (read >= 0) {
            byte b10 = bArr[0];
            return b10 < 0 ? b10 + 256 : b10;
        }
        return read;
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
        checkAvaliable(i11);
        int i12 = 0;
        while (i12 < i11) {
            ByteBuffer byteBuffer = this._buffer;
            if (byteBuffer == null || byteBuffer.remaining() == 0) {
                this._current_block_count++;
                this._buffer = this._data.next();
            }
            int min = Math.min(i11 - i12, this._buffer.remaining());
            this._buffer.get(bArr, i10 + i12, min);
            this._current_offset += min;
            i12 += min;
        }
    }

    @Override // lib.zj.office.fc.poifs.filesystem.DocumentInputStream, lib.zj.office.fc.util.LittleEndianInput
    public int readInt() {
        checkAvaliable(4);
        byte[] bArr = new byte[4];
        readFully(bArr, 0, 4);
        return LittleEndian.getInt(bArr);
    }

    @Override // lib.zj.office.fc.poifs.filesystem.DocumentInputStream, lib.zj.office.fc.util.LittleEndianInput
    public long readLong() {
        checkAvaliable(8);
        byte[] bArr = new byte[8];
        readFully(bArr, 0, 8);
        return LittleEndian.getLong(bArr, 0);
    }

    @Override // lib.zj.office.fc.poifs.filesystem.DocumentInputStream, lib.zj.office.fc.util.LittleEndianInput
    public short readShort() {
        checkAvaliable(2);
        byte[] bArr = new byte[2];
        readFully(bArr, 0, 2);
        return LittleEndian.getShort(bArr);
    }

    @Override // lib.zj.office.fc.poifs.filesystem.DocumentInputStream, lib.zj.office.fc.util.LittleEndianInput
    public int readUByte() {
        checkAvaliable(1);
        byte[] bArr = new byte[1];
        readFully(bArr, 0, 1);
        byte b10 = bArr[0];
        if (b10 >= 0) {
            return b10;
        }
        return b10 + 256;
    }

    @Override // lib.zj.office.fc.poifs.filesystem.DocumentInputStream, lib.zj.office.fc.util.LittleEndianInput
    public int readUShort() {
        checkAvaliable(2);
        byte[] bArr = new byte[2];
        readFully(bArr, 0, 2);
        return LittleEndian.getUShort(bArr);
    }

    @Override // lib.zj.office.fc.poifs.filesystem.DocumentInputStream, java.io.InputStream
    public void reset() {
        int i10;
        int i11;
        int i12 = this._marked_offset;
        if (i12 == 0 && (i11 = this._marked_offset_count) == 0) {
            this._current_block_count = i11;
            this._current_offset = i12;
            this._data = this._document.getBlockIterator();
            this._buffer = null;
            return;
        }
        this._data = this._document.getBlockIterator();
        int i13 = 0;
        this._current_offset = 0;
        while (true) {
            i10 = this._marked_offset_count;
            if (i13 >= i10) {
                break;
            }
            ByteBuffer next = this._data.next();
            this._buffer = next;
            this._current_offset = next.remaining() + this._current_offset;
            i13++;
        }
        this._current_block_count = i10;
        if (this._current_offset != this._marked_offset) {
            ByteBuffer next2 = this._data.next();
            this._buffer = next2;
            this._current_block_count++;
            next2.position(next2.position() + (this._marked_offset - this._current_offset));
        }
        this._current_offset = this._marked_offset;
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
        readFully(new byte[(int) j11]);
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

    public NDocumentInputStream(NPOIFSDocument nPOIFSDocument) {
        this._current_offset = 0;
        this._current_block_count = 0;
        this._marked_offset = 0;
        this._marked_offset_count = 0;
        this._document_size = nPOIFSDocument.getSize();
        this._closed = false;
        this._document = nPOIFSDocument;
        this._data = nPOIFSDocument.getBlockIterator();
    }
}
