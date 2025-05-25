package lib.zj.office.fc.dom4j.dtd;

import androidx.activity.r;

/* loaded from: classes3.dex */
public class ElementDecl {
    private String model;
    private String name;

    public ElementDecl() {
    }

    public String getModel() {
        return this.model;
    }

    public String getName() {
        return this.name;
    }

    public void setModel(String str) {
        this.model = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("<!ELEMENT ");
        sb2.append(this.name);
        sb2.append(" ");
        return r.g(sb2, this.model, ">");
    }

    public ElementDecl(String str, String str2) {
        this.name = str;
        this.model = str2;
    }
}
