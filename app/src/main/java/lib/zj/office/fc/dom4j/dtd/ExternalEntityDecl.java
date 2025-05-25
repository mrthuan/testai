package lib.zj.office.fc.dom4j.dtd;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;

/* loaded from: classes3.dex */
public class ExternalEntityDecl {
    private String name;
    private String publicID;
    private String systemID;

    public ExternalEntityDecl() {
    }

    public String getName() {
        return this.name;
    }

    public String getPublicID() {
        return this.publicID;
    }

    public String getSystemID() {
        return this.systemID;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPublicID(String str) {
        this.publicID = str;
    }

    public void setSystemID(String str) {
        this.systemID = str;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("<!ENTITY ");
        if (this.name.startsWith("%")) {
            stringBuffer.append("% ");
            stringBuffer.append(this.name.substring(1));
        } else {
            stringBuffer.append(this.name);
        }
        if (this.publicID != null) {
            stringBuffer.append(" PUBLIC \"");
            stringBuffer.append(this.publicID);
            stringBuffer.append("\" ");
            if (this.systemID != null) {
                stringBuffer.append(OperatorName.SHOW_TEXT_LINE_AND_SPACE);
                stringBuffer.append(this.systemID);
                stringBuffer.append("\" ");
            }
        } else if (this.systemID != null) {
            stringBuffer.append(" SYSTEM \"");
            stringBuffer.append(this.systemID);
            stringBuffer.append("\" ");
        }
        stringBuffer.append(">");
        return stringBuffer.toString();
    }

    public ExternalEntityDecl(String str, String str2, String str3) {
        this.name = str;
        this.publicID = str2;
        this.systemID = str3;
    }
}
