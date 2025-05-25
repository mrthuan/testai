package com.facebook.ads.redexgen.X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.2j  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C04922j extends Drawable {
    public static InterfaceC04912i A0G;
    public static byte[] A0H;
    public static String[] A0I = {"Bq6maawZ0clc1FQAmj5JQZ", "VAIBWau0AGjNNTEN3MsesX9vol", "j9uAnr9SO1508v2Fml3gke", "ZCgsP4jhFD2e5OZklqeZfYu5I7s7wZNA", "gWy56vmTKK0E", "vsILSp0QdnJQHstvTHvz6zn3fr5EWYkf", "Ft8tZM9UwubEJUOv9H1JFeEwlzUnh", "KM7boO2xaC3ZbV22lXcue9aE71LlUQ5e"};
    public static final double A0J;
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public ColorStateList A04;
    public Paint A05;
    public Paint A06;
    public Path A08;
    public final RectF A0F;
    public boolean A0A = true;
    public boolean A09 = true;
    public boolean A0B = false;
    public final int A0E = 922746880;
    public final int A0D = 50331648;
    public final int A0C = AbstractC04872e.A09;
    public Paint A07 = new Paint(5);

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0H, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 4);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A0H = new byte[]{Field.MERGESEQ, 61, 106, -110, -112, -111, 61, Byte.MAX_VALUE, -126, 61, Field.HTMLCONTROL, Field.LISTNUM, 61, 77, 78, 115, 123, 102, 113, 110, 105, Field.PAGEREF, 114, 102, 125, Field.PAGEREF, 120, 109, 102, 105, 116, 124, Field.PAGEREF, 120, 110, Byte.MAX_VALUE, 106, Field.PAGEREF, 117, -102, -94, -115, -104, -107, -112, 76, -98, -115, -112, -107, -95, -97, 76, 78, 115, 123, 102, 113, 110, 105, Field.PAGEREF, 120, 109, 102, 105, 116, 124, Field.PAGEREF, 120, 110, Byte.MAX_VALUE, 106, Field.PAGEREF};
    }

    static {
        A05();
        A0J = Math.cos(Math.toRadians(45.0d));
    }

    public C04922j(Resources resources, ColorStateList colorStateList, float f10, float f11, float f12) {
        A07(colorStateList);
        this.A05 = new Paint(5);
        this.A05.setStyle(Paint.Style.FILL);
        this.A00 = (int) (0.5f + f10);
        this.A0F = new RectF();
        this.A06 = new Paint(this.A05);
        this.A06.setAntiAlias(false);
        A06(f11, f12);
    }

    public static float A00(float f10, float f11, boolean z10) {
        if (z10) {
            return (float) (f10 + ((1.0d - A0J) * f11));
        }
        return f10;
    }

    public static float A01(float f10, float f11, boolean z10) {
        if (z10) {
            return (float) ((1.5f * f10) + ((1.0d - A0J) * f11));
        }
        float f12 = 1.5f * f10;
        if (A0I[6].length() != 2) {
            A0I[3] = "QZbxm3QXOF2yqMmVze25YX6oNvKBlq6Q";
            return f12;
        }
        throw new RuntimeException();
    }

    private int A02(float f10) {
        int i10 = (int) (0.5f + f10);
        if (i10 % 2 == 1) {
            int i11 = i10 - 1;
            return i11;
        }
        return i10;
    }

    private void A04() {
        RectF rectF = new RectF(-this.A00, -this.A00, this.A00, this.A00);
        RectF rectF2 = new RectF(rectF);
        rectF2.inset(-this.A03, -this.A03);
        if (this.A08 == null) {
            this.A08 = new Path();
        } else {
            this.A08.reset();
        }
        this.A08.setFillType(Path.FillType.EVEN_ODD);
        this.A08.moveTo(-this.A00, 0.0f);
        this.A08.rLineTo(-this.A03, 0.0f);
        this.A08.arcTo(rectF2, 180.0f, 90.0f, false);
        this.A08.arcTo(rectF, 270.0f, -90.0f, false);
        this.A08.close();
        this.A05.setShader(new RadialGradient(0.0f, 0.0f, this.A00 + this.A03, new int[]{this.A0E, this.A0E, this.A0D}, new float[]{0.0f, this.A00 / (this.A00 + this.A03), 1.0f}, Shader.TileMode.CLAMP));
        this.A06.setShader(new LinearGradient(0.0f, (-this.A00) + this.A03, 0.0f, (-this.A00) - this.A03, new int[]{this.A0E, this.A0E, this.A0D}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.A06.setAntiAlias(false);
    }

    private void A06(float f10, float f11) {
        String A03 = A03(0, 14, 25);
        if (f10 >= 0.0f) {
            if (f11 >= 0.0f) {
                float A02 = A02(f10);
                float A022 = A02(f11);
                if (A02 > A022) {
                    A02 = A022;
                    if (!this.A0B) {
                        this.A0B = true;
                    }
                }
                if (this.A02 == A02 && this.A01 == A022) {
                    return;
                }
                this.A02 = A02;
                this.A01 = A022;
                this.A03 = (int) ((1.5f * A02) + this.A0C + 0.5f);
                this.A0A = true;
                invalidateSelf();
                return;
            }
            throw new IllegalArgumentException(A03(14, 24, 1) + f11 + A03);
        }
        throw new IllegalArgumentException(A03(53, 20, 1) + f10 + A03);
    }

    private void A07(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.A04 = colorStateList;
        this.A07.setColor(this.A04.getColorForState(getState(), this.A04.getDefaultColor()));
    }

    private void A08(Canvas canvas) {
        float f10 = (-this.A00) - this.A03;
        float edgeShadowTop = this.A00 + this.A0C + (this.A02 / 2.0f);
        float inset = edgeShadowTop * 2.0f;
        boolean z10 = this.A0F.width() - inset > 0.0f;
        float inset2 = edgeShadowTop * 2.0f;
        boolean z11 = this.A0F.height() - inset2 > 0.0f;
        int save = canvas.save();
        float inset3 = this.A0F.top;
        canvas.translate(this.A0F.left + edgeShadowTop, inset3 + edgeShadowTop);
        canvas.drawPath(this.A08, this.A05);
        if (z10) {
            float inset4 = edgeShadowTop * 2.0f;
            float width = this.A0F.width() - inset4;
            float inset5 = this.A00;
            canvas.drawRect(0.0f, f10, width, -inset5, this.A06);
        }
        canvas.restoreToCount(save);
        int save2 = canvas.save();
        float inset6 = this.A0F.bottom;
        canvas.translate(this.A0F.right - edgeShadowTop, inset6 - edgeShadowTop);
        canvas.rotate(180.0f);
        canvas.drawPath(this.A08, this.A05);
        if (z10) {
            float inset7 = edgeShadowTop * 2.0f;
            float width2 = this.A0F.width() - inset7;
            float inset8 = this.A00;
            float f11 = -inset8;
            float inset9 = this.A03;
            canvas.drawRect(0.0f, f10, width2, f11 + inset9, this.A06);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        float inset10 = this.A0F.bottom;
        canvas.translate(this.A0F.left + edgeShadowTop, inset10 - edgeShadowTop);
        canvas.rotate(270.0f);
        canvas.drawPath(this.A08, this.A05);
        if (z11) {
            float inset11 = edgeShadowTop * 2.0f;
            float height = this.A0F.height() - inset11;
            float inset12 = this.A00;
            float f12 = -inset12;
            if (A0I[5].charAt(6) == 'R') {
                throw new RuntimeException();
            }
            A0I[6] = "2Ln5BSLKVjuogxQZwoom6EaRoO86Ewhl";
            canvas.drawRect(0.0f, f10, height, f12, this.A06);
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        float inset13 = this.A0F.top;
        canvas.translate(this.A0F.right - edgeShadowTop, inset13 + edgeShadowTop);
        canvas.rotate(90.0f);
        canvas.drawPath(this.A08, this.A05);
        if (A0I[7].charAt(11) != 'Z') {
            throw new RuntimeException();
        }
        A0I[6] = "W2wdXev7uTlJlARfOPIfUdj";
        if (z11) {
            canvas.drawRect(0.0f, f10, this.A0F.height() - (2.0f * edgeShadowTop), -this.A00, this.A06);
        }
        canvas.restoreToCount(save4);
    }

    private void A09(Rect rect) {
        float f10 = this.A01 * 1.5f;
        RectF rectF = this.A0F;
        float f11 = rect.left;
        float verticalOffset = this.A01;
        float f12 = rect.right;
        float verticalOffset2 = this.A01;
        float f13 = f12 - verticalOffset2;
        float verticalOffset3 = rect.bottom;
        rectF.set(f11 + verticalOffset, rect.top + f10, f13, verticalOffset3 - f10);
        A04();
    }

    public final float A0A() {
        return this.A00;
    }

    public final float A0B() {
        return this.A01;
    }

    public final float A0C() {
        float content = this.A0C;
        return (((this.A01 * 1.5f) + content) * 2.0f) + (Math.max(this.A01, this.A00 + this.A0C + ((this.A01 * 1.5f) / 2.0f)) * 2.0f);
    }

    public final float A0D() {
        float f10 = this.A01;
        float content = this.A0C;
        return ((f10 + content) * 2.0f) + (Math.max(this.A01, this.A00 + this.A0C + (this.A01 / 2.0f)) * 2.0f);
    }

    public final float A0E() {
        return this.A02;
    }

    public final ColorStateList A0F() {
        return this.A04;
    }

    public final void A0G(float f10) {
        if (f10 >= 0.0f) {
            float f11 = (int) (0.5f + f10);
            if (this.A00 == f11) {
                return;
            }
            this.A00 = f11;
            this.A0A = true;
            invalidateSelf();
            return;
        }
        throw new IllegalArgumentException(A03(38, 15, 40) + f10 + A03(0, 14, 25));
    }

    public final void A0H(float f10) {
        A06(this.A02, f10);
    }

    public final void A0I(float f10) {
        A06(f10, this.A01);
    }

    public final void A0J(ColorStateList colorStateList) {
        A07(colorStateList);
        invalidateSelf();
    }

    public final void A0K(Rect rect) {
        getPadding(rect);
    }

    public final void A0L(boolean z10) {
        this.A09 = z10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.A0A) {
            A09(getBounds());
            this.A0A = false;
        }
        canvas.translate(0.0f, this.A02 / 2.0f);
        A08(canvas);
        canvas.translate(0.0f, (-this.A02) / 2.0f);
        A0G.A5a(canvas, this.A0F, this.A00, this.A07);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil(A01(this.A01, this.A00, this.A09));
        int vOffset = (int) Math.ceil(A00(this.A01, this.A00, this.A09));
        rect.set(vOffset, ceil, vOffset, ceil);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return (this.A04 != null && this.A04.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.A0A = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        int colorForState = this.A04.getColorForState(iArr, this.A04.getDefaultColor());
        int newColor = this.A07.getColor();
        if (newColor == colorForState) {
            return false;
        }
        this.A07.setColor(colorForState);
        this.A0A = true;
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.A07.setAlpha(i10);
        this.A05.setAlpha(i10);
        this.A06.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A07.setColorFilter(colorFilter);
    }
}
