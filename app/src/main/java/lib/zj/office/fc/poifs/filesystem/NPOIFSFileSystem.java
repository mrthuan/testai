package lib.zj.office.fc.poifs.filesystem;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PushbackInputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lib.zj.office.fc.poifs.common.POIFSBigBlockSize;
import lib.zj.office.fc.poifs.common.POIFSConstants;
import lib.zj.office.fc.poifs.filesystem.BlockStore;
import lib.zj.office.fc.poifs.nio.ByteArrayBackedDataSource;
import lib.zj.office.fc.poifs.nio.DataSource;
import lib.zj.office.fc.poifs.nio.FileBackedDataSource;
import lib.zj.office.fc.poifs.property.DirectoryProperty;
import lib.zj.office.fc.poifs.property.NPropertyTable;
import lib.zj.office.fc.poifs.storage.BATBlock;
import lib.zj.office.fc.poifs.storage.BlockAllocationTableReader;
import lib.zj.office.fc.poifs.storage.BlockAllocationTableWriter;
import lib.zj.office.fc.poifs.storage.HeaderBlock;
import lib.zj.office.fc.poifs.storage.HeaderBlockWriter;
import lib.zj.office.fc.util.CloseIgnoringInputStream;
import lib.zj.office.fc.util.IOUtils;
import lib.zj.office.fc.util.LongField;
import lib.zj.office.fc.util.POILogFactory;
import lib.zj.office.fc.util.POILogger;

/* loaded from: classes3.dex */
public class NPOIFSFileSystem extends BlockStore implements Closeable {
    private static final POILogger _logger = POILogFactory.getLogger(NPOIFSFileSystem.class);
    private List<BATBlock> _bat_blocks;
    private DataSource _data;
    private HeaderBlock _header;
    private NPOIFSMiniStore _mini_store;
    private NPropertyTable _property_table;
    private DirectoryNode _root;
    private List<BATBlock> _xbat_blocks;
    private POIFSBigBlockSize bigBlockSize;

    private NPOIFSFileSystem(boolean z10) {
        this.bigBlockSize = POIFSConstants.SMALLER_BIG_BLOCK_SIZE_DETAILS;
        HeaderBlock headerBlock = new HeaderBlock(this.bigBlockSize);
        this._header = headerBlock;
        NPropertyTable nPropertyTable = new NPropertyTable(headerBlock);
        this._property_table = nPropertyTable;
        this._mini_store = new NPOIFSMiniStore(this, nPropertyTable.getRoot(), new ArrayList(), this._header);
        this._xbat_blocks = new ArrayList();
        this._bat_blocks = new ArrayList();
        this._root = null;
        if (z10) {
            this._data = new ByteArrayBackedDataSource(new byte[this.bigBlockSize.getBigBlockSize() * 3]);
        }
    }

