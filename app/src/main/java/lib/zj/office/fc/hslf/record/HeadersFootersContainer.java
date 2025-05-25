package lib.zj.office.fc.hslf.record;

import lib.zj.office.fc.util.LittleEndian;
import lib.zj.office.fc.util.POILogger;

/* loaded from: classes3.dex */
public final class HeadersFootersContainer extends RecordContainer {
    public static final int FOOTERATOM = 2;
    public static final int HEADERATOM = 1;
    public static final short NotesHeadersFootersContainer = 79;
    public static final short SlideHeadersFootersContainer = 63;
    public static final int USERDATEATOM = 0;
    private byte[] _header;
    private CString csDate;
    private CString csFooter;
    private CString csHeader;
    private HeadersFootersAtom hdAtom;

    public HeadersFootersContainer(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[8];
        this._header = bArr2;
        int i12 = 0;
        System.arraycopy(bArr, i10, bArr2, 0, 8);
        this._children = Record.findChildRecords(bArr, i10 + 8, i11 - 8);
        while (true) {
            Record[] recordArr = this._children;
            if (i12 >= recordArr.length) {
                return;
            }
            Record record = recordArr[i12];
            if (record instanceof HeadersFootersAtom) {
                this.hdAtom = (HeadersFootersAtom) record;
            } else if (record instanceof CString) {
                CString cString = (CString) record;
                int options = cString.getOptions() >> 4;
                if (options == 0) {
                    this.csDate = cString;
                } else if (options == 1) {
                    this.csHeader = cString;
                } else if (options != 2) {
                    POILogger pOILogger = this.logger;
                    int i13 = POILogger.WARN;
                    pOILogger.log(i13, "Unexpected CString.Options in HeadersFootersContainer: " + options);
                } else {
                    this.csFooter = cString;
                }
            } else {
                POILogger pOILogger2 = this.logger;
                int i14 = POILogger.WARN;
                pOILogger2.log(i14, "Unexpected record in HeadersFootersContainer: " + this._children[i12]);
            }
            i12++;
        }
    }

    public CString addFooterAtom() {
        CString cString = this.csFooter;
        if (cString != null) {
            return cString;
        }
        CString cString2 = new CString();
        this.csFooter = cString2;
        cString2.setOptions(32);
        Record record = this.hdAtom;
        CString cString3 = this.csHeader;
        if (cString3 != null || (cString3 = this.csDate) != null) {
            record = cString3;
        }
        addChildAfter(this.csFooter, record);
        return this.csFooter;
    }

    public CString addHeaderAtom() {
        CString cString = this.csHeader;
        if (cString != null) {
            return cString;
        }
        CString cString2 = new CString();
        this.csHeader = cString2;
        cString2.setOptions(16);
        addChildAfter(this.csHeader, this.hdAtom);
        return this.csHeader;
    }

    public CString addUserDateAtom() {
        CString cString = this.csDate;
        if (cString != null) {
            return cString;
        }
        CString cString2 = new CString();
        this.csDate = cString2;
        cString2.setOptions(0);
        addChildAfter(this.csDate, this.hdAtom);
        return this.csDate;
    }

    @Override // lib.zj.office.fc.hslf.record.RecordContainer, lib.zj.office.fc.hslf.record.Record
    public void dispose() {
        HeadersFootersAtom headersFootersAtom = this.hdAtom;
        if (headersFootersAtom != null) {
            headersFootersAtom.dispose();
        }
        CString cString = this.csDate;
        if (cString != null) {
            cString.dispose();
        }
        CString cString2 = this.csHeader;
        if (cString2 != null) {
            cString2.dispose();
        }
        CString cString3 = this.csFooter;
        if (cString3 != null) {
            cString3.dispose();
        }
    }

    public CString getFooterAtom() {
        return this.csFooter;
    }

    public CString getHeaderAtom() {
        return this.csHeader;
    }

    public HeadersFootersAtom getHeadersFootersAtom() {
        return this.hdAtom;
    }

    public int getOptions() {
        return LittleEndian.getShort(this._header, 0);
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public long getRecordType() {
        return RecordTypes.HeadersFooters.typeID;
    }

    public CString getUserDateAtom() {
        return this.csDate;
    }

    public HeadersFootersContainer(short s4) {
        byte[] bArr = new byte[8];
        this._header = bArr;
        LittleEndian.putShort(bArr, 0, s4);
        LittleEndian.putShort(this._header, 2, (short) getRecordType());
        HeadersFootersAtom headersFootersAtom = new HeadersFootersAtom();
        this.hdAtom = headersFootersAtom;
        this._children = new Record[]{headersFootersAtom};
        this.csFooter = null;
        this.csHeader = null;
        this.csDate = null;
    }
}
