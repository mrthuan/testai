package lib.zj.office.fc.xls.Reader;

import ei.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class SchemeColorUtil {
    private static List<String> schemeClrName;
    private static Map<String, Integer> schemeColor;

    public static Map<String, Integer> getSchemeColor(d dVar) {
        init(dVar);
        return schemeColor;
    }

    public static int getThemeColor(d dVar, int i10) {
        init(dVar);
        if (i10 >= 0 && i10 < schemeClrName.size()) {
            return dVar.l(schemeClrName.get(i10));
        }
        return -1;
    }

    private static void init(d dVar) {
        if (schemeColor == null) {
            ArrayList arrayList = new ArrayList();
            schemeClrName = arrayList;
            arrayList.add("bg1");
            schemeClrName.add("tx1");
            schemeClrName.add("bg2");
            schemeClrName.add("tx2");
            schemeClrName.add("accent1");
            schemeClrName.add("accent2");
            schemeClrName.add("accent3");
            schemeClrName.add("accent4");
            schemeClrName.add("accent5");
            schemeClrName.add("accent6");
            schemeClrName.add("hlink");
            schemeClrName.add("folHlink");
            schemeClrName.add("dk1");
            schemeClrName.add("lt1");
            schemeClrName.add("dk2");
            schemeClrName.add("lt2");
            schemeColor = new HashMap();
        }
        schemeColor.clear();
        for (String str : schemeClrName) {
            schemeColor.put(str, Integer.valueOf(dVar.l(str)));
        }
    }
}
