package com.tom_roush.pdfbox.pdmodel;

import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.pdmodel.common.PDNameTreeNode;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureElement;

/* loaded from: classes2.dex */
public class PDStructureElementNameTreeNode extends PDNameTreeNode<PDStructureElement> {
    public PDStructureElementNameTreeNode() {
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.PDNameTreeNode
    public PDNameTreeNode<PDStructureElement> createChildNode(COSDictionary cOSDictionary) {
        return new PDStructureElementNameTreeNode(cOSDictionary);
    }

    public PDStructureElementNameTreeNode(COSDictionary cOSDictionary) {
        super(cOSDictionary);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.PDNameTreeNode
    public PDStructureElement convertCOSToPD(COSBase cOSBase) {
        return new PDStructureElement((COSDictionary) cOSBase);
    }
}
