package lib.zj.office.fc.hslf.record;

import java.io.OutputStream;
import lib.zj.office.fc.hpsf.Variant;
import lib.zj.office.fc.hslf.model.textproperties.AlignmentTextProp;
import lib.zj.office.fc.hslf.model.textproperties.CharFlagsTextProp;
import lib.zj.office.fc.hslf.model.textproperties.ParagraphFlagsTextProp;
import lib.zj.office.fc.hslf.model.textproperties.TextProp;
import lib.zj.office.fc.hslf.model.textproperties.TextPropCollection;
import lib.zj.office.fc.ss.util.CellUtil;
import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public final class TxMasterStyleAtom extends RecordAtom {
    private static final int MAX_INDENT = 5;
    private static long _type = 4003;
    private byte[] _data;
    private byte[] _header;
    private TextPropCollection[] chstyles;
    private TextPropCollection[] prstyles;

    public TxMasterStyleAtom(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[8];
        this._header = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, 8);
        byte[] bArr3 = new byte[i11 - 8];
        this._data = bArr3;
        System.arraycopy(bArr, i10 + 8, bArr3, 0, bArr3.length);
        try {
            init();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public void dispose() {
        TextPropCollection[] textPropCollectionArr = this.prstyles;
        if (textPropCollectionArr != null) {
            for (TextPropCollection textPropCollection : textPropCollectionArr) {
                textPropCollection.dispose();
            }
        }
        TextPropCollection[] textPropCollectionArr2 = this.chstyles;
        if (textPropCollectionArr2 != null) {
            for (TextPropCollection textPropCollection2 : textPropCollectionArr2) {
                textPropCollection2.dispose();
            }
        }
    }

    public TextProp[] getCharacterProps(int i10, int i11) {
        return (i11 != 0 || i10 >= 5) ? StyleTextPropAtom.characterTextPropTypes : new TextProp[]{new CharFlagsTextProp(), new TextProp(2, 65536, "font.index"), new TextProp(2, 131072, "char_unknown_1"), new TextProp(4, 262144, "char_unknown_2"), new TextProp(2, 524288, "font.size"), new TextProp(2, 1048576, "char_unknown_3"), new TextProp(4, 2097152, "font.color"), new TextProp(2, 8388608, "char_unknown_4")};
    }

    public TextPropCollection[] getCharacterStyles() {
        return this.chstyles;
    }

    public TextProp[] getParagraphProps(int i10, int i11) {
        return (i11 != 0 || i10 >= 5) ? new TextProp[]{new TextProp(0, 1, "hasBullet"), new TextProp(0, 2, "hasBulletFont"), new TextProp(0, 4, "hasBulletColor"), new TextProp(0, 8, "hasBulletSize"), new ParagraphFlagsTextProp(), new TextProp(2, 128, "bullet.char"), new TextProp(2, 16, "bullet.font"), new TextProp(2, 64, "bullet.size"), new TextProp(4, 32, "bullet.color"), new AlignmentTextProp(), new TextProp(2, 4096, "linespacing"), new TextProp(2, 8192, "spacebefore"), new TextProp(2, 256, "text.offset"), new TextProp(2, 1024, "bullet.offset"), new TextProp(2, 16384, "spaceafter"), new TextProp(2, Variant.VT_RESERVED, "defaultTabSize"), new TextProp(2, 1048576, "tabStops"), new TextProp(2, 65536, "fontAlign"), new TextProp(2, 917504, "wrapFlags"), new TextProp(2, 2097152, "textDirection"), new TextProp(2, 16777216, "buletScheme"), new TextProp(2, 33554432, "bulletHasScheme")} : new TextProp[]{new ParagraphFlagsTextProp(), new TextProp(2, 128, "bullet.char"), new TextProp(2, 16, "bullet.font"), new TextProp(2, 64, "bullet.size"), new TextProp(4, 32, "bullet.color"), new TextProp(2, 3328, CellUtil.ALIGNMENT), new TextProp(2, 4096, "linespacing"), new TextProp(2, 8192, "spacebefore"), new TextProp(2, 16384, "spaceafter"), new TextProp(2, Variant.VT_RESERVED, "text.offset"), new TextProp(2, 65536, "bullet.offset"), new TextProp(2, 131072, "defaulttab"), new TextProp(2, 262144, "tabStops"), new TextProp(2, 524288, "fontAlign"), new TextProp(2, 1048576, "para_unknown_1"), new TextProp(2, 2097152, "para_unknown_2")};
    }

    public TextPropCollection[] getParagraphStyles() {
        return this.prstyles;
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public long getRecordType() {
        return _type;
    }

    public int getTextType() {
        return LittleEndian.getShort(this._header, 0) >> 4;
    }

    public void init() {
        int textType = getTextType();
        int i10 = LittleEndian.getShort(this._data, 0);
        this.prstyles = new TextPropCollection[i10];
        this.chstyles = new TextPropCollection[i10];
        int i11 = 2;
        for (short s4 = 0; s4 < i10; s4 = (short) (s4 + 1)) {
            if (textType >= 5) {
                LittleEndian.getShort(this._data, i11);
                i11 += 2;
            }
            int i12 = LittleEndian.getInt(this._data, i11);
            int i13 = i11 + 4;
            TextPropCollection textPropCollection = new TextPropCollection(0);
            int buildTextPropList = i13 + textPropCollection.buildTextPropList(i12, getParagraphProps(textType, s4), this._data, i13);
            this.prstyles[s4] = textPropCollection;
            int i14 = LittleEndian.getInt(this._data, buildTextPropList);
            int i15 = buildTextPropList + 4;
            TextPropCollection textPropCollection2 = new TextPropCollection(0);
            i11 = i15 + textPropCollection2.buildTextPropList(i14, getCharacterProps(textType, s4), this._data, i15);
            this.chstyles[s4] = textPropCollection2;
        }
    }

    public void writeOut(OutputStream outputStream) {
        outputStream.write(this._header);
        outputStream.write(this._data);
    }
}
