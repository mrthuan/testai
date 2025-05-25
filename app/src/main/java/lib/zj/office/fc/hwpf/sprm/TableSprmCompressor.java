package lib.zj.office.fc.hwpf.sprm;

import java.util.ArrayList;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.TableCellDescriptor;
import lib.zj.office.fc.hwpf.usermodel.TableProperties;
import lib.zj.office.fc.util.Internal;
import lib.zj.office.fc.util.LittleEndian;

@Internal
/* loaded from: classes3.dex */
public final class TableSprmCompressor {
    public static byte[] compressTableProperty(TableProperties tableProperties) {
        int i10;
        ArrayList arrayList = new ArrayList();
        if (tableProperties.getJc() != 0) {
            i10 = SprmUtils.addSprm((short) 21504, tableProperties.getJc(), null, arrayList) + 0;
        } else {
            i10 = 0;
        }
        if (tableProperties.getFCantSplit()) {
            i10 += SprmUtils.addSprm((short) 13315, 1, null, arrayList);
        }
        if (tableProperties.getFTableHeader()) {
            i10 += SprmUtils.addSprm((short) 13316, 1, null, arrayList);
        }
        byte[] bArr = new byte[24];
        tableProperties.getBrcTop().serialize(bArr, 0);
        tableProperties.getBrcLeft().serialize(bArr, 4);
        tableProperties.getBrcBottom().serialize(bArr, 8);
        tableProperties.getBrcRight().serialize(bArr, 12);
        tableProperties.getBrcHorizontal().serialize(bArr, 16);
        tableProperties.getBrcVertical().serialize(bArr, 20);
        if (!Arrays.equals(bArr, new byte[24])) {
            i10 += SprmUtils.addSprm((short) -10747, 0, bArr, arrayList);
        }
        if (tableProperties.getDyaRowHeight() != 0) {
            i10 += SprmUtils.addSprm((short) -27641, tableProperties.getDyaRowHeight(), null, arrayList);
        }
        if (tableProperties.getItcMac() > 0) {
            short itcMac = tableProperties.getItcMac();
            int i11 = ((itcMac + 1) * 2) + 1;
            byte[] bArr2 = new byte[(itcMac * 20) + i11];
            bArr2[0] = (byte) itcMac;
            short[] rgdxaCenter = tableProperties.getRgdxaCenter();
            for (int i12 = 0; i12 < rgdxaCenter.length; i12++) {
                LittleEndian.putShort(bArr2, (i12 * 2) + 1, rgdxaCenter[i12]);
            }
            TableCellDescriptor[] rgtc = tableProperties.getRgtc();
            for (int i13 = 0; i13 < rgtc.length; i13++) {
                rgtc[i13].serialize(bArr2, (i13 * 20) + i11);
            }
            i10 += SprmUtils.addSpecialSprm((short) -10744, bArr2, arrayList);
        }
        if (tableProperties.getTlp() != null && !tableProperties.getTlp().isEmpty()) {
            byte[] bArr3 = new byte[4];
            tableProperties.getTlp().serialize(bArr3, 0);
            i10 += SprmUtils.addSprm((short) 29706, 0, bArr3, arrayList);
        }
        return SprmUtils.getGrpprl(arrayList, i10);
    }
}
