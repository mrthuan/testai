package lib.zj.office.fc.poifs.filesystem;

import java.io.IOException;
import java.io.InputStream;
import lib.zj.office.fc.util.LittleEndianInput;

/* loaded from: classes3.dex */
public class DocumentInputStream extends InputStream implements LittleEndianInput {
    protected static final int EOF = -1;
    protected static final int SIZE_INT = 4;
    protected static final int SIZE_LONG = 8;
    protected static final int SIZE_SHORT = 2;
    private DocumentInputStream delegate;

    public DocumentInputStream() {
    }

    @Override // java.io.InputStream, lib.zj.office.fc.util.LittleEndianInput
    public int available() {
        return this.delegate.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        this.delegate.mark(i10);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public int read() {
        return this.delegate.read();
    }

    @Override // lib.zj.office.fc.util.LittleEndianInput
    public byte readByte() {
        return this.delegate.readByte();
    }

    @Override // lib.zj.office.fc.util.LittleEndianInput
    public double readDouble() {
        return this.delegate.readDouble();
    }

    @Override // lib.zj.office.fc.util.LittleEndianInput
    public void readFully(byte[] bArr) {
        readFully(bArr, 0, bArr.length);
    }

    @Override // lib.zj.office.fc.util.LittleEndianInput
    public int readInt() {
        return this.delegate.readInt();
    }

    @Override // lib.zj.office.fc.util.LittleEndianInput
    public long readLong() {
        return this.delegate.readLong();
    }

    @Override // lib.zj.office.fc.util.LittleEndianInput
    public short readShort() {
        return (short) readUShort();
    }

    @Override // lib.zj.office.fc.util.LittleEndianInput
    public int readUByte() {
        return this.delegate.readUByte();
    }

    @Override // lib.zj.office.fc.util.LittleEndianInput
    public int readUShort() {
        return this.delegate.readUShort();
    }

    @Override // java.io.InputStream
    public void reset() {
        this.delegate.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j10) {
        return this.delegate.skip(j10);
    }

    public DocumentInputStream(DocumentEntry documentEntry) {
        if (documentEntry instanceof DocumentNode) {
            DirectoryNode directoryNode = (DirectoryNode) documentEntry.getParent();
            if (((DocumentNode) documentEntry).getDocument() != null) {
                this.delegate = new ODocumentInputStream(documentEntry);
                return;
            } else if (directoryNode.getFileSystem() != null) {
                this.delegate = new ODocumentInputStream(documentEntry);
                return;
            } else if (directoryNode.getNFileSystem() != null) {
                this.delegate = new NDocumentInputStream(documentEntry);
                return;
            } else {
                throw new IOException("No FileSystem bound on the parent, can't read contents");
            }
        }
        throw new IOException("Cannot open internal document storage");
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // lib.zj.office.fc.util.LittleEndianInput
    public void readFully(byte[] bArr, int i10, int i11) {
        this.delegate.readFully(bArr, i10, i11);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        return this.delegate.read(bArr, i10, i11);
    }

    public DocumentInputStream(POIFSDocument pOIFSDocument) {
        this.delegate = new ODocumentInputStream(pOIFSDocument);
    }

    public DocumentInputStream(NPOIFSDocument nPOIFSDocument) {
        this.delegate = new NDocumentInputStream(nPOIFSDocument);
    }
}
