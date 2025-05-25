package lib.zj.office.java.awt.geom;

import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary;
import java.io.PrintStream;
import java.util.Vector;
import lib.zj.office.java.awt.geom.Rectangle2D;

/* compiled from: Curve.java */
/* loaded from: classes3.dex */
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public final int f20754a;

    public e(int i10) {
        this.f20754a = i10;
    }

    public static boolean h(double d10, double d11) {
        if (Math.abs(d10 - d11) < Math.max(Math.abs(d10), Math.abs(d11)) * 1.0E-10d) {
            return true;
        }
        return false;
    }

    public static void w(Vector vector, double d10, double d11, double d12, double d13) {
        if (d11 < d13) {
            vector.add(new m(d10, d11, d12, d13, 1));
        } else if (d11 > d13) {
            vector.add(new m(d12, d13, d10, d11, -1));
        }
    }

    public abstract double a(double d10);

    public abstract double b(double d10);

    public abstract double c(double d10);

    public abstract double d(double d10);

    public int e(e eVar, double[] dArr) {
        double d10;
        double d11;
        double d12;
        double d13;
        e eVar2 = this;
        double d14 = dArr[0];
        double min = Math.min(Math.min(dArr[1], u()), eVar.u());
        String str = "=>";
        if (min > dArr[0]) {
            dArr[1] = min;
            if (p() <= eVar.q()) {
                if (q() == eVar.p()) {
                    return 0;
                }
                return -1;
            } else if (q() >= eVar.p()) {
                return 1;
            } else {
                double a10 = eVar2.a(d14);
                double d15 = eVar2.d(a10);
                if (d15 < d14) {
                    a10 = eVar2.y(a10, d14);
                    d15 = eVar2.d(a10);
                }
                double a11 = eVar2.a(min);
                if (eVar2.d(a11) < d14) {
                    eVar2.d(a11);
                    a11 = eVar2.y(a11, d14);
                }
                double d16 = a11;
                double a12 = eVar.a(d14);
                double d17 = eVar.d(a12);
                if (d17 < d14) {
                    a12 = eVar.y(a12, d14);
                    d17 = eVar.d(a12);
                }
                double d18 = d15;
                double a13 = eVar.a(min);
                if (eVar.d(a13) < d14) {
                    eVar.d(a13);
                    a13 = eVar.y(a13, d14);
                }
                double d19 = a13;
                double b10 = eVar2.b(a10);
                double d20 = a10;
                double b11 = eVar.b(a12);
                double d21 = a12;
                double d22 = d16;
                double max = Math.max(Math.max(Math.abs(d14), Math.abs(min)) * 1.0E-14d, 1.0E-300d);
                if (h(b10, b11)) {
                    d10 = b11;
                    double min2 = Math.min(1.0E13d * max, (min - d14) * 0.1d);
                    double d23 = d14 + max;
                    double d24 = max;
                    while (true) {
                        if (d23 <= min) {
                            d11 = b10;
                            d12 = max;
                            if (h(eVar2.c(d23), eVar.c(d23))) {
                                d24 *= 2.0d;
                                if (d24 > min2) {
                                    d24 = min2;
                                }
                                d23 += d24;
                                b10 = d11;
                                max = d12;
                            } else {
                                d23 -= d24;
                                while (true) {
                                    d24 /= 2.0d;
                                    double d25 = d23 + d24;
                                    if (d25 <= d23) {
                                        break;
                                    } else if (h(eVar2.c(d25), eVar.c(d25))) {
                                        d23 = d25;
                                    }
                                }
                            }
                        } else {
                            d11 = b10;
                            d12 = max;
                            break;
                        }
                    }
                    if (d23 > d14) {
                        if (d23 < min) {
                            dArr[1] = d23;
                        }
                        return 0;
                    }
                } else {
                    d10 = b11;
                    d11 = b10;
                    d12 = max;
                }
                if (d12 <= 0.0d) {
                    PrintStream printStream = System.out;
                    StringBuilder sb2 = new StringBuilder("ymin = ");
                    d13 = d12;
                    sb2.append(d13);
                    printStream.println(sb2.toString());
                } else {
                    d13 = d12;
                }
                double d26 = d17;
                double d27 = d18;
                double d28 = d20;
                double d29 = d21;
                double d30 = d11;
                while (true) {
                    if (d28 >= d22 || d29 >= d19) {
                        break;
                    }
                    double d31 = d27;
                    double d32 = d22;
                    double x4 = eVar2.x(d28, d32);
                    double b12 = eVar2.b(x4);
                    double d33 = d28;
                    double d34 = eVar2.d(x4);
                    double d35 = d19;
                    String str2 = str;
                    double x10 = eVar.x(d29, d35);
                    double b13 = eVar.b(x10);
                    double d36 = d29;
                    double d37 = eVar.d(x10);
                    double d38 = d26;
                    double d39 = d13;
                    try {
                        if (i(eVar, dArr, d13, 0, 0, d33, d30, d31, x4, b12, d34, d36, d10, d38, x10, b13, d37)) {
                            break;
                        } else if (d34 < d37) {
                            if (d34 > dArr[0]) {
                                if (d34 < dArr[1]) {
                                    dArr[1] = d34;
                                }
                            } else {
                                d27 = d34;
                                d30 = b12;
                                d26 = d38;
                                d29 = d36;
                                d28 = x4;
                                eVar2 = this;
                                d19 = d35;
                                d22 = d32;
                                d13 = d39;
                                str = str2;
                            }
                        } else if (d37 > dArr[0]) {
                            if (d37 < dArr[1]) {
                                dArr[1] = d37;
                            }
                        } else {
                            d26 = d37;
                            d10 = b13;
                            d27 = d31;
                            d28 = d33;
                            d29 = x10;
                            eVar2 = this;
                            d19 = d35;
                            d22 = d32;
                            d13 = d39;
                            str = str2;
                        }
                    } catch (Throwable th2) {
                        PrintStream printStream2 = System.err;
                        printStream2.println("Error: " + th2);
                        PrintStream printStream3 = System.err;
                        printStream3.println("y range was " + dArr[0] + str2 + dArr[1]);
                        PrintStream printStream4 = System.err;
                        printStream4.println("s y range is " + d31 + str2 + d34);
                        PrintStream printStream5 = System.err;
                        printStream5.println("t y range is " + d38 + str2 + d37);
                        PrintStream printStream6 = System.err;
                        StringBuilder sb3 = new StringBuilder("ymin is ");
                        sb3.append(d39);
                        printStream6.println(sb3.toString());
                        return 0;
                    }
                }
                double d40 = (dArr[0] + dArr[1]) / 2.0d;
                double c = c(d40);
                double c10 = eVar.c(d40);
                if (c < c10) {
                    return -1;
                }
                if (c <= c10) {
                    return 0;
                }
                return 1;
            }
        }
        PrintStream printStream7 = System.err;
        printStream7.println("this == " + eVar2);
        PrintStream printStream8 = System.err;
        printStream8.println("that == " + eVar);
        PrintStream printStream9 = System.out;
        printStream9.println("target range = " + dArr[0] + "=>" + dArr[1]);
        throw new InternalError("backstepping from " + dArr[0] + " to " + min);
    }

    public String f() {
        return "";
    }

    public abstract void g(Rectangle2D.Double r12);

    public final boolean i(e eVar, double[] dArr, double d10, int i10, int i11, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18, double d19, double d20, double d21, double d22) {
        double d23;
        double d24;
        double d25;
        if (d13 > d22 || d19 > d16) {
            return false;
        }
        if (Math.min(d12, d15) > Math.max(d18, d21) || Math.max(d12, d15) < Math.min(d18, d21)) {
            return false;
        }
        double d26 = d14 - d11;
        if (d26 > 0.001d) {
            double d27 = (d11 + d14) / 2.0d;
            double b10 = b(d27);
            double d28 = d(d27);
            if (d27 == d11 || d27 == d14) {
                PrintStream printStream = System.out;
                printStream.println("s0 = " + d11);
                PrintStream printStream2 = System.out;
                printStream2.println("s1 = " + d14);
                throw new InternalError("no s progress!");
            } else if (d20 - d17 > 0.001d) {
                double d29 = (d17 + d20) / 2.0d;
                double b11 = eVar.b(d29);
                double d30 = eVar.d(d29);
                if (d29 != d17 && d29 != d20) {
                    if (d28 < d19 || d30 < d13) {
                        d24 = d27;
                        d25 = d29;
                    } else {
                        d24 = d27;
                        d25 = d29;
                        if (i(eVar, dArr, d10, i10 + 1, i11 + 1, d11, d12, d13, d24, b10, d28, d17, d18, d19, d25, b11, d30)) {
                            return true;
                        }
                    }
                    if (d28 >= d30 && i(eVar, dArr, d10, i10 + 1, i11 + 1, d11, d12, d13, d24, b10, d28, d25, b11, d30, d20, d21, d22)) {
                        return true;
                    }
                    if (d30 >= d28 && i(eVar, dArr, d10, i10 + 1, i11 + 1, d24, b10, d28, d14, d15, d16, d17, d18, d19, d25, b11, d30)) {
                        return true;
                    }
                    if (d16 >= d30 && d22 >= d28) {
                        if (i(eVar, dArr, d10, i10 + 1, i11 + 1, d24, b10, d28, d14, d15, d16, d25, b11, d30, d20, d21, d22)) {
                            return true;
                        }
                    }
                } else {
                    PrintStream printStream3 = System.out;
                    printStream3.println("t0 = " + d17);
                    PrintStream printStream4 = System.out;
                    printStream4.println("t1 = " + d20);
                    throw new InternalError("no t progress!");
                }
            } else if (d28 >= d19 && i(eVar, dArr, d10, i10 + 1, i11, d11, d12, d13, d27, b10, d28, d17, d18, d19, d20, d21, d22)) {
                return true;
            } else {
                if (d22 >= d28 && i(eVar, dArr, d10, i10 + 1, i11, d27, b10, d28, d14, d15, d16, d17, d18, d19, d20, d21, d22)) {
                    return true;
                }
            }
        } else {
            double d31 = d20 - d17;
            if (d31 > 0.001d) {
                double d32 = (d17 + d20) / 2.0d;
                double b12 = eVar.b(d32);
                double d33 = eVar.d(d32);
                if (d32 != d17 && d32 != d20) {
                    if (d33 >= d13) {
                        d23 = d32;
                        if (i(eVar, dArr, d10, i10, i11 + 1, d11, d12, d13, d14, d15, d16, d17, d18, d19, d23, b12, d33)) {
                            return true;
                        }
                    } else {
                        d23 = d32;
                    }
                    if (d16 >= d33 && i(eVar, dArr, d10, i10, i11 + 1, d11, d12, d13, d14, d15, d16, d23, b12, d33, d20, d21, d22)) {
                        return true;
                    }
                } else {
                    PrintStream printStream5 = System.out;
                    printStream5.println("t0 = " + d17);
                    PrintStream printStream6 = System.out;
                    printStream6.println("t1 = " + d20);
                    throw new InternalError("no t progress!");
                }
            } else {
                double d34 = d15 - d12;
                double d35 = d16 - d13;
                double d36 = d21 - d18;
                double d37 = d22 - d19;
                double d38 = d18 - d12;
                double d39 = d19 - d13;
                double d40 = (d36 * d35) - (d37 * d34);
                if (d40 != 0.0d) {
                    double d41 = 1.0d / d40;
                    double d42 = ((d36 * d39) - (d37 * d38)) * d41;
                    double d43 = ((d34 * d39) - (d35 * d38)) * d41;
                    if (d42 >= 0.0d && d42 <= 1.0d && d43 >= 0.0d && d43 <= 1.0d) {
                        double d44 = (d42 * d26) + d11;
                        double d45 = (d43 * d31) + d17;
                        if (d44 < 0.0d || d44 > 1.0d || d45 < 0.0d || d45 > 1.0d) {
                            System.out.println("Uh oh!");
                        }
                        double d46 = (eVar.d(d45) + d(d44)) / 2.0d;
                        if (d46 <= dArr[1] && d46 > dArr[0]) {
                            dArr[1] = d46;
                            return true;
                        }
                        return false;
                    }
                }
            }
        }
        return false;
    }

    public abstract int j();

    public abstract e k();

    public abstract int l(double[] dArr);

    public abstract e m(double d10, double d11, int i10);

    public abstract double n();

    public abstract double o();

    public abstract double p();

    public abstract double q();

    public abstract double r();

    public abstract double s();

    public abstract double t();

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Curve[");
        sb2.append(j());
        sb2.append(", (");
        sb2.append(n());
        sb2.append(", ");
        sb2.append(s());
        sb2.append("), ");
        sb2.append(f());
        sb2.append("(");
        sb2.append(o());
        sb2.append(", ");
        sb2.append(t());
        sb2.append("), ");
        if (this.f20754a == 1) {
            str = "D";
        } else {
            str = PDBorderStyleDictionary.STYLE_UNDERLINE;
        }
        return androidx.activity.r.g(sb2, str, "]");
    }

    public abstract double u();

    public abstract double v();

    public abstract double x(double d10, double d11);

    public final double y(double d10, double d11) {
        double d12 = 1.0d;
        while (true) {
            double d13 = (d10 + d12) / 2.0d;
            if (d13 != d10 && d13 != d12) {
                double d14 = d(d13);
                if (d14 < d11) {
                    d10 = d13;
                } else if (d14 <= d11) {
                    break;
                } else {
                    d12 = d13;
                }
            } else {
                break;
            }
        }
        return d12;
    }
}
