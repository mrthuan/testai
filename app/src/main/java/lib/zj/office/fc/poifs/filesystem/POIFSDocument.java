package lib.zj.office.fc.poifs.filesystem;

import androidx.appcompat.view.menu.d;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import lib.zj.office.fc.poifs.common.POIFSBigBlockSize;
import lib.zj.office.fc.poifs.common.POIFSConstants;
import lib.zj.office.fc.poifs.property.DocumentProperty;
import lib.zj.office.fc.poifs.property.Property;
import lib.zj.office.fc.poifs.storage.BlockWritable;
import lib.zj.office.fc.poifs.storage.DataInputBlock;
import lib.zj.office.fc.poifs.storage.DocumentBlock;
import lib.zj.office.fc.poifs.storage.ListManagedBlock;
import lib.zj.office.fc.poifs.storage.RawDataBlock;
import lib.zj.office.fc.poifs.storage.SmallDocumentBlock;
import lib.zj.office.fc.util.HexDump;

/* loaded from: classes3.dex */
public final class POIFSDocument implements BATManaged, BlockWritable {
    private static final DocumentBlock[] EMPTY_BIG_BLOCK_ARRAY = new DocumentBlock[0];
    private static final SmallDocumentBlock[] EMPTY_SMALL_BLOCK_ARRAY = new SmallDocumentBlock[0];
    private final POIFSBigBlockSize _bigBigBlockSize;
    private BigBlockStore _big_store;
    private DocumentProperty _property;
    private int _size;
    private SmallBlockStore _small_store;

    public POIFSDocument(String str, RawDataBlock[] rawDataBlockArr, int i10) {
        POIFSBigBlockSize pOIFSBigBlockSize;
        this._size = i10;
        if (rawDataBlockArr.length == 0) {
            this._bigBigBlockSize = POIFSConstants.SMALLER_BIG_BLOCK_SIZE_DETAILS;
        } else {
            if (rawDataBlockArr[0].getBigBlockSize() == 512) {
                pOIFSBigBlockSize = POIFSConstants.SMALLER_BIG_BLOCK_SIZE_DETAILS;
            } else {
                pOIFSBigBlockSize = POIFSConstants.LARGER_BIG_BLOCK_SIZE_DETAILS;
            }
            this._bigBigBlockSize = pOIFSBigBlockSize;
        }
        this._big_store = new BigBlockStore(this._bigBigBlockSize, convertRawBlocksToBigBlocks(rawDataBlockArr));
        this._property = new DocumentProperty(str, this._size);
        this._small_store = new SmallBlockStore(this._bigBigBlockSize, EMPTY_SMALL_BLOCK_ARRAY);
        this._property.setDocument(this);
    }

    private static DocumentBlock[] convertRawBlocksToBigBlocks(ListManagedBlock[] listManagedBlockArr) {
        int length = listManagedBlockArr.length;
        DocumentBlock[] documentBlockArr = new DocumentBlock[length];
        for (int i10 = 0; i10 < length; i10++) {
            documentBlockArr[i10] = new DocumentBlock((RawDataBlock) listManagedBlockArr[i10]);
        }
        return documentBlockArr;
    }

    private static SmallDocumentBlock[] convertRawBlocksToSmallBlocks(ListManagedBlock[] listManagedBlockArr) {
        if (listManagedBlockArr instanceof SmallDocumentBlock[]) {
            return (SmallDocumentBlock[]) listManagedBlockArr;
        }
        SmallDocumentBlock[] smallDocumentBlockArr = new SmallDocumentBlock[listManagedBlockArr.length];
        System.arraycopy(listManagedBlockArr, 0, smallDocumentBlockArr, 0, listManagedBlockArr.length);
        return smallDocumentBlockArr;
    }

    @Override // lib.zj.office.fc.poifs.filesystem.BATManaged
    public int countBlocks() {
        return this._big_store.countBlocks();
    }

    public DataInputBlock getDataInputBlock(int i10) {
        int i11 = this._size;
        if (i10 >= i11) {
            if (i10 <= i11) {
                return null;
            }
            StringBuilder e10 = d.e("Request for Offset ", i10, " doc size is ");
            e10.append(this._size);
            throw new RuntimeException(e10.toString());
        } else if (this._property.shouldUseSmallBlocks()) {
            return SmallDocumentBlock.getDataInputBlock(this._small_store.getBlocks(), i10);
        } else {
            return DocumentBlock.getDataInputBlock(this._big_store.getBlocks(), i10);
        }
    }

