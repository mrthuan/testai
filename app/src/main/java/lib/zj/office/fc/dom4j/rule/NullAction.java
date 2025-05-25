package lib.zj.office.fc.dom4j.rule;

import lib.zj.office.fc.dom4j.Node;

/* loaded from: classes3.dex */
public class NullAction implements Action {
    public static final NullAction SINGLETON = new NullAction();

    @Override // lib.zj.office.fc.dom4j.rule.Action
    public void run(Node node) {
    }
}
