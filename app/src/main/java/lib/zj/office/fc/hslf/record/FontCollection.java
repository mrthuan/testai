package lib.zj.office.fc.hslf.record;

import java.util.ArrayList;
import lib.zj.office.fc.util.POILogger;

/* loaded from: classes3.dex */
public final class FontCollection extends RecordContainer {
    private byte[] _header;
    private java.util.List<String> fonts;

    public FontCollection(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[8];
        this._header = bArr2;
        int i12 = 0;
        System.arraycopy(bArr, i10, bArr2, 0, 8);
        this._children = Record.findChildRecords(bArr, i10 + 8, i11 - 8);
        this.fonts = new ArrayList();
        while (true) {
            Record[] recordArr = this._children;
            if (i12 < recordArr.length) {
                Record record = recordArr[i12];
                if (record instanceof FontEntityAtom) {
                    this.fonts.add(((FontEntityAtom) record).getFontName());
                } else {
                    POILogger pOILogger = this.logger;
                    int i13 = POILogger.WARN;
                    pOILogger.log(i13, "Warning: FontCollection child wasn't a FontEntityAtom, was " + this._children[i12]);
                }
                i12++;
            } else {
                return;
            }
        }
    }

    public int addFont(String str) {
        int fontIndex = getFontIndex(str);
        return fontIndex != -1 ? fontIndex : addFont(str, 0, 0, 4, 34);
    }

    @Override // lib.zj.office.fc.hslf.record.RecordContainer, lib.zj.office.fc.hslf.record.Record
    public void dispose() {
        super.dispose();
        java.util.List<String> list = this.fonts;
        if (list != null) {
            list.clear();
        }
    }

    public int getFontIndex(String str) {
        for (int i10 = 0; i10 < this.fonts.size(); i10++) {
            if (this.fonts.get(i10).equals(str)) {
                return i10;
            }
        }
        return -1;
    }

    public String getFontWithId(int i10) {
        if (i10 >= this.fonts.size()) {
            return null;
        }
        return this.fonts.get(i10);
    }

    public int getNumberOfFonts() {
        return this.fonts.size();
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public long getRecordType() {
        return RecordTypes.FontCollection.typeID;
    }

    public int addFont(String str, int i10, int i11, int i12, int i13) {
        FontEntityAtom fontEntityAtom = new FontEntityAtom();
        fontEntityAtom.setFontIndex(this.fonts.size() << 4);
        fontEntityAtom.setFontName(str);
        fontEntityAtom.setCharSet(i10);
        fontEntityAtom.setFontFlags(i11);
        fontEntityAtom.setFontType(i12);
        fontEntityAtom.setPitchAndFamily(i13);
        this.fonts.add(str);
        appendChildRecord(fontEntityAtom);
        return this.fonts.size() - 1;
    }
}
