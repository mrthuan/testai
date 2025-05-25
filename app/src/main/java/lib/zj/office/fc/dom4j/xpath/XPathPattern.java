package lib.zj.office.fc.dom4j.xpath;

import lib.zj.office.fc.dom4j.Node;
import lib.zj.office.fc.dom4j.rule.Pattern;

/* loaded from: classes3.dex */
public class XPathPattern implements Pattern {
    private Pattern pattern;
    private String text;

    public XPathPattern(Pattern pattern) {
    }

    @Override // lib.zj.office.fc.dom4j.rule.Pattern
    public short getMatchType() {
        return this.pattern.getMatchType();
    }

    @Override // lib.zj.office.fc.dom4j.rule.Pattern
    public String getMatchesNodeName() {
        return this.pattern.getMatchesNodeName();
    }

    @Override // lib.zj.office.fc.dom4j.rule.Pattern
    public double getPriority() {
        return this.pattern.getPriority();
    }

    public String getText() {
        return this.text;
    }

    @Override // lib.zj.office.fc.dom4j.rule.Pattern
    public Pattern[] getUnionPatterns() {
        Pattern[] unionPatterns = this.pattern.getUnionPatterns();
        if (unionPatterns != null) {
            int length = unionPatterns.length;
            XPathPattern[] xPathPatternArr = new XPathPattern[length];
            for (int i10 = 0; i10 < length; i10++) {
                xPathPatternArr[i10] = new XPathPattern(unionPatterns[i10]);
            }
            return xPathPatternArr;
        }
        return null;
    }

    @Override // lib.zj.office.fc.dom4j.rule.Pattern, lib.zj.office.fc.dom4j.NodeFilter
    public boolean matches(Node node) {
        return false;
    }

    public XPathPattern(String str) {
    }
}
