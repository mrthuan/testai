package com.tom_roush.fontbox.cff;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class CharStringHandler {
    public abstract List<Number> handleCommand(List<Number> list, CharStringCommand charStringCommand);

    public List<Number> handleSequence(List<Object> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof CharStringCommand) {
                List<Number> handleCommand = handleCommand(arrayList, (CharStringCommand) obj);
                arrayList.clear();
                if (handleCommand != null) {
                    arrayList.addAll(handleCommand);
                }
            } else {
                arrayList.add((Number) obj);
            }
        }
        return arrayList;
    }
}
