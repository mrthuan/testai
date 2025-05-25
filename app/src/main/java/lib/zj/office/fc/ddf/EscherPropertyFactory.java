package lib.zj.office.fc.ddf;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public final class EscherPropertyFactory {
    public List<EscherProperty> createProperties(byte[] bArr, int i10, short s4) {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < s4; i11++) {
            short s10 = LittleEndian.getShort(bArr, i10);
            int i12 = LittleEndian.getInt(bArr, i10 + 2);
            short s11 = (short) (s10 & 16383);
            if ((s10 & Short.MIN_VALUE) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            byte propertyType = EscherProperties.getPropertyType(s11);
            if (propertyType == 1) {
                arrayList.add(new EscherBoolProperty(s10, i12));
            } else if (propertyType == 2) {
                arrayList.add(new EscherRGBProperty(s10, i12));
            } else if (propertyType == 3) {
                arrayList.add(new EscherShapePathProperty(s10, i12));
            } else if (!z10) {
                arrayList.add(new EscherSimpleProperty(s10, i12));
            } else if (propertyType == 5) {
                arrayList.add(new EscherArrayProperty(s10, new byte[i12]));
            } else {
                arrayList.add(new EscherComplexProperty(s10, new byte[i12]));
            }
            i10 += 6;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            EscherProperty escherProperty = (EscherProperty) it.next();
            if (escherProperty instanceof EscherComplexProperty) {
                if (escherProperty instanceof EscherArrayProperty) {
                    i10 = ((EscherArrayProperty) escherProperty).setArrayData(bArr, i10) + i10;
                } else {
                    byte[] complexData = ((EscherComplexProperty) escherProperty).getComplexData();
                    System.arraycopy(bArr, i10, complexData, 0, complexData.length);
                    i10 += complexData.length;
                }
            }
        }
        return arrayList;
    }
}
