package lib.zj.office.thirdpart.emf.io;

import java.io.IOException;
import yi.c;

/* loaded from: classes3.dex */
public class IncompleteTagException extends IOException {
    private static final long serialVersionUID = -7808675150856818588L;
    private byte[] rest;
    private c tag;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public IncompleteTagException(yi.c r4, byte[] r5) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Tag "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r1 = " contains "
            r0.append(r1)
            int r1 = r5.length
            java.lang.String r2 = " unread bytes"
            java.lang.String r0 = a6.h.g(r0, r1, r2)
            r3.<init>(r0)
            r3.tag = r4
            r3.rest = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.office.thirdpart.emf.io.IncompleteTagException.<init>(yi.c, byte[]):void");
    }

    public byte[] getBytes() {
        return this.rest;
    }

    public c getTag() {
        return this.tag;
    }
}
