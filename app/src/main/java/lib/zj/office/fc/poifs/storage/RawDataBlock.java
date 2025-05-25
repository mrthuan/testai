package lib.zj.office.fc.poifs.storage;

import java.io.IOException;
import java.io.InputStream;
import lib.zj.office.fc.util.IOUtils;
import lib.zj.office.fc.util.POILogFactory;
import lib.zj.office.fc.util.POILogger;

/* loaded from: classes3.dex */
public class RawDataBlock implements ListManagedBlock {
    private static POILogger log = POILogFactory.getLogger(RawDataBlock.class);
    private byte[] _data;
    private boolean _eof;
    private boolean _hasData;

    public RawDataBlock(InputStream inputStream) {
        this(inputStream, 512);
    }

    public boolean eof() {
        return this._eof;
    }

    public int getBigBlockSize() {
        return this._data.length;
    }

    @Override // lib.zj.office.fc.poifs.storage.ListManagedBlock
    public byte[] getData() {
        if (hasData()) {
            return this._data;
        }
        throw new IOException("Cannot return empty data");
    }

    public boolean hasData() {
        return this._hasData;
    }

    public String toString() {
        return "RawDataBlock of size " + this._data.length;
    }

    public RawDataBlock(InputStream inputStream, int i10) {
        byte[] bArr = new byte[i10];
        this._data = bArr;
        int readFully = IOUtils.readFully(inputStream, bArr);
        this._hasData = readFully > 0;
        if (readFully == -1) {
            this._eof = true;
        } else if (readFully != i10) {
            this._eof = true;
            String concat = " byte".concat(readFully == 1 ? "" : "s");
            POILogger pOILogger = log;
            int i11 = POILogger.ERROR;
            pOILogger.log(i11, "Unable to read entire block; " + readFully + concat + " read before EOF; expected " + i10 + " bytes. Your document was either written by software that ignores the spec, or has been truncated!");
        } else {
            this._eof = false;
        }
    }
}
