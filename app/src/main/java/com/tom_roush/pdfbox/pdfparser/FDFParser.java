package com.tom_roush.pdfbox.pdfparser;

import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSDocument;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.io.IOUtils;
import com.tom_roush.pdfbox.io.RandomAccessBuffer;
import com.tom_roush.pdfbox.io.RandomAccessFile;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public class FDFParser extends COSParser {
    public FDFParser(String str) {
        this(new File(str));
    }

    private void init() {
        String property = System.getProperty(COSParser.SYSPROP_EOFLOOKUPRANGE);
        if (property != null) {
            try {
                setEOFLookupRange(Integer.parseInt(property));
            } catch (NumberFormatException unused) {
            }
        }
        this.document = new COSDocument();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0021, code lost:
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        if (isLenient() != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void initialParse() {
        /*
            r6 = this;
            r0 = 1
            r1 = 0
            long r2 = r6.getStartxrefOffset()     // Catch: java.io.IOException -> L19
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r5 = 0
            if (r4 <= 0) goto L12
            com.tom_roush.pdfbox.cos.COSDictionary r2 = r6.parseXref(r2)     // Catch: java.io.IOException -> L19
            goto L22
        L12:
            boolean r2 = r6.isLenient()     // Catch: java.io.IOException -> L19
            if (r2 == 0) goto L21
            goto L20
        L19:
            r2 = move-exception
            boolean r3 = r6.isLenient()
            if (r3 == 0) goto L38
        L20:
            r5 = r0
        L21:
            r2 = r1
        L22:
            if (r5 == 0) goto L28
            com.tom_roush.pdfbox.cos.COSDictionary r2 = r6.rebuildTrailer()
        L28:
            com.tom_roush.pdfbox.cos.COSBase r2 = r6.parseTrailerValuesDynamically(r2)
            boolean r3 = r2 instanceof com.tom_roush.pdfbox.cos.COSDictionary
            if (r3 == 0) goto L35
            com.tom_roush.pdfbox.cos.COSDictionary r2 = (com.tom_roush.pdfbox.cos.COSDictionary) r2
            r6.parseDictObjects(r2, r1)
        L35:
            r6.initialParseDone = r0
            return
        L38:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tom_roush.pdfbox.pdfparser.FDFParser.initialParse():void");
    }

    @Override // com.tom_roush.pdfbox.pdfparser.COSParser
    public final boolean isCatalog(COSDictionary cOSDictionary) {
        return cOSDictionary.containsKey(COSName.FDF);
    }

    public void parse() {
        try {
            if (parseFDFHeader()) {
                initialParse();
                return;
            }
            throw new IOException("Error: Header doesn't contain versioninfo");
        } catch (Throwable th2) {
            COSDocument cOSDocument = this.document;
            if (cOSDocument != null) {
                IOUtils.closeQuietly(cOSDocument);
                this.document = null;
            }
            throw th2;
        }
    }

    public FDFParser(File file) {
        super(new RandomAccessFile(file, "r"));
        this.fileLen = file.length();
        init();
    }

    public FDFParser(InputStream inputStream) {
        super(new RandomAccessBuffer(inputStream));
        this.fileLen = this.source.length();
        init();
    }
}
