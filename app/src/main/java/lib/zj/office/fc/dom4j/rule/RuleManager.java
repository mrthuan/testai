package lib.zj.office.fc.dom4j.rule;

import java.io.PrintStream;
import java.util.HashMap;
import lib.zj.office.fc.dom4j.Document;
import lib.zj.office.fc.dom4j.Element;
import lib.zj.office.fc.dom4j.Node;
import lib.zj.office.fc.dom4j.rule.pattern.NodeTypePattern;

/* loaded from: classes3.dex */
public class RuleManager {
    private int appearenceCount;
    private HashMap modes = new HashMap();
    private Action valueOfAction;

    public void addDefaultRule(Mode mode, Pattern pattern, Action action) {
        mode.addRule(createDefaultRule(pattern, action));
    }

    public void addDefaultRules(final Mode mode) {
        Action action = new Action() { // from class: lib.zj.office.fc.dom4j.rule.RuleManager.1
            @Override // lib.zj.office.fc.dom4j.rule.Action
            public void run(Node node) {
                if (node instanceof Element) {
                    mode.applyTemplates((Element) node);
                } else if (node instanceof Document) {
                    mode.applyTemplates((Document) node);
                }
            }
        };
        Action valueOfAction = getValueOfAction();
        addDefaultRule(mode, NodeTypePattern.ANY_DOCUMENT, action);
        addDefaultRule(mode, NodeTypePattern.ANY_ELEMENT, action);
        if (valueOfAction != null) {
            addDefaultRule(mode, NodeTypePattern.ANY_ATTRIBUTE, valueOfAction);
            addDefaultRule(mode, NodeTypePattern.ANY_TEXT, valueOfAction);
        }
    }

    public void addRule(Rule rule) {
        int i10 = this.appearenceCount + 1;
        this.appearenceCount = i10;
        rule.setAppearenceCount(i10);
        Mode mode = getMode(rule.getMode());
        Rule[] unionRules = rule.getUnionRules();
        if (unionRules != null) {
            for (Rule rule2 : unionRules) {
                mode.addRule(rule2);
            }
            return;
        }
        mode.addRule(rule);
    }

    public void clear() {
        this.modes.clear();
        this.appearenceCount = 0;
    }

    public Rule createDefaultRule(Pattern pattern, Action action) {
        Rule rule = new Rule(pattern, action);
        rule.setImportPrecedence(-1);
        return rule;
    }

    public Mode createMode() {
        Mode mode = new Mode();
        addDefaultRules(mode);
        return mode;
    }

    public Rule getMatchingRule(String str, Node node) {
        Mode mode = (Mode) this.modes.get(str);
        if (mode != null) {
            return mode.getMatchingRule(node);
        }
        PrintStream printStream = System.out;
        printStream.println("Warning: No Mode for mode: " + mode);
        return null;
    }

    public Mode getMode(String str) {
        Mode mode = (Mode) this.modes.get(str);
        if (mode == null) {
            Mode createMode = createMode();
            this.modes.put(str, createMode);
            return createMode;
        }
        return mode;
    }

    public Action getValueOfAction() {
        return this.valueOfAction;
    }

    public void removeRule(Rule rule) {
        Mode mode = getMode(rule.getMode());
        Rule[] unionRules = rule.getUnionRules();
        if (unionRules != null) {
            for (Rule rule2 : unionRules) {
                mode.removeRule(rule2);
            }
            return;
        }
        mode.removeRule(rule);
    }

    public void setValueOfAction(Action action) {
        this.valueOfAction = action;
    }
}
