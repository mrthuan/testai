package lib.zj.office.fc.poifs.filesystem;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PushbackInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lib.zj.office.fc.poifs.common.POIFSBigBlockSize;
import lib.zj.office.fc.poifs.common.POIFSConstants;
import lib.zj.office.fc.poifs.property.DirectoryProperty;
import lib.zj.office.fc.poifs.property.Property;
import lib.zj.office.fc.poifs.property.PropertyTable;
import lib.zj.office.fc.poifs.storage.BATBlock;
import lib.zj.office.fc.poifs.storage.BlockAllocationTableReader;
import lib.zj.office.fc.poifs.storage.BlockAllocationTableWriter;
import lib.zj.office.fc.poifs.storage.BlockList;
import lib.zj.office.fc.poifs.storage.BlockWritable;
import lib.zj.office.fc.poifs.storage.HeaderBlock;
import lib.zj.office.fc.poifs.storage.HeaderBlockWriter;
import lib.zj.office.fc.poifs.storage.RawDataBlockList;
import lib.zj.office.fc.poifs.storage.SmallBlockTableReader;
import lib.zj.office.fc.poifs.storage.SmallBlockTableWriter;
import lib.zj.office.fc.util.CloseIgnoringInputStream;
import lib.zj.office.fc.util.IOUtils;
import lib.zj.office.fc.util.LongField;
import lib.zj.office.fc.util.POILogFactory;
import lib.zj.office.fc.util.POILogger;

/* loaded from: classes3.dex */
public class POIFSFileSystem {
    private static final POILogger _logger = POILogFactory.getLogger(POIFSFileSystem.class);
    private List _documents;
    private PropertyTable _property_table;
    private DirectoryNode _root;
    private POIFSBigBlockSize bigBlockSize;

    public POIFSFileSystem() {
        this.bigBlockSize = POIFSConstants.SMALLER_BIG_BLOCK_SIZE_DETAILS;
        this._property_table = new PropertyTable(new HeaderBlock(this.bigBlockSize));
        this._documents = new ArrayList();
        this._root = null;
    }

    private void closeInputStream(InputStream inputStream, boolean z10) {
        if (inputStream.markSupported() && !(inputStream instanceof ByteArrayInputStream)) {
            _logger.log(POILogger.WARN, "POIFS is closing the supplied input stream of type (" + inputStream.getClass().getName() + ") which supports mark/reset.  This will be a problem for the caller if the stream will still be used.  If that is the case the caller should wrap the input stream to avoid this close logic.  This warning is only temporary and will not be present in future versions of POI.");
        }
        try {
            inputStream.close();
        } catch (IOException e10) {
            if (!z10) {
                e10.printStackTrace();
                return;
            }
            throw new RuntimeException(e10);
        }
    }

    public static InputStream createNonClosingInputStream(InputStream inputStream) {
        return new CloseIgnoringInputStream(inputStream);
    }

    public static boolean hasPOIFSHeader(InputStream inputStream) {
        inputStream.mark(8);
        byte[] bArr = new byte[8];
        IOUtils.readFully(inputStream, bArr);
        LongField longField = new LongField(0, bArr);
        if (inputStream instanceof PushbackInputStream) {
            ((PushbackInputStream) inputStream).unread(bArr);
        } else {
            inputStream.reset();
        }
        if (longField.get() != -2226271756974174256L) {
            return false;
        }
        return true;
    }

    public static void main(String[] strArr) {
        if (strArr.length != 2) {
            System.err.println("two arguments required: input filename and output filename");
            System.exit(1);
        }
        FileInputStream fileInputStream = new FileInputStream(strArr[0]);
        FileOutputStream fileOutputStream = new FileOutputStream(strArr[1]);
        new POIFSFileSystem(fileInputStream).writeFilesystem(fileOutputStream);
        fileInputStream.close();
        fileOutputStream.close();
    }

    private void processProperties(BlockList blockList, BlockList blockList2, Iterator it, DirectoryNode directoryNode, int i10) {
        DirectoryNode directoryNode2;
        POIFSDocument pOIFSDocument;
        while (it.hasNext()) {
            Property property = (Property) it.next();
            String name = property.getName();
            if (directoryNode == null) {
                directoryNode2 = getRoot();
            } else {
                directoryNode2 = directoryNode;
            }
            if (property.isDirectory()) {
                DirectoryNode directoryNode3 = (DirectoryNode) directoryNode2.createDirectory(name);
                directoryNode3.setStorageClsid(property.getStorageClsid());
                processProperties(blockList, blockList2, ((DirectoryProperty) property).getChildren(), directoryNode3, i10);
            } else {
                int startBlock = property.getStartBlock();
                int size = property.getSize();
                if (property.shouldUseSmallBlocks()) {
                    pOIFSDocument = new POIFSDocument(name, blockList.fetchBlocks(startBlock, i10), size);
                } else {
                    pOIFSDocument = new POIFSDocument(name, blockList2.fetchBlocks(startBlock, i10), size);
                }
                directoryNode2.createDocument(pOIFSDocument);
            }
        }
    }

