package com.tom_roush.pdfbox.pdfparser;

import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSDocument;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.io.IOUtils;
import com.tom_roush.pdfbox.io.RandomAccessRead;
import com.tom_roush.pdfbox.io.ScratchFile;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public class PDFParser extends COSParser {
    public PDFParser(RandomAccessRead randomAccessRead) {
        this(randomAccessRead, "", ScratchFile.getMainMemoryOnlyInstance());
    }

    private void init(ScratchFile scratchFile) {
        String property = System.getProperty(COSParser.SYSPROP_EOFLOOKUPRANGE);
        if (property != null) {
            try {
                setEOFLookupRange(Integer.parseInt(property));
            } catch (NumberFormatException unused) {
            }
        }
        this.document = new COSDocument(scratchFile);
    }

    public PDDocument getPDDocument() {
        PDDocument pDDocument = new PDDocument(getDocument(), this.source, getAccessPermission());
        pDDocument.setEncryptionDictionary(getEncryption());
        return pDDocument;
    }

    public void initialParse() {
        COSDictionary retrieveTrailer = retrieveTrailer();
        COSBase parseTrailerValuesDynamically = parseTrailerValuesDynamically(retrieveTrailer);
        if (parseTrailerValuesDynamically instanceof COSDictionary) {
            COSDictionary cOSDictionary = (COSDictionary) parseTrailerValuesDynamically;
            if (isLenient()) {
                COSName cOSName = COSName.TYPE;
                if (!cOSDictionary.containsKey(cOSName)) {
                    cOSDictionary.setItem(cOSName, (COSBase) COSName.CATALOG);
                }
            }
            parseDictObjects(cOSDictionary, null);
            COSBase dictionaryObject = retrieveTrailer.getDictionaryObject(COSName.INFO);
            if (dictionaryObject instanceof COSDictionary) {
                parseDictObjects((COSDictionary) dictionaryObject, null);
            }
            checkPages(cOSDictionary);
            if (cOSDictionary.getDictionaryObject(COSName.PAGES) instanceof COSDictionary) {
                this.document.setDecrypted();
                this.initialParseDone = true;
                return;
            }
            throw new IOException("Page tree root must be a dictionary");
        }
        throw new IOException("Expected root dictionary, but got this: " + parseTrailerValuesDynamically);
    }

    public void parse() {
        try {
            if (!parsePDFHeader() && !parseFDFHeader()) {
                throw new IOException("Error: Header doesn't contain versioninfo");
            }
            if (!this.initialParseDone) {
                initialParse();
            }
        } catch (Throwable th2) {
            COSDocument cOSDocument = this.document;
            if (cOSDocument != null) {
                IOUtils.closeQuietly(cOSDocument);
                this.document = null;
            }
            throw th2;
        }
    }

    public PDFParser(RandomAccessRead randomAccessRead, ScratchFile scratchFile) {
        this(randomAccessRead, "", scratchFile);
    }

    public PDFParser(RandomAccessRead randomAccessRead, String str) {
        this(randomAccessRead, str, ScratchFile.getMainMemoryOnlyInstance());
    }

    public PDFParser(RandomAccessRead randomAccessRead, String str, ScratchFile scratchFile) {
        this(randomAccessRead, str, null, null, scratchFile);
    }

    public PDFParser(RandomAccessRead randomAccessRead, String str, InputStream inputStream, String str2) {
        this(randomAccessRead, str, inputStream, str2, ScratchFile.getMainMemoryOnlyInstance());
    }

    public PDFParser(RandomAccessRead randomAccessRead, String str, InputStream inputStream, String str2, ScratchFile scratchFile) {
        super(randomAccessRead, str, inputStream, str2);
        this.fileLen = randomAccessRead.length();
        init(scratchFile);
    }
}
