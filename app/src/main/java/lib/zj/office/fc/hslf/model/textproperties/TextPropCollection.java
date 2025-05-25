package lib.zj.office.fc.hslf.model.textproperties;

import a6.h;
import java.util.LinkedList;
import lib.zj.office.fc.hslf.record.StyleTextPropAtom;
import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public class TextPropCollection {
    private int charactersCovered;
    private int maskSpecial;
    private short reservedField;
    private LinkedList<TextProp> textPropList;

    public TextPropCollection(int i10, short s4) {
        this.maskSpecial = 0;
        this.charactersCovered = i10;
        this.reservedField = s4;
        this.textPropList = new LinkedList<>();
    }

    public TextProp addWithName(String str) {
        TextProp textProp = null;
        int i10 = 0;
        while (true) {
            TextProp[] textPropArr = StyleTextPropAtom.characterTextPropTypes;
            if (i10 >= textPropArr.length) {
                break;
            }
            if (textPropArr[i10].getName().equals(str)) {
                textProp = StyleTextPropAtom.characterTextPropTypes[i10];
            }
            i10++;
        }
        int i11 = 0;
        while (true) {
            TextProp[] textPropArr2 = StyleTextPropAtom.paragraphTextPropTypes;
            if (i11 >= textPropArr2.length) {
                break;
            }
            if (textPropArr2[i11].getName().equals(str)) {
                textProp = StyleTextPropAtom.paragraphTextPropTypes[i11];
            }
            i11++;
        }
        if (textProp != null) {
            TextProp textProp2 = (TextProp) textProp.clone();
            int i12 = 0;
            for (int i13 = 0; i13 < this.textPropList.size(); i13++) {
                if (textProp2.getMask() > this.textPropList.get(i13).getMask()) {
                    i12++;
                }
            }
            this.textPropList.add(i12, textProp2);
            return textProp2;
        }
        throw new IllegalArgumentException(h.d("No TextProp with name ", str, " is defined to add from"));
    }

    public int buildTextPropList(int i10, TextProp[] textPropArr, byte[] bArr, int i11) {
        int i12;
        int i13 = 0;
        for (int i14 = 0; i14 < textPropArr.length; i14++) {
            if ((textPropArr[i14].getMask() & i10) != 0) {
                int i15 = i11 + i13;
                if (i15 >= bArr.length) {
                    this.maskSpecial |= textPropArr[i14].getMask();
                    return i13;
                }
                TextProp textProp = (TextProp) textPropArr[i14].clone();
                if (textProp.getSize() == 2) {
                    i12 = LittleEndian.getShort(bArr, i15);
                } else if (textProp.getSize() == 4) {
                    i12 = LittleEndian.getInt(bArr, i15);
                } else if (textProp.getSize() == 0) {
                    this.maskSpecial |= textPropArr[i14].getMask();
                } else {
                    i12 = 0;
                }
                if (CharFlagsTextProp.NAME.equals(textProp.getName()) && i12 < 0) {
                    i12 = 0;
                }
                textProp.setValue(i12);
                int size = textProp.getSize() + i13;
                if ("tabStops".equals(textProp.getName())) {
                    i13 = (i12 * 4) + size;
                } else {
                    i13 = size;
                }
                this.textPropList.add(textProp);
            }
        }
        return i13;
    }

    public void dispose() {
        if (this.textPropList != null) {
            for (int i10 = 0; i10 < this.textPropList.size(); i10++) {
                this.textPropList.get(i10).dispose();
            }
            this.textPropList.clear();
        }
    }

    public TextProp findByName(String str) {
        for (int i10 = 0; i10 < this.textPropList.size(); i10++) {
            TextProp textProp = this.textPropList.get(i10);
            if (textProp.getName().equals(str)) {
                return textProp;
            }
        }
        return null;
    }

    public int getCharactersCovered() {
        return this.charactersCovered;
    }

    public short getReservedField() {
        return this.reservedField;
    }

    public int getSpecialMask() {
        return this.maskSpecial;
    }

    public LinkedList<TextProp> getTextPropList() {
        return this.textPropList;
    }

    public void setReservedField(short s4) {
        this.reservedField = s4;
    }

    public void updateTextSize(int i10) {
        this.charactersCovered = i10;
    }

    public TextPropCollection(int i10) {
        this.maskSpecial = 0;
        this.charactersCovered = i10;
        this.reservedField = (short) -1;
        this.textPropList = new LinkedList<>();
    }
}
