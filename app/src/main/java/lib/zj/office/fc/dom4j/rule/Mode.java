package lib.zj.office.fc.dom4j.rule;

import java.util.HashMap;
import java.util.Map;
import lib.zj.office.fc.dom4j.Document;
import lib.zj.office.fc.dom4j.Element;
import lib.zj.office.fc.dom4j.Node;

/* loaded from: classes3.dex */
public class Mode {
    private Map attributeNameRuleSets;
    private Map elementNameRuleSets;
    private RuleSet[] ruleSets = new RuleSet[14];

    public void addRule(Rule rule) {
        short matchType = rule.getMatchType();
        String matchesNodeName = rule.getMatchesNodeName();
        if (matchesNodeName != null) {
            if (matchType == 1) {
                this.elementNameRuleSets = addToNameMap(this.elementNameRuleSets, matchesNodeName, rule);
            } else if (matchType == 2) {
                this.attributeNameRuleSets = addToNameMap(this.attributeNameRuleSets, matchesNodeName, rule);
            }
        }
        if (matchType >= 14) {
            matchType = 0;
        }
        if (matchType == 0) {
            int length = this.ruleSets.length;
            for (int i10 = 1; i10 < length; i10++) {
                RuleSet ruleSet = this.ruleSets[i10];
                if (ruleSet != null) {
                    ruleSet.addRule(rule);
                }
            }
        }
        getRuleSet(matchType).addRule(rule);
    }

    public Map addToNameMap(Map map, String str, Rule rule) {
        if (map == null) {
            map = new HashMap();
        }
        RuleSet ruleSet = (RuleSet) map.get(str);
        if (ruleSet == null) {
            ruleSet = new RuleSet();
            map.put(str, ruleSet);
        }
        ruleSet.addRule(rule);
        return map;
    }

    public void applyTemplates(Element element) {
        int attributeCount = element.attributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            fireRule(element.attribute(i10));
        }
        int nodeCount = element.nodeCount();
        for (int i11 = 0; i11 < nodeCount; i11++) {
            fireRule(element.node(i11));
        }
    }

    public void fireRule(Node node) {
        Rule matchingRule;
        Action action;
        if (node != null && (matchingRule = getMatchingRule(node)) != null && (action = matchingRule.getAction()) != null) {
            action.run(node);
        }
    }

    public Rule getMatchingRule(Node node) {
        Rule matchingRule;
        Rule rule;
        RuleSet ruleSet;
        Rule matchingRule2;
        short nodeType = node.getNodeType();
        if (nodeType == 1) {
            if (this.elementNameRuleSets != null) {
                RuleSet ruleSet2 = (RuleSet) this.elementNameRuleSets.get(node.getName());
                if (ruleSet2 != null && (matchingRule2 = ruleSet2.getMatchingRule(node)) != null) {
                    return matchingRule2;
                }
            }
        } else if (nodeType == 2 && this.attributeNameRuleSets != null) {
            RuleSet ruleSet3 = (RuleSet) this.attributeNameRuleSets.get(node.getName());
            if (ruleSet3 != null && (matchingRule = ruleSet3.getMatchingRule(node)) != null) {
                return matchingRule;
            }
        }
        if (nodeType < 0 || nodeType >= this.ruleSets.length) {
            nodeType = 0;
        }
        RuleSet ruleSet4 = this.ruleSets[nodeType];
        if (ruleSet4 != null) {
            rule = ruleSet4.getMatchingRule(node);
        } else {
            rule = null;
        }
        if (rule == null && nodeType != 0 && (ruleSet = this.ruleSets[0]) != null) {
            return ruleSet.getMatchingRule(node);
        }
        return rule;
    }

    public RuleSet getRuleSet(int i10) {
        RuleSet ruleSet;
        RuleSet ruleSet2 = this.ruleSets[i10];
        if (ruleSet2 == null) {
            ruleSet2 = new RuleSet();
            RuleSet[] ruleSetArr = this.ruleSets;
            ruleSetArr[i10] = ruleSet2;
            if (i10 != 0 && (ruleSet = ruleSetArr[0]) != null) {
                ruleSet2.addAll(ruleSet);
            }
        }
        return ruleSet2;
    }

    public void removeFromNameMap(Map map, String str, Rule rule) {
        RuleSet ruleSet;
        if (map != null && (ruleSet = (RuleSet) map.get(str)) != null) {
            ruleSet.removeRule(rule);
        }
    }

    public void removeRule(Rule rule) {
        short matchType = rule.getMatchType();
        String matchesNodeName = rule.getMatchesNodeName();
        if (matchesNodeName != null) {
            if (matchType == 1) {
                removeFromNameMap(this.elementNameRuleSets, matchesNodeName, rule);
            } else if (matchType == 2) {
                removeFromNameMap(this.attributeNameRuleSets, matchesNodeName, rule);
            }
        }
        if (matchType >= 14) {
            matchType = 0;
        }
        getRuleSet(matchType).removeRule(rule);
        if (matchType != 0) {
            getRuleSet(0).removeRule(rule);
        }
    }

    public void applyTemplates(Document document) {
        int nodeCount = document.nodeCount();
        for (int i10 = 0; i10 < nodeCount; i10++) {
            fireRule(document.node(i10));
        }
    }
}