    private void closeInputStream(InputStream inputStream, boolean z10) {
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

    private BATBlock createBAT(int i10, boolean z10) {
        BATBlock createEmptyBATBlock = BATBlock.createEmptyBATBlock(this.bigBlockSize, !z10);
        createEmptyBATBlock.setOurBlockIndex(i10);
        this._data.write(ByteBuffer.allocate(this.bigBlockSize.getBigBlockSize()), this.bigBlockSize.getBigBlockSize() * (i10 + 1));
        return createEmptyBATBlock;
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
        new NPOIFSFileSystem(fileInputStream).writeFilesystem(fileOutputStream);
        fileInputStream.close();
        fileOutputStream.close();
    }

    private void readBAT(int i10, BlockStore.ChainLoopDetector chainLoopDetector) {
        chainLoopDetector.claim(i10);
        BATBlock createBATBlock = BATBlock.createBATBlock(this.bigBlockSize, getBlockAt(i10));
        createBATBlock.setOurBlockIndex(i10);
        this._bat_blocks.add(createBATBlock);
    }

    private void readCoreContents() {
        int valueAt;
        this.bigBlockSize = this._header.getBigBlockSize();
        BlockStore.ChainLoopDetector chainLoopDetector = getChainLoopDetector();
        for (int i10 : this._header.getBATArray()) {
            readBAT(i10, chainLoopDetector);
        }
        int xBATIndex = this._header.getXBATIndex();
        for (int i11 = 0; i11 < this._header.getXBATCount(); i11++) {
            chainLoopDetector.claim(xBATIndex);
            BATBlock createBATBlock = BATBlock.createBATBlock(this.bigBlockSize, getBlockAt(xBATIndex));
            createBATBlock.setOurBlockIndex(xBATIndex);
            xBATIndex = createBATBlock.getValueAt(this.bigBlockSize.getXBATEntriesPerBlock());
            this._xbat_blocks.add(createBATBlock);
            for (int i12 = 0; i12 < this.bigBlockSize.getXBATEntriesPerBlock() && (valueAt = createBATBlock.getValueAt(i12)) != -1; i12++) {
                readBAT(valueAt, chainLoopDetector);
            }
        }
        this._property_table = new NPropertyTable(this._header, this);
        ArrayList arrayList = new ArrayList();
        this._mini_store = new NPOIFSMiniStore(this, this._property_table.getRoot(), arrayList, this._header);
        int sBATStart = this._header.getSBATStart();
        for (int i13 = 0; i13 < this._header.getSBATCount(); i13++) {
            chainLoopDetector.claim(sBATStart);
            BATBlock createBATBlock2 = BATBlock.createBATBlock(this.bigBlockSize, getBlockAt(sBATStart));
            createBATBlock2.setOurBlockIndex(sBATStart);
            arrayList.add(createBATBlock2);
            sBATStart = getNextBlock(sBATStart);
        }
    }

    private void syncWithDataSource() {
        new HeaderBlockWriter(this._header).writeBlock(getBlockAt(-1));
        for (BATBlock bATBlock : this._bat_blocks) {
            BlockAllocationTableWriter.writeBlock(bATBlock, getBlockAt(bATBlock.getOurBlockIndex()));
        }
        this._mini_store.syncWithDataSource();
        this._property_table.write(new NPOIFSStream(this, this._header.getPropertyStart()));
    }

    public NPropertyTable _get_property_table() {
        return this._property_table;
    }

    public void addDirectory(DirectoryProperty directoryProperty) {
        this._property_table.addProperty(directoryProperty);
    }

    public void addDocument(NPOIFSDocument nPOIFSDocument) {
        this._property_table.addProperty(nPOIFSDocument.getDocumentProperty());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this._data.close();
    }

    @Override // lib.zj.office.fc.poifs.filesystem.BlockStore
    public ByteBuffer createBlockIfNeeded(int i10) {
        try {
            return getBlockAt(i10);
        } catch (IndexOutOfBoundsException unused) {
            int bigBlockSize = this.bigBlockSize.getBigBlockSize();
            ByteBuffer allocate = ByteBuffer.allocate(getBigBlockSize());
            this._data.write(allocate, bigBlockSize * (i10 + 1));
            return getBlockAt(i10);
        }
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

    @Override // lib.zj.office.fc.poifs.filesystem.BlockStore
    public BATBlock.BATBlockAndIndex getBATBlockAndIndex(int i10) {
        return BATBlock.getBATBlockAndIndex(i10, this._header, this._bat_blocks);
    }

    public int getBigBlockSize() {
        return this.bigBlockSize.getBigBlockSize();
    }

    public POIFSBigBlockSize getBigBlockSizeDetails() {
        return this.bigBlockSize;
    }

    @Override // lib.zj.office.fc.poifs.filesystem.BlockStore
    public ByteBuffer getBlockAt(int i10) {
        int bigBlockSize = this.bigBlockSize.getBigBlockSize();
        return this._data.read(this.bigBlockSize.getBigBlockSize(), bigBlockSize * (i10 + 1));
    }

    @Override // lib.zj.office.fc.poifs.filesystem.BlockStore
    public int getBlockStoreBlockSize() {
        return getBigBlockSize();
    }

    @Override // lib.zj.office.fc.poifs.filesystem.BlockStore
    public BlockStore.ChainLoopDetector getChainLoopDetector() {
        return new BlockStore.ChainLoopDetector(this._data.size());
    }

    @Override // lib.zj.office.fc.poifs.filesystem.BlockStore
    public int getFreeBlock() {
        BATBlock bATBlock;
        int i10 = 0;
        for (int i11 = 0; i11 < this._bat_blocks.size(); i11++) {
            int bATEntriesPerBlock = this.bigBlockSize.getBATEntriesPerBlock();
            BATBlock bATBlock2 = this._bat_blocks.get(i11);
            if (bATBlock2.hasFreeSectors()) {
                for (int i12 = 0; i12 < bATEntriesPerBlock; i12++) {
                    if (bATBlock2.getValueAt(i12) == -1) {
                        return i10 + i12;
                    }
                }
                continue;
            }
            i10 += bATEntriesPerBlock;
        }
        BATBlock createBAT = createBAT(i10, true);
        createBAT.setValueAt(0, -3);
        this._bat_blocks.add(createBAT);
        if (this._header.getBATCount() >= 109) {
            Iterator<BATBlock> it = this._xbat_blocks.iterator();
            while (true) {
                if (it.hasNext()) {
                    bATBlock = it.next();
                    if (bATBlock.hasFreeSectors()) {
                        break;
                    }
                } else {
                    bATBlock = null;
                    break;
                }
            }
            if (bATBlock == null) {
                int i13 = i10 + 1;
                bATBlock = createBAT(i13, false);
                bATBlock.setValueAt(0, i10);
                createBAT.setValueAt(1, -4);
                if (this._xbat_blocks.size() == 0) {
                    this._header.setXBATStart(i13);
                } else {
                    List<BATBlock> list = this._xbat_blocks;
                    list.get(list.size() - 1).setValueAt(this.bigBlockSize.getXBATEntriesPerBlock(), i13);
                }
                this._xbat_blocks.add(bATBlock);
                this._header.setXBATCount(this._xbat_blocks.size());
                i10 = i13;
            }
            for (int i14 = 0; i14 < this.bigBlockSize.getXBATEntriesPerBlock(); i14++) {
                if (bATBlock.getValueAt(i14) == -1) {
                    bATBlock.setValueAt(i14, i10);
                }
            }
        } else {
            int bATCount = this._header.getBATCount() + 1;
            int[] iArr = new int[bATCount];
            int i15 = bATCount - 1;
            System.arraycopy(this._header.getBATArray(), 0, iArr, 0, i15);
            iArr[i15] = i10;
            this._header.setBATArray(iArr);
        }
        this._header.setBATCount(this._bat_blocks.size());
        return i10 + 1;
    }

    public NPOIFSMiniStore getMiniStore() {
        return this._mini_store;
    }

    @Override // lib.zj.office.fc.poifs.filesystem.BlockStore
    public int getNextBlock(int i10) {
        BATBlock.BATBlockAndIndex bATBlockAndIndex = getBATBlockAndIndex(i10);
        return bATBlockAndIndex.getBlock().getValueAt(bATBlockAndIndex.getIndex());
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
    }

    @Override // lib.zj.office.fc.poifs.filesystem.BlockStore
    public void setNextBlock(int i10, int i11) {
        BATBlock.BATBlockAndIndex bATBlockAndIndex = getBATBlockAndIndex(i10);
        bATBlockAndIndex.getBlock().setValueAt(bATBlockAndIndex.getIndex(), i11);
    }

    public void writeFilesystem() {
        if (this._data instanceof FileBackedDataSource) {
            syncWithDataSource();
            return;
        }
        throw new IllegalArgumentException("POIFS opened from an inputstream, so writeFilesystem() may not be called. Use writeFilesystem(OutputStream) instead");
    }

    public DocumentEntry createDocument(String str, int i10, POIFSWriterListener pOIFSWriterListener) {
        return getRoot().createDocument(str, i10, pOIFSWriterListener);
    }

    public void writeFilesystem(OutputStream outputStream) {
        syncWithDataSource();
        this._data.copyTo(outputStream);
    }

    public NPOIFSFileSystem() {
        this(true);
        this._header.setBATCount(1);
        this._header.setBATArray(new int[]{0});
        this._bat_blocks.add(BATBlock.createEmptyBATBlock(this.bigBlockSize, false));
        setNextBlock(0, -3);
        this._property_table.setStartBlock(1);
        setNextBlock(1, -2);
    }

    public NPOIFSFileSystem(File file) {
        this(file, true);
    }

    public NPOIFSFileSystem(File file, boolean z10) {
        this(new RandomAccessFile(file, z10 ? "r" : "rw").getChannel(), true);
    }

    public NPOIFSFileSystem(FileChannel fileChannel) {
        this(fileChannel, false);
    }

    private NPOIFSFileSystem(FileChannel fileChannel, boolean z10) {
        this(false);
        try {
            ByteBuffer allocate = ByteBuffer.allocate(512);
            IOUtils.readFully(fileChannel, allocate);
            this._header = new HeaderBlock(allocate);
            this._data = new FileBackedDataSource(fileChannel);
            readCoreContents();
        } catch (IOException e10) {
            if (z10) {
                fileChannel.close();
            }
            throw e10;
        } catch (RuntimeException e11) {
            if (z10) {
                fileChannel.close();
            }
            throw e11;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NPOIFSFileSystem(InputStream inputStream) {
        this(false);
        ReadableByteChannel readableByteChannel;
        boolean z10 = false;
        try {
            readableByteChannel = Channels.newChannel(inputStream);
        } catch (Throwable th2) {
            th = th2;
            readableByteChannel = null;
        }
        try {
            ByteBuffer allocate = ByteBuffer.allocate(512);
            IOUtils.readFully(readableByteChannel, allocate);
            HeaderBlock headerBlock = new HeaderBlock(allocate);
            this._header = headerBlock;
            BlockAllocationTableReader.sanityCheckBlockCount(headerBlock.getBATCount());
            ByteBuffer allocate2 = ByteBuffer.allocate(BATBlock.calculateMaximumSize(this._header));
            allocate.position(0);
            allocate2.put(allocate);
            allocate2.position(allocate.capacity());
            IOUtils.readFully(readableByteChannel, allocate2);
            z10 = true;
            this._data = new ByteArrayBackedDataSource(allocate2.array(), allocate2.position());
            if (readableByteChannel != null) {
                readableByteChannel.close();
            }
            closeInputStream(inputStream, true);
            readCoreContents();
        } catch (Throwable th3) {
            th = th3;
            if (readableByteChannel != null) {
                readableByteChannel.close();
            }
            closeInputStream(inputStream, z10);
            throw th;
        }
    }
}
