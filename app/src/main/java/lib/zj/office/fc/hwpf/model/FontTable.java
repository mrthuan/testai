package lib.zj.office.fc.hwpf.model;

import lib.zj.office.fc.hwpf.model.io.HWPFFileSystem;
import lib.zj.office.fc.hwpf.model.io.HWPFOutputStream;
import lib.zj.office.fc.util.Internal;
import lib.zj.office.fc.util.LittleEndian;
import lib.zj.office.fc.util.POILogFactory;
import lib.zj.office.fc.util.POILogger;

@Internal
/* loaded from: classes3.dex */
public final class FontTable {
    private static final POILogger _logger = POILogFactory.getLogger(FontTable.class);
    private short _extraDataSz;
    private Ffn[] _fontNames;
    private short _stringCount;
    private int fcSttbfffn;
    private int lcbSttbfffn;

    public FontTable(byte[] bArr, int i10, int i11) {
        this._fontNames = null;
        this.lcbSttbfffn = i11;
        this.fcSttbfffn = i10;
        this._stringCount = LittleEndian.getShort(bArr, i10);
        int i12 = i10 + 2;
        this._extraDataSz = LittleEndian.getShort(bArr, i12);
        int i13 = i12 + 2;
        this._fontNames = new Ffn[this._stringCount];
        for (int i14 = 0; i14 < this._stringCount; i14++) {
            this._fontNames[i14] = new Ffn(bArr, i13);
            i13 += this._fontNames[i14].getSize();
        }
    }

    public boolean equals(Object obj) {
        FontTable fontTable = (FontTable) obj;
        if (fontTable.getStringCount() != this._stringCount || fontTable.getExtraDataSz() != this._extraDataSz) {
            return false;
        }
        Ffn[] fontNames = fontTable.getFontNames();
        boolean z10 = true;
        for (int i10 = 0; i10 < this._stringCount; i10++) {
            if (!this._fontNames[i10].equals(fontNames[i10])) {
                z10 = false;
            }
        }
        return z10;
    }

    public String getAltFont(int i10) {
        if (i10 >= this._stringCount) {
            _logger.log(POILogger.INFO, "Mismatch in chpFtc with stringCount");
            return null;
        }
        return this._fontNames[i10].getAltFontName();
    }

    public short getExtraDataSz() {
        return this._extraDataSz;
    }

    public Ffn[] getFontNames() {
        return this._fontNames;
    }

    public String getMainFont(int i10) {
        if (i10 >= this._stringCount) {
            _logger.log(POILogger.INFO, "Mismatch in chpFtc with stringCount");
            return null;
        }
        return this._fontNames[i10].getMainFontName();
    }

    public int getSize() {
        return this.lcbSttbfffn;
    }

    public short getStringCount() {
        return this._stringCount;
    }

    public void setStringCount(short s4) {
        this._stringCount = s4;
    }

    @Deprecated
    public void writeTo(HWPFFileSystem hWPFFileSystem) {
        writeTo(hWPFFileSystem.getStream("1Table"));
    }

    public void writeTo(HWPFOutputStream hWPFOutputStream) {
        byte[] bArr = new byte[2];
        LittleEndian.putShort(bArr, this._stringCount);
        hWPFOutputStream.write(bArr);
        LittleEndian.putShort(bArr, this._extraDataSz);
        hWPFOutputStream.write(bArr);
        int i10 = 0;
        while (true) {
            Ffn[] ffnArr = this._fontNames;
            if (i10 >= ffnArr.length) {
                return;
            }
            hWPFOutputStream.write(ffnArr[i10].toByteArray());
            i10++;
        }
    }
}
