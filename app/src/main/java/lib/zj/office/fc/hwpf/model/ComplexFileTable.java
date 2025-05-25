package lib.zj.office.fc.hwpf.model;

import java.io.IOException;
import java.util.LinkedList;
import lib.zj.office.fc.hwpf.sprm.SprmBuffer;
import lib.zj.office.fc.util.Internal;
import lib.zj.office.fc.util.LittleEndian;

@Internal
/* loaded from: classes3.dex */
public final class ComplexFileTable {
    private static final byte GRPPRL_TYPE = 1;
    private static final byte TEXT_PIECE_TABLE_TYPE = 2;
    private SprmBuffer[] _grpprls;
    protected TextPieceTable _tpt;

    public ComplexFileTable() {
        this._tpt = new TextPieceTable();
    }

    public SprmBuffer[] getGrpprls() {
        return this._grpprls;
    }

    public TextPieceTable getTextPieceTable() {
        return this._tpt;
    }

    public ComplexFileTable(byte[] bArr, byte[] bArr2, int i10, int i11) {
        LinkedList linkedList = new LinkedList();
        while (bArr2[i10] == 1) {
            int i12 = i10 + 1;
            short s4 = LittleEndian.getShort(bArr2, i12);
            int i13 = i12 + 2;
            byte[] byteArray = LittleEndian.getByteArray(bArr2, i13, s4);
            i10 = i13 + s4;
            linkedList.add(new SprmBuffer(byteArray, false, 0));
        }
        this._grpprls = (SprmBuffer[]) linkedList.toArray(new SprmBuffer[linkedList.size()]);
        if (bArr2[i10] == 2) {
            int i14 = i10 + 1;
            this._tpt = new TextPieceTable(bArr, bArr2, i14 + 4, LittleEndian.getInt(bArr2, i14), i11);
            return;
        }
        throw new IOException("The text piece table is corrupted");
    }
}
