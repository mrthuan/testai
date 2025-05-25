package com.tom_roush.pdfbox.cos;

import com.tom_roush.pdfbox.android.PDFBoxConfig;
import com.tom_roush.pdfbox.filter.DecodeOptions;
import com.tom_roush.pdfbox.filter.Filter;
import com.tom_roush.pdfbox.filter.FilterFactory;
import com.tom_roush.pdfbox.io.IOUtils;
import com.tom_roush.pdfbox.io.RandomAccess;
import com.tom_roush.pdfbox.io.RandomAccessInputStream;
import com.tom_roush.pdfbox.io.RandomAccessOutputStream;
import com.tom_roush.pdfbox.io.ScratchFile;
import java.io.Closeable;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class COSStream extends COSDictionary implements Closeable {
    private boolean isWriting;
    private RandomAccess randomAccess;
    private final ScratchFile scratchFile;

    public COSStream() {
        this(ScratchFile.getMainMemoryOnlyInstance());
    }

    private void checkClosed() {
        RandomAccess randomAccess = this.randomAccess;
        if (randomAccess != null && randomAccess.isClosed()) {
            throw new IOException("COSStream has been closed and cannot be read. Perhaps its enclosing PDDocument has been closed?");
        }
    }

    private void ensureRandomAccessExists(boolean z10) {
        if (this.randomAccess == null) {
            if (z10) {
                PDFBoxConfig.isDebugEnabled();
            }
            this.randomAccess = this.scratchFile.createBuffer();
        }
    }

    private List<Filter> getFilterList() {
        String name;
        COSBase filters = getFilters();
        if (filters instanceof COSName) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(FilterFactory.INSTANCE.getFilter((COSName) filters));
            return arrayList;
        } else if (filters instanceof COSArray) {
            COSArray cOSArray = (COSArray) filters;
            ArrayList arrayList2 = new ArrayList(cOSArray.size());
            for (int i10 = 0; i10 < cOSArray.size(); i10++) {
                COSBase cOSBase = cOSArray.get(i10);
                if (!(cOSBase instanceof COSName)) {
                    if (cOSBase == null) {
                        name = "null";
                    } else {
                        name = cOSBase.getClass().getName();
                    }
                    throw new IOException("Forbidden type in filter array: ".concat(name));
                }
                arrayList2.add(FilterFactory.INSTANCE.getFilter((COSName) cOSBase));
            }
            return arrayList2;
        } else {
            return new ArrayList();
        }
    }

    @Override // com.tom_roush.pdfbox.cos.COSDictionary, com.tom_roush.pdfbox.cos.COSBase
    public Object accept(ICOSVisitor iCOSVisitor) {
        return iCOSVisitor.visitFromStream(this);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        RandomAccess randomAccess = this.randomAccess;
        if (randomAccess != null) {
            randomAccess.close();
        }
    }

    @Deprecated
    public OutputStream createFilteredStream() {
        return createRawOutputStream();
    }

    public COSInputStream createInputStream() {
        return createInputStream(DecodeOptions.DEFAULT);
    }

    public OutputStream createOutputStream() {
        return createOutputStream(null);
    }

    public InputStream createRawInputStream() {
        checkClosed();
        if (!this.isWriting) {
            ensureRandomAccessExists(true);
            return new RandomAccessInputStream(this.randomAccess);
        }
        throw new IllegalStateException("Cannot read while there is an open stream writer");
    }

    public OutputStream createRawOutputStream() {
        checkClosed();
        if (!this.isWriting) {
            IOUtils.closeQuietly(this.randomAccess);
            this.randomAccess = this.scratchFile.createBuffer();
            RandomAccessOutputStream randomAccessOutputStream = new RandomAccessOutputStream(this.randomAccess);
            this.isWriting = true;
            return new FilterOutputStream(randomAccessOutputStream) { // from class: com.tom_roush.pdfbox.cos.COSStream.2
                @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                    super.close();
                    COSStream cOSStream = COSStream.this;
                    cOSStream.setInt(COSName.LENGTH, (int) cOSStream.randomAccess.length());
                    COSStream.this.isWriting = false;
                }

                @Override // java.io.FilterOutputStream, java.io.OutputStream
                public void write(byte[] bArr, int i10, int i11) {
                    ((FilterOutputStream) this).out.write(bArr, i10, i11);
                }
            };
        }
        throw new IllegalStateException("Cannot have more than one open stream writer.");
    }

    @Deprecated
    public OutputStream createUnfilteredStream() {
        return createOutputStream();
    }

    @Deprecated
    public InputStream getFilteredStream() {
        return createRawInputStream();
    }

    public COSBase getFilters() {
        return getDictionaryObject(COSName.FILTER);
    }

    public long getLength() {
        if (!this.isWriting) {
            return getInt(COSName.LENGTH, 0);
        }
        throw new IllegalStateException("There is an open OutputStream associated with this COSStream. It must be closed before queryinglength of this COSStream.");
    }

    @Deprecated
    public String getString() {
        return toTextString();
    }

    @Deprecated
    public InputStream getUnfilteredStream() {
        return createInputStream();
    }

    @Deprecated
    public void setFilters(COSBase cOSBase) {
        setItem(COSName.FILTER, cOSBase);
    }

    public String toTextString() {
        COSInputStream cOSInputStream = null;
        try {
            cOSInputStream = createInputStream();
            byte[] byteArray = IOUtils.toByteArray(cOSInputStream);
            IOUtils.closeQuietly(cOSInputStream);
            return new COSString(byteArray).getString();
        } catch (IOException unused) {
            IOUtils.closeQuietly(cOSInputStream);
            return "";
        } catch (Throwable th2) {
            IOUtils.closeQuietly(cOSInputStream);
            throw th2;
        }
    }

    public COSStream(ScratchFile scratchFile) {
        setInt(COSName.LENGTH, 0);
        this.scratchFile = scratchFile == null ? ScratchFile.getMainMemoryOnlyInstance() : scratchFile;
    }

    public COSInputStream createInputStream(DecodeOptions decodeOptions) {
        checkClosed();
        if (!this.isWriting) {
            ensureRandomAccessExists(true);
            return COSInputStream.create(getFilterList(), this, new RandomAccessInputStream(this.randomAccess), this.scratchFile, decodeOptions);
        }
        throw new IllegalStateException("Cannot read while there is an open stream writer");
    }

    public OutputStream createOutputStream(COSBase cOSBase) {
        checkClosed();
        if (!this.isWriting) {
            if (cOSBase != null) {
                setItem(COSName.FILTER, cOSBase);
            }
            IOUtils.closeQuietly(this.randomAccess);
            this.randomAccess = this.scratchFile.createBuffer();
            COSOutputStream cOSOutputStream = new COSOutputStream(getFilterList(), this, new RandomAccessOutputStream(this.randomAccess), this.scratchFile);
            this.isWriting = true;
            return new FilterOutputStream(cOSOutputStream) { // from class: com.tom_roush.pdfbox.cos.COSStream.1
                @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                    super.close();
                    COSStream cOSStream = COSStream.this;
                    cOSStream.setInt(COSName.LENGTH, (int) cOSStream.randomAccess.length());
                    COSStream.this.isWriting = false;
                }

                @Override // java.io.FilterOutputStream, java.io.OutputStream
                public void write(byte[] bArr, int i10, int i11) {
                    ((FilterOutputStream) this).out.write(bArr, i10, i11);
                }
            };
        }
        throw new IllegalStateException("Cannot have more than one open stream writer.");
    }
}
