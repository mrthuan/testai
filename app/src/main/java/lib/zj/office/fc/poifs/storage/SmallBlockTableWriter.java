package lib.zj.office.fc.poifs.storage;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lib.zj.office.fc.poifs.common.POIFSBigBlockSize;
import lib.zj.office.fc.poifs.filesystem.BATManaged;
import lib.zj.office.fc.poifs.filesystem.POIFSDocument;
import lib.zj.office.fc.poifs.property.RootProperty;

/* loaded from: classes3.dex */
public class SmallBlockTableWriter implements BlockWritable, BATManaged {
    private int _big_block_count;
    private RootProperty _root;
    private BlockAllocationTableWriter _sbat;
    private List _small_blocks = new ArrayList();

    public SmallBlockTableWriter(POIFSBigBlockSize pOIFSBigBlockSize, List list, RootProperty rootProperty) {
        this._sbat = new BlockAllocationTableWriter(pOIFSBigBlockSize);
        this._root = rootProperty;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            POIFSDocument pOIFSDocument = (POIFSDocument) it.next();
            BlockWritable[] smallBlocks = pOIFSDocument.getSmallBlocks();
            if (smallBlocks.length != 0) {
                pOIFSDocument.setStartBlock(this._sbat.allocateSpace(smallBlocks.length));
                for (BlockWritable blockWritable : smallBlocks) {
                    this._small_blocks.add(blockWritable);
                }
            } else {
                pOIFSDocument.setStartBlock(-2);
            }
        }
        this._sbat.simpleCreateBlocks();
        this._root.setSize(this._small_blocks.size());
        this._big_block_count = SmallDocumentBlock.fill(pOIFSBigBlockSize, this._small_blocks);
    }

    @Override // lib.zj.office.fc.poifs.filesystem.BATManaged
    public int countBlocks() {
        return this._big_block_count;
    }

    public BlockAllocationTableWriter getSBAT() {
        return this._sbat;
    }

    public int getSBATBlockCount() {
        return (this._big_block_count + 15) / 16;
    }

    @Override // lib.zj.office.fc.poifs.filesystem.BATManaged
    public void setStartBlock(int i10) {
        this._root.setStartBlock(i10);
    }

    @Override // lib.zj.office.fc.poifs.storage.BlockWritable
    public void writeBlocks(OutputStream outputStream) {
        for (BlockWritable blockWritable : this._small_blocks) {
            blockWritable.writeBlocks(outputStream);
        }
    }
}
