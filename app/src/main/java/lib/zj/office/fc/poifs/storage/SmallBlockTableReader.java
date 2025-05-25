package lib.zj.office.fc.poifs.storage;

import lib.zj.office.fc.poifs.common.POIFSBigBlockSize;
import lib.zj.office.fc.poifs.property.RootProperty;

/* loaded from: classes3.dex */
public final class SmallBlockTableReader {
    public static BlockList getSmallDocumentBlocks(POIFSBigBlockSize pOIFSBigBlockSize, RawDataBlockList rawDataBlockList, RootProperty rootProperty, int i10) {
        SmallDocumentBlockList smallDocumentBlockList = new SmallDocumentBlockList(SmallDocumentBlock.extract(pOIFSBigBlockSize, rawDataBlockList.fetchBlocks(rootProperty.getStartBlock(), -1)));
        new BlockAllocationTableReader(pOIFSBigBlockSize, rawDataBlockList.fetchBlocks(i10, -1), smallDocumentBlockList);
        return smallDocumentBlockList;
    }
}
