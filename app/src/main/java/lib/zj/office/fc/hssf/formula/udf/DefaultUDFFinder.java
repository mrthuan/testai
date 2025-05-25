package lib.zj.office.fc.hssf.formula.udf;

import java.util.HashMap;
import java.util.Map;
import lib.zj.office.fc.hssf.formula.function.FreeRefFunction;

/* loaded from: classes3.dex */
public final class DefaultUDFFinder implements UDFFinder {
    private final Map<String, FreeRefFunction> _functionsByName;

    public DefaultUDFFinder(String[] strArr, FreeRefFunction[] freeRefFunctionArr) {
        int length = strArr.length;
        if (freeRefFunctionArr.length == length) {
            HashMap hashMap = new HashMap((length * 3) / 2);
            for (int i10 = 0; i10 < freeRefFunctionArr.length; i10++) {
                hashMap.put(strArr[i10].toUpperCase(), freeRefFunctionArr[i10]);
            }
            this._functionsByName = hashMap;
            return;
        }
        throw new IllegalArgumentException("Mismatch in number of function names and implementations");
    }

    @Override // lib.zj.office.fc.hssf.formula.udf.UDFFinder
    public FreeRefFunction findFunction(String str) {
        return this._functionsByName.get(str.toUpperCase());
    }
}
