package com.tom_roush.pdfbox.pdmodel.graphics.image;

import a0.a;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import com.google.android.gms.common.api.Api;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSInputStream;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSObject;
import com.tom_roush.pdfbox.cos.COSStream;
import com.tom_roush.pdfbox.filter.DecodeOptions;
import com.tom_roush.pdfbox.filter.DecodeResult;
import com.tom_roush.pdfbox.io.IOUtils;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.PDResources;
import com.tom_roush.pdfbox.pdmodel.common.PDMetadata;
import com.tom_roush.pdfbox.pdmodel.common.PDStream;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.markedcontent.PDPropertyList;
import com.tom_roush.pdfbox.pdmodel.graphics.PDXObject;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDColorSpace;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDDeviceGray;
import com.tom_roush.pdfbox.util.filetypedetector.FileType;
import com.tom_roush.pdfbox.util.filetypedetector.FileTypeDetector;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.SoftReference;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import lib.zj.office.fc.openxml4j.opc.ContentTypes;

/* loaded from: classes2.dex */
public final class PDImageXObject extends PDXObject implements PDImage {
    private SoftReference<Bitmap> cachedImage;
    private int cachedImageSubsampling;
    private PDColorSpace colorSpace;
    private final PDResources resources;

    public PDImageXObject(PDDocument pDDocument) {
        this(new PDStream(pDDocument), null);
    }

    private Bitmap applyMask(Bitmap bitmap, Bitmap bitmap2, boolean z10, float[] fArr) {
        Bitmap bitmap3 = bitmap;
        Bitmap bitmap4 = bitmap2;
        if (bitmap4 == null) {
            return bitmap3;
        }
        int max = Math.max(bitmap.getWidth(), bitmap2.getWidth());
        int max2 = Math.max(bitmap.getHeight(), bitmap2.getHeight());
        if (bitmap2.getWidth() < max || bitmap2.getHeight() < max2) {
            bitmap4 = scaleImage(bitmap4, max, max2);
        }
        if (bitmap.getWidth() < max || bitmap.getHeight() < max2) {
            bitmap3 = scaleImage(bitmap3, max, max2);
        }
        if (bitmap3.getConfig() != Bitmap.Config.ARGB_8888 || !bitmap3.isMutable()) {
            bitmap3 = bitmap3.copy(Bitmap.Config.ARGB_8888, true);
        }
        int[] iArr = new int[max];
        int[] iArr2 = new int[max];
        if (!z10 && bitmap3.getByteCount() == bitmap4.getByteCount()) {
            int i10 = 0;
            while (i10 < max2) {
                int i11 = i10;
                bitmap3.getPixels(iArr, 0, max, 0, i10, max, 1);
                bitmap4.getPixels(iArr2, 0, max, 0, i11, max, 1);
                int i12 = 0;
                for (int i13 = max; i13 > 0; i13--) {
                    iArr[i12] = (iArr[i12] & 16777215) | ((~iArr2[i12]) & (-16777216));
                    i12++;
                }
                bitmap3.setPixels(iArr, 0, max, 0, i11, max, 1);
                i10 = i11 + 1;
            }
        } else if (fArr == null) {
            for (int i14 = 0; i14 < max2; i14++) {
                int i15 = i14;
                bitmap3.getPixels(iArr, 0, max, 0, i15, max, 1);
                bitmap4.getPixels(iArr2, 0, max, 0, i15, max, 1);
                for (int i16 = 0; i16 < max; i16++) {
                    if (!z10) {
                        iArr2[i16] = ~iArr2[i16];
                    }
                    iArr[i16] = (iArr[i16] & 16777215) | (iArr2[i16] & (-16777216));
                }
                bitmap3.setPixels(iArr, 0, max, 0, i14, max, 1);
            }
        } else {
            int round = Math.round(fArr[0] * 8355840.0f) * FunctionEval.FunctionID.EXTERNAL_FUNC;
            int round2 = Math.round(fArr[1] * 8355840.0f) * FunctionEval.FunctionID.EXTERNAL_FUNC;
            int round3 = Math.round(fArr[2] * 8355840.0f) * FunctionEval.FunctionID.EXTERNAL_FUNC;
            int i17 = (round / FunctionEval.FunctionID.EXTERNAL_FUNC) + 16384;
            int i18 = (round2 / FunctionEval.FunctionID.EXTERNAL_FUNC) + 16384;
            int i19 = (round3 / FunctionEval.FunctionID.EXTERNAL_FUNC) + 16384;
            int i20 = 0;
            while (i20 < max2) {
                int i21 = i20;
                int i22 = i19;
                int i23 = i18;
                int i24 = i17;
                int i25 = round3;
                int i26 = round;
                bitmap3.getPixels(iArr, 0, max, 0, i21, max, 1);
                bitmap4.getPixels(iArr2, 0, max, 0, i21, max, 1);
                for (int i27 = 0; i27 < max; i27++) {
                    int alpha = Color.alpha(iArr2[i27]);
                    if (alpha == 0) {
                        iArr[i27] = iArr[i27] & 16777215;
                    } else {
                        int i28 = iArr[i27];
                        iArr[i27] = Color.argb(alpha, clampColor(((((Color.red(i28) * 8355840) - i26) / alpha) + i24) >> 15), clampColor(((((Color.green(i28) * 8355840) - round2) / alpha) + i23) >> 15), clampColor(((((Color.blue(i28) * 8355840) - i25) / alpha) + i22) >> 15));
                    }
                }
                bitmap3.setPixels(iArr, 0, max, 0, i21, max, 1);
                i20 = i21 + 1;
                i19 = i22;
                i17 = i24;
                i18 = i23;
                round3 = i25;
                round = i26;
            }
        }
        return bitmap3;
    }

