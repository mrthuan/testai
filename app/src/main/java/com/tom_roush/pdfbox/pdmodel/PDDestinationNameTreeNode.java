package com.tom_roush.pdfbox.pdmodel;

import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.common.PDNameTreeNode;
import com.tom_roush.pdfbox.pdmodel.interactive.documentnavigation.destination.PDDestination;
import com.tom_roush.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageDestination;

/* loaded from: classes2.dex */
public class PDDestinationNameTreeNode extends PDNameTreeNode<PDPageDestination> {
    public PDDestinationNameTreeNode() {
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.PDNameTreeNode
    public PDNameTreeNode<PDPageDestination> createChildNode(COSDictionary cOSDictionary) {
        return new PDDestinationNameTreeNode(cOSDictionary);
    }

    public PDDestinationNameTreeNode(COSDictionary cOSDictionary) {
        super(cOSDictionary);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.PDNameTreeNode
    public PDPageDestination convertCOSToPD(COSBase cOSBase) {
        if (cOSBase instanceof COSDictionary) {
            cOSBase = ((COSDictionary) cOSBase).getDictionaryObject(COSName.D);
        }
        return (PDPageDestination) PDDestination.create(cOSBase);
    }
}
