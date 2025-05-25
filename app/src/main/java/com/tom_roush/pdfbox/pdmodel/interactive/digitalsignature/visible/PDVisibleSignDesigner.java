package com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature.visible;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import b.a;
import com.tom_roush.harmony.awt.geom.AffineTransform;
import com.tom_roush.pdfbox.io.IOUtils;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.PDPage;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: classes2.dex */
public class PDVisibleSignDesigner {
    private Bitmap image;
    private Float imageHeight;
    private float imageSizeInPercents;
    private Float imageWidth;
    private float pageHeight;
    private float pageWidth;
    private float xAxis;
    private float yAxis;
    private String signatureFieldName = "sig";
    private byte[] formatterRectangleParams = {0, 0, 100, Field.GOTOBUTTON};
    private int[] formatterRectangleParameters = {0, 0, 100, 50};
    private AffineTransform affineTransform = new AffineTransform();
    private int rotation = 0;

    public PDVisibleSignDesigner(String str, InputStream inputStream, int i10) {
        readImageStream(inputStream);
        calculatePageSizeFromFile(str, i10);
    }

    private void calculatePageSize(PDDocument pDDocument, int i10) {
        if (i10 >= 1) {
            PDPage page = pDDocument.getPage(i10 - 1);
            PDRectangle mediaBox = page.getMediaBox();
            pageHeight(mediaBox.getHeight());
            this.pageWidth = mediaBox.getWidth();
            this.imageSizeInPercents = 100.0f;
            this.rotation = page.getRotation() % 360;
            return;
        }
        throw new IllegalArgumentException(a.c("First page of pdf is 1, not ", i10));
    }

    private void calculatePageSizeFromFile(String str, int i10) {
        PDDocument load = PDDocument.load(new File(str));
        calculatePageSize(load, i10);
        load.close();
    }

    private void calculatePageSizeFromStream(InputStream inputStream, int i10) {
        PDDocument load = PDDocument.load(inputStream);
        calculatePageSize(load, i10);
        load.close();
    }

    private PDVisibleSignDesigner pageHeight(float f10) {
        this.pageHeight = f10;
        return this;
    }

    private void readImageStream(InputStream inputStream) {
        setImage(BitmapFactory.decodeStream(inputStream));
    }

    private void setImage(Bitmap bitmap) {
        this.image = bitmap;
        this.imageHeight = Float.valueOf(bitmap.getHeight());
        this.imageWidth = Float.valueOf(bitmap.getWidth());
        this.formatterRectangleParameters[2] = bitmap.getWidth();
        this.formatterRectangleParameters[3] = bitmap.getHeight();
    }

    public PDVisibleSignDesigner adjustForRotation() {
        int i10 = this.rotation;
        if (i10 != 90) {
            if (i10 != 180) {
                if (i10 == 270) {
                    float f10 = this.xAxis;
                    this.xAxis = (this.pageWidth - this.yAxis) - this.imageHeight.floatValue();
                    this.yAxis = f10;
                    this.affineTransform = new AffineTransform(0.0f, (-this.imageHeight.floatValue()) / this.imageWidth.floatValue(), this.imageWidth.floatValue() / this.imageHeight.floatValue(), 0.0f, 0.0f, this.imageHeight.floatValue());
                    float floatValue = this.imageHeight.floatValue();
                    this.imageHeight = this.imageWidth;
                    this.imageWidth = Float.valueOf(floatValue);
                }
            } else {
                this.xAxis = (this.pageWidth - this.xAxis) - this.imageWidth.floatValue();
                this.yAxis = (this.pageHeight - this.yAxis) - this.imageHeight.floatValue();
                this.affineTransform = new AffineTransform(-1.0f, 0.0f, 0.0f, -1.0f, this.imageWidth.floatValue(), this.imageHeight.floatValue());
            }
        } else {
            float f11 = this.yAxis;
            this.yAxis = (this.pageHeight - this.xAxis) - this.imageWidth.floatValue();
            this.xAxis = f11;
            this.affineTransform = new AffineTransform(0.0f, this.imageHeight.floatValue() / this.imageWidth.floatValue(), (-this.imageWidth.floatValue()) / this.imageHeight.floatValue(), 0.0f, this.imageWidth.floatValue(), 0.0f);
            float floatValue2 = this.imageHeight.floatValue();
            this.imageHeight = this.imageWidth;
            this.imageWidth = Float.valueOf(floatValue2);
        }
        return this;
    }

    @Deprecated
    public PDVisibleSignDesigner affineTransformParams(byte[] bArr) {
        this.affineTransform = new AffineTransform(bArr[0], bArr[1], bArr[2], bArr[3], bArr[4], bArr[5]);
        return this;
    }

    public PDVisibleSignDesigner coordinates(float f10, float f11) {
        xAxis(f10);
        yAxis(f11);
        return this;
    }

    public PDVisibleSignDesigner formatterRectangleParameters(int[] iArr) {
        this.formatterRectangleParameters = iArr;
        return this;
    }

