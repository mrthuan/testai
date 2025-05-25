package o3;

import android.graphics.Color;
import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.util.ArrayList;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

/* compiled from: GradientColorParser.java */
/* loaded from: classes.dex */
public final class j implements d0<l3.c> {

    /* renamed from: a  reason: collision with root package name */
    public int f22712a;

    public j(int i10) {
        this.f22712a = i10;
    }

    @Override // o3.d0
    public final l3.c g(JsonReader jsonReader, float f10) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        ArrayList arrayList = new ArrayList();
        int i13 = 1;
        int i14 = 0;
        if (jsonReader.m() == JsonReader.Token.BEGIN_ARRAY) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            jsonReader.a();
        }
        while (jsonReader.h()) {
            arrayList.add(Float.valueOf((float) jsonReader.j()));
        }
        if (z10) {
            jsonReader.c();
        }
        if (this.f22712a == -1) {
            this.f22712a = arrayList.size() / 4;
        }
        int i15 = this.f22712a;
        float[] fArr = new float[i15];
        int[] iArr = new int[i15];
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            i10 = this.f22712a * 4;
            if (i16 >= i10) {
                break;
            }
            int i19 = i16 / 4;
            double floatValue = ((Float) arrayList.get(i16)).floatValue();
            int i20 = i16 % 4;
            if (i20 != 0) {
                if (i20 != 1) {
                    if (i20 != 2) {
                        if (i20 == 3) {
                            iArr[i19] = Color.argb((int) FunctionEval.FunctionID.EXTERNAL_FUNC, i17, i18, (int) (floatValue * 255.0d));
                        }
                    } else {
                        i18 = (int) (floatValue * 255.0d);
                    }
                } else {
                    i17 = (int) (floatValue * 255.0d);
                }
            } else {
                fArr[i19] = (float) floatValue;
            }
            i16++;
        }
        l3.c cVar = new l3.c(fArr, iArr);
        if (arrayList.size() > i10) {
            int size = (arrayList.size() - i10) / 2;
            double[] dArr = new double[size];
            double[] dArr2 = new double[size];
            int i21 = 0;
            while (i10 < arrayList.size()) {
                if (i10 % 2 == 0) {
                    dArr[i21] = ((Float) arrayList.get(i10)).floatValue();
                } else {
                    dArr2[i21] = ((Float) arrayList.get(i10)).floatValue();
                    i21++;
                }
                i10++;
            }
            while (true) {
                int[] iArr2 = cVar.f20451b;
                if (i14 >= iArr2.length) {
                    break;
                }
                int i22 = iArr2[i14];
                double d10 = cVar.f20450a[i14];
                int i23 = i13;
                while (true) {
                    if (i23 < size) {
                        int i24 = i23 - 1;
                        double d11 = dArr[i24];
                        double d12 = dArr[i23];
                        if (d12 >= d10) {
                            PointF pointF = p3.f.f23678a;
                            i11 = i14;
                            double max = Math.max(0.0d, Math.min(1.0d, (d10 - d11) / (d12 - d11)));
                            double d13 = dArr2[i24];
                            i12 = (int) ((((dArr2[i23] - d13) * max) + d13) * 255.0d);
                            break;
                        }
                        i23++;
                    } else {
                        i11 = i14;
                        i12 = (int) (dArr2[size - 1] * 255.0d);
                        break;
                    }
                }
                iArr2[i11] = Color.argb(i12, Color.red(i22), Color.green(i22), Color.blue(i22));
                i14 = i11 + 1;
                i13 = 1;
            }
        }
        return cVar;
    }
}
