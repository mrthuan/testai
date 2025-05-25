package com.tom_roush.pdfbox.pdmodel.graphics.image;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Rect;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.filter.DecodeOptions;
import com.tom_roush.pdfbox.filter.DecodeResult;
import com.tom_roush.pdfbox.filter.FilterFactory;
import com.tom_roush.pdfbox.pdmodel.PDResources;
import com.tom_roush.pdfbox.pdmodel.common.COSArrayList;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDColorSpace;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDDeviceGray;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import lib.zj.office.fc.openxml4j.opc.ContentTypes;

/* loaded from: classes2.dex */
public final class PDInlineImage implements PDImage {
    private final byte[] decodedData;
    private final COSDictionary parameters;
    private final byte[] rawData;
    private final PDResources resources;

    public PDInlineImage(COSDictionary cOSDictionary, byte[] bArr, PDResources pDResources) {
        this.parameters = cOSDictionary;
        this.resources = pDResources;
        this.rawData = bArr;
        List<String> filters = getFilters();
        DecodeResult decodeResult = null;
        if (filters != null && !filters.isEmpty()) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length);
            for (int i10 = 0; i10 < filters.size(); i10++) {
                byteArrayOutputStream.reset();
                decodeResult = FilterFactory.INSTANCE.getFilter(filters.get(i10)).decode(byteArrayInputStream, byteArrayOutputStream, cOSDictionary, i10);
                byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            }
            this.decodedData = byteArrayOutputStream.toByteArray();
        } else {
            this.decodedData = bArr;
        }
        if (decodeResult != null) {
            cOSDictionary.addAll(decodeResult.getParameters());
        }
    }

    private PDColorSpace createColorSpace(COSBase cOSBase) {
        if (cOSBase instanceof COSName) {
            return PDColorSpace.create(toLongName(cOSBase), this.resources);
        }
        if (cOSBase instanceof COSArray) {
            COSArray cOSArray = (COSArray) cOSBase;
            if (cOSArray.size() > 1) {
                COSBase cOSBase2 = cOSArray.get(0);
                if (!COSName.I.equals(cOSBase2) && !COSName.INDEXED.equals(cOSBase2)) {
                    throw new IOException("Illegal type of inline image color space: " + cOSBase2);
                }
                COSArray cOSArray2 = new COSArray();
                cOSArray2.addAll(cOSArray);
                cOSArray2.set(0, (COSBase) COSName.INDEXED);
                cOSArray2.set(1, toLongName(cOSArray.get(1)));
                return PDColorSpace.create(cOSArray2, this.resources);
            }
        }
        throw new IOException("Illegal type of object for inline image color space: " + cOSBase);
    }

    private COSBase toLongName(COSBase cOSBase) {
        if (COSName.RGB.equals(cOSBase)) {
            return COSName.DEVICERGB;
        }
        if (COSName.CMYK.equals(cOSBase)) {
            return COSName.DEVICECMYK;
        }
        if (COSName.G.equals(cOSBase)) {
            return COSName.DEVICEGRAY;
        }
        return cOSBase;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public InputStream createInputStream() {
        return new ByteArrayInputStream(this.decodedData);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public int getBitsPerComponent() {
        if (isStencil()) {
            return 1;
        }
        return this.parameters.getInt(COSName.BPC, COSName.BITS_PER_COMPONENT, -1);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSBase getCOSObject() {
        return this.parameters;
    }

    @Deprecated
    public COSArray getColorKeyMask() {
        COSBase dictionaryObject = this.parameters.getDictionaryObject(COSName.IM, COSName.MASK);
        if (dictionaryObject instanceof COSArray) {
            return (COSArray) dictionaryObject;
        }
        return null;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public PDColorSpace getColorSpace() {
        COSBase dictionaryObject = this.parameters.getDictionaryObject(COSName.CS, COSName.COLORSPACE);
        if (dictionaryObject != null) {
            return createColorSpace(dictionaryObject);
        }
        if (isStencil()) {
            return PDDeviceGray.INSTANCE;
        }
        throw new IOException("could not determine inline image color space");
    }

    public byte[] getData() {
        return this.decodedData;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public COSArray getDecode() {
        return (COSArray) this.parameters.getDictionaryObject(COSName.D, COSName.DECODE);
    }

    public List<String> getFilters() {
        COSDictionary cOSDictionary = this.parameters;
        COSName cOSName = COSName.F;
        COSName cOSName2 = COSName.FILTER;
        COSBase dictionaryObject = cOSDictionary.getDictionaryObject(cOSName, cOSName2);
        if (dictionaryObject instanceof COSName) {
            COSName cOSName3 = (COSName) dictionaryObject;
            return new COSArrayList(cOSName3.getName(), cOSName3, this.parameters, cOSName2);
        } else if (dictionaryObject instanceof COSArray) {
            return COSArrayList.convertCOSNameCOSArrayToList((COSArray) dictionaryObject);
        } else {
            return null;
        }
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public int getHeight() {
        return this.parameters.getInt(COSName.H, COSName.HEIGHT, -1);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public Bitmap getImage() {
        return SampledImageReader.getRGBImage(this, null);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public boolean getInterpolate() {
        return this.parameters.getBoolean(COSName.I, COSName.INTERPOLATE, false);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public Bitmap getStencilImage(Paint paint) {
        if (isStencil()) {
            return SampledImageReader.getStencilImage(this, paint);
        }
        throw new IllegalStateException("Image is not a stencil");
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public String getSuffix() {
        List<String> filters = getFilters();
        if (filters == null || filters.isEmpty()) {
            return ContentTypes.EXTENSION_PNG;
        }
        if (!filters.contains(COSName.DCT_DECODE.getName()) && !filters.contains(COSName.DCT_DECODE_ABBREVIATION.getName())) {
            if (!filters.contains(COSName.CCITTFAX_DECODE.getName()) && !filters.contains(COSName.CCITTFAX_DECODE_ABBREVIATION.getName())) {
                return ContentTypes.EXTENSION_PNG;
            }
            return "tiff";
        }
        return ContentTypes.EXTENSION_JPG_1;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public int getWidth() {
        return this.parameters.getInt(COSName.W, COSName.WIDTH, -1);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public boolean isEmpty() {
        if (this.decodedData.length == 0) {
            return true;
        }
        return false;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public boolean isStencil() {
        return this.parameters.getBoolean(COSName.IM, COSName.IMAGE_MASK, false);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public void setBitsPerComponent(int i10) {
        this.parameters.setInt(COSName.BPC, i10);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public void setColorSpace(PDColorSpace pDColorSpace) {
        COSBase cOSBase;
        if (pDColorSpace != null) {
            cOSBase = pDColorSpace.getCOSObject();
        } else {
            cOSBase = null;
        }
        this.parameters.setItem(COSName.CS, cOSBase);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public void setDecode(COSArray cOSArray) {
        this.parameters.setItem(COSName.D, (COSBase) cOSArray);
    }

    public void setFilters(List<String> list) {
        this.parameters.setItem(COSName.F, (COSBase) COSArrayList.convertStringListToCOSNameCOSArray(list));
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public void setHeight(int i10) {
        this.parameters.setInt(COSName.H, i10);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public void setInterpolate(boolean z10) {
        this.parameters.setBoolean(COSName.I, z10);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public void setStencil(boolean z10) {
        this.parameters.setBoolean(COSName.IM, z10);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public void setWidth(int i10) {
        this.parameters.setInt(COSName.W, i10);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public InputStream createInputStream(DecodeOptions decodeOptions) {
        return createInputStream();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public Bitmap getImage(Rect rect, int i10) {
        return SampledImageReader.getRGBImage(this, rect, i10, null);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public InputStream createInputStream(List<String> list) {
        List<String> filters = getFilters();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.rawData);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(this.rawData.length);
        for (int i10 = 0; filters != null && i10 < filters.size(); i10++) {
            byteArrayOutputStream.reset();
            if (list.contains(filters.get(i10))) {
                break;
            }
            FilterFactory.INSTANCE.getFilter(filters.get(i10)).decode(byteArrayInputStream, byteArrayOutputStream, this.parameters, i10);
            byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        }
        return byteArrayInputStream;
    }
}
