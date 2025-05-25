package zg;

import android.graphics.Path;
import android.graphics.Rect;
import lh.e;
import sg.e;

/* compiled from: MathPathBuilder.java */
/* loaded from: classes.dex */
public final class a {
    public static Path a(e eVar, Rect rect) {
        b().reset();
        switch (eVar.f20615m) {
            case 227:
                Path b10 = b();
                float min = (Math.min(rect.width(), rect.height()) * 0.24f) / 2.0f;
                Float[] fArr = eVar.f20616n;
                if (fArr != null && fArr.length >= 1 && fArr[0] != null) {
                    min = (fArr[0].floatValue() * Math.min(rect.width(), rect.height())) / 2.0f;
                }
                float width = (rect.width() / 8.0f) + rect.left;
                float width2 = rect.right - (rect.width() / 8.0f);
                float height = (rect.height() / 8.0f) + rect.top;
                float height2 = rect.bottom - (rect.height() / 8.0f);
                b10.moveTo(width, rect.exactCenterY() - min);
                b10.lineTo(rect.exactCenterX() - min, rect.exactCenterY() - min);
                b10.lineTo(rect.exactCenterX() - min, height);
                b10.lineTo(rect.exactCenterX() + min, height);
                b10.lineTo(rect.exactCenterX() + min, rect.exactCenterY() - min);
                b10.lineTo(width2, rect.exactCenterY() - min);
                b10.lineTo(width2, rect.exactCenterY() + min);
                b10.lineTo(rect.exactCenterX() + min, rect.exactCenterY() + min);
                b10.lineTo(rect.exactCenterX() + min, height2);
                b10.lineTo(rect.exactCenterX() - min, height2);
                b10.lineTo(rect.exactCenterX() - min, rect.exactCenterY() + min);
                b10.lineTo(width, rect.exactCenterY() + min);
                b10.close();
                return b10;
            case 228:
                Path b11 = b();
                float height3 = (rect.height() * 0.24f) / 2.0f;
                Float[] fArr2 = eVar.f20616n;
                if (fArr2 != null && fArr2.length >= 1 && fArr2[0] != null) {
                    height3 = (fArr2[0].floatValue() * rect.height()) / 2.0f;
                }
                b11.addRect((rect.width() / 8.0f) + rect.left, rect.exactCenterY() - height3, rect.right - (rect.width() / 8.0f), rect.exactCenterY() + height3, Path.Direction.CW);
                return b11;
            case 229:
                Path b12 = b();
                float height4 = rect.height() * 0.24f;
                Float[] fArr3 = eVar.f20616n;
                if (fArr3 != null && fArr3.length >= 1 && fArr3[0] != null) {
                    height4 = rect.height() * fArr3[0].floatValue();
                }
                float height5 = rect.height() / rect.width();
                float f10 = height5 * height5;
                float sqrt = (height4 * ((float) Math.sqrt(f10 + 1.0f))) / 2.0f;
                float sqrt2 = (((float) Math.sqrt((rect.height() * rect.height()) + (rect.width() * rect.width()))) * ((float) Math.sqrt((1.0f / f10) + 1.0f))) / 4.0f;
                float f11 = (rect.right + rect.left) / 2.0f;
                float exactCenterY = rect.exactCenterY();
                float f12 = (1.0f / height5) + height5;
                float f13 = (sqrt2 - sqrt) / f12;
                float f14 = (height5 * f13) + sqrt;
                float f15 = (sqrt2 + sqrt) / f12;
                float f16 = (height5 * f15) - sqrt;
                b12.moveTo(f11, exactCenterY - sqrt);
                float f17 = f11 + f13;
                float f18 = exactCenterY - f14;
                b12.lineTo(f17, f18);
                float f19 = f11 + f15;
                float f20 = exactCenterY - f16;
                b12.lineTo(f19, f20);
                float f21 = sqrt / height5;
                b12.lineTo(f11 + f21, exactCenterY);
                float f22 = f16 + exactCenterY;
                b12.lineTo(f19, f22);
                float f23 = f14 + exactCenterY;
                b12.lineTo(f17, f23);
                b12.lineTo(f11, sqrt + exactCenterY);
                float f24 = f11 - f13;
                b12.lineTo(f24, f23);
                float f25 = f11 - f15;
                b12.lineTo(f25, f22);
                b12.lineTo(f11 - f21, exactCenterY);
                b12.lineTo(f25, f20);
                b12.lineTo(f24, f18);
                b12.close();
                return b12;
            case 230:
                Path b13 = b();
                float height6 = (rect.height() * 0.2352f) / 2.0f;
                float height7 = rect.height() * 0.0588f;
                float height8 = rect.height() * 0.1176f;
                Float[] fArr4 = eVar.f20616n;
                if (fArr4 != null && fArr4.length >= 3) {
                    if (fArr4[0] != null) {
                        height6 = (fArr4[0].floatValue() * rect.height()) / 2.0f;
                    }
                    if (fArr4[1] != null) {
                        height7 = fArr4[1].floatValue() * rect.height();
                    }
                    if (fArr4[2] != null) {
                        height8 = fArr4[2].floatValue() * rect.height();
                    }
                }
                b13.addRect((rect.width() / 8.0f) + rect.left, rect.exactCenterY() - height6, rect.right - (rect.width() / 8.0f), rect.exactCenterY() + height6, Path.Direction.CW);
                b13.moveTo(rect.exactCenterX() + height8, ((rect.exactCenterY() - height6) - height7) - height8);
                b13.addCircle(rect.exactCenterX(), ((rect.exactCenterY() - height6) - height7) - height8, height8, Path.Direction.CW);
                b13.moveTo(rect.exactCenterX(), rect.exactCenterY() + height6 + height7 + height8);
                b13.addCircle(rect.exactCenterX(), rect.exactCenterY() + height6 + height7 + height8, height8, Path.Direction.CW);
                return b13;
            case 231:
                Path b14 = b();
                float height9 = rect.height() * 0.2352f;
                float height10 = (rect.height() * 0.1176f) / 2.0f;
                Float[] fArr5 = eVar.f20616n;
                if (fArr5 != null && fArr5.length >= 2) {
                    if (fArr5[0] != null) {
                        height9 = rect.height() * fArr5[0].floatValue();
                    }
                    if (fArr5[1] != null) {
                        height10 = (fArr5[1].floatValue() * rect.height()) / 2.0f;
                    }
                }
                float f26 = height10;
                b14.reset();
                b14.addRect((rect.width() / 8.0f) + rect.left, (rect.exactCenterY() - f26) - height9, rect.right - (rect.width() / 8.0f), rect.exactCenterY() - f26, Path.Direction.CW);
                b14.moveTo((rect.width() / 8.0f) + rect.left, rect.exactCenterY() + f26);
                b14.addRect((rect.width() / 8.0f) + rect.left, rect.exactCenterY() + f26, rect.right - (rect.width() / 8.0f), rect.exactCenterY() + f26 + height9, Path.Direction.CW);
                return b14;
            case 232:
                Path b15 = b();
                float height11 = rect.height() * 0.2352f;
                float height12 = (rect.height() * 0.1176f) / 2.0f;
                Float[] fArr6 = eVar.f20616n;
                float f27 = 110.0f;
                if (fArr6 != null && fArr6.length >= 3) {
                    if (fArr6[0] != null) {
                        height11 = fArr6[0].floatValue() * rect.height();
                    }
                    Float f28 = fArr6[1];
                    if (f28 != null) {
                        f27 = (f28.floatValue() * 10.0f) / 6.0f;
                    }
                    if (fArr6[2] != null) {
                        height12 = (fArr6[2].floatValue() * rect.height()) / 2.0f;
                    }
                }
                float f29 = -((float) Math.tan(Math.toRadians(f27)));
                float f30 = f29 * f29;
                float sqrt3 = (((float) Math.sqrt(f30 + 1.0f)) * height11) / 2.0f;
                float height13 = (rect.height() / 2.0f) - ((sqrt3 - (rect.height() / 2.0f)) / f30);
                float exactCenterX = rect.exactCenterX();
                float exactCenterY2 = rect.exactCenterY();
                float height14 = ((rect.height() / 2.0f) - sqrt3) / f29;
                float height15 = rect.height() / 2.0f;
                float f31 = (height13 + sqrt3) / ((1.0f / f29) + f29);
                float f32 = (f29 * f31) - sqrt3;
                float f33 = height12 + height11;
                float f34 = (f33 - sqrt3) / f29;
                float f35 = (f33 + sqrt3) / f29;
                float f36 = (height12 - sqrt3) / f29;
                float f37 = (sqrt3 + height12) / f29;
                b15.reset();
                b15.moveTo((rect.width() / 8.0f) + rect.left, (rect.exactCenterY() - height12) - height11);
                if (f29 >= 0.0f) {
                    float f38 = exactCenterY2 - f33;
                    b15.lineTo(exactCenterX + f34, f38);
                    b15.lineTo(exactCenterX + height14, exactCenterY2 - height15);
                    b15.lineTo(exactCenterX + f31, exactCenterY2 - f32);
                    b15.lineTo(exactCenterX + f35, f38);
                    b15.lineTo(rect.right - (rect.width() / 8.0f), (rect.exactCenterY() - height12) - height11);
                    b15.lineTo(rect.right - (rect.width() / 8.0f), rect.exactCenterY() - height12);
                    float f39 = exactCenterY2 - height12;
                    b15.lineTo(exactCenterX + f37, f39);
                    float f40 = exactCenterY2 + height12;
                    b15.lineTo(exactCenterX - f36, f40);
                    b15.lineTo(rect.right - (rect.width() / 8.0f), rect.exactCenterY() + height12);
                    b15.lineTo(rect.right - (rect.width() / 8.0f), rect.exactCenterY() + height12 + height11);
                    float f41 = f33 + exactCenterY2;
                    b15.lineTo(exactCenterX - f34, f41);
                    b15.lineTo(exactCenterX - height14, height15 + exactCenterY2);
                    b15.lineTo(exactCenterX - f31, exactCenterY2 + f32);
                    b15.lineTo(exactCenterX - f35, f41);
                    b15.lineTo((rect.width() / 8.0f) + rect.left, rect.exactCenterY() + height12 + height11);
                    b15.lineTo((rect.width() / 8.0f) + rect.left, rect.exactCenterY() + height12);
                    b15.lineTo(exactCenterX - f37, f40);
                    b15.lineTo(exactCenterX + f36, f39);
                } else {
                    float f42 = exactCenterY2 - f33;
                    b15.lineTo(exactCenterX + f35, f42);
                    b15.lineTo(exactCenterX + f31, exactCenterY2 - f32);
                    b15.lineTo(exactCenterX + height14, exactCenterY2 - height15);
                    b15.lineTo(exactCenterX + f34, f42);
                    b15.lineTo(rect.right - (rect.width() / 8.0f), (rect.exactCenterY() - height12) - height11);
                    b15.lineTo(rect.right - (rect.width() / 8.0f), rect.exactCenterY() - height12);
                    float f43 = exactCenterY2 - height12;
                    b15.lineTo(exactCenterX + f36, f43);
                    float f44 = exactCenterY2 + height12;
                    b15.lineTo(exactCenterX - f37, f44);
                    b15.lineTo(rect.right - (rect.width() / 8.0f), rect.exactCenterY() + height12);
                    b15.lineTo(rect.right - (rect.width() / 8.0f), rect.exactCenterY() + height12 + height11);
                    float f45 = f33 + exactCenterY2;
                    b15.lineTo(exactCenterX - f35, f45);
                    b15.lineTo(exactCenterX - f31, f32 + exactCenterY2);
                    b15.lineTo(exactCenterX - height14, exactCenterY2 + height15);
                    b15.lineTo(exactCenterX - f34, f45);
                    b15.lineTo((rect.width() / 8.0f) + rect.left, rect.exactCenterY() + height12 + height11);
                    b15.lineTo((rect.width() / 8.0f) + rect.left, rect.exactCenterY() + height12);
                    b15.lineTo(exactCenterX - f36, f44);
                    b15.lineTo(exactCenterX + f37, f43);
                }
                b15.lineTo((rect.width() / 8.0f) + rect.left, rect.exactCenterY() - height12);
                b15.close();
                return b15;
            default:
                return null;
        }
    }

    public static Path b() {
        return e.a.f29807a.d("MathPathBuilder");
    }
}
