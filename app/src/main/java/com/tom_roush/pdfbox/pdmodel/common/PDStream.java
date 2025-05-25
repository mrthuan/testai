package com.tom_roush.pdfbox.pdmodel.common;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSDocument;
import com.tom_roush.pdfbox.cos.COSInputStream;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSNull;
import com.tom_roush.pdfbox.cos.COSStream;
import com.tom_roush.pdfbox.filter.DecodeOptions;
import com.tom_roush.pdfbox.filter.FilterFactory;
import com.tom_roush.pdfbox.io.IOUtils;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.common.filespecification.PDFileSpecification;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public class PDStream implements COSObjectable {
    private final COSStream stream;

    public PDStream(PDDocument pDDocument) {
        this.stream = pDDocument.getDocument().createCOSStream();
    }

    private List<Object> internalGetDecodeParams(COSName cOSName, COSName cOSName2) {
        COSBase dictionaryObject = this.stream.getDictionaryObject(cOSName, cOSName2);
        if (dictionaryObject instanceof COSDictionary) {
            return new COSArrayList(COSDictionaryMap.convertBasicTypesToMap((COSDictionary) dictionaryObject), dictionaryObject, this.stream, cOSName);
        }
        if (dictionaryObject instanceof COSArray) {
            COSArray cOSArray = (COSArray) dictionaryObject;
            ArrayList arrayList = new ArrayList(cOSArray.size());
            for (int i10 = 0; i10 < cOSArray.size(); i10++) {
                COSBase object = cOSArray.getObject(i10);
                if (object instanceof COSDictionary) {
                    arrayList.add(COSDictionaryMap.convertBasicTypesToMap((COSDictionary) object));
                } else {
                    Objects.toString(object);
                }
            }
            return new COSArrayList(arrayList, cOSArray);
        }
        return null;
    }

    @Deprecated
    public void addCompression() {
        if (getFilters() == null) {
            if (this.stream.getLength() > 0) {
                OutputStream outputStream = null;
                try {
                    try {
                        byte[] byteArray = IOUtils.toByteArray(this.stream.createInputStream());
                        outputStream = this.stream.createOutputStream(COSName.FLATE_DECODE);
                        outputStream.write(byteArray);
                        return;
                    } catch (IOException e10) {
                        throw new RuntimeException(e10);
                    }
                } finally {
                    IOUtils.closeQuietly(outputStream);
                }
            }
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(COSName.FLATE_DECODE);
            setFilters(arrayList);
        }
    }

    public COSInputStream createInputStream() {
        return this.stream.createInputStream();
    }

    public OutputStream createOutputStream() {
        return this.stream.createOutputStream();
    }

    public List<Object> getDecodeParms() {
        return internalGetDecodeParams(COSName.DECODE_PARMS, COSName.DP);
    }

    public int getDecodedStreamLength() {
        return this.stream.getInt(COSName.DL);
    }

    public PDFileSpecification getFile() {
        return PDFileSpecification.createFS(this.stream.getDictionaryObject(COSName.F));
    }

    public List<Object> getFileDecodeParams() {
        return internalGetDecodeParams(COSName.F_DECODE_PARMS, null);
    }

    public List<String> getFileFilters() {
        COSStream cOSStream = this.stream;
        COSName cOSName = COSName.F_FILTER;
        COSBase dictionaryObject = cOSStream.getDictionaryObject(cOSName);
        if (dictionaryObject instanceof COSName) {
            COSName cOSName2 = (COSName) dictionaryObject;
            return new COSArrayList(cOSName2.getName(), cOSName2, this.stream, cOSName);
        } else if (dictionaryObject instanceof COSArray) {
            return COSArrayList.convertCOSNameCOSArrayToList((COSArray) dictionaryObject);
        } else {
            return null;
        }
    }

    public List<COSName> getFilters() {
        COSBase filters = this.stream.getFilters();
        if (filters instanceof COSName) {
            COSName cOSName = (COSName) filters;
            return new COSArrayList(cOSName, cOSName, this.stream, COSName.FILTER);
        } else if (filters instanceof COSArray) {
            return ((COSArray) filters).toList();
        } else {
            return null;
        }
    }

    public int getLength() {
        return this.stream.getInt(COSName.LENGTH, 0);
    }

    public PDMetadata getMetadata() {
        COSBase dictionaryObject = this.stream.getDictionaryObject(COSName.METADATA);
        if (dictionaryObject != null) {
            if (dictionaryObject instanceof COSStream) {
                return new PDMetadata((COSStream) dictionaryObject);
            }
            if (!(dictionaryObject instanceof COSNull)) {
                throw new IllegalStateException("Expected a COSStream but was a ".concat(dictionaryObject.getClass().getSimpleName()));
            }
        }
        return null;
    }

    @Deprecated
    public COSStream getStream() {
        return this.stream;
    }

    public void setDecodeParms(List<?> list) {
        this.stream.setItem(COSName.DECODE_PARMS, (COSBase) COSArrayList.converterToCOSArray(list));
    }

    public void setDecodedStreamLength(int i10) {
        this.stream.setInt(COSName.DL, i10);
    }

    public void setFile(PDFileSpecification pDFileSpecification) {
        this.stream.setItem(COSName.F, pDFileSpecification);
    }

    public void setFileDecodeParams(List<?> list) {
        this.stream.setItem(COSName.F_DECODE_PARMS, (COSBase) COSArrayList.converterToCOSArray(list));
    }

    public void setFileFilters(List<String> list) {
        this.stream.setItem(COSName.F_FILTER, (COSBase) COSArrayList.convertStringListToCOSNameCOSArray(list));
    }

    public void setFilters(List<COSName> list) {
        this.stream.setItem(COSName.FILTER, (COSBase) COSArrayList.converterToCOSArray(list));
    }

    public void setMetadata(PDMetadata pDMetadata) {
        this.stream.setItem(COSName.METADATA, pDMetadata);
    }

    public byte[] toByteArray() {
        COSInputStream cOSInputStream;
        try {
            cOSInputStream = createInputStream();
            try {
                byte[] byteArray = IOUtils.toByteArray(cOSInputStream);
                if (cOSInputStream != null) {
                    cOSInputStream.close();
                }
                return byteArray;
            } catch (Throwable th2) {
                th = th2;
                if (cOSInputStream != null) {
                    cOSInputStream.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            cOSInputStream = null;
        }
    }

    public COSInputStream createInputStream(DecodeOptions decodeOptions) {
        return this.stream.createInputStream(decodeOptions);
    }

    public OutputStream createOutputStream(COSName cOSName) {
        return this.stream.createOutputStream(cOSName);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSStream getCOSObject() {
        return this.stream;
    }

    public PDStream(COSDocument cOSDocument) {
        this.stream = cOSDocument.createCOSStream();
    }

    public InputStream createInputStream(List<String> list) {
        InputStream createRawInputStream = this.stream.createRawInputStream();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        List<COSName> filters = getFilters();
        if (filters != null) {
            for (int i10 = 0; i10 < filters.size(); i10++) {
                COSName cOSName = filters.get(i10);
                if (list != null && list.contains(cOSName.getName())) {
                    break;
                }
                try {
                    FilterFactory.INSTANCE.getFilter(cOSName).decode(createRawInputStream, byteArrayOutputStream, this.stream, i10);
                    IOUtils.closeQuietly(createRawInputStream);
                    createRawInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                    byteArrayOutputStream.reset();
                } catch (Throwable th2) {
                    IOUtils.closeQuietly(createRawInputStream);
                    throw th2;
                }
            }
        }
        return createRawInputStream;
    }

    public PDStream(COSStream cOSStream) {
        this.stream = cOSStream;
    }

    public PDStream(PDDocument pDDocument, InputStream inputStream) {
        this(pDDocument, inputStream, (COSBase) null);
    }

    public PDStream(PDDocument pDDocument, InputStream inputStream, COSName cOSName) {
        this(pDDocument, inputStream, (COSBase) cOSName);
    }

    public PDStream(PDDocument pDDocument, InputStream inputStream, COSArray cOSArray) {
        this(pDDocument, inputStream, (COSBase) cOSArray);
    }

    private PDStream(PDDocument pDDocument, InputStream inputStream, COSBase cOSBase) {
        OutputStream outputStream = null;
        try {
            COSStream createCOSStream = pDDocument.getDocument().createCOSStream();
            this.stream = createCOSStream;
            outputStream = createCOSStream.createOutputStream(cOSBase);
            IOUtils.copy(inputStream, outputStream);
        } finally {
            if (outputStream != null) {
                outputStream.close();
            }
            inputStream.close();
        }
    }
}
