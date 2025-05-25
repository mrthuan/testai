package lib.zj.office.fc.hslf.record;

import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public final class Comment2000 extends RecordContainer {
    private static long _type = 12000;
    private byte[] _header;
    private CString authorInitialsRecord;
    private CString authorRecord;
    private Comment2000Atom commentAtom;
    private CString commentRecord;

    public Comment2000(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[8];
        this._header = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, 8);
        this._children = Record.findChildRecords(bArr, i10 + 8, i11 - 8);
        findInterestingChildren();
    }

    private void findInterestingChildren() {
        Record[] recordArr;
        for (Record record : this._children) {
            if (record instanceof CString) {
                CString cString = (CString) record;
                int options = cString.getOptions() >> 4;
                if (options != 0) {
                    if (options != 1) {
                        if (options == 2) {
                            this.authorInitialsRecord = cString;
                        }
                    } else {
                        this.commentRecord = cString;
                    }
                } else {
                    this.authorRecord = cString;
                }
            } else if (record instanceof Comment2000Atom) {
                this.commentAtom = (Comment2000Atom) record;
            }
        }
    }

    @Override // lib.zj.office.fc.hslf.record.RecordContainer, lib.zj.office.fc.hslf.record.Record
    public void dispose() {
        CString cString = this.authorRecord;
        if (cString != null) {
            cString.dispose();
        }
        CString cString2 = this.authorInitialsRecord;
        if (cString2 != null) {
            cString2.dispose();
        }
        CString cString3 = this.commentRecord;
        if (cString3 != null) {
            cString3.dispose();
        }
        Comment2000Atom comment2000Atom = this.commentAtom;
        if (comment2000Atom != null) {
            comment2000Atom.dispose();
        }
    }

    public String getAuthor() {
        CString cString = this.authorRecord;
        if (cString == null) {
            return null;
        }
        return cString.getText();
    }

    public String getAuthorInitials() {
        CString cString = this.authorInitialsRecord;
        if (cString == null) {
            return null;
        }
        return cString.getText();
    }

    public Comment2000Atom getComment2000Atom() {
        return this.commentAtom;
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public long getRecordType() {
        return _type;
    }

    public String getText() {
        CString cString = this.commentRecord;
        if (cString == null) {
            return null;
        }
        return cString.getText();
    }

    public void setAuthor(String str) {
        this.authorRecord.setText(str);
    }

    public void setAuthorInitials(String str) {
        this.authorInitialsRecord.setText(str);
    }

    public void setText(String str) {
        this.commentRecord.setText(str);
    }

    public Comment2000() {
        byte[] bArr = new byte[8];
        this._header = bArr;
        this._children = new Record[4];
        bArr[0] = 15;
        LittleEndian.putShort(bArr, 2, (short) _type);
        CString cString = new CString();
        CString cString2 = new CString();
        CString cString3 = new CString();
        cString.setOptions(0);
        cString2.setOptions(16);
        cString3.setOptions(32);
        Record[] recordArr = this._children;
        recordArr[0] = cString;
        recordArr[1] = cString2;
        recordArr[2] = cString3;
        recordArr[3] = new Comment2000Atom();
        findInterestingChildren();
    }
}
