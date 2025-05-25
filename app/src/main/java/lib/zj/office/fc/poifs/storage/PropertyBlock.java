package lib.zj.office.fc.poifs.storage;

import java.io.OutputStream;
import java.util.List;
import lib.zj.office.fc.poifs.common.POIFSBigBlockSize;
import lib.zj.office.fc.poifs.property.Property;

/* loaded from: classes3.dex */
public final class PropertyBlock extends BigBlock {
    private Property[] _properties;

    private PropertyBlock(POIFSBigBlockSize pOIFSBigBlockSize, Property[] propertyArr, int i10) {
        super(pOIFSBigBlockSize);
        this._properties = new Property[pOIFSBigBlockSize.getPropertiesPerBlock()];
        int i11 = 0;
        while (true) {
            Property[] propertyArr2 = this._properties;
            if (i11 < propertyArr2.length) {
                propertyArr2[i11] = propertyArr[i11 + i10];
                i11++;
            } else {
                return;
            }
        }
    }

    public static BlockWritable[] createPropertyBlockArray(POIFSBigBlockSize pOIFSBigBlockSize, List<Property> list) {
        int propertiesPerBlock = pOIFSBigBlockSize.getPropertiesPerBlock();
        int size = ((list.size() + propertiesPerBlock) - 1) / propertiesPerBlock;
        int i10 = size * propertiesPerBlock;
        Property[] propertyArr = new Property[i10];
        System.arraycopy(list.toArray(new Property[0]), 0, propertyArr, 0, list.size());
        for (int size2 = list.size(); size2 < i10; size2++) {
            propertyArr[size2] = new Property() { // from class: lib.zj.office.fc.poifs.storage.PropertyBlock.1
                @Override // lib.zj.office.fc.poifs.property.Property
                public boolean isDirectory() {
                    return false;
                }

                @Override // lib.zj.office.fc.poifs.property.Property
                public void preWrite() {
                }
            };
        }
        BlockWritable[] blockWritableArr = new BlockWritable[size];
        for (int i11 = 0; i11 < size; i11++) {
            blockWritableArr[i11] = new PropertyBlock(pOIFSBigBlockSize, propertyArr, i11 * propertiesPerBlock);
        }
        return blockWritableArr;
    }

    @Override // lib.zj.office.fc.poifs.storage.BigBlock, lib.zj.office.fc.poifs.storage.BlockWritable
    public /* bridge */ /* synthetic */ void writeBlocks(OutputStream outputStream) {
        super.writeBlocks(outputStream);
    }

    @Override // lib.zj.office.fc.poifs.storage.BigBlock
    public void writeData(OutputStream outputStream) {
        int propertiesPerBlock = this.bigBlockSize.getPropertiesPerBlock();
        for (int i10 = 0; i10 < propertiesPerBlock; i10++) {
            this._properties[i10].writeData(outputStream);
        }
    }
}
