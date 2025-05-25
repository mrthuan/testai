package lib.zj.office.fc.poifs.filesystem;

import a0.a;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import lib.zj.office.fc.poifs.filesystem.BlockStore;
import lib.zj.office.fc.poifs.property.RootProperty;
import lib.zj.office.fc.poifs.storage.BATBlock;
import lib.zj.office.fc.poifs.storage.BlockAllocationTableWriter;
import lib.zj.office.fc.poifs.storage.HeaderBlock;

/* loaded from: classes3.dex */
public class NPOIFSMiniStore extends BlockStore {
    private NPOIFSFileSystem _filesystem;
    private HeaderBlock _header;
    private NPOIFSStream _mini_stream;
    private RootProperty _root;
    private List<BATBlock> _sbat_blocks;

    public NPOIFSMiniStore(NPOIFSFileSystem nPOIFSFileSystem, RootProperty rootProperty, List<BATBlock> list, HeaderBlock headerBlock) {
        this._filesystem = nPOIFSFileSystem;
        this._sbat_blocks = list;
        this._header = headerBlock;
        this._root = rootProperty;
        this._mini_stream = new NPOIFSStream(nPOIFSFileSystem, rootProperty.getStartBlock());
    }

    @Override // lib.zj.office.fc.poifs.filesystem.BlockStore
    public ByteBuffer createBlockIfNeeded(int i10) {
        try {
            return getBlockAt(i10);
        } catch (IndexOutOfBoundsException unused) {
            int freeBlock = this._filesystem.getFreeBlock();
            this._filesystem.createBlockIfNeeded(freeBlock);
            BlockStore.ChainLoopDetector chainLoopDetector = this._filesystem.getChainLoopDetector();
            int startBlock = this._mini_stream.getStartBlock();
            while (true) {
                chainLoopDetector.claim(startBlock);
                int nextBlock = this._filesystem.getNextBlock(startBlock);
                if (nextBlock == -2) {
                    this._filesystem.setNextBlock(startBlock, freeBlock);
                    this._filesystem.setNextBlock(freeBlock, -2);
                    return createBlockIfNeeded(i10);
                }
                startBlock = nextBlock;
            }
        }
    }

    @Override // lib.zj.office.fc.poifs.filesystem.BlockStore
    public BATBlock.BATBlockAndIndex getBATBlockAndIndex(int i10) {
        return BATBlock.getSBATBlockAndIndex(i10, this._header, this._sbat_blocks);
    }

    @Override // lib.zj.office.fc.poifs.filesystem.BlockStore
    public ByteBuffer getBlockAt(int i10) {
        int i11 = i10 * 64;
        int bigBlockSize = i11 / this._filesystem.getBigBlockSize();
        int bigBlockSize2 = i11 % this._filesystem.getBigBlockSize();
        Iterator<ByteBuffer> blockIterator = this._mini_stream.getBlockIterator();
        for (int i12 = 0; i12 < bigBlockSize; i12++) {
            blockIterator.next();
        }
        ByteBuffer next = blockIterator.next();
        if (next != null) {
            next.position(next.position() + bigBlockSize2);
            ByteBuffer slice = next.slice();
            slice.limit(64);
            return slice;
        }
        throw new IndexOutOfBoundsException(a.g("Big block ", bigBlockSize, " outside stream"));
    }

    @Override // lib.zj.office.fc.poifs.filesystem.BlockStore
    public int getBlockStoreBlockSize() {
        return 64;
    }

    @Override // lib.zj.office.fc.poifs.filesystem.BlockStore
    public BlockStore.ChainLoopDetector getChainLoopDetector() {
        return new BlockStore.ChainLoopDetector(this._root.getSize());
    }

    @Override // lib.zj.office.fc.poifs.filesystem.BlockStore
    public int getFreeBlock() {
        int bATEntriesPerBlock = this._filesystem.getBigBlockSizeDetails().getBATEntriesPerBlock();
        int i10 = 0;
        for (int i11 = 0; i11 < this._sbat_blocks.size(); i11++) {
            BATBlock bATBlock = this._sbat_blocks.get(i11);
            if (bATBlock.hasFreeSectors()) {
                for (int i12 = 0; i12 < bATEntriesPerBlock; i12++) {
                    if (bATBlock.getValueAt(i12) == -1) {
                        return i10 + i12;
                    }
                }
                continue;
            }
            i10 += bATEntriesPerBlock;
        }
        BATBlock createEmptyBATBlock = BATBlock.createEmptyBATBlock(this._filesystem.getBigBlockSizeDetails(), false);
        int freeBlock = this._filesystem.getFreeBlock();
        createEmptyBATBlock.setOurBlockIndex(freeBlock);
        if (this._header.getSBATCount() == 0) {
            this._header.setSBATStart(freeBlock);
            this._header.setSBATBlockCount(1);
        } else {
            BlockStore.ChainLoopDetector chainLoopDetector = this._filesystem.getChainLoopDetector();
            int sBATStart = this._header.getSBATStart();
            while (true) {
                chainLoopDetector.claim(sBATStart);
                int nextBlock = this._filesystem.getNextBlock(sBATStart);
                if (nextBlock == -2) {
                    break;
                }
                sBATStart = nextBlock;
            }
            this._filesystem.setNextBlock(sBATStart, freeBlock);
            HeaderBlock headerBlock = this._header;
            headerBlock.setSBATBlockCount(headerBlock.getSBATCount() + 1);
        }
        this._filesystem.setNextBlock(freeBlock, -2);
        this._sbat_blocks.add(createEmptyBATBlock);
        return i10;
    }

    @Override // lib.zj.office.fc.poifs.filesystem.BlockStore
    public int getNextBlock(int i10) {
        BATBlock.BATBlockAndIndex bATBlockAndIndex = getBATBlockAndIndex(i10);
        return bATBlockAndIndex.getBlock().getValueAt(bATBlockAndIndex.getIndex());
    }

    @Override // lib.zj.office.fc.poifs.filesystem.BlockStore
    public void setNextBlock(int i10, int i11) {
        BATBlock.BATBlockAndIndex bATBlockAndIndex = getBATBlockAndIndex(i10);
        bATBlockAndIndex.getBlock().setValueAt(bATBlockAndIndex.getIndex(), i11);
    }

    public void syncWithDataSource() {
        for (BATBlock bATBlock : this._sbat_blocks) {
            BlockAllocationTableWriter.writeBlock(bATBlock, this._filesystem.getBlockAt(bATBlock.getOurBlockIndex()));
        }
    }
}
