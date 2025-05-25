package lib.zj.office.fc.hslf.record;

/* loaded from: classes3.dex */
public final class Sound extends RecordContainer {
    private SoundData _data;
    private byte[] _header;
    private CString _name;
    private CString _type;

    public Sound(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[8];
        this._header = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, 8);
        this._children = Record.findChildRecords(bArr, i10 + 8, i11 - 8);
        findInterestingChildren();
    }

    private void findInterestingChildren() {
        Record[] recordArr = this._children;
        Record record = recordArr[0];
        if (record instanceof CString) {
            this._name = (CString) record;
        }
        Record record2 = recordArr[1];
        if (record2 instanceof CString) {
            this._type = (CString) record2;
        }
        int i10 = 2;
        while (true) {
            Record[] recordArr2 = this._children;
            if (i10 < recordArr2.length) {
                Record record3 = recordArr2[i10];
                if (record3 instanceof SoundData) {
                    this._data = (SoundData) record3;
                    return;
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
        CString cString = this._name;
        if (cString != null) {
            cString.dispose();
        }
        CString cString2 = this._type;
        if (cString2 != null) {
            cString2.dispose();
        }
        SoundData soundData = this._data;
        if (soundData != null) {
            soundData.dispose();
        }
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public long getRecordType() {
        return RecordTypes.Sound.typeID;
    }

    public byte[] getSoundData() {
        SoundData soundData = this._data;
        if (soundData == null) {
            return null;
        }
        return soundData.getData();
    }

    public String getSoundName() {
        return this._name.getText();
    }

    public String getSoundType() {
        return this._type.getText();
    }
}
