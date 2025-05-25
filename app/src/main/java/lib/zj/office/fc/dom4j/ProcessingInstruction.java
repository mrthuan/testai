package lib.zj.office.fc.dom4j;

import java.util.Map;

/* loaded from: classes3.dex */
public interface ProcessingInstruction extends Node {
    String getTarget();

    @Override // lib.zj.office.fc.dom4j.Node
    String getText();

    String getValue(String str);

    Map getValues();

    boolean removeValue(String str);

    void setTarget(String str);

    void setValue(String str, String str2);

    void setValues(Map map);
}
