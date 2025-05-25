package lib.zj.office.fc.poifs.storage;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import lib.zj.office.fc.poifs.common.POIFSBigBlockSize;

/* loaded from: classes3.dex */
public class HeaderBlockWriter implements HeaderBlockConstants, BlockWritable {
    private final HeaderBlock _header_block;

    public HeaderBlockWriter(POIFSBigBlockSize pOIFSBigBlockSize) {
        this._header_block = new HeaderBlock(pOIFSBigBlockSize);
    }

    public static int calculateXBATStorageRequirements(POIFSBigBlockSize pOIFSBigBlockSize, int i10) {
        if (i10 > 109) {
            return BATBlock.calculateXBATStorageRequirements(pOIFSBigBlockSize, i10 - 109);
        }
        return 0;
    }

    public BATBlock[] setBATBlocks(int i10, int i11) {
        BATBlock[] createXBATBlocks;
        POIFSBigBlockSize bigBlockSize = this._header_block.getBigBlockSize();
        this._header_block.setBATCount(i10);
        int min = Math.min(i10, 109);
        int[] iArr = new int[min];
        for (int i12 = 0; i12 < min; i12++) {
            iArr[i12] = i11 + i12;
        }
        this._header_block.setBATArray(iArr);
        if (i10 > 109) {
            int i13 = i10 - 109;
            int[] iArr2 = new int[i13];
            for (int i14 = 0; i14 < i13; i14++) {
                iArr2[i14] = i11 + i14 + 109;
            }
            int i15 = i11 + i10;
            createXBATBlocks = BATBlock.createXBATBlocks(bigBlockSize, iArr2, i15);
            this._header_block.setXBATStart(i15);
        } else {
            createXBATBlocks = BATBlock.createXBATBlocks(bigBlockSize, new int[0], 0);
            this._header_block.setXBATStart(-2);
        }
        this._header_block.setXBATCount(createXBATBlocks.length);
        return createXBATBlocks;
    }

    public void setPropertyStart(int i10) {
        this._header_block.setPropertyStart(i10);
    }

    public void setSBATBlockCount(int i10) {
        this._header_block.setSBATBlockCount(i10);
    }

    public void setSBATStart(int i10) {
        this._header_block.setSBATStart(i10);
    }

    public void writeBlock(ByteBuffer byteBuffer) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(this._header_block.getBigBlockSize().getBigBlockSize());
        this._header_block.writeData(byteArrayOutputStream);
        byteBuffer.put(byteArrayOutputStream.toByteArray());
    }

    @Override // lib.zj.office.fc.poifs.storage.BlockWritable
    public void writeBlocks(OutputStream outputStream) {
        this._header_block.writeData(outputStream);
    }

    public HeaderBlockWriter(HeaderBlock headerBlock) {
        this._header_block = headerBlock;
    }
}
