package lib.zj.office.fc.poifs.property;

import java.io.OutputStream;
import java.util.List;
import lib.zj.office.fc.poifs.common.POIFSBigBlockSize;
import lib.zj.office.fc.poifs.storage.BlockWritable;
import lib.zj.office.fc.poifs.storage.HeaderBlock;
import lib.zj.office.fc.poifs.storage.PropertyBlock;
import lib.zj.office.fc.poifs.storage.RawDataBlockList;

/* loaded from: classes3.dex */
public final class PropertyTable extends PropertyTableBase implements BlockWritable {
    private POIFSBigBlockSize _bigBigBlockSize;
    private BlockWritable[] _blocks;

    public PropertyTable(HeaderBlock headerBlock) {
        super(headerBlock);
        this._bigBigBlockSize = headerBlock.getBigBlockSize();
        this._blocks = null;
    }

    @Override // lib.zj.office.fc.poifs.filesystem.BATManaged
    public int countBlocks() {
        BlockWritable[] blockWritableArr = this._blocks;
        if (blockWritableArr == null) {
            return 0;
        }
        return blockWritableArr.length;
    }

    public void preWrite() {
        List<Property> list = this._properties;
        Property[] propertyArr = (Property[]) list.toArray(new Property[list.size()]);
        for (int i10 = 0; i10 < propertyArr.length; i10++) {
            propertyArr[i10].setIndex(i10);
        }
        this._blocks = PropertyBlock.createPropertyBlockArray(this._bigBigBlockSize, this._properties);
        for (Property property : propertyArr) {
            property.preWrite();
        }
    }

    @Override // lib.zj.office.fc.poifs.storage.BlockWritable
    public void writeBlocks(OutputStream outputStream) {
        if (this._blocks != null) {
            int i10 = 0;
            while (true) {
                BlockWritable[] blockWritableArr = this._blocks;
                if (i10 < blockWritableArr.length) {
                    blockWritableArr[i10].writeBlocks(outputStream);
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public PropertyTable(HeaderBlock headerBlock, RawDataBlockList rawDataBlockList) {
        super(headerBlock, PropertyFactory.convertToProperties(rawDataBlockList.fetchBlocks(headerBlock.getPropertyStart(), -1)));
        this._bigBigBlockSize = headerBlock.getBigBlockSize();
        this._blocks = null;
    }
}
