package lib.zj.office.fc.poifs.storage;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lib.zj.office.fc.poifs.common.POIFSBigBlockSize;

/* loaded from: classes3.dex */
public final class SmallDocumentBlock implements BlockWritable, ListManagedBlock {
    private static final int BLOCK_MASK = 63;
    private static final int BLOCK_SHIFT = 6;
    private static final int _block_size = 64;
    private static final byte _default_fill = -1;
    private final POIFSBigBlockSize _bigBlockSize;
    private final int _blocks_per_big_block;
    private byte[] _data;

    private SmallDocumentBlock(POIFSBigBlockSize pOIFSBigBlockSize, byte[] bArr, int i10) {
        this(pOIFSBigBlockSize);
        System.arraycopy(bArr, i10 * 64, this._data, 0, 64);
    }

    public static int calcSize(int i10) {
        return i10 * 64;
    }

    public static SmallDocumentBlock[] convert(POIFSBigBlockSize pOIFSBigBlockSize, byte[] bArr, int i10) {
        int i11 = ((i10 + 64) - 1) / 64;
        SmallDocumentBlock[] smallDocumentBlockArr = new SmallDocumentBlock[i11];
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            SmallDocumentBlock smallDocumentBlock = new SmallDocumentBlock(pOIFSBigBlockSize);
            smallDocumentBlockArr[i13] = smallDocumentBlock;
            if (i12 < bArr.length) {
                int min = Math.min(64, bArr.length - i12);
                System.arraycopy(bArr, i12, smallDocumentBlockArr[i13]._data, 0, min);
                if (min != 64) {
                    Arrays.fill(smallDocumentBlockArr[i13]._data, min, 64, (byte) -1);
                }
            } else {
                Arrays.fill(smallDocumentBlock._data, (byte) -1);
            }
            i12 += 64;
        }
        return smallDocumentBlockArr;
    }

    private static int convertToBlockCount(int i10) {
        return ((i10 + 64) - 1) / 64;
    }

    public static List extract(POIFSBigBlockSize pOIFSBigBlockSize, ListManagedBlock[] listManagedBlockArr) {
        int blocksPerBigBlock = getBlocksPerBigBlock(pOIFSBigBlockSize);
        ArrayList arrayList = new ArrayList();
        for (ListManagedBlock listManagedBlock : listManagedBlockArr) {
            byte[] data = listManagedBlock.getData();
            for (int i10 = 0; i10 < blocksPerBigBlock; i10++) {
                arrayList.add(new SmallDocumentBlock(pOIFSBigBlockSize, data, i10));
            }
        }
        return arrayList;
    }

    public static int fill(POIFSBigBlockSize pOIFSBigBlockSize, List list) {
        int blocksPerBigBlock = getBlocksPerBigBlock(pOIFSBigBlockSize);
        int size = list.size();
        int i10 = ((size + blocksPerBigBlock) - 1) / blocksPerBigBlock;
        int i11 = blocksPerBigBlock * i10;
        while (size < i11) {
            list.add(makeEmptySmallDocumentBlock(pOIFSBigBlockSize));
            size++;
        }
        return i10;
    }

    private static int getBlocksPerBigBlock(POIFSBigBlockSize pOIFSBigBlockSize) {
        return pOIFSBigBlockSize.getBigBlockSize() / 64;
    }

    public static DataInputBlock getDataInputBlock(SmallDocumentBlock[] smallDocumentBlockArr, int i10) {
        return new DataInputBlock(smallDocumentBlockArr[i10 >> 6]._data, i10 & 63);
    }

    private static SmallDocumentBlock makeEmptySmallDocumentBlock(POIFSBigBlockSize pOIFSBigBlockSize) {
        SmallDocumentBlock smallDocumentBlock = new SmallDocumentBlock(pOIFSBigBlockSize);
        Arrays.fill(smallDocumentBlock._data, (byte) -1);
        return smallDocumentBlock;
    }

    public POIFSBigBlockSize getBigBlockSize() {
        return this._bigBlockSize;
    }

    @Override // lib.zj.office.fc.poifs.storage.ListManagedBlock
    public byte[] getData() {
        return this._data;
    }

    @Override // lib.zj.office.fc.poifs.storage.BlockWritable
    public void writeBlocks(OutputStream outputStream) {
        outputStream.write(this._data);
    }

    private SmallDocumentBlock(POIFSBigBlockSize pOIFSBigBlockSize) {
        this._bigBlockSize = pOIFSBigBlockSize;
        this._blocks_per_big_block = getBlocksPerBigBlock(pOIFSBigBlockSize);
        this._data = new byte[64];
    }

    public static SmallDocumentBlock[] convert(POIFSBigBlockSize pOIFSBigBlockSize, BlockWritable[] blockWritableArr, int i10) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (BlockWritable blockWritable : blockWritableArr) {
            blockWritable.writeBlocks(byteArrayOutputStream);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int convertToBlockCount = convertToBlockCount(i10);
        SmallDocumentBlock[] smallDocumentBlockArr = new SmallDocumentBlock[convertToBlockCount];
        for (int i11 = 0; i11 < convertToBlockCount; i11++) {
            smallDocumentBlockArr[i11] = new SmallDocumentBlock(pOIFSBigBlockSize, byteArray, i11);
        }
        return smallDocumentBlockArr;
    }
}
