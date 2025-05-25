package lib.zj.office.fc.poifs.property;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lib.zj.office.fc.poifs.common.POIFSBigBlockSize;
import lib.zj.office.fc.poifs.filesystem.NPOIFSFileSystem;
import lib.zj.office.fc.poifs.filesystem.NPOIFSStream;
import lib.zj.office.fc.poifs.storage.HeaderBlock;

/* loaded from: classes3.dex */
public final class NPropertyTable extends PropertyTableBase {
    private POIFSBigBlockSize _bigBigBlockSize;

    public NPropertyTable(HeaderBlock headerBlock) {
        super(headerBlock);
        this._bigBigBlockSize = headerBlock.getBigBlockSize();
    }

    private static List<Property> buildProperties(Iterator<ByteBuffer> it, POIFSBigBlockSize pOIFSBigBlockSize) {
        byte[] bArr;
        ArrayList arrayList = new ArrayList();
        while (it.hasNext()) {
            ByteBuffer next = it.next();
            if (next.hasArray() && next.arrayOffset() == 0 && next.array().length == pOIFSBigBlockSize.getBigBlockSize()) {
                bArr = next.array();
            } else {
                int bigBlockSize = pOIFSBigBlockSize.getBigBlockSize();
                byte[] bArr2 = new byte[bigBlockSize];
                next.get(bArr2, 0, bigBlockSize);
                bArr = bArr2;
            }
            PropertyFactory.convertToProperties(bArr, arrayList);
        }
        return arrayList;
    }

    @Override // lib.zj.office.fc.poifs.filesystem.BATManaged
    public int countBlocks() {
        return (int) Math.ceil((this._properties.size() * 128) / this._bigBigBlockSize.getBigBlockSize());
    }

    public void write(NPOIFSStream nPOIFSStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (Property property : this._properties) {
            if (property != null) {
                property.writeData(byteArrayOutputStream);
            }
        }
        nPOIFSStream.updateContents(byteArrayOutputStream.toByteArray());
        if (getStartBlock() != nPOIFSStream.getStartBlock()) {
            setStartBlock(nPOIFSStream.getStartBlock());
        }
    }

    public NPropertyTable(HeaderBlock headerBlock, NPOIFSFileSystem nPOIFSFileSystem) {
        super(headerBlock, buildProperties(new NPOIFSStream(nPOIFSFileSystem, headerBlock.getPropertyStart()).iterator(), headerBlock.getBigBlockSize()));
        this._bigBigBlockSize = headerBlock.getBigBlockSize();
    }
}
