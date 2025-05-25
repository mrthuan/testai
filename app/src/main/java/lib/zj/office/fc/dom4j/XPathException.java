package lib.zj.office.fc.dom4j;

import a0.a;
import androidx.appcompat.view.menu.d;

/* loaded from: classes3.dex */
public class XPathException extends RuntimeException {
    private String xpath;

    public XPathException(String str) {
        super(a.h("Exception occurred evaluting XPath: ", str));
        this.xpath = str;
    }

    public String getXPath() {
        return this.xpath;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public XPathException(java.lang.String r3, java.lang.Exception r4) {
        /*
            r2 = this;
            java.lang.String r0 = "Exception occurred evaluting XPath: "
            java.lang.String r1 = ". Exception: "
            java.lang.StringBuilder r0 = b.a.g(r0, r3, r1)
            java.lang.String r4 = r4.getMessage()
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r2.<init>(r4)
            r2.xpath = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.office.fc.dom4j.XPathException.<init>(java.lang.String, java.lang.Exception):void");
    }

    public XPathException(String str, String str2) {
        super(d.d("Exception occurred evaluting XPath: ", str, " ", str2));
        this.xpath = str;
    }
}
