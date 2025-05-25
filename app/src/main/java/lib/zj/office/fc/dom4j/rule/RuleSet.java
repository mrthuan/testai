package lib.zj.office.fc.dom4j.rule;

import java.util.ArrayList;
import java.util.Collections;
import lib.zj.office.fc.dom4j.Node;

/* loaded from: classes3.dex */
public class RuleSet {
    private Rule[] ruleArray;
    private ArrayList rules = new ArrayList();

    public void addAll(RuleSet ruleSet) {
        this.rules.addAll(ruleSet.rules);
        this.ruleArray = null;
    }

    public void addRule(Rule rule) {
        this.rules.add(rule);
        this.ruleArray = null;
    }

    public Rule getMatchingRule(Node node) {
        Rule[] ruleArray = getRuleArray();
        for (int length = ruleArray.length - 1; length >= 0; length--) {
            Rule rule = ruleArray[length];
            if (rule.matches(node)) {
                return rule;
            }
        }
        return null;
    }

    public Rule[] getRuleArray() {
        if (this.ruleArray == null) {
            Collections.sort(this.rules);
            Rule[] ruleArr = new Rule[this.rules.size()];
            this.ruleArray = ruleArr;
            this.rules.toArray(ruleArr);
        }
        return this.ruleArray;
    }

    public void removeRule(Rule rule) {
        this.rules.remove(rule);
        this.ruleArray = null;
    }

    public String toString() {
        return super.toString() + " [RuleSet: " + this.rules + " ]";
    }
}
