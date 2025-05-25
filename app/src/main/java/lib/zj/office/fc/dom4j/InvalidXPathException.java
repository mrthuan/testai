package lib.zj.office.fc.dom4j;

import a0.a;
import androidx.appcompat.view.menu.d;

/* loaded from: classes3.dex */
public class InvalidXPathException extends IllegalArgumentException {
    private static final long serialVersionUID = 3257009869058881592L;

    public InvalidXPathException(String str) {
        super(a.h("Invalid XPath expression: ", str));
    }

    public InvalidXPathException(String str, String str2) {
        super(d.d("Invalid XPath expression: ", str, " ", str2));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public InvalidXPathException(java.lang.String r3, java.lang.Throwable r4) {
        /*
            r2 = this;
            java.lang.String r0 = "Invalid XPath expression: '"
            java.lang.String r1 = "'. Caused by: "
            java.lang.StringBuilder r3 = b.a.g(r0, r3, r1)
            java.lang.String r4 = r4.getMessage()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.office.fc.dom4j.InvalidXPathException.<init>(java.lang.String, java.lang.Throwable):void");
    }
}
