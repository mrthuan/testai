package lib.zj.office.fc.util;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class BitFieldFactory {
    private static Map instances = new HashMap();

    public static BitField getInstance(int i10) {
        BitField bitField = (BitField) instances.get(Integer.valueOf(i10));
        if (bitField == null) {
            BitField bitField2 = new BitField(i10);
            instances.put(Integer.valueOf(i10), bitField2);
            return bitField2;
        }
        return bitField;
    }
}
