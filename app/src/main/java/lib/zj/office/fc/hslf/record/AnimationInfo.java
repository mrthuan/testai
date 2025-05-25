package lib.zj.office.fc.hslf.record;

import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public final class AnimationInfo extends RecordContainer {
    private byte[] _header;
    private AnimationInfoAtom animationAtom;

    public AnimationInfo(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[8];
        this._header = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, 8);
        this._children = Record.findChildRecords(bArr, i10 + 8, i11 - 8);
        findInterestingChildren();
    }

    private void findInterestingChildren() {
        Record record = this._children[0];
        if (record instanceof AnimationInfoAtom) {
            this.animationAtom = (AnimationInfoAtom) record;
        }
    }

    @Override // lib.zj.office.fc.hslf.record.RecordContainer, lib.zj.office.fc.hslf.record.Record
    public void dispose() {
        super.dispose();
        AnimationInfoAtom animationInfoAtom = this.animationAtom;
        if (animationInfoAtom != null) {
            animationInfoAtom.dispose();
        }
    }

    public AnimationInfoAtom getAnimationInfoAtom() {
        return this.animationAtom;
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public long getRecordType() {
        return RecordTypes.AnimationInfo.typeID;
    }

    public AnimationInfo() {
        byte[] bArr = new byte[8];
        this._header = bArr;
        bArr[0] = 15;
        LittleEndian.putShort(bArr, 2, (short) getRecordType());
        this._children = r0;
        AnimationInfoAtom animationInfoAtom = new AnimationInfoAtom();
        this.animationAtom = animationInfoAtom;
        Record[] recordArr = {animationInfoAtom};
    }
}
