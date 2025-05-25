package lib.zj.office.fc.dom4j.dtd;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;

/* loaded from: classes3.dex */
public class AttributeDecl {
    private String attributeName;
    private String elementName;
    private String type;
    private String value;
    private String valueDefault;

    public AttributeDecl() {
    }

    public String getAttributeName() {
        return this.attributeName;
    }

    public String getElementName() {
        return this.elementName;
    }

    public String getType() {
        return this.type;
    }

    public String getValue() {
        return this.value;
    }

    public String getValueDefault() {
        return this.valueDefault;
    }

    public void setAttributeName(String str) {
        this.attributeName = str;
    }

    public void setElementName(String str) {
        this.elementName = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setValue(String str) {
        this.value = str;
    }

    public void setValueDefault(String str) {
        this.valueDefault = str;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("<!ATTLIST ");
        stringBuffer.append(this.elementName);
        stringBuffer.append(" ");
        stringBuffer.append(this.attributeName);
        stringBuffer.append(" ");
        stringBuffer.append(this.type);
        stringBuffer.append(" ");
        String str = this.valueDefault;
        if (str != null) {
            stringBuffer.append(str);
            if (this.valueDefault.equals("#FIXED")) {
                stringBuffer.append(" \"");
                stringBuffer.append(this.value);
                stringBuffer.append(OperatorName.SHOW_TEXT_LINE_AND_SPACE);
            }
        } else {
            stringBuffer.append(OperatorName.SHOW_TEXT_LINE_AND_SPACE);
            stringBuffer.append(this.value);
            stringBuffer.append(OperatorName.SHOW_TEXT_LINE_AND_SPACE);
        }
        stringBuffer.append(">");
        return stringBuffer.toString();
    }

    public AttributeDecl(String str, String str2, String str3, String str4, String str5) {
        this.elementName = str;
        this.attributeName = str2;
        this.type = str3;
        this.value = str5;
        this.valueDefault = str4;
    }
}
