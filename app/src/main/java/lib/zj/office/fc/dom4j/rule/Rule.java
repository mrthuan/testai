package lib.zj.office.fc.dom4j.rule;

import lib.zj.office.fc.dom4j.Node;

/* loaded from: classes3.dex */
public class Rule implements Comparable {
    private Action action;
    private int appearenceCount;
    private int importPrecedence;
    private String mode;
    private Pattern pattern;
    private double priority;

    public Rule() {
        this.priority = 0.5d;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        if (obj instanceof Rule) {
            return compareTo((Rule) obj);
        }
        return getClass().getName().compareTo(obj.getClass().getName());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Rule) || compareTo((Rule) obj) != 0) {
            return false;
        }
        return true;
    }

    public Action getAction() {
        return this.action;
    }

    public int getAppearenceCount() {
        return this.appearenceCount;
    }

    public int getImportPrecedence() {
        return this.importPrecedence;
    }

    public final short getMatchType() {
        return this.pattern.getMatchType();
    }

    public final String getMatchesNodeName() {
        return this.pattern.getMatchesNodeName();
    }

    public String getMode() {
        return this.mode;
    }

    public Pattern getPattern() {
        return this.pattern;
    }

    public double getPriority() {
        return this.priority;
    }

    public Rule[] getUnionRules() {
        Pattern[] unionPatterns = this.pattern.getUnionPatterns();
        if (unionPatterns == null) {
            return null;
        }
        int length = unionPatterns.length;
        Rule[] ruleArr = new Rule[length];
        for (int i10 = 0; i10 < length; i10++) {
            ruleArr[i10] = new Rule(this, unionPatterns[i10]);
        }
        return ruleArr;
    }

    public int hashCode() {
        return this.importPrecedence + this.appearenceCount;
    }

    public final boolean matches(Node node) {
        return this.pattern.matches(node);
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public void setAppearenceCount(int i10) {
        this.appearenceCount = i10;
    }

    public void setImportPrecedence(int i10) {
        this.importPrecedence = i10;
    }

    public void setMode(String str) {
        this.mode = str;
    }

    public void setPattern(Pattern pattern) {
        this.pattern = pattern;
    }

    public void setPriority(double d10) {
        this.priority = d10;
    }

    public String toString() {
        return super.toString() + "[ pattern: " + getPattern() + " action: " + getAction() + " ]";
    }

    public Rule(Pattern pattern) {
        this.pattern = pattern;
        this.priority = pattern.getPriority();
    }

    public int compareTo(Rule rule) {
        int i10 = this.importPrecedence - rule.importPrecedence;
        if (i10 == 0) {
            int round = (int) Math.round(this.priority - rule.priority);
            return round == 0 ? this.appearenceCount - rule.appearenceCount : round;
        }
        return i10;
    }

    public Rule(Pattern pattern, Action action) {
        this(pattern);
        this.action = action;
    }

    public Rule(Rule rule, Pattern pattern) {
        this.mode = rule.mode;
        this.importPrecedence = rule.importPrecedence;
        this.priority = rule.priority;
        this.appearenceCount = rule.appearenceCount;
        this.action = rule.action;
        this.pattern = pattern;
    }
}
