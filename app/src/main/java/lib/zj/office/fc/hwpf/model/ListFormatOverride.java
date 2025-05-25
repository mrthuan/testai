package lib.zj.office.fc.hwpf.model;

import lib.zj.office.fc.hwpf.model.types.LFOAbstractType;
import lib.zj.office.fc.util.Internal;

@Internal
/* loaded from: classes3.dex */
public final class ListFormatOverride extends LFOAbstractType {
    private ListFormatOverrideLevel[] _levelOverrides;

    public ListFormatOverride(byte[] bArr, int i10) {
        fillFields(bArr, i10);
        this._levelOverrides = new ListFormatOverrideLevel[getClfolvl()];
    }

    public ListFormatOverrideLevel[] getLevelOverrides() {
        return this._levelOverrides;
    }

    public ListFormatOverrideLevel getOverrideLevel(int i10) {
        ListFormatOverrideLevel listFormatOverrideLevel = null;
        int i11 = 0;
        while (true) {
            ListFormatOverrideLevel[] listFormatOverrideLevelArr = this._levelOverrides;
            if (i11 < listFormatOverrideLevelArr.length) {
                ListFormatOverrideLevel listFormatOverrideLevel2 = listFormatOverrideLevelArr[i11];
                if (listFormatOverrideLevel2 != null && listFormatOverrideLevel2.getLevelNum() == i10) {
                    listFormatOverrideLevel = this._levelOverrides[i11];
                }
                i11++;
            } else {
                return listFormatOverrideLevel;
            }
        }
    }

    public int numOverrides() {
        return getClfolvl();
    }

    public void setOverride(int i10, ListFormatOverrideLevel listFormatOverrideLevel) {
        this._levelOverrides[i10] = listFormatOverrideLevel;
    }

    public byte[] toByteArray() {
        byte[] bArr = new byte[LFOAbstractType.getSize()];
        serialize(bArr, 0);
        return bArr;
    }

    public ListFormatOverride(int i10) {
        setLsid(i10);
        this._levelOverrides = new ListFormatOverrideLevel[0];
    }
}
