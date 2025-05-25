package lib.zj.office.fc.dom4j.rule.pattern;

import lib.zj.office.fc.dom4j.Node;
import lib.zj.office.fc.dom4j.rule.Pattern;

/* loaded from: classes3.dex */
public class NodeTypePattern implements Pattern {
    public static final NodeTypePattern ANY_ATTRIBUTE = new NodeTypePattern(2);
    public static final NodeTypePattern ANY_COMMENT = new NodeTypePattern(8);
    public static final NodeTypePattern ANY_DOCUMENT = new NodeTypePattern(9);
    public static final NodeTypePattern ANY_ELEMENT = new NodeTypePattern(1);
    public static final NodeTypePattern ANY_PROCESSING_INSTRUCTION = new NodeTypePattern(7);
    public static final NodeTypePattern ANY_TEXT = new NodeTypePattern(3);
    private short nodeType;

    public NodeTypePattern(short s4) {
        this.nodeType = s4;
    }

    @Override // lib.zj.office.fc.dom4j.rule.Pattern
    public short getMatchType() {
        return this.nodeType;
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
        if (node.getNodeType() == this.nodeType) {
            return true;
        }
        return false;
    }
}
