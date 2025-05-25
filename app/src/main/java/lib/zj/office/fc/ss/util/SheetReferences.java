package lib.zj.office.fc.ss.util;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class SheetReferences {
    Map map = new HashMap(5);

    public void addSheetReference(String str, int i10) {
        this.map.put(Integer.valueOf(i10), str);
    }

    public String getSheetName(int i10) {
        return (String) this.map.get(Integer.valueOf(i10));
    }
}
