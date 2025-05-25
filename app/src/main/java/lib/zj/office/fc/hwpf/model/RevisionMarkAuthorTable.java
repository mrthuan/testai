package lib.zj.office.fc.hwpf.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import lib.zj.office.fc.hwpf.model.io.HWPFOutputStream;
import lib.zj.office.fc.util.Internal;
import lib.zj.office.fc.util.LittleEndian;
import lib.zj.office.fc.util.StringUtil;

@Internal
/* loaded from: classes3.dex */
public final class RevisionMarkAuthorTable {
    private short cData;
    private short cbExtra;
    private String[] entries;
    private short fExtend;

    public RevisionMarkAuthorTable(byte[] bArr, int i10, int i11) {
        this.fExtend = (short) -1;
        this.cData = (short) 0;
        this.cbExtra = (short) 0;
        this.fExtend = LittleEndian.getShort(bArr, i10);
        int i12 = i10 + 2;
        this.cData = LittleEndian.getShort(bArr, i12);
        int i13 = i12 + 2;
        this.cbExtra = LittleEndian.getShort(bArr, i13);
        int i14 = i13 + 2;
        this.entries = new String[this.cData];
        for (int i15 = 0; i15 < this.cData; i15++) {
            short s4 = LittleEndian.getShort(bArr, i14);
            int i16 = i14 + 2;
            String fromUnicodeLE = StringUtil.getFromUnicodeLE(bArr, i16, s4);
            i14 = i16 + (s4 * 2);
            this.entries[i15] = fromUnicodeLE;
        }
    }

    public String getAuthor(int i10) {
        if (i10 >= 0) {
            String[] strArr = this.entries;
            if (i10 < strArr.length) {
                return strArr[i10];
            }
        }
        return null;
    }

    public List<String> getEntries() {
        return Collections.unmodifiableList(Arrays.asList(this.entries));
    }

    public int getSize() {
        return this.cData;
    }

    public void writeTo(HWPFOutputStream hWPFOutputStream) {
        String[] strArr;
        byte[] bArr = new byte[6];
        LittleEndian.putShort(bArr, 0, this.fExtend);
        LittleEndian.putShort(bArr, 2, this.cData);
        LittleEndian.putShort(bArr, 4, this.cbExtra);
        hWPFOutputStream.write(bArr);
        for (String str : this.entries) {
            byte[] bArr2 = new byte[(str.length() * 2) + 2];
            LittleEndian.putShort(bArr2, 0, (short) str.length());
            StringUtil.putUnicodeLE(str, bArr2, 2);
            hWPFOutputStream.write(bArr2);
        }
    }
}
