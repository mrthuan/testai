package lib.zj.office.fc.poifs.storage;

import a0.a;
import a6.h;
import java.io.IOException;
import java.util.ArrayList;
import lib.zj.office.fc.poifs.common.POIFSBigBlockSize;
import lib.zj.office.fc.util.IntList;
import lib.zj.office.fc.util.LittleEndian;
import lib.zj.office.fc.util.POILogFactory;
import lib.zj.office.fc.util.POILogger;

/* loaded from: classes3.dex */
public final class BlockAllocationTableReader {
    private static final int MAX_BLOCK_COUNT = 65535;
    private static final POILogger _logger = POILogFactory.getLogger(BlockAllocationTableReader.class);
    private final IntList _entries;
    private POIFSBigBlockSize bigBlockSize;

    public BlockAllocationTableReader(POIFSBigBlockSize pOIFSBigBlockSize, int i10, int[] iArr, int i11, int i12, BlockList blockList) {
        this(pOIFSBigBlockSize);
        sanityCheckBlockCount(i10);
        int min = Math.min(i10, iArr.length);
        RawDataBlock[] rawDataBlockArr = new RawDataBlock[i10];
        int i13 = 0;
        while (i13 < min) {
            int i14 = iArr[i13];
            if (i14 <= blockList.blockCount()) {
                rawDataBlockArr[i13] = (RawDataBlock) blockList.remove(i14);
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
                int xBATEntriesPerBlock = pOIFSBigBlockSize.getXBATEntriesPerBlock();
                int nextXBATChainOffset = pOIFSBigBlockSize.getNextXBATChainOffset();
                for (int i15 = 0; i15 < i11; i15++) {
                    int min2 = Math.min(i10 - i13, xBATEntriesPerBlock);
                    byte[] data = blockList.remove(i12).getData();
                    int i16 = 0;
                    int i17 = 0;
                    while (i16 < min2) {
                        rawDataBlockArr[i13] = (RawDataBlock) blockList.remove(LittleEndian.getInt(data, i17));
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

    public static void sanityCheckBlockCount(int i10) {
        if (i10 > 0) {
            if (i10 <= 65535) {
                return;
            }
            throw new IOException(a.g("Block count ", i10, " is too high. POI maximum is 65535."));
        }
        throw new IOException(a.g("Illegal block count; minimum count is 1, got ", i10, " instead"));
    }

    private void setEntries(ListManagedBlock[] listManagedBlockArr, BlockList blockList) {
        int bATEntriesPerBlock = this.bigBlockSize.getBATEntriesPerBlock();
        for (int i10 = 0; i10 < listManagedBlockArr.length; i10++) {
            byte[] data = listManagedBlockArr[i10].getData();
            int i11 = 0;
            for (int i12 = 0; i12 < bATEntriesPerBlock; i12++) {
                int i13 = LittleEndian.getInt(data, i11);
                if (i13 == -1) {
                    blockList.zap(this._entries.size());
                }
                this._entries.add(i13);
                i11 += 4;
            }
            listManagedBlockArr[i10] = null;
        }
        blockList.setBAT(this);
    }

    public ListManagedBlock[] fetchBlocks(int i10, int i11, BlockList blockList) {
        ArrayList arrayList = new ArrayList();
        boolean z10 = true;
        while (i10 != -2) {
            try {
                arrayList.add(blockList.remove(i10));
                i10 = this._entries.get(i10);
                z10 = false;
            } catch (IOException e10) {
                if (i10 == i11) {
                    _logger.log(POILogger.WARN, "Warning, header block comes after data blocks in POIFS block listing");
                } else if (i10 == 0 && z10) {
                    _logger.log(POILogger.WARN, "Warning, incorrectly terminated empty data blocks in POIFS block listing (should end at -2, ended at 0)");
                } else {
                    throw e10;
                }
                i10 = -2;
            }
        }
        return (ListManagedBlock[]) arrayList.toArray(new ListManagedBlock[arrayList.size()]);
    }

    public int getNextBlockIndex(int i10) {
        if (isUsed(i10)) {
            return this._entries.get(i10);
        }
        throw new IOException(a.g("index ", i10, " is unused"));
    }

    public boolean isUsed(int i10) {
        try {
            if (this._entries.get(i10) == -1) {
                return false;
            }
            return true;
        } catch (IndexOutOfBoundsException unused) {
            return false;
        }
    }

    public BlockAllocationTableReader(POIFSBigBlockSize pOIFSBigBlockSize, ListManagedBlock[] listManagedBlockArr, BlockList blockList) {
        this(pOIFSBigBlockSize);
        setEntries(listManagedBlockArr, blockList);
    }

    public BlockAllocationTableReader(POIFSBigBlockSize pOIFSBigBlockSize) {
        this.bigBlockSize = pOIFSBigBlockSize;
        this._entries = new IntList();
    }
}
