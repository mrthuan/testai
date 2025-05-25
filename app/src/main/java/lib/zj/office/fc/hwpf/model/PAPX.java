package lib.zj.office.fc.hwpf.model;

import lib.zj.office.fc.hwpf.sprm.ParagraphSprmUncompressor;
import lib.zj.office.fc.hwpf.sprm.SprmBuffer;
import lib.zj.office.fc.hwpf.sprm.SprmOperation;
import lib.zj.office.fc.hwpf.usermodel.ParagraphProperties;
import lib.zj.office.fc.util.Internal;
import lib.zj.office.fc.util.LittleEndian;

@Internal
/* loaded from: classes3.dex */
public final class PAPX extends BytePropertyNode<PAPX> {
    private ParagraphHeight _phe;

    public PAPX(int i10, int i11, CharIndexTranslator charIndexTranslator, byte[] bArr, ParagraphHeight paragraphHeight, byte[] bArr2) {
        super(i10, i11, charIndexTranslator, new SprmBuffer(bArr, 2));
        this._phe = paragraphHeight;
        SprmBuffer findHuge = findHuge(new SprmBuffer(bArr, 2), bArr2);
        if (findHuge != null) {
            this._buf = findHuge;
        }
    }

    private SprmBuffer findHuge(SprmBuffer sprmBuffer, byte[] bArr) {
        byte[] byteArray = sprmBuffer.toByteArray();
        if (byteArray.length == 8 && bArr != null) {
            SprmOperation sprmOperation = new SprmOperation(byteArray, 2);
            if ((sprmOperation.getOperation() == 69 || sprmOperation.getOperation() == 70) && sprmOperation.getSizeCode() == 3) {
                int operand = sprmOperation.getOperand();
                if (operand + 1 < bArr.length) {
                    short s4 = LittleEndian.getShort(bArr, operand);
                    if (operand + s4 < bArr.length) {
                        byte[] bArr2 = new byte[s4 + 2];
                        bArr2[0] = byteArray[0];
                        bArr2[1] = byteArray[1];
                        System.arraycopy(bArr, operand + 2, bArr2, 2, s4);
                        return new SprmBuffer(bArr2, 2);
                    }
                    return null;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    @Override // lib.zj.office.fc.hwpf.model.PropertyNode
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return this._phe.equals(((PAPX) obj)._phe);
        }
        return false;
    }

    public byte[] getGrpprl() {
        return ((SprmBuffer) this._buf).toByteArray();
    }

    public short getIstd() {
        byte[] grpprl = getGrpprl();
        if (grpprl.length == 0) {
            return (short) 0;
        }
        if (grpprl.length == 1) {
            return (short) LittleEndian.getUnsignedByte(grpprl, 0);
        }
        return LittleEndian.getShort(grpprl);
    }

    public ParagraphHeight getParagraphHeight() {
        return this._phe;
    }

    public ParagraphProperties getParagraphProperties(StyleSheet styleSheet) {
        if (styleSheet == null) {
            return new ParagraphProperties();
        }
        return ParagraphSprmUncompressor.uncompressPAP(styleSheet.getParagraphStyle(getIstd()), getGrpprl(), 2);
    }

    public SprmBuffer getSprmBuf() {
        return (SprmBuffer) this._buf;
    }

    public String toString() {
        return "PAPX from " + getStart() + " to " + getEnd() + " (in bytes " + getStartBytes() + " to " + getEndBytes() + ")";
    }

    public PAPX(int i10, int i11, byte[] bArr, ParagraphHeight paragraphHeight, byte[] bArr2) {
        super(i10, i11, new SprmBuffer(bArr, 2));
        this._phe = paragraphHeight;
        SprmBuffer findHuge = findHuge(new SprmBuffer(bArr, 2), bArr2);
        if (findHuge != null) {
            this._buf = findHuge;
        }
    }

    @Deprecated
    public PAPX(int i10, int i11, CharIndexTranslator charIndexTranslator, SprmBuffer sprmBuffer, byte[] bArr) {
        super(i10, i11, charIndexTranslator, sprmBuffer);
        this._phe = new ParagraphHeight();
        SprmBuffer findHuge = findHuge(sprmBuffer, bArr);
        if (findHuge != null) {
            this._buf = findHuge;
        }
    }

    public PAPX(int i10, int i11, SprmBuffer sprmBuffer) {
        super(i10, i11, sprmBuffer);
        this._phe = new ParagraphHeight();
    }
}
