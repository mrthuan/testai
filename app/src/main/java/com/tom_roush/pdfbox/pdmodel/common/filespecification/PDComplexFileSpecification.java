package com.tom_roush.pdfbox.pdmodel.common.filespecification;

import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSStream;

/* loaded from: classes2.dex */
public class PDComplexFileSpecification extends PDFileSpecification {
    private COSDictionary efDictionary;
    private final COSDictionary fs;

    public PDComplexFileSpecification() {
        COSDictionary cOSDictionary = new COSDictionary();
        this.fs = cOSDictionary;
        cOSDictionary.setItem(COSName.TYPE, (COSBase) COSName.FILESPEC);
    }

    private COSDictionary getEFDictionary() {
        COSDictionary cOSDictionary;
        if (this.efDictionary == null && (cOSDictionary = this.fs) != null) {
            this.efDictionary = cOSDictionary.getCOSDictionary(COSName.EF);
        }
        return this.efDictionary;
    }

    private COSBase getObjectFromEFDictionary(COSName cOSName) {
        COSDictionary eFDictionary = getEFDictionary();
        if (eFDictionary != null) {
            return eFDictionary.getDictionaryObject(cOSName);
        }
        return null;
    }

    public PDEmbeddedFile getEmbeddedFile() {
        COSBase objectFromEFDictionary = getObjectFromEFDictionary(COSName.F);
        if (objectFromEFDictionary instanceof COSStream) {
            return new PDEmbeddedFile((COSStream) objectFromEFDictionary);
        }
        return null;
    }

    public PDEmbeddedFile getEmbeddedFileDos() {
        COSBase objectFromEFDictionary = getObjectFromEFDictionary(COSName.DOS);
        if (objectFromEFDictionary instanceof COSStream) {
            return new PDEmbeddedFile((COSStream) objectFromEFDictionary);
        }
        return null;
    }

    public PDEmbeddedFile getEmbeddedFileMac() {
        COSBase objectFromEFDictionary = getObjectFromEFDictionary(COSName.MAC);
        if (objectFromEFDictionary instanceof COSStream) {
            return new PDEmbeddedFile((COSStream) objectFromEFDictionary);
        }
        return null;
    }

    public PDEmbeddedFile getEmbeddedFileUnicode() {
        COSBase objectFromEFDictionary = getObjectFromEFDictionary(COSName.UF);
        if (objectFromEFDictionary instanceof COSStream) {
            return new PDEmbeddedFile((COSStream) objectFromEFDictionary);
        }
        return null;
    }

    public PDEmbeddedFile getEmbeddedFileUnix() {
        COSBase objectFromEFDictionary = getObjectFromEFDictionary(COSName.UNIX);
        if (objectFromEFDictionary instanceof COSStream) {
            return new PDEmbeddedFile((COSStream) objectFromEFDictionary);
        }
        return null;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.filespecification.PDFileSpecification
    public String getFile() {
        return this.fs.getString(COSName.F);
    }

    public String getFileDescription() {
        return this.fs.getString(COSName.DESC);
    }

    public String getFileDos() {
        return this.fs.getString(COSName.DOS);
    }

    public String getFileMac() {
        return this.fs.getString(COSName.MAC);
    }

    public String getFileUnicode() {
        return this.fs.getString(COSName.UF);
    }

    public String getFileUnix() {
        return this.fs.getString(COSName.UNIX);
    }

    public String getFilename() {
        String fileUnicode = getFileUnicode();
        if (fileUnicode == null) {
            fileUnicode = getFileDos();
        }
        if (fileUnicode == null) {
            fileUnicode = getFileMac();
        }
        if (fileUnicode == null) {
            fileUnicode = getFileUnix();
        }
        if (fileUnicode == null) {
            return getFile();
        }
        return fileUnicode;
    }

    public boolean isVolatile() {
        return this.fs.getBoolean(COSName.V, false);
    }

    public void setEmbeddedFile(PDEmbeddedFile pDEmbeddedFile) {
        COSDictionary eFDictionary = getEFDictionary();
        if (eFDictionary == null && pDEmbeddedFile != null) {
            eFDictionary = new COSDictionary();
            this.fs.setItem(COSName.EF, (COSBase) eFDictionary);
        }
        if (eFDictionary != null) {
            eFDictionary.setItem(COSName.F, pDEmbeddedFile);
        }
    }

    @Deprecated
    public void setEmbeddedFileDos(PDEmbeddedFile pDEmbeddedFile) {
        COSDictionary eFDictionary = getEFDictionary();
        if (eFDictionary == null && pDEmbeddedFile != null) {
            eFDictionary = new COSDictionary();
            this.fs.setItem(COSName.EF, (COSBase) eFDictionary);
        }
        if (eFDictionary != null) {
            eFDictionary.setItem(COSName.DOS, pDEmbeddedFile);
        }
    }

    @Deprecated
    public void setEmbeddedFileMac(PDEmbeddedFile pDEmbeddedFile) {
        COSDictionary eFDictionary = getEFDictionary();
        if (eFDictionary == null && pDEmbeddedFile != null) {
            eFDictionary = new COSDictionary();
            this.fs.setItem(COSName.EF, (COSBase) eFDictionary);
        }
        if (eFDictionary != null) {
            eFDictionary.setItem(COSName.MAC, pDEmbeddedFile);
        }
    }

    public void setEmbeddedFileUnicode(PDEmbeddedFile pDEmbeddedFile) {
        COSDictionary eFDictionary = getEFDictionary();
        if (eFDictionary == null && pDEmbeddedFile != null) {
            eFDictionary = new COSDictionary();
            this.fs.setItem(COSName.EF, (COSBase) eFDictionary);
        }
        if (eFDictionary != null) {
            eFDictionary.setItem(COSName.UF, pDEmbeddedFile);
        }
    }

    @Deprecated
    public void setEmbeddedFileUnix(PDEmbeddedFile pDEmbeddedFile) {
        COSDictionary eFDictionary = getEFDictionary();
        if (eFDictionary == null && pDEmbeddedFile != null) {
            eFDictionary = new COSDictionary();
            this.fs.setItem(COSName.EF, (COSBase) eFDictionary);
        }
        if (eFDictionary != null) {
            eFDictionary.setItem(COSName.UNIX, pDEmbeddedFile);
        }
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.filespecification.PDFileSpecification
    public void setFile(String str) {
        this.fs.setString(COSName.F, str);
    }

    public void setFileDescription(String str) {
        this.fs.setString(COSName.DESC, str);
    }

    @Deprecated
    public void setFileDos(String str) {
        this.fs.setString(COSName.DOS, str);
    }

    @Deprecated
    public void setFileMac(String str) {
        this.fs.setString(COSName.MAC, str);
    }

    public void setFileUnicode(String str) {
        this.fs.setString(COSName.UF, str);
    }

    @Deprecated
    public void setFileUnix(String str) {
        this.fs.setString(COSName.UNIX, str);
    }

    public void setVolatile(boolean z10) {
        this.fs.setBoolean(COSName.V, z10);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.fs;
    }

    public PDComplexFileSpecification(COSDictionary cOSDictionary) {
        if (cOSDictionary == null) {
            COSDictionary cOSDictionary2 = new COSDictionary();
            this.fs = cOSDictionary2;
            cOSDictionary2.setItem(COSName.TYPE, (COSBase) COSName.FILESPEC);
            return;
        }
        this.fs = cOSDictionary;
    }
}
