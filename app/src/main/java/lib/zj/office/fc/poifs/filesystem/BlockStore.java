package lib.zj.office.fc.poifs.filesystem;

import a0.a;
import java.nio.ByteBuffer;
import lib.zj.office.fc.poifs.storage.BATBlock;

/* loaded from: classes3.dex */
public abstract class BlockStore {

    /* loaded from: classes3.dex */
    public class ChainLoopDetector {
        private boolean[] used_blocks;

        public ChainLoopDetector(long j10) {
            this.used_blocks = new boolean[(int) Math.ceil(j10 / BlockStore.this.getBlockStoreBlockSize())];
        }

        public void claim(int i10) {
            boolean[] zArr = this.used_blocks;
            if (i10 >= zArr.length) {
                return;
            }
            if (!zArr[i10]) {
                zArr[i10] = true;
                return;
            }
            throw new IllegalStateException(a.g("Potential loop detected - Block ", i10, " was already claimed but was just requested again"));
        }
    }

    public abstract ByteBuffer createBlockIfNeeded(int i10);

    public abstract BATBlock.BATBlockAndIndex getBATBlockAndIndex(int i10);

    public abstract ByteBuffer getBlockAt(int i10);

    public abstract int getBlockStoreBlockSize();

    public abstract ChainLoopDetector getChainLoopDetector();

    public abstract int getFreeBlock();

    public abstract int getNextBlock(int i10);

    public abstract void setNextBlock(int i10, int i11);
}
