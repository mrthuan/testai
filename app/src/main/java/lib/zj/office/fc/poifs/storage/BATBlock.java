package lib.zj.office.fc.poifs.storage;

import a6.h;
import androidx.appcompat.view.menu.d;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import lib.zj.office.fc.poifs.common.POIFSBigBlockSize;
import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public final class BATBlock extends BigBlock {
    private boolean _has_free_sectors;
    private int[] _values;
    private int ourBlockIndex;

    /* loaded from: classes3.dex */
    public static class BATBlockAndIndex {
        private final BATBlock block;
        private final int index;

        public /* synthetic */ BATBlockAndIndex(int i10, BATBlock bATBlock, int i11) {
            this(i10, bATBlock);
        }

        public BATBlock getBlock() {
            return this.block;
        }

        public int getIndex() {
            return this.index;
        }

        private BATBlockAndIndex(int i10, BATBlock bATBlock) {
            this.index = i10;
            this.block = bATBlock;
        }
    }

    private BATBlock(POIFSBigBlockSize pOIFSBigBlockSize) {
        super(pOIFSBigBlockSize);
        int[] iArr = new int[pOIFSBigBlockSize.getBATEntriesPerBlock()];
        this._values = iArr;
        this._has_free_sectors = true;
        Arrays.fill(iArr, -1);
    }

    public static int calculateMaximumSize(POIFSBigBlockSize pOIFSBigBlockSize, int i10) {
        return pOIFSBigBlockSize.getBigBlockSize() * ((pOIFSBigBlockSize.getBATEntriesPerBlock() * i10) + 1);
    }

    public static int calculateStorageRequirements(POIFSBigBlockSize pOIFSBigBlockSize, int i10) {
        int bATEntriesPerBlock = pOIFSBigBlockSize.getBATEntriesPerBlock();
        return ((i10 + bATEntriesPerBlock) - 1) / bATEntriesPerBlock;
    }

    public static int calculateXBATStorageRequirements(POIFSBigBlockSize pOIFSBigBlockSize, int i10) {
        int xBATEntriesPerBlock = pOIFSBigBlockSize.getXBATEntriesPerBlock();
        return ((i10 + xBATEntriesPerBlock) - 1) / xBATEntriesPerBlock;
    }

    public static BATBlock createBATBlock(POIFSBigBlockSize pOIFSBigBlockSize, ByteBuffer byteBuffer) {
        BATBlock bATBlock = new BATBlock(pOIFSBigBlockSize);
        byte[] bArr = new byte[4];
        for (int i10 = 0; i10 < bATBlock._values.length; i10++) {
            byteBuffer.get(bArr);
            bATBlock._values[i10] = LittleEndian.getInt(bArr);
        }
        bATBlock.recomputeFree();
        return bATBlock;
    }

    public static BATBlock[] createBATBlocks(POIFSBigBlockSize pOIFSBigBlockSize, int[] iArr) {
        int length;
        BATBlock[] bATBlockArr = new BATBlock[calculateStorageRequirements(pOIFSBigBlockSize, iArr.length)];
        int length2 = iArr.length;
        int bATEntriesPerBlock = pOIFSBigBlockSize.getBATEntriesPerBlock();
        int i10 = 0;
        int i11 = 0;
        while (i10 < iArr.length) {
            int i12 = i11 + 1;
            if (length2 > bATEntriesPerBlock) {
                length = i10 + bATEntriesPerBlock;
            } else {
                length = iArr.length;
            }
            bATBlockArr[i11] = new BATBlock(pOIFSBigBlockSize, iArr, i10, length);
            length2 -= bATEntriesPerBlock;
            i10 += bATEntriesPerBlock;
            i11 = i12;
        }
        return bATBlockArr;
    }

    public static BATBlock createEmptyBATBlock(POIFSBigBlockSize pOIFSBigBlockSize, boolean z10) {
        BATBlock bATBlock = new BATBlock(pOIFSBigBlockSize);
        if (z10) {
            bATBlock.setXBATChain(pOIFSBigBlockSize, -2);
        }
        return bATBlock;
    }

    public static BATBlock[] createXBATBlocks(POIFSBigBlockSize pOIFSBigBlockSize, int[] iArr, int i10) {
        int length;
        int calculateXBATStorageRequirements = calculateXBATStorageRequirements(pOIFSBigBlockSize, iArr.length);
        BATBlock[] bATBlockArr = new BATBlock[calculateXBATStorageRequirements];
        int length2 = iArr.length;
        int xBATEntriesPerBlock = pOIFSBigBlockSize.getXBATEntriesPerBlock();
        if (calculateXBATStorageRequirements != 0) {
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            while (i12 < iArr.length) {
                int i14 = i13 + 1;
                if (length2 > xBATEntriesPerBlock) {
                    length = i12 + xBATEntriesPerBlock;
                } else {
                    length = iArr.length;
                }
                bATBlockArr[i13] = new BATBlock(pOIFSBigBlockSize, iArr, i12, length);
                length2 -= xBATEntriesPerBlock;
                i12 += xBATEntriesPerBlock;
                i13 = i14;
            }
            while (i11 < calculateXBATStorageRequirements - 1) {
                bATBlockArr[i11].setXBATChain(pOIFSBigBlockSize, i10 + i11 + 1);
                i11++;
            }
            bATBlockArr[i11].setXBATChain(pOIFSBigBlockSize, -2);
        }
        return bATBlockArr;
    }

    public static BATBlockAndIndex getBATBlockAndIndex(int i10, HeaderBlock headerBlock, List<BATBlock> list) {
        POIFSBigBlockSize bigBlockSize = headerBlock.getBigBlockSize();
        return new BATBlockAndIndex(i10 % bigBlockSize.getBATEntriesPerBlock(), list.get((int) Math.floor(i10 / bigBlockSize.getBATEntriesPerBlock())), 0);
    }

    public static BATBlockAndIndex getSBATBlockAndIndex(int i10, HeaderBlock headerBlock, List<BATBlock> list) {
        POIFSBigBlockSize bigBlockSize = headerBlock.getBigBlockSize();
        return new BATBlockAndIndex(i10 % bigBlockSize.getBATEntriesPerBlock(), list.get((int) Math.floor(i10 / bigBlockSize.getBATEntriesPerBlock())), 0);
    }

    private void recomputeFree() {
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            int[] iArr = this._values;
            if (i10 >= iArr.length) {
                break;
            } else if (iArr[i10] == -1) {
                z10 = true;
                break;
            } else {
                i10++;
            }
        }
        this._has_free_sectors = z10;
    }

    private byte[] serialize() {
        byte[] bArr = new byte[this.bigBlockSize.getBigBlockSize()];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int[] iArr = this._values;
            if (i10 < iArr.length) {
                LittleEndian.putInt(bArr, i11, iArr[i10]);
                i11 += 4;
                i10++;
            } else {
                return bArr;
            }
        }
    }

    private void setXBATChain(POIFSBigBlockSize pOIFSBigBlockSize, int i10) {
        this._values[pOIFSBigBlockSize.getXBATEntriesPerBlock()] = i10;
    }

    public int getOurBlockIndex() {
        return this.ourBlockIndex;
    }

    public int getValueAt(int i10) {
        int[] iArr = this._values;
        if (i10 < iArr.length) {
            return iArr[i10];
        }
        throw new ArrayIndexOutOfBoundsException(h.g(d.e("Unable to fetch offset ", i10, " as the BAT only contains "), this._values.length, " entries"));
    }

    public boolean hasFreeSectors() {
        return this._has_free_sectors;
    }

    public void setOurBlockIndex(int i10) {
        this.ourBlockIndex = i10;
    }

    public void setValueAt(int i10, int i11) {
        int[] iArr = this._values;
        int i12 = iArr[i10];
        iArr[i10] = i11;
        if (i11 == -1) {
            this._has_free_sectors = true;
        } else if (i12 == -1) {
            recomputeFree();
        }
    }

    @Override // lib.zj.office.fc.poifs.storage.BigBlock, lib.zj.office.fc.poifs.storage.BlockWritable
    public /* bridge */ /* synthetic */ void writeBlocks(OutputStream outputStream) {
        super.writeBlocks(outputStream);
    }

    @Override // lib.zj.office.fc.poifs.storage.BigBlock
    public void writeData(OutputStream outputStream) {
        outputStream.write(serialize());
    }

    public void writeData(ByteBuffer byteBuffer) {
        byteBuffer.put(serialize());
    }

    public static int calculateMaximumSize(HeaderBlock headerBlock) {
        return calculateMaximumSize(headerBlock.getBigBlockSize(), headerBlock.getBATCount());
    }

    private BATBlock(POIFSBigBlockSize pOIFSBigBlockSize, int[] iArr, int i10, int i11) {
        this(pOIFSBigBlockSize);
        for (int i12 = i10; i12 < i11; i12++) {
            this._values[i12 - i10] = iArr[i12];
        }
        if (i11 - i10 == this._values.length) {
            recomputeFree();
        }
    }
}