    private int clampColor(float f10) {
        if (f10 <= 0.0f) {
            return 0;
        }
        if (f10 >= 255.0f) {
            return FunctionEval.FunctionID.EXTERNAL_FUNC;
        }
        return (int) f10;
    }

    public static PDImageXObject createFromByteArray(PDDocument pDDocument, byte[] bArr, String str) {
        try {
            FileType detectFileType = FileTypeDetector.detectFileType(bArr);
            if (detectFileType != null) {
                if (detectFileType.equals(FileType.JPEG)) {
                    return JPEGFactory.createFromByteArray(pDDocument, bArr);
                }
                if (detectFileType.equals(FileType.TIFF)) {
                    try {
                        return CCITTFactory.createFromByteArray(pDDocument, bArr);
                    } catch (IOException unused) {
                        detectFileType = FileType.PNG;
                    }
                }
                if (!detectFileType.equals(FileType.BMP) && !detectFileType.equals(FileType.GIF) && !detectFileType.equals(FileType.PNG)) {
                    throw new IllegalArgumentException("Image type " + detectFileType + " not supported: " + str);
                }
                return LosslessFactory.createFromImage(pDDocument, BitmapFactory.decodeStream(new ByteArrayInputStream(bArr)));
            }
            throw new IllegalArgumentException(a.h("Image type not supported: ", str));
        } catch (IOException e10) {
            throw new IOException(a.h("Could not determine file type: ", str), e10);
        }
    }

    public static PDImageXObject createFromFile(String str, PDDocument pDDocument) {
        return createFromFileByExtension(new File(str), pDDocument);
    }

