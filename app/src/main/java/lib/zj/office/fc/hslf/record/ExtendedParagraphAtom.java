package lib.zj.office.fc.hslf.record;

import java.util.Iterator;
import java.util.LinkedList;
import lib.zj.office.fc.hslf.model.textproperties.AutoNumberTextProp;
import lib.zj.office.fc.hslf.model.textproperties.TextProp;
import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public final class ExtendedParagraphAtom extends RecordAtom {
    private static long _type = 4012;
    public static TextProp[] extendedParagraphPropTypes = {new TextProp(2, 16777216, "NumberingType"), new TextProp(2, 8388608, "Start")};
    private byte[] _header;
    private LinkedList<AutoNumberTextProp> autoNumberList = new LinkedList<>();

    public ExtendedParagraphAtom(byte[] bArr, int i10, int i11) {
        i11 = i11 < 8 ? 8 : i11;
        byte[] bArr2 = new byte[8];
        this._header = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, 8);
        int i12 = i10 + 8;
        while (i12 < i10 + i11 && i11 >= 28 && i11 - i12 >= 4) {
            AutoNumberTextProp autoNumberTextProp = new AutoNumberTextProp();
            int i13 = LittleEndian.getInt(bArr, i12);
            i13 = i13 == 50331648 ? i13 >> 1 : i13;
            int i14 = i12 + 4;
            if (i13 != 0) {
                i14 = i13 == 25165824 ? i14 + 2 : i14 + 4;
                int i15 = 0;
                while (true) {
                    TextProp[] textPropArr = extendedParagraphPropTypes;
                    if (i15 >= textPropArr.length || (textPropArr[i15].getMask() & i13) == 0) {
                        break;
                    }
                    short s4 = LittleEndian.getShort(bArr, i14);
                    if ("NumberingType".equals(extendedParagraphPropTypes[i15].getName())) {
                        autoNumberTextProp.setNumberingType(s4);
                    } else if ("Start".equals(extendedParagraphPropTypes[i15].getName())) {
                        autoNumberTextProp.setStart(s4);
                    }
                    i14 += extendedParagraphPropTypes[i15].getSize();
                    i15++;
                }
                if (i13 == 25165824) {
                    i14 += 2;
                }
            }
            this.autoNumberList.add(autoNumberTextProp);
            i12 = i14 + 8;
        }
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public void dispose() {
        LinkedList<AutoNumberTextProp> linkedList = this.autoNumberList;
        if (linkedList != null) {
            Iterator<AutoNumberTextProp> it = linkedList.iterator();
            while (it.hasNext()) {
                it.next().dispose();
            }
            this.autoNumberList.clear();
        }
    }

    @Override // lib.zj.office.fc.hslf.record.RecordAtom
    public LinkedList<AutoNumberTextProp> getExtendedParagraphPropList() {
        return this.autoNumberList;
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public long getRecordType() {
        return _type;
    }

    public ExtendedParagraphAtom() {
    }
}
