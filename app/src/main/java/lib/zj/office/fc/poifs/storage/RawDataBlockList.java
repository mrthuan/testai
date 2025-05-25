package lib.zj.office.fc.poifs.storage;

import java.io.InputStream;
import java.util.ArrayList;
import lib.zj.office.fc.poifs.common.POIFSBigBlockSize;

/* loaded from: classes3.dex */
public class RawDataBlockList extends BlockListImpl {
    public RawDataBlockList(InputStream inputStream, POIFSBigBlockSize pOIFSBigBlockSize) {
        RawDataBlock rawDataBlock;
        ArrayList arrayList = new ArrayList();
        do {
            rawDataBlock = new RawDataBlock(inputStream, pOIFSBigBlockSize.getBigBlockSize());
            if (rawDataBlock.hasData()) {
                arrayList.add(rawDataBlock);
            }
        } while (!rawDataBlock.eof());
        setBlocks((ListManagedBlock[]) arrayList.toArray(new RawDataBlock[arrayList.size()]));
    }

    @Override // lib.zj.office.fc.poifs.storage.BlockListImpl, lib.zj.office.fc.poifs.storage.BlockList
    public /* bridge */ /* synthetic */ int blockCount() {
        return super.blockCount();
    }

    @Override // lib.zj.office.fc.poifs.storage.BlockListImpl, lib.zj.office.fc.poifs.storage.BlockList
    public /* bridge */ /* synthetic */ ListManagedBlock[] fetchBlocks(int i10, int i11) {
        return super.fetchBlocks(i10, i11);
    }

    @Override // lib.zj.office.fc.poifs.storage.BlockListImpl, lib.zj.office.fc.poifs.storage.BlockList
    public /* bridge */ /* synthetic */ ListManagedBlock get(int i10) {
        return super.get(i10);
    }

    @Override // lib.zj.office.fc.poifs.storage.BlockListImpl, lib.zj.office.fc.poifs.storage.BlockList
    public /* bridge */ /* synthetic */ ListManagedBlock remove(int i10) {
        return super.remove(i10);
    }

    @Override // lib.zj.office.fc.poifs.storage.BlockListImpl, lib.zj.office.fc.poifs.storage.BlockList
    public /* bridge */ /* synthetic */ void setBAT(BlockAllocationTableReader blockAllocationTableReader) {
        super.setBAT(blockAllocationTableReader);
    }

    @Override // lib.zj.office.fc.poifs.storage.BlockListImpl, lib.zj.office.fc.poifs.storage.BlockList
    public /* bridge */ /* synthetic */ void zap(int i10) {
        super.zap(i10);
    }
}
