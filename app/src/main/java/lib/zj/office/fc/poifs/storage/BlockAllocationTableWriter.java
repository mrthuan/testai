package lib.zj.office.fc.poifs.storage;

import java.io.OutputStream;
import java.nio.ByteBuffer;
import lib.zj.office.fc.poifs.common.POIFSBigBlockSize;
import lib.zj.office.fc.poifs.filesystem.BATManaged;
import lib.zj.office.fc.util.IntList;

/* loaded from: classes3.dex */
public final class BlockAllocationTableWriter implements BlockWritable, BATManaged {
    private POIFSBigBlockSize _bigBlockSize;
    private int _start_block = -2;
    private IntList _entries = new IntList();
    private BATBlock[] _blocks = new BATBlock[0];

    public BlockAllocationTableWriter(POIFSBigBlockSize pOIFSBigBlockSize) {
        this._bigBlockSize = pOIFSBigBlockSize;
    }

    public static void writeBlock(BATBlock bATBlock, ByteBuffer byteBuffer) {
        bATBlock.writeData(byteBuffer);
    }

    public int allocateSpace(int i10) {
        int size = this._entries.size();
        if (i10 > 0) {
            int i11 = i10 - 1;
            int i12 = size + 1;
            int i13 = 0;
            while (i13 < i11) {
                this._entries.add(i12);
                i13++;
                i12++;
            }
            this._entries.add(-2);
        }
        return size;
    }

    @Override // lib.zj.office.fc.poifs.filesystem.BATManaged
    public int countBlocks() {
        return this._blocks.length;
    }

    public int createBlocks() {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int calculateStorageRequirements = BATBlock.calculateStorageRequirements(this._bigBlockSize, this._entries.size() + i10 + i11);
            int calculateXBATStorageRequirements = HeaderBlockWriter.calculateXBATStorageRequirements(this._bigBlockSize, calculateStorageRequirements);
            if (i10 == calculateStorageRequirements && i11 == calculateXBATStorageRequirements) {
                int allocateSpace = allocateSpace(i10);
                allocateSpace(i11);
                simpleCreateBlocks();
                return allocateSpace;
            }
            i10 = calculateStorageRequirements;
            i11 = calculateXBATStorageRequirements;
        }
    }

    public int getStartBlock() {
        return this._start_block;
    }

    @Override // lib.zj.office.fc.poifs.filesystem.BATManaged
    public void setStartBlock(int i10) {
        this._start_block = i10;
    }

    public void simpleCreateBlocks() {
        this._blocks = BATBlock.createBATBlocks(this._bigBlockSize, this._entries.toArray());
    }

    @Override // lib.zj.office.fc.poifs.storage.BlockWritable
    public void writeBlocks(OutputStream outputStream) {
        int i10 = 0;
        while (true) {
            BATBlock[] bATBlockArr = this._blocks;
            if (i10 < bATBlockArr.length) {
                bATBlockArr[i10].writeBlocks(outputStream);
                i10++;
            } else {
                return;
            }
        }
    }
}
