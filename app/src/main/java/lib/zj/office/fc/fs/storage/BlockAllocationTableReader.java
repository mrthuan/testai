package lib.zj.office.fc.fs.storage;

import a6.h;
import java.io.IOException;
import java.util.ArrayList;
import lib.zj.office.fc.fs.filesystem.BlockSize;

/* loaded from: classes3.dex */
public final class BlockAllocationTableReader {
    private final IntList _entries = new IntList();
    private BlockSize bigBlockSize;

    public BlockAllocationTableReader(BlockSize blockSize, int i10, int[] iArr, int i11, int i12, BlockList blockList) {
        this.bigBlockSize = blockSize;
        int min = Math.min(i10, iArr.length);
        RawDataBlock[] rawDataBlockArr = new RawDataBlock[i10];
        int i13 = 0;
        while (i13 < min) {
            int i14 = iArr[i13];
            if (i14 <= blockList.blockCount()) {
                rawDataBlockArr[i13] = blockList.get(i14);
                i13++;
            } else {
                StringBuilder sb2 = new StringBuilder("Your file contains ");
                sb2.append(blockList.blockCount());
                sb2.append(" sectors, but the initial DIFAT array at index ");
                sb2.append(i13);
                sb2.append(" referenced block # ");
                throw new IOException(h.g(sb2, i14, ". This isn't allowed and  your file is corrupt"));
            }
        }
        if (i13 < i10) {
            if (i12 >= 0) {
                int xBATEntriesPerBlock = blockSize.getXBATEntriesPerBlock();
                int nextXBATChainOffset = blockSize.getNextXBATChainOffset();
                for (int i15 = 0; i15 < i11; i15++) {
                    int min2 = Math.min(i10 - i13, xBATEntriesPerBlock);
                    byte[] data = blockList.get(i12).getData();
                    int i16 = 0;
                    int i17 = 0;
                    while (i16 < min2) {
                        rawDataBlockArr[i13] = blockList.get(LittleEndian.getInt(data, i17));
                        i17 += 4;
                        i16++;
                        i13++;
                    }
                    i12 = LittleEndian.getInt(data, nextXBATChainOffset);
                    if (i12 == -2) {
                        break;
                    }
                }
            } else {
                throw new IOException("BAT count exceeds limit, yet XBAT index indicates no valid entries");
            }
        }
        if (i13 == i10) {
            setEntries(rawDataBlockArr, blockList);
            return;
        }
        throw new IOException("Could not find all blocks");
    }

    private void setEntries(RawDataBlock[] rawDataBlockArr, BlockList blockList) {
        int bATEntriesPerBlock = this.bigBlockSize.getBATEntriesPerBlock();
        for (int i10 = 0; i10 < rawDataBlockArr.length; i10++) {
            byte[] data = rawDataBlockArr[i10].getData();
            int i11 = 0;
            for (int i12 = 0; i12 < bATEntriesPerBlock; i12++) {
                int i13 = LittleEndian.getInt(data, i11);
                if (i13 == -1) {
                    blockList.zap(this._entries.size());
                }
                this._entries.add(i13);
                i11 += 4;
            }
            rawDataBlockArr[i10] = null;
        }
        blockList.setBAT(this);
    }

    public RawDataBlock[] fetchBlocks(int i10, int i11, BlockList blockList) {
        ArrayList arrayList = new ArrayList();
        boolean z10 = true;
        while (i10 != -2) {
            try {
                arrayList.add(blockList.get(i10));
                i10 = this._entries.get(i10);
                z10 = false;
            } catch (Exception e10) {
                if (i10 == i11 || (i10 == 0 && z10)) {
                    i10 = -2;
                } else {
                    throw e10;
                }
            }
        }
        return (RawDataBlock[]) arrayList.toArray(new RawDataBlock[arrayList.size()]);
    }

    public BlockAllocationTableReader(BlockSize blockSize, RawDataBlock[] rawDataBlockArr, BlockList blockList) {
        this.bigBlockSize = blockSize;
        setEntries(rawDataBlockArr, blockList);
    }
}
