package xi;

/* compiled from: TextA.java */
/* loaded from: classes3.dex */
public final class g2 extends f2 {
    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        int i10 = 0;
        while (true) {
            String str = this.f31703b;
            if (i10 < str.length()) {
                stringBuffer.append(",");
                stringBuffer.append(this.f31705e[i10]);
                i10++;
            } else {
                stringBuffer.append(']');
                stringBuffer.setCharAt(0, '[');
                return "  TextA\n    pos: " + this.f31702a + "\n    options: " + this.c + "\n    bounds: " + this.f31704d + "\n    string: " + str + "\n    widths: " + ((Object) stringBuffer);
            }
        }
    }
}