    public DocumentProperty getDocumentProperty() {
        return this._property;
    }

    public String getShortDescription() {
        StringBuffer stringBuffer = new StringBuffer("Document: \"");
        stringBuffer.append(this._property.getName());
        stringBuffer.append("\" size = ");
        stringBuffer.append(getSize());
        return stringBuffer.toString();
    }

    public int getSize() {
        return this._size;
    }

    public BlockWritable[] getSmallBlocks() {
        return this._small_store.getBlocks();
    }

    public Object[] getViewableArray() {
        String message;
        BlockWritable[] blockWritableArr;
        Object[] objArr = new Object[1];
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            if (this._big_store.isValid()) {
                blockWritableArr = this._big_store.getBlocks();
            } else if (this._small_store.isValid()) {
                blockWritableArr = this._small_store.getBlocks();
            } else {
                blockWritableArr = null;
            }
            if (blockWritableArr != null) {
                for (BlockWritable blockWritable : blockWritableArr) {
                    blockWritable.writeBlocks(byteArrayOutputStream);
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                if (byteArray.length > this._property.getSize()) {
                    int size = this._property.getSize();
                    byte[] bArr = new byte[size];
                    System.arraycopy(byteArray, 0, bArr, 0, size);
                    byteArray = bArr;
                }
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                HexDump.dump(byteArray, 0L, byteArrayOutputStream2, 0);
                message = byteArrayOutputStream2.toString();
            } else {
                message = "<NO DATA>";
            }
        } catch (IOException e10) {
            message = e10.getMessage();
        }
        objArr[0] = message;
        return objArr;
    }

    public Iterator getViewableIterator() {
        return Collections.EMPTY_LIST.iterator();
    }

    public boolean preferArray() {
        return true;
    }

