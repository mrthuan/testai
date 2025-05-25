package lib.zj.office.fc.hslf.record;

import lib.zj.office.fc.util.LittleEndian;
import lib.zj.office.fc.util.POILogger;

/* loaded from: classes3.dex */
public class ExHyperlink extends RecordContainer {
    private static long _type = 4055;
    private byte[] _header;
    private ExHyperlinkAtom linkAtom;
    private CString linkDetailsA;
    private CString linkDetailsB;

    public ExHyperlink(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[8];
        this._header = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, 8);
        this._children = Record.findChildRecords(bArr, i10 + 8, i11 - 8);
        findInterestingChildren();
    }

    private void findInterestingChildren() {
        Record record = this._children[0];
        if (record instanceof ExHyperlinkAtom) {
            this.linkAtom = (ExHyperlinkAtom) record;
        } else {
            this.logger.log(POILogger.ERROR, "First child record wasn't a ExHyperlinkAtom, was of type " + this._children[0].getRecordType());
        }
        int i10 = 1;
        while (true) {
            Record[] recordArr = this._children;
            if (i10 < recordArr.length) {
                Record record2 = recordArr[i10];
                if (record2 instanceof CString) {
                    if (this.linkDetailsA == null) {
                        this.linkDetailsA = (CString) record2;
                    } else {
                        this.linkDetailsB = (CString) record2;
                    }
                } else {
                    this.logger.log(POILogger.ERROR, "Record after ExHyperlinkAtom wasn't a CString, was of type " + this._children[1].getRecordType());
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public String _getDetailsA() {
        CString cString = this.linkDetailsA;
        if (cString == null) {
            return null;
        }
        return cString.getText();
    }

    public String _getDetailsB() {
        CString cString = this.linkDetailsB;
        if (cString == null) {
            return null;
        }
        return cString.getText();
    }

    @Override // lib.zj.office.fc.hslf.record.RecordContainer, lib.zj.office.fc.hslf.record.Record
    public void dispose() {
        CString cString = this.linkDetailsA;
        if (cString != null) {
            cString.dispose();
        }
        CString cString2 = this.linkDetailsB;
        if (cString2 != null) {
            cString2.dispose();
        }
        ExHyperlinkAtom exHyperlinkAtom = this.linkAtom;
        if (exHyperlinkAtom != null) {
            exHyperlinkAtom.dispose();
        }
    }

    public ExHyperlinkAtom getExHyperlinkAtom() {
        return this.linkAtom;
    }

    public String getLinkTitle() {
        CString cString = this.linkDetailsA;
        if (cString == null) {
            return null;
        }
        return cString.getText();
    }

    public String getLinkURL() {
        CString cString = this.linkDetailsB;
        if (cString == null) {
            return null;
        }
        return cString.getText();
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public long getRecordType() {
        return _type;
    }

    public void setLinkTitle(String str) {
        CString cString = this.linkDetailsA;
        if (cString != null) {
            cString.setText(str);
        }
    }

    public void setLinkURL(String str) {
        CString cString = this.linkDetailsB;
        if (cString != null) {
            cString.setText(str);
        }
    }

    public ExHyperlink() {
        byte[] bArr = new byte[8];
        this._header = bArr;
        this._children = new Record[3];
        bArr[0] = 15;
        LittleEndian.putShort(bArr, 2, (short) _type);
        CString cString = new CString();
        CString cString2 = new CString();
        cString.setOptions(0);
        cString2.setOptions(16);
        this._children[0] = new ExHyperlinkAtom();
        Record[] recordArr = this._children;
        recordArr[1] = cString;
        recordArr[2] = cString2;
        findInterestingChildren();
    }
}
