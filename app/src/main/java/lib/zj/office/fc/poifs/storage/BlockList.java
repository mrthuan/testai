package lib.zj.office.fc.poifs.storage;

/* loaded from: classes3.dex */
public interface BlockList {
    int blockCount();

    ListManagedBlock[] fetchBlocks(int i10, int i11);

    ListManagedBlock get(int i10);

    ListManagedBlock remove(int i10);

    void setBAT(BlockAllocationTableReader blockAllocationTableReader);

    void zap(int i10);
}
