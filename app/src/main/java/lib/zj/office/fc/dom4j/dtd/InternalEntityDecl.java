package lib.zj.office.fc.dom4j.dtd;

/* loaded from: classes3.dex */
public class InternalEntityDecl {
    private String name;
    private String value;

    public InternalEntityDecl() {
    }

    private String escapeEntityValue(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (charAt != '\"') {
                if (charAt != '<') {
                    if (charAt != '>') {
                        if (charAt != '&') {
                            if (charAt != '\'') {
                                if (charAt < ' ') {
                                    stringBuffer.append("&#" + ((int) charAt) + ";");
                                } else {
                                    stringBuffer.append(charAt);
                                }
                            } else {
                                stringBuffer.append("&#39;");
                            }
                        } else {
                            stringBuffer.append("&#38;#38;");
                        }
                    } else {
                        stringBuffer.append("&#62;");
                    }
                } else {
                    stringBuffer.append("&#38;#60;");
                }
            } else {
                stringBuffer.append("&#34;");
            }
        }
        return stringBuffer.toString();
    }

    public String getName() {
        return this.name;
    }

    public String getValue() {
        return this.value;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setValue(String str) {
        this.value = str;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("<!ENTITY ");
        if (this.name.startsWith("%")) {
            stringBuffer.append("% ");
            stringBuffer.append(this.name.substring(1));
        } else {
            stringBuffer.append(this.name);
        }
        stringBuffer.append(" \"");
        stringBuffer.append(escapeEntityValue(this.value));
        stringBuffer.append("\">");
        return stringBuffer.toString();
    }

    public InternalEntityDecl(String str, String str2) {
        this.name = str;
        this.value = str2;
    }
}
