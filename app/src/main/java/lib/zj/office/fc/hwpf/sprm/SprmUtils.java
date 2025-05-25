package lib.zj.office.fc.hwpf.sprm;

import java.util.List;
import lib.zj.office.fc.util.Internal;
import lib.zj.office.fc.util.LittleEndian;

@Internal
/* loaded from: classes3.dex */
public final class SprmUtils {
    public static int addSpecialSprm(short s4, byte[] bArr, List<byte[]> list) {
        int length = bArr.length + 4;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 4, bArr.length);
        LittleEndian.putShort(bArr2, s4);
        LittleEndian.putShort(bArr2, 2, (short) (bArr.length + 1));
        list.add(bArr2);
        return length;
    }

    public static int addSprm(short s4, boolean z10, List<byte[]> list) {
        return addSprm(s4, z10 ? 1 : 0, null, list);
    }

    public static int convertBrcToInt(short[] sArr) {
        byte[] bArr = new byte[4];
        LittleEndian.putShort(bArr, sArr[0]);
        LittleEndian.putShort(bArr, 2, sArr[1]);
        return LittleEndian.getInt(bArr);
    }

    public static byte[] getGrpprl(List<byte[]> list, int i10) {
        byte[] bArr = new byte[i10];
        int i11 = 0;
        for (int size = list.size() - 1; size >= 0; size--) {
            byte[] remove = list.remove(0);
            System.arraycopy(remove, 0, bArr, i11, remove.length);
            i11 += remove.length;
        }
        return bArr;
    }

    public static byte[] shortArrayToByteArray(short[] sArr) {
        byte[] bArr = new byte[sArr.length * 2];
        for (int i10 = 0; i10 < sArr.length; i10++) {
            LittleEndian.putShort(bArr, i10 * 2, sArr[i10]);
        }
        return bArr;
    }

    public static int addSprm(short s4, int i10, byte[] bArr, List<byte[]> list) {
        byte[] bArr2;
        switch ((57344 & s4) >> 13) {
            case 0:
            case 1:
                bArr2 = new byte[]{0, 0, (byte) i10};
                break;
            case 2:
                bArr2 = new byte[4];
                LittleEndian.putShort(bArr2, 2, (short) i10);
                break;
            case 3:
                bArr2 = new byte[6];
                LittleEndian.putInt(bArr2, 2, i10);
                break;
            case 4:
            case 5:
                bArr2 = new byte[4];
                LittleEndian.putShort(bArr2, 2, (short) i10);
                break;
            case 6:
                byte[] bArr3 = new byte[bArr.length + 3];
                bArr3[2] = (byte) bArr.length;
                System.arraycopy(bArr, 0, bArr3, 3, bArr.length);
                bArr2 = bArr3;
                break;
            case 7:
                bArr2 = new byte[5];
                byte[] bArr4 = new byte[4];
                LittleEndian.putInt(bArr4, 0, i10);
                System.arraycopy(bArr4, 0, bArr2, 2, 3);
                break;
            default:
                bArr2 = null;
                break;
        }
        LittleEndian.putShort(bArr2, 0, s4);
        list.add(bArr2);
        return bArr2.length;
    }
}
