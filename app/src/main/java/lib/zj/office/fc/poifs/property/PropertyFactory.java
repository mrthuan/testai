package lib.zj.office.fc.poifs.property;

import java.util.ArrayList;
import java.util.List;
import lib.zj.office.fc.poifs.storage.ListManagedBlock;

/* loaded from: classes3.dex */
class PropertyFactory {
    private PropertyFactory() {
    }

    public static List<Property> convertToProperties(ListManagedBlock[] listManagedBlockArr) {
        ArrayList arrayList = new ArrayList();
        for (ListManagedBlock listManagedBlock : listManagedBlockArr) {
            convertToProperties(listManagedBlock.getData(), arrayList);
        }
        return arrayList;
    }

    public static void convertToProperties(byte[] bArr, List<Property> list) {
        int length = bArr.length / 128;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            byte b10 = bArr[i10 + 66];
            if (b10 == 1) {
                list.add(new DirectoryProperty(list.size(), bArr, i10));
            } else if (b10 == 2) {
                list.add(new DocumentProperty(list.size(), bArr, i10));
            } else if (b10 != 5) {
                list.add(null);
            } else {
                list.add(new RootProperty(list.size(), bArr, i10));
            }
            i10 += 128;
        }
    }
}
