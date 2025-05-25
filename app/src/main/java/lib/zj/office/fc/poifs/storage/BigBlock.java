package lib.zj.office.fc.poifs.storage;

import java.io.OutputStream;
import lib.zj.office.fc.poifs.common.POIFSBigBlockSize;

/* loaded from: classes3.dex */
abstract class BigBlock implements BlockWritable {
    protected POIFSBigBlockSize bigBlockSize;

    public BigBlock(POIFSBigBlockSize pOIFSBigBlockSize) {
        this.bigBlockSize = pOIFSBigBlockSize;
    }

    public void doWriteData(OutputStream outputStream, byte[] bArr) {
        outputStream.write(bArr);
    }

    @Override // lib.zj.office.fc.poifs.storage.BlockWritable
    public void writeBlocks(OutputStream outputStream) {
        writeData(outputStream);
    }

    public abstract void writeData(OutputStream outputStream);
}
