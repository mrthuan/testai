package lib.zj.office.fc.hslf.model;

import java.lang.reflect.Field;
import java.util.HashMap;
import lh.j;
import lib.zj.office.fc.hslf.exceptions.HSLFException;

/* loaded from: classes3.dex */
public final class ShapeTypes implements j {
    public static HashMap types = new HashMap();

    static {
        try {
            Field[] fields = j.class.getFields();
            for (int i10 = 0; i10 < fields.length; i10++) {
                Object obj = fields[i10].get(null);
                if (obj instanceof Integer) {
                    types.put(obj, fields[i10].getName());
                }
            }
        } catch (IllegalAccessException unused) {
            throw new HSLFException("Failed to initialize shape types");
        }
    }

    public static String typeName(int i10) {
        return (String) types.get(Integer.valueOf(i10));
    }
}