    public static PDImageXObject createFromFileByContent(File file, PDDocument pDDocument) {
        BufferedInputStream bufferedInputStream;
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                bufferedInputStream = new BufferedInputStream(fileInputStream2);
                try {
                    FileType detectFileType = FileTypeDetector.detectFileType(bufferedInputStream);
                    IOUtils.closeQuietly(fileInputStream2);
                    IOUtils.closeQuietly(bufferedInputStream);
                    if (detectFileType != null) {
                        if (detectFileType.equals(FileType.JPEG)) {
                            FileInputStream fileInputStream3 = new FileInputStream(file);
                            PDImageXObject createFromStream = JPEGFactory.createFromStream(pDDocument, fileInputStream3);
                            fileInputStream3.close();
                            return createFromStream;
                        }
                        if (detectFileType.equals(FileType.TIFF)) {
                            try {
                                return CCITTFactory.createFromFile(pDDocument, file);
                            } catch (IOException unused) {
                                detectFileType = FileType.PNG;
                            }
                        }
                        if (!detectFileType.equals(FileType.BMP) && !detectFileType.equals(FileType.GIF) && !detectFileType.equals(FileType.PNG)) {
                            throw new IllegalArgumentException("Image type " + detectFileType + " not supported: " + file.getName());
                        }
                        return LosslessFactory.createFromImage(pDDocument, BitmapFactory.decodeFile(file.getPath()));
                    }
                    throw new IllegalArgumentException("Image type not supported: " + file.getName());
                } catch (IOException e10) {
                    e = e10;
                    fileInputStream = fileInputStream2;
                    try {
                        throw new IOException("Could not determine file type: " + file.getName(), e);
                    } catch (Throwable th2) {
                        th = th2;
                        IOUtils.closeQuietly(fileInputStream);
                        IOUtils.closeQuietly(bufferedInputStream);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileInputStream = fileInputStream2;
                    IOUtils.closeQuietly(fileInputStream);
                    IOUtils.closeQuietly(bufferedInputStream);
                    throw th;
                }
            } catch (IOException e11) {
                e = e11;
                bufferedInputStream = null;
            } catch (Throwable th4) {
                th = th4;
                bufferedInputStream = null;
            }
        } catch (IOException e12) {
            e = e12;
            bufferedInputStream = null;
        } catch (Throwable th5) {
            th = th5;
            bufferedInputStream = null;
        }
    }

    public static PDImageXObject createFromFileByExtension(File file, PDDocument pDDocument) {
        FileInputStream fileInputStream;
        String name = file.getName();
        int lastIndexOf = file.getName().lastIndexOf(46);
        if (lastIndexOf != -1) {
            String lowerCase = name.substring(lastIndexOf + 1).toLowerCase();
            if (!ContentTypes.EXTENSION_JPG_1.equals(lowerCase) && !ContentTypes.EXTENSION_JPG_2.equals(lowerCase)) {
                if (!"tif".equals(lowerCase) && !"tiff".equals(lowerCase)) {
                    if (!ContentTypes.EXTENSION_GIF.equals(lowerCase) && !"bmp".equals(lowerCase) && !ContentTypes.EXTENSION_PNG.equals(lowerCase)) {
                        throw new IllegalArgumentException("Image type not supported: ".concat(name));
                    }
                    return LosslessFactory.createFromImage(pDDocument, BitmapFactory.decodeFile(file.getPath()));
                }
                return CCITTFactory.createFromFile(pDDocument, file);
            }
            FileInputStream fileInputStream2 = null;
            try {
                fileInputStream = new FileInputStream(file);
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                PDImageXObject createFromStream = JPEGFactory.createFromStream(pDDocument, fileInputStream);
                IOUtils.closeQuietly(fileInputStream);
                return createFromStream;
            } catch (Throwable th3) {
                th = th3;
                fileInputStream2 = fileInputStream;
                IOUtils.closeQuietly(fileInputStream2);
                throw th;
            }
        }
        throw new IllegalArgumentException(a.h("Image type not supported: ", name));
    }

    private static COSStream createRawStream(PDDocument pDDocument, InputStream inputStream) {
        OutputStream outputStream;
        COSStream createCOSStream = pDDocument.getDocument().createCOSStream();
        try {
            outputStream = createCOSStream.createRawOutputStream();
        } catch (Throwable th2) {
            th = th2;
            outputStream = null;
        }
        try {
            IOUtils.copy(inputStream, outputStream);
            if (outputStream != null) {
                outputStream.close();
            }
            return createCOSStream;
        } catch (Throwable th3) {
            th = th3;
            if (outputStream != null) {
                outputStream.close();
            }
            throw th;
        }
    }

    public static PDImageXObject createThumbnail(COSStream cOSStream) {
        return new PDImageXObject(new PDStream(cOSStream), null);
    }

    private float[] extractMatte(PDImageXObject pDImageXObject) {
        COSBase item = pDImageXObject.getCOSObject().getItem(COSName.MATTE);
        if (!(item instanceof COSArray)) {
            return null;
        }
        float[] floatArray = ((COSArray) item).toFloatArray();
        if (floatArray.length < getColorSpace().getNumberOfComponents()) {
            return null;
        }
        return getColorSpace().toRGB(floatArray);
    }

    private Bitmap scaleImage(Bitmap bitmap, int i10, int i11) {
        return Bitmap.createScaledBitmap(bitmap, i10, i11, true);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public InputStream createInputStream() {
        return getStream().createInputStream();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public int getBitsPerComponent() {
        if (isStencil()) {
            return 1;
        }
        return getCOSObject().getInt(COSName.BITS_PER_COMPONENT, COSName.BPC);
    }

    public COSArray getColorKeyMask() {
        COSBase dictionaryObject = getCOSObject().getDictionaryObject(COSName.MASK);
        if (dictionaryObject instanceof COSArray) {
            return (COSArray) dictionaryObject;
        }
        return null;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public PDColorSpace getColorSpace() {
        COSObject cOSObject;
        PDResources pDResources;
        if (this.colorSpace == null) {
            COSBase item = getCOSObject().getItem(COSName.COLORSPACE, COSName.CS);
            if (item != null) {
                if ((item instanceof COSObject) && (pDResources = this.resources) != null && pDResources.getResourceCache() != null) {
                    cOSObject = (COSObject) item;
                    PDColorSpace colorSpace = this.resources.getResourceCache().getColorSpace(cOSObject);
                    this.colorSpace = colorSpace;
                    if (colorSpace != null) {
                        return colorSpace;
                    }
                } else {
                    cOSObject = null;
                }
                this.colorSpace = PDColorSpace.create(item, this.resources);
                if (cOSObject != null) {
                    this.resources.getResourceCache().put(cOSObject, this.colorSpace);
                }
            } else if (isStencil()) {
                return PDDeviceGray.INSTANCE;
            } else {
                throw new IOException("could not determine color space");
            }
        }
        return this.colorSpace;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public COSArray getDecode() {
        COSBase dictionaryObject = getCOSObject().getDictionaryObject(COSName.DECODE);
        if (dictionaryObject instanceof COSArray) {
            return (COSArray) dictionaryObject;
        }
        return null;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public int getHeight() {
        return getCOSObject().getInt(COSName.HEIGHT);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public Bitmap getImage() {
        return getImage(null, 1);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public boolean getInterpolate() {
        return getCOSObject().getBoolean(COSName.INTERPOLATE, false);
    }

    public PDImageXObject getMask() {
        COSStream cOSStream;
        COSStream cOSObject = getCOSObject();
        COSName cOSName = COSName.MASK;
        if ((cOSObject.getDictionaryObject(cOSName) instanceof COSArray) || (cOSStream = getCOSObject().getCOSStream(cOSName)) == null) {
            return null;
        }
        return new PDImageXObject(new PDStream(cOSStream), null);
    }

    public PDMetadata getMetadata() {
        COSStream cOSStream = getCOSObject().getCOSStream(COSName.METADATA);
        if (cOSStream != null) {
            return new PDMetadata(cOSStream);
        }
        return null;
    }

    public Bitmap getOpaqueImage() {
        return SampledImageReader.getRGBImage(this, null);
    }

    public PDPropertyList getOptionalContent() {
        COSBase dictionaryObject = getCOSObject().getDictionaryObject(COSName.OC);
        if (dictionaryObject instanceof COSDictionary) {
            return PDPropertyList.create((COSDictionary) dictionaryObject);
        }
        return null;
    }

    public PDImageXObject getSoftMask() {
        COSStream cOSStream = getCOSObject().getCOSStream(COSName.SMASK);
        if (cOSStream == null) {
            return null;
        }
        return new PDImageXObject(new PDStream(cOSStream), null);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public Bitmap getStencilImage(Paint paint) {
        if (isStencil()) {
            return SampledImageReader.getStencilImage(this, paint);
        }
        throw new IllegalStateException("Image is not a stencil");
    }

    public int getStructParent() {
        return getCOSObject().getInt(COSName.STRUCT_PARENT);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public String getSuffix() {
        List<COSName> filters = getStream().getFilters();
        if (filters == null) {
            return ContentTypes.EXTENSION_PNG;
        }
        if (filters.contains(COSName.DCT_DECODE)) {
            return ContentTypes.EXTENSION_JPG_1;
        }
        if (filters.contains(COSName.JPX_DECODE)) {
            return "jpx";
        }
        if (filters.contains(COSName.CCITTFAX_DECODE)) {
            return "tiff";
        }
        if (filters.contains(COSName.FLATE_DECODE) || filters.contains(COSName.LZW_DECODE) || filters.contains(COSName.RUN_LENGTH_DECODE)) {
            return ContentTypes.EXTENSION_PNG;
        }
        if (filters.contains(COSName.JBIG2_DECODE)) {
            return "jb2";
        }
        filters.toString();
        return null;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public int getWidth() {
        return getCOSObject().getInt(COSName.WIDTH);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public boolean isEmpty() {
        if (getStream().getCOSObject().getLength() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public boolean isStencil() {
        return getCOSObject().getBoolean(COSName.IMAGE_MASK, false);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public void setBitsPerComponent(int i10) {
        getCOSObject().setInt(COSName.BITS_PER_COMPONENT, i10);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public void setColorSpace(PDColorSpace pDColorSpace) {
        COSBase cOSBase;
        COSStream cOSObject = getCOSObject();
        COSName cOSName = COSName.COLORSPACE;
        if (pDColorSpace != null) {
            cOSBase = pDColorSpace.getCOSObject();
        } else {
            cOSBase = null;
        }
        cOSObject.setItem(cOSName, cOSBase);
        this.colorSpace = null;
        this.cachedImage = null;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public void setDecode(COSArray cOSArray) {
        getCOSObject().setItem(COSName.DECODE, (COSBase) cOSArray);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public void setHeight(int i10) {
        getCOSObject().setInt(COSName.HEIGHT, i10);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public void setInterpolate(boolean z10) {
        getCOSObject().setBoolean(COSName.INTERPOLATE, z10);
    }

    public void setMetadata(PDMetadata pDMetadata) {
        getCOSObject().setItem(COSName.METADATA, pDMetadata);
    }

    public void setOptionalContent(PDPropertyList pDPropertyList) {
        getCOSObject().setItem(COSName.OC, pDPropertyList);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public void setStencil(boolean z10) {
        getCOSObject().setBoolean(COSName.IMAGE_MASK, z10);
    }

    public void setStructParent(int i10) {
        getCOSObject().setInt(COSName.STRUCT_PARENT, i10);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public void setWidth(int i10) {
        getCOSObject().setInt(COSName.WIDTH, i10);
    }

    public PDImageXObject(PDDocument pDDocument, InputStream inputStream, COSBase cOSBase, int i10, int i11, int i12, PDColorSpace pDColorSpace) {
        super(createRawStream(pDDocument, inputStream), COSName.IMAGE);
        this.cachedImageSubsampling = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        getCOSObject().setItem(COSName.FILTER, cOSBase);
        this.resources = null;
        this.colorSpace = null;
        setBitsPerComponent(i12);
        setWidth(i10);
        setHeight(i11);
        setColorSpace(pDColorSpace);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public InputStream createInputStream(DecodeOptions decodeOptions) {
        return getStream().createInputStream(decodeOptions);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public Bitmap getImage(Rect rect, int i10) {
        SoftReference<Bitmap> softReference;
        Bitmap bitmap;
        if (rect != null || i10 != this.cachedImageSubsampling || (softReference = this.cachedImage) == null || (bitmap = softReference.get()) == null) {
            Bitmap rGBImage = SampledImageReader.getRGBImage(this, rect, i10, getColorKeyMask());
            PDImageXObject softMask = getSoftMask();
            if (softMask != null) {
                rGBImage = applyMask(rGBImage, softMask.getOpaqueImage(), true, extractMatte(softMask));
            } else {
                PDImageXObject mask = getMask();
                if (mask != null && mask.isStencil()) {
                    rGBImage = applyMask(rGBImage, mask.getOpaqueImage(), false, null);
                }
            }
            if (rect == null && i10 <= this.cachedImageSubsampling) {
                this.cachedImageSubsampling = i10;
                this.cachedImage = new SoftReference<>(rGBImage);
            }
            return rGBImage;
        }
        return bitmap;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public InputStream createInputStream(List<String> list) {
        return getStream().createInputStream(list);
    }

    public PDImageXObject(PDStream pDStream, PDResources pDResources) {
        super(pDStream, COSName.IMAGE);
        COSInputStream cOSInputStream;
        this.cachedImageSubsampling = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.resources = pDResources;
        List<COSName> filters = pDStream.getFilters();
        if (filters == null || filters.isEmpty()) {
            return;
        }
        boolean z10 = true;
        if (COSName.JPX_DECODE.equals(filters.get(filters.size() - 1))) {
            List asList = Arrays.asList(COSName.WIDTH, COSName.HEIGHT, COSName.COLORSPACE);
            COSStream cOSObject = pDStream.getCOSObject();
            Iterator it = asList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                } else if (!cOSObject.containsKey((COSName) it.next())) {
                    break;
                }
            }
            if (z10) {
                try {
                    cOSInputStream = pDStream.createInputStream();
                } catch (Throwable th2) {
                    th = th2;
                    cOSInputStream = null;
                }
                try {
                    DecodeResult decodeResult = cOSInputStream.getDecodeResult();
                    pDStream.getCOSObject().addAll(decodeResult.getParameters());
                    this.colorSpace = decodeResult.getJPXColorSpace();
                    IOUtils.closeQuietly(cOSInputStream);
                } catch (Throwable th3) {
                    th = th3;
                    IOUtils.closeQuietly(cOSInputStream);
                    throw th;
                }
            }
        }
    }
}
