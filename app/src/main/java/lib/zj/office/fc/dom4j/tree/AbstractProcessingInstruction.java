package lib.zj.office.fc.dom4j.tree;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import lib.zj.office.fc.dom4j.Element;
import lib.zj.office.fc.dom4j.ProcessingInstruction;
import lib.zj.office.fc.dom4j.Visitor;

/* loaded from: classes3.dex */
public abstract class AbstractProcessingInstruction extends AbstractNode implements ProcessingInstruction {
    private String getValue(StringTokenizer stringTokenizer) {
        String nextToken = stringTokenizer.nextToken();
        StringBuffer stringBuffer = new StringBuffer();
        while (stringTokenizer.hasMoreTokens() && !nextToken.equals(OperatorName.SHOW_TEXT_LINE) && !nextToken.equals(OperatorName.SHOW_TEXT_LINE_AND_SPACE)) {
            nextToken = stringTokenizer.nextToken();
        }
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken2 = stringTokenizer.nextToken();
            if (nextToken.equals(nextToken2)) {
                break;
            }
            stringBuffer.append(nextToken2);
        }
        return stringBuffer.toString();
    }

    @Override // lib.zj.office.fc.dom4j.Node
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override // lib.zj.office.fc.dom4j.Node
    public String asXML() {
        return "<?" + getName() + " " + getText() + "?>";
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractNode, lib.zj.office.fc.dom4j.Node
    public String getName() {
        return getTarget();
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractNode, lib.zj.office.fc.dom4j.Node
    public short getNodeType() {
        return (short) 7;
    }

    @Override // lib.zj.office.fc.dom4j.Node
    public String getPath(Element element) {
        Element parent = getParent();
        if (parent != null && parent != element) {
            return parent.getPath(element) + "/processing-instruction()";
        }
        return "processing-instruction()";
    }

    @Override // lib.zj.office.fc.dom4j.Node
    public String getUniquePath(Element element) {
        Element parent = getParent();
        if (parent != null && parent != element) {
            return parent.getUniquePath(element) + "/processing-instruction()";
        }
        return "processing-instruction()";
    }

    public Map parseValues(String str) {
        HashMap hashMap = new HashMap();
        StringTokenizer stringTokenizer = new StringTokenizer(str, " ='\"", true);
        while (stringTokenizer.hasMoreTokens()) {
            String name = getName(stringTokenizer);
            if (stringTokenizer.hasMoreTokens()) {
                hashMap.put(name, getValue(stringTokenizer));
            }
        }
        return hashMap;
    }

    @Override // lib.zj.office.fc.dom4j.ProcessingInstruction
    public boolean removeValue(String str) {
        return false;
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractNode, lib.zj.office.fc.dom4j.Node
    public void setName(String str) {
        setTarget(str);
    }

    @Override // lib.zj.office.fc.dom4j.ProcessingInstruction
    public void setValue(String str, String str2) {
        throw new UnsupportedOperationException("This PI is read-only and cannot be modified");
    }

    @Override // lib.zj.office.fc.dom4j.ProcessingInstruction
    public void setValues(Map map) {
        throw new UnsupportedOperationException("This PI is read-only and cannot be modified");
    }

    public String toString() {
        return super.toString() + " [ProcessingInstruction: &" + getName() + ";]";
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractNode, lib.zj.office.fc.dom4j.Node
    public void write(Writer writer) {
        writer.write("<?");
        writer.write(getName());
        writer.write(" ");
        writer.write(getText());
        writer.write("?>");
    }

    private String getName(StringTokenizer stringTokenizer) {
        StringBuffer stringBuffer = new StringBuffer(stringTokenizer.nextToken());
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            if (nextToken.equals("=")) {
                break;
            }
            stringBuffer.append(nextToken);
        }
        return stringBuffer.toString().trim();
    }

    public String toString(Map map) {
        StringBuffer stringBuffer = new StringBuffer();
        for (Map.Entry entry : map.entrySet()) {
            stringBuffer.append((String) entry.getKey());
            stringBuffer.append("=\"");
            stringBuffer.append((String) entry.getValue());
            stringBuffer.append("\" ");
        }
        stringBuffer.setLength(stringBuffer.length() - 1);
        return stringBuffer.toString();
    }
}
