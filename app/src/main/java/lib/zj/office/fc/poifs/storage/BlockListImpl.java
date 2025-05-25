package lib.zj.office.fc.poifs.storage;

import androidx.appcompat.view.menu.d;
import java.io.IOException;

/* loaded from: classes3.dex */
abstract class BlockListImpl implements BlockList {
    private ListManagedBlock[] _blocks = new ListManagedBlock[0];
    private BlockAllocationTableReader _bat = null;

    @Override // lib.zj.office.fc.poifs.storage.BlockList
    public int blockCount() {
        return this._blocks.length;
    }

    @Override // lib.zj.office.fc.poifs.storage.BlockList
    public ListManagedBlock[] fetchBlocks(int i10, int i11) {
        BlockAllocationTableReader blockAllocationTableReader = this._bat;
        if (blockAllocationTableReader != null) {
            return blockAllocationTableReader.fetchBlocks(i10, i11, this);
        }
        throw new IOException("Improperly initialized list: no block allocation table provided");
    }

    @Override // lib.zj.office.fc.poifs.storage.BlockList
    public ListManagedBlock get(int i10) {
        ListManagedBlock[] listManagedBlockArr = this._blocks;
        if (listManagedBlockArr != null && i10 >= 0 && i10 < listManagedBlockArr.length) {
            return listManagedBlockArr[i10];
        }
        return null;
    }

    public int remainingBlocks() {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ListManagedBlock[] listManagedBlockArr = this._blocks;
            if (i10 < listManagedBlockArr.length) {
                if (listManagedBlockArr[i10] != null) {
                    i11++;
                }
                i10++;
            } else {
                return i11;
            }
        }
    }

    @Override // lib.zj.office.fc.poifs.storage.BlockList
    public ListManagedBlock remove(int i10) {
        try {
            ListManagedBlock[] listManagedBlockArr = this._blocks;
            ListManagedBlock listManagedBlock = listManagedBlockArr[i10];
            if (listManagedBlock != null) {
                listManagedBlockArr[i10] = null;
                return listManagedBlock;
            }
            throw new IOException("block[ " + i10 + " ] already removed - does your POIFS have circular or duplicate block references?");
        } catch (ArrayIndexOutOfBoundsException unused) {
            StringBuilder e10 = d.e("Cannot remove block[ ", i10, " ]; out of range[ 0 - ");
            e10.append(this._blocks.length - 1);
            e10.append(" ]");
            throw new IOException(e10.toString());
        }
    }

    @Override // lib.zj.office.fc.poifs.storage.BlockList
    public void setBAT(BlockAllocationTableReader blockAllocationTableReader) {
        if (this._bat == null) {
            this._bat = blockAllocationTableReader;
            return;
        }
        throw new IOException("Attempt to replace existing BlockAllocationTable");
    }

    public void setBlocks(ListManagedBlock[] listManagedBlockArr) {
        this._blocks = listManagedBlockArr;
    }

    @Override // lib.zj.office.fc.poifs.storage.BlockList
    public void zap(int i10) {
        ListManagedBlock[] listManagedBlockArr = this._blocks;
        if (listManagedBlockArr != null && i10 >= 0 && i10 < listManagedBlockArr.length) {
            listManagedBlockArr[i10] = null;
        }
    }
}