    public void addDirectory(DirectoryProperty directoryProperty) {
        this._property_table.addProperty(directoryProperty);
    }

    public void addDocument(POIFSDocument pOIFSDocument) {
        this._documents.add(pOIFSDocument);
        this._property_table.addProperty(pOIFSDocument.getDocumentProperty());
    }

    public DirectoryEntry createDirectory(String str) {
        return getRoot().createDirectory(str);
    }

    public DocumentEntry createDocument(InputStream inputStream, String str) {
        return getRoot().createDocument(str, inputStream);
    }

    public DocumentInputStream createDocumentInputStream(String str) {
        return getRoot().createDocumentInputStream(str);
    }

    public int getBigBlockSize() {
        return this.bigBlockSize.getBigBlockSize();
    }

    public POIFSBigBlockSize getBigBlockSizeDetails() {
        return this.bigBlockSize;
    }

    public DirectoryNode getRoot() {
        if (this._root == null) {
            this._root = new DirectoryNode(this._property_table.getRoot(), this, (DirectoryNode) null);
        }
        return this._root;
    }

    public String getShortDescription() {
        return "POIFS FileSystem";
    }

    public void remove(EntryNode entryNode) {
        this._property_table.removeProperty(entryNode.getProperty());
        if (entryNode.isDocumentEntry()) {
            this._documents.remove(((DocumentNode) entryNode).getDocument());
        }
    }

    public void writeFilesystem(OutputStream outputStream) {
        this._property_table.preWrite();
        SmallBlockTableWriter smallBlockTableWriter = new SmallBlockTableWriter(this.bigBlockSize, this._documents, this._property_table.getRoot());
        BlockAllocationTableWriter blockAllocationTableWriter = new BlockAllocationTableWriter(this.bigBlockSize);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this._documents);
        arrayList.add(this._property_table);
        arrayList.add(smallBlockTableWriter);
        arrayList.add(smallBlockTableWriter.getSBAT());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            BATManaged bATManaged = (BATManaged) it.next();
            int countBlocks = bATManaged.countBlocks();
            if (countBlocks != 0) {
                bATManaged.setStartBlock(blockAllocationTableWriter.allocateSpace(countBlocks));
            }
        }
        int createBlocks = blockAllocationTableWriter.createBlocks();
        HeaderBlockWriter headerBlockWriter = new HeaderBlockWriter(this.bigBlockSize);
        BATBlock[] bATBlocks = headerBlockWriter.setBATBlocks(blockAllocationTableWriter.countBlocks(), createBlocks);
        headerBlockWriter.setPropertyStart(this._property_table.getStartBlock());
        headerBlockWriter.setSBATStart(smallBlockTableWriter.getSBAT().getStartBlock());
        headerBlockWriter.setSBATBlockCount(smallBlockTableWriter.getSBATBlockCount());
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(headerBlockWriter);
        arrayList2.addAll(this._documents);
        arrayList2.add(this._property_table);
        arrayList2.add(smallBlockTableWriter);
        arrayList2.add(smallBlockTableWriter.getSBAT());
        arrayList2.add(blockAllocationTableWriter);
        for (BATBlock bATBlock : bATBlocks) {
            arrayList2.add(bATBlock);
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            ((BlockWritable) it2.next()).writeBlocks(outputStream);
        }
    }

    public DocumentEntry createDocument(String str, int i10, POIFSWriterListener pOIFSWriterListener) {
        return getRoot().createDocument(str, i10, pOIFSWriterListener);
    }

    public POIFSFileSystem(InputStream inputStream) {
        this();
        try {
            HeaderBlock headerBlock = new HeaderBlock(inputStream);
            POIFSBigBlockSize bigBlockSize = headerBlock.getBigBlockSize();
            this.bigBlockSize = bigBlockSize;
            RawDataBlockList rawDataBlockList = new RawDataBlockList(inputStream, bigBlockSize);
            closeInputStream(inputStream, true);
            new BlockAllocationTableReader(headerBlock.getBigBlockSize(), headerBlock.getBATCount(), headerBlock.getBATArray(), headerBlock.getXBATCount(), headerBlock.getXBATIndex(), rawDataBlockList);
            PropertyTable propertyTable = new PropertyTable(headerBlock, rawDataBlockList);
            processProperties(SmallBlockTableReader.getSmallDocumentBlocks(this.bigBlockSize, rawDataBlockList, propertyTable.getRoot(), headerBlock.getSBATStart()), rawDataBlockList, propertyTable.getRoot().getChildren(), null, headerBlock.getPropertyStart());
            getRoot().setStorageClsid(propertyTable.getRoot().getStorageClsid());
        } catch (Throwable th2) {
            closeInputStream(inputStream, false);
            throw th2;
        }
    }
}
