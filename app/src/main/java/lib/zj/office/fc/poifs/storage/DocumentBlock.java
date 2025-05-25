package lib.zj.office.fc.poifs.storage;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import lib.zj.office.fc.poifs.common.POIFSBigBlockSize;
import lib.zj.office.fc.util.IOUtils;

/* loaded from: classes3.dex */
public final class DocumentBlock extends BigBlock {
    private static final byte _default_value = -1;
    private int _bytes_read;
    private byte[] _data;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public DocumentBlock(lib.zj.office.fc.poifs.storage.RawDataBlock r3) {
        /*
            r2 = this;
            int r0 = r3.getBigBlockSize()
            r1 = 512(0x200, float:7.17E-43)
            if (r0 != r1) goto Lb
            lib.zj.office.fc.poifs.common.POIFSBigBlockSize r0 = lib.zj.office.fc.poifs.common.POIFSConstants.SMALLER_BIG_BLOCK_SIZE_DETAILS
            goto Ld
        Lb:
            lib.zj.office.fc.poifs.common.POIFSBigBlockSize r0 = lib.zj.office.fc.poifs.common.POIFSConstants.LARGER_BIG_BLOCK_SIZE_DETAILS
        Ld:
            r2.<init>(r0)
            byte[] r3 = r3.getData()
            r2._data = r3
            int r3 = r3.length
            r2._bytes_read = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.office.fc.poifs.storage.DocumentBlock.<init>(lib.zj.office.fc.poifs.storage.RawDataBlock):void");
    }

    public static DocumentBlock[] convert(POIFSBigBlockSize pOIFSBigBlockSize, byte[] bArr, int i10) {
        int bigBlockSize = ((pOIFSBigBlockSize.getBigBlockSize() + i10) - 1) / pOIFSBigBlockSize.getBigBlockSize();
        DocumentBlock[] documentBlockArr = new DocumentBlock[bigBlockSize];
        int i11 = 0;
        for (int i12 = 0; i12 < bigBlockSize; i12++) {
            DocumentBlock documentBlock = new DocumentBlock(pOIFSBigBlockSize);
            documentBlockArr[i12] = documentBlock;
            if (i11 < bArr.length) {
                int min = Math.min(pOIFSBigBlockSize.getBigBlockSize(), bArr.length - i11);
                System.arraycopy(bArr, i11, documentBlockArr[i12]._data, 0, min);
                if (min != pOIFSBigBlockSize.getBigBlockSize()) {
                    Arrays.fill(documentBlockArr[i12]._data, min, pOIFSBigBlockSize.getBigBlockSize(), (byte) -1);
                }
            } else {
                Arrays.fill(documentBlock._data, (byte) -1);
            }
            i11 += pOIFSBigBlockSize.getBigBlockSize();
        }
        return documentBlockArr;
    }

    public static DataInputBlock getDataInputBlock(DocumentBlock[] documentBlockArr, int i10) {
        if (documentBlockArr != null && documentBlockArr.length != 0) {
            POIFSBigBlockSize pOIFSBigBlockSize = documentBlockArr[0].bigBlockSize;
            return new DataInputBlock(documentBlockArr[i10 >> pOIFSBigBlockSize.getHeaderValue()]._data, i10 & (pOIFSBigBlockSize.getBigBlockSize() - 1));
        }
        return null;
    }

    public static byte getFillByte() {
        return (byte) -1;
    }

    public boolean partiallyRead() {
        if (this._bytes_read != this.bigBlockSize.getBigBlockSize()) {
            return true;
        }
        return false;
    }

    public int size() {
        return this._bytes_read;
    }

    @Override // lib.zj.office.fc.poifs.storage.BigBlock, lib.zj.office.fc.poifs.storage.BlockWritable
    public /* bridge */ /* synthetic */ void writeBlocks(OutputStream outputStream) {
        super.writeBlocks(outputStream);
    }

    @Override // lib.zj.office.fc.poifs.storage.BigBlock
    public void writeData(OutputStream outputStream) {
        doWriteData(outputStream, this._data);
    }

    public DocumentBlock(InputStream inputStream, POIFSBigBlockSize pOIFSBigBlockSize) {
        this(pOIFSBigBlockSize);
        int readFully = IOUtils.readFully(inputStream, this._data);
        this._bytes_read = readFully == -1 ? 0 : readFully;
    }

    private DocumentBlock(POIFSBigBlockSize pOIFSBigBlockSize) {
        super(pOIFSBigBlockSize);
        byte[] bArr = new byte[pOIFSBigBlockSize.getBigBlockSize()];
        this._data = bArr;
        Arrays.fill(bArr, (byte) -1);
    }
}
