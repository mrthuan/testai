package com.tom_roush.pdfbox.pdmodel;

import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;

/* loaded from: classes2.dex */
public class PDDocumentNameDictionary implements COSObjectable {
    private final PDDocumentCatalog catalog;
    private final COSDictionary nameDictionary;

    public PDDocumentNameDictionary(PDDocumentCatalog pDDocumentCatalog) {
        COSDictionary cOSObject = pDDocumentCatalog.getCOSObject();
        COSName cOSName = COSName.NAMES;
        COSBase dictionaryObject = cOSObject.getDictionaryObject(cOSName);
        if (dictionaryObject != null) {
            this.nameDictionary = (COSDictionary) dictionaryObject;
        } else {
            COSDictionary cOSDictionary = new COSDictionary();
            this.nameDictionary = cOSDictionary;
            pDDocumentCatalog.getCOSObject().setItem(cOSName, (COSBase) cOSDictionary);
        }
        this.catalog = pDDocumentCatalog;
    }

    public PDDestinationNameTreeNode getDests() {
        COSDictionary cOSDictionary = this.nameDictionary;
        COSName cOSName = COSName.DESTS;
        COSDictionary cOSDictionary2 = (COSDictionary) cOSDictionary.getDictionaryObject(cOSName);
        if (cOSDictionary2 == null) {
            cOSDictionary2 = (COSDictionary) this.catalog.getCOSObject().getDictionaryObject(cOSName);
        }
        if (cOSDictionary2 != null) {
            return new PDDestinationNameTreeNode(cOSDictionary2);
        }
        return null;
    }

    public PDEmbeddedFilesNameTreeNode getEmbeddedFiles() {
        COSDictionary cOSDictionary = (COSDictionary) this.nameDictionary.getDictionaryObject(COSName.EMBEDDED_FILES);
        if (cOSDictionary != null) {
            return new PDEmbeddedFilesNameTreeNode(cOSDictionary);
        }
        return null;
    }

    public PDJavascriptNameTreeNode getJavaScript() {
        COSDictionary cOSDictionary = (COSDictionary) this.nameDictionary.getDictionaryObject(COSName.JAVA_SCRIPT);
        if (cOSDictionary != null) {
            return new PDJavascriptNameTreeNode(cOSDictionary);
        }
        return null;
    }

    public void setDests(PDDestinationNameTreeNode pDDestinationNameTreeNode) {
        COSDictionary cOSDictionary = this.nameDictionary;
        COSName cOSName = COSName.DESTS;
        cOSDictionary.setItem(cOSName, pDDestinationNameTreeNode);
        this.catalog.getCOSObject().setItem(cOSName, (COSObjectable) null);
    }

    public void setEmbeddedFiles(PDEmbeddedFilesNameTreeNode pDEmbeddedFilesNameTreeNode) {
        this.nameDictionary.setItem(COSName.EMBEDDED_FILES, pDEmbeddedFilesNameTreeNode);
    }

    public void setJavascript(PDJavascriptNameTreeNode pDJavascriptNameTreeNode) {
        this.nameDictionary.setItem(COSName.JAVA_SCRIPT, pDJavascriptNameTreeNode);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.nameDictionary;
    }

    public PDDocumentNameDictionary(PDDocumentCatalog pDDocumentCatalog, COSDictionary cOSDictionary) {
        this.catalog = pDDocumentCatalog;
        this.nameDictionary = cOSDictionary;
    }
}
