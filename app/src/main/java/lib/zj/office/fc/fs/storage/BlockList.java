package lib.zj.office.fc.fs.storage;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import lib.zj.office.fc.fs.filesystem.BlockSize;
import lib.zj.office.system.f;
import lib.zj.office.system.p;

/* loaded from: classes3.dex */
public class BlockList {
    private BlockAllocationTableReader _bat;
    private RawDataBlock[] _blocks;

    public BlockList(InputStream inputStream, BlockSize blockSize, f fVar) {
        int read;
        ArrayList arrayList = new ArrayList();
        int bigBlockSize = blockSize.getBigBlockSize();
        boolean z10 = fVar != null && (fVar instanceof p);
        do {
            if (z10 && (fVar == null || ((p) fVar).f21049a)) {
                break;
            }
            byte[] bArr = new byte[bigBlockSize];
            read = inputStream.read(bArr);
            if (read <= 0) {
                break;
            }
            arrayList.add(new RawDataBlock(bArr));
        } while (read == bigBlockSize);
        this._blocks = (RawDataBlock[]) arrayList.toArray(new RawDataBlock[arrayList.size()]);
    }

    public int blockCount() {
        return this._blocks.length;
    }

    public RawDataBlock[] fetchBlocks(int i10, int i11) {
        BlockAllocationTableReader blockAllocationTableReader = this._bat;
        if (blockAllocationTableReader != null) {
            return blockAllocationTableReader.fetchBlocks(i10, i11, this);
        }
        throw new IOException("Improperly initialized list: no block allocation table provided");
    }

    public RawDataBlock get(int i10) {
        return this._blocks[i10];
    }

    public RawDataBlock remove(int i10) {
        if (i10 >= 0) {
            RawDataBlock[] rawDataBlockArr = this._blocks;
            if (i10 < rawDataBlockArr.length) {
                RawDataBlock rawDataBlock = rawDataBlockArr[i10];
                rawDataBlockArr[i10] = null;
                return rawDataBlock;
            }
        }
        return null;
    }

    public void setBAT(BlockAllocationTableReader blockAllocationTableReader) {
        this._bat = blockAllocationTableReader;
    }

    public void zap(int i10) {
        if (i10 >= 0) {
            RawDataBlock[] rawDataBlockArr = this._blocks;
            if (i10 < rawDataBlockArr.length) {
                rawDataBlockArr[i10] = null;
            }
        }
    }

    public BlockList(RawDataBlock[] rawDataBlockArr) {
        this._blocks = rawDataBlockArr;
    }
}
