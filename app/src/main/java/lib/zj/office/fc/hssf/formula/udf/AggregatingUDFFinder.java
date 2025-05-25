package lib.zj.office.fc.hssf.formula.udf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import lib.zj.office.fc.hssf.formula.function.FreeRefFunction;

/* loaded from: classes3.dex */
public class AggregatingUDFFinder implements UDFFinder {
    private final Collection<UDFFinder> _usedToolPacks;

    public AggregatingUDFFinder(UDFFinder... uDFFinderArr) {
        ArrayList arrayList = new ArrayList(uDFFinderArr.length);
        this._usedToolPacks = arrayList;
        arrayList.addAll(Arrays.asList(uDFFinderArr));
    }

    public void add(UDFFinder uDFFinder) {
        this._usedToolPacks.add(uDFFinder);
    }

    @Override // lib.zj.office.fc.hssf.formula.udf.UDFFinder
    public FreeRefFunction findFunction(String str) {
        for (UDFFinder uDFFinder : this._usedToolPacks) {
            FreeRefFunction findFunction = uDFFinder.findFunction(str);
            if (findFunction != null) {
                return findFunction;
            }
        }
        return null;
    }
}
