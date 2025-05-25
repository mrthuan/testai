package lib.zj.office.fc.fs.filesystem;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import lib.zj.office.fc.fs.storage.BlockAllocationTableReader;
import lib.zj.office.fc.fs.storage.BlockList;
import lib.zj.office.fc.fs.storage.HeaderBlock;
import lib.zj.office.fc.fs.storage.RawDataBlock;
import lib.zj.office.system.f;

/* loaded from: classes3.dex */
public class CFBFileSystem {
    private BlockSize bigBlockSize;
    private HeaderBlock headerBlock;
    private boolean isGetThumbnail;
    private Property root;

    public CFBFileSystem(InputStream inputStream, f fVar) {
        this(inputStream, false, fVar);
    }

    private void createPropertyTree(Property property, List<Property> list) {
        int childPropertyIndex = property.getChildPropertyIndex();
        if (childPropertyIndex < 0) {
            return;
        }
        Stack stack = new Stack();
        stack.push(list.get(childPropertyIndex));
        while (!stack.isEmpty()) {
            Property property2 = (Property) stack.pop();
            property.addChildProperty(property2);
            if (property2.isDirectory()) {
                createPropertyTree(property2, list);
            }
            int previousPropertyIndex = property2.getPreviousPropertyIndex();
            if (previousPropertyIndex >= 0) {
                stack.push(list.get(previousPropertyIndex));
            }
            int nextPropertyIndex = property2.getNextPropertyIndex();
            if (nextPropertyIndex >= 0) {
                stack.push(list.get(nextPropertyIndex));
            }
        }
    }

    private void getPropertyRawData(Property property, BlockList blockList, BlockList blockList2) {
        RawDataBlock[] fetchBlocks;
        String name = property.getName();
        int startBlock = property.getStartBlock();
        if (property.shouldUseSmallBlocks()) {
            fetchBlocks = blockList.fetchBlocks(startBlock, this.headerBlock.getPropertyStart());
        } else {
            fetchBlocks = blockList2.fetchBlocks(startBlock, this.headerBlock.getPropertyStart());
        }
        if (fetchBlocks == null || fetchBlocks.length == 0) {
            return;
        }
        if (!name.equals("Pictures") && !name.endsWith("WorkBook") && !name.equals("PowerPoint Document") && !name.endsWith("Ole") && !name.endsWith("ObjInfo") && !name.endsWith("ComObj") && !name.endsWith("EPRINT")) {
            int length = fetchBlocks[0].getData().length;
            byte[] bArr = new byte[fetchBlocks.length * length];
            int i10 = 0;
            for (RawDataBlock rawDataBlock : fetchBlocks) {
                if (rawDataBlock != null) {
                    System.arraycopy(rawDataBlock.getData(), 0, bArr, i10, length);
                    i10 += length;
                }
            }
            property.setDocumentRawData(bArr);
            return;
        }
        property.setBlocks(fetchBlocks);
    }

    private void readPrepertiesRawData(BlockList blockList, BlockList blockList2, Property property) {
        for (Property property2 : property.properties.values()) {
            if (property2.isDocument()) {
                getPropertyRawData(property2, blockList, blockList2);
            } else if (property2.isDirectory()) {
                readPrepertiesRawData(blockList, blockList2, property2);
            }
        }
    }

    private void readProperties(RawDataBlock[] rawDataBlockArr, BlockList blockList, List<Property> list) {
        for (RawDataBlock rawDataBlock : rawDataBlockArr) {
            byte[] data = rawDataBlock.getData();
            int length = data.length / 128;
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                byte b10 = data[i10 + 66];
                if (b10 != 1) {
                    if (b10 != 2) {
                        if (b10 == 5) {
                            Property property = new Property(list.size(), data, i10);
                            this.root = property;
                            list.add(property);
                        }
                    } else {
                        list.add(new Property(list.size(), data, i10));
                    }
                } else {
                    list.add(new Property(list.size(), data, i10));
                }
                i10 += 128;
            }
        }
    }

    private BlockList readSmallRawDataBlock(BlockList blockList) {
        RawDataBlock[] fetchBlocks = blockList.fetchBlocks(this.root.getStartBlock(), -1);
        int bigBlockSize = this.headerBlock.getBigBlockSize().getBigBlockSize() / 64;
        ArrayList arrayList = new ArrayList();
        for (RawDataBlock rawDataBlock : fetchBlocks) {
            byte[] data = rawDataBlock.getData();
            for (int i10 = 0; i10 < bigBlockSize; i10++) {
                byte[] bArr = new byte[64];
                System.arraycopy(data, i10 * 64, bArr, 0, 64);
                arrayList.add(new RawDataBlock(bArr));
            }
        }
        BlockList blockList2 = new BlockList((RawDataBlock[]) arrayList.toArray(new RawDataBlock[arrayList.size()]));
        new BlockAllocationTableReader(this.bigBlockSize, blockList.fetchBlocks(this.headerBlock.getSBATStart(), -1), blockList2);
        return blockList2;
    }

    public void dispose() {
        HeaderBlock headerBlock = this.headerBlock;
        if (headerBlock != null) {
            headerBlock.dispose();
        }
        Property property = this.root;
        if (property != null) {
            property.dispose();
        }
    }

    public Property getProperty(String str) {
        return this.root.getChlidProperty(str);
    }

    public CFBFileSystem(InputStream inputStream, boolean z10, f fVar) {
        this.bigBlockSize = CFBConstants.SMALLER_BIG_BLOCK_SIZE_DETAILS;
        this.isGetThumbnail = z10;
        try {
            HeaderBlock headerBlock = new HeaderBlock(inputStream);
            this.headerBlock = headerBlock;
            BlockSize bigBlockSize = headerBlock.getBigBlockSize();
            this.bigBlockSize = bigBlockSize;
            BlockList blockList = new BlockList(inputStream, bigBlockSize, fVar);
            inputStream.close();
            new BlockAllocationTableReader(this.headerBlock.getBigBlockSize(), this.headerBlock.getBATCount(), this.headerBlock.getBATArray(), this.headerBlock.getXBATCount(), this.headerBlock.getXBATIndex(), blockList);
            ArrayList arrayList = new ArrayList();
            readProperties(blockList.fetchBlocks(this.headerBlock.getPropertyStart(), -1), blockList, arrayList);
            createPropertyTree(this.root, arrayList);
            readPrepertiesRawData(readSmallRawDataBlock(blockList), blockList, this.root);
        } catch (Throwable th2) {
            inputStream.close();
            throw th2;
        }
    }

    public byte[] getPropertyRawData(String str) {
        Property property = getProperty(str);
        if (property != null) {
            return property.getDocumentRawData();
        }
        return null;
    }
}