    public void read(byte[] bArr, int i10) {
        boolean z10;
        int i11;
        int length = bArr.length;
        DataInputBlock dataInputBlock = getDataInputBlock(i10);
        int available = dataInputBlock.available();
        if (available > length) {
            dataInputBlock.readFully(bArr, 0, length);
            return;
        }
        int i12 = 0;
        while (length > 0) {
            if (length >= available) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                i11 = available;
            } else {
                i11 = length;
            }
            dataInputBlock.readFully(bArr, i12, i11);
            length -= i11;
            i12 += i11;
            i10 += i11;
            if (z10) {
                if (i10 == this._size) {
                    if (length > 0) {
                        throw new IllegalStateException("reached end of document stream unexpectedly");
                    }
                    return;
                }
                dataInputBlock = getDataInputBlock(i10);
                available = dataInputBlock.available();
            }
        }
    }

    @Override // lib.zj.office.fc.poifs.filesystem.BATManaged
    public void setStartBlock(int i10) {
        this._property.setStartBlock(i10);
    }

    @Override // lib.zj.office.fc.poifs.storage.BlockWritable
    public void writeBlocks(OutputStream outputStream) {
        this._big_store.writeBlocks(outputStream);
    }

    /* loaded from: classes3.dex */
    public static final class BigBlockStore {
        private final POIFSBigBlockSize _bigBlockSize;
        private final String _name;
        private final POIFSDocumentPath _path;
        private final int _size;
        private final POIFSWriterListener _writer;
        private DocumentBlock[] bigBlocks;

        public BigBlockStore(POIFSBigBlockSize pOIFSBigBlockSize, DocumentBlock[] documentBlockArr) {
            this._bigBlockSize = pOIFSBigBlockSize;
            this.bigBlocks = documentBlockArr;
            this._path = null;
            this._name = null;
            this._size = -1;
            this._writer = null;
        }

        public int countBlocks() {
            if (isValid()) {
                if (this._writer == null) {
                    return this.bigBlocks.length;
                }
                return ((this._bigBlockSize.getBigBlockSize() + this._size) - 1) / this._bigBlockSize.getBigBlockSize();
            }
            return 0;
        }

        public DocumentBlock[] getBlocks() {
            if (isValid() && this._writer != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(this._size);
                this._writer.processPOIFSWriterEvent(new POIFSWriterEvent(new DocumentOutputStream(byteArrayOutputStream, this._size), this._path, this._name, this._size));
                this.bigBlocks = DocumentBlock.convert(this._bigBlockSize, byteArrayOutputStream.toByteArray(), this._size);
            }
            return this.bigBlocks;
        }

        public boolean isValid() {
            if (this.bigBlocks.length <= 0 && this._writer == null) {
                return false;
            }
            return true;
        }

        public void writeBlocks(OutputStream outputStream) {
            if (isValid()) {
                if (this._writer != null) {
                    DocumentOutputStream documentOutputStream = new DocumentOutputStream(outputStream, this._size);
                    this._writer.processPOIFSWriterEvent(new POIFSWriterEvent(documentOutputStream, this._path, this._name, this._size));
                    documentOutputStream.writeFiller(this._bigBlockSize.getBigBlockSize() * countBlocks(), DocumentBlock.getFillByte());
                    return;
                }
                int i10 = 0;
                while (true) {
                    DocumentBlock[] documentBlockArr = this.bigBlocks;
                    if (i10 < documentBlockArr.length) {
                        documentBlockArr[i10].writeBlocks(outputStream);
                        i10++;
                    } else {
                        return;
                    }
                }
            }
        }

        public BigBlockStore(POIFSBigBlockSize pOIFSBigBlockSize, POIFSDocumentPath pOIFSDocumentPath, String str, int i10, POIFSWriterListener pOIFSWriterListener) {
            this._bigBlockSize = pOIFSBigBlockSize;
            this.bigBlocks = new DocumentBlock[0];
            this._path = pOIFSDocumentPath;
            this._name = str;
            this._size = i10;
            this._writer = pOIFSWriterListener;
        }
    }

    /* loaded from: classes3.dex */
    public static final class SmallBlockStore {
        private final POIFSBigBlockSize _bigBlockSize;
        private final String _name;
        private final POIFSDocumentPath _path;
        private final int _size;
        private SmallDocumentBlock[] _smallBlocks;
        private final POIFSWriterListener _writer;

        public SmallBlockStore(POIFSBigBlockSize pOIFSBigBlockSize, SmallDocumentBlock[] smallDocumentBlockArr) {
            this._bigBlockSize = pOIFSBigBlockSize;
            this._smallBlocks = smallDocumentBlockArr;
            this._path = null;
            this._name = null;
            this._size = -1;
            this._writer = null;
        }

        public SmallDocumentBlock[] getBlocks() {
            if (isValid() && this._writer != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(this._size);
                this._writer.processPOIFSWriterEvent(new POIFSWriterEvent(new DocumentOutputStream(byteArrayOutputStream, this._size), this._path, this._name, this._size));
                this._smallBlocks = SmallDocumentBlock.convert(this._bigBlockSize, byteArrayOutputStream.toByteArray(), this._size);
            }
            return this._smallBlocks;
        }

        public boolean isValid() {
            if (this._smallBlocks.length <= 0 && this._writer == null) {
                return false;
            }
            return true;
        }

        public SmallBlockStore(POIFSBigBlockSize pOIFSBigBlockSize, POIFSDocumentPath pOIFSDocumentPath, String str, int i10, POIFSWriterListener pOIFSWriterListener) {
            this._bigBlockSize = pOIFSBigBlockSize;
            this._smallBlocks = new SmallDocumentBlock[0];
            this._path = pOIFSDocumentPath;
            this._name = str;
            this._size = i10;
            this._writer = pOIFSWriterListener;
        }
    }

    public POIFSDocument(String str, SmallDocumentBlock[] smallDocumentBlockArr, int i10) {
        this._size = i10;
        if (smallDocumentBlockArr.length == 0) {
            this._bigBigBlockSize = POIFSConstants.SMALLER_BIG_BLOCK_SIZE_DETAILS;
        } else {
            this._bigBigBlockSize = smallDocumentBlockArr[0].getBigBlockSize();
        }
        this._big_store = new BigBlockStore(this._bigBigBlockSize, EMPTY_BIG_BLOCK_ARRAY);
        this._property = new DocumentProperty(str, this._size);
        this._small_store = new SmallBlockStore(this._bigBigBlockSize, smallDocumentBlockArr);
        this._property.setDocument(this);
    }

    public POIFSDocument(String str, POIFSBigBlockSize pOIFSBigBlockSize, ListManagedBlock[] listManagedBlockArr, int i10) {
        this._size = i10;
        this._bigBigBlockSize = pOIFSBigBlockSize;
        DocumentProperty documentProperty = new DocumentProperty(str, i10);
        this._property = documentProperty;
        documentProperty.setDocument(this);
        if (Property.isSmall(this._size)) {
            this._big_store = new BigBlockStore(pOIFSBigBlockSize, EMPTY_BIG_BLOCK_ARRAY);
            this._small_store = new SmallBlockStore(pOIFSBigBlockSize, convertRawBlocksToSmallBlocks(listManagedBlockArr));
            return;
        }
        this._big_store = new BigBlockStore(pOIFSBigBlockSize, convertRawBlocksToBigBlocks(listManagedBlockArr));
        this._small_store = new SmallBlockStore(pOIFSBigBlockSize, EMPTY_SMALL_BLOCK_ARRAY);
    }

    public POIFSDocument(String str, ListManagedBlock[] listManagedBlockArr, int i10) {
        this(str, POIFSConstants.SMALLER_BIG_BLOCK_SIZE_DETAILS, listManagedBlockArr, i10);
    }

    public POIFSDocument(String str, POIFSBigBlockSize pOIFSBigBlockSize, InputStream inputStream) {
        DocumentBlock documentBlock;
        ArrayList arrayList = new ArrayList();
        this._size = 0;
        this._bigBigBlockSize = pOIFSBigBlockSize;
        do {
            documentBlock = new DocumentBlock(inputStream, pOIFSBigBlockSize);
            int size = documentBlock.size();
            if (size > 0) {
                arrayList.add(documentBlock);
                this._size += size;
            }
        } while (!documentBlock.partiallyRead());
        DocumentBlock[] documentBlockArr = (DocumentBlock[]) arrayList.toArray(new DocumentBlock[arrayList.size()]);
        this._big_store = new BigBlockStore(pOIFSBigBlockSize, documentBlockArr);
        DocumentProperty documentProperty = new DocumentProperty(str, this._size);
        this._property = documentProperty;
        documentProperty.setDocument(this);
        if (this._property.shouldUseSmallBlocks()) {
            this._small_store = new SmallBlockStore(pOIFSBigBlockSize, SmallDocumentBlock.convert(pOIFSBigBlockSize, documentBlockArr, this._size));
            this._big_store = new BigBlockStore(pOIFSBigBlockSize, new DocumentBlock[0]);
            return;
        }
        this._small_store = new SmallBlockStore(pOIFSBigBlockSize, EMPTY_SMALL_BLOCK_ARRAY);
    }

    public POIFSDocument(String str, InputStream inputStream) {
        this(str, POIFSConstants.SMALLER_BIG_BLOCK_SIZE_DETAILS, inputStream);
    }

    public POIFSDocument(String str, int i10, POIFSBigBlockSize pOIFSBigBlockSize, POIFSDocumentPath pOIFSDocumentPath, POIFSWriterListener pOIFSWriterListener) {
        this._size = i10;
        this._bigBigBlockSize = pOIFSBigBlockSize;
        DocumentProperty documentProperty = new DocumentProperty(str, i10);
        this._property = documentProperty;
        documentProperty.setDocument(this);
        if (this._property.shouldUseSmallBlocks()) {
            this._small_store = new SmallBlockStore(pOIFSBigBlockSize, pOIFSDocumentPath, str, i10, pOIFSWriterListener);
            this._big_store = new BigBlockStore(pOIFSBigBlockSize, EMPTY_BIG_BLOCK_ARRAY);
            return;
        }
        this._small_store = new SmallBlockStore(pOIFSBigBlockSize, EMPTY_SMALL_BLOCK_ARRAY);
        this._big_store = new BigBlockStore(pOIFSBigBlockSize, pOIFSDocumentPath, str, i10, pOIFSWriterListener);
    }

    public POIFSDocument(String str, int i10, POIFSDocumentPath pOIFSDocumentPath, POIFSWriterListener pOIFSWriterListener) {
        this(str, i10, POIFSConstants.SMALLER_BIG_BLOCK_SIZE_DETAILS, pOIFSDocumentPath, pOIFSWriterListener);
    }
}
