package lib.zj.office.fc.dom4j.rule;

import java.util.List;
import lib.zj.office.fc.dom4j.Document;
import lib.zj.office.fc.dom4j.Element;
import lib.zj.office.fc.dom4j.Node;
import lib.zj.office.fc.dom4j.XPath;

/* loaded from: classes3.dex */
public class Stylesheet {
    private String modeName;
    private RuleManager ruleManager = new RuleManager();

    public void addRule(Rule rule) {
        this.ruleManager.addRule(rule);
    }

    public void applyTemplates(Object obj, XPath xPath) {
        applyTemplates(obj, xPath, this.modeName);
    }

    public void clear() {
        this.ruleManager.clear();
    }

    public String getModeName() {
        return this.modeName;
    }

    public Action getValueOfAction() {
        return this.ruleManager.getValueOfAction();
    }

    public void removeRule(Rule rule) {
        this.ruleManager.removeRule(rule);
    }

    public void run(Object obj) {
        run(obj, this.modeName);
    }

    public void setModeName(String str) {
        this.modeName = str;
    }

    public void setValueOfAction(Action action) {
        this.ruleManager.setValueOfAction(action);
    }

    public void applyTemplates(Object obj, XPath xPath, String str) {
        Mode mode = this.ruleManager.getMode(str);
        for (Node node : xPath.selectNodes(obj)) {
            mode.fireRule(node);
        }
    }

    public void run(Object obj, String str) {
        if (obj instanceof Node) {
            run((Node) obj, str);
        } else if (obj instanceof List) {
            run((List) obj, str);
        }
    }

    public void run(List list) {
        run(list, this.modeName);
    }

    public void run(List list, String str) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            if (obj instanceof Node) {
                run((Node) obj, str);
            }
        }
    }

    public void applyTemplates(Object obj) {
        applyTemplates(obj, this.modeName);
    }

    public void applyTemplates(Object obj, String str) {
        Mode mode = this.ruleManager.getMode(str);
        int i10 = 0;
        if (obj instanceof Element) {
            Element element = (Element) obj;
            int nodeCount = element.nodeCount();
            while (i10 < nodeCount) {
                mode.fireRule(element.node(i10));
                i10++;
            }
        } else if (obj instanceof Document) {
            Document document = (Document) obj;
            int nodeCount2 = document.nodeCount();
            while (i10 < nodeCount2) {
                mode.fireRule(document.node(i10));
                i10++;
            }
        } else if (obj instanceof List) {
            List list = (List) obj;
            int size = list.size();
            while (i10 < size) {
                Object obj2 = list.get(i10);
                if (obj2 instanceof Element) {
                    applyTemplates((Element) obj2, str);
                } else if (obj2 instanceof Document) {
                    applyTemplates((Document) obj2, str);
                }
                i10++;
            }
        }
    }

    public void run(Node node) {
        run(node, this.modeName);
    }

    public void run(Node node, String str) {
        this.ruleManager.getMode(str).fireRule(node);
    }
}
