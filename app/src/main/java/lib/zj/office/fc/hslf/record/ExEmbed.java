package lib.zj.office.fc.hslf.record;

import lib.zj.office.fc.util.LittleEndian;
import lib.zj.office.fc.util.POILogger;

/* loaded from: classes3.dex */
public class ExEmbed extends RecordContainer {
    private byte[] _header;
    private CString clipboardName;
    protected RecordAtom embedAtom;
    private CString menuName;
    private ExOleObjAtom oleObjAtom;
    private CString progId;

    public ExEmbed(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[8];
        this._header = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, 8);
        this._children = Record.findChildRecords(bArr, i10 + 8, i11 - 8);
        findInterestingChildren();
    }

    private void findInterestingChildren() {
        Record record = this._children[0];
        if (record instanceof ExEmbedAtom) {
            this.embedAtom = (ExEmbedAtom) record;
        } else {
            this.logger.log(POILogger.ERROR, "First child record wasn't a ExEmbedAtom, was of type " + this._children[0].getRecordType());
        }
        Record record2 = this._children[1];
        if (record2 instanceof ExOleObjAtom) {
            this.oleObjAtom = (ExOleObjAtom) record2;
        } else {
            this.logger.log(POILogger.ERROR, "Second child record wasn't a ExOleObjAtom, was of type " + this._children[1].getRecordType());
        }
        int i10 = 2;
        while (true) {
            Record[] recordArr = this._children;
            if (i10 < recordArr.length) {
                Record record3 = recordArr[i10];
                if (record3 instanceof CString) {
                    CString cString = (CString) record3;
                    int options = cString.getOptions() >> 4;
                    if (options != 1) {
                        if (options != 2) {
                            if (options == 3) {
                                this.clipboardName = cString;
                            }
                        } else {
                            this.progId = cString;
                        }
                    } else {
                        this.menuName = cString;
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // lib.zj.office.fc.hslf.record.RecordContainer, lib.zj.office.fc.hslf.record.Record
    public void dispose() {
        super.dispose();
        RecordAtom recordAtom = this.embedAtom;
        if (recordAtom != null) {
            recordAtom.dispose();
        }
        ExOleObjAtom exOleObjAtom = this.oleObjAtom;
        if (exOleObjAtom != null) {
            exOleObjAtom.dispose();
        }
        CString cString = this.menuName;
        if (cString != null) {
            cString.dispose();
        }
        CString cString2 = this.progId;
        if (cString2 != null) {
            cString2.dispose();
        }
        CString cString3 = this.clipboardName;
        if (cString3 != null) {
            cString3.dispose();
        }
    }

    public String getClipboardName() {
        CString cString = this.clipboardName;
        if (cString == null) {
            return null;
        }
        return cString.getText();
    }

    public ExEmbedAtom getExEmbedAtom() {
        return (ExEmbedAtom) this.embedAtom;
    }

    public ExOleObjAtom getExOleObjAtom() {
        return this.oleObjAtom;
    }

    public String getMenuName() {
        CString cString = this.menuName;
        if (cString == null) {
            return null;
        }
        return cString.getText();
    }

    public String getProgId() {
        CString cString = this.progId;
        if (cString == null) {
            return null;
        }
        return cString.getText();
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public long getRecordType() {
        return RecordTypes.ExEmbed.typeID;
    }

    public void setClipboardName(String str) {
        CString cString = this.clipboardName;
        if (cString != null) {
            cString.setText(str);
        }
    }

    public void setMenuName(String str) {
        CString cString = this.menuName;
        if (cString != null) {
            cString.setText(str);
        }
    }

    public void setProgId(String str) {
        CString cString = this.progId;
        if (cString != null) {
            cString.setText(str);
        }
    }

    public ExEmbed() {
        byte[] bArr = new byte[8];
        this._header = bArr;
        this._children = new Record[5];
        bArr[0] = 15;
        LittleEndian.putShort(bArr, 2, (short) getRecordType());
        CString cString = new CString();
        cString.setOptions(16);
        CString cString2 = new CString();
        cString2.setOptions(32);
        CString cString3 = new CString();
        cString3.setOptions(48);
        this._children[0] = new ExEmbedAtom();
        this._children[1] = new ExOleObjAtom();
        Record[] recordArr = this._children;
        recordArr[2] = cString;
        recordArr[3] = cString2;
        recordArr[4] = cString3;
        findInterestingChildren();
    }
}
