package com.tom_roush.pdfbox.pdfparser;

import b.a;
import com.tom_roush.pdfbox.android.PDFBoxConfig;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDocument;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSObject;
import com.tom_roush.pdfbox.cos.COSStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public class PDFObjectStreamParser extends BaseParser {
    private final int firstObject;
    private final int numberOfObjects;
    private List<COSObject> streamObjects;

    public PDFObjectStreamParser(COSStream cOSStream, COSDocument cOSDocument) {
        super(new InputStreamSource(cOSStream.createInputStream()));
        this.streamObjects = null;
        this.document = cOSDocument;
        int i10 = cOSStream.getInt(COSName.N);
        this.numberOfObjects = i10;
        if (i10 != -1) {
            if (i10 >= 0) {
                int i11 = cOSStream.getInt(COSName.FIRST);
                this.firstObject = i11;
                if (i11 != -1) {
                    if (i11 >= 0) {
                        return;
                    }
                    throw new IOException(a.c("Illegal /First entry in object stream: ", i11));
                }
                throw new IOException("/First entry missing in object stream");
            }
            throw new IOException(a.c("Illegal /N entry in object stream: ", i10));
        }
        throw new IOException("/N entry missing in object stream");
    }

    private COSBase parseObject(int i10) {
        long position = this.seqSource.getPosition();
        int i11 = this.firstObject + i10;
        if (i11 > 0 && position < i11) {
            this.seqSource.readFully(i11 - ((int) position));
        }
        return parseDirObject();
    }

    private Map<Integer, Long> readOffsets() {
        TreeMap treeMap = new TreeMap();
        long position = (this.seqSource.getPosition() + this.firstObject) - 1;
        for (int i10 = 0; i10 < this.numberOfObjects && this.seqSource.getPosition() < position; i10++) {
            treeMap.put(Integer.valueOf((int) readLong()), Long.valueOf(readObjectNumber()));
        }
        return treeMap;
    }

    public List<COSObject> getObjects() {
        return this.streamObjects;
    }

    public void parse() {
        try {
            Map<Integer, Long> readOffsets = readOffsets();
            this.streamObjects = new ArrayList(readOffsets.size());
            for (Map.Entry<Integer, Long> entry : readOffsets.entrySet()) {
                COSObject cOSObject = new COSObject(parseObject(entry.getKey().intValue()));
                cOSObject.setGenerationNumber(0);
                cOSObject.setObjectNumber(entry.getValue().longValue());
                this.streamObjects.add(cOSObject);
                if (PDFBoxConfig.isDebugEnabled()) {
                    cOSObject.toString();
                }
            }
        } finally {
            this.seqSource.close();
        }
    }
}