    @Deprecated
    public PDVisibleSignDesigner formatterRectangleParams(byte[] bArr) {
        this.formatterRectangleParams = bArr;
        return this;
    }

    @Deprecated
    public byte[] getAffineTransformParams() {
        return new byte[]{(byte) this.affineTransform.getScaleX(), (byte) this.affineTransform.getShearY(), (byte) this.affineTransform.getShearX(), (byte) this.affineTransform.getScaleY(), (byte) this.affineTransform.getTranslateX(), (byte) this.affineTransform.getTranslateY()};
    }

    public int[] getFormatterRectangleParameters() {
        return this.formatterRectangleParameters;
    }

    @Deprecated
    public byte[] getFormatterRectangleParams() {
        return this.formatterRectangleParams;
    }

    public float getHeight() {
        return this.imageHeight.floatValue();
    }

    public Bitmap getImage() {
        return this.image;
    }

    public float getImageSizeInPercents() {
        return this.imageSizeInPercents;
    }

    public float getPageHeight() {
        return this.pageHeight;
    }

    public float getPageWidth() {
        return this.pageWidth;
    }

    public String getSignatureFieldName() {
        return this.signatureFieldName;
    }

    public String getSignatureText() {
        throw new UnsupportedOperationException("That method is not yet implemented");
    }

    public float getTemplateHeight() {
        return getPageHeight();
    }

    public AffineTransform getTransform() {
        return this.affineTransform;
    }

    public float getWidth() {
        return this.imageWidth.floatValue();
    }

    public float getxAxis() {
        return this.xAxis;
    }

    public float getyAxis() {
        return this.yAxis;
    }

    public PDVisibleSignDesigner height(float f10) {
        this.imageHeight = Float.valueOf(f10);
        this.formatterRectangleParameters[3] = (int) f10;
        return this;
    }

    public void imageSizeInPercents(float f10) {
        this.imageSizeInPercents = f10;
    }

    public PDVisibleSignDesigner pageWidth(float f10) {
        this.pageWidth = f10;
        return this;
    }

    public PDVisibleSignDesigner signatureFieldName(String str) {
        this.signatureFieldName = str;
        return this;
    }

    public PDVisibleSignDesigner signatureImage(String str) {
        BufferedInputStream bufferedInputStream;
        BufferedInputStream bufferedInputStream2 = null;
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(str));
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            readImageStream(bufferedInputStream);
            IOUtils.closeQuietly(bufferedInputStream);
            return this;
        } catch (Throwable th3) {
            th = th3;
            bufferedInputStream2 = bufferedInputStream;
            IOUtils.closeQuietly(bufferedInputStream2);
            throw th;
        }
    }

    public PDVisibleSignDesigner signatureText(String str) {
        throw new UnsupportedOperationException("That method is not yet implemented");
    }

    public PDVisibleSignDesigner transform(AffineTransform affineTransform) {
        this.affineTransform = new AffineTransform(affineTransform);
        return this;
    }

    public PDVisibleSignDesigner width(float f10) {
        this.imageWidth = Float.valueOf(f10);
        this.formatterRectangleParameters[2] = (int) f10;
        return this;
    }

    public PDVisibleSignDesigner xAxis(float f10) {
        this.xAxis = f10;
        return this;
    }

    public PDVisibleSignDesigner yAxis(float f10) {
        this.yAxis = f10;
        return this;
    }

    public PDVisibleSignDesigner zoom(float f10) {
        this.imageHeight = Float.valueOf(((this.imageHeight.floatValue() * f10) / 100.0f) + this.imageHeight.floatValue());
        Float valueOf = Float.valueOf(((this.imageWidth.floatValue() * f10) / 100.0f) + this.imageWidth.floatValue());
        this.imageWidth = valueOf;
        this.formatterRectangleParameters[2] = (int) valueOf.floatValue();
        this.formatterRectangleParameters[3] = (int) this.imageHeight.floatValue();
        return this;
    }

    public PDVisibleSignDesigner(InputStream inputStream, InputStream inputStream2, int i10) {
        readImageStream(inputStream2);
        calculatePageSizeFromStream(inputStream, i10);
    }

    public PDVisibleSignDesigner(PDDocument pDDocument, InputStream inputStream, int i10) {
        readImageStream(inputStream);
        calculatePageSize(pDDocument, i10);
    }

    public PDVisibleSignDesigner(String str, Bitmap bitmap, int i10) {
        setImage(bitmap);
        calculatePageSizeFromFile(str, i10);
    }

    public PDVisibleSignDesigner(InputStream inputStream, Bitmap bitmap, int i10) {
        setImage(bitmap);
        calculatePageSizeFromStream(inputStream, i10);
    }

    public PDVisibleSignDesigner(PDDocument pDDocument, Bitmap bitmap, int i10) {
        setImage(bitmap);
        calculatePageSize(pDDocument, i10);
    }

    public PDVisibleSignDesigner(InputStream inputStream) {
        readImageStream(inputStream);
    }
}
