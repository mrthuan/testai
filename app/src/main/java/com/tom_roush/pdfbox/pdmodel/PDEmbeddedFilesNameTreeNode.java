package com.tom_roush.pdfbox.pdmodel;

import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.pdmodel.common.PDNameTreeNode;
import com.tom_roush.pdfbox.pdmodel.common.filespecification.PDComplexFileSpecification;

/* loaded from: classes2.dex */
public class PDEmbeddedFilesNameTreeNode extends PDNameTreeNode<PDComplexFileSpecification> {
    public PDEmbeddedFilesNameTreeNode() {
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.PDNameTreeNode
    public PDNameTreeNode<PDComplexFileSpecification> createChildNode(COSDictionary cOSDictionary) {
        return new PDEmbeddedFilesNameTreeNode(cOSDictionary);
    }

    public PDEmbeddedFilesNameTreeNode(COSDictionary cOSDictionary) {
        super(cOSDictionary);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.PDNameTreeNode
    public PDComplexFileSpecification convertCOSToPD(COSBase cOSBase) {
        return new PDComplexFileSpecification((COSDictionary) cOSBase);
    }
}
