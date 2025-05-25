package lib.zj.office.fc.hpsf;

/* loaded from: classes3.dex */
public abstract class UnsupportedVariantTypeException extends VariantTypeException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public UnsupportedVariantTypeException(long r3, java.lang.Object r5) {
        /*
            r2 = this;
            java.lang.String r0 = "HPSF does not yet support the variant type "
            java.lang.String r1 = " ("
            java.lang.StringBuilder r0 = androidx.activity.r.h(r0, r3, r1)
            java.lang.String r1 = lib.zj.office.fc.hpsf.Variant.getVariantName(r3)
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            java.lang.String r1 = lib.zj.office.fc.util.HexDump.toHex(r3)
            r0.append(r1)
            java.lang.String r1 = "). If you want support for this variant type in one of the next POI releases please submit a request for enhancement (RFE) to <http://issues.apache.org/bugzilla/>! Thank you!"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.<init>(r3, r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.office.fc.hpsf.UnsupportedVariantTypeException.<init>(long, java.lang.Object):void");
    }
}
