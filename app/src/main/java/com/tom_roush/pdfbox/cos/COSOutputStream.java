package com.tom_roush.pdfbox.cos;

import com.tom_roush.pdfbox.filter.Filter;
import com.tom_roush.pdfbox.io.RandomAccess;
import com.tom_roush.pdfbox.io.RandomAccessInputStream;
import com.tom_roush.pdfbox.io.RandomAccessOutputStream;
import com.tom_roush.pdfbox.io.ScratchFile;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.util.List;

/* loaded from: classes2.dex */
public final class COSOutputStream extends FilterOutputStream {
    private RandomAccess buffer;
    private final List<Filter> filters;
    private final COSDictionary parameters;
    private final ScratchFile scratchFile;

    public COSOutputStream(List<Filter> list, COSDictionary cOSDictionary, OutputStream outputStream, ScratchFile scratchFile) {
        super(outputStream);
        this.filters = list;
        this.parameters = cOSDictionary;
        this.scratchFile = scratchFile;
        if (list.isEmpty()) {
            this.buffer = null;
        } else {
            this.buffer = scratchFile.createBuffer();
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            if (this.buffer != null) {
                for (int size = this.filters.size() - 1; size >= 0; size--) {
                    RandomAccessInputStream randomAccessInputStream = new RandomAccessInputStream(this.buffer);
                    if (size == 0) {
                        try {
                            this.filters.get(size).encode(randomAccessInputStream, ((FilterOutputStream) this).out, this.parameters, size);
                        } finally {
                            randomAccessInputStream.close();
                        }
                    } else {
                        RandomAccess createBuffer = this.scratchFile.createBuffer();
                        try {
                            RandomAccessOutputStream randomAccessOutputStream = new RandomAccessOutputStream(createBuffer);
                            this.filters.get(size).encode(randomAccessInputStream, randomAccessOutputStream, this.parameters, size);
                            randomAccessOutputStream.close();
                            RandomAccess randomAccess = this.buffer;
                            try {
                                this.buffer = createBuffer;
                                randomAccess.close();
                            } catch (Throwable th2) {
                                th = th2;
                                createBuffer = randomAccess;
                                createBuffer.close();
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                }
                this.buffer.close();
                this.buffer = null;
            }
        } finally {
            super.close();
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() {
        if (this.buffer == null) {
            super.flush();
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) {
        RandomAccess randomAccess = this.buffer;
        if (randomAccess != null) {
            randomAccess.write(bArr);
        } else {
            super.write(bArr);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        RandomAccess randomAccess = this.buffer;
        if (randomAccess != null) {
            randomAccess.write(bArr, i10, i11);
        } else {
            super.write(bArr, i10, i11);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i10) {
        RandomAccess randomAccess = this.buffer;
        if (randomAccess != null) {
            randomAccess.write(i10);
        } else {
            super.write(i10);
        }
    }
}
