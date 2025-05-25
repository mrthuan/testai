package lib.zj.office.fc.hslf.record;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import lib.zj.office.fc.hpsf.Variant;
import lib.zj.office.fc.hslf.model.textproperties.AlignmentTextProp;
import lib.zj.office.fc.hslf.model.textproperties.CharFlagsTextProp;
import lib.zj.office.fc.hslf.model.textproperties.ParagraphFlagsTextProp;
import lib.zj.office.fc.hslf.model.textproperties.TextProp;
import lib.zj.office.fc.hslf.model.textproperties.TextPropCollection;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public final class StyleTextPropAtom extends RecordAtom {
    private static long _type = 4001;
    private byte[] _header;
    private LinkedList<TextPropCollection> charStyles;
    private boolean initialised;
    private Map<Integer, Integer> paraAutoNumberIndexs;
    private LinkedList<TextPropCollection> paragraphStyles;
    private byte[] rawContents;
    private byte[] reserved;
    public static TextProp[] paragraphTextPropTypes = {new TextProp(0, 1, "hasBullet"), new TextProp(0, 2, "hasBulletFont"), new TextProp(0, 4, "hasBulletColor"), new TextProp(0, 8, "hasBulletSize"), new ParagraphFlagsTextProp(), new TextProp(2, 128, "bullet.char"), new TextProp(2, 16, "bullet.font"), new TextProp(2, 64, "bullet.size"), new TextProp(4, 32, "bullet.color"), new AlignmentTextProp(), new TextProp(2, 256, "text.offset"), new TextProp(2, 1024, "bullet.offset"), new TextProp(2, 4096, "linespacing"), new TextProp(2, 8192, "spacebefore"), new TextProp(2, 16384, "spaceafter"), new TextProp(2, Variant.VT_RESERVED, "defaultTabSize"), new TextProp(2, 1048576, "tabStops"), new TextProp(2, 65536, "fontAlign"), new TextProp(2, 917504, "wrapFlags"), new TextProp(2, 2097152, "textDirection"), new TextProp(2, 16777216, "buletScheme"), new TextProp(2, 33554432, "bulletHasScheme")};
    public static TextProp[] characterTextPropTypes = {new TextProp(0, 1, "bold"), new TextProp(0, 2, "italic"), new TextProp(0, 4, "underline"), new TextProp(0, 8, "unused1"), new TextProp(0, 16, "shadow"), new TextProp(0, 32, "fehint"), new TextProp(0, 64, "unused2"), new TextProp(0, 128, "kumi"), new TextProp(0, 256, "unused3"), new TextProp(0, 512, "emboss"), new TextProp(0, 1024, "nibble1"), new TextProp(0, 2048, "nibble2"), new TextProp(0, 4096, "nibble3"), new TextProp(0, 8192, "nibble4"), new TextProp(0, 16384, "unused4"), new TextProp(0, Variant.VT_RESERVED, "unused5"), new CharFlagsTextProp(), new TextProp(2, 65536, "font.index"), new TextProp(0, 1048576, "pp10ext"), new TextProp(2, 2097152, "asian.font.index"), new TextProp(2, 4194304, "ansi.font.index"), new TextProp(2, 8388608, "symbol.font.index"), new TextProp(2, 131072, "font.size"), new TextProp(4, 262144, "font.color"), new TextProp(2, 524288, "superscript")};

    public StyleTextPropAtom(byte[] bArr, int i10, int i11) {
        this.initialised = false;
        this.paraAutoNumberIndexs = new HashMap();
        if (i11 < 18) {
            if (bArr.length - i10 < 18) {
                throw new RuntimeException("Not enough data to form a StyleTextPropAtom (min size 18 bytes long) - found " + (bArr.length - i10));
            }
            i11 = 18;
        }
        byte[] bArr2 = new byte[8];
        this._header = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, 8);
        byte[] bArr3 = new byte[i11 - 8];
        this.rawContents = bArr3;
        System.arraycopy(bArr, i10 + 8, bArr3, 0, bArr3.length);
        this.reserved = new byte[0];
        this.paragraphStyles = new LinkedList<>();
        this.charStyles = new LinkedList<>();
    }

    private int getCharactersCovered(LinkedList<TextPropCollection> linkedList) {
        Iterator<TextPropCollection> it = linkedList.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += it.next().getCharactersCovered();
        }
        return i10;
    }

    private void updateRawContents() {
        if (!this.initialised) {
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i10 = 0; i10 < this.paragraphStyles.size(); i10++) {
            this.paragraphStyles.get(i10);
        }
        for (int i11 = 0; i11 < this.charStyles.size(); i11++) {
            this.charStyles.get(i11);
        }
        this.rawContents = byteArrayOutputStream.toByteArray();
    }

    public TextPropCollection addCharacterTextPropCollection(int i10) {
        TextPropCollection textPropCollection = new TextPropCollection(i10);
        this.charStyles.add(textPropCollection);
        return textPropCollection;
    }

    public TextPropCollection addParagraphTextPropCollection(int i10) {
        TextPropCollection textPropCollection = new TextPropCollection(i10, (short) 0);
        this.paragraphStyles.add(textPropCollection);
        return textPropCollection;
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public void dispose() {
        Map<Integer, Integer> map = this.paraAutoNumberIndexs;
        if (map != null) {
            map.clear();
        }
    }

    public int getAutoNumberIndex(int i10) {
        Integer num;
        int i11 = 0;
        if (this.paragraphStyles != null) {
            int i12 = 0;
            int i13 = 0;
            while (true) {
                if (i12 >= this.paragraphStyles.size()) {
                    break;
                }
                int charactersCovered = (this.paragraphStyles.get(i12).getCharactersCovered() + i13) - 1;
                if (i10 >= i13 && i10 <= charactersCovered) {
                    i11 = i12;
                    break;
                }
                i13 = charactersCovered + 1;
                i12++;
            }
        }
        if (i11 >= 0 && i11 < this.paraAutoNumberIndexs.size() && (num = this.paraAutoNumberIndexs.get(Integer.valueOf(i11))) != null) {
            return num.intValue();
        }
        return -1;
    }

    public LinkedList<TextPropCollection> getCharacterStyles() {
        return this.charStyles;
    }

    public int getCharacterTextLengthCovered() {
        return getCharactersCovered(this.charStyles);
    }

    public LinkedList<TextPropCollection> getParagraphStyles() {
        return this.paragraphStyles;
    }

    public int getParagraphTextLengthCovered() {
        return getCharactersCovered(this.paragraphStyles);
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public long getRecordType() {
        return _type;
    }

    public void setCharacterStyles(LinkedList<TextPropCollection> linkedList) {
        this.charStyles = linkedList;
    }

    public void setParagraphStyles(LinkedList<TextPropCollection> linkedList) {
        this.paragraphStyles = linkedList;
    }

    public void setParentTextSize(int i10) {
        byte[] bArr;
        int i11;
        int i12;
        TextProp findByName;
        this.paraAutoNumberIndexs.clear();
        int i13 = i10;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (true) {
            byte[] bArr2 = this.rawContents;
            if (i14 >= bArr2.length || i15 >= i13) {
                break;
            }
            int i18 = LittleEndian.getInt(bArr2, i14);
            i15 += i18;
            int i19 = i14 + 4;
            short s4 = LittleEndian.getShort(this.rawContents, i19);
            int i20 = i19 + 2;
            int i21 = LittleEndian.getInt(this.rawContents, i20);
            int i22 = i20 + 4;
            TextPropCollection textPropCollection = new TextPropCollection(i18, s4);
            i14 = i22 + textPropCollection.buildTextPropList(i21, paragraphTextPropTypes, this.rawContents, i22);
            this.paragraphStyles.add(textPropCollection);
            if (i14 < this.rawContents.length && i15 == i10) {
                i13++;
            }
            if (i16 > 0) {
                TextProp findByName2 = textPropCollection.findByName("paragraph_flags");
                if (findByName2 != null) {
                    i11 = findByName2.getValue();
                } else {
                    i11 = 0;
                }
                if (i11 != 1) {
                    TextProp findByName3 = textPropCollection.findByName("bullet.char");
                    if (findByName3 != null) {
                        i12 = findByName3.getValue();
                    } else {
                        i12 = 0;
                    }
                    if (i11 != 2) {
                        if (i12 != 8226 && i12 != 8211) {
                            TextPropCollection textPropCollection2 = this.paragraphStyles.get(i16 - 1);
                            if (textPropCollection2 != null && (findByName = textPropCollection2.findByName("bullet.char")) != null) {
                                i12 = findByName.getValue();
                            }
                            if (i12 != 8226 && i12 != 8211) {
                            }
                        }
                    }
                }
                i17++;
            }
            this.paraAutoNumberIndexs.put(Integer.valueOf(i16), Integer.valueOf(i17));
            i16++;
        }
        int i23 = i10;
        int i24 = 0;
        while (true) {
            bArr = this.rawContents;
            if (i14 >= bArr.length || i24 >= i23) {
                break;
            }
            int i25 = LittleEndian.getInt(bArr, i14);
            i24 += i25;
            int i26 = i14 + 4;
            int i27 = LittleEndian.getInt(this.rawContents, i26);
            int i28 = i26 + 4;
            TextPropCollection textPropCollection3 = new TextPropCollection(i25, (short) -1);
            i14 = i28 + textPropCollection3.buildTextPropList(i27, characterTextPropTypes, this.rawContents, i28);
            this.charStyles.add(textPropCollection3);
            if (i14 < this.rawContents.length && i24 == i10) {
                i23++;
            }
        }
        if (i14 < bArr.length) {
            byte[] bArr3 = new byte[bArr.length - i14];
            this.reserved = bArr3;
            System.arraycopy(bArr, i14, bArr3, 0, bArr3.length);
        }
        this.initialised = true;
    }

    public void setRawContents(byte[] bArr) {
        this.rawContents = bArr;
        this.reserved = new byte[0];
        this.initialised = false;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("StyleTextPropAtom:\n");
        if (!this.initialised) {
            stringBuffer.append("Uninitialised, dumping Raw Style Data\n");
        } else {
            stringBuffer.append("Paragraph properties\n");
            Iterator<TextPropCollection> it = getParagraphStyles().iterator();
            while (it.hasNext()) {
                TextPropCollection next = it.next();
                stringBuffer.append("  chars covered: " + next.getCharactersCovered());
                stringBuffer.append("  special mask flags: 0x" + HexDump.toHex(next.getSpecialMask()) + "\n");
                Iterator<TextProp> it2 = next.getTextPropList().iterator();
                while (it2.hasNext()) {
                    TextProp next2 = it2.next();
                    stringBuffer.append("    " + next2.getName() + " = " + next2.getValue());
                    StringBuilder sb2 = new StringBuilder(" (0x");
                    sb2.append(HexDump.toHex(next2.getValue()));
                    sb2.append(")\n");
                    stringBuffer.append(sb2.toString());
                }
                stringBuffer.append("  para bytes that would be written: \n");
                try {
                    stringBuffer.append(HexDump.dump(new ByteArrayOutputStream().toByteArray(), 0L, 0));
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
            stringBuffer.append("Character properties\n");
            Iterator<TextPropCollection> it3 = getCharacterStyles().iterator();
            while (it3.hasNext()) {
                TextPropCollection next3 = it3.next();
                stringBuffer.append("  chars covered: " + next3.getCharactersCovered());
                stringBuffer.append("  special mask flags: 0x" + HexDump.toHex(next3.getSpecialMask()) + "\n");
                Iterator<TextProp> it4 = next3.getTextPropList().iterator();
                while (it4.hasNext()) {
                    TextProp next4 = it4.next();
                    stringBuffer.append("    " + next4.getName() + " = " + next4.getValue());
                    StringBuilder sb3 = new StringBuilder(" (0x");
                    sb3.append(HexDump.toHex(next4.getValue()));
                    sb3.append(")\n");
                    stringBuffer.append(sb3.toString());
                }
                stringBuffer.append("  char bytes that would be written: \n");
                try {
                    stringBuffer.append(HexDump.dump(new ByteArrayOutputStream().toByteArray(), 0L, 0));
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }
        stringBuffer.append("  original byte stream \n");
        stringBuffer.append(HexDump.dump(this.rawContents, 0L, 0));
        return stringBuffer.toString();
    }

    public void writeOut(OutputStream outputStream) {
        updateRawContents();
        LittleEndian.putInt(this._header, 4, this.rawContents.length + this.reserved.length);
        outputStream.write(this._header);
        outputStream.write(this.rawContents);
        outputStream.write(this.reserved);
    }

    public StyleTextPropAtom(int i10) {
        this.initialised = false;
        this.paraAutoNumberIndexs = new HashMap();
        byte[] bArr = new byte[8];
        this._header = bArr;
        this.rawContents = new byte[0];
        this.reserved = new byte[0];
        LittleEndian.putInt(bArr, 2, (short) _type);
        LittleEndian.putInt(this._header, 4, 10);
        this.paragraphStyles = new LinkedList<>();
        this.charStyles = new LinkedList<>();
        this.paragraphStyles.add(new TextPropCollection(i10, (short) 0));
        this.charStyles.add(new TextPropCollection(i10));
        this.initialised = true;
    }
}
