package lib.zj.office.fc.hwpf.model;

import lib.zj.office.fc.hwpf.model.io.HWPFOutputStream;
import lib.zj.office.fc.util.Internal;
import lib.zj.office.fc.util.LittleEndian;
import lib.zj.office.fc.util.StringUtil;

@Internal
/* loaded from: classes3.dex */
class SttbfUtils {
    public static String[] read(byte[] bArr, int i10) {
        if (LittleEndian.getShort(bArr, i10) == -1) {
            int i11 = i10 + 2;
            int i12 = LittleEndian.getInt(bArr, i11);
            int i13 = i11 + 4;
            String[] strArr = new String[i12];
            for (int i14 = 0; i14 < i12; i14++) {
                short s4 = LittleEndian.getShort(bArr, i13);
                int i15 = i13 + 2;
                String fromUnicodeLE = StringUtil.getFromUnicodeLE(bArr, i15, s4);
                i13 = i15 + (s4 * 2);
                strArr[i14] = fromUnicodeLE;
            }
            return strArr;
        }
        throw new UnsupportedOperationException("Non-extended character Pascal strings are not supported right now. Please, contact POI developers for update.");
    }

    public static int write(HWPFOutputStream hWPFOutputStream, String[] strArr) {
        int i10 = 6;
        byte[] bArr = new byte[6];
        LittleEndian.putShort(bArr, 0, (short) -1);
        if (strArr != null && strArr.length != 0) {
            LittleEndian.putInt(bArr, 2, strArr.length);
            hWPFOutputStream.write(bArr);
            for (String str : strArr) {
                int length = (str.length() * 2) + 2;
                byte[] bArr2 = new byte[length];
                LittleEndian.putShort(bArr2, 0, (short) str.length());
                StringUtil.putUnicodeLE(str, bArr2, 2);
                hWPFOutputStream.write(bArr2);
                i10 += length;
            }
            return i10;
        }
        LittleEndian.putInt(bArr, 2, 0);
        hWPFOutputStream.write(bArr);
        return 6;
    }
}
