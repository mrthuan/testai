package o0;

import android.graphics.Path;

/* compiled from: PathParser.java */
/* loaded from: classes.dex */
public final class d {
    public static boolean a(a[] aVarArr, a[] aVarArr2) {
        if (aVarArr == null || aVarArr2 == null || aVarArr.length != aVarArr2.length) {
            return false;
        }
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            a aVar = aVarArr[i10];
            char c = aVar.f22643a;
            a aVar2 = aVarArr2[i10];
            if (c != aVar2.f22643a || aVar.f22644b.length != aVar2.f22644b.length) {
                return false;
            }
        }
        return true;
    }

    public static float[] b(float[] fArr, int i10) {
        if (i10 >= 0) {
            int length = fArr.length;
            if (length >= 0) {
                int i11 = i10 - 0;
                int min = Math.min(i11, length - 0);
                float[] fArr2 = new float[i11];
                System.arraycopy(fArr, 0, fArr2, 0, min);
                return fArr2;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x008a, code lost:
        if (r13 == 0) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0097 A[Catch: NumberFormatException -> 0x00bc, LOOP:3: B:29:0x006c->B:49:0x0097, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00bc, blocks: (B:26:0x0059, B:29:0x006c, B:31:0x0072, B:36:0x0080, B:49:0x0097, B:51:0x009c, B:54:0x00ac, B:56:0x00b1), top: B:71:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009c A[Catch: NumberFormatException -> 0x00bc, TryCatch #0 {NumberFormatException -> 0x00bc, blocks: (B:26:0x0059, B:29:0x006c, B:31:0x0072, B:36:0x0080, B:49:0x0097, B:51:0x009c, B:54:0x00ac, B:56:0x00b1), top: B:71:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ac A[Catch: NumberFormatException -> 0x00bc, TryCatch #0 {NumberFormatException -> 0x00bc, blocks: (B:26:0x0059, B:29:0x006c, B:31:0x0072, B:36:0x0080, B:49:0x0097, B:51:0x009c, B:54:0x00ac, B:56:0x00b1), top: B:71:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0096 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static o0.d.a[] c(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.d.c(java.lang.String):o0.d$a[]");
    }

    public static Path d(String str) {
        Path path = new Path();
        a[] c = c(str);
        if (c != null) {
            try {
                a.b(c, path);
                return path;
            } catch (RuntimeException e10) {
                throw new RuntimeException(a0.a.h("Error in parsing ", str), e10);
            }
        }
        return null;
    }

    public static a[] e(a[] aVarArr) {
        if (aVarArr == null) {
            return null;
        }
        a[] aVarArr2 = new a[aVarArr.length];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            aVarArr2[i10] = new a(aVarArr[i10]);
        }
        return aVarArr2;
    }

    /* compiled from: PathParser.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public char f22643a;

        /* renamed from: b  reason: collision with root package name */
        public final float[] f22644b;

        public a(char c, float[] fArr) {
            this.f22643a = c;
            this.f22644b = fArr;
        }

        public static void a(Path path, float f10, float f11, float f12, float f13, float f14, float f15, float f16, boolean z10, boolean z11) {
            double d10;
            double d11;
            boolean z12;
            double radians = Math.toRadians(f16);
            double cos = Math.cos(radians);
            double sin = Math.sin(radians);
            double d12 = f10;
            double d13 = f11;
            double d14 = (d13 * sin) + (d12 * cos);
            double d15 = d12;
            double d16 = f14;
            double d17 = d14 / d16;
            double d18 = f15;
            double d19 = ((d13 * cos) + ((-f10) * sin)) / d18;
            double d20 = d13;
            double d21 = f13;
            double d22 = ((d21 * sin) + (f12 * cos)) / d16;
            double d23 = ((d21 * cos) + ((-f12) * sin)) / d18;
            double d24 = d17 - d22;
            double d25 = d19 - d23;
            double d26 = (d17 + d22) / 2.0d;
            double d27 = (d19 + d23) / 2.0d;
            double d28 = (d25 * d25) + (d24 * d24);
            if (d28 == 0.0d) {
                return;
            }
            double d29 = (1.0d / d28) - 0.25d;
            if (d29 < 0.0d) {
                float sqrt = (float) (Math.sqrt(d28) / 1.99999d);
                a(path, f10, f11, f12, f13, f14 * sqrt, f15 * sqrt, f16, z10, z11);
                return;
            }
            double sqrt2 = Math.sqrt(d29);
            double d30 = d24 * sqrt2;
            double d31 = sqrt2 * d25;
            if (z10 == z11) {
                d10 = d26 - d31;
                d11 = d27 + d30;
            } else {
                d10 = d26 + d31;
                d11 = d27 - d30;
            }
            double atan2 = Math.atan2(d19 - d11, d17 - d10);
            double atan22 = Math.atan2(d23 - d11, d22 - d10) - atan2;
            int i10 = (atan22 > 0.0d ? 1 : (atan22 == 0.0d ? 0 : -1));
            if (i10 >= 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z11 != z12) {
                if (i10 > 0) {
                    atan22 -= 6.283185307179586d;
                } else {
                    atan22 += 6.283185307179586d;
                }
            }
            double d32 = d10 * d16;
            double d33 = d11 * d18;
            double d34 = (d32 * cos) - (d33 * sin);
            double d35 = (d33 * cos) + (d32 * sin);
            int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
            double cos2 = Math.cos(radians);
            double sin2 = Math.sin(radians);
            double cos3 = Math.cos(atan2);
            double sin3 = Math.sin(atan2);
            double d36 = -d16;
            double d37 = d36 * cos2;
            double d38 = d18 * sin2;
            double d39 = (d37 * sin3) - (d38 * cos3);
            double d40 = d36 * sin2;
            double d41 = d18 * cos2;
            double d42 = (cos3 * d41) + (sin3 * d40);
            double d43 = d41;
            double d44 = atan22 / ceil;
            int i11 = 0;
            while (i11 < ceil) {
                double d45 = atan2 + d44;
                double sin4 = Math.sin(d45);
                double cos4 = Math.cos(d45);
                double d46 = d44;
                double d47 = (((d16 * cos2) * cos4) + d34) - (d38 * sin4);
                double d48 = d43;
                double d49 = d34;
                double d50 = (d48 * sin4) + (d16 * sin2 * cos4) + d35;
                double d51 = (d37 * sin4) - (d38 * cos4);
                double d52 = (cos4 * d48) + (sin4 * d40);
                double d53 = d45 - atan2;
                double tan = Math.tan(d53 / 2.0d);
                double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d53)) / 3.0d;
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) ((d39 * sqrt3) + d15), (float) ((d42 * sqrt3) + d20), (float) (d47 - (sqrt3 * d51)), (float) (d50 - (sqrt3 * d52)), (float) d47, (float) d50);
                i11++;
                atan2 = d45;
                d40 = d40;
                cos2 = cos2;
                ceil = ceil;
                d42 = d52;
                d16 = d16;
                d39 = d51;
                d15 = d47;
                d20 = d50;
                d34 = d49;
                d44 = d46;
                d43 = d48;
            }
        }

        public static void b(a[] aVarArr, Path path) {
            int i10;
            int i11;
            char c;
            a aVar;
            int i12;
            boolean z10;
            boolean z11;
            float f10;
            float f11;
            boolean z12;
            boolean z13;
            float f12;
            float f13;
            float f14;
            float f15;
            float f16;
            float f17;
            float f18;
            float f19;
            float f20;
            float f21;
            float f22;
            float f23;
            float f24;
            float f25;
            float f26;
            float f27;
            float f28;
            float f29;
            float f30;
            a[] aVarArr2 = aVarArr;
            int i13 = 6;
            float[] fArr = new float[6];
            char c10 = 'm';
            int i14 = 0;
            char c11 = 'm';
            int i15 = 0;
            while (i15 < aVarArr2.length) {
                a aVar2 = aVarArr2[i15];
                char c12 = aVar2.f22643a;
                float f31 = fArr[i14];
                float f32 = fArr[1];
                float f33 = fArr[2];
                float f34 = fArr[3];
                float f35 = fArr[4];
                float f36 = fArr[5];
                switch (c12) {
                    case 'A':
                    case 'a':
                        i10 = 7;
                        break;
                    case 'C':
                    case 'c':
                        i10 = i13;
                        break;
                    case 'H':
                    case 'V':
                    case 'h':
                    case 'v':
                        i10 = 1;
                        break;
                    case 'Q':
                    case 'S':
                    case 'q':
                    case 's':
                        i10 = 4;
                        break;
                    case 'Z':
                    case 'z':
                        path.close();
                        path.moveTo(f35, f36);
                        f31 = f35;
                        f33 = f31;
                        f32 = f36;
                        f34 = f32;
                    default:
                        i10 = 2;
                        break;
                }
                float f37 = f35;
                float f38 = f36;
                float f39 = f31;
                float f40 = f32;
                int i16 = i14;
                while (true) {
                    float[] fArr2 = aVar2.f22644b;
                    if (i16 < fArr2.length) {
                        if (c12 != 'A') {
                            if (c12 != 'C') {
                                if (c12 != 'H') {
                                    if (c12 != 'Q') {
                                        if (c12 != 'V') {
                                            if (c12 != 'a') {
                                                if (c12 != 'c') {
                                                    if (c12 != 'h') {
                                                        if (c12 != 'q') {
                                                            if (c12 != 'v') {
                                                                if (c12 != 'L') {
                                                                    if (c12 != 'M') {
                                                                        if (c12 != 'S') {
                                                                            if (c12 != 'T') {
                                                                                if (c12 != 'l') {
                                                                                    if (c12 != c10) {
                                                                                        if (c12 != 's') {
                                                                                            if (c12 == 't') {
                                                                                                if (c11 != 'q' && c11 != 't' && c11 != 'Q' && c11 != 'T') {
                                                                                                    f30 = 0.0f;
                                                                                                    f29 = 0.0f;
                                                                                                } else {
                                                                                                    f29 = f39 - f33;
                                                                                                    f30 = f40 - f34;
                                                                                                }
                                                                                                int i17 = i16 + 0;
                                                                                                int i18 = i16 + 1;
                                                                                                path.rQuadTo(f29, f30, fArr2[i17], fArr2[i18]);
                                                                                                float f41 = f29 + f39;
                                                                                                float f42 = f30 + f40;
                                                                                                f39 += fArr2[i17];
                                                                                                f40 += fArr2[i18];
                                                                                                f34 = f42;
                                                                                                f33 = f41;
                                                                                            }
                                                                                            i11 = i16;
                                                                                        } else {
                                                                                            if (c11 != 'c' && c11 != 's' && c11 != 'C' && c11 != 'S') {
                                                                                                f27 = 0.0f;
                                                                                                f28 = 0.0f;
                                                                                            } else {
                                                                                                float f43 = f39 - f33;
                                                                                                f27 = f40 - f34;
                                                                                                f28 = f43;
                                                                                            }
                                                                                            int i19 = i16 + 0;
                                                                                            int i20 = i16 + 1;
                                                                                            int i21 = i16 + 2;
                                                                                            int i22 = i16 + 3;
                                                                                            i11 = i16;
                                                                                            f12 = f40;
                                                                                            float f44 = f39;
                                                                                            path.rCubicTo(f28, f27, fArr2[i19], fArr2[i20], fArr2[i21], fArr2[i22]);
                                                                                            f13 = fArr2[i19] + f44;
                                                                                            f14 = fArr2[i20] + f12;
                                                                                            f15 = f44 + fArr2[i21];
                                                                                            f16 = fArr2[i22];
                                                                                        }
                                                                                    } else {
                                                                                        i11 = i16;
                                                                                        float f45 = fArr2[i11 + 0];
                                                                                        f39 += f45;
                                                                                        float f46 = fArr2[i11 + 1];
                                                                                        f40 += f46;
                                                                                        if (i11 > 0) {
                                                                                            path.rLineTo(f45, f46);
                                                                                        } else {
                                                                                            path.rMoveTo(f45, f46);
                                                                                            f38 = f40;
                                                                                            f37 = f39;
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    i11 = i16;
                                                                                    f19 = f40;
                                                                                    int i23 = i11 + 0;
                                                                                    float f47 = fArr2[i23];
                                                                                    int i24 = i11 + 1;
                                                                                    path.rLineTo(f47, fArr2[i24]);
                                                                                    f39 += fArr2[i23];
                                                                                    f20 = fArr2[i24];
                                                                                }
                                                                            } else {
                                                                                i11 = i16;
                                                                                float f48 = f40;
                                                                                float f49 = f39;
                                                                                if (c11 != 'q' && c11 != 't' && c11 != 'Q' && c11 != 'T') {
                                                                                    f25 = f49;
                                                                                    f26 = f48;
                                                                                } else {
                                                                                    f25 = (f49 * 2.0f) - f33;
                                                                                    f26 = (f48 * 2.0f) - f34;
                                                                                }
                                                                                int i25 = i11 + 0;
                                                                                int i26 = i11 + 1;
                                                                                path.quadTo(f25, f26, fArr2[i25], fArr2[i26]);
                                                                                f34 = f26;
                                                                                f33 = f25;
                                                                                c = c12;
                                                                                aVar = aVar2;
                                                                                i12 = i15;
                                                                                f39 = fArr2[i25];
                                                                                f40 = fArr2[i26];
                                                                            }
                                                                        } else {
                                                                            i11 = i16;
                                                                            float f50 = f40;
                                                                            float f51 = f39;
                                                                            if (c11 != 'c' && c11 != 's' && c11 != 'C' && c11 != 'S') {
                                                                                f24 = f51;
                                                                                f23 = f50;
                                                                            } else {
                                                                                f23 = (f50 * 2.0f) - f34;
                                                                                f24 = (f51 * 2.0f) - f33;
                                                                            }
                                                                            int i27 = i11 + 0;
                                                                            int i28 = i11 + 1;
                                                                            int i29 = i11 + 2;
                                                                            int i30 = i11 + 3;
                                                                            path.cubicTo(f24, f23, fArr2[i27], fArr2[i28], fArr2[i29], fArr2[i30]);
                                                                            float f52 = fArr2[i27];
                                                                            float f53 = fArr2[i28];
                                                                            f18 = fArr2[i29];
                                                                            f17 = fArr2[i30];
                                                                            f33 = f52;
                                                                            f34 = f53;
                                                                            f39 = f18;
                                                                            f40 = f17;
                                                                        }
                                                                    } else {
                                                                        i11 = i16;
                                                                        f21 = fArr2[i11 + 0];
                                                                        f22 = fArr2[i11 + 1];
                                                                        if (i11 > 0) {
                                                                            path.lineTo(f21, f22);
                                                                        } else {
                                                                            path.moveTo(f21, f22);
                                                                            f37 = f21;
                                                                            f38 = f22;
                                                                        }
                                                                    }
                                                                    f39 = f37;
                                                                    f40 = f38;
                                                                } else {
                                                                    i11 = i16;
                                                                    int i31 = i11 + 0;
                                                                    int i32 = i11 + 1;
                                                                    path.lineTo(fArr2[i31], fArr2[i32]);
                                                                    f21 = fArr2[i31];
                                                                    f22 = fArr2[i32];
                                                                }
                                                                f39 = f21;
                                                                f40 = f22;
                                                            } else {
                                                                i11 = i16;
                                                                f19 = f40;
                                                                int i33 = i11 + 0;
                                                                path.rLineTo(0.0f, fArr2[i33]);
                                                                f20 = fArr2[i33];
                                                            }
                                                            f40 = f19 + f20;
                                                        } else {
                                                            i11 = i16;
                                                            f12 = f40;
                                                            float f54 = f39;
                                                            int i34 = i11 + 0;
                                                            float f55 = fArr2[i34];
                                                            int i35 = i11 + 1;
                                                            int i36 = i11 + 2;
                                                            int i37 = i11 + 3;
                                                            path.rQuadTo(f55, fArr2[i35], fArr2[i36], fArr2[i37]);
                                                            f13 = fArr2[i34] + f54;
                                                            f14 = fArr2[i35] + f12;
                                                            float f56 = f54 + fArr2[i36];
                                                            float f57 = fArr2[i37];
                                                            f15 = f56;
                                                            f16 = f57;
                                                        }
                                                    } else {
                                                        i11 = i16;
                                                        int i38 = i11 + 0;
                                                        path.rLineTo(fArr2[i38], 0.0f);
                                                        f39 += fArr2[i38];
                                                    }
                                                    c = c12;
                                                    aVar = aVar2;
                                                    i12 = i15;
                                                } else {
                                                    i11 = i16;
                                                    f12 = f40;
                                                    float f58 = f39;
                                                    int i39 = i11 + 2;
                                                    int i40 = i11 + 3;
                                                    int i41 = i11 + 4;
                                                    int i42 = i11 + 5;
                                                    path.rCubicTo(fArr2[i11 + 0], fArr2[i11 + 1], fArr2[i39], fArr2[i40], fArr2[i41], fArr2[i42]);
                                                    f13 = fArr2[i39] + f58;
                                                    f14 = fArr2[i40] + f12;
                                                    f15 = f58 + fArr2[i41];
                                                    f16 = fArr2[i42];
                                                }
                                                f17 = f12 + f16;
                                                f33 = f13;
                                                f34 = f14;
                                                f18 = f15;
                                                f39 = f18;
                                                f40 = f17;
                                                c = c12;
                                                aVar = aVar2;
                                                i12 = i15;
                                            } else {
                                                i11 = i16;
                                                float f59 = f40;
                                                float f60 = f39;
                                                int i43 = i11 + 5;
                                                float f61 = fArr2[i43] + f60;
                                                int i44 = i11 + 6;
                                                float f62 = fArr2[i44] + f59;
                                                float f63 = fArr2[i11 + 0];
                                                float f64 = fArr2[i11 + 1];
                                                float f65 = fArr2[i11 + 2];
                                                if (fArr2[i11 + 3] != 0.0f) {
                                                    z12 = true;
                                                } else {
                                                    z12 = false;
                                                }
                                                if (fArr2[i11 + 4] != 0.0f) {
                                                    z13 = true;
                                                } else {
                                                    z13 = false;
                                                }
                                                c = c12;
                                                aVar = aVar2;
                                                i12 = i15;
                                                a(path, f60, f59, f61, f62, f63, f64, f65, z12, z13);
                                                f39 = f60 + fArr2[i43];
                                                f40 = f59 + fArr2[i44];
                                            }
                                        } else {
                                            i11 = i16;
                                            c = c12;
                                            aVar = aVar2;
                                            i12 = i15;
                                            int i45 = i11 + 0;
                                            path.lineTo(f39, fArr2[i45]);
                                            f40 = fArr2[i45];
                                        }
                                    } else {
                                        i11 = i16;
                                        c = c12;
                                        aVar = aVar2;
                                        i12 = i15;
                                        int i46 = i11 + 0;
                                        int i47 = i11 + 1;
                                        int i48 = i11 + 2;
                                        int i49 = i11 + 3;
                                        path.quadTo(fArr2[i46], fArr2[i47], fArr2[i48], fArr2[i49]);
                                        f10 = fArr2[i46];
                                        f11 = fArr2[i47];
                                        f39 = fArr2[i48];
                                        f40 = fArr2[i49];
                                    }
                                } else {
                                    i11 = i16;
                                    c = c12;
                                    aVar = aVar2;
                                    i12 = i15;
                                    int i50 = i11 + 0;
                                    path.lineTo(fArr2[i50], f40);
                                    f39 = fArr2[i50];
                                }
                                i16 = i11 + i10;
                                aVar2 = aVar;
                                c11 = c;
                                c12 = c11;
                                i15 = i12;
                                c10 = 'm';
                                i14 = 0;
                            } else {
                                i11 = i16;
                                c = c12;
                                aVar = aVar2;
                                i12 = i15;
                                int i51 = i11 + 2;
                                int i52 = i11 + 3;
                                int i53 = i11 + 4;
                                int i54 = i11 + 5;
                                path.cubicTo(fArr2[i11 + 0], fArr2[i11 + 1], fArr2[i51], fArr2[i52], fArr2[i53], fArr2[i54]);
                                float f66 = fArr2[i53];
                                float f67 = fArr2[i54];
                                f10 = fArr2[i51];
                                f39 = f66;
                                f40 = f67;
                                f11 = fArr2[i52];
                            }
                            f33 = f10;
                            f34 = f11;
                            i16 = i11 + i10;
                            aVar2 = aVar;
                            c11 = c;
                            c12 = c11;
                            i15 = i12;
                            c10 = 'm';
                            i14 = 0;
                        } else {
                            i11 = i16;
                            float f68 = f40;
                            float f69 = f39;
                            c = c12;
                            aVar = aVar2;
                            i12 = i15;
                            int i55 = i11 + 5;
                            float f70 = fArr2[i55];
                            int i56 = i11 + 6;
                            float f71 = fArr2[i56];
                            float f72 = fArr2[i11 + 0];
                            float f73 = fArr2[i11 + 1];
                            float f74 = fArr2[i11 + 2];
                            if (fArr2[i11 + 3] != 0.0f) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (fArr2[i11 + 4] != 0.0f) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            a(path, f69, f68, f70, f71, f72, f73, f74, z10, z11);
                            f39 = fArr2[i55];
                            f40 = fArr2[i56];
                        }
                        f34 = f40;
                        f33 = f39;
                        i16 = i11 + i10;
                        aVar2 = aVar;
                        c11 = c;
                        c12 = c11;
                        i15 = i12;
                        c10 = 'm';
                        i14 = 0;
                    }
                }
                int i57 = i15;
                int i58 = i14;
                fArr[i58] = f39;
                fArr[1] = f40;
                fArr[2] = f33;
                fArr[3] = f34;
                fArr[4] = f37;
                fArr[5] = f38;
                i15 = i57 + 1;
                i13 = 6;
                c10 = 'm';
                i14 = i58;
                c11 = aVarArr[i57].f22643a;
                aVarArr2 = aVarArr;
            }
        }

        public a(a aVar) {
            this.f22643a = aVar.f22643a;
            float[] fArr = aVar.f22644b;
            this.f22644b = d.b(fArr, fArr.length);
        }
    }
}
