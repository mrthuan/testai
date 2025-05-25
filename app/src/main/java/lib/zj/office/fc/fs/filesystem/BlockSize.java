package lib.zj.office.fc.fs.filesystem;

/* loaded from: classes3.dex */
public class BlockSize {
    private int bigBlockSize;
    private short headerValue;

    public BlockSize(int i10, short s4) {
        this.bigBlockSize = i10;
        this.headerValue = s4;
    }

    public int getBATEntriesPerBlock() {
        return this.bigBlockSize / 4;
    }

    public int getBigBlockSize() {
        return this.bigBlockSize;
    }

    public short getHeaderValue() {
        return this.headerValue;
    }

    public int getNextXBATChainOffset() {
        return getXBATEntriesPerBlock() * 4;
    }

    public int getPropertiesPerBlock() {
        return this.bigBlockSize / 128;
    }

    public int getXBATEntriesPerBlock() {
        return getBATEntriesPerBlock() - 1;
    }
}
