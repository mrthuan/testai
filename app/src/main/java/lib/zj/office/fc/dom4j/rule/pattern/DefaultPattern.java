package lib.zj.office.fc.dom4j.rule.pattern;

import lib.zj.office.fc.dom4j.Node;
import lib.zj.office.fc.dom4j.NodeFilter;
import lib.zj.office.fc.dom4j.rule.Pattern;

/* loaded from: classes3.dex */
public class DefaultPattern implements Pattern {
    private NodeFilter filter;

    public DefaultPattern(NodeFilter nodeFilter) {
        this.filter = nodeFilter;
    }

    @Override // lib.zj.office.fc.dom4j.rule.Pattern
    public short getMatchType() {
        return (short) 0;
    }

    @Override // lib.zj.office.fc.dom4j.rule.Pattern
    public String getMatchesNodeName() {
        return null;
    }

    @Override // lib.zj.office.fc.dom4j.rule.Pattern
    public double getPriority() {
        return 0.5d;
    }

    @Override // lib.zj.office.fc.dom4j.rule.Pattern
    public Pattern[] getUnionPatterns() {
        return null;
    }

    @Override // lib.zj.office.fc.dom4j.rule.Pattern, lib.zj.office.fc.dom4j.NodeFilter
    public boolean matches(Node node) {
        return this.filter.matches(node);
    }
}
