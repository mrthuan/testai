package vi;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;

/* compiled from: MathHelper.java */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final NumberFormat f30820a = NumberFormat.getNumberInstance();

    public static ArrayList a(double d10, double d11, int i10) {
        double d12;
        double d13;
        boolean z10;
        double[] dArr;
        NumberFormat numberFormat = f30820a;
        numberFormat.setMaximumFractionDigits(5);
        ArrayList arrayList = new ArrayList();
        if (Math.abs(d10 - d11) < 1.0000000116860974E-7d) {
            double b10 = b(d10 / i10);
            dArr = new double[]{b10, Math.ceil(d11 / b10) * b10, b10};
        } else {
            if (d10 > d11) {
                d13 = d10;
                d12 = d11;
                z10 = true;
            } else {
                d12 = d10;
                d13 = d11;
                z10 = false;
            }
            double b11 = b(Math.abs(d12 - d13) / i10);
            double floor = Math.floor(d12 / b11) * b11;
            double ceil = Math.ceil(d13 / b11) * b11;
            dArr = new double[3];
            if (z10) {
                dArr[0] = ceil;
                dArr[1] = floor;
                dArr[2] = b11 * (-1.0d);
            } else {
                dArr[0] = floor;
                dArr[1] = ceil;
                dArr[2] = b11;
            }
        }
        int i11 = ((int) ((dArr[1] - dArr[0]) / dArr[2])) + 1;
        for (int i12 = 0; i12 < i11; i12++) {
            double d14 = (i12 * dArr[2]) + dArr[0];
            try {
                d14 = numberFormat.parse(numberFormat.format(d14)).doubleValue();
            } catch (ParseException unused) {
            }
            arrayList.add(Double.valueOf(d14));
        }
        return arrayList;
    }

    public static double b(double d10) {
        int floor = (int) Math.floor(Math.log10(d10));
        double pow = Math.pow(10.0d, -floor) * d10;
        if (pow > 5.0d) {
            pow = 10.0d;
        } else if (pow > 2.0d) {
            pow = 5.0d;
        } else if (pow > 1.0d) {
            pow = 2.0d;
        }
        return Math.pow(10.0d, floor) * pow;
    }
}
