package lib.zj.office.fc.hwpf.model;

import java.util.ArrayList;
import java.util.List;
import lib.zj.office.fc.hwpf.sprm.SprmBuffer;
import lib.zj.office.fc.util.Internal;
import lib.zj.office.fc.util.LittleEndian;

@Internal
/* loaded from: classes3.dex */
public final class CHPFormattedDiskPage extends FormattedDiskPage {
    private static final int FC_SIZE = 4;
    private ArrayList<CHPX> _chpxList;
    private ArrayList<CHPX> _overFlow;

    public CHPFormattedDiskPage() {
        this._chpxList = new ArrayList<>();
    }

    public void fill(List<CHPX> list) {
        this._chpxList.addAll(list);
    }

    public CHPX getCHPX(int i10) {
        return this._chpxList.get(i10);
    }

    @Override // lib.zj.office.fc.hwpf.model.FormattedDiskPage
    public byte[] getGrpprl(int i10) {
        int unsignedByte = LittleEndian.getUnsignedByte(this._fkp, ((this._crun + 1) * 4) + i10 + this._offset) * 2;
        if (unsignedByte == 0) {
            return new byte[0];
        }
        int unsignedByte2 = LittleEndian.getUnsignedByte(this._fkp, this._offset + unsignedByte);
        byte[] bArr = new byte[unsignedByte2];
        System.arraycopy(this._fkp, unsignedByte + 1 + this._offset, bArr, 0, unsignedByte2);
        return bArr;
    }

    public ArrayList<CHPX> getOverflow() {
        return this._overFlow;
    }

    @Deprecated
    public byte[] toByteArray(CharIndexTranslator charIndexTranslator, int i10) {
        return toByteArray(charIndexTranslator);
    }

    public byte[] toByteArray(CharIndexTranslator charIndexTranslator) {
        int i10;
        byte[] bArr = new byte[512];
        int size = this._chpxList.size();
        int i11 = 6;
        int i12 = 0;
        while (true) {
            i10 = 511;
            if (i12 >= size) {
                break;
            }
            int length = this._chpxList.get(i12).getGrpprl().length;
            int i13 = length + 6 + i11;
            if (i13 > (i12 % 2) + 511) {
                break;
            }
            if ((length + 1) % 2 > 0) {
                i13++;
            }
            i11 = i13;
            i12++;
        }
        if (i12 != size) {
            ArrayList<CHPX> arrayList = new ArrayList<>();
            this._overFlow = arrayList;
            arrayList.addAll(this._chpxList.subList(i12, size));
        }
        bArr[511] = (byte) i12;
        int i14 = (i12 * 4) + 4;
        CHPX chpx = null;
        int i15 = 0;
        for (int i16 = 0; i16 < i12; i16++) {
            chpx = this._chpxList.get(i16);
            byte[] grpprl = chpx.getGrpprl();
            LittleEndian.putInt(bArr, i15, charIndexTranslator.getByteIndex(chpx.getStart()));
            int length2 = i10 - (grpprl.length + 1);
            i10 = length2 - (length2 % 2);
            bArr[i14] = (byte) (i10 / 2);
            bArr[i10] = (byte) grpprl.length;
            System.arraycopy(grpprl, 0, bArr, i10 + 1, grpprl.length);
            i14++;
            i15 += 4;
        }
        LittleEndian.putInt(bArr, i15, charIndexTranslator.getByteIndex(chpx.getEnd()));
        return bArr;
    }

    public CHPFormattedDiskPage(byte[] bArr, int i10, int i11, TextPieceTable textPieceTable) {
        this(bArr, i10, textPieceTable);
    }

    public CHPFormattedDiskPage(byte[] bArr, int i10, CharIndexTranslator charIndexTranslator) {
        super(bArr, i10);
        this._chpxList = new ArrayList<>();
        for (int i11 = 0; i11 < this._crun; i11++) {
            int start = getStart(i11);
            int end = getEnd(i11);
            int charIndex = charIndexTranslator.getCharIndex(start);
            int charIndex2 = charIndexTranslator.getCharIndex(end, charIndex);
            if (charIndex <= charIndex2) {
                this._chpxList.add(new CHPX(charIndex, charIndex2, new SprmBuffer(getGrpprl(i11), 0)));
            }
        }
        this._crun = this._chpxList.size();
    }
}
