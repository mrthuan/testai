package lib.zj.office.fc.poifs.filesystem;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import lib.zj.office.fc.poifs.filesystem.BlockStore;

/* loaded from: classes3.dex */
public class NPOIFSStream implements Iterable<ByteBuffer> {
    private BlockStore blockStore;
    private int startBlock;

    /* loaded from: classes3.dex */
    public class StreamBlockByteBufferIterator implements Iterator<ByteBuffer> {
        private BlockStore.ChainLoopDetector loopDetector;
        private int nextBlock;

        public StreamBlockByteBufferIterator(int i10) {
            this.nextBlock = i10;
            try {
                this.loopDetector = NPOIFSStream.this.blockStore.getChainLoopDetector();
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.nextBlock == -2) {
                return false;
            }
            return true;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public ByteBuffer next() {
            int i10 = this.nextBlock;
            if (i10 != -2) {
                try {
                    this.loopDetector.claim(i10);
                    ByteBuffer blockAt = NPOIFSStream.this.blockStore.getBlockAt(this.nextBlock);
                    this.nextBlock = NPOIFSStream.this.blockStore.getNextBlock(this.nextBlock);
                    return blockAt;
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
            throw new IndexOutOfBoundsException("Can't read past the end of the stream");
        }
    }

    public NPOIFSStream(BlockStore blockStore, int i10) {
        this.blockStore = blockStore;
        this.startBlock = i10;
    }

    public void free() {
        free(this.blockStore.getChainLoopDetector());
    }

    public Iterator<ByteBuffer> getBlockIterator() {
        int i10 = this.startBlock;
        if (i10 != -2) {
            return new StreamBlockByteBufferIterator(i10);
        }
        throw new IllegalStateException("Can't read from a new stream before it has been written to");
    }

    public int getStartBlock() {
        return this.startBlock;
    }

    @Override // java.lang.Iterable
    public Iterator<ByteBuffer> iterator() {
        return getBlockIterator();
    }

    public void updateContents(byte[] bArr) {
        int blockStoreBlockSize = this.blockStore.getBlockStoreBlockSize();
        int ceil = (int) Math.ceil(bArr.length / blockStoreBlockSize);
        BlockStore.ChainLoopDetector chainLoopDetector = this.blockStore.getChainLoopDetector();
        int i10 = this.startBlock;
        int i11 = -2;
        for (int i12 = 0; i12 < ceil; i12++) {
            if (i10 == -2) {
                int freeBlock = this.blockStore.getFreeBlock();
                chainLoopDetector.claim(freeBlock);
                if (i11 != -2) {
                    this.blockStore.setNextBlock(i11, freeBlock);
                }
                this.blockStore.setNextBlock(freeBlock, -2);
                if (this.startBlock == -2) {
                    this.startBlock = freeBlock;
                }
                i11 = freeBlock;
                i10 = -2;
            } else {
                chainLoopDetector.claim(i10);
                i11 = i10;
                i10 = this.blockStore.getNextBlock(i10);
            }
            int i13 = i12 * blockStoreBlockSize;
            this.blockStore.createBlockIfNeeded(i11).put(bArr, i13, Math.min(bArr.length - i13, blockStoreBlockSize));
        }
        new NPOIFSStream(this.blockStore, i10).free(chainLoopDetector);
        this.blockStore.setNextBlock(i11, -2);
    }

    private void free(BlockStore.ChainLoopDetector chainLoopDetector) {
        int i10 = this.startBlock;
        while (i10 != -2) {
            chainLoopDetector.claim(i10);
            int nextBlock = this.blockStore.getNextBlock(i10);
            this.blockStore.setNextBlock(i10, -1);
            i10 = nextBlock;
        }
        this.startBlock = -2;
    }

    public NPOIFSStream(BlockStore blockStore) {
        this.blockStore = blockStore;
        this.startBlock = -2;
    }
}
